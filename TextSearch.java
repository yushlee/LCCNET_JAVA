package com.training.session5;

public class TextSearch {

	public static void main(String[] args) {
		
		String text = "小明(男性)有一天去找小美(女性)，小美(女性)感覺到小明(男性)的表情有些不對，尋問之下...小明(男性)才莫莫說出心裡的話，";
		text += "小明(男性)：小美(女性)最近看到妳和B班的學長走的很近...下課也都讓他接送，小美(女性)近看觀察了小明(男性)的表情感覺到小明(男性)應該是吃醋了";
		
		String target = "小明,小美,(,最近,近看";
		// 預期結果:
		// 小明:6
		// 小美:4
		// (:10
		// 最近:1
		// 近看:1
		
	}

}
