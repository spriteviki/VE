package com.hit.wi.ve.functions;

import android.content.Context;
import android.util.Log;
import com.hit.wi.util.StringUtil;
import com.hit.wi.ve.functions.data.SymbolEmoji;

import java.io.IOException;

/**
 * Created by admin on 2015/10/30.
 */
public class SymbolsManager {
    public String[] EmojiFace = SymbolEmoji.FACE_DATA;
    public String[] EmojiNature = SymbolEmoji.NATURE;
    public String[] EmojiObj = SymbolEmoji.OBJECT;
    public String[] EmojiPlace = SymbolEmoji.PLACE;
    public String[] EmojiSymbols = SymbolEmoji.SYMBOLS;

    public String[] SMILE;
    public String[] MATH;
    public String[] BU_SHOU;
    public String[] SPECIAL;
    public String[] NET;
    public String[] RUSSIAN;
    public String[] NUMBER;
    public String[] PHONETIC;
    public String[] BOPOMOFO;
    public String[] JAPANESE;
    public String[] GREECE;

    public Symbols symbols;
    private  IniAnalysis iniAnalysis;

    public SymbolsManager(Context context){
        iniAnalysis = new IniAnalysis(context);
        symbols = new Symbols();
        try {
            SMILE       = StringUtil.convertListToString(iniAnalysis.getValuesFromFile(symbols.SMILE));
            MATH        = StringUtil.convertListToString(iniAnalysis.getValuesFromFile(symbols.MATH));
            BU_SHOU     = StringUtil.convertListToString(iniAnalysis.getValuesFromFile(symbols.BU_SHOU));
            SPECIAL     = StringUtil.convertListToString(iniAnalysis.getValuesFromFile(symbols.SPECIAL));
            NET         = StringUtil.convertListToString(iniAnalysis.getValuesFromFile(symbols.NET));
            RUSSIAN     = StringUtil.convertListToString(iniAnalysis.getValuesFromFile(symbols.RUSSIAN));
            PHONETIC    = StringUtil.convertListToString(iniAnalysis.getValuesFromFile(symbols.PHONETIC));
            NUMBER      = StringUtil.convertListToString(iniAnalysis.getValuesFromFile(symbols.NUMBER));
            BOPOMOFO    = StringUtil.convertListToString(iniAnalysis.getValuesFromFile(symbols.BOPOMOFO));
            JAPANESE    = StringUtil.convertListToString(iniAnalysis.getValuesFromFile(symbols.JAPNAESE));
            GREECE      = StringUtil.convertListToString(iniAnalysis.getValuesFromFile(symbols.GREECE));
        } catch (IOException e) {
            Log.d("WIVE","lightViewAnimate"+e.toString());
            e.printStackTrace();
        }
    }

    public class Symbols{
        public String SMILE     = "symbols/smile.ini";
        public String MATH      = "symbols/shu_xue.ini";
        public String BU_SHOU   = "symbols/bu_shou.ini";
        public String SPECIAL   = "symbols/te_shu.ini";
        public String NET       = "symbols/wang_luo.ini";
        public String RUSSIAN   = "symbols/e_wen.ini";
        public String NUMBER    = "symbols/xu_hao.ini";
        public String PHONETIC  = "symbols/yin_biao.ini";
        public String BOPOMOFO  = "symbols/zhu_yin.ini";
        public String JAPNAESE  = "symbols/ri_wen_pian_jia.ini";
        public String GREECE    = "symbols/greece.ini";
    }
}
