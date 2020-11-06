package com.example.bbokkibbokki.model

// 성인벌칙
class AdultPunishment (punishmentNum:Int, quantity:Int, punishmentContent:String){
    var punishmentNum:Int = 0 // 벌칙 넘버
    var quantity:Int = 0 // 해당벌칙의 수량
    var punishmentContent:String ="" // 해당 벌칙 내용

    init{
        this.punishmentNum = punishmentNum
        this.quantity = quantity
        this.punishmentContent = punishmentContent
    }

}