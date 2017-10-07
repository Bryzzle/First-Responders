pn = require('pubnub');
lat = 38.897327;
lng = -77.011232;
truckLat = 38.896660;
truckLng = -77.009087;
watson = false;

step = 0;
p = new pn({
  publishKey: "pub-c-06ffc4af-724e-4f80-a295-e3224d244e32",
  subscribeKey: "sub-c-76162f2a-ab2b-11e7-b4e4-2675c721e615"
});
var x = setInterval(function() {
  if (step < 11){
  	lng = lng + .0002;
  } else {
  	lat = lat + .0002;
  }

  if (step < 6){
  	truckLat = truckLat + .00005;
  }
  if (step > 13){
  	truckLat = truckLat + .0001;
  }
  // truckLat = truckLat + .00005;

  step = step + 1;
  return p.publish({
    channel: "maps-channel",
    message: {
      lat: lat.toString(),
      lng: lng.toString(),
      truckLat: truckLat.toString(),
      truckLng: truckLng.toString(),
      watson: watson.toString()
    }
  }, function() {

  if (step == 21){
  	// clearInterval(x);
  	step = 0;
  	lng = -77.011232;
  	lat = 38.897327;
  	truckLat = 38.896666;

  }
    return console.log(arguments);
  });
}, 500);