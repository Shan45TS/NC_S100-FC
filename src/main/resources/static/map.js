let map;
let vectorLayerSource = new ol.source.Vector({});
let vectorLayer = new ol.layer.Vector({
    source: vectorLayerSource,
    style: new ol.style.Style({
        image: new ol.style.Circle({
            radius: 7,
            fill: new ol.style.Fill({color: 'black'}),
            stroke: new ol.style.Stroke({
                color: [255,0,0], width: 2
            })
        })
    })
});

function init(){
    map = new ol.Map({
        target: 'map',
        layers: [
            new ol.layer.Tile({
            source: new ol.source.OSM()
            }), vectorLayer  
        ],
        view: new ol.View({
            center: ol.proj.fromLonLat([37.41, 8.82]),
            zoom: 4
        })
    });    
}

function addFeature(){ 

    let coors = document.getElementById('coors').value; 
    coors = coors.split(" ");
    let coorsArray = [];
    coors.forEach(coor => {
        coorsArray.push(parseFloat(coor));
    });    
    let navWarn = new ol.geom.Point(ol.proj.fromLonLat(coorsArray));  
    
    let navWarnFeat = new ol.Feature({
        name: "Nav Warn",
        geometry: navWarn
    });

    vectorLayerSource.addFeature( navWarnFeat );
    map.getView().setCenter(ol.proj.transform(coorsArray, 'EPSG:4326', 'EPSG:3857'));
    map.getView().setZoom(5);
}

function addFeature2(){ 

    var vectorSource = new ol.source.Vector({
        format: new ol.format.GML32(),
        url: 'http://localhost:8080/new.gml',        
        strategy: ol.loadingstrategy.bbox
    });


    var vector = new ol.layer.Vector({
        source: vectorSource
    });
    map.addLayer(vector);
}


