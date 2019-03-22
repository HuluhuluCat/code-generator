package com.im.framework.rapidgen;

/**
 * @Description
 * @Author Administrator
 * @Date 2017/6/8
 */
public class MyGen {

    public static void main(String[] args) throws Exception {

        //#作者
        System.getProperties().put("author", "sq");
        //#项目根目录
        System.getProperties().put("basepackage", "com.im.oilcard.biz");


        CodeGenerator generator = new CodeGenerator();



        generator.genTable("oilcard",
//                "tf_f_oilcard_finance_pay_detail_vapor"
//                , "tf_f_oilcard_finance_ord_vapor","tf_f_oilcard_finance_pay_info_vapor",
                "tf_b_oilcard_pay_detail_jy", "tf_b_oilcard_pay_detail_vapor"
//                ,"tf_f_oilcard_finance_pay_info","tf_f_oilcard_finance_pay_info_jy"


        );
/*

        // module = order module 回单确认
        generator.genTable("order"
                , "tf_b_order","tf_b_sub_order"
                ,"TF_B_DELIVER_TAG_RECORD"
                ,"TF_B_SUB_ORDER_FILES"
                ,"tf_b_order_recept_record"

                ,"tf_b_order_settlement"

        );
*/
/**/

/*

        // module = checkmoney 对账
        generator.genTable("checkmoney"
                ,"tf_b_carrier_state"
                ,"tf_b_check_money"
                ,"tf_b_consignor_state"
                ,"tf_b_check_money_record"
            );
*/

/*

        // settlemoney 结算
        generator.genTable("settlemoney"
                ,"tf_b_carrier_settle"
                ,"tf_b_consignor_settle"
                ,"tf_b_settle_audit"
                ,"tf_b_settle_audit_record"
                ,"tf_b_rebate"
                ,"tf_b_settle_apply"
                ,"tf_b_settle_apply_record"
            );

*/
/*
        // invoice 发票
        generator.genTable("invoice"
                ,"tf_b_invoices"
                //,"tf_b_consignor_invoive_record"
                //,"tf_b_crrimer_invoive_record"
                ,"tf_b_invoice_apply"
                ,"tf_b_invoices_manage"
                //,"tf_b_order_invoice"
                , "tf_b_invoice_order_carrier"
                , "tf_b_invoice_order_consignor"
                , "tf_b_ship_invoice_order_carrier"
                , "tf_b_ship_invoice_order_consignor"
            );
            */
/*

        // 财务
        generator.genTable("finance"
                ,"tf_b_finance_bank_pay"
                ,"tf_b_finance_desposit"
                ,"tf_b_finance_freeze"
                ,"tf_b_finance_ord"
                ,"tf_b_finance_pay"
                ,"tf_b_finance_pay_record"
                ,"tf_b_finance_rdt"
                ,"tf_b_finance_receive"
                ,"tf_b_finance_recieve_record"
                ,"tf_b_finance_sw"
                ,"tf_f_finance_pre_pay"
                ,"tf_f_finance_pre_pay_inrec"
                ,"tf_f_finance_pre_pay_outrec"

            );
*/

    }


}
