package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

//購入履歴を表示するためのファイル。（フロントエンド(ブラウザ側)からデータを渡すためのファイル。）
public class HistoryForm implements Serializable {
	//購入履歴をデータベースに問い合わせるために必要な情報は user_id のみ
	private int userId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
