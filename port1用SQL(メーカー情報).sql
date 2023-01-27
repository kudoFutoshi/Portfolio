use port;

CREATE TABLE maker(
shohin_coode VARCHAR(6) DEFAULT NULL,
MakerName VARCHAR(40) DEFAULT NULL,
MakerAddress VARCHAR(100) DEFAULT NULL,
MakerTell VARCHAR(20)DEFAULT NULL
); 

SELECT * FROM port.maker;


INSERT INTO maker(shohin_coode,MakerName,MakerAddress,MakerTell)
 VALUES("SP2001","眼鏡工場株式会社","北海道札幌市架空区架空町1条1丁目1-1-1","000-000-0000");
INSERT INTO maker(shohin_coode,MakerName,MakerAddress,MakerTell)
 VALUES("SP2002","パン工房株式会社","北海道札幌市架空区架空町2条1丁目11-13","123-223-1111");
INSERT INTO maker(shohin_coode,MakerName,MakerAddress,MakerTell)
 VALUES("SP2003","ヒヨコファーム株式会社","北海道石狩市架空群架空村字南3条2丁目2-3","555-565-5555");
INSERT INTO maker(shohin_coode,MakerName,MakerAddress,MakerTell)
 VALUES("SP2004","家電工場株式会社","北海道室蘭市架空区架空町10条3丁目8-9","✖✖✖-✖✖✖-✖✖✖✖");
INSERT INTO maker(shohin_coode,MakerName,MakerAddress,MakerTell)
 VALUES("SP2005","(有)皿屋敷工房","北海道旭川市架空区謎町6条3丁目9-1-7","〇〇〇-〇〇〇-〇〇〇〇");
INSERT INTO maker(shohin_coode,MakerName,MakerAddress,MakerTell)
 VALUES("SP2006","㈱北製薬","北海道札幌市架空区架空10条4丁目11-9-3","△△△-△△△-△△△△");
INSERT INTO maker(shohin_coode,MakerName,MakerAddress,MakerTell)
 VALUES("SP2007","㈱清掃用具工場（第一工場）","北海道苫小牧市架空区架空町3条11丁目5-16","□□□-□□□-□□□□");
 
