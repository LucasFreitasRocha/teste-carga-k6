import http from 'k6/http';
import { sleep, check ,group} from 'k6';
import { Counter } from 'k6/metrics';

// A simple counter for http requests

export const requests = new Counter('http_reqs');

// you can specify stages of your test (ramp up/down patterns) through the options object
// target is the number of VUs you are aiming for

export const options = {
  scenarios: {
    cenario1: {
      executor: 'ramping-vus',
    
        startVUs: 0,
        stages: [
          { target: 250, duration: '1m' },
          { target: 500, duration: '1m' },
          
        ],
        gracefulRampDown: '1s',
        gracefulStop: '1s'
      
    },
    cenario2: {
      executor: 'ramping-vus',
      startVUs: 0,
      stages: [
          { target: 500, duration: '1m' },
          { target: 750, duration: '1m' },
          
      ],
      gracefulRampDown: '1s',
      gracefulStop: '1s'
      
    }
},

thresholds: {
  http_req_duration: ['p(95)<200'],
  http_req_failed: ['rate<0.05'],
}
};

export default function () {
  // our HTTP request, note that we are saving the response to res, which can be accessed later
  const baseurl = 'http://localhost:8080/calcular/';
  const params = {
    headers: {
      'Content-Type': 'application/json',
    },
  };
 
  function post(url,payload) {
   
    return http.post(url, payload, params );
  }
 

  sleep(1);

  group('7 + 3 = 10', function () {
   
    const payload = JSON.stringify({
      "numero1": 3,
      "numero2": 7
    });
    let res = post(`${baseurl}somar`,payload);
    if(JSON.parse(res.body).resultado != '10.0'){
      console.log("Deu ruim 10.0 !=" , JSON.parse(res.body).resultado)
    }
    const checkRes = check(res, {
    
      'status is 200': (r) => r.status === 200,
      'response body': (r) => JSON.parse(r.body).resultado == '10.0',
    });
  });

  group('670.6 + 1329.4 = 2000', function () {
  
    const payload = JSON.stringify({
      "numero1": 670.6,
      "numero2": 1329.4
    });
    let res = post(`${baseurl}somar`,payload);
    if(JSON.parse(res.body).resultado != '2000.0'){
      console.log("Deu ruim  2000.0 != " , JSON.parse(res.body).resultado)
    }
    const checkRes = check(res, {
    
      'status is 200': (r) => r.status === 200,
      'response body': (r) => JSON.parse(r.body).resultado == '2000.0',
    });
  });


  group('7 * 7 = 49', function () {
   
    const payload = JSON.stringify({
      "numero1": 7,
      "numero2": 7
    });
    let res = post(`${baseurl}multiplicar`,payload);
    if(JSON.parse(res.body).resultado != '49.0'){
      console.log("Deu ruim 49.0 !=" , JSON.parse(res.body).resultado)
    }
    const checkRes = check(res, {
    
      'status is 200': (r) => r.status === 200,
      'response body': (r) => JSON.parse(r.body).resultado == '49.0',
    });
  });
  
}
