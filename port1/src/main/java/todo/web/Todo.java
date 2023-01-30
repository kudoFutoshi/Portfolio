package todo.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Todo implements Serializable {
    // フィールド
	private int shouhin_id;
	private String shohin_coode;	
    private String shohin_lot;	
    private String shohin_mei;	
    private String shohin_bunrui;	
    private int shouhin_quantity;	
    private int serial_number;	
    private String torokubi;
    
    
    private List<String> errorMessages;	// エラーメッセージ

        
    
    public String getShohin_coode() {return shohin_coode;}
    
	public List<String> getErrorMessages() {return errorMessages;}

	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public int getShouhin_id() {return shouhin_id;}

	public void setShouhin_id(int shouhin_id) {this.shouhin_id = shouhin_id;}

	public void setShohin_coode(String shohin_coode) {this.shohin_coode = shohin_coode;}
	
	public String getShohin_lot() {return shohin_lot;}
	
	public void setShohin_lot(String shohin_lot) {this.shohin_lot = shohin_lot;}
	
	public String getShohin_mei() {return shohin_mei;}
	
	public void setShohin_mei(String shohin_mei) {this.shohin_mei = shohin_mei;}
	
	public String getShohin_bunrui() {return shohin_bunrui;}
	
	public void setShohin_bunrui(String shohin_bunrui) {this.shohin_bunrui = shohin_bunrui;}
	
	public int getShouhin_quantity() {return shouhin_quantity;}
	
	public void setShouhin_quantity(int shouhin_quantity) {this.shouhin_quantity = shouhin_quantity;}
	
	public int getSerial_number() {return serial_number;}
	
	public void setSerial_number(int serial_number) {this.serial_number = serial_number;}
	
	public String getTorokubi() {return torokubi;}
	
	public void setTorokubi(String torokubi) {this.torokubi = torokubi;}
	
	
	
    // 入力チェックを行い、エラーがあった場合にはエラーメッセージを生成する
	   public boolean valueCheck() {
        // エラーメッセージの初期化
        errorMessages = new ArrayList<String>();

        
        if (shouhin_id < 0) {
            errorMessages.add("不正な番号入力を検出しました");
        }

      
        if (shohin_coode == null || shohin_coode.isEmpty()) {
            errorMessages.add("品番CDが空です");
        } else if (shohin_coode.length() > 6) {
            errorMessages.add("入力した品番CDが長すぎます");
        }

       
        if (shohin_lot == null || shohin_lot.isEmpty()) {
            errorMessages.add("ロットが空です");
        } else if (shohin_lot.length() > 5) {
            errorMessages.add("入力したロットが長すぎます");
        }
        
        if (shohin_mei == null || shohin_mei.isEmpty()) {
            errorMessages.add("商品名が空です");
        } else if (shohin_mei.length() >20) {
            errorMessages.add("入力した商品名が長すぎます");
        }
        
        if (shohin_bunrui == null || shohin_bunrui.isEmpty()) {
            errorMessages.add("商品分類が空です");
        } else if (shohin_bunrui.length() >20) {
            errorMessages.add("入力した商品分類が長すぎます");
        }
        
       
        if (shouhin_quantity < 0 || shouhin_quantity == 0 ) {
            errorMessages.add("不正な個数入力を検出しました");
        }
        
        if (serial_number < 0 || serial_number == 0) {
            errorMessages.add("不正なシリアル番号入力を検出しました");
        }
                 
       
        if (torokubi == null || torokubi.isEmpty()) {
            errorMessages.add("登録日が空です");
        } else if (!torokubi.matches("\\d{4}-\\d{2}-\\d{2}")) {
            errorMessages.add("入力した登録日のフォーマットが違います。　西暦：月：日○○○○-○○-○○のように入力してください");
        }
    

        return (errorMessages.size() == 0);
    }
}
