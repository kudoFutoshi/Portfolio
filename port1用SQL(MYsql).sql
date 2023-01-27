
CREATE DATABASE port;
use port;

CREATE TABLE shohin(
shouhin_id INT NOT NULL AUTO_INCREMENT,
shohin_coode VARCHAR(6) DEFAULT NULL,
shohin_lot VARCHAR(5) DEFAULT NULL,
shohin_mei VARCHAR(20) DEFAULT NULL,
shohin_bunrui VARCHAR(20) DEFAULT NULL,
shouhin_quantity INT DEFAULT NULL,
serial_number INT DEFAULT NULL,
torokubi VARCHAR(20) DEFAULT NULL,
PRIMARY KEY(shouhin_id)
);

SELECT * FROM port.shohin;

INSERT INTO shohin(shohin_coode,shohin_lot,shohin_mei,shohin_bunrui ,shouhin_quantity,serial_number,torokubi)
 VALUES("SP2001","S1001","老眼鏡","事務用品",10,4001,"2023-01-26");
INSERT INTO shohin(shohin_coode,shohin_lot,shohin_mei,shohin_bunrui ,shouhin_quantity,serial_number,torokubi)
 VALUES("SP2002","S1002","食パン","食品",5,4002,"2023-01-05");
INSERT INTO shohin(shohin_coode,shohin_lot,shohin_mei,shohin_bunrui ,shouhin_quantity,serial_number,torokubi)
 VALUES("SP2003","S1003","鶏卵","食品",15,4003,"2023-01-15");
INSERT INTO shohin(shohin_coode,shohin_lot,shohin_mei,shohin_bunrui ,shouhin_quantity,serial_number,torokubi)
 VALUES("SP2004","S1004","電気ケトル","家電",3,4004,"2021-04-11");
INSERT INTO shohin(shohin_coode,shohin_lot,shohin_mei,shohin_bunrui ,shouhin_quantity,serial_number,torokubi)
 VALUES("SP2005","S1005","皿","食器",5,4005,"2022-05-10");
INSERT INTO shohin(shohin_coode,shohin_lot,shohin_mei,shohin_bunrui ,shouhin_quantity,serial_number,torokubi)
 VALUES("SP2006","S1006","解熱剤","医薬品",5,4006,"2022-06-20");
INSERT INTO shohin(shohin_coode,shohin_lot,shohin_mei,shohin_bunrui ,shouhin_quantity,serial_number,torokubi)
 VALUES("SP2007","S1007","モップ","掃除用品",3,4007,"2022-11-24");



