use port;
CREATE TABLE shohin
(shouhin_id INTEGER NOT NULL,
 shohin_coode VARCHAR(6) NOT NULL,
 shohin_lot   VARCHAR(10)NOT NULL,
 shohin_mei   VARCHAR(50)NOT NULL,
 shohin_bunrui VARCHAR(50)NOT NULL,
 shouhin_quantity INTEGER NOT NULL,
 serial_number VARCHAR(6) NOT NULL ,
 torokubi DATE NOT NULL,
 PRIMARY KEY(shohin_id) ) ;