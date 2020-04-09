import uk.ac.rhul.cs.csle.art.ARTException;
import uk.ac.rhul.cs.csle.artlexer.ARTLexerBase;
import uk.ac.rhul.cs.csle.art.ARTGrammar;
import uk.ac.rhul.cs.csle.art.ARTModeGrammarKind;
import uk.ac.rhul.cs.csle.artgll.*;
import uk.ac.rhul.cs.csle.artgraph.*;
import uk.ac.rhul.cs.csle.arttext.*;
import uk.ac.rhul.cs.csle.artvalue.*;
import uk.ac.rhul.cs.csle.art.ARTBitSet;
/*******************************************************************************
*
* ARTGeneratedParser.java
*
*******************************************************************************/
 import java.util.HashMap; 
public class ARTGeneratedParser extends uk.ac.rhul.cs.csle.artgll.ARTGLLParserHashPool {
  private static boolean[] ARTSet1;
  private static boolean[] ARTSet2;
  private static boolean[] ARTSet3;
  private static boolean[] ARTSet4;
  private static boolean[] ARTSet5;
  private static boolean[] ARTSet6;
  private static boolean[] ARTSet7;
  private static boolean[] ARTSet8;
  private static boolean[] ARTSet9;
  private static boolean[] ARTSet10;
  private static boolean[] ARTSet11;
  private static boolean[] ARTSet12;
  private static boolean[] ARTSet13;
  private static boolean[] ARTSet14;
  private static boolean[] ARTSet15;
  private static boolean[] ARTSet16;
  private static boolean[] ARTSet17;
  private static boolean[] ARTSet18;
  private static boolean[] ARTSet19;
  private static boolean[] ARTSet20;
  private static boolean[] ARTSet21;
  private static boolean[] ARTSet22;
  private static boolean[] ARTSet23;
  private static boolean[] ARTSet24;
  private static boolean[] ARTSet25;
  private static boolean[] ARTSet26;
  private static boolean[] ARTSet27;
  private static boolean[] ARTSet28;
  private static boolean[] ARTSet29;
  private static boolean[] ARTSet30;
  private static boolean[] ARTSet31;
  private static boolean[] ARTSet32;
  private static boolean[] ARTSet33;
  private static boolean[] ARTSet34;
  private static boolean[] ARTSet35;
  private static boolean[] ARTSet36;
  private static boolean[] ARTSet37;
  private static boolean[] ARTSet38;
  private static boolean[] ARTSet39;
  private static boolean[] ARTSet40;
  private static boolean[] ARTSet41;
  private static boolean[] ARTSet42;
  private static boolean[] ARTSet43;
  private static boolean[] ARTSet44;
  private static boolean[] ARTSet45;
  private static boolean[] ARTSet46;
  private static boolean[] ARTSet47;
  private static boolean[] ARTSet48;
  private static boolean[] ARTSet49;
  private static boolean[] ARTSet50;
  private static boolean[] ARTSet51;
  private static boolean[] ARTSet52;
  private static boolean[] ARTSet53;
  private static boolean[] ARTSet54;
  private static boolean[] ARTSet55;
  private static boolean[] ARTSet56;
  private static boolean[] ARTSet57;
  private static boolean[] ARTSet58;
  private static boolean[] ARTSet59;
  private static boolean[] ARTSet60;
  private static boolean[] ARTSet61;
  private static boolean[] ARTSet62;
  private static boolean[] ARTSet63;
  private static boolean[] ARTSet64;
  private static boolean[] ARTSet65;
  private static boolean[] ARTSet66;
  private static boolean[] ARTSet67;
  private static boolean[] ARTSet68;
  private static boolean[] ARTSet69;
  private static boolean[] ARTSet70;
  private static boolean[] ARTSet71;
  private static boolean[] ARTSet72;
  private static boolean[] ARTSet73;
  private static boolean[] ARTSet74;
  private static boolean[] ARTSet75;
  private static boolean[] ARTSet76;
  private static boolean[] ARTSet77;
  private static boolean[] ARTSet78;
  private static boolean[] ARTSet79;
  private static boolean[] ARTSet80;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_ID = 1;
  public static final int ARTTB_INTEGER = 2;
  public static final int ARTTB_REAL = 3;
  public static final int ARTTB_STRING_DQ = 4;
  public static final int ARTTS__SHREIK_EQUAL = 5;
  public static final int ARTTS__PERCENT = 6;
  public static final int ARTTS__LPAR = 7;
  public static final int ARTTS__RPAR = 8;
  public static final int ARTTS__STAR = 9;
  public static final int ARTTS__STAR_STAR = 10;
  public static final int ARTTS__PLUS = 11;
  public static final int ARTTS__COMMA = 12;
  public static final int ARTTS__MINUS = 13;
  public static final int ARTTS__SLASH = 14;
  public static final int ARTTS__SLASH_SLASH = 15;
  public static final int ARTTS__SEMICOLON = 16;
  public static final int ARTTS__LT = 17;
  public static final int ARTTS__LT_EQUAL = 18;
  public static final int ARTTS__EQUAL = 19;
  public static final int ARTTS__EQUAL_EQUAL = 20;
  public static final int ARTTS__GT = 21;
  public static final int ARTTS__GT_EQUAL = 22;
  public static final int ARTTS_Asthma = 23;
  public static final int ARTTS_Chad = 24;
  public static final int ARTTS_China = 25;
  public static final int ARTTS_ConsoleLog = 26;
  public static final int ARTTS_Cough = 27;
  public static final int ARTTS_Country = 28;
  public static final int ARTTS_Diabetic = 29;
  public static final int ARTTS_Female = 30;
  public static final int ARTTS_Fever = 31;
  public static final int ARTTS_Gender = 32;
  public static final int ARTTS_HelpMeWithCovid19 = 33;
  public static final int ARTTS_High_Blood_Pressure = 34;
  public static final int ARTTS_Italy = 35;
  public static final int ARTTS_Japan = 36;
  public static final int ARTTS_Male = 37;
  public static final int ARTTS_Shortness_Of_Breath = 38;
  public static final int ARTTS_Spain = 39;
  public static final int ARTTS_State = 40;
  public static final int ARTTS_Transgender = 41;
  public static final int ARTTS_UK = 42;
  public static final int ARTTS_USA = 43;
  public static final int ARTTS_Weak_Immune = 44;
  public static final int ARTTS_YourAge = 45;
  public static final int ARTTS_doThis = 46;
  public static final int ARTTS_else = 47;
  public static final int ARTTS_if = 48;
  public static final int ARTTS_runThis = 49;
  public static final int ARTTS_userHealth = 50;
  public static final int ARTTS_userSymptoms = 51;
  public static final int ARTTS_userTravels = 52;
  public static final int ARTTS_while = 53;
  public static final int ARTTS__LBRACE = 54;
  public static final int ARTTS__RBRACE = 55;
  public static final int ARTX_EPSILON = 56;
  public static final int ARTTB_COMMENT_LINE_C = 57;
  public static final int ARTTB_COMMENT_NEST_ART = 58;
  public static final int ARTTB_WHITESPACE = 59;
  public static final int ARTL_ART_Comments = 60;
  public static final int ARTL_ART_Country = 61;
  public static final int ARTL_ART_Health = 62;
  public static final int ARTL_ART_HealthType = 63;
  public static final int ARTL_ART_ID = 64;
  public static final int ARTL_ART_INTEGER = 65;
  public static final int ARTL_ART_REAL = 66;
  public static final int ARTL_ART_STRING_DQ = 67;
  public static final int ARTL_ART_State = 68;
  public static final int ARTL_ART_Symptoms = 69;
  public static final int ARTL_ART_SymptomsType = 70;
  public static final int ARTL_ART_Travels = 71;
  public static final int ARTL_ART_TravelsType = 72;
  public static final int ARTL_ART_YourAge = 73;
  public static final int ARTL_ART_e0 = 74;
  public static final int ARTL_ART_e1 = 75;
  public static final int ARTL_ART_e2 = 76;
  public static final int ARTL_ART_e3 = 77;
  public static final int ARTL_ART_e4 = 78;
  public static final int ARTL_ART_e5 = 79;
  public static final int ARTL_ART_elseOpt = 80;
  public static final int ARTL_ART_genderType = 81;
  public static final int ARTL_ART_mainCall = 82;
  public static final int ARTL_ART_printElements = 83;
  public static final int ARTL_ART_singleStatement = 84;
  public static final int ARTL_ART_statements = 85;
  public static final int ARTL_ART_subCall = 86;
  public static final int ARTL_ART_subCall2 = 87;
  public static final int ARTL_ART_subCall3 = 88;
  public static final int ARTL_ART_Comments_362 = 89;
  public static final int ARTL_ART_Comments_364 = 90;
  public static final int ARTL_ART_Comments_363 = 91;
  public static final int ARTL_ART_Country_346 = 92;
  public static final int ARTL_ART_Country_350 = 93;
  public static final int ARTL_ART_Country_347 = 94;
  public static final int ARTL_ART_Country_348 = 95;
  public static final int ARTL_ART_Health_210 = 96;
  public static final int ARTL_ART_Health_212 = 97;
  public static final int ARTL_ART_Health_211 = 98;
  public static final int ARTL_ART_Health_214 = 99;
  public static final int ARTL_ART_Health_216 = 100;
  public static final int ARTL_ART_Health_215 = 101;
  public static final int ARTL_ART_Health_218 = 102;
  public static final int ARTL_ART_Health_220 = 103;
  public static final int ARTL_ART_Health_219 = 104;
  public static final int ARTL_ART_Health_222 = 105;
  public static final int ARTL_ART_Health_224 = 106;
  public static final int ARTL_ART_Health_223 = 107;
  public static final int ARTL_ART_HealthType_186 = 108;
  public static final int ARTL_ART_HealthType_188 = 109;
  public static final int ARTL_ART_HealthType_192 = 110;
  public static final int ARTL_ART_HealthType_194 = 111;
  public static final int ARTL_ART_HealthType_193 = 112;
  public static final int ARTL_ART_HealthType_198 = 113;
  public static final int ARTL_ART_HealthType_200 = 114;
  public static final int ARTL_ART_HealthType_199 = 115;
  public static final int ARTL_ART_HealthType_204 = 116;
  public static final int ARTL_ART_HealthType_206 = 117;
  public static final int ARTL_ART_HealthType_205 = 118;
  public static final int ARTL_ART_ID_586 = 119;
  public static final int ARTL_ART_ID_588 = 120;
  public static final int ARTL_ART_ID_587 = 121;
  public static final int ARTL_ART_INTEGER_592 = 122;
  public static final int ARTL_ART_INTEGER_594 = 123;
  public static final int ARTL_ART_INTEGER_593 = 124;
  public static final int ARTL_ART_REAL_598 = 125;
  public static final int ARTL_ART_REAL_600 = 126;
  public static final int ARTL_ART_REAL_599 = 127;
  public static final int ARTL_ART_STRING_DQ_604 = 128;
  public static final int ARTL_ART_STRING_DQ_606 = 129;
  public static final int ARTL_ART_STRING_DQ_605 = 130;
  public static final int ARTL_ART_State_354 = 131;
  public static final int ARTL_ART_State_358 = 132;
  public static final int ARTL_ART_State_355 = 133;
  public static final int ARTL_ART_State_356 = 134;
  public static final int ARTL_ART_Symptoms_250 = 135;
  public static final int ARTL_ART_Symptoms_252 = 136;
  public static final int ARTL_ART_Symptoms_251 = 137;
  public static final int ARTL_ART_Symptoms_254 = 138;
  public static final int ARTL_ART_Symptoms_256 = 139;
  public static final int ARTL_ART_Symptoms_255 = 140;
  public static final int ARTL_ART_Symptoms_258 = 141;
  public static final int ARTL_ART_Symptoms_260 = 142;
  public static final int ARTL_ART_Symptoms_259 = 143;
  public static final int ARTL_ART_SymptomsType_262 = 144;
  public static final int ARTL_ART_SymptomsType_264 = 145;
  public static final int ARTL_ART_SymptomsType_268 = 146;
  public static final int ARTL_ART_SymptomsType_270 = 147;
  public static final int ARTL_ART_SymptomsType_269 = 148;
  public static final int ARTL_ART_SymptomsType_274 = 149;
  public static final int ARTL_ART_SymptomsType_276 = 150;
  public static final int ARTL_ART_SymptomsType_275 = 151;
  public static final int ARTL_ART_SymptomsType_280 = 152;
  public static final int ARTL_ART_SymptomsType_282 = 153;
  public static final int ARTL_ART_SymptomsType_281 = 154;
  public static final int ARTL_ART_Travels_286 = 155;
  public static final int ARTL_ART_Travels_288 = 156;
  public static final int ARTL_ART_Travels_287 = 157;
  public static final int ARTL_ART_Travels_290 = 158;
  public static final int ARTL_ART_Travels_292 = 159;
  public static final int ARTL_ART_Travels_291 = 160;
  public static final int ARTL_ART_Travels_294 = 161;
  public static final int ARTL_ART_Travels_296 = 162;
  public static final int ARTL_ART_Travels_295 = 163;
  public static final int ARTL_ART_Travels_298 = 164;
  public static final int ARTL_ART_Travels_300 = 165;
  public static final int ARTL_ART_Travels_299 = 166;
  public static final int ARTL_ART_Travels_302 = 167;
  public static final int ARTL_ART_Travels_304 = 168;
  public static final int ARTL_ART_Travels_303 = 169;
  public static final int ARTL_ART_Travels_306 = 170;
  public static final int ARTL_ART_Travels_308 = 171;
  public static final int ARTL_ART_Travels_307 = 172;
  public static final int ARTL_ART_Travels_310 = 173;
  public static final int ARTL_ART_Travels_312 = 174;
  public static final int ARTL_ART_Travels_311 = 175;
  public static final int ARTL_ART_TravelsType_314 = 176;
  public static final int ARTL_ART_TravelsType_316 = 177;
  public static final int ARTL_ART_TravelsType_320 = 178;
  public static final int ARTL_ART_TravelsType_322 = 179;
  public static final int ARTL_ART_TravelsType_321 = 180;
  public static final int ARTL_ART_TravelsType_326 = 181;
  public static final int ARTL_ART_TravelsType_328 = 182;
  public static final int ARTL_ART_TravelsType_327 = 183;
  public static final int ARTL_ART_TravelsType_332 = 184;
  public static final int ARTL_ART_TravelsType_334 = 185;
  public static final int ARTL_ART_TravelsType_333 = 186;
  public static final int ARTL_ART_YourAge_338 = 187;
  public static final int ARTL_ART_YourAge_342 = 188;
  public static final int ARTL_ART_YourAge_339 = 189;
  public static final int ARTL_ART_YourAge_340 = 190;
  public static final int ARTL_ART_e0_398 = 191;
  public static final int ARTL_ART_e0_400 = 192;
  public static final int ARTL_ART_e0_404 = 193;
  public static final int ARTL_ART_e0_406 = 194;
  public static final int ARTL_ART_e0_408 = 195;
  public static final int ARTL_ART_e0_410 = 196;
  public static final int ARTL_ART_e0_407 = 197;
  public static final int ARTL_ART_e0_414 = 198;
  public static final int ARTL_ART_e0_416 = 199;
  public static final int ARTL_ART_e0_418 = 200;
  public static final int ARTL_ART_e0_420 = 201;
  public static final int ARTL_ART_e0_417 = 202;
  public static final int ARTL_ART_e0_424 = 203;
  public static final int ARTL_ART_e0_426 = 204;
  public static final int ARTL_ART_e0_428 = 205;
  public static final int ARTL_ART_e0_430 = 206;
  public static final int ARTL_ART_e0_427 = 207;
  public static final int ARTL_ART_e0_434 = 208;
  public static final int ARTL_ART_e0_436 = 209;
  public static final int ARTL_ART_e0_438 = 210;
  public static final int ARTL_ART_e0_440 = 211;
  public static final int ARTL_ART_e0_437 = 212;
  public static final int ARTL_ART_e0_444 = 213;
  public static final int ARTL_ART_e0_446 = 214;
  public static final int ARTL_ART_e0_448 = 215;
  public static final int ARTL_ART_e0_450 = 216;
  public static final int ARTL_ART_e0_447 = 217;
  public static final int ARTL_ART_e0_454 = 218;
  public static final int ARTL_ART_e0_456 = 219;
  public static final int ARTL_ART_e0_458 = 220;
  public static final int ARTL_ART_e0_460 = 221;
  public static final int ARTL_ART_e0_457 = 222;
  public static final int ARTL_ART_e1_464 = 223;
  public static final int ARTL_ART_e1_466 = 224;
  public static final int ARTL_ART_e1_470 = 225;
  public static final int ARTL_ART_e1_472 = 226;
  public static final int ARTL_ART_e1_474 = 227;
  public static final int ARTL_ART_e1_476 = 228;
  public static final int ARTL_ART_e1_473 = 229;
  public static final int ARTL_ART_e1_480 = 230;
  public static final int ARTL_ART_e1_482 = 231;
  public static final int ARTL_ART_e1_484 = 232;
  public static final int ARTL_ART_e1_486 = 233;
  public static final int ARTL_ART_e1_483 = 234;
  public static final int ARTL_ART_e2_490 = 235;
  public static final int ARTL_ART_e2_492 = 236;
  public static final int ARTL_ART_e2_496 = 237;
  public static final int ARTL_ART_e2_498 = 238;
  public static final int ARTL_ART_e2_500 = 239;
  public static final int ARTL_ART_e2_502 = 240;
  public static final int ARTL_ART_e2_499 = 241;
  public static final int ARTL_ART_e2_506 = 242;
  public static final int ARTL_ART_e2_508 = 243;
  public static final int ARTL_ART_e2_510 = 244;
  public static final int ARTL_ART_e2_512 = 245;
  public static final int ARTL_ART_e2_509 = 246;
  public static final int ARTL_ART_e2_516 = 247;
  public static final int ARTL_ART_e2_518 = 248;
  public static final int ARTL_ART_e2_520 = 249;
  public static final int ARTL_ART_e2_522 = 250;
  public static final int ARTL_ART_e2_519 = 251;
  public static final int ARTL_ART_e3_526 = 252;
  public static final int ARTL_ART_e3_528 = 253;
  public static final int ARTL_ART_e3_532 = 254;
  public static final int ARTL_ART_e3_536 = 255;
  public static final int ARTL_ART_e3_533 = 256;
  public static final int ARTL_ART_e3_534 = 257;
  public static final int ARTL_ART_e3_540 = 258;
  public static final int ARTL_ART_e3_544 = 259;
  public static final int ARTL_ART_e3_541 = 260;
  public static final int ARTL_ART_e3_542 = 261;
  public static final int ARTL_ART_e4_548 = 262;
  public static final int ARTL_ART_e4_550 = 263;
  public static final int ARTL_ART_e4_554 = 264;
  public static final int ARTL_ART_e4_556 = 265;
  public static final int ARTL_ART_e4_558 = 266;
  public static final int ARTL_ART_e4_560 = 267;
  public static final int ARTL_ART_e4_557 = 268;
  public static final int ARTL_ART_e5_564 = 269;
  public static final int ARTL_ART_e5_566 = 270;
  public static final int ARTL_ART_e5_570 = 271;
  public static final int ARTL_ART_e5_572 = 272;
  public static final int ARTL_ART_e5_576 = 273;
  public static final int ARTL_ART_e5_580 = 274;
  public static final int ARTL_ART_e5_584 = 275;
  public static final int ARTL_ART_e5_577 = 276;
  public static final int ARTL_ART_e5_578 = 277;
  public static final int ARTL_ART_e5_583 = 278;
  public static final int ARTL_ART_elseOpt_126 = 279;
  public static final int ARTL_ART_elseOpt_130 = 280;
  public static final int ARTL_ART_elseOpt_127 = 281;
  public static final int ARTL_ART_elseOpt_128 = 282;
  public static final int ARTL_ART_elseOpt_132 = 283;
  public static final int ARTL_ART_elseOpt_134 = 284;
  public static final int ARTL_ART_genderType_226 = 285;
  public static final int ARTL_ART_genderType_228 = 286;
  public static final int ARTL_ART_genderType_232 = 287;
  public static final int ARTL_ART_genderType_234 = 288;
  public static final int ARTL_ART_genderType_233 = 289;
  public static final int ARTL_ART_genderType_238 = 290;
  public static final int ARTL_ART_genderType_240 = 291;
  public static final int ARTL_ART_genderType_239 = 292;
  public static final int ARTL_ART_genderType_244 = 293;
  public static final int ARTL_ART_genderType_246 = 294;
  public static final int ARTL_ART_genderType_245 = 295;
  public static final int ARTL_ART_mainCall_136 = 296;
  public static final int ARTL_ART_mainCall_140 = 297;
  public static final int ARTL_ART_mainCall_137 = 298;
  public static final int ARTL_ART_mainCall_138 = 299;
  public static final int ARTL_ART_mainCall_144 = 300;
  public static final int ARTL_ART_mainCall_146 = 301;
  public static final int ARTL_ART_mainCall_148 = 302;
  public static final int ARTL_ART_mainCall_152 = 303;
  public static final int ARTL_ART_mainCall_154 = 304;
  public static final int ARTL_ART_mainCall_156 = 305;
  public static final int ARTL_ART_mainCall_160 = 306;
  public static final int ARTL_ART_mainCall_162 = 307;
  public static final int ARTL_ART_mainCall_164 = 308;
  public static final int ARTL_ART_printElements_366 = 309;
  public static final int ARTL_ART_printElements_368 = 310;
  public static final int ARTL_ART_printElements_372 = 311;
  public static final int ARTL_ART_printElements_374 = 312;
  public static final int ARTL_ART_printElements_378 = 313;
  public static final int ARTL_ART_printElements_380 = 314;
  public static final int ARTL_ART_printElements_377 = 315;
  public static final int ARTL_ART_printElements_382 = 316;
  public static final int ARTL_ART_printElements_384 = 317;
  public static final int ARTL_ART_printElements_388 = 318;
  public static final int ARTL_ART_printElements_390 = 319;
  public static final int ARTL_ART_printElements_394 = 320;
  public static final int ARTL_ART_printElements_396 = 321;
  public static final int ARTL_ART_printElements_393 = 322;
  public static final int ARTL_ART_singleStatement_12 = 323;
  public static final int ARTL_ART_singleStatement_14 = 324;
  public static final int ARTL_ART_singleStatement_16 = 325;
  public static final int ARTL_ART_singleStatement_18 = 326;
  public static final int ARTL_ART_singleStatement_20 = 327;
  public static final int ARTL_ART_singleStatement_15 = 328;
  public static final int ARTL_ART_singleStatement_19 = 329;
  public static final int ARTL_ART_singleStatement_24 = 330;
  public static final int ARTL_ART_singleStatement_28 = 331;
  public static final int ARTL_ART_singleStatement_30 = 332;
  public static final int ARTL_ART_singleStatement_32 = 333;
  public static final int ARTL_ART_singleStatement_34 = 334;
  public static final int ARTL_ART_singleStatement_25 = 335;
  public static final int ARTL_ART_singleStatement_26 = 336;
  public static final int ARTL_ART_singleStatement_29 = 337;
  public static final int ARTL_ART_singleStatement_38 = 338;
  public static final int ARTL_ART_singleStatement_42 = 339;
  public static final int ARTL_ART_singleStatement_44 = 340;
  public static final int ARTL_ART_singleStatement_46 = 341;
  public static final int ARTL_ART_singleStatement_39 = 342;
  public static final int ARTL_ART_singleStatement_40 = 343;
  public static final int ARTL_ART_singleStatement_43 = 344;
  public static final int ARTL_ART_singleStatement_50 = 345;
  public static final int ARTL_ART_singleStatement_54 = 346;
  public static final int ARTL_ART_singleStatement_56 = 347;
  public static final int ARTL_ART_singleStatement_51 = 348;
  public static final int ARTL_ART_singleStatement_52 = 349;
  public static final int ARTL_ART_singleStatement_60 = 350;
  public static final int ARTL_ART_singleStatement_64 = 351;
  public static final int ARTL_ART_singleStatement_66 = 352;
  public static final int ARTL_ART_singleStatement_61 = 353;
  public static final int ARTL_ART_singleStatement_62 = 354;
  public static final int ARTL_ART_singleStatement_70 = 355;
  public static final int ARTL_ART_singleStatement_74 = 356;
  public static final int ARTL_ART_singleStatement_76 = 357;
  public static final int ARTL_ART_singleStatement_71 = 358;
  public static final int ARTL_ART_singleStatement_72 = 359;
  public static final int ARTL_ART_singleStatement_80 = 360;
  public static final int ARTL_ART_singleStatement_84 = 361;
  public static final int ARTL_ART_singleStatement_86 = 362;
  public static final int ARTL_ART_singleStatement_81 = 363;
  public static final int ARTL_ART_singleStatement_82 = 364;
  public static final int ARTL_ART_singleStatement_85 = 365;
  public static final int ARTL_ART_singleStatement_90 = 366;
  public static final int ARTL_ART_singleStatement_94 = 367;
  public static final int ARTL_ART_singleStatement_96 = 368;
  public static final int ARTL_ART_singleStatement_98 = 369;
  public static final int ARTL_ART_singleStatement_100 = 370;
  public static final int ARTL_ART_singleStatement_91 = 371;
  public static final int ARTL_ART_singleStatement_92 = 372;
  public static final int ARTL_ART_singleStatement_93 = 373;
  public static final int ARTL_ART_singleStatement_97 = 374;
  public static final int ARTL_ART_singleStatement_99 = 375;
  public static final int ARTL_ART_singleStatement_102 = 376;
  public static final int ARTL_ART_singleStatement_106 = 377;
  public static final int ARTL_ART_singleStatement_108 = 378;
  public static final int ARTL_ART_singleStatement_103 = 379;
  public static final int ARTL_ART_singleStatement_104 = 380;
  public static final int ARTL_ART_singleStatement_107 = 381;
  public static final int ARTL_ART_singleStatement_110 = 382;
  public static final int ARTL_ART_singleStatement_112 = 383;
  public static final int ARTL_ART_singleStatement_114 = 384;
  public static final int ARTL_ART_singleStatement_116 = 385;
  public static final int ARTL_ART_singleStatement_118 = 386;
  public static final int ARTL_ART_singleStatement_120 = 387;
  public static final int ARTL_ART_singleStatement_122 = 388;
  public static final int ARTL_ART_singleStatement_124 = 389;
  public static final int ARTL_ART_statements_2 = 390;
  public static final int ARTL_ART_statements_4 = 391;
  public static final int ARTL_ART_statements_6 = 392;
  public static final int ARTL_ART_statements_8 = 393;
  public static final int ARTL_ART_statements_10 = 394;
  public static final int ARTL_ART_subCall_168 = 395;
  public static final int ARTL_ART_subCall_170 = 396;
  public static final int ARTL_ART_subCall2_174 = 397;
  public static final int ARTL_ART_subCall2_176 = 398;
  public static final int ARTL_ART_subCall3_180 = 399;
  public static final int ARTL_ART_subCall3_182 = 400;
  public static final int ARTX_DESPATCH = 401;
  public static final int ARTX_DUMMY = 402;
  public static final int ARTX_LABEL_EXTENT = 403;
  /* End of artLabel enumeration */

  /* Start of artName enumeration */
  public static final int ARTNAME_NONE = 0;
  public static final int ARTNAME_EXTENT = 1;
  /* End of artName enumeration */
  public void ARTPF_ART_Comments() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal Comments production descriptor loads*/
      case ARTL_ART_Comments: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Comments_362, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal Comments: match production*/
      case ARTL_ART_Comments_362: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SLASH_SLASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Comments_364, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet1[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_Country() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal Country production descriptor loads*/
      case ARTL_ART_Country: 
        if (ARTSet4[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Country_346, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal Country: match production*/
      case ARTL_ART_Country_346: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Country, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Country_348, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_Country_350, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_Country_350: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_Health() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal Health production descriptor loads*/
      case ARTL_ART_Health: 
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Health_210, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Health_214, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Health_218, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Health_222, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal Health: match production*/
      case ARTL_ART_Health_210: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Diabetic, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Health_212, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal Health: match production*/
      case ARTL_ART_Health_214: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_High_Blood_Pressure, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Health_216, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal Health: match production*/
      case ARTL_ART_Health_218: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Asthma, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Health_220, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal Health: match production*/
      case ARTL_ART_Health_222: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Weak_Immune, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Health_224, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_HealthType() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal HealthType production descriptor loads*/
      case ARTL_ART_HealthType: 
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_HealthType_186, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_HealthType_192, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_HealthType_198, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_HealthType_204, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal HealthType: match production*/
      case ARTL_ART_HealthType_186: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_HealthType_188, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal HealthType: match production*/
      case ARTL_ART_HealthType_192: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Diabetic, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_HealthType_194, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal HealthType: match production*/
      case ARTL_ART_HealthType_198: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_High_Blood_Pressure, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_HealthType_200, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal HealthType: match production*/
      case ARTL_ART_HealthType_204: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Asthma, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_HealthType_206, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ID() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ID production descriptor loads*/
      case ARTL_ART_ID: 
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ID_586, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ID: match production*/
      case ARTL_ART_ID_586: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ID_588, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_INTEGER() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal INTEGER production descriptor loads*/
      case ARTL_ART_INTEGER: 
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_INTEGER_592, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal INTEGER: match production*/
      case ARTL_ART_INTEGER_592: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_INTEGER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_INTEGER_594, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_REAL() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal REAL production descriptor loads*/
      case ARTL_ART_REAL: 
        if (ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_REAL_598, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal REAL: match production*/
      case ARTL_ART_REAL_598: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_REAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_REAL_600, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet1[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_STRING_DQ() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal STRING_DQ production descriptor loads*/
      case ARTL_ART_STRING_DQ: 
        if (ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_STRING_DQ_604, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal STRING_DQ: match production*/
      case ARTL_ART_STRING_DQ_604: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_DQ, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_STRING_DQ_606, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_State() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal State production descriptor loads*/
      case ARTL_ART_State: 
        if (ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_State_354, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal State: match production*/
      case ARTL_ART_State_354: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_State, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_State_356, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_State_358, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_State_358: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_Symptoms() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal Symptoms production descriptor loads*/
      case ARTL_ART_Symptoms: 
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Symptoms_250, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Symptoms_254, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Symptoms_258, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal Symptoms: match production*/
      case ARTL_ART_Symptoms_250: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Cough, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Symptoms_252, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal Symptoms: match production*/
      case ARTL_ART_Symptoms_254: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Shortness_Of_Breath, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Symptoms_256, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal Symptoms: match production*/
      case ARTL_ART_Symptoms_258: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Fever, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Symptoms_260, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_SymptomsType() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal SymptomsType production descriptor loads*/
      case ARTL_ART_SymptomsType: 
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_SymptomsType_262, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_SymptomsType_268, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_SymptomsType_274, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_SymptomsType_280, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal SymptomsType: match production*/
      case ARTL_ART_SymptomsType_262: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_SymptomsType_264, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal SymptomsType: match production*/
      case ARTL_ART_SymptomsType_268: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Cough, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_SymptomsType_270, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal SymptomsType: match production*/
      case ARTL_ART_SymptomsType_274: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Shortness_Of_Breath, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_SymptomsType_276, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal SymptomsType: match production*/
      case ARTL_ART_SymptomsType_280: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Fever, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_SymptomsType_282, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_Travels() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal Travels production descriptor loads*/
      case ARTL_ART_Travels: 
        if (ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Travels_286, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Travels_290, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Travels_294, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Travels_298, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Travels_302, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Travels_306, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Travels_310, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal Travels: match production*/
      case ARTL_ART_Travels_286: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_USA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Travels_288, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal Travels: match production*/
      case ARTL_ART_Travels_290: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Chad, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Travels_292, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal Travels: match production*/
      case ARTL_ART_Travels_294: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_China, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Travels_296, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal Travels: match production*/
      case ARTL_ART_Travels_298: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_UK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Travels_300, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal Travels: match production*/
      case ARTL_ART_Travels_302: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Spain, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Travels_304, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal Travels: match production*/
      case ARTL_ART_Travels_306: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Japan, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Travels_308, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal Travels: match production*/
      case ARTL_ART_Travels_310: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Italy, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_Travels_312, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_TravelsType() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal TravelsType production descriptor loads*/
      case ARTL_ART_TravelsType: 
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_TravelsType_314, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_TravelsType_320, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_TravelsType_326, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_TravelsType_332, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal TravelsType: match production*/
      case ARTL_ART_TravelsType_314: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_TravelsType_316, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal TravelsType: match production*/
      case ARTL_ART_TravelsType_320: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_USA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_TravelsType_322, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal TravelsType: match production*/
      case ARTL_ART_TravelsType_326: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Italy, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_TravelsType_328, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal TravelsType: match production*/
      case ARTL_ART_TravelsType_332: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_China, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_TravelsType_334, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_YourAge() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal YourAge production descriptor loads*/
      case ARTL_ART_YourAge: 
        if (ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_YourAge_338, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal YourAge: match production*/
      case ARTL_ART_YourAge_338: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_YourAge, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_YourAge_340, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_YourAge_342, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_YourAge_342: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e0() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e0 production descriptor loads*/
      case ARTL_ART_e0: 
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_398, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_404, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_414, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_424, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_434, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_444, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e0_454, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_398: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_400, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_400: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_404: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_406, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_406: 
        /* Nonterminal template end */
        if (!ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_408, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_410, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_410: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_414: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_416, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_416: 
        /* Nonterminal template end */
        if (!ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_418, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_420, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_420: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_424: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_426, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_426: 
        /* Nonterminal template end */
        if (!ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_428, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_430, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_430: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_434: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_436, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_436: 
        /* Nonterminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_438, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_440, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_440: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_444: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_446, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_446: 
        /* Nonterminal template end */
        if (!ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_448, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_450, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_450: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e0: match production*/
      case ARTL_ART_e0_454: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_456, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_456: 
        /* Nonterminal template end */
        if (!ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e0_458, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e0_460, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e0_460: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e1() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e1 production descriptor loads*/
      case ARTL_ART_e1: 
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e1_464, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e1_470, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e1_480, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e1: match production*/
      case ARTL_ART_e1_464: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_466, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e1_466: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e1: match production*/
      case ARTL_ART_e1_470: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_472, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e1_472: 
        /* Nonterminal template end */
        if (!ARTSet44[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e1_474, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_476, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e1_476: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e1: match production*/
      case ARTL_ART_e1_480: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_482, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e1_482: 
        /* Nonterminal template end */
        if (!ARTSet45[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e1_484, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e1_486, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e1_486: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e2() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e2 production descriptor loads*/
      case ARTL_ART_e2: 
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e2_490, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e2_496, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e2_506, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e2_516, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e2: match production*/
      case ARTL_ART_e2_490: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_492, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e2_492: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e2: match production*/
      case ARTL_ART_e2_496: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_498, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e2_498: 
        /* Nonterminal template end */
        if (!ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e2_500, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_502, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e2_502: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e2: match production*/
      case ARTL_ART_e2_506: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_508, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e2_508: 
        /* Nonterminal template end */
        if (!ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SLASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e2_510, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_512, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e2_512: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e2: match production*/
      case ARTL_ART_e2_516: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_518, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e2; return; }
      case ARTL_ART_e2_518: 
        /* Nonterminal template end */
        if (!ARTSet49[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PERCENT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e2_520, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e2_522, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e2_522: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e3() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e3 production descriptor loads*/
      case ARTL_ART_e3: 
        if (ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e3_526, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet44[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e3_532, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet45[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e3_540, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e3: match production*/
      case ARTL_ART_e3_526: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e3_528, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e4; return; }
      case ARTL_ART_e3_528: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e3: match production*/
      case ARTL_ART_e3_532: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e3_534, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e3_536, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e3_536: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e3: match production*/
      case ARTL_ART_e3_540: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e3_542, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e3_544, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e3; return; }
      case ARTL_ART_e3_544: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e4() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e4 production descriptor loads*/
      case ARTL_ART_e4: 
        if (ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e4_548, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e4_554, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e4: match production*/
      case ARTL_ART_e4_548: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e4_550, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e5; return; }
      case ARTL_ART_e4_550: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e4: match production*/
      case ARTL_ART_e4_554: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e4_556, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e5; return; }
      case ARTL_ART_e4_556: 
        /* Nonterminal template end */
        if (!ARTSet51[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR_STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e4_558, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e4_560, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e4; return; }
      case ARTL_ART_e4_560: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_e5() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal e5 production descriptor loads*/
      case ARTL_ART_e5: 
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e5_564, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e5_570, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet53[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_e5_576, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal e5: match production*/
      case ARTL_ART_e5_564: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e5_566, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_e5_566: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet52[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e5: match production*/
      case ARTL_ART_e5_570: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e5_572, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_e5_572: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet52[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal e5: match production*/
      case ARTL_ART_e5_576: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e5_578, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_e5_580, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e1; return; }
      case ARTL_ART_e5_580: 
        /* Nonterminal template end */
        if (!ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_e5_584, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet52[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_elseOpt() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal elseOpt production descriptor loads*/
      case ARTL_ART_elseOpt: 
        if (ARTSet56[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_elseOpt_126, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_elseOpt_132, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal elseOpt: match production*/
      case ARTL_ART_elseOpt_126: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_else, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_elseOpt_128, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_elseOpt_130, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_singleStatement; return; }
      case ARTL_ART_elseOpt_130: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal elseOpt: match production*/
      case ARTL_ART_elseOpt_132: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_elseOpt_134, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_genderType() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal genderType production descriptor loads*/
      case ARTL_ART_genderType: 
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_genderType_226, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet59[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_genderType_232, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet60[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_genderType_238, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet61[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_genderType_244, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal genderType: match production*/
      case ARTL_ART_genderType_226: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_genderType_228, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal genderType: match production*/
      case ARTL_ART_genderType_232: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Male, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_genderType_234, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal genderType: match production*/
      case ARTL_ART_genderType_238: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Female, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_genderType_240, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal genderType: match production*/
      case ARTL_ART_genderType_244: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Transgender, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_genderType_246, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_mainCall() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal mainCall production descriptor loads*/
      case ARTL_ART_mainCall: 
        if (ARTSet63[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_mainCall_136, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_mainCall_144, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_mainCall_152, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_mainCall_160, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal mainCall: match production*/
      case ARTL_ART_mainCall_136: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Gender, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_mainCall_138, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet64[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mainCall_140, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_genderType; return; }
      case ARTL_ART_mainCall_140: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal mainCall: match production*/
      case ARTL_ART_mainCall_144: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mainCall_146, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subCall; return; }
      case ARTL_ART_mainCall_146: 
        /* Nonterminal template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mainCall_148, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_HealthType; return; }
      case ARTL_ART_mainCall_148: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal mainCall: match production*/
      case ARTL_ART_mainCall_152: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mainCall_154, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subCall2; return; }
      case ARTL_ART_mainCall_154: 
        /* Nonterminal template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mainCall_156, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_SymptomsType; return; }
      case ARTL_ART_mainCall_156: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal mainCall: match production*/
      case ARTL_ART_mainCall_160: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mainCall_162, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_subCall3; return; }
      case ARTL_ART_mainCall_162: 
        /* Nonterminal template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_mainCall_164, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_TravelsType; return; }
      case ARTL_ART_mainCall_164: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_printElements() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal printElements production descriptor loads*/
      case ARTL_ART_printElements: 
        if (ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_366, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_372, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_382, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_printElements_388, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_366: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_368, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_printElements_368: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_372: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_374, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_DQ; return; }
      case ARTL_ART_printElements_374: 
        /* Nonterminal template end */
        if (!ARTSet66[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_printElements_378, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet65[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_380, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printElements; return; }
      case ARTL_ART_printElements_380: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_382: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_384, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e0; return; }
      case ARTL_ART_printElements_384: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal printElements: match production*/
      case ARTL_ART_printElements_388: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_390, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e0; return; }
      case ARTL_ART_printElements_390: 
        /* Nonterminal template end */
        if (!ARTSet66[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_printElements_394, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet65[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_printElements_396, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printElements; return; }
      case ARTL_ART_printElements_396: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_singleStatement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal singleStatement production descriptor loads*/
      case ARTL_ART_singleStatement: 
        if (ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_singleStatement_12, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet69[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_singleStatement_24, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet71[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_singleStatement_38, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet73[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_singleStatement_50, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet74[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_singleStatement_60, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet75[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_singleStatement_70, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet76[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_singleStatement_80, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet77[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_singleStatement_90, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet78[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_singleStatement_102, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet62[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_singleStatement_110, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_singleStatement_114, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet4[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_singleStatement_118, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_singleStatement_122, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal singleStatement: match production*/
      case ARTL_ART_singleStatement_12: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_14, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_singleStatement_14: 
        /* Nonterminal template end */
        if (!ARTSet67[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_16, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_18, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e0; return; }
      case ARTL_ART_singleStatement_18: 
        /* Nonterminal template end */
        if (!ARTSet68[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_20, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal singleStatement: match production*/
      case ARTL_ART_singleStatement_24: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_if, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_26, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_28, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e0; return; }
      case ARTL_ART_singleStatement_28: 
        /* Nonterminal template end */
        if (!ARTSet70[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_doThis, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_30, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_32, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_singleStatement; return; }
      case ARTL_ART_singleStatement_32: 
        /* Nonterminal template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_34, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_elseOpt; return; }
      case ARTL_ART_singleStatement_34: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal singleStatement: match production*/
      case ARTL_ART_singleStatement_38: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_while, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_40, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_42, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_e0; return; }
      case ARTL_ART_singleStatement_42: 
        /* Nonterminal template end */
        if (!ARTSet72[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_runThis, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_44, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_46, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_singleStatement; return; }
      case ARTL_ART_singleStatement_46: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal singleStatement: match production*/
      case ARTL_ART_singleStatement_50: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_userSymptoms, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_52, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_54, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_singleStatement_54: 
        /* Nonterminal template end */
        if (!ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_56, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_singleStatement; return; }
      case ARTL_ART_singleStatement_56: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal singleStatement: match production*/
      case ARTL_ART_singleStatement_60: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_userTravels, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_62, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_64, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_singleStatement_64: 
        /* Nonterminal template end */
        if (!ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_66, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_singleStatement; return; }
      case ARTL_ART_singleStatement_66: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal singleStatement: match production*/
      case ARTL_ART_singleStatement_70: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_userHealth, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_72, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_74, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_singleStatement_74: 
        /* Nonterminal template end */
        if (!ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_76, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_singleStatement; return; }
      case ARTL_ART_singleStatement_76: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal singleStatement: match production*/
      case ARTL_ART_singleStatement_80: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_HelpMeWithCovid19, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_82, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_84, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_singleStatement_84: 
        /* Nonterminal template end */
        if (!ARTSet68[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_86, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal singleStatement: match production*/
      case ARTL_ART_singleStatement_90: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_ConsoleLog, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_92, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet53[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_94, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet65[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_96, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_printElements; return; }
      case ARTL_ART_singleStatement_96: 
        /* Nonterminal template end */
        if (!ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_98, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet68[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_100, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal singleStatement: match production*/
      case ARTL_ART_singleStatement_102: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_104, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_106, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statements; return; }
      case ARTL_ART_singleStatement_106: 
        /* Nonterminal template end */
        if (!ARTSet79[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_singleStatement_108, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal singleStatement: match production*/
      case ARTL_ART_singleStatement_110: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_112, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_mainCall; return; }
      case ARTL_ART_singleStatement_112: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal singleStatement: match production*/
      case ARTL_ART_singleStatement_114: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_116, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_YourAge; return; }
      case ARTL_ART_singleStatement_116: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal singleStatement: match production*/
      case ARTL_ART_singleStatement_118: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_120, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_Country; return; }
      case ARTL_ART_singleStatement_120: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal singleStatement: match production*/
      case ARTL_ART_singleStatement_122: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_singleStatement_124, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_State; return; }
      case ARTL_ART_singleStatement_124: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statements() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statements production descriptor loads*/
      case ARTL_ART_statements: 
        if (ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statements_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statements_6, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal statements: match production*/
      case ARTL_ART_statements_2: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_4, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_singleStatement; return; }
      case ARTL_ART_statements_4: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet80[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statements: match production*/
      case ARTL_ART_statements_6: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_8, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_singleStatement; return; }
      case ARTL_ART_statements_8: 
        /* Nonterminal template end */
        if (!ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_10, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statements; return; }
      case ARTL_ART_statements_10: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet80[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subCall() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subCall production descriptor loads*/
      case ARTL_ART_subCall: 
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subCall_168, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subCall: match production*/
      case ARTL_ART_subCall_168: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subCall_170, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_Health; return; }
      case ARTL_ART_subCall_170: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subCall2() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subCall2 production descriptor loads*/
      case ARTL_ART_subCall2: 
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subCall2_174, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subCall2: match production*/
      case ARTL_ART_subCall2_174: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subCall2_176, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_Symptoms; return; }
      case ARTL_ART_subCall2_176: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_subCall3() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal subCall3 production descriptor loads*/
      case ARTL_ART_subCall3: 
        if (ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_subCall3_180, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal subCall3: match production*/
      case ARTL_ART_subCall3_180: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_subCall3_182, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_Travels; return; }
      case ARTL_ART_subCall3_182: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artLexicaliseUsingLongestMatch(artInputString);
    artLexCompleteTime = artReadClock();
    artDummySPPFNode = artFindSPPFInitial(ARTL_DUMMY, 0, 0);
    artCurrentSPPFNode = artDummySPPFNode;
    artRootGSSNode = artFindGSS(ARTL_EOS, 0, 0, 0);
    artCurrentGSSNode = artRootGSSNode;
    artCurrentRestartLabel = artStartSymbolLabel;
    artCurrentInputPairIndex = 0;
    artCurrentInputPairReference = 0;
    while (true)
      switch (artlhsL[artCurrentRestartLabel]) {
        case ARTL_ART_Comments: 
          ARTPF_ART_Comments();
          break;
        case ARTL_ART_Country: 
          ARTPF_ART_Country();
          break;
        case ARTL_ART_Health: 
          ARTPF_ART_Health();
          break;
        case ARTL_ART_HealthType: 
          ARTPF_ART_HealthType();
          break;
        case ARTL_ART_ID: 
          ARTPF_ART_ID();
          break;
        case ARTL_ART_INTEGER: 
          ARTPF_ART_INTEGER();
          break;
        case ARTL_ART_REAL: 
          ARTPF_ART_REAL();
          break;
        case ARTL_ART_STRING_DQ: 
          ARTPF_ART_STRING_DQ();
          break;
        case ARTL_ART_State: 
          ARTPF_ART_State();
          break;
        case ARTL_ART_Symptoms: 
          ARTPF_ART_Symptoms();
          break;
        case ARTL_ART_SymptomsType: 
          ARTPF_ART_SymptomsType();
          break;
        case ARTL_ART_Travels: 
          ARTPF_ART_Travels();
          break;
        case ARTL_ART_TravelsType: 
          ARTPF_ART_TravelsType();
          break;
        case ARTL_ART_YourAge: 
          ARTPF_ART_YourAge();
          break;
        case ARTL_ART_e0: 
          ARTPF_ART_e0();
          break;
        case ARTL_ART_e1: 
          ARTPF_ART_e1();
          break;
        case ARTL_ART_e2: 
          ARTPF_ART_e2();
          break;
        case ARTL_ART_e3: 
          ARTPF_ART_e3();
          break;
        case ARTL_ART_e4: 
          ARTPF_ART_e4();
          break;
        case ARTL_ART_e5: 
          ARTPF_ART_e5();
          break;
        case ARTL_ART_elseOpt: 
          ARTPF_ART_elseOpt();
          break;
        case ARTL_ART_genderType: 
          ARTPF_ART_genderType();
          break;
        case ARTL_ART_mainCall: 
          ARTPF_ART_mainCall();
          break;
        case ARTL_ART_printElements: 
          ARTPF_ART_printElements();
          break;
        case ARTL_ART_singleStatement: 
          ARTPF_ART_singleStatement();
          break;
        case ARTL_ART_statements: 
          ARTPF_ART_statements();
          break;
        case ARTL_ART_subCall: 
          ARTPF_ART_subCall();
          break;
        case ARTL_ART_subCall2: 
          ARTPF_ART_subCall2();
          break;
        case ARTL_ART_subCall3: 
          ARTPF_ART_subCall3();
          break;
        case ARTX_DESPATCH: 
          if (artNoDescriptors()) { 
            artCheckAcceptance();
            artParseCompleteTime = artReadClock();
            return;
           }
          artUnloadDescriptor();
      }
  }

  public void ARTSet1initialise() {
    ARTSet1 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet1, 0, artSetExtent, false);
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTS_Cough] = true;
    ARTSet20[ARTTS_Fever] = true;
    ARTSet20[ARTTS_Shortness_Of_Breath] = true;
  }

  public void ARTSet46initialise() {
    ARTSet46 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet46, 0, artSetExtent, false);
    ARTSet46[ARTTS__SHREIK_EQUAL] = true;
    ARTSet46[ARTTS__PERCENT] = true;
    ARTSet46[ARTTS__RPAR] = true;
    ARTSet46[ARTTS__STAR] = true;
    ARTSet46[ARTTS__PLUS] = true;
    ARTSet46[ARTTS__COMMA] = true;
    ARTSet46[ARTTS__MINUS] = true;
    ARTSet46[ARTTS__SLASH] = true;
    ARTSet46[ARTTS__SEMICOLON] = true;
    ARTSet46[ARTTS__LT] = true;
    ARTSet46[ARTTS__LT_EQUAL] = true;
    ARTSet46[ARTTS__EQUAL_EQUAL] = true;
    ARTSet46[ARTTS__GT] = true;
    ARTSet46[ARTTS__GT_EQUAL] = true;
    ARTSet46[ARTTS_doThis] = true;
    ARTSet46[ARTTS_runThis] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTS_High_Blood_Pressure] = true;
  }

  public void ARTSet62initialise() {
    ARTSet62 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet62, 0, artSetExtent, false);
    ARTSet62[ARTTS_Asthma] = true;
    ARTSet62[ARTTS_Chad] = true;
    ARTSet62[ARTTS_China] = true;
    ARTSet62[ARTTS_Cough] = true;
    ARTSet62[ARTTS_Diabetic] = true;
    ARTSet62[ARTTS_Fever] = true;
    ARTSet62[ARTTS_Gender] = true;
    ARTSet62[ARTTS_High_Blood_Pressure] = true;
    ARTSet62[ARTTS_Italy] = true;
    ARTSet62[ARTTS_Japan] = true;
    ARTSet62[ARTTS_Shortness_Of_Breath] = true;
    ARTSet62[ARTTS_Spain] = true;
    ARTSet62[ARTTS_UK] = true;
    ARTSet62[ARTTS_USA] = true;
    ARTSet62[ARTTS_Weak_Immune] = true;
  }

  public void ARTSet59initialise() {
    ARTSet59 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet59, 0, artSetExtent, false);
    ARTSet59[ARTTS_Male] = true;
  }

  public void ARTSet71initialise() {
    ARTSet71 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet71, 0, artSetExtent, false);
    ARTSet71[ARTTS_while] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTS_UK] = true;
  }

  public void ARTSet77initialise() {
    ARTSet77 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet77, 0, artSetExtent, false);
    ARTSet77[ARTTS_ConsoleLog] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTS_Shortness_Of_Breath] = true;
  }

  public void ARTSet43initialise() {
    ARTSet43 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet43, 0, artSetExtent, false);
    ARTSet43[ARTTS__SHREIK_EQUAL] = true;
    ARTSet43[ARTTS__RPAR] = true;
    ARTSet43[ARTTS__PLUS] = true;
    ARTSet43[ARTTS__COMMA] = true;
    ARTSet43[ARTTS__MINUS] = true;
    ARTSet43[ARTTS__SEMICOLON] = true;
    ARTSet43[ARTTS__LT] = true;
    ARTSet43[ARTTS__LT_EQUAL] = true;
    ARTSet43[ARTTS__EQUAL_EQUAL] = true;
    ARTSet43[ARTTS__GT] = true;
    ARTSet43[ARTTS__GT_EQUAL] = true;
    ARTSet43[ARTTS_doThis] = true;
    ARTSet43[ARTTS_runThis] = true;
  }

  public void ARTSet64initialise() {
    ARTSet64 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet64, 0, artSetExtent, false);
    ARTSet64[ARTX_EOS] = true;
    ARTSet64[ARTTB_ID] = true;
    ARTSet64[ARTTS_Asthma] = true;
    ARTSet64[ARTTS_Chad] = true;
    ARTSet64[ARTTS_China] = true;
    ARTSet64[ARTTS_ConsoleLog] = true;
    ARTSet64[ARTTS_Cough] = true;
    ARTSet64[ARTTS_Country] = true;
    ARTSet64[ARTTS_Diabetic] = true;
    ARTSet64[ARTTS_Female] = true;
    ARTSet64[ARTTS_Fever] = true;
    ARTSet64[ARTTS_Gender] = true;
    ARTSet64[ARTTS_HelpMeWithCovid19] = true;
    ARTSet64[ARTTS_High_Blood_Pressure] = true;
    ARTSet64[ARTTS_Italy] = true;
    ARTSet64[ARTTS_Japan] = true;
    ARTSet64[ARTTS_Male] = true;
    ARTSet64[ARTTS_Shortness_Of_Breath] = true;
    ARTSet64[ARTTS_Spain] = true;
    ARTSet64[ARTTS_State] = true;
    ARTSet64[ARTTS_Transgender] = true;
    ARTSet64[ARTTS_UK] = true;
    ARTSet64[ARTTS_USA] = true;
    ARTSet64[ARTTS_Weak_Immune] = true;
    ARTSet64[ARTTS_YourAge] = true;
    ARTSet64[ARTTS_else] = true;
    ARTSet64[ARTTS_if] = true;
    ARTSet64[ARTTS_userHealth] = true;
    ARTSet64[ARTTS_userSymptoms] = true;
    ARTSet64[ARTTS_userTravels] = true;
    ARTSet64[ARTTS_while] = true;
    ARTSet64[ARTTS__LBRACE] = true;
    ARTSet64[ARTTS__RBRACE] = true;
  }

  public void ARTSet69initialise() {
    ARTSet69 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet69, 0, artSetExtent, false);
    ARTSet69[ARTTS_if] = true;
  }

  public void ARTSet56initialise() {
    ARTSet56 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet56, 0, artSetExtent, false);
    ARTSet56[ARTTS_else] = true;
  }

  public void ARTSet41initialise() {
    ARTSet41 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet41, 0, artSetExtent, false);
    ARTSet41[ARTTS__EQUAL_EQUAL] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTX_EOS] = true;
    ARTSet16[ARTTB_ID] = true;
    ARTSet16[ARTTS__SHREIK_EQUAL] = true;
    ARTSet16[ARTTS__PERCENT] = true;
    ARTSet16[ARTTS__RPAR] = true;
    ARTSet16[ARTTS__STAR] = true;
    ARTSet16[ARTTS__STAR_STAR] = true;
    ARTSet16[ARTTS__PLUS] = true;
    ARTSet16[ARTTS__COMMA] = true;
    ARTSet16[ARTTS__MINUS] = true;
    ARTSet16[ARTTS__SLASH] = true;
    ARTSet16[ARTTS__SEMICOLON] = true;
    ARTSet16[ARTTS__LT] = true;
    ARTSet16[ARTTS__LT_EQUAL] = true;
    ARTSet16[ARTTS__EQUAL_EQUAL] = true;
    ARTSet16[ARTTS__GT] = true;
    ARTSet16[ARTTS__GT_EQUAL] = true;
    ARTSet16[ARTTS_Asthma] = true;
    ARTSet16[ARTTS_Chad] = true;
    ARTSet16[ARTTS_China] = true;
    ARTSet16[ARTTS_ConsoleLog] = true;
    ARTSet16[ARTTS_Cough] = true;
    ARTSet16[ARTTS_Country] = true;
    ARTSet16[ARTTS_Diabetic] = true;
    ARTSet16[ARTTS_Fever] = true;
    ARTSet16[ARTTS_Gender] = true;
    ARTSet16[ARTTS_HelpMeWithCovid19] = true;
    ARTSet16[ARTTS_High_Blood_Pressure] = true;
    ARTSet16[ARTTS_Italy] = true;
    ARTSet16[ARTTS_Japan] = true;
    ARTSet16[ARTTS_Shortness_Of_Breath] = true;
    ARTSet16[ARTTS_Spain] = true;
    ARTSet16[ARTTS_State] = true;
    ARTSet16[ARTTS_UK] = true;
    ARTSet16[ARTTS_USA] = true;
    ARTSet16[ARTTS_Weak_Immune] = true;
    ARTSet16[ARTTS_YourAge] = true;
    ARTSet16[ARTTS_doThis] = true;
    ARTSet16[ARTTS_else] = true;
    ARTSet16[ARTTS_if] = true;
    ARTSet16[ARTTS_runThis] = true;
    ARTSet16[ARTTS_userHealth] = true;
    ARTSet16[ARTTS_userSymptoms] = true;
    ARTSet16[ARTTS_userTravels] = true;
    ARTSet16[ARTTS_while] = true;
    ARTSet16[ARTTS__LBRACE] = true;
    ARTSet16[ARTTS__RBRACE] = true;
  }

  public void ARTSet49initialise() {
    ARTSet49 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet49, 0, artSetExtent, false);
    ARTSet49[ARTTS__PERCENT] = true;
  }

  public void ARTSet74initialise() {
    ARTSet74 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet74, 0, artSetExtent, false);
    ARTSet74[ARTTS_userTravels] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTTS_Japan] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTS_Asthma] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTX_EOS] = true;
    ARTSet5[ARTTB_ID] = true;
    ARTSet5[ARTTS_Asthma] = true;
    ARTSet5[ARTTS_Chad] = true;
    ARTSet5[ARTTS_China] = true;
    ARTSet5[ARTTS_ConsoleLog] = true;
    ARTSet5[ARTTS_Cough] = true;
    ARTSet5[ARTTS_Country] = true;
    ARTSet5[ARTTS_Diabetic] = true;
    ARTSet5[ARTTS_Fever] = true;
    ARTSet5[ARTTS_Gender] = true;
    ARTSet5[ARTTS_HelpMeWithCovid19] = true;
    ARTSet5[ARTTS_High_Blood_Pressure] = true;
    ARTSet5[ARTTS_Italy] = true;
    ARTSet5[ARTTS_Japan] = true;
    ARTSet5[ARTTS_Shortness_Of_Breath] = true;
    ARTSet5[ARTTS_Spain] = true;
    ARTSet5[ARTTS_State] = true;
    ARTSet5[ARTTS_UK] = true;
    ARTSet5[ARTTS_USA] = true;
    ARTSet5[ARTTS_Weak_Immune] = true;
    ARTSet5[ARTTS_YourAge] = true;
    ARTSet5[ARTTS_else] = true;
    ARTSet5[ARTTS_if] = true;
    ARTSet5[ARTTS_userHealth] = true;
    ARTSet5[ARTTS_userSymptoms] = true;
    ARTSet5[ARTTS_userTravels] = true;
    ARTSet5[ARTTS_while] = true;
    ARTSet5[ARTTS__LBRACE] = true;
    ARTSet5[ARTTS__RBRACE] = true;
  }

  public void ARTSet53initialise() {
    ARTSet53 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet53, 0, artSetExtent, false);
    ARTSet53[ARTTS__LPAR] = true;
  }

  public void ARTSet54initialise() {
    ARTSet54 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet54, 0, artSetExtent, false);
    ARTSet54[ARTTS__RPAR] = true;
  }

  public void ARTSet61initialise() {
    ARTSet61 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet61, 0, artSetExtent, false);
    ARTSet61[ARTTS_Transgender] = true;
  }

  public void ARTSet47initialise() {
    ARTSet47 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet47, 0, artSetExtent, false);
    ARTSet47[ARTTS__STAR] = true;
  }

  public void ARTSet72initialise() {
    ARTSet72 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet72, 0, artSetExtent, false);
    ARTSet72[ARTTS_runThis] = true;
  }

  public void ARTSet44initialise() {
    ARTSet44 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet44, 0, artSetExtent, false);
    ARTSet44[ARTTS__PLUS] = true;
  }

  public void ARTSet57initialise() {
    ARTSet57 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet57, 0, artSetExtent, false);
    ARTSet57[ARTTB_ID] = true;
    ARTSet57[ARTTS_Asthma] = true;
    ARTSet57[ARTTS_Chad] = true;
    ARTSet57[ARTTS_China] = true;
    ARTSet57[ARTTS_ConsoleLog] = true;
    ARTSet57[ARTTS_Cough] = true;
    ARTSet57[ARTTS_Country] = true;
    ARTSet57[ARTTS_Diabetic] = true;
    ARTSet57[ARTTS_Fever] = true;
    ARTSet57[ARTTS_Gender] = true;
    ARTSet57[ARTTS_HelpMeWithCovid19] = true;
    ARTSet57[ARTTS_High_Blood_Pressure] = true;
    ARTSet57[ARTTS_Italy] = true;
    ARTSet57[ARTTS_Japan] = true;
    ARTSet57[ARTTS_Shortness_Of_Breath] = true;
    ARTSet57[ARTTS_Spain] = true;
    ARTSet57[ARTTS_State] = true;
    ARTSet57[ARTTS_UK] = true;
    ARTSet57[ARTTS_USA] = true;
    ARTSet57[ARTTS_Weak_Immune] = true;
    ARTSet57[ARTTS_YourAge] = true;
    ARTSet57[ARTTS_if] = true;
    ARTSet57[ARTTS_userHealth] = true;
    ARTSet57[ARTTS_userSymptoms] = true;
    ARTSet57[ARTTS_userTravels] = true;
    ARTSet57[ARTTS_while] = true;
    ARTSet57[ARTTS__LBRACE] = true;
  }

  public void ARTSet35initialise() {
    ARTSet35 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet35, 0, artSetExtent, false);
    ARTSet35[ARTTB_ID] = true;
    ARTSet35[ARTTB_INTEGER] = true;
    ARTSet35[ARTTS__LPAR] = true;
    ARTSet35[ARTTS__PLUS] = true;
    ARTSet35[ARTTS__MINUS] = true;
  }

  public void ARTSet66initialise() {
    ARTSet66 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet66, 0, artSetExtent, false);
    ARTSet66[ARTTS__COMMA] = true;
  }

  public void ARTSet45initialise() {
    ARTSet45 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet45, 0, artSetExtent, false);
    ARTSet45[ARTTS__MINUS] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTS_State] = true;
  }

  public void ARTSet58initialise() {
    ARTSet58 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet58, 0, artSetExtent, false);
    ARTSet58[ARTTS_Female] = true;
    ARTSet58[ARTTS_Male] = true;
    ARTSet58[ARTTS_Transgender] = true;
  }

  public void ARTSet48initialise() {
    ARTSet48 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet48, 0, artSetExtent, false);
    ARTSet48[ARTTS__SLASH] = true;
  }

  public void ARTSet70initialise() {
    ARTSet70 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet70, 0, artSetExtent, false);
    ARTSet70[ARTTS_doThis] = true;
  }

  public void ARTSet34initialise() {
    ARTSet34 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet34, 0, artSetExtent, false);
    ARTSet34[ARTTS_YourAge] = true;
  }

  public void ARTSet65initialise() {
    ARTSet65 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet65, 0, artSetExtent, false);
    ARTSet65[ARTTB_ID] = true;
    ARTSet65[ARTTB_INTEGER] = true;
    ARTSet65[ARTTB_STRING_DQ] = true;
    ARTSet65[ARTTS__LPAR] = true;
    ARTSet65[ARTTS__PLUS] = true;
    ARTSet65[ARTTS__MINUS] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTB_ID] = true;
    ARTSet14[ARTTS__SHREIK_EQUAL] = true;
    ARTSet14[ARTTS__PERCENT] = true;
    ARTSet14[ARTTS__RPAR] = true;
    ARTSet14[ARTTS__STAR] = true;
    ARTSet14[ARTTS__STAR_STAR] = true;
    ARTSet14[ARTTS__PLUS] = true;
    ARTSet14[ARTTS__COMMA] = true;
    ARTSet14[ARTTS__MINUS] = true;
    ARTSet14[ARTTS__SLASH] = true;
    ARTSet14[ARTTS__SEMICOLON] = true;
    ARTSet14[ARTTS__LT] = true;
    ARTSet14[ARTTS__LT_EQUAL] = true;
    ARTSet14[ARTTS__EQUAL] = true;
    ARTSet14[ARTTS__EQUAL_EQUAL] = true;
    ARTSet14[ARTTS__GT] = true;
    ARTSet14[ARTTS__GT_EQUAL] = true;
    ARTSet14[ARTTS_Asthma] = true;
    ARTSet14[ARTTS_Chad] = true;
    ARTSet14[ARTTS_China] = true;
    ARTSet14[ARTTS_ConsoleLog] = true;
    ARTSet14[ARTTS_Cough] = true;
    ARTSet14[ARTTS_Country] = true;
    ARTSet14[ARTTS_Diabetic] = true;
    ARTSet14[ARTTS_Fever] = true;
    ARTSet14[ARTTS_Gender] = true;
    ARTSet14[ARTTS_HelpMeWithCovid19] = true;
    ARTSet14[ARTTS_High_Blood_Pressure] = true;
    ARTSet14[ARTTS_Italy] = true;
    ARTSet14[ARTTS_Japan] = true;
    ARTSet14[ARTTS_Shortness_Of_Breath] = true;
    ARTSet14[ARTTS_Spain] = true;
    ARTSet14[ARTTS_State] = true;
    ARTSet14[ARTTS_UK] = true;
    ARTSet14[ARTTS_USA] = true;
    ARTSet14[ARTTS_Weak_Immune] = true;
    ARTSet14[ARTTS_YourAge] = true;
    ARTSet14[ARTTS_doThis] = true;
    ARTSet14[ARTTS_if] = true;
    ARTSet14[ARTTS_runThis] = true;
    ARTSet14[ARTTS_userHealth] = true;
    ARTSet14[ARTTS_userSymptoms] = true;
    ARTSet14[ARTTS_userTravels] = true;
    ARTSet14[ARTTS_while] = true;
    ARTSet14[ARTTS__LBRACE] = true;
  }

  public void ARTSet63initialise() {
    ARTSet63 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet63, 0, artSetExtent, false);
    ARTSet63[ARTTS_Gender] = true;
  }

  public void ARTSet68initialise() {
    ARTSet68 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet68, 0, artSetExtent, false);
    ARTSet68[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet38initialise() {
    ARTSet38 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet38, 0, artSetExtent, false);
    ARTSet38[ARTTS__LT] = true;
  }

  public void ARTSet42initialise() {
    ARTSet42 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet42, 0, artSetExtent, false);
    ARTSet42[ARTTS__SHREIK_EQUAL] = true;
  }

  public void ARTSet67initialise() {
    ARTSet67 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet67, 0, artSetExtent, false);
    ARTSet67[ARTTS__EQUAL] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
  }

  public void ARTSet37initialise() {
    ARTSet37 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet37, 0, artSetExtent, false);
    ARTSet37[ARTTS__GT] = true;
  }

  public void ARTSet39initialise() {
    ARTSet39 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet39, 0, artSetExtent, false);
    ARTSet39[ARTTS__GT_EQUAL] = true;
  }

  public void ARTSet51initialise() {
    ARTSet51 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet51, 0, artSetExtent, false);
    ARTSet51[ARTTS__STAR_STAR] = true;
  }

  public void ARTSet80initialise() {
    ARTSet80 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet80, 0, artSetExtent, false);
    ARTSet80[ARTX_EOS] = true;
    ARTSet80[ARTTS__RBRACE] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
    ARTSet4[ARTTS_Country] = true;
  }

  public void ARTSet55initialise() {
    ARTSet55 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet55, 0, artSetExtent, false);
    ARTSet55[ARTTS_else] = true;
  }

  public void ARTSet52initialise() {
    ARTSet52 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet52, 0, artSetExtent, false);
    ARTSet52[ARTTS__SHREIK_EQUAL] = true;
    ARTSet52[ARTTS__PERCENT] = true;
    ARTSet52[ARTTS__RPAR] = true;
    ARTSet52[ARTTS__STAR] = true;
    ARTSet52[ARTTS__STAR_STAR] = true;
    ARTSet52[ARTTS__PLUS] = true;
    ARTSet52[ARTTS__COMMA] = true;
    ARTSet52[ARTTS__MINUS] = true;
    ARTSet52[ARTTS__SLASH] = true;
    ARTSet52[ARTTS__SEMICOLON] = true;
    ARTSet52[ARTTS__LT] = true;
    ARTSet52[ARTTS__LT_EQUAL] = true;
    ARTSet52[ARTTS__EQUAL_EQUAL] = true;
    ARTSet52[ARTTS__GT] = true;
    ARTSet52[ARTTS__GT_EQUAL] = true;
    ARTSet52[ARTTS_doThis] = true;
    ARTSet52[ARTTS_runThis] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTS_Cough] = true;
    ARTSet24[ARTTS_Fever] = true;
    ARTSet24[ARTTS_Shortness_Of_Breath] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTS_Chad] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTTS_Italy] = true;
  }

  public void ARTSet36initialise() {
    ARTSet36 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet36, 0, artSetExtent, false);
    ARTSet36[ARTTS__RPAR] = true;
    ARTSet36[ARTTS__COMMA] = true;
    ARTSet36[ARTTS__SEMICOLON] = true;
    ARTSet36[ARTTS_doThis] = true;
    ARTSet36[ARTTS_runThis] = true;
  }

  public void ARTSet73initialise() {
    ARTSet73 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet73, 0, artSetExtent, false);
    ARTSet73[ARTTS_userSymptoms] = true;
  }

  public void ARTSet75initialise() {
    ARTSet75 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet75, 0, artSetExtent, false);
    ARTSet75[ARTTS_userHealth] = true;
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTTS_Asthma] = true;
    ARTSet7[ARTTS_Diabetic] = true;
    ARTSet7[ARTTS_High_Blood_Pressure] = true;
    ARTSet7[ARTTS_Weak_Immune] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTTS_Asthma] = true;
    ARTSet12[ARTTS_Diabetic] = true;
    ARTSet12[ARTTS_High_Blood_Pressure] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTS_Chad] = true;
    ARTSet25[ARTTS_China] = true;
    ARTSet25[ARTTS_Italy] = true;
    ARTSet25[ARTTS_Japan] = true;
    ARTSet25[ARTTS_Spain] = true;
    ARTSet25[ARTTS_UK] = true;
    ARTSet25[ARTTS_USA] = true;
  }

  public void ARTSet76initialise() {
    ARTSet76 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet76, 0, artSetExtent, false);
    ARTSet76[ARTTS_HelpMeWithCovid19] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTS_China] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTS_Diabetic] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTS_Weak_Immune] = true;
  }

  public void ARTSet33initialise() {
    ARTSet33 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet33, 0, artSetExtent, false);
    ARTSet33[ARTTS_China] = true;
    ARTSet33[ARTTS_Italy] = true;
    ARTSet33[ARTTS_USA] = true;
  }

  public void ARTSet50initialise() {
    ARTSet50 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet50, 0, artSetExtent, false);
    ARTSet50[ARTTB_ID] = true;
    ARTSet50[ARTTB_INTEGER] = true;
    ARTSet50[ARTTS__LPAR] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTTB_ID] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTS__SLASH_SLASH] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTB_INTEGER] = true;
  }

  public void ARTSet60initialise() {
    ARTSet60 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet60, 0, artSetExtent, false);
    ARTSet60[ARTTS_Female] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTS_USA] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTS_Cough] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTTS_Spain] = true;
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTTB_STRING_DQ] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTX_EOS] = true;
    ARTSet18[ARTTB_ID] = true;
    ARTSet18[ARTTS__RPAR] = true;
    ARTSet18[ARTTS__COMMA] = true;
    ARTSet18[ARTTS_Asthma] = true;
    ARTSet18[ARTTS_Chad] = true;
    ARTSet18[ARTTS_China] = true;
    ARTSet18[ARTTS_ConsoleLog] = true;
    ARTSet18[ARTTS_Cough] = true;
    ARTSet18[ARTTS_Country] = true;
    ARTSet18[ARTTS_Diabetic] = true;
    ARTSet18[ARTTS_Fever] = true;
    ARTSet18[ARTTS_Gender] = true;
    ARTSet18[ARTTS_HelpMeWithCovid19] = true;
    ARTSet18[ARTTS_High_Blood_Pressure] = true;
    ARTSet18[ARTTS_Italy] = true;
    ARTSet18[ARTTS_Japan] = true;
    ARTSet18[ARTTS_Shortness_Of_Breath] = true;
    ARTSet18[ARTTS_Spain] = true;
    ARTSet18[ARTTS_State] = true;
    ARTSet18[ARTTS_UK] = true;
    ARTSet18[ARTTS_USA] = true;
    ARTSet18[ARTTS_Weak_Immune] = true;
    ARTSet18[ARTTS_YourAge] = true;
    ARTSet18[ARTTS_else] = true;
    ARTSet18[ARTTS_if] = true;
    ARTSet18[ARTTS_userHealth] = true;
    ARTSet18[ARTTS_userSymptoms] = true;
    ARTSet18[ARTTS_userTravels] = true;
    ARTSet18[ARTTS_while] = true;
    ARTSet18[ARTTS__LBRACE] = true;
    ARTSet18[ARTTS__RBRACE] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTS_Fever] = true;
  }

  public void ARTSet78initialise() {
    ARTSet78 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet78, 0, artSetExtent, false);
    ARTSet78[ARTTS__LBRACE] = true;
  }

  public void ARTSet79initialise() {
    ARTSet79 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet79, 0, artSetExtent, false);
    ARTSet79[ARTTS__RBRACE] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTTB_REAL] = true;
  }

  public void ARTSet40initialise() {
    ARTSet40 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet40, 0, artSetExtent, false);
    ARTSet40[ARTTS__LT_EQUAL] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet20initialise();
    ARTSet46initialise();
    ARTSet9initialise();
    ARTSet62initialise();
    ARTSet59initialise();
    ARTSet71initialise();
    ARTSet29initialise();
    ARTSet77initialise();
    ARTSet22initialise();
    ARTSet43initialise();
    ARTSet64initialise();
    ARTSet69initialise();
    ARTSet56initialise();
    ARTSet41initialise();
    ARTSet16initialise();
    ARTSet49initialise();
    ARTSet74initialise();
    ARTSet31initialise();
    ARTSet10initialise();
    ARTSet5initialise();
    ARTSet53initialise();
    ARTSet54initialise();
    ARTSet61initialise();
    ARTSet47initialise();
    ARTSet72initialise();
    ARTSet44initialise();
    ARTSet57initialise();
    ARTSet35initialise();
    ARTSet66initialise();
    ARTSet45initialise();
    ARTSet19initialise();
    ARTSet58initialise();
    ARTSet48initialise();
    ARTSet70initialise();
    ARTSet34initialise();
    ARTSet65initialise();
    ARTSet14initialise();
    ARTSet63initialise();
    ARTSet68initialise();
    ARTSet38initialise();
    ARTSet42initialise();
    ARTSet67initialise();
    ARTSet3initialise();
    ARTSet37initialise();
    ARTSet39initialise();
    ARTSet51initialise();
    ARTSet80initialise();
    ARTSet4initialise();
    ARTSet55initialise();
    ARTSet52initialise();
    ARTSet24initialise();
    ARTSet27initialise();
    ARTSet32initialise();
    ARTSet36initialise();
    ARTSet73initialise();
    ARTSet75initialise();
    ARTSet7initialise();
    ARTSet12initialise();
    ARTSet25initialise();
    ARTSet76initialise();
    ARTSet28initialise();
    ARTSet8initialise();
    ARTSet11initialise();
    ARTSet33initialise();
    ARTSet50initialise();
    ARTSet13initialise();
    ARTSet2initialise();
    ARTSet15initialise();
    ARTSet60initialise();
    ARTSet26initialise();
    ARTSet21initialise();
    ARTSet30initialise();
    ARTSet6initialise();
    ARTSet18initialise();
    ARTSet23initialise();
    ARTSet78initialise();
    ARTSet79initialise();
    ARTSet17initialise();
    ARTSet40initialise();
  }

  public void artTableInitialiser_ART_Comments() {
    artLabelInternalStrings[ARTL_ART_Comments] = "Comments";
    artLabelStrings[ARTL_ART_Comments] = "Comments";
    artKindOfs[ARTL_ART_Comments] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_Comments_362] = "Comments ::= . '//' ";
    artLabelStrings[ARTL_ART_Comments_362] = "";
    artlhsL[ARTL_ART_Comments_362] = ARTL_ART_Comments;
    artKindOfs[ARTL_ART_Comments_362] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Comments_362] = true;
    artLabelInternalStrings[ARTL_ART_Comments_363] = "Comments ::= '//' ";
    artLabelStrings[ARTL_ART_Comments_363] = "";
    artlhsL[ARTL_ART_Comments_363] = ARTL_ART_Comments;
    artPopD[ARTL_ART_Comments_363] = true;
    artLabelInternalStrings[ARTL_ART_Comments_364] = "Comments ::= '//' .";
    artLabelStrings[ARTL_ART_Comments_364] = "";
    artlhsL[ARTL_ART_Comments_364] = ARTL_ART_Comments;
    artKindOfs[ARTL_ART_Comments_364] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Comments_364] = true;
    arteoR_pL[ARTL_ART_Comments_364] = true;
    artPopD[ARTL_ART_Comments_364] = true;
  }

  public void artTableInitialiser_ART_Country() {
    artLabelInternalStrings[ARTL_ART_Country] = "Country";
    artLabelStrings[ARTL_ART_Country] = "Country";
    artKindOfs[ARTL_ART_Country] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_Country_346] = "Country ::= . 'Country' STRING_DQ ";
    artLabelStrings[ARTL_ART_Country_346] = "";
    artlhsL[ARTL_ART_Country_346] = ARTL_ART_Country;
    artKindOfs[ARTL_ART_Country_346] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_Country_347] = "Country ::= 'Country' STRING_DQ ";
    artLabelStrings[ARTL_ART_Country_347] = "";
    artlhsL[ARTL_ART_Country_347] = ARTL_ART_Country;
    artLabelInternalStrings[ARTL_ART_Country_348] = "Country ::= 'Country' . STRING_DQ ";
    artLabelStrings[ARTL_ART_Country_348] = "";
    artlhsL[ARTL_ART_Country_348] = ARTL_ART_Country;
    artKindOfs[ARTL_ART_Country_348] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_Country_348] = true;
    artLabelInternalStrings[ARTL_ART_Country_350] = "Country ::= 'Country' STRING_DQ .";
    artLabelStrings[ARTL_ART_Country_350] = "";
    artlhsL[ARTL_ART_Country_350] = ARTL_ART_Country;
    artSlotInstanceOfs[ARTL_ART_Country_350] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_Country_350] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Country_350] = true;
    arteoR_pL[ARTL_ART_Country_350] = true;
    artPopD[ARTL_ART_Country_350] = true;
  }

  public void artTableInitialiser_ART_Health() {
    artLabelInternalStrings[ARTL_ART_Health] = "Health";
    artLabelStrings[ARTL_ART_Health] = "Health";
    artKindOfs[ARTL_ART_Health] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_Health_210] = "Health ::= . 'Diabetic' ";
    artLabelStrings[ARTL_ART_Health_210] = "";
    artlhsL[ARTL_ART_Health_210] = ARTL_ART_Health;
    artKindOfs[ARTL_ART_Health_210] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Health_210] = true;
    artLabelInternalStrings[ARTL_ART_Health_211] = "Health ::= 'Diabetic' ";
    artLabelStrings[ARTL_ART_Health_211] = "";
    artlhsL[ARTL_ART_Health_211] = ARTL_ART_Health;
    artPopD[ARTL_ART_Health_211] = true;
    artLabelInternalStrings[ARTL_ART_Health_212] = "Health ::= 'Diabetic' .";
    artLabelStrings[ARTL_ART_Health_212] = "";
    artlhsL[ARTL_ART_Health_212] = ARTL_ART_Health;
    artKindOfs[ARTL_ART_Health_212] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Health_212] = true;
    arteoR_pL[ARTL_ART_Health_212] = true;
    artPopD[ARTL_ART_Health_212] = true;
    artLabelInternalStrings[ARTL_ART_Health_214] = "Health ::= . 'High_Blood_Pressure' ";
    artLabelStrings[ARTL_ART_Health_214] = "";
    artlhsL[ARTL_ART_Health_214] = ARTL_ART_Health;
    artKindOfs[ARTL_ART_Health_214] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Health_214] = true;
    artLabelInternalStrings[ARTL_ART_Health_215] = "Health ::= 'High_Blood_Pressure' ";
    artLabelStrings[ARTL_ART_Health_215] = "";
    artlhsL[ARTL_ART_Health_215] = ARTL_ART_Health;
    artPopD[ARTL_ART_Health_215] = true;
    artLabelInternalStrings[ARTL_ART_Health_216] = "Health ::= 'High_Blood_Pressure' .";
    artLabelStrings[ARTL_ART_Health_216] = "";
    artlhsL[ARTL_ART_Health_216] = ARTL_ART_Health;
    artKindOfs[ARTL_ART_Health_216] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Health_216] = true;
    arteoR_pL[ARTL_ART_Health_216] = true;
    artPopD[ARTL_ART_Health_216] = true;
    artLabelInternalStrings[ARTL_ART_Health_218] = "Health ::= . 'Asthma' ";
    artLabelStrings[ARTL_ART_Health_218] = "";
    artlhsL[ARTL_ART_Health_218] = ARTL_ART_Health;
    artKindOfs[ARTL_ART_Health_218] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Health_218] = true;
    artLabelInternalStrings[ARTL_ART_Health_219] = "Health ::= 'Asthma' ";
    artLabelStrings[ARTL_ART_Health_219] = "";
    artlhsL[ARTL_ART_Health_219] = ARTL_ART_Health;
    artPopD[ARTL_ART_Health_219] = true;
    artLabelInternalStrings[ARTL_ART_Health_220] = "Health ::= 'Asthma' .";
    artLabelStrings[ARTL_ART_Health_220] = "";
    artlhsL[ARTL_ART_Health_220] = ARTL_ART_Health;
    artKindOfs[ARTL_ART_Health_220] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Health_220] = true;
    arteoR_pL[ARTL_ART_Health_220] = true;
    artPopD[ARTL_ART_Health_220] = true;
    artLabelInternalStrings[ARTL_ART_Health_222] = "Health ::= . 'Weak_Immune' ";
    artLabelStrings[ARTL_ART_Health_222] = "";
    artlhsL[ARTL_ART_Health_222] = ARTL_ART_Health;
    artKindOfs[ARTL_ART_Health_222] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Health_222] = true;
    artLabelInternalStrings[ARTL_ART_Health_223] = "Health ::= 'Weak_Immune' ";
    artLabelStrings[ARTL_ART_Health_223] = "";
    artlhsL[ARTL_ART_Health_223] = ARTL_ART_Health;
    artPopD[ARTL_ART_Health_223] = true;
    artLabelInternalStrings[ARTL_ART_Health_224] = "Health ::= 'Weak_Immune' .";
    artLabelStrings[ARTL_ART_Health_224] = "";
    artlhsL[ARTL_ART_Health_224] = ARTL_ART_Health;
    artKindOfs[ARTL_ART_Health_224] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Health_224] = true;
    arteoR_pL[ARTL_ART_Health_224] = true;
    artPopD[ARTL_ART_Health_224] = true;
  }

  public void artTableInitialiser_ART_HealthType() {
    artLabelInternalStrings[ARTL_ART_HealthType] = "HealthType";
    artLabelStrings[ARTL_ART_HealthType] = "HealthType";
    artKindOfs[ARTL_ART_HealthType] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_HealthType_186] = "HealthType ::= . # ";
    artLabelStrings[ARTL_ART_HealthType_186] = "";
    artlhsL[ARTL_ART_HealthType_186] = ARTL_ART_HealthType;
    artKindOfs[ARTL_ART_HealthType_186] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_HealthType_186] = true;
    artLabelInternalStrings[ARTL_ART_HealthType_188] = "HealthType ::= # .";
    artLabelStrings[ARTL_ART_HealthType_188] = "";
    artlhsL[ARTL_ART_HealthType_188] = ARTL_ART_HealthType;
    artKindOfs[ARTL_ART_HealthType_188] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_HealthType_188] = true;
    arteoR_pL[ARTL_ART_HealthType_188] = true;
    artPopD[ARTL_ART_HealthType_188] = true;
    artLabelInternalStrings[ARTL_ART_HealthType_192] = "HealthType ::= . 'Diabetic' ";
    artLabelStrings[ARTL_ART_HealthType_192] = "";
    artlhsL[ARTL_ART_HealthType_192] = ARTL_ART_HealthType;
    artKindOfs[ARTL_ART_HealthType_192] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_HealthType_192] = true;
    artLabelInternalStrings[ARTL_ART_HealthType_193] = "HealthType ::= 'Diabetic' ";
    artLabelStrings[ARTL_ART_HealthType_193] = "";
    artlhsL[ARTL_ART_HealthType_193] = ARTL_ART_HealthType;
    artPopD[ARTL_ART_HealthType_193] = true;
    artLabelInternalStrings[ARTL_ART_HealthType_194] = "HealthType ::= 'Diabetic' .";
    artLabelStrings[ARTL_ART_HealthType_194] = "";
    artlhsL[ARTL_ART_HealthType_194] = ARTL_ART_HealthType;
    artKindOfs[ARTL_ART_HealthType_194] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_HealthType_194] = true;
    arteoR_pL[ARTL_ART_HealthType_194] = true;
    artPopD[ARTL_ART_HealthType_194] = true;
    artLabelInternalStrings[ARTL_ART_HealthType_198] = "HealthType ::= . 'High_Blood_Pressure' ";
    artLabelStrings[ARTL_ART_HealthType_198] = "";
    artlhsL[ARTL_ART_HealthType_198] = ARTL_ART_HealthType;
    artKindOfs[ARTL_ART_HealthType_198] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_HealthType_198] = true;
    artLabelInternalStrings[ARTL_ART_HealthType_199] = "HealthType ::= 'High_Blood_Pressure' ";
    artLabelStrings[ARTL_ART_HealthType_199] = "";
    artlhsL[ARTL_ART_HealthType_199] = ARTL_ART_HealthType;
    artPopD[ARTL_ART_HealthType_199] = true;
    artLabelInternalStrings[ARTL_ART_HealthType_200] = "HealthType ::= 'High_Blood_Pressure' .";
    artLabelStrings[ARTL_ART_HealthType_200] = "";
    artlhsL[ARTL_ART_HealthType_200] = ARTL_ART_HealthType;
    artKindOfs[ARTL_ART_HealthType_200] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_HealthType_200] = true;
    arteoR_pL[ARTL_ART_HealthType_200] = true;
    artPopD[ARTL_ART_HealthType_200] = true;
    artLabelInternalStrings[ARTL_ART_HealthType_204] = "HealthType ::= . 'Asthma' ";
    artLabelStrings[ARTL_ART_HealthType_204] = "";
    artlhsL[ARTL_ART_HealthType_204] = ARTL_ART_HealthType;
    artKindOfs[ARTL_ART_HealthType_204] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_HealthType_204] = true;
    artLabelInternalStrings[ARTL_ART_HealthType_205] = "HealthType ::= 'Asthma' ";
    artLabelStrings[ARTL_ART_HealthType_205] = "";
    artlhsL[ARTL_ART_HealthType_205] = ARTL_ART_HealthType;
    artPopD[ARTL_ART_HealthType_205] = true;
    artLabelInternalStrings[ARTL_ART_HealthType_206] = "HealthType ::= 'Asthma' .";
    artLabelStrings[ARTL_ART_HealthType_206] = "";
    artlhsL[ARTL_ART_HealthType_206] = ARTL_ART_HealthType;
    artKindOfs[ARTL_ART_HealthType_206] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_HealthType_206] = true;
    arteoR_pL[ARTL_ART_HealthType_206] = true;
    artPopD[ARTL_ART_HealthType_206] = true;
  }

  public void artTableInitialiser_ART_ID() {
    artLabelInternalStrings[ARTL_ART_ID] = "ID";
    artLabelStrings[ARTL_ART_ID] = "ID";
    artKindOfs[ARTL_ART_ID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ID_586] = "ID ::= . &ID ";
    artLabelStrings[ARTL_ART_ID_586] = "";
    artlhsL[ARTL_ART_ID_586] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_586] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ID_586] = true;
    artLabelInternalStrings[ARTL_ART_ID_587] = "ID ::= &ID ";
    artLabelStrings[ARTL_ART_ID_587] = "";
    artlhsL[ARTL_ART_ID_587] = ARTL_ART_ID;
    artPopD[ARTL_ART_ID_587] = true;
    artLabelInternalStrings[ARTL_ART_ID_588] = "ID ::= &ID .";
    artLabelStrings[ARTL_ART_ID_588] = "";
    artlhsL[ARTL_ART_ID_588] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_588] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ID_588] = true;
    arteoR_pL[ARTL_ART_ID_588] = true;
    artPopD[ARTL_ART_ID_588] = true;
  }

  public void artTableInitialiser_ART_INTEGER() {
    artLabelInternalStrings[ARTL_ART_INTEGER] = "INTEGER";
    artLabelStrings[ARTL_ART_INTEGER] = "INTEGER";
    artKindOfs[ARTL_ART_INTEGER] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_INTEGER_592] = "INTEGER ::= . &INTEGER ";
    artLabelStrings[ARTL_ART_INTEGER_592] = "";
    artlhsL[ARTL_ART_INTEGER_592] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_592] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_INTEGER_592] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_593] = "INTEGER ::= &INTEGER ";
    artLabelStrings[ARTL_ART_INTEGER_593] = "";
    artlhsL[ARTL_ART_INTEGER_593] = ARTL_ART_INTEGER;
    artPopD[ARTL_ART_INTEGER_593] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_594] = "INTEGER ::= &INTEGER .";
    artLabelStrings[ARTL_ART_INTEGER_594] = "";
    artlhsL[ARTL_ART_INTEGER_594] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_594] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_INTEGER_594] = true;
    arteoR_pL[ARTL_ART_INTEGER_594] = true;
    artPopD[ARTL_ART_INTEGER_594] = true;
  }

  public void artTableInitialiser_ART_REAL() {
    artLabelInternalStrings[ARTL_ART_REAL] = "REAL";
    artLabelStrings[ARTL_ART_REAL] = "REAL";
    artKindOfs[ARTL_ART_REAL] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_REAL_598] = "REAL ::= . &REAL ";
    artLabelStrings[ARTL_ART_REAL_598] = "";
    artlhsL[ARTL_ART_REAL_598] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_598] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_REAL_598] = true;
    artLabelInternalStrings[ARTL_ART_REAL_599] = "REAL ::= &REAL ";
    artLabelStrings[ARTL_ART_REAL_599] = "";
    artlhsL[ARTL_ART_REAL_599] = ARTL_ART_REAL;
    artPopD[ARTL_ART_REAL_599] = true;
    artLabelInternalStrings[ARTL_ART_REAL_600] = "REAL ::= &REAL .";
    artLabelStrings[ARTL_ART_REAL_600] = "";
    artlhsL[ARTL_ART_REAL_600] = ARTL_ART_REAL;
    artKindOfs[ARTL_ART_REAL_600] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_REAL_600] = true;
    arteoR_pL[ARTL_ART_REAL_600] = true;
    artPopD[ARTL_ART_REAL_600] = true;
  }

  public void artTableInitialiser_ART_STRING_DQ() {
    artLabelInternalStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artLabelStrings[ARTL_ART_STRING_DQ] = "STRING_DQ";
    artKindOfs[ARTL_ART_STRING_DQ] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_604] = "STRING_DQ ::= . &STRING_DQ ";
    artLabelStrings[ARTL_ART_STRING_DQ_604] = "";
    artlhsL[ARTL_ART_STRING_DQ_604] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_604] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_STRING_DQ_604] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_605] = "STRING_DQ ::= &STRING_DQ ";
    artLabelStrings[ARTL_ART_STRING_DQ_605] = "";
    artlhsL[ARTL_ART_STRING_DQ_605] = ARTL_ART_STRING_DQ;
    artPopD[ARTL_ART_STRING_DQ_605] = true;
    artLabelInternalStrings[ARTL_ART_STRING_DQ_606] = "STRING_DQ ::= &STRING_DQ .";
    artLabelStrings[ARTL_ART_STRING_DQ_606] = "";
    artlhsL[ARTL_ART_STRING_DQ_606] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_STRING_DQ_606] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_STRING_DQ_606] = true;
    arteoR_pL[ARTL_ART_STRING_DQ_606] = true;
    artPopD[ARTL_ART_STRING_DQ_606] = true;
  }

  public void artTableInitialiser_ART_State() {
    artLabelInternalStrings[ARTL_ART_State] = "State";
    artLabelStrings[ARTL_ART_State] = "State";
    artKindOfs[ARTL_ART_State] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_State_354] = "State ::= . 'State' STRING_DQ ";
    artLabelStrings[ARTL_ART_State_354] = "";
    artlhsL[ARTL_ART_State_354] = ARTL_ART_State;
    artKindOfs[ARTL_ART_State_354] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_State_355] = "State ::= 'State' STRING_DQ ";
    artLabelStrings[ARTL_ART_State_355] = "";
    artlhsL[ARTL_ART_State_355] = ARTL_ART_State;
    artLabelInternalStrings[ARTL_ART_State_356] = "State ::= 'State' . STRING_DQ ";
    artLabelStrings[ARTL_ART_State_356] = "";
    artlhsL[ARTL_ART_State_356] = ARTL_ART_State;
    artKindOfs[ARTL_ART_State_356] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_State_356] = true;
    artLabelInternalStrings[ARTL_ART_State_358] = "State ::= 'State' STRING_DQ .";
    artLabelStrings[ARTL_ART_State_358] = "";
    artlhsL[ARTL_ART_State_358] = ARTL_ART_State;
    artSlotInstanceOfs[ARTL_ART_State_358] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_State_358] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_State_358] = true;
    arteoR_pL[ARTL_ART_State_358] = true;
    artPopD[ARTL_ART_State_358] = true;
  }

  public void artTableInitialiser_ART_Symptoms() {
    artLabelInternalStrings[ARTL_ART_Symptoms] = "Symptoms";
    artLabelStrings[ARTL_ART_Symptoms] = "Symptoms";
    artKindOfs[ARTL_ART_Symptoms] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_Symptoms_250] = "Symptoms ::= . 'Cough' ";
    artLabelStrings[ARTL_ART_Symptoms_250] = "";
    artlhsL[ARTL_ART_Symptoms_250] = ARTL_ART_Symptoms;
    artKindOfs[ARTL_ART_Symptoms_250] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Symptoms_250] = true;
    artLabelInternalStrings[ARTL_ART_Symptoms_251] = "Symptoms ::= 'Cough' ";
    artLabelStrings[ARTL_ART_Symptoms_251] = "";
    artlhsL[ARTL_ART_Symptoms_251] = ARTL_ART_Symptoms;
    artPopD[ARTL_ART_Symptoms_251] = true;
    artLabelInternalStrings[ARTL_ART_Symptoms_252] = "Symptoms ::= 'Cough' .";
    artLabelStrings[ARTL_ART_Symptoms_252] = "";
    artlhsL[ARTL_ART_Symptoms_252] = ARTL_ART_Symptoms;
    artKindOfs[ARTL_ART_Symptoms_252] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Symptoms_252] = true;
    arteoR_pL[ARTL_ART_Symptoms_252] = true;
    artPopD[ARTL_ART_Symptoms_252] = true;
    artLabelInternalStrings[ARTL_ART_Symptoms_254] = "Symptoms ::= . 'Shortness_Of_Breath' ";
    artLabelStrings[ARTL_ART_Symptoms_254] = "";
    artlhsL[ARTL_ART_Symptoms_254] = ARTL_ART_Symptoms;
    artKindOfs[ARTL_ART_Symptoms_254] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Symptoms_254] = true;
    artLabelInternalStrings[ARTL_ART_Symptoms_255] = "Symptoms ::= 'Shortness_Of_Breath' ";
    artLabelStrings[ARTL_ART_Symptoms_255] = "";
    artlhsL[ARTL_ART_Symptoms_255] = ARTL_ART_Symptoms;
    artPopD[ARTL_ART_Symptoms_255] = true;
    artLabelInternalStrings[ARTL_ART_Symptoms_256] = "Symptoms ::= 'Shortness_Of_Breath' .";
    artLabelStrings[ARTL_ART_Symptoms_256] = "";
    artlhsL[ARTL_ART_Symptoms_256] = ARTL_ART_Symptoms;
    artKindOfs[ARTL_ART_Symptoms_256] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Symptoms_256] = true;
    arteoR_pL[ARTL_ART_Symptoms_256] = true;
    artPopD[ARTL_ART_Symptoms_256] = true;
    artLabelInternalStrings[ARTL_ART_Symptoms_258] = "Symptoms ::= . 'Fever' ";
    artLabelStrings[ARTL_ART_Symptoms_258] = "";
    artlhsL[ARTL_ART_Symptoms_258] = ARTL_ART_Symptoms;
    artKindOfs[ARTL_ART_Symptoms_258] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Symptoms_258] = true;
    artLabelInternalStrings[ARTL_ART_Symptoms_259] = "Symptoms ::= 'Fever' ";
    artLabelStrings[ARTL_ART_Symptoms_259] = "";
    artlhsL[ARTL_ART_Symptoms_259] = ARTL_ART_Symptoms;
    artPopD[ARTL_ART_Symptoms_259] = true;
    artLabelInternalStrings[ARTL_ART_Symptoms_260] = "Symptoms ::= 'Fever' .";
    artLabelStrings[ARTL_ART_Symptoms_260] = "";
    artlhsL[ARTL_ART_Symptoms_260] = ARTL_ART_Symptoms;
    artKindOfs[ARTL_ART_Symptoms_260] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Symptoms_260] = true;
    arteoR_pL[ARTL_ART_Symptoms_260] = true;
    artPopD[ARTL_ART_Symptoms_260] = true;
  }

  public void artTableInitialiser_ART_SymptomsType() {
    artLabelInternalStrings[ARTL_ART_SymptomsType] = "SymptomsType";
    artLabelStrings[ARTL_ART_SymptomsType] = "SymptomsType";
    artKindOfs[ARTL_ART_SymptomsType] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_SymptomsType_262] = "SymptomsType ::= . # ";
    artLabelStrings[ARTL_ART_SymptomsType_262] = "";
    artlhsL[ARTL_ART_SymptomsType_262] = ARTL_ART_SymptomsType;
    artKindOfs[ARTL_ART_SymptomsType_262] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_SymptomsType_262] = true;
    artLabelInternalStrings[ARTL_ART_SymptomsType_264] = "SymptomsType ::= # .";
    artLabelStrings[ARTL_ART_SymptomsType_264] = "";
    artlhsL[ARTL_ART_SymptomsType_264] = ARTL_ART_SymptomsType;
    artKindOfs[ARTL_ART_SymptomsType_264] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_SymptomsType_264] = true;
    arteoR_pL[ARTL_ART_SymptomsType_264] = true;
    artPopD[ARTL_ART_SymptomsType_264] = true;
    artLabelInternalStrings[ARTL_ART_SymptomsType_268] = "SymptomsType ::= . 'Cough' ";
    artLabelStrings[ARTL_ART_SymptomsType_268] = "";
    artlhsL[ARTL_ART_SymptomsType_268] = ARTL_ART_SymptomsType;
    artKindOfs[ARTL_ART_SymptomsType_268] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_SymptomsType_268] = true;
    artLabelInternalStrings[ARTL_ART_SymptomsType_269] = "SymptomsType ::= 'Cough' ";
    artLabelStrings[ARTL_ART_SymptomsType_269] = "";
    artlhsL[ARTL_ART_SymptomsType_269] = ARTL_ART_SymptomsType;
    artPopD[ARTL_ART_SymptomsType_269] = true;
    artLabelInternalStrings[ARTL_ART_SymptomsType_270] = "SymptomsType ::= 'Cough' .";
    artLabelStrings[ARTL_ART_SymptomsType_270] = "";
    artlhsL[ARTL_ART_SymptomsType_270] = ARTL_ART_SymptomsType;
    artKindOfs[ARTL_ART_SymptomsType_270] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_SymptomsType_270] = true;
    arteoR_pL[ARTL_ART_SymptomsType_270] = true;
    artPopD[ARTL_ART_SymptomsType_270] = true;
    artLabelInternalStrings[ARTL_ART_SymptomsType_274] = "SymptomsType ::= . 'Shortness_Of_Breath' ";
    artLabelStrings[ARTL_ART_SymptomsType_274] = "";
    artlhsL[ARTL_ART_SymptomsType_274] = ARTL_ART_SymptomsType;
    artKindOfs[ARTL_ART_SymptomsType_274] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_SymptomsType_274] = true;
    artLabelInternalStrings[ARTL_ART_SymptomsType_275] = "SymptomsType ::= 'Shortness_Of_Breath' ";
    artLabelStrings[ARTL_ART_SymptomsType_275] = "";
    artlhsL[ARTL_ART_SymptomsType_275] = ARTL_ART_SymptomsType;
    artPopD[ARTL_ART_SymptomsType_275] = true;
    artLabelInternalStrings[ARTL_ART_SymptomsType_276] = "SymptomsType ::= 'Shortness_Of_Breath' .";
    artLabelStrings[ARTL_ART_SymptomsType_276] = "";
    artlhsL[ARTL_ART_SymptomsType_276] = ARTL_ART_SymptomsType;
    artKindOfs[ARTL_ART_SymptomsType_276] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_SymptomsType_276] = true;
    arteoR_pL[ARTL_ART_SymptomsType_276] = true;
    artPopD[ARTL_ART_SymptomsType_276] = true;
    artLabelInternalStrings[ARTL_ART_SymptomsType_280] = "SymptomsType ::= . 'Fever' ";
    artLabelStrings[ARTL_ART_SymptomsType_280] = "";
    artlhsL[ARTL_ART_SymptomsType_280] = ARTL_ART_SymptomsType;
    artKindOfs[ARTL_ART_SymptomsType_280] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_SymptomsType_280] = true;
    artLabelInternalStrings[ARTL_ART_SymptomsType_281] = "SymptomsType ::= 'Fever' ";
    artLabelStrings[ARTL_ART_SymptomsType_281] = "";
    artlhsL[ARTL_ART_SymptomsType_281] = ARTL_ART_SymptomsType;
    artPopD[ARTL_ART_SymptomsType_281] = true;
    artLabelInternalStrings[ARTL_ART_SymptomsType_282] = "SymptomsType ::= 'Fever' .";
    artLabelStrings[ARTL_ART_SymptomsType_282] = "";
    artlhsL[ARTL_ART_SymptomsType_282] = ARTL_ART_SymptomsType;
    artKindOfs[ARTL_ART_SymptomsType_282] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_SymptomsType_282] = true;
    arteoR_pL[ARTL_ART_SymptomsType_282] = true;
    artPopD[ARTL_ART_SymptomsType_282] = true;
  }

  public void artTableInitialiser_ART_Travels() {
    artLabelInternalStrings[ARTL_ART_Travels] = "Travels";
    artLabelStrings[ARTL_ART_Travels] = "Travels";
    artKindOfs[ARTL_ART_Travels] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_Travels_286] = "Travels ::= . 'USA' ";
    artLabelStrings[ARTL_ART_Travels_286] = "";
    artlhsL[ARTL_ART_Travels_286] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_286] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Travels_286] = true;
    artLabelInternalStrings[ARTL_ART_Travels_287] = "Travels ::= 'USA' ";
    artLabelStrings[ARTL_ART_Travels_287] = "";
    artlhsL[ARTL_ART_Travels_287] = ARTL_ART_Travels;
    artPopD[ARTL_ART_Travels_287] = true;
    artLabelInternalStrings[ARTL_ART_Travels_288] = "Travels ::= 'USA' .";
    artLabelStrings[ARTL_ART_Travels_288] = "";
    artlhsL[ARTL_ART_Travels_288] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_288] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Travels_288] = true;
    arteoR_pL[ARTL_ART_Travels_288] = true;
    artPopD[ARTL_ART_Travels_288] = true;
    artLabelInternalStrings[ARTL_ART_Travels_290] = "Travels ::= . 'Chad' ";
    artLabelStrings[ARTL_ART_Travels_290] = "";
    artlhsL[ARTL_ART_Travels_290] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_290] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Travels_290] = true;
    artLabelInternalStrings[ARTL_ART_Travels_291] = "Travels ::= 'Chad' ";
    artLabelStrings[ARTL_ART_Travels_291] = "";
    artlhsL[ARTL_ART_Travels_291] = ARTL_ART_Travels;
    artPopD[ARTL_ART_Travels_291] = true;
    artLabelInternalStrings[ARTL_ART_Travels_292] = "Travels ::= 'Chad' .";
    artLabelStrings[ARTL_ART_Travels_292] = "";
    artlhsL[ARTL_ART_Travels_292] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_292] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Travels_292] = true;
    arteoR_pL[ARTL_ART_Travels_292] = true;
    artPopD[ARTL_ART_Travels_292] = true;
    artLabelInternalStrings[ARTL_ART_Travels_294] = "Travels ::= . 'China' ";
    artLabelStrings[ARTL_ART_Travels_294] = "";
    artlhsL[ARTL_ART_Travels_294] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_294] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Travels_294] = true;
    artLabelInternalStrings[ARTL_ART_Travels_295] = "Travels ::= 'China' ";
    artLabelStrings[ARTL_ART_Travels_295] = "";
    artlhsL[ARTL_ART_Travels_295] = ARTL_ART_Travels;
    artPopD[ARTL_ART_Travels_295] = true;
    artLabelInternalStrings[ARTL_ART_Travels_296] = "Travels ::= 'China' .";
    artLabelStrings[ARTL_ART_Travels_296] = "";
    artlhsL[ARTL_ART_Travels_296] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_296] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Travels_296] = true;
    arteoR_pL[ARTL_ART_Travels_296] = true;
    artPopD[ARTL_ART_Travels_296] = true;
    artLabelInternalStrings[ARTL_ART_Travels_298] = "Travels ::= . 'UK' ";
    artLabelStrings[ARTL_ART_Travels_298] = "";
    artlhsL[ARTL_ART_Travels_298] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_298] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Travels_298] = true;
    artLabelInternalStrings[ARTL_ART_Travels_299] = "Travels ::= 'UK' ";
    artLabelStrings[ARTL_ART_Travels_299] = "";
    artlhsL[ARTL_ART_Travels_299] = ARTL_ART_Travels;
    artPopD[ARTL_ART_Travels_299] = true;
    artLabelInternalStrings[ARTL_ART_Travels_300] = "Travels ::= 'UK' .";
    artLabelStrings[ARTL_ART_Travels_300] = "";
    artlhsL[ARTL_ART_Travels_300] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_300] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Travels_300] = true;
    arteoR_pL[ARTL_ART_Travels_300] = true;
    artPopD[ARTL_ART_Travels_300] = true;
    artLabelInternalStrings[ARTL_ART_Travels_302] = "Travels ::= . 'Spain' ";
    artLabelStrings[ARTL_ART_Travels_302] = "";
    artlhsL[ARTL_ART_Travels_302] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_302] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Travels_302] = true;
    artLabelInternalStrings[ARTL_ART_Travels_303] = "Travels ::= 'Spain' ";
    artLabelStrings[ARTL_ART_Travels_303] = "";
    artlhsL[ARTL_ART_Travels_303] = ARTL_ART_Travels;
    artPopD[ARTL_ART_Travels_303] = true;
    artLabelInternalStrings[ARTL_ART_Travels_304] = "Travels ::= 'Spain' .";
    artLabelStrings[ARTL_ART_Travels_304] = "";
    artlhsL[ARTL_ART_Travels_304] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_304] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Travels_304] = true;
    arteoR_pL[ARTL_ART_Travels_304] = true;
    artPopD[ARTL_ART_Travels_304] = true;
    artLabelInternalStrings[ARTL_ART_Travels_306] = "Travels ::= . 'Japan' ";
    artLabelStrings[ARTL_ART_Travels_306] = "";
    artlhsL[ARTL_ART_Travels_306] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_306] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Travels_306] = true;
    artLabelInternalStrings[ARTL_ART_Travels_307] = "Travels ::= 'Japan' ";
    artLabelStrings[ARTL_ART_Travels_307] = "";
    artlhsL[ARTL_ART_Travels_307] = ARTL_ART_Travels;
    artPopD[ARTL_ART_Travels_307] = true;
    artLabelInternalStrings[ARTL_ART_Travels_308] = "Travels ::= 'Japan' .";
    artLabelStrings[ARTL_ART_Travels_308] = "";
    artlhsL[ARTL_ART_Travels_308] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_308] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Travels_308] = true;
    arteoR_pL[ARTL_ART_Travels_308] = true;
    artPopD[ARTL_ART_Travels_308] = true;
    artLabelInternalStrings[ARTL_ART_Travels_310] = "Travels ::= . 'Italy' ";
    artLabelStrings[ARTL_ART_Travels_310] = "";
    artlhsL[ARTL_ART_Travels_310] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_310] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_Travels_310] = true;
    artLabelInternalStrings[ARTL_ART_Travels_311] = "Travels ::= 'Italy' ";
    artLabelStrings[ARTL_ART_Travels_311] = "";
    artlhsL[ARTL_ART_Travels_311] = ARTL_ART_Travels;
    artPopD[ARTL_ART_Travels_311] = true;
    artLabelInternalStrings[ARTL_ART_Travels_312] = "Travels ::= 'Italy' .";
    artLabelStrings[ARTL_ART_Travels_312] = "";
    artlhsL[ARTL_ART_Travels_312] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_Travels_312] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Travels_312] = true;
    arteoR_pL[ARTL_ART_Travels_312] = true;
    artPopD[ARTL_ART_Travels_312] = true;
  }

  public void artTableInitialiser_ART_TravelsType() {
    artLabelInternalStrings[ARTL_ART_TravelsType] = "TravelsType";
    artLabelStrings[ARTL_ART_TravelsType] = "TravelsType";
    artKindOfs[ARTL_ART_TravelsType] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_TravelsType_314] = "TravelsType ::= . # ";
    artLabelStrings[ARTL_ART_TravelsType_314] = "";
    artlhsL[ARTL_ART_TravelsType_314] = ARTL_ART_TravelsType;
    artKindOfs[ARTL_ART_TravelsType_314] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_TravelsType_314] = true;
    artLabelInternalStrings[ARTL_ART_TravelsType_316] = "TravelsType ::= # .";
    artLabelStrings[ARTL_ART_TravelsType_316] = "";
    artlhsL[ARTL_ART_TravelsType_316] = ARTL_ART_TravelsType;
    artKindOfs[ARTL_ART_TravelsType_316] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_TravelsType_316] = true;
    arteoR_pL[ARTL_ART_TravelsType_316] = true;
    artPopD[ARTL_ART_TravelsType_316] = true;
    artLabelInternalStrings[ARTL_ART_TravelsType_320] = "TravelsType ::= . 'USA' ";
    artLabelStrings[ARTL_ART_TravelsType_320] = "";
    artlhsL[ARTL_ART_TravelsType_320] = ARTL_ART_TravelsType;
    artKindOfs[ARTL_ART_TravelsType_320] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_TravelsType_320] = true;
    artLabelInternalStrings[ARTL_ART_TravelsType_321] = "TravelsType ::= 'USA' ";
    artLabelStrings[ARTL_ART_TravelsType_321] = "";
    artlhsL[ARTL_ART_TravelsType_321] = ARTL_ART_TravelsType;
    artPopD[ARTL_ART_TravelsType_321] = true;
    artLabelInternalStrings[ARTL_ART_TravelsType_322] = "TravelsType ::= 'USA' .";
    artLabelStrings[ARTL_ART_TravelsType_322] = "";
    artlhsL[ARTL_ART_TravelsType_322] = ARTL_ART_TravelsType;
    artKindOfs[ARTL_ART_TravelsType_322] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_TravelsType_322] = true;
    arteoR_pL[ARTL_ART_TravelsType_322] = true;
    artPopD[ARTL_ART_TravelsType_322] = true;
    artLabelInternalStrings[ARTL_ART_TravelsType_326] = "TravelsType ::= . 'Italy' ";
    artLabelStrings[ARTL_ART_TravelsType_326] = "";
    artlhsL[ARTL_ART_TravelsType_326] = ARTL_ART_TravelsType;
    artKindOfs[ARTL_ART_TravelsType_326] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_TravelsType_326] = true;
    artLabelInternalStrings[ARTL_ART_TravelsType_327] = "TravelsType ::= 'Italy' ";
    artLabelStrings[ARTL_ART_TravelsType_327] = "";
    artlhsL[ARTL_ART_TravelsType_327] = ARTL_ART_TravelsType;
    artPopD[ARTL_ART_TravelsType_327] = true;
    artLabelInternalStrings[ARTL_ART_TravelsType_328] = "TravelsType ::= 'Italy' .";
    artLabelStrings[ARTL_ART_TravelsType_328] = "";
    artlhsL[ARTL_ART_TravelsType_328] = ARTL_ART_TravelsType;
    artKindOfs[ARTL_ART_TravelsType_328] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_TravelsType_328] = true;
    arteoR_pL[ARTL_ART_TravelsType_328] = true;
    artPopD[ARTL_ART_TravelsType_328] = true;
    artLabelInternalStrings[ARTL_ART_TravelsType_332] = "TravelsType ::= . 'China' ";
    artLabelStrings[ARTL_ART_TravelsType_332] = "";
    artlhsL[ARTL_ART_TravelsType_332] = ARTL_ART_TravelsType;
    artKindOfs[ARTL_ART_TravelsType_332] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_TravelsType_332] = true;
    artLabelInternalStrings[ARTL_ART_TravelsType_333] = "TravelsType ::= 'China' ";
    artLabelStrings[ARTL_ART_TravelsType_333] = "";
    artlhsL[ARTL_ART_TravelsType_333] = ARTL_ART_TravelsType;
    artPopD[ARTL_ART_TravelsType_333] = true;
    artLabelInternalStrings[ARTL_ART_TravelsType_334] = "TravelsType ::= 'China' .";
    artLabelStrings[ARTL_ART_TravelsType_334] = "";
    artlhsL[ARTL_ART_TravelsType_334] = ARTL_ART_TravelsType;
    artKindOfs[ARTL_ART_TravelsType_334] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_TravelsType_334] = true;
    arteoR_pL[ARTL_ART_TravelsType_334] = true;
    artPopD[ARTL_ART_TravelsType_334] = true;
  }

  public void artTableInitialiser_ART_YourAge() {
    artLabelInternalStrings[ARTL_ART_YourAge] = "YourAge";
    artLabelStrings[ARTL_ART_YourAge] = "YourAge";
    artKindOfs[ARTL_ART_YourAge] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_YourAge_338] = "YourAge ::= . 'YourAge' INTEGER ";
    artLabelStrings[ARTL_ART_YourAge_338] = "";
    artlhsL[ARTL_ART_YourAge_338] = ARTL_ART_YourAge;
    artKindOfs[ARTL_ART_YourAge_338] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_YourAge_339] = "YourAge ::= 'YourAge' INTEGER ";
    artLabelStrings[ARTL_ART_YourAge_339] = "";
    artlhsL[ARTL_ART_YourAge_339] = ARTL_ART_YourAge;
    artLabelInternalStrings[ARTL_ART_YourAge_340] = "YourAge ::= 'YourAge' . INTEGER ";
    artLabelStrings[ARTL_ART_YourAge_340] = "";
    artlhsL[ARTL_ART_YourAge_340] = ARTL_ART_YourAge;
    artKindOfs[ARTL_ART_YourAge_340] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_YourAge_340] = true;
    artLabelInternalStrings[ARTL_ART_YourAge_342] = "YourAge ::= 'YourAge' INTEGER .";
    artLabelStrings[ARTL_ART_YourAge_342] = "";
    artlhsL[ARTL_ART_YourAge_342] = ARTL_ART_YourAge;
    artSlotInstanceOfs[ARTL_ART_YourAge_342] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_YourAge_342] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_YourAge_342] = true;
    arteoR_pL[ARTL_ART_YourAge_342] = true;
    artPopD[ARTL_ART_YourAge_342] = true;
  }

  public void artTableInitialiser_ART_e0() {
    artLabelInternalStrings[ARTL_ART_e0] = "e0";
    artLabelStrings[ARTL_ART_e0] = "e0";
    artKindOfs[ARTL_ART_e0] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e0_398] = "e0 ::= . e1 ";
    artLabelStrings[ARTL_ART_e0_398] = "";
    artlhsL[ARTL_ART_e0_398] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_398] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_400] = "e0 ::= e1 .";
    artLabelStrings[ARTL_ART_e0_400] = "";
    artlhsL[ARTL_ART_e0_400] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_400] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_400] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_400] = true;
    arteoR_pL[ARTL_ART_e0_400] = true;
    artPopD[ARTL_ART_e0_400] = true;
    artLabelInternalStrings[ARTL_ART_e0_404] = "e0 ::= . e1 '>' e1 ";
    artLabelStrings[ARTL_ART_e0_404] = "";
    artlhsL[ARTL_ART_e0_404] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_404] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_406] = "e0 ::= e1 . '>' e1 ";
    artLabelStrings[ARTL_ART_e0_406] = "";
    artlhsL[ARTL_ART_e0_406] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_406] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_406] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_406] = true;
    artLabelInternalStrings[ARTL_ART_e0_407] = "e0 ::= e1 '>' e1 ";
    artLabelStrings[ARTL_ART_e0_407] = "";
    artlhsL[ARTL_ART_e0_407] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_408] = "e0 ::= e1 '>' . e1 ";
    artLabelStrings[ARTL_ART_e0_408] = "";
    artlhsL[ARTL_ART_e0_408] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_408] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_410] = "e0 ::= e1 '>' e1 .";
    artLabelStrings[ARTL_ART_e0_410] = "";
    artlhsL[ARTL_ART_e0_410] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_410] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_410] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_410] = true;
    arteoR_pL[ARTL_ART_e0_410] = true;
    artPopD[ARTL_ART_e0_410] = true;
    artLabelInternalStrings[ARTL_ART_e0_414] = "e0 ::= . e1 '<' e1 ";
    artLabelStrings[ARTL_ART_e0_414] = "";
    artlhsL[ARTL_ART_e0_414] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_414] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_416] = "e0 ::= e1 . '<' e1 ";
    artLabelStrings[ARTL_ART_e0_416] = "";
    artlhsL[ARTL_ART_e0_416] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_416] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_416] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_416] = true;
    artLabelInternalStrings[ARTL_ART_e0_417] = "e0 ::= e1 '<' e1 ";
    artLabelStrings[ARTL_ART_e0_417] = "";
    artlhsL[ARTL_ART_e0_417] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_418] = "e0 ::= e1 '<' . e1 ";
    artLabelStrings[ARTL_ART_e0_418] = "";
    artlhsL[ARTL_ART_e0_418] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_418] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_420] = "e0 ::= e1 '<' e1 .";
    artLabelStrings[ARTL_ART_e0_420] = "";
    artlhsL[ARTL_ART_e0_420] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_420] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_420] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_420] = true;
    arteoR_pL[ARTL_ART_e0_420] = true;
    artPopD[ARTL_ART_e0_420] = true;
    artLabelInternalStrings[ARTL_ART_e0_424] = "e0 ::= . e1 '>=' e1 ";
    artLabelStrings[ARTL_ART_e0_424] = "";
    artlhsL[ARTL_ART_e0_424] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_424] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_426] = "e0 ::= e1 . '>=' e1 ";
    artLabelStrings[ARTL_ART_e0_426] = "";
    artlhsL[ARTL_ART_e0_426] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_426] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_426] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_426] = true;
    artLabelInternalStrings[ARTL_ART_e0_427] = "e0 ::= e1 '>=' e1 ";
    artLabelStrings[ARTL_ART_e0_427] = "";
    artlhsL[ARTL_ART_e0_427] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_428] = "e0 ::= e1 '>=' . e1 ";
    artLabelStrings[ARTL_ART_e0_428] = "";
    artlhsL[ARTL_ART_e0_428] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_428] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_430] = "e0 ::= e1 '>=' e1 .";
    artLabelStrings[ARTL_ART_e0_430] = "";
    artlhsL[ARTL_ART_e0_430] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_430] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_430] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_430] = true;
    arteoR_pL[ARTL_ART_e0_430] = true;
    artPopD[ARTL_ART_e0_430] = true;
    artLabelInternalStrings[ARTL_ART_e0_434] = "e0 ::= . e1 '<=' e1 ";
    artLabelStrings[ARTL_ART_e0_434] = "";
    artlhsL[ARTL_ART_e0_434] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_434] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_436] = "e0 ::= e1 . '<=' e1 ";
    artLabelStrings[ARTL_ART_e0_436] = "";
    artlhsL[ARTL_ART_e0_436] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_436] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_436] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_436] = true;
    artLabelInternalStrings[ARTL_ART_e0_437] = "e0 ::= e1 '<=' e1 ";
    artLabelStrings[ARTL_ART_e0_437] = "";
    artlhsL[ARTL_ART_e0_437] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_438] = "e0 ::= e1 '<=' . e1 ";
    artLabelStrings[ARTL_ART_e0_438] = "";
    artlhsL[ARTL_ART_e0_438] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_438] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_440] = "e0 ::= e1 '<=' e1 .";
    artLabelStrings[ARTL_ART_e0_440] = "";
    artlhsL[ARTL_ART_e0_440] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_440] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_440] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_440] = true;
    arteoR_pL[ARTL_ART_e0_440] = true;
    artPopD[ARTL_ART_e0_440] = true;
    artLabelInternalStrings[ARTL_ART_e0_444] = "e0 ::= . e1 '==' e1 ";
    artLabelStrings[ARTL_ART_e0_444] = "";
    artlhsL[ARTL_ART_e0_444] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_444] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_446] = "e0 ::= e1 . '==' e1 ";
    artLabelStrings[ARTL_ART_e0_446] = "";
    artlhsL[ARTL_ART_e0_446] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_446] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_446] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_446] = true;
    artLabelInternalStrings[ARTL_ART_e0_447] = "e0 ::= e1 '==' e1 ";
    artLabelStrings[ARTL_ART_e0_447] = "";
    artlhsL[ARTL_ART_e0_447] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_448] = "e0 ::= e1 '==' . e1 ";
    artLabelStrings[ARTL_ART_e0_448] = "";
    artlhsL[ARTL_ART_e0_448] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_448] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_450] = "e0 ::= e1 '==' e1 .";
    artLabelStrings[ARTL_ART_e0_450] = "";
    artlhsL[ARTL_ART_e0_450] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_450] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_450] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_450] = true;
    arteoR_pL[ARTL_ART_e0_450] = true;
    artPopD[ARTL_ART_e0_450] = true;
    artLabelInternalStrings[ARTL_ART_e0_454] = "e0 ::= . e1 '!=' e1 ";
    artLabelStrings[ARTL_ART_e0_454] = "";
    artlhsL[ARTL_ART_e0_454] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_454] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_456] = "e0 ::= e1 . '!=' e1 ";
    artLabelStrings[ARTL_ART_e0_456] = "";
    artlhsL[ARTL_ART_e0_456] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_456] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_456] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e0_456] = true;
    artLabelInternalStrings[ARTL_ART_e0_457] = "e0 ::= e1 '!=' e1 ";
    artLabelStrings[ARTL_ART_e0_457] = "";
    artlhsL[ARTL_ART_e0_457] = ARTL_ART_e0;
    artLabelInternalStrings[ARTL_ART_e0_458] = "e0 ::= e1 '!=' . e1 ";
    artLabelStrings[ARTL_ART_e0_458] = "";
    artlhsL[ARTL_ART_e0_458] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_e0_458] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e0_460] = "e0 ::= e1 '!=' e1 .";
    artLabelStrings[ARTL_ART_e0_460] = "";
    artlhsL[ARTL_ART_e0_460] = ARTL_ART_e0;
    artSlotInstanceOfs[ARTL_ART_e0_460] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e0_460] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e0_460] = true;
    arteoR_pL[ARTL_ART_e0_460] = true;
    artPopD[ARTL_ART_e0_460] = true;
  }

  public void artTableInitialiser_ART_e1() {
    artLabelInternalStrings[ARTL_ART_e1] = "e1";
    artLabelStrings[ARTL_ART_e1] = "e1";
    artKindOfs[ARTL_ART_e1] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e1_464] = "e1 ::= . e2 ";
    artLabelStrings[ARTL_ART_e1_464] = "";
    artlhsL[ARTL_ART_e1_464] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_464] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_466] = "e1 ::= e2 .";
    artLabelStrings[ARTL_ART_e1_466] = "";
    artlhsL[ARTL_ART_e1_466] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_466] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e1_466] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e1_466] = true;
    arteoR_pL[ARTL_ART_e1_466] = true;
    artPopD[ARTL_ART_e1_466] = true;
    artLabelInternalStrings[ARTL_ART_e1_470] = "e1 ::= . e1 '+' e2 ";
    artLabelStrings[ARTL_ART_e1_470] = "";
    artlhsL[ARTL_ART_e1_470] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_470] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_472] = "e1 ::= e1 . '+' e2 ";
    artLabelStrings[ARTL_ART_e1_472] = "";
    artlhsL[ARTL_ART_e1_472] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_472] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_472] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e1_472] = true;
    artLabelInternalStrings[ARTL_ART_e1_473] = "e1 ::= e1 '+' e2 ";
    artLabelStrings[ARTL_ART_e1_473] = "";
    artlhsL[ARTL_ART_e1_473] = ARTL_ART_e1;
    artLabelInternalStrings[ARTL_ART_e1_474] = "e1 ::= e1 '+' . e2 ";
    artLabelStrings[ARTL_ART_e1_474] = "";
    artlhsL[ARTL_ART_e1_474] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_474] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_476] = "e1 ::= e1 '+' e2 .";
    artLabelStrings[ARTL_ART_e1_476] = "";
    artlhsL[ARTL_ART_e1_476] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_476] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e1_476] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e1_476] = true;
    arteoR_pL[ARTL_ART_e1_476] = true;
    artPopD[ARTL_ART_e1_476] = true;
    artLabelInternalStrings[ARTL_ART_e1_480] = "e1 ::= . e1 '-' e2 ";
    artLabelStrings[ARTL_ART_e1_480] = "";
    artlhsL[ARTL_ART_e1_480] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_480] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_482] = "e1 ::= e1 . '-' e2 ";
    artLabelStrings[ARTL_ART_e1_482] = "";
    artlhsL[ARTL_ART_e1_482] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_482] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_482] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e1_482] = true;
    artLabelInternalStrings[ARTL_ART_e1_483] = "e1 ::= e1 '-' e2 ";
    artLabelStrings[ARTL_ART_e1_483] = "";
    artlhsL[ARTL_ART_e1_483] = ARTL_ART_e1;
    artLabelInternalStrings[ARTL_ART_e1_484] = "e1 ::= e1 '-' . e2 ";
    artLabelStrings[ARTL_ART_e1_484] = "";
    artlhsL[ARTL_ART_e1_484] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e1_484] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e1_486] = "e1 ::= e1 '-' e2 .";
    artLabelStrings[ARTL_ART_e1_486] = "";
    artlhsL[ARTL_ART_e1_486] = ARTL_ART_e1;
    artSlotInstanceOfs[ARTL_ART_e1_486] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e1_486] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e1_486] = true;
    arteoR_pL[ARTL_ART_e1_486] = true;
    artPopD[ARTL_ART_e1_486] = true;
  }

  public void artTableInitialiser_ART_e2() {
    artLabelInternalStrings[ARTL_ART_e2] = "e2";
    artLabelStrings[ARTL_ART_e2] = "e2";
    artKindOfs[ARTL_ART_e2] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e2_490] = "e2 ::= . e3 ";
    artLabelStrings[ARTL_ART_e2_490] = "";
    artlhsL[ARTL_ART_e2_490] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_490] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_492] = "e2 ::= e3 .";
    artLabelStrings[ARTL_ART_e2_492] = "";
    artlhsL[ARTL_ART_e2_492] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_492] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e2_492] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e2_492] = true;
    arteoR_pL[ARTL_ART_e2_492] = true;
    artPopD[ARTL_ART_e2_492] = true;
    artLabelInternalStrings[ARTL_ART_e2_496] = "e2 ::= . e2 '*' e3 ";
    artLabelStrings[ARTL_ART_e2_496] = "";
    artlhsL[ARTL_ART_e2_496] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_496] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_498] = "e2 ::= e2 . '*' e3 ";
    artLabelStrings[ARTL_ART_e2_498] = "";
    artlhsL[ARTL_ART_e2_498] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_498] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_498] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e2_498] = true;
    artLabelInternalStrings[ARTL_ART_e2_499] = "e2 ::= e2 '*' e3 ";
    artLabelStrings[ARTL_ART_e2_499] = "";
    artlhsL[ARTL_ART_e2_499] = ARTL_ART_e2;
    artLabelInternalStrings[ARTL_ART_e2_500] = "e2 ::= e2 '*' . e3 ";
    artLabelStrings[ARTL_ART_e2_500] = "";
    artlhsL[ARTL_ART_e2_500] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_500] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_502] = "e2 ::= e2 '*' e3 .";
    artLabelStrings[ARTL_ART_e2_502] = "";
    artlhsL[ARTL_ART_e2_502] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_502] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e2_502] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e2_502] = true;
    arteoR_pL[ARTL_ART_e2_502] = true;
    artPopD[ARTL_ART_e2_502] = true;
    artLabelInternalStrings[ARTL_ART_e2_506] = "e2 ::= . e2 '/' e3 ";
    artLabelStrings[ARTL_ART_e2_506] = "";
    artlhsL[ARTL_ART_e2_506] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_506] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_508] = "e2 ::= e2 . '/' e3 ";
    artLabelStrings[ARTL_ART_e2_508] = "";
    artlhsL[ARTL_ART_e2_508] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_508] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_508] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e2_508] = true;
    artLabelInternalStrings[ARTL_ART_e2_509] = "e2 ::= e2 '/' e3 ";
    artLabelStrings[ARTL_ART_e2_509] = "";
    artlhsL[ARTL_ART_e2_509] = ARTL_ART_e2;
    artLabelInternalStrings[ARTL_ART_e2_510] = "e2 ::= e2 '/' . e3 ";
    artLabelStrings[ARTL_ART_e2_510] = "";
    artlhsL[ARTL_ART_e2_510] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_510] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_512] = "e2 ::= e2 '/' e3 .";
    artLabelStrings[ARTL_ART_e2_512] = "";
    artlhsL[ARTL_ART_e2_512] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_512] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e2_512] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e2_512] = true;
    arteoR_pL[ARTL_ART_e2_512] = true;
    artPopD[ARTL_ART_e2_512] = true;
    artLabelInternalStrings[ARTL_ART_e2_516] = "e2 ::= . e2 '%' e3 ";
    artLabelStrings[ARTL_ART_e2_516] = "";
    artlhsL[ARTL_ART_e2_516] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_516] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_518] = "e2 ::= e2 . '%' e3 ";
    artLabelStrings[ARTL_ART_e2_518] = "";
    artlhsL[ARTL_ART_e2_518] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_518] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_518] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e2_518] = true;
    artLabelInternalStrings[ARTL_ART_e2_519] = "e2 ::= e2 '%' e3 ";
    artLabelStrings[ARTL_ART_e2_519] = "";
    artlhsL[ARTL_ART_e2_519] = ARTL_ART_e2;
    artLabelInternalStrings[ARTL_ART_e2_520] = "e2 ::= e2 '%' . e3 ";
    artLabelStrings[ARTL_ART_e2_520] = "";
    artlhsL[ARTL_ART_e2_520] = ARTL_ART_e2;
    artKindOfs[ARTL_ART_e2_520] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e2_522] = "e2 ::= e2 '%' e3 .";
    artLabelStrings[ARTL_ART_e2_522] = "";
    artlhsL[ARTL_ART_e2_522] = ARTL_ART_e2;
    artSlotInstanceOfs[ARTL_ART_e2_522] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e2_522] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e2_522] = true;
    arteoR_pL[ARTL_ART_e2_522] = true;
    artPopD[ARTL_ART_e2_522] = true;
  }

  public void artTableInitialiser_ART_e3() {
    artLabelInternalStrings[ARTL_ART_e3] = "e3";
    artLabelStrings[ARTL_ART_e3] = "e3";
    artKindOfs[ARTL_ART_e3] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e3_526] = "e3 ::= . e4 ";
    artLabelStrings[ARTL_ART_e3_526] = "";
    artlhsL[ARTL_ART_e3_526] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_526] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e3_528] = "e3 ::= e4 .";
    artLabelStrings[ARTL_ART_e3_528] = "";
    artlhsL[ARTL_ART_e3_528] = ARTL_ART_e3;
    artSlotInstanceOfs[ARTL_ART_e3_528] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e3_528] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e3_528] = true;
    arteoR_pL[ARTL_ART_e3_528] = true;
    artPopD[ARTL_ART_e3_528] = true;
    artLabelInternalStrings[ARTL_ART_e3_532] = "e3 ::= . '+' e3 ";
    artLabelStrings[ARTL_ART_e3_532] = "";
    artlhsL[ARTL_ART_e3_532] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_532] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e3_533] = "e3 ::= '+' e3 ";
    artLabelStrings[ARTL_ART_e3_533] = "";
    artlhsL[ARTL_ART_e3_533] = ARTL_ART_e3;
    artLabelInternalStrings[ARTL_ART_e3_534] = "e3 ::= '+' . e3 ";
    artLabelStrings[ARTL_ART_e3_534] = "";
    artlhsL[ARTL_ART_e3_534] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_534] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e3_534] = true;
    artLabelInternalStrings[ARTL_ART_e3_536] = "e3 ::= '+' e3 .";
    artLabelStrings[ARTL_ART_e3_536] = "";
    artlhsL[ARTL_ART_e3_536] = ARTL_ART_e3;
    artSlotInstanceOfs[ARTL_ART_e3_536] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_536] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e3_536] = true;
    arteoR_pL[ARTL_ART_e3_536] = true;
    artPopD[ARTL_ART_e3_536] = true;
    artLabelInternalStrings[ARTL_ART_e3_540] = "e3 ::= . '-' e3 ";
    artLabelStrings[ARTL_ART_e3_540] = "";
    artlhsL[ARTL_ART_e3_540] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_540] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e3_541] = "e3 ::= '-' e3 ";
    artLabelStrings[ARTL_ART_e3_541] = "";
    artlhsL[ARTL_ART_e3_541] = ARTL_ART_e3;
    artLabelInternalStrings[ARTL_ART_e3_542] = "e3 ::= '-' . e3 ";
    artLabelStrings[ARTL_ART_e3_542] = "";
    artlhsL[ARTL_ART_e3_542] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_542] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e3_542] = true;
    artLabelInternalStrings[ARTL_ART_e3_544] = "e3 ::= '-' e3 .";
    artLabelStrings[ARTL_ART_e3_544] = "";
    artlhsL[ARTL_ART_e3_544] = ARTL_ART_e3;
    artSlotInstanceOfs[ARTL_ART_e3_544] = ARTL_ART_e3;
    artKindOfs[ARTL_ART_e3_544] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e3_544] = true;
    arteoR_pL[ARTL_ART_e3_544] = true;
    artPopD[ARTL_ART_e3_544] = true;
  }

  public void artTableInitialiser_ART_e4() {
    artLabelInternalStrings[ARTL_ART_e4] = "e4";
    artLabelStrings[ARTL_ART_e4] = "e4";
    artKindOfs[ARTL_ART_e4] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e4_548] = "e4 ::= . e5 ";
    artLabelStrings[ARTL_ART_e4_548] = "";
    artlhsL[ARTL_ART_e4_548] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e4_548] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e4_550] = "e4 ::= e5 .";
    artLabelStrings[ARTL_ART_e4_550] = "";
    artlhsL[ARTL_ART_e4_550] = ARTL_ART_e4;
    artSlotInstanceOfs[ARTL_ART_e4_550] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e4_550] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e4_550] = true;
    arteoR_pL[ARTL_ART_e4_550] = true;
    artPopD[ARTL_ART_e4_550] = true;
    artLabelInternalStrings[ARTL_ART_e4_554] = "e4 ::= . e5 '**' e4 ";
    artLabelStrings[ARTL_ART_e4_554] = "";
    artlhsL[ARTL_ART_e4_554] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e4_554] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e4_556] = "e4 ::= e5 . '**' e4 ";
    artLabelStrings[ARTL_ART_e4_556] = "";
    artlhsL[ARTL_ART_e4_556] = ARTL_ART_e4;
    artSlotInstanceOfs[ARTL_ART_e4_556] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e4_556] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e4_556] = true;
    artLabelInternalStrings[ARTL_ART_e4_557] = "e4 ::= e5 '**' e4 ";
    artLabelStrings[ARTL_ART_e4_557] = "";
    artlhsL[ARTL_ART_e4_557] = ARTL_ART_e4;
    artLabelInternalStrings[ARTL_ART_e4_558] = "e4 ::= e5 '**' . e4 ";
    artLabelStrings[ARTL_ART_e4_558] = "";
    artlhsL[ARTL_ART_e4_558] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e4_558] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e4_560] = "e4 ::= e5 '**' e4 .";
    artLabelStrings[ARTL_ART_e4_560] = "";
    artlhsL[ARTL_ART_e4_560] = ARTL_ART_e4;
    artSlotInstanceOfs[ARTL_ART_e4_560] = ARTL_ART_e4;
    artKindOfs[ARTL_ART_e4_560] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e4_560] = true;
    arteoR_pL[ARTL_ART_e4_560] = true;
    artPopD[ARTL_ART_e4_560] = true;
  }

  public void artTableInitialiser_ART_e5() {
    artLabelInternalStrings[ARTL_ART_e5] = "e5";
    artLabelStrings[ARTL_ART_e5] = "e5";
    artKindOfs[ARTL_ART_e5] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_e5_564] = "e5 ::= . INTEGER ";
    artLabelStrings[ARTL_ART_e5_564] = "";
    artlhsL[ARTL_ART_e5_564] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_564] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e5_566] = "e5 ::= INTEGER .";
    artLabelStrings[ARTL_ART_e5_566] = "";
    artlhsL[ARTL_ART_e5_566] = ARTL_ART_e5;
    artSlotInstanceOfs[ARTL_ART_e5_566] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_e5_566] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e5_566] = true;
    arteoR_pL[ARTL_ART_e5_566] = true;
    artPopD[ARTL_ART_e5_566] = true;
    artLabelInternalStrings[ARTL_ART_e5_570] = "e5 ::= . ID ";
    artLabelStrings[ARTL_ART_e5_570] = "";
    artlhsL[ARTL_ART_e5_570] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_570] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e5_572] = "e5 ::= ID .";
    artLabelStrings[ARTL_ART_e5_572] = "";
    artlhsL[ARTL_ART_e5_572] = ARTL_ART_e5;
    artSlotInstanceOfs[ARTL_ART_e5_572] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_e5_572] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e5_572] = true;
    arteoR_pL[ARTL_ART_e5_572] = true;
    artPopD[ARTL_ART_e5_572] = true;
    artLabelInternalStrings[ARTL_ART_e5_576] = "e5 ::= . '(' e1 ')' ";
    artLabelStrings[ARTL_ART_e5_576] = "";
    artlhsL[ARTL_ART_e5_576] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_576] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_e5_577] = "e5 ::= '(' e1 ')' ";
    artLabelStrings[ARTL_ART_e5_577] = "";
    artlhsL[ARTL_ART_e5_577] = ARTL_ART_e5;
    artLabelInternalStrings[ARTL_ART_e5_578] = "e5 ::= '(' . e1 ')' ";
    artLabelStrings[ARTL_ART_e5_578] = "";
    artlhsL[ARTL_ART_e5_578] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_578] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_e5_578] = true;
    artLabelInternalStrings[ARTL_ART_e5_580] = "e5 ::= '(' e1 . ')' ";
    artLabelStrings[ARTL_ART_e5_580] = "";
    artlhsL[ARTL_ART_e5_580] = ARTL_ART_e5;
    artSlotInstanceOfs[ARTL_ART_e5_580] = ARTL_ART_e1;
    artKindOfs[ARTL_ART_e5_580] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_e5_580] = true;
    artLabelInternalStrings[ARTL_ART_e5_583] = "e5 ::= '(' e1 ')' ";
    artLabelStrings[ARTL_ART_e5_583] = "";
    artlhsL[ARTL_ART_e5_583] = ARTL_ART_e5;
    artPopD[ARTL_ART_e5_583] = true;
    artLabelInternalStrings[ARTL_ART_e5_584] = "e5 ::= '(' e1 ')' .";
    artLabelStrings[ARTL_ART_e5_584] = "";
    artlhsL[ARTL_ART_e5_584] = ARTL_ART_e5;
    artKindOfs[ARTL_ART_e5_584] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_e5_584] = true;
    arteoR_pL[ARTL_ART_e5_584] = true;
    artPopD[ARTL_ART_e5_584] = true;
  }

  public void artTableInitialiser_ART_elseOpt() {
    artLabelInternalStrings[ARTL_ART_elseOpt] = "elseOpt";
    artLabelStrings[ARTL_ART_elseOpt] = "elseOpt";
    artKindOfs[ARTL_ART_elseOpt] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_elseOpt_126] = "elseOpt ::= . 'else' singleStatement ";
    artLabelStrings[ARTL_ART_elseOpt_126] = "";
    artlhsL[ARTL_ART_elseOpt_126] = ARTL_ART_elseOpt;
    artKindOfs[ARTL_ART_elseOpt_126] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_elseOpt_127] = "elseOpt ::= 'else' singleStatement ";
    artLabelStrings[ARTL_ART_elseOpt_127] = "";
    artlhsL[ARTL_ART_elseOpt_127] = ARTL_ART_elseOpt;
    artLabelInternalStrings[ARTL_ART_elseOpt_128] = "elseOpt ::= 'else' . singleStatement ";
    artLabelStrings[ARTL_ART_elseOpt_128] = "";
    artlhsL[ARTL_ART_elseOpt_128] = ARTL_ART_elseOpt;
    artKindOfs[ARTL_ART_elseOpt_128] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_elseOpt_128] = true;
    artLabelInternalStrings[ARTL_ART_elseOpt_130] = "elseOpt ::= 'else' singleStatement .";
    artLabelStrings[ARTL_ART_elseOpt_130] = "";
    artlhsL[ARTL_ART_elseOpt_130] = ARTL_ART_elseOpt;
    artSlotInstanceOfs[ARTL_ART_elseOpt_130] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_elseOpt_130] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_elseOpt_130] = true;
    arteoR_pL[ARTL_ART_elseOpt_130] = true;
    artPopD[ARTL_ART_elseOpt_130] = true;
    artLabelInternalStrings[ARTL_ART_elseOpt_132] = "elseOpt ::= . # ";
    artLabelStrings[ARTL_ART_elseOpt_132] = "";
    artlhsL[ARTL_ART_elseOpt_132] = ARTL_ART_elseOpt;
    artKindOfs[ARTL_ART_elseOpt_132] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_elseOpt_132] = true;
    artLabelInternalStrings[ARTL_ART_elseOpt_134] = "elseOpt ::= # .";
    artLabelStrings[ARTL_ART_elseOpt_134] = "";
    artlhsL[ARTL_ART_elseOpt_134] = ARTL_ART_elseOpt;
    artKindOfs[ARTL_ART_elseOpt_134] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_elseOpt_134] = true;
    arteoR_pL[ARTL_ART_elseOpt_134] = true;
    artPopD[ARTL_ART_elseOpt_134] = true;
  }

  public void artTableInitialiser_ART_genderType() {
    artLabelInternalStrings[ARTL_ART_genderType] = "genderType";
    artLabelStrings[ARTL_ART_genderType] = "genderType";
    artKindOfs[ARTL_ART_genderType] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_genderType_226] = "genderType ::= . # ";
    artLabelStrings[ARTL_ART_genderType_226] = "";
    artlhsL[ARTL_ART_genderType_226] = ARTL_ART_genderType;
    artKindOfs[ARTL_ART_genderType_226] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_genderType_226] = true;
    artLabelInternalStrings[ARTL_ART_genderType_228] = "genderType ::= # .";
    artLabelStrings[ARTL_ART_genderType_228] = "";
    artlhsL[ARTL_ART_genderType_228] = ARTL_ART_genderType;
    artKindOfs[ARTL_ART_genderType_228] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_genderType_228] = true;
    arteoR_pL[ARTL_ART_genderType_228] = true;
    artPopD[ARTL_ART_genderType_228] = true;
    artLabelInternalStrings[ARTL_ART_genderType_232] = "genderType ::= . 'Male' ";
    artLabelStrings[ARTL_ART_genderType_232] = "";
    artlhsL[ARTL_ART_genderType_232] = ARTL_ART_genderType;
    artKindOfs[ARTL_ART_genderType_232] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_genderType_232] = true;
    artLabelInternalStrings[ARTL_ART_genderType_233] = "genderType ::= 'Male' ";
    artLabelStrings[ARTL_ART_genderType_233] = "";
    artlhsL[ARTL_ART_genderType_233] = ARTL_ART_genderType;
    artPopD[ARTL_ART_genderType_233] = true;
    artLabelInternalStrings[ARTL_ART_genderType_234] = "genderType ::= 'Male' .";
    artLabelStrings[ARTL_ART_genderType_234] = "";
    artlhsL[ARTL_ART_genderType_234] = ARTL_ART_genderType;
    artKindOfs[ARTL_ART_genderType_234] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_genderType_234] = true;
    arteoR_pL[ARTL_ART_genderType_234] = true;
    artPopD[ARTL_ART_genderType_234] = true;
    artLabelInternalStrings[ARTL_ART_genderType_238] = "genderType ::= . 'Female' ";
    artLabelStrings[ARTL_ART_genderType_238] = "";
    artlhsL[ARTL_ART_genderType_238] = ARTL_ART_genderType;
    artKindOfs[ARTL_ART_genderType_238] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_genderType_238] = true;
    artLabelInternalStrings[ARTL_ART_genderType_239] = "genderType ::= 'Female' ";
    artLabelStrings[ARTL_ART_genderType_239] = "";
    artlhsL[ARTL_ART_genderType_239] = ARTL_ART_genderType;
    artPopD[ARTL_ART_genderType_239] = true;
    artLabelInternalStrings[ARTL_ART_genderType_240] = "genderType ::= 'Female' .";
    artLabelStrings[ARTL_ART_genderType_240] = "";
    artlhsL[ARTL_ART_genderType_240] = ARTL_ART_genderType;
    artKindOfs[ARTL_ART_genderType_240] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_genderType_240] = true;
    arteoR_pL[ARTL_ART_genderType_240] = true;
    artPopD[ARTL_ART_genderType_240] = true;
    artLabelInternalStrings[ARTL_ART_genderType_244] = "genderType ::= . 'Transgender' ";
    artLabelStrings[ARTL_ART_genderType_244] = "";
    artlhsL[ARTL_ART_genderType_244] = ARTL_ART_genderType;
    artKindOfs[ARTL_ART_genderType_244] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_genderType_244] = true;
    artLabelInternalStrings[ARTL_ART_genderType_245] = "genderType ::= 'Transgender' ";
    artLabelStrings[ARTL_ART_genderType_245] = "";
    artlhsL[ARTL_ART_genderType_245] = ARTL_ART_genderType;
    artPopD[ARTL_ART_genderType_245] = true;
    artLabelInternalStrings[ARTL_ART_genderType_246] = "genderType ::= 'Transgender' .";
    artLabelStrings[ARTL_ART_genderType_246] = "";
    artlhsL[ARTL_ART_genderType_246] = ARTL_ART_genderType;
    artKindOfs[ARTL_ART_genderType_246] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_genderType_246] = true;
    arteoR_pL[ARTL_ART_genderType_246] = true;
    artPopD[ARTL_ART_genderType_246] = true;
  }

  public void artTableInitialiser_ART_mainCall() {
    artLabelInternalStrings[ARTL_ART_mainCall] = "mainCall";
    artLabelStrings[ARTL_ART_mainCall] = "mainCall";
    artKindOfs[ARTL_ART_mainCall] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_mainCall_136] = "mainCall ::= . 'Gender' genderType ";
    artLabelStrings[ARTL_ART_mainCall_136] = "";
    artlhsL[ARTL_ART_mainCall_136] = ARTL_ART_mainCall;
    artKindOfs[ARTL_ART_mainCall_136] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mainCall_137] = "mainCall ::= 'Gender' genderType ";
    artLabelStrings[ARTL_ART_mainCall_137] = "";
    artlhsL[ARTL_ART_mainCall_137] = ARTL_ART_mainCall;
    artLabelInternalStrings[ARTL_ART_mainCall_138] = "mainCall ::= 'Gender' . genderType ";
    artLabelStrings[ARTL_ART_mainCall_138] = "";
    artlhsL[ARTL_ART_mainCall_138] = ARTL_ART_mainCall;
    artKindOfs[ARTL_ART_mainCall_138] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_mainCall_138] = true;
    artLabelInternalStrings[ARTL_ART_mainCall_140] = "mainCall ::= 'Gender' genderType .";
    artLabelStrings[ARTL_ART_mainCall_140] = "";
    artlhsL[ARTL_ART_mainCall_140] = ARTL_ART_mainCall;
    artSlotInstanceOfs[ARTL_ART_mainCall_140] = ARTL_ART_genderType;
    artKindOfs[ARTL_ART_mainCall_140] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_mainCall_140] = true;
    arteoR_pL[ARTL_ART_mainCall_140] = true;
    artPopD[ARTL_ART_mainCall_140] = true;
    artLabelInternalStrings[ARTL_ART_mainCall_144] = "mainCall ::= . subCall HealthType ";
    artLabelStrings[ARTL_ART_mainCall_144] = "";
    artlhsL[ARTL_ART_mainCall_144] = ARTL_ART_mainCall;
    artKindOfs[ARTL_ART_mainCall_144] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mainCall_146] = "mainCall ::= subCall . HealthType ";
    artLabelStrings[ARTL_ART_mainCall_146] = "";
    artlhsL[ARTL_ART_mainCall_146] = ARTL_ART_mainCall;
    artSlotInstanceOfs[ARTL_ART_mainCall_146] = ARTL_ART_subCall;
    artKindOfs[ARTL_ART_mainCall_146] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_mainCall_146] = true;
    artLabelInternalStrings[ARTL_ART_mainCall_148] = "mainCall ::= subCall HealthType .";
    artLabelStrings[ARTL_ART_mainCall_148] = "";
    artlhsL[ARTL_ART_mainCall_148] = ARTL_ART_mainCall;
    artSlotInstanceOfs[ARTL_ART_mainCall_148] = ARTL_ART_HealthType;
    artKindOfs[ARTL_ART_mainCall_148] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_mainCall_148] = true;
    arteoR_pL[ARTL_ART_mainCall_148] = true;
    artPopD[ARTL_ART_mainCall_148] = true;
    artLabelInternalStrings[ARTL_ART_mainCall_152] = "mainCall ::= . subCall2 SymptomsType ";
    artLabelStrings[ARTL_ART_mainCall_152] = "";
    artlhsL[ARTL_ART_mainCall_152] = ARTL_ART_mainCall;
    artKindOfs[ARTL_ART_mainCall_152] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mainCall_154] = "mainCall ::= subCall2 . SymptomsType ";
    artLabelStrings[ARTL_ART_mainCall_154] = "";
    artlhsL[ARTL_ART_mainCall_154] = ARTL_ART_mainCall;
    artSlotInstanceOfs[ARTL_ART_mainCall_154] = ARTL_ART_subCall2;
    artKindOfs[ARTL_ART_mainCall_154] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_mainCall_154] = true;
    artLabelInternalStrings[ARTL_ART_mainCall_156] = "mainCall ::= subCall2 SymptomsType .";
    artLabelStrings[ARTL_ART_mainCall_156] = "";
    artlhsL[ARTL_ART_mainCall_156] = ARTL_ART_mainCall;
    artSlotInstanceOfs[ARTL_ART_mainCall_156] = ARTL_ART_SymptomsType;
    artKindOfs[ARTL_ART_mainCall_156] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_mainCall_156] = true;
    arteoR_pL[ARTL_ART_mainCall_156] = true;
    artPopD[ARTL_ART_mainCall_156] = true;
    artLabelInternalStrings[ARTL_ART_mainCall_160] = "mainCall ::= . subCall3 TravelsType ";
    artLabelStrings[ARTL_ART_mainCall_160] = "";
    artlhsL[ARTL_ART_mainCall_160] = ARTL_ART_mainCall;
    artKindOfs[ARTL_ART_mainCall_160] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_mainCall_162] = "mainCall ::= subCall3 . TravelsType ";
    artLabelStrings[ARTL_ART_mainCall_162] = "";
    artlhsL[ARTL_ART_mainCall_162] = ARTL_ART_mainCall;
    artSlotInstanceOfs[ARTL_ART_mainCall_162] = ARTL_ART_subCall3;
    artKindOfs[ARTL_ART_mainCall_162] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_mainCall_162] = true;
    artLabelInternalStrings[ARTL_ART_mainCall_164] = "mainCall ::= subCall3 TravelsType .";
    artLabelStrings[ARTL_ART_mainCall_164] = "";
    artlhsL[ARTL_ART_mainCall_164] = ARTL_ART_mainCall;
    artSlotInstanceOfs[ARTL_ART_mainCall_164] = ARTL_ART_TravelsType;
    artKindOfs[ARTL_ART_mainCall_164] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_mainCall_164] = true;
    arteoR_pL[ARTL_ART_mainCall_164] = true;
    artPopD[ARTL_ART_mainCall_164] = true;
  }

  public void artTableInitialiser_ART_printElements() {
    artLabelInternalStrings[ARTL_ART_printElements] = "printElements";
    artLabelStrings[ARTL_ART_printElements] = "printElements";
    artKindOfs[ARTL_ART_printElements] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_printElements_366] = "printElements ::= . STRING_DQ ";
    artLabelStrings[ARTL_ART_printElements_366] = "";
    artlhsL[ARTL_ART_printElements_366] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_366] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_368] = "printElements ::= STRING_DQ .";
    artLabelStrings[ARTL_ART_printElements_368] = "";
    artlhsL[ARTL_ART_printElements_368] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_368] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_printElements_368] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_368] = true;
    arteoR_pL[ARTL_ART_printElements_368] = true;
    artPopD[ARTL_ART_printElements_368] = true;
    artLabelInternalStrings[ARTL_ART_printElements_372] = "printElements ::= . STRING_DQ ',' printElements ";
    artLabelStrings[ARTL_ART_printElements_372] = "";
    artlhsL[ARTL_ART_printElements_372] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_372] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_374] = "printElements ::= STRING_DQ . ',' printElements ";
    artLabelStrings[ARTL_ART_printElements_374] = "";
    artlhsL[ARTL_ART_printElements_374] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_374] = ARTL_ART_STRING_DQ;
    artKindOfs[ARTL_ART_printElements_374] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_printElements_374] = true;
    artLabelInternalStrings[ARTL_ART_printElements_377] = "printElements ::= STRING_DQ ',' printElements ";
    artLabelStrings[ARTL_ART_printElements_377] = "";
    artlhsL[ARTL_ART_printElements_377] = ARTL_ART_printElements;
    artLabelInternalStrings[ARTL_ART_printElements_378] = "printElements ::= STRING_DQ ',' . printElements ";
    artLabelStrings[ARTL_ART_printElements_378] = "";
    artlhsL[ARTL_ART_printElements_378] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_378] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_380] = "printElements ::= STRING_DQ ',' printElements .";
    artLabelStrings[ARTL_ART_printElements_380] = "";
    artlhsL[ARTL_ART_printElements_380] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_380] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_380] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_380] = true;
    arteoR_pL[ARTL_ART_printElements_380] = true;
    artPopD[ARTL_ART_printElements_380] = true;
    artLabelInternalStrings[ARTL_ART_printElements_382] = "printElements ::= . e0 ";
    artLabelStrings[ARTL_ART_printElements_382] = "";
    artlhsL[ARTL_ART_printElements_382] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_382] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_384] = "printElements ::= e0 .";
    artLabelStrings[ARTL_ART_printElements_384] = "";
    artlhsL[ARTL_ART_printElements_384] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_384] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_printElements_384] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_384] = true;
    arteoR_pL[ARTL_ART_printElements_384] = true;
    artPopD[ARTL_ART_printElements_384] = true;
    artLabelInternalStrings[ARTL_ART_printElements_388] = "printElements ::= . e0 ',' printElements ";
    artLabelStrings[ARTL_ART_printElements_388] = "";
    artlhsL[ARTL_ART_printElements_388] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_388] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_390] = "printElements ::= e0 . ',' printElements ";
    artLabelStrings[ARTL_ART_printElements_390] = "";
    artlhsL[ARTL_ART_printElements_390] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_390] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_printElements_390] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_printElements_390] = true;
    artLabelInternalStrings[ARTL_ART_printElements_393] = "printElements ::= e0 ',' printElements ";
    artLabelStrings[ARTL_ART_printElements_393] = "";
    artlhsL[ARTL_ART_printElements_393] = ARTL_ART_printElements;
    artLabelInternalStrings[ARTL_ART_printElements_394] = "printElements ::= e0 ',' . printElements ";
    artLabelStrings[ARTL_ART_printElements_394] = "";
    artlhsL[ARTL_ART_printElements_394] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_394] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_printElements_396] = "printElements ::= e0 ',' printElements .";
    artLabelStrings[ARTL_ART_printElements_396] = "";
    artlhsL[ARTL_ART_printElements_396] = ARTL_ART_printElements;
    artSlotInstanceOfs[ARTL_ART_printElements_396] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_printElements_396] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_printElements_396] = true;
    arteoR_pL[ARTL_ART_printElements_396] = true;
    artPopD[ARTL_ART_printElements_396] = true;
  }

  public void artTableInitialiser_ART_singleStatement() {
    artLabelInternalStrings[ARTL_ART_singleStatement] = "singleStatement";
    artLabelStrings[ARTL_ART_singleStatement] = "singleStatement";
    artKindOfs[ARTL_ART_singleStatement] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_singleStatement_12] = "singleStatement ::= . ID '=' e0 ';' ";
    artLabelStrings[ARTL_ART_singleStatement_12] = "";
    artlhsL[ARTL_ART_singleStatement_12] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_12] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_14] = "singleStatement ::= ID . '=' e0 ';' ";
    artLabelStrings[ARTL_ART_singleStatement_14] = "";
    artlhsL[ARTL_ART_singleStatement_14] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_14] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_singleStatement_14] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_singleStatement_14] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_15] = "singleStatement ::= ID '=' e0 ';' ";
    artLabelStrings[ARTL_ART_singleStatement_15] = "";
    artlhsL[ARTL_ART_singleStatement_15] = ARTL_ART_singleStatement;
    artLabelInternalStrings[ARTL_ART_singleStatement_16] = "singleStatement ::= ID '=' . e0 ';' ";
    artLabelStrings[ARTL_ART_singleStatement_16] = "";
    artlhsL[ARTL_ART_singleStatement_16] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_16] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_18] = "singleStatement ::= ID '=' e0 . ';' ";
    artLabelStrings[ARTL_ART_singleStatement_18] = "";
    artlhsL[ARTL_ART_singleStatement_18] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_18] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_singleStatement_18] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_singleStatement_18] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_19] = "singleStatement ::= ID '=' e0 ';' ";
    artLabelStrings[ARTL_ART_singleStatement_19] = "";
    artlhsL[ARTL_ART_singleStatement_19] = ARTL_ART_singleStatement;
    artPopD[ARTL_ART_singleStatement_19] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_20] = "singleStatement ::= ID '=' e0 ';' .";
    artLabelStrings[ARTL_ART_singleStatement_20] = "";
    artlhsL[ARTL_ART_singleStatement_20] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_20] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_singleStatement_20] = true;
    arteoR_pL[ARTL_ART_singleStatement_20] = true;
    artPopD[ARTL_ART_singleStatement_20] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_24] = "singleStatement ::= . 'if' e0 'doThis' singleStatement elseOpt ";
    artLabelStrings[ARTL_ART_singleStatement_24] = "";
    artlhsL[ARTL_ART_singleStatement_24] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_24] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_25] = "singleStatement ::= 'if' e0 'doThis' singleStatement elseOpt ";
    artLabelStrings[ARTL_ART_singleStatement_25] = "";
    artlhsL[ARTL_ART_singleStatement_25] = ARTL_ART_singleStatement;
    artLabelInternalStrings[ARTL_ART_singleStatement_26] = "singleStatement ::= 'if' . e0 'doThis' singleStatement elseOpt ";
    artLabelStrings[ARTL_ART_singleStatement_26] = "";
    artlhsL[ARTL_ART_singleStatement_26] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_26] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_singleStatement_26] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_28] = "singleStatement ::= 'if' e0 . 'doThis' singleStatement elseOpt ";
    artLabelStrings[ARTL_ART_singleStatement_28] = "";
    artlhsL[ARTL_ART_singleStatement_28] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_28] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_singleStatement_28] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_29] = "singleStatement ::= 'if' e0 'doThis' singleStatement elseOpt ";
    artLabelStrings[ARTL_ART_singleStatement_29] = "";
    artlhsL[ARTL_ART_singleStatement_29] = ARTL_ART_singleStatement;
    artLabelInternalStrings[ARTL_ART_singleStatement_30] = "singleStatement ::= 'if' e0 'doThis' . singleStatement elseOpt ";
    artLabelStrings[ARTL_ART_singleStatement_30] = "";
    artlhsL[ARTL_ART_singleStatement_30] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_30] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_32] = "singleStatement ::= 'if' e0 'doThis' singleStatement . elseOpt ";
    artLabelStrings[ARTL_ART_singleStatement_32] = "";
    artlhsL[ARTL_ART_singleStatement_32] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_32] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_32] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_34] = "singleStatement ::= 'if' e0 'doThis' singleStatement elseOpt .";
    artLabelStrings[ARTL_ART_singleStatement_34] = "";
    artlhsL[ARTL_ART_singleStatement_34] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_34] = ARTL_ART_elseOpt;
    artKindOfs[ARTL_ART_singleStatement_34] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_singleStatement_34] = true;
    arteoR_pL[ARTL_ART_singleStatement_34] = true;
    artPopD[ARTL_ART_singleStatement_34] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_38] = "singleStatement ::= . 'while' e0 'runThis' singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_38] = "";
    artlhsL[ARTL_ART_singleStatement_38] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_38] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_39] = "singleStatement ::= 'while' e0 'runThis' singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_39] = "";
    artlhsL[ARTL_ART_singleStatement_39] = ARTL_ART_singleStatement;
    artLabelInternalStrings[ARTL_ART_singleStatement_40] = "singleStatement ::= 'while' . e0 'runThis' singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_40] = "";
    artlhsL[ARTL_ART_singleStatement_40] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_40] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_singleStatement_40] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_42] = "singleStatement ::= 'while' e0 . 'runThis' singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_42] = "";
    artlhsL[ARTL_ART_singleStatement_42] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_42] = ARTL_ART_e0;
    artKindOfs[ARTL_ART_singleStatement_42] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_43] = "singleStatement ::= 'while' e0 'runThis' singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_43] = "";
    artlhsL[ARTL_ART_singleStatement_43] = ARTL_ART_singleStatement;
    artLabelInternalStrings[ARTL_ART_singleStatement_44] = "singleStatement ::= 'while' e0 'runThis' . singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_44] = "";
    artlhsL[ARTL_ART_singleStatement_44] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_44] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_46] = "singleStatement ::= 'while' e0 'runThis' singleStatement .";
    artLabelStrings[ARTL_ART_singleStatement_46] = "";
    artlhsL[ARTL_ART_singleStatement_46] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_46] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_46] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_singleStatement_46] = true;
    arteoR_pL[ARTL_ART_singleStatement_46] = true;
    artPopD[ARTL_ART_singleStatement_46] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_50] = "singleStatement ::= . 'userSymptoms' ID singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_50] = "";
    artlhsL[ARTL_ART_singleStatement_50] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_50] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_51] = "singleStatement ::= 'userSymptoms' ID singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_51] = "";
    artlhsL[ARTL_ART_singleStatement_51] = ARTL_ART_singleStatement;
    artLabelInternalStrings[ARTL_ART_singleStatement_52] = "singleStatement ::= 'userSymptoms' . ID singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_52] = "";
    artlhsL[ARTL_ART_singleStatement_52] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_52] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_singleStatement_52] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_54] = "singleStatement ::= 'userSymptoms' ID . singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_54] = "";
    artlhsL[ARTL_ART_singleStatement_54] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_54] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_singleStatement_54] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_56] = "singleStatement ::= 'userSymptoms' ID singleStatement .";
    artLabelStrings[ARTL_ART_singleStatement_56] = "";
    artlhsL[ARTL_ART_singleStatement_56] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_56] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_56] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_singleStatement_56] = true;
    arteoR_pL[ARTL_ART_singleStatement_56] = true;
    artPopD[ARTL_ART_singleStatement_56] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_60] = "singleStatement ::= . 'userTravels' ID singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_60] = "";
    artlhsL[ARTL_ART_singleStatement_60] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_60] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_61] = "singleStatement ::= 'userTravels' ID singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_61] = "";
    artlhsL[ARTL_ART_singleStatement_61] = ARTL_ART_singleStatement;
    artLabelInternalStrings[ARTL_ART_singleStatement_62] = "singleStatement ::= 'userTravels' . ID singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_62] = "";
    artlhsL[ARTL_ART_singleStatement_62] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_62] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_singleStatement_62] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_64] = "singleStatement ::= 'userTravels' ID . singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_64] = "";
    artlhsL[ARTL_ART_singleStatement_64] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_64] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_singleStatement_64] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_66] = "singleStatement ::= 'userTravels' ID singleStatement .";
    artLabelStrings[ARTL_ART_singleStatement_66] = "";
    artlhsL[ARTL_ART_singleStatement_66] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_66] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_66] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_singleStatement_66] = true;
    arteoR_pL[ARTL_ART_singleStatement_66] = true;
    artPopD[ARTL_ART_singleStatement_66] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_70] = "singleStatement ::= . 'userHealth' ID singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_70] = "";
    artlhsL[ARTL_ART_singleStatement_70] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_70] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_71] = "singleStatement ::= 'userHealth' ID singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_71] = "";
    artlhsL[ARTL_ART_singleStatement_71] = ARTL_ART_singleStatement;
    artLabelInternalStrings[ARTL_ART_singleStatement_72] = "singleStatement ::= 'userHealth' . ID singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_72] = "";
    artlhsL[ARTL_ART_singleStatement_72] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_72] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_singleStatement_72] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_74] = "singleStatement ::= 'userHealth' ID . singleStatement ";
    artLabelStrings[ARTL_ART_singleStatement_74] = "";
    artlhsL[ARTL_ART_singleStatement_74] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_74] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_singleStatement_74] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_76] = "singleStatement ::= 'userHealth' ID singleStatement .";
    artLabelStrings[ARTL_ART_singleStatement_76] = "";
    artlhsL[ARTL_ART_singleStatement_76] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_76] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_76] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_singleStatement_76] = true;
    arteoR_pL[ARTL_ART_singleStatement_76] = true;
    artPopD[ARTL_ART_singleStatement_76] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_80] = "singleStatement ::= . 'HelpMeWithCovid19' ID ';' ";
    artLabelStrings[ARTL_ART_singleStatement_80] = "";
    artlhsL[ARTL_ART_singleStatement_80] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_80] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_81] = "singleStatement ::= 'HelpMeWithCovid19' ID ';' ";
    artLabelStrings[ARTL_ART_singleStatement_81] = "";
    artlhsL[ARTL_ART_singleStatement_81] = ARTL_ART_singleStatement;
    artLabelInternalStrings[ARTL_ART_singleStatement_82] = "singleStatement ::= 'HelpMeWithCovid19' . ID ';' ";
    artLabelStrings[ARTL_ART_singleStatement_82] = "";
    artlhsL[ARTL_ART_singleStatement_82] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_82] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_singleStatement_82] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_84] = "singleStatement ::= 'HelpMeWithCovid19' ID . ';' ";
    artLabelStrings[ARTL_ART_singleStatement_84] = "";
    artlhsL[ARTL_ART_singleStatement_84] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_84] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_singleStatement_84] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_singleStatement_84] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_85] = "singleStatement ::= 'HelpMeWithCovid19' ID ';' ";
    artLabelStrings[ARTL_ART_singleStatement_85] = "";
    artlhsL[ARTL_ART_singleStatement_85] = ARTL_ART_singleStatement;
    artPopD[ARTL_ART_singleStatement_85] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_86] = "singleStatement ::= 'HelpMeWithCovid19' ID ';' .";
    artLabelStrings[ARTL_ART_singleStatement_86] = "";
    artlhsL[ARTL_ART_singleStatement_86] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_86] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_singleStatement_86] = true;
    arteoR_pL[ARTL_ART_singleStatement_86] = true;
    artPopD[ARTL_ART_singleStatement_86] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_90] = "singleStatement ::= . 'ConsoleLog' '(' printElements ')' ';' ";
    artLabelStrings[ARTL_ART_singleStatement_90] = "";
    artlhsL[ARTL_ART_singleStatement_90] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_90] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_91] = "singleStatement ::= 'ConsoleLog' '(' printElements ')' ';' ";
    artLabelStrings[ARTL_ART_singleStatement_91] = "";
    artlhsL[ARTL_ART_singleStatement_91] = ARTL_ART_singleStatement;
    artLabelInternalStrings[ARTL_ART_singleStatement_92] = "singleStatement ::= 'ConsoleLog' . '(' printElements ')' ';' ";
    artLabelStrings[ARTL_ART_singleStatement_92] = "";
    artlhsL[ARTL_ART_singleStatement_92] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_92] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_singleStatement_92] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_93] = "singleStatement ::= 'ConsoleLog' '(' printElements ')' ';' ";
    artLabelStrings[ARTL_ART_singleStatement_93] = "";
    artlhsL[ARTL_ART_singleStatement_93] = ARTL_ART_singleStatement;
    artLabelInternalStrings[ARTL_ART_singleStatement_94] = "singleStatement ::= 'ConsoleLog' '(' . printElements ')' ';' ";
    artLabelStrings[ARTL_ART_singleStatement_94] = "";
    artlhsL[ARTL_ART_singleStatement_94] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_94] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_96] = "singleStatement ::= 'ConsoleLog' '(' printElements . ')' ';' ";
    artLabelStrings[ARTL_ART_singleStatement_96] = "";
    artlhsL[ARTL_ART_singleStatement_96] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_96] = ARTL_ART_printElements;
    artKindOfs[ARTL_ART_singleStatement_96] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_singleStatement_96] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_97] = "singleStatement ::= 'ConsoleLog' '(' printElements ')' ';' ";
    artLabelStrings[ARTL_ART_singleStatement_97] = "";
    artlhsL[ARTL_ART_singleStatement_97] = ARTL_ART_singleStatement;
    artPopD[ARTL_ART_singleStatement_97] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_98] = "singleStatement ::= 'ConsoleLog' '(' printElements ')' . ';' ";
    artLabelStrings[ARTL_ART_singleStatement_98] = "";
    artlhsL[ARTL_ART_singleStatement_98] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_98] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_singleStatement_98] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_99] = "singleStatement ::= 'ConsoleLog' '(' printElements ')' ';' ";
    artLabelStrings[ARTL_ART_singleStatement_99] = "";
    artlhsL[ARTL_ART_singleStatement_99] = ARTL_ART_singleStatement;
    artPopD[ARTL_ART_singleStatement_99] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_100] = "singleStatement ::= 'ConsoleLog' '(' printElements ')' ';' .";
    artLabelStrings[ARTL_ART_singleStatement_100] = "";
    artlhsL[ARTL_ART_singleStatement_100] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_100] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_singleStatement_100] = true;
    arteoR_pL[ARTL_ART_singleStatement_100] = true;
    artPopD[ARTL_ART_singleStatement_100] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_102] = "singleStatement ::= . '{' statements '}' ";
    artLabelStrings[ARTL_ART_singleStatement_102] = "";
    artlhsL[ARTL_ART_singleStatement_102] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_102] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_103] = "singleStatement ::= '{' statements '}' ";
    artLabelStrings[ARTL_ART_singleStatement_103] = "";
    artlhsL[ARTL_ART_singleStatement_103] = ARTL_ART_singleStatement;
    artLabelInternalStrings[ARTL_ART_singleStatement_104] = "singleStatement ::= '{' . statements '}' ";
    artLabelStrings[ARTL_ART_singleStatement_104] = "";
    artlhsL[ARTL_ART_singleStatement_104] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_104] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_singleStatement_104] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_106] = "singleStatement ::= '{' statements . '}' ";
    artLabelStrings[ARTL_ART_singleStatement_106] = "";
    artlhsL[ARTL_ART_singleStatement_106] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_106] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_singleStatement_106] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_singleStatement_106] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_107] = "singleStatement ::= '{' statements '}' ";
    artLabelStrings[ARTL_ART_singleStatement_107] = "";
    artlhsL[ARTL_ART_singleStatement_107] = ARTL_ART_singleStatement;
    artPopD[ARTL_ART_singleStatement_107] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_108] = "singleStatement ::= '{' statements '}' .";
    artLabelStrings[ARTL_ART_singleStatement_108] = "";
    artlhsL[ARTL_ART_singleStatement_108] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_108] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_singleStatement_108] = true;
    arteoR_pL[ARTL_ART_singleStatement_108] = true;
    artPopD[ARTL_ART_singleStatement_108] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_110] = "singleStatement ::= . mainCall ";
    artLabelStrings[ARTL_ART_singleStatement_110] = "";
    artlhsL[ARTL_ART_singleStatement_110] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_110] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_112] = "singleStatement ::= mainCall .";
    artLabelStrings[ARTL_ART_singleStatement_112] = "";
    artlhsL[ARTL_ART_singleStatement_112] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_112] = ARTL_ART_mainCall;
    artKindOfs[ARTL_ART_singleStatement_112] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_singleStatement_112] = true;
    arteoR_pL[ARTL_ART_singleStatement_112] = true;
    artPopD[ARTL_ART_singleStatement_112] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_114] = "singleStatement ::= . YourAge ";
    artLabelStrings[ARTL_ART_singleStatement_114] = "";
    artlhsL[ARTL_ART_singleStatement_114] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_114] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_116] = "singleStatement ::= YourAge .";
    artLabelStrings[ARTL_ART_singleStatement_116] = "";
    artlhsL[ARTL_ART_singleStatement_116] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_116] = ARTL_ART_YourAge;
    artKindOfs[ARTL_ART_singleStatement_116] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_singleStatement_116] = true;
    arteoR_pL[ARTL_ART_singleStatement_116] = true;
    artPopD[ARTL_ART_singleStatement_116] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_118] = "singleStatement ::= . Country ";
    artLabelStrings[ARTL_ART_singleStatement_118] = "";
    artlhsL[ARTL_ART_singleStatement_118] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_118] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_120] = "singleStatement ::= Country .";
    artLabelStrings[ARTL_ART_singleStatement_120] = "";
    artlhsL[ARTL_ART_singleStatement_120] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_120] = ARTL_ART_Country;
    artKindOfs[ARTL_ART_singleStatement_120] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_singleStatement_120] = true;
    arteoR_pL[ARTL_ART_singleStatement_120] = true;
    artPopD[ARTL_ART_singleStatement_120] = true;
    artLabelInternalStrings[ARTL_ART_singleStatement_122] = "singleStatement ::= . State ";
    artLabelStrings[ARTL_ART_singleStatement_122] = "";
    artlhsL[ARTL_ART_singleStatement_122] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_singleStatement_122] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_singleStatement_124] = "singleStatement ::= State .";
    artLabelStrings[ARTL_ART_singleStatement_124] = "";
    artlhsL[ARTL_ART_singleStatement_124] = ARTL_ART_singleStatement;
    artSlotInstanceOfs[ARTL_ART_singleStatement_124] = ARTL_ART_State;
    artKindOfs[ARTL_ART_singleStatement_124] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_singleStatement_124] = true;
    arteoR_pL[ARTL_ART_singleStatement_124] = true;
    artPopD[ARTL_ART_singleStatement_124] = true;
  }

  public void artTableInitialiser_ART_statements() {
    artLabelInternalStrings[ARTL_ART_statements] = "statements";
    artLabelStrings[ARTL_ART_statements] = "statements";
    artKindOfs[ARTL_ART_statements] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_statements_2] = "statements ::= . singleStatement ";
    artLabelStrings[ARTL_ART_statements_2] = "";
    artlhsL[ARTL_ART_statements_2] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_2] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statements_4] = "statements ::= singleStatement .";
    artLabelStrings[ARTL_ART_statements_4] = "";
    artlhsL[ARTL_ART_statements_4] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_4] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_statements_4] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statements_4] = true;
    arteoR_pL[ARTL_ART_statements_4] = true;
    artPopD[ARTL_ART_statements_4] = true;
    artLabelInternalStrings[ARTL_ART_statements_6] = "statements ::= . singleStatement statements ";
    artLabelStrings[ARTL_ART_statements_6] = "";
    artlhsL[ARTL_ART_statements_6] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_6] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statements_8] = "statements ::= singleStatement . statements ";
    artLabelStrings[ARTL_ART_statements_8] = "";
    artlhsL[ARTL_ART_statements_8] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_8] = ARTL_ART_singleStatement;
    artKindOfs[ARTL_ART_statements_8] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statements_8] = true;
    artLabelInternalStrings[ARTL_ART_statements_10] = "statements ::= singleStatement statements .";
    artLabelStrings[ARTL_ART_statements_10] = "";
    artlhsL[ARTL_ART_statements_10] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_10] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_10] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statements_10] = true;
    arteoR_pL[ARTL_ART_statements_10] = true;
    artPopD[ARTL_ART_statements_10] = true;
  }

  public void artTableInitialiser_ART_subCall() {
    artLabelInternalStrings[ARTL_ART_subCall] = "subCall";
    artLabelStrings[ARTL_ART_subCall] = "subCall";
    artKindOfs[ARTL_ART_subCall] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subCall_168] = "subCall ::= . Health ";
    artLabelStrings[ARTL_ART_subCall_168] = "";
    artlhsL[ARTL_ART_subCall_168] = ARTL_ART_subCall;
    artKindOfs[ARTL_ART_subCall_168] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subCall_170] = "subCall ::= Health .";
    artLabelStrings[ARTL_ART_subCall_170] = "";
    artlhsL[ARTL_ART_subCall_170] = ARTL_ART_subCall;
    artSlotInstanceOfs[ARTL_ART_subCall_170] = ARTL_ART_Health;
    artKindOfs[ARTL_ART_subCall_170] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subCall_170] = true;
    arteoR_pL[ARTL_ART_subCall_170] = true;
    artPopD[ARTL_ART_subCall_170] = true;
  }

  public void artTableInitialiser_ART_subCall2() {
    artLabelInternalStrings[ARTL_ART_subCall2] = "subCall2";
    artLabelStrings[ARTL_ART_subCall2] = "subCall2";
    artKindOfs[ARTL_ART_subCall2] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subCall2_174] = "subCall2 ::= . Symptoms ";
    artLabelStrings[ARTL_ART_subCall2_174] = "";
    artlhsL[ARTL_ART_subCall2_174] = ARTL_ART_subCall2;
    artKindOfs[ARTL_ART_subCall2_174] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subCall2_176] = "subCall2 ::= Symptoms .";
    artLabelStrings[ARTL_ART_subCall2_176] = "";
    artlhsL[ARTL_ART_subCall2_176] = ARTL_ART_subCall2;
    artSlotInstanceOfs[ARTL_ART_subCall2_176] = ARTL_ART_Symptoms;
    artKindOfs[ARTL_ART_subCall2_176] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subCall2_176] = true;
    arteoR_pL[ARTL_ART_subCall2_176] = true;
    artPopD[ARTL_ART_subCall2_176] = true;
  }

  public void artTableInitialiser_ART_subCall3() {
    artLabelInternalStrings[ARTL_ART_subCall3] = "subCall3";
    artLabelStrings[ARTL_ART_subCall3] = "subCall3";
    artKindOfs[ARTL_ART_subCall3] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_subCall3_180] = "subCall3 ::= . Travels ";
    artLabelStrings[ARTL_ART_subCall3_180] = "";
    artlhsL[ARTL_ART_subCall3_180] = ARTL_ART_subCall3;
    artKindOfs[ARTL_ART_subCall3_180] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_subCall3_182] = "subCall3 ::= Travels .";
    artLabelStrings[ARTL_ART_subCall3_182] = "";
    artlhsL[ARTL_ART_subCall3_182] = ARTL_ART_subCall3;
    artSlotInstanceOfs[ARTL_ART_subCall3_182] = ARTL_ART_Travels;
    artKindOfs[ARTL_ART_subCall3_182] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_subCall3_182] = true;
    arteoR_pL[ARTL_ART_subCall3_182] = true;
    artPopD[ARTL_ART_subCall3_182] = true;
  }

  public void artTableInitialise() {
    artLabelInternalStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelInternalStrings[ARTL_EOS] = "ART$";
    artLabelStrings[ARTL_EOS] = " EOS $";
    artLabelInternalStrings[ARTX_DESPATCH] = "ARTX_DESPATCH";
    artLabelStrings[ARTX_DESPATCH] = " DESPATCH";
    artLabelInternalStrings[ARTL_DUMMY] = "ARTL_DUMMY";
    artLabelStrings[ARTL_DUMMY] = " DUMMY";
    artLabelInternalStrings[ARTX_LABEL_EXTENT] = "!!ILLEGAL!!";
    artLabelStrings[ARTX_LABEL_EXTENT] = " ILLEGAL";
    artLabelStrings[ARTL_EPSILON] = "#";
    artLabelInternalStrings[ARTL_EPSILON] = "#";

    artTerminalRequiresWhiteSpace = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalRequiresWhiteSpace, 0, ARTL_EPSILON, false);

    artTerminalCaseInsensitive = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalCaseInsensitive, 0, ARTL_EPSILON, false);

    artlhsL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artlhsL, 0, ARTX_LABEL_EXTENT);
    artlhsL[ARTX_DESPATCH] = ARTX_DESPATCH;

    artKindOfs = new int[ARTX_LABEL_EXTENT + 1];
    artKindOfs[ARTL_EOS] = ARTK_EOS;
    artKindOfs[ARTL_EPSILON] = ARTK_EPSILON;

    artTerminalsFromNonterminals = new boolean[ARTX_LABEL_EXTENT];

    artNonterminalsDeclaredAsTerminals = new boolean[ARTX_LABEL_EXTENT];

    artLonger = new ARTBitSet[ARTX_LABEL_EXTENT + 1];
    for (int i = 0; i < ARTX_LABEL_EXTENT + 1; i++) artLonger[i] = new ARTBitSet();
    artHigher = new ARTBitSet[ARTX_LABEL_EXTENT + 1];
    for (int i = 0; i < ARTX_LABEL_EXTENT + 1; i++) artHigher[i] = new ARTBitSet();

    artAnnotations = new String[ARTX_LABEL_EXTENT];
    artInitialiseStringArray(artAnnotations, 0, ARTX_LABEL_EXTENT, null);

    artPreSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPreSlots, 0, ARTX_LABEL_EXTENT);

    artPostSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPostSlots, 0, ARTX_LABEL_EXTENT);

    artInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artSlotInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artSlotInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artUserNameOfs = new int[ARTX_LABEL_EXTENT + 1];

    artGathers = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artGathers, 0, ARTX_LABEL_EXTENT);

    artFolds = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artFolds, 0, ARTX_LABEL_EXTENT, 0);

    artpL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artpL, 0, ARTX_LABEL_EXTENT);

    artaL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artaL, 0, ARTX_LABEL_EXTENT);

    artcolonL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artcolonL, 0, ARTX_LABEL_EXTENT);

    arteoOPL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoOPL, 0, ARTX_LABEL_EXTENT, false);

    artfiRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiRL, 0, ARTX_LABEL_EXTENT, false);

    artfiPCL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiPCL, 0, ARTX_LABEL_EXTENT, false);

    arteoRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoRL, 0, ARTX_LABEL_EXTENT, false);

    arteoR_pL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoR_pL, 0, ARTX_LABEL_EXTENT, false);

    artPopD = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artPopD, 0, ARTX_LABEL_EXTENT, false);

    artLabelStrings[ARTTB_ID] = "ID";
    artLabelInternalStrings[ARTTB_ID] = "&ID";
    artKindOfs[ARTTB_ID] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_ID] = true;
    artLabelStrings[ARTTB_INTEGER] = "INTEGER";
    artLabelInternalStrings[ARTTB_INTEGER] = "&INTEGER";
    artKindOfs[ARTTB_INTEGER] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_INTEGER] = true;
    artLabelStrings[ARTTB_REAL] = "REAL";
    artLabelInternalStrings[ARTTB_REAL] = "&REAL";
    artKindOfs[ARTTB_REAL] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_REAL] = true;
    artLabelStrings[ARTTB_STRING_DQ] = "STRING_DQ";
    artLabelInternalStrings[ARTTB_STRING_DQ] = "&STRING_DQ";
    artKindOfs[ARTTB_STRING_DQ] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_STRING_DQ] = true;
    artLabelStrings[ARTTS__SHREIK_EQUAL] = "!=";
    artLabelInternalStrings[ARTTS__SHREIK_EQUAL] = "'!='";
    artKindOfs[ARTTS__SHREIK_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SHREIK_EQUAL] = true;
    artLabelStrings[ARTTS__PERCENT] = "%";
    artLabelInternalStrings[ARTTS__PERCENT] = "'%'";
    artKindOfs[ARTTS__PERCENT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PERCENT] = true;
    artLabelStrings[ARTTS__LPAR] = "(";
    artLabelInternalStrings[ARTTS__LPAR] = "'('";
    artKindOfs[ARTTS__LPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LPAR] = true;
    artLabelStrings[ARTTS__RPAR] = ")";
    artLabelInternalStrings[ARTTS__RPAR] = "')'";
    artKindOfs[ARTTS__RPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RPAR] = true;
    artLabelStrings[ARTTS__STAR] = "*";
    artLabelInternalStrings[ARTTS__STAR] = "'*'";
    artKindOfs[ARTTS__STAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__STAR] = true;
    artLabelStrings[ARTTS__STAR_STAR] = "**";
    artLabelInternalStrings[ARTTS__STAR_STAR] = "'**'";
    artKindOfs[ARTTS__STAR_STAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__STAR_STAR] = true;
    artLabelStrings[ARTTS__PLUS] = "+";
    artLabelInternalStrings[ARTTS__PLUS] = "'+'";
    artKindOfs[ARTTS__PLUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PLUS] = true;
    artLabelStrings[ARTTS__COMMA] = ",";
    artLabelInternalStrings[ARTTS__COMMA] = "','";
    artKindOfs[ARTTS__COMMA] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COMMA] = true;
    artLabelStrings[ARTTS__MINUS] = "-";
    artLabelInternalStrings[ARTTS__MINUS] = "'-'";
    artKindOfs[ARTTS__MINUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__MINUS] = true;
    artLabelStrings[ARTTS__SLASH] = "/";
    artLabelInternalStrings[ARTTS__SLASH] = "'/'";
    artKindOfs[ARTTS__SLASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SLASH] = true;
    artLabelStrings[ARTTS__SLASH_SLASH] = "//";
    artLabelInternalStrings[ARTTS__SLASH_SLASH] = "'//'";
    artKindOfs[ARTTS__SLASH_SLASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SLASH_SLASH] = true;
    artLabelStrings[ARTTS__SEMICOLON] = ";";
    artLabelInternalStrings[ARTTS__SEMICOLON] = "';'";
    artKindOfs[ARTTS__SEMICOLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SEMICOLON] = true;
    artLabelStrings[ARTTS__LT] = "<";
    artLabelInternalStrings[ARTTS__LT] = "'<'";
    artKindOfs[ARTTS__LT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LT] = true;
    artLabelStrings[ARTTS__LT_EQUAL] = "<=";
    artLabelInternalStrings[ARTTS__LT_EQUAL] = "'<='";
    artKindOfs[ARTTS__LT_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LT_EQUAL] = true;
    artLabelStrings[ARTTS__EQUAL] = "=";
    artLabelInternalStrings[ARTTS__EQUAL] = "'='";
    artKindOfs[ARTTS__EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__EQUAL] = true;
    artLabelStrings[ARTTS__EQUAL_EQUAL] = "==";
    artLabelInternalStrings[ARTTS__EQUAL_EQUAL] = "'=='";
    artKindOfs[ARTTS__EQUAL_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__EQUAL_EQUAL] = true;
    artLabelStrings[ARTTS__GT] = ">";
    artLabelInternalStrings[ARTTS__GT] = "'>'";
    artKindOfs[ARTTS__GT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__GT] = true;
    artLabelStrings[ARTTS__GT_EQUAL] = ">=";
    artLabelInternalStrings[ARTTS__GT_EQUAL] = "'>='";
    artKindOfs[ARTTS__GT_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__GT_EQUAL] = true;
    artLabelStrings[ARTTS_Asthma] = "Asthma";
    artLabelInternalStrings[ARTTS_Asthma] = "'Asthma'";
    artKindOfs[ARTTS_Asthma] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Asthma] = true;
    artLabelStrings[ARTTS_Chad] = "Chad";
    artLabelInternalStrings[ARTTS_Chad] = "'Chad'";
    artKindOfs[ARTTS_Chad] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Chad] = true;
    artLabelStrings[ARTTS_China] = "China";
    artLabelInternalStrings[ARTTS_China] = "'China'";
    artKindOfs[ARTTS_China] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_China] = true;
    artLabelStrings[ARTTS_ConsoleLog] = "ConsoleLog";
    artLabelInternalStrings[ARTTS_ConsoleLog] = "'ConsoleLog'";
    artKindOfs[ARTTS_ConsoleLog] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_ConsoleLog] = true;
    artLabelStrings[ARTTS_Cough] = "Cough";
    artLabelInternalStrings[ARTTS_Cough] = "'Cough'";
    artKindOfs[ARTTS_Cough] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Cough] = true;
    artLabelStrings[ARTTS_Country] = "Country";
    artLabelInternalStrings[ARTTS_Country] = "'Country'";
    artKindOfs[ARTTS_Country] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Country] = true;
    artLabelStrings[ARTTS_Diabetic] = "Diabetic";
    artLabelInternalStrings[ARTTS_Diabetic] = "'Diabetic'";
    artKindOfs[ARTTS_Diabetic] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Diabetic] = true;
    artLabelStrings[ARTTS_Female] = "Female";
    artLabelInternalStrings[ARTTS_Female] = "'Female'";
    artKindOfs[ARTTS_Female] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Female] = true;
    artLabelStrings[ARTTS_Fever] = "Fever";
    artLabelInternalStrings[ARTTS_Fever] = "'Fever'";
    artKindOfs[ARTTS_Fever] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Fever] = true;
    artLabelStrings[ARTTS_Gender] = "Gender";
    artLabelInternalStrings[ARTTS_Gender] = "'Gender'";
    artKindOfs[ARTTS_Gender] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Gender] = true;
    artLabelStrings[ARTTS_HelpMeWithCovid19] = "HelpMeWithCovid19";
    artLabelInternalStrings[ARTTS_HelpMeWithCovid19] = "'HelpMeWithCovid19'";
    artKindOfs[ARTTS_HelpMeWithCovid19] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_HelpMeWithCovid19] = true;
    artLabelStrings[ARTTS_High_Blood_Pressure] = "High_Blood_Pressure";
    artLabelInternalStrings[ARTTS_High_Blood_Pressure] = "'High_Blood_Pressure'";
    artKindOfs[ARTTS_High_Blood_Pressure] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_High_Blood_Pressure] = true;
    artLabelStrings[ARTTS_Italy] = "Italy";
    artLabelInternalStrings[ARTTS_Italy] = "'Italy'";
    artKindOfs[ARTTS_Italy] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Italy] = true;
    artLabelStrings[ARTTS_Japan] = "Japan";
    artLabelInternalStrings[ARTTS_Japan] = "'Japan'";
    artKindOfs[ARTTS_Japan] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Japan] = true;
    artLabelStrings[ARTTS_Male] = "Male";
    artLabelInternalStrings[ARTTS_Male] = "'Male'";
    artKindOfs[ARTTS_Male] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Male] = true;
    artLabelStrings[ARTTS_Shortness_Of_Breath] = "Shortness_Of_Breath";
    artLabelInternalStrings[ARTTS_Shortness_Of_Breath] = "'Shortness_Of_Breath'";
    artKindOfs[ARTTS_Shortness_Of_Breath] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Shortness_Of_Breath] = true;
    artLabelStrings[ARTTS_Spain] = "Spain";
    artLabelInternalStrings[ARTTS_Spain] = "'Spain'";
    artKindOfs[ARTTS_Spain] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Spain] = true;
    artLabelStrings[ARTTS_State] = "State";
    artLabelInternalStrings[ARTTS_State] = "'State'";
    artKindOfs[ARTTS_State] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_State] = true;
    artLabelStrings[ARTTS_Transgender] = "Transgender";
    artLabelInternalStrings[ARTTS_Transgender] = "'Transgender'";
    artKindOfs[ARTTS_Transgender] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Transgender] = true;
    artLabelStrings[ARTTS_UK] = "UK";
    artLabelInternalStrings[ARTTS_UK] = "'UK'";
    artKindOfs[ARTTS_UK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_UK] = true;
    artLabelStrings[ARTTS_USA] = "USA";
    artLabelInternalStrings[ARTTS_USA] = "'USA'";
    artKindOfs[ARTTS_USA] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_USA] = true;
    artLabelStrings[ARTTS_Weak_Immune] = "Weak_Immune";
    artLabelInternalStrings[ARTTS_Weak_Immune] = "'Weak_Immune'";
    artKindOfs[ARTTS_Weak_Immune] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Weak_Immune] = true;
    artLabelStrings[ARTTS_YourAge] = "YourAge";
    artLabelInternalStrings[ARTTS_YourAge] = "'YourAge'";
    artKindOfs[ARTTS_YourAge] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_YourAge] = true;
    artLabelStrings[ARTTS_doThis] = "doThis";
    artLabelInternalStrings[ARTTS_doThis] = "'doThis'";
    artKindOfs[ARTTS_doThis] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_doThis] = true;
    artLabelStrings[ARTTS_else] = "else";
    artLabelInternalStrings[ARTTS_else] = "'else'";
    artKindOfs[ARTTS_else] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_else] = true;
    artLabelStrings[ARTTS_if] = "if";
    artLabelInternalStrings[ARTTS_if] = "'if'";
    artKindOfs[ARTTS_if] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_if] = true;
    artLabelStrings[ARTTS_runThis] = "runThis";
    artLabelInternalStrings[ARTTS_runThis] = "'runThis'";
    artKindOfs[ARTTS_runThis] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_runThis] = true;
    artLabelStrings[ARTTS_userHealth] = "userHealth";
    artLabelInternalStrings[ARTTS_userHealth] = "'userHealth'";
    artKindOfs[ARTTS_userHealth] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_userHealth] = true;
    artLabelStrings[ARTTS_userSymptoms] = "userSymptoms";
    artLabelInternalStrings[ARTTS_userSymptoms] = "'userSymptoms'";
    artKindOfs[ARTTS_userSymptoms] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_userSymptoms] = true;
    artLabelStrings[ARTTS_userTravels] = "userTravels";
    artLabelInternalStrings[ARTTS_userTravels] = "'userTravels'";
    artKindOfs[ARTTS_userTravels] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_userTravels] = true;
    artLabelStrings[ARTTS_while] = "while";
    artLabelInternalStrings[ARTTS_while] = "'while'";
    artKindOfs[ARTTS_while] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_while] = true;
    artLabelStrings[ARTTS__LBRACE] = "{";
    artLabelInternalStrings[ARTTS__LBRACE] = "'{'";
    artKindOfs[ARTTS__LBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LBRACE] = true;
    artLabelStrings[ARTTS__RBRACE] = "}";
    artLabelInternalStrings[ARTTS__RBRACE] = "'}'";
    artKindOfs[ARTTS__RBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RBRACE] = true;
    artTableInitialiser_ART_Comments();
    artTableInitialiser_ART_Country();
    artTableInitialiser_ART_Health();
    artTableInitialiser_ART_HealthType();
    artTableInitialiser_ART_ID();
    artTableInitialiser_ART_INTEGER();
    artTableInitialiser_ART_REAL();
    artTableInitialiser_ART_STRING_DQ();
    artTableInitialiser_ART_State();
    artTableInitialiser_ART_Symptoms();
    artTableInitialiser_ART_SymptomsType();
    artTableInitialiser_ART_Travels();
    artTableInitialiser_ART_TravelsType();
    artTableInitialiser_ART_YourAge();
    artTableInitialiser_ART_e0();
    artTableInitialiser_ART_e1();
    artTableInitialiser_ART_e2();
    artTableInitialiser_ART_e3();
    artTableInitialiser_ART_e4();
    artTableInitialiser_ART_e5();
    artTableInitialiser_ART_elseOpt();
    artTableInitialiser_ART_genderType();
    artTableInitialiser_ART_mainCall();
    artTableInitialiser_ART_printElements();
    artTableInitialiser_ART_singleStatement();
    artTableInitialiser_ART_statements();
    artTableInitialiser_ART_subCall();
    artTableInitialiser_ART_subCall2();
    artTableInitialiser_ART_subCall3();
  }

  public ARTGeneratedParser(ARTLexerBase artLexerBase) {
    this(null, artLexerBase);
  }

  public ARTGeneratedParser(ARTGrammar artGrammar, ARTLexerBase artLexerBase) {
    super(artGrammar, artLexerBase);
    artFirstTerminalLabel = ARTTS__SHREIK_EQUAL;
    artFirstUnusedLabel = ARTX_LABEL_EXTENT + 1;
    artSetExtent = ARTX_EPSILON + 1;
    ARTL_EOS = ARTX_EOS;
    ARTL_EPSILON = ARTX_EPSILON;
    ARTL_DUMMY = ARTX_DUMMY;
    artGrammarKind = ARTModeGrammarKind.BNF;
    artDefaultStartSymbolLabel = ARTL_ART_statements;
    artBuildOptions = "ARTOptionBlock [verbosityLevel=0, statistics=false, trace=false, inputFilenames=[], phaseModule=true, phaseLex=true, phasePreChoose=true, phaseParse=true, phasePostChoose=true, phaseDerivationSelect=true, phaseGIFT=true, phaseAG=true, phaseTR=true, phaseSOS=true, showTWE=false, showBSR=false, showSPPFFull=false, showSPPFCore=false, showDT=false, showGIFT=false, showAG=false, showTR=false, showSOS=false, ebnfClosureLeft=false, ebnfClosureRight=false, ebnfMultiplyOut=false, ebnfLeftFactor=false, ebnfBracketToNonterminal=false, lexWSSuffix=false, lexExtents=false, lexSegments=false, lexRecursive=false, lexPrintTWESet=false, lexDFA=false, lexCFRecognise=false, lexCFParse=true, lexDead=false, lexLongestWithin=false, lexLongestAcross=false, lexPriority=false, postLongestWithin=false, postLongestAcross=false, postPriority=false, outputDirectory=., parserName=ARTGeneratedParser, lexerName=ARTGeneratedLexer, namespace=null, despatchMode=fragment, supportMode=HashPool, targetLanguageMode=Java, predictivePops=false, FIFODescriptors=false, suppressPopGuard=false, suppressProductionGuard=false, suppressTestRepeat=false, suppressSemantics=false, clusteredGSS=false, mGLL=false, algorithmMode=gllGeneratorPool, treeLevel=3]";
    artFIFODescriptors = false;
    artSetInitialise();
    artTableInitialise();
  }

  private ARTGLLRDT artRDT;
  private int artNextFreeNodeNumber = 1;

HashMap<String, Integer> intVariables = new HashMap<String, Integer>();
HashMap<String, String> strVariables = new HashMap<String, String>();
HashMap<String, ARTGLLRDTHandle> userData = new HashMap<String, ARTGLLRDTHandle>();
CovidMain cM = new CovidMain();

  public static class ARTAT_ART_HealthType extends ARTGLLAttributeBlock {
    protected HealthEnums v;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_ID extends ARTGLLAttributeBlock {
    protected int rightExtent;
    protected int leftExtent;
    protected String lexeme;
    protected String v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_INTEGER extends ARTGLLAttributeBlock {
    protected int v;
    protected int rightExtent;
    protected int leftExtent;
    protected String lexeme;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
      return ret + " ";
}
  }

  public static class ARTAT_ART_REAL extends ARTGLLAttributeBlock {
    protected int rightExtent;
    protected int leftExtent;
    protected String lexeme;
    protected double v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_STRING_DQ extends ARTGLLAttributeBlock {
    protected int rightExtent;
    protected int leftExtent;
    protected String lexeme;
    protected String v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_SymptomsType extends ARTGLLAttributeBlock {
    protected SymptomsEnums v;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_TravelsType extends ARTGLLAttributeBlock {
    protected TravelsEnums v;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e0 extends ARTGLLAttributeBlock {
    protected int v;
    ARTGLLRDTHandle e11;
    ARTGLLRDTHandle e12;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e1 extends ARTGLLAttributeBlock {
    protected int v;
    ARTGLLRDTHandle e11;
    ARTGLLRDTHandle e21;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e2 extends ARTGLLAttributeBlock {
    protected int v;
    ARTGLLRDTHandle e21;
    ARTGLLRDTHandle e31;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e3 extends ARTGLLAttributeBlock {
    protected int v;
    ARTGLLRDTHandle e31;
    ARTGLLRDTHandle e41;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e4 extends ARTGLLAttributeBlock {
    protected int v;
    ARTGLLRDTHandle e41;
    ARTGLLRDTHandle e51;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_e5 extends ARTGLLAttributeBlock {
    protected int v;
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle INTEGER1;
    ARTGLLRDTHandle e11;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_elseOpt extends ARTGLLAttributeBlock {
    ARTGLLRDTHandle singleStatement1;
    public String toString() {
      String ret = "";
      return ret + " ";
}
  }

  public static class ARTAT_ART_genderType extends ARTGLLAttributeBlock {
    protected GenderEnums v;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_singleStatement extends ARTGLLAttributeBlock {
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle e01;
    ARTGLLRDTHandle elseOpt1;
    ARTGLLRDTHandle singleStatement1;
    public String toString() {
      String ret = "";
      return ret + " ";
}
  }

  public static class ARTAT_ART_subCall extends ARTGLLAttributeBlock {
    protected int rightExtent;
    protected int leftExtent;
    protected String v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_subCall2 extends ARTGLLAttributeBlock {
    protected int rightExtent;
    protected int leftExtent;
    protected String v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_subCall3 extends ARTGLLAttributeBlock {
    protected int rightExtent;
    protected int leftExtent;
    protected String v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public void ARTRD_Comments(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
      /*Comments ::= '//' .*/
      case ARTL_ART_Comments_364: 
                ARTRD_Comments(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
        artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
                break;
        default:
          throw new ARTException("ARTRD_Comments: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_Country(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_STRING_DQ STRING_DQ1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*Country ::= 'Country' STRING_DQ .*/
    case ARTL_ART_Country_350: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
       cM.setUserCountry(STRING_DQ1.v); 
      break;
        default:
          throw new ARTException("ARTRD_Country: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_Health(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*Health ::= 'Diabetic' .*/
    case ARTL_ART_Health_212: 
            ARTRD_Health(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*Health ::= 'High_Blood_Pressure' .*/
    case ARTL_ART_Health_216: 
            ARTRD_Health(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*Health ::= 'Asthma' .*/
    case ARTL_ART_Health_220: 
            ARTRD_Health(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*Health ::= 'Weak_Immune' .*/
    case ARTL_ART_Health_224: 
            ARTRD_Health(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_Health: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_HealthType(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_HealthType HealthType) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*HealthType ::= # .*/
    case ARTL_ART_HealthType_188: 
            ARTRD_HealthType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, HealthType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       HealthType.v = HealthEnums.NONE; 
      break;
    /*HealthType ::= 'Diabetic' .*/
    case ARTL_ART_HealthType_194: 
            ARTRD_HealthType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, HealthType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       HealthType.v = HealthEnums.DIABETIC; 
      break;
    /*HealthType ::= 'High_Blood_Pressure' .*/
    case ARTL_ART_HealthType_200: 
            ARTRD_HealthType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, HealthType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       HealthType.v = HealthEnums.HIGH_BLOOD_PRESSURE; 
      break;
    /*HealthType ::= 'Asthma' .*/
    case ARTL_ART_HealthType_206: 
            ARTRD_HealthType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, HealthType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       HealthType.v = HealthEnums.ASTHMA; 
      break;
        default:
          throw new ARTException("ARTRD_HealthType: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ID(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ID ::= &ID .*/
    case ARTL_ART_ID_588: 
            ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ID.lexeme = artLexeme(ID.leftExtent, ID.rightExtent); ID.v = artLexemeAsID(ID.leftExtent, ID.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_ID: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_INTEGER(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*INTEGER ::= &INTEGER .*/
    case ARTL_ART_INTEGER_594: 
            ARTRD_INTEGER(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      INTEGER.lexeme = artLexeme(INTEGER.leftExtent, INTEGER.rightExtent); INTEGER.v = artLexemeAsInteger(INTEGER.leftExtent, INTEGER.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_INTEGER: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_REAL(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_REAL REAL) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*REAL ::= &REAL .*/
    case ARTL_ART_REAL_600: 
            ARTRD_REAL(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, REAL);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      REAL.lexeme = artLexeme(REAL.leftExtent, REAL.rightExtent); REAL.v = artLexemeAsInteger(REAL.leftExtent, REAL.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_REAL: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_STRING_DQ(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_STRING_DQ STRING_DQ) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*STRING_DQ ::= &STRING_DQ .*/
    case ARTL_ART_STRING_DQ_606: 
            ARTRD_STRING_DQ(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      STRING_DQ.lexeme = artLexeme(STRING_DQ.leftExtent, STRING_DQ.rightExtent); STRING_DQ.v = artLexemeAsString(STRING_DQ.leftExtent, STRING_DQ.rightExtent); 
      break;
        default:
          throw new ARTException("ARTRD_STRING_DQ: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_State(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_STRING_DQ STRING_DQ1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*State ::= 'State' STRING_DQ .*/
    case ARTL_ART_State_358: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
       cM.setUserState(STRING_DQ1.v); 
      break;
        default:
          throw new ARTException("ARTRD_State: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_Symptoms(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*Symptoms ::= 'Cough' .*/
    case ARTL_ART_Symptoms_252: 
            ARTRD_Symptoms(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*Symptoms ::= 'Shortness_Of_Breath' .*/
    case ARTL_ART_Symptoms_256: 
            ARTRD_Symptoms(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*Symptoms ::= 'Fever' .*/
    case ARTL_ART_Symptoms_260: 
            ARTRD_Symptoms(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_Symptoms: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_SymptomsType(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_SymptomsType SymptomsType) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*SymptomsType ::= # .*/
    case ARTL_ART_SymptomsType_264: 
            ARTRD_SymptomsType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, SymptomsType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       SymptomsType.v = SymptomsEnums.NONE; 
      break;
    /*SymptomsType ::= 'Cough' .*/
    case ARTL_ART_SymptomsType_270: 
            ARTRD_SymptomsType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, SymptomsType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       SymptomsType.v = SymptomsEnums.COUGH; 
      break;
    /*SymptomsType ::= 'Shortness_Of_Breath' .*/
    case ARTL_ART_SymptomsType_276: 
            ARTRD_SymptomsType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, SymptomsType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       SymptomsType.v = SymptomsEnums.SHORTNESS_OF_BREATH; 
      break;
    /*SymptomsType ::= 'Fever' .*/
    case ARTL_ART_SymptomsType_282: 
            ARTRD_SymptomsType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, SymptomsType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       SymptomsType.v = SymptomsEnums.FEVER; 
      break;
        default:
          throw new ARTException("ARTRD_SymptomsType: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_Travels(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*Travels ::= 'USA' .*/
    case ARTL_ART_Travels_288: 
            ARTRD_Travels(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*Travels ::= 'Chad' .*/
    case ARTL_ART_Travels_292: 
            ARTRD_Travels(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*Travels ::= 'China' .*/
    case ARTL_ART_Travels_296: 
            ARTRD_Travels(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*Travels ::= 'UK' .*/
    case ARTL_ART_Travels_300: 
            ARTRD_Travels(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*Travels ::= 'Spain' .*/
    case ARTL_ART_Travels_304: 
            ARTRD_Travels(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*Travels ::= 'Japan' .*/
    case ARTL_ART_Travels_308: 
            ARTRD_Travels(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*Travels ::= 'Italy' .*/
    case ARTL_ART_Travels_312: 
            ARTRD_Travels(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_Travels: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_TravelsType(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_TravelsType TravelsType) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*TravelsType ::= # .*/
    case ARTL_ART_TravelsType_316: 
            ARTRD_TravelsType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, TravelsType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       TravelsType.v = TravelsEnums.NONE; 
      break;
    /*TravelsType ::= 'USA' .*/
    case ARTL_ART_TravelsType_322: 
            ARTRD_TravelsType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, TravelsType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       TravelsType.v = TravelsEnums.USA; 
      break;
    /*TravelsType ::= 'Italy' .*/
    case ARTL_ART_TravelsType_328: 
            ARTRD_TravelsType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, TravelsType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       TravelsType.v = TravelsEnums.ITALY; 
      break;
    /*TravelsType ::= 'China' .*/
    case ARTL_ART_TravelsType_334: 
            ARTRD_TravelsType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, TravelsType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       TravelsType.v = TravelsEnums.CHINA; 
      break;
        default:
          throw new ARTException("ARTRD_TravelsType: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_YourAge(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*YourAge ::= 'YourAge' INTEGER .*/
    case ARTL_ART_YourAge_342: 
      INTEGER1 = new ARTAT_ART_INTEGER();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
       if (INTEGER1.v < 0 || INTEGER1.v > 123)
     artText.println(ARTTextLevel.WARNING, "That's not your age. Even Guinness world record record is 122 " + INTEGER1.v);
    else
      cM.setUserAge(INTEGER1.v);
 
      break;
        default:
          throw new ARTException("ARTRD_YourAge: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_e0(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_e0 e0, ARTAT_ART_e1 e11, ARTAT_ART_e1 e12) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*e0 ::= e1 .*/
    case ARTL_ART_e0_400: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
       e0.v = e11.v; 
      break;
    /*e0 ::= e1 '>' . e1 */
    case ARTL_ART_e0_408: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '>' e1 .*/
    case ARTL_ART_e0_410: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v >  e12.v ? 1 : 0; 
      break;
    /*e0 ::= e1 '<' . e1 */
    case ARTL_ART_e0_418: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '<' e1 .*/
    case ARTL_ART_e0_420: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v <  e12.v ? 1 : 0; 
      break;
    /*e0 ::= e1 '>=' . e1 */
    case ARTL_ART_e0_428: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '>=' e1 .*/
    case ARTL_ART_e0_430: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v >= e12.v ? 1 : 0; 
      break;
    /*e0 ::= e1 '<=' . e1 */
    case ARTL_ART_e0_438: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '<=' e1 .*/
    case ARTL_ART_e0_440: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v <= e12.v ? 1 : 0; 
      break;
    /*e0 ::= e1 '==' . e1 */
    case ARTL_ART_e0_448: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '==' e1 .*/
    case ARTL_ART_e0_450: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v == e12.v ? 1 : 0; 
      break;
    /*e0 ::= e1 '!=' . e1 */
    case ARTL_ART_e0_458: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e0 ::= e1 '!=' e1 .*/
    case ARTL_ART_e0_460: 
      e11 = new ARTAT_ART_e1();
      e12 = new ARTAT_ART_e1();
            ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e0, e11, e12);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e12));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e12, null, null);
       e0.v = e11.v != e12.v ? 1 : 0; 
      break;
        default:
          throw new ARTException("ARTRD_e0: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_e1(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_e1 e1, ARTAT_ART_e1 e11, ARTAT_ART_e2 e21) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*e1 ::= e2 .*/
    case ARTL_ART_e1_466: 
      e11 = new ARTAT_ART_e1();
      e21 = new ARTAT_ART_e2();
            ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e1, e11, e21);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
       e1.v = e21.v; 
      break;
    /*e1 ::= e1 '+' . e2 */
    case ARTL_ART_e1_474: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e1 ::= e1 '+' e2 .*/
    case ARTL_ART_e1_476: 
      e11 = new ARTAT_ART_e1();
      e21 = new ARTAT_ART_e2();
            ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e1, e11, e21);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
       e1.v = e11.v + e21.v; 
      break;
    /*e1 ::= e1 '-' . e2 */
    case ARTL_ART_e1_484: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e1 ::= e1 '-' e2 .*/
    case ARTL_ART_e1_486: 
      e11 = new ARTAT_ART_e1();
      e21 = new ARTAT_ART_e2();
            ARTRD_e1(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e1, e11, e21);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
       e1.v = e11.v - e21.v; 
      break;
        default:
          throw new ARTException("ARTRD_e1: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_e2(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_e2 e2, ARTAT_ART_e2 e21, ARTAT_ART_e3 e31) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*e2 ::= e3 .*/
    case ARTL_ART_e2_492: 
      e21 = new ARTAT_ART_e2();
      e31 = new ARTAT_ART_e3();
            ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e2, e21, e31);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
       e2.v= e31.v; 
      break;
    /*e2 ::= e2 '*' . e3 */
    case ARTL_ART_e2_500: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e2 ::= e2 '*' e3 .*/
    case ARTL_ART_e2_502: 
      e21 = new ARTAT_ART_e2();
      e31 = new ARTAT_ART_e3();
            ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e2, e21, e31);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
       e2.v = e21.v * e31.v; 
      break;
    /*e2 ::= e2 '/' . e3 */
    case ARTL_ART_e2_510: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e2 ::= e2 '/' e3 .*/
    case ARTL_ART_e2_512: 
      e21 = new ARTAT_ART_e2();
      e31 = new ARTAT_ART_e3();
            ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e2, e21, e31);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
       e2.v = e21.v / e31.v; 
      break;
    /*e2 ::= e2 '%' . e3 */
    case ARTL_ART_e2_520: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e21));
      ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e21, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e2 ::= e2 '%' e3 .*/
    case ARTL_ART_e2_522: 
      e21 = new ARTAT_ART_e2();
      e31 = new ARTAT_ART_e3();
            ARTRD_e2(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e2, e21, e31);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
       e2.v = e21.v % e31.v; 
      break;
        default:
          throw new ARTException("ARTRD_e2: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_e3(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_e3 e3, ARTAT_ART_e3 e31, ARTAT_ART_e4 e41) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*e3 ::= e4 .*/
    case ARTL_ART_e3_528: 
      e31 = new ARTAT_ART_e3();
      e41 = new ARTAT_ART_e4();
            ARTRD_e3(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e3, e31, e41);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e41));
      ARTRD_e4(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e41, null, null);
      e3.v = e41.v; 
      break;
    /*e3 ::= '+' e3 .*/
    case ARTL_ART_e3_536: 
      e31 = new ARTAT_ART_e3();
      e41 = new ARTAT_ART_e4();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
      e3.v = e41.v; 
      break;
    /*e3 ::= '-' e3 .*/
    case ARTL_ART_e3_544: 
      e31 = new ARTAT_ART_e3();
      e41 = new ARTAT_ART_e4();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e31));
      ARTRD_e3(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e31, null, null);
      e3.v = -e41.v; 
      break;
        default:
          throw new ARTException("ARTRD_e3: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_e4(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_e4 e4, ARTAT_ART_e4 e41, ARTAT_ART_e5 e51) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*e4 ::= e5 .*/
    case ARTL_ART_e4_550: 
      e41 = new ARTAT_ART_e4();
      e51 = new ARTAT_ART_e5();
            ARTRD_e4(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e4, e41, e51);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e51));
      ARTRD_e5(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e51, null, null, null);
       e4.v = e51.v; 
      break;
    /*e4 ::= e5 '**' . e4 */
    case ARTL_ART_e4_558: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e51));
      ARTRD_e5(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e51, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*e4 ::= e5 '**' e4 .*/
    case ARTL_ART_e4_560: 
      e41 = new ARTAT_ART_e4();
      e51 = new ARTAT_ART_e5();
            ARTRD_e4(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e4, e41, e51);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e41));
      ARTRD_e4(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e41, null, null);
      e4.v = (int) Math.pow(e51.v, e41.v); 
      break;
        default:
          throw new ARTException("ARTRD_e4: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_e5(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_e5 e5, ARTAT_ART_ID ID1, ARTAT_ART_INTEGER INTEGER1, ARTAT_ART_e1 e11) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*e5 ::= INTEGER .*/
    case ARTL_ART_e5_566: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
      e11 = new ARTAT_ART_e1();
            ARTRD_e5(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e5, ID1, INTEGER1, e11);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
      e5.v = INTEGER1.v; 
      break;
    /*e5 ::= ID .*/
    case ARTL_ART_e5_572: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
      e11 = new ARTAT_ART_e1();
            ARTRD_e5(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e5, ID1, INTEGER1, e11);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
       e5.v = intVariables.get(ID1.v); 
      break;
    /*e5 ::= '(' e1 . ')' */
    case ARTL_ART_e5_580: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e11));
      ARTRD_e1(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e11, null, null);
       e5.v = e11.v; 
      break;
    /*e5 ::= '(' e1 ')' .*/
    case ARTL_ART_e5_584: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
      e11 = new ARTAT_ART_e1();
            ARTRD_e5(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, e5, ID1, INTEGER1, e11);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_e5: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_elseOpt(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_singleStatement singleStatement1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*elseOpt ::= 'else' singleStatement .*/
    case ARTL_ART_elseOpt_130: 
      singleStatement1 = new ARTAT_ART_singleStatement();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_singleStatement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, singleStatement1, null, null, null, null);
            break;
    /*elseOpt ::= # .*/
    case ARTL_ART_elseOpt_134: 
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_elseOpt(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_elseOpt: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_genderType(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_genderType genderType) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*genderType ::= # .*/
    case ARTL_ART_genderType_228: 
            ARTRD_genderType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, genderType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       genderType.v = GenderEnums.NONE; 
      break;
    /*genderType ::= 'Male' .*/
    case ARTL_ART_genderType_234: 
            ARTRD_genderType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, genderType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       genderType.v = GenderEnums.MALE; 
      break;
    /*genderType ::= 'Female' .*/
    case ARTL_ART_genderType_240: 
            ARTRD_genderType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, genderType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       genderType.v = GenderEnums.FEMALE; 
      break;
    /*genderType ::= 'Transgender' .*/
    case ARTL_ART_genderType_246: 
            ARTRD_genderType(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, genderType);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       genderType.v = GenderEnums.TRANSGENDER; 
      break;
        default:
          throw new ARTException("ARTRD_genderType: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_mainCall(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_HealthType HealthType1, ARTAT_ART_SymptomsType SymptomsType1, ARTAT_ART_TravelsType TravelsType1, ARTAT_ART_genderType genderType1, ARTAT_ART_subCall subCall1, ARTAT_ART_subCall2 subCall21, ARTAT_ART_subCall3 subCall31) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*mainCall ::= 'Gender' genderType .*/
    case ARTL_ART_mainCall_140: 
      HealthType1 = new ARTAT_ART_HealthType();
      SymptomsType1 = new ARTAT_ART_SymptomsType();
      TravelsType1 = new ARTAT_ART_TravelsType();
      genderType1 = new ARTAT_ART_genderType();
      subCall1 = new ARTAT_ART_subCall();
      subCall21 = new ARTAT_ART_subCall2();
      subCall31 = new ARTAT_ART_subCall3();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), genderType1));
      ARTRD_genderType(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, genderType1);
       cM.setGender(genderType1.v);
      break;
    /*mainCall ::= subCall HealthType .*/
    case ARTL_ART_mainCall_148: 
      HealthType1 = new ARTAT_ART_HealthType();
      SymptomsType1 = new ARTAT_ART_SymptomsType();
      TravelsType1 = new ARTAT_ART_TravelsType();
      genderType1 = new ARTAT_ART_genderType();
      subCall1 = new ARTAT_ART_subCall();
      subCall21 = new ARTAT_ART_subCall2();
      subCall31 = new ARTAT_ART_subCall3();
            subCall1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      subCall1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subCall1));
      ARTRD_subCall(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subCall1);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), HealthType1));
      ARTRD_HealthType(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, HealthType1);
       cM.setHealth(subCall1.v); 
      break;
    /*mainCall ::= subCall2 SymptomsType .*/
    case ARTL_ART_mainCall_156: 
      HealthType1 = new ARTAT_ART_HealthType();
      SymptomsType1 = new ARTAT_ART_SymptomsType();
      TravelsType1 = new ARTAT_ART_TravelsType();
      genderType1 = new ARTAT_ART_genderType();
      subCall1 = new ARTAT_ART_subCall();
      subCall21 = new ARTAT_ART_subCall2();
      subCall31 = new ARTAT_ART_subCall3();
            subCall21.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      subCall21.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subCall21));
      ARTRD_subCall2(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subCall21);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), SymptomsType1));
      ARTRD_SymptomsType(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, SymptomsType1);
       cM.setSymptoms(subCall21.v); 
      break;
    /*mainCall ::= subCall3 TravelsType .*/
    case ARTL_ART_mainCall_164: 
      HealthType1 = new ARTAT_ART_HealthType();
      SymptomsType1 = new ARTAT_ART_SymptomsType();
      TravelsType1 = new ARTAT_ART_TravelsType();
      genderType1 = new ARTAT_ART_genderType();
      subCall1 = new ARTAT_ART_subCall();
      subCall21 = new ARTAT_ART_subCall2();
      subCall31 = new ARTAT_ART_subCall3();
            subCall31.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      subCall31.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), subCall31));
      ARTRD_subCall3(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, subCall31);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), TravelsType1));
      ARTRD_TravelsType(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, TravelsType1);
       cM.setTravels(subCall31.v); 
      break;
        default:
          throw new ARTException("ARTRD_mainCall: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_printElements(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_STRING_DQ STRING_DQ1, ARTAT_ART_e0 e01) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*printElements ::= STRING_DQ .*/
    case ARTL_ART_printElements_368: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      e01 = new ARTAT_ART_e0();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, e01);
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
       artText.printf("%s", STRING_DQ1.v); 
      break;
    /*printElements ::= STRING_DQ ',' . printElements */
    case ARTL_ART_printElements_378: 
      STRING_DQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      STRING_DQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), STRING_DQ1));
      ARTRD_STRING_DQ(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, STRING_DQ1);
       artText.printf("%s", STRING_DQ1.v); 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*printElements ::= STRING_DQ ',' printElements .*/
    case ARTL_ART_printElements_380: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      e01 = new ARTAT_ART_e0();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, e01);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_printElements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*printElements ::= e0 .*/
    case ARTL_ART_printElements_384: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      e01 = new ARTAT_ART_e0();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, e01);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e01));
      ARTRD_e0(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e01, null, null);
       artText.printf("%d", e01.v); 
      break;
    /*printElements ::= e0 ',' . printElements */
    case ARTL_ART_printElements_394: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), e01));
      ARTRD_e0(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, e01, null, null);
       artText.printf("%d", e01.v); 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*printElements ::= e0 ',' printElements .*/
    case ARTL_ART_printElements_396: 
      STRING_DQ1 = new ARTAT_ART_STRING_DQ();
      e01 = new ARTAT_ART_e0();
            ARTRD_printElements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_DQ1, e01);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_printElements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
        default:
          throw new ARTException("ARTRD_printElements: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_singleStatement(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_singleStatement singleStatement, ARTAT_ART_ID ID1, ARTAT_ART_e0 e01, ARTAT_ART_elseOpt elseOpt1, ARTAT_ART_singleStatement singleStatement1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*singleStatement ::= ID '=' . e0 ';' */
    case ARTL_ART_singleStatement_16: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*singleStatement ::= ID '=' e0 . ';' */
    case ARTL_ART_singleStatement_18: 
      ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e01));
      ARTRD_e0(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e01, null, null);
            break;
    /*singleStatement ::= ID '=' e0 ';' .*/
    case ARTL_ART_singleStatement_20: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       intVariables.put(ID1.v, e01.v); 
      break;
    /*singleStatement ::= 'if' e0 . 'doThis' singleStatement elseOpt */
    case ARTL_ART_singleStatement_28: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e01));
      ARTRD_e0(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, e01, null, null);
            break;
    /*singleStatement ::= 'if' e0 'doThis' . singleStatement elseOpt */
    case ARTL_ART_singleStatement_30: 
      ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*singleStatement ::= 'if' e0 'doThis' singleStatement . elseOpt */
    case ARTL_ART_singleStatement_32: 
      ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      singleStatement.singleStatement1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*singleStatement ::= 'if' e0 'doThis' singleStatement elseOpt .*/
    case ARTL_ART_singleStatement_34: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      singleStatement.elseOpt1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
       if (e01.v != 0)
                  artEvaluate(singleStatement.singleStatement1, singleStatement);
                else
                  artEvaluate(singleStatement.elseOpt1, elseOpt1);
              
      break;
    /*singleStatement ::= 'while' e0 . 'runThis' singleStatement */
    case ARTL_ART_singleStatement_42: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), e01));
      singleStatement.e01 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*singleStatement ::= 'while' e0 'runThis' . singleStatement */
    case ARTL_ART_singleStatement_44: 
      ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*singleStatement ::= 'while' e0 'runThis' singleStatement .*/
    case ARTL_ART_singleStatement_46: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      singleStatement.singleStatement1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
       artEvaluate(singleStatement.e01, e01);
                while (e01.v != 0) {
                  artEvaluate(singleStatement.singleStatement1, singleStatement);
                  artEvaluate(singleStatement.e01, e01);
                }
              
      break;
    /*singleStatement ::= 'userSymptoms' ID . singleStatement */
    case ARTL_ART_singleStatement_54: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*singleStatement ::= 'userSymptoms' ID singleStatement .*/
    case ARTL_ART_singleStatement_56: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      singleStatement.singleStatement1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
       userData.put(ID1.v, singleStatement.singleStatement1); 
      break;
    /*singleStatement ::= 'userTravels' ID . singleStatement */
    case ARTL_ART_singleStatement_64: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*singleStatement ::= 'userTravels' ID singleStatement .*/
    case ARTL_ART_singleStatement_66: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      singleStatement.singleStatement1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
       userData.put(ID1.v, singleStatement.singleStatement1); 
      break;
    /*singleStatement ::= 'userHealth' ID . singleStatement */
    case ARTL_ART_singleStatement_74: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*singleStatement ::= 'userHealth' ID singleStatement .*/
    case ARTL_ART_singleStatement_76: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      singleStatement.singleStatement1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
       userData.put(ID1.v, singleStatement.singleStatement1); 
      break;
    /*singleStatement ::= 'HelpMeWithCovid19' ID . ';' */
    case ARTL_ART_singleStatement_84: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*singleStatement ::= 'HelpMeWithCovid19' ID ';' .*/
    case ARTL_ART_singleStatement_86: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       if (!userData.containsKey(ID1.v))
                    artText.println(ARTTextLevel.WARNING, "Hmm... You've called an 3 undefined property: " + ID1.v);
                  else
                    artEvaluate(userData.get(ID1.v), null);
                
      break;
    /*singleStatement ::= 'ConsoleLog' '(' . printElements ')' ';' */
    case ARTL_ART_singleStatement_94: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*singleStatement ::= 'ConsoleLog' '(' printElements . ')' ';' */
    case ARTL_ART_singleStatement_96: 
      ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_printElements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null);
            break;
    /*singleStatement ::= 'ConsoleLog' '(' printElements ')' . ';' */
    case ARTL_ART_singleStatement_98: 
      ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*singleStatement ::= 'ConsoleLog' '(' printElements ')' ';' .*/
    case ARTL_ART_singleStatement_100: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*singleStatement ::= '{' statements . '}' */
    case ARTL_ART_singleStatement_106: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*singleStatement ::= '{' statements '}' .*/
    case ARTL_ART_singleStatement_108: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*singleStatement ::= mainCall .*/
    case ARTL_ART_singleStatement_112: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_mainCall(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null, null, null, null, null, null, null);
            break;
    /*singleStatement ::= YourAge .*/
    case ARTL_ART_singleStatement_116: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_YourAge(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*singleStatement ::= Country .*/
    case ARTL_ART_singleStatement_120: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_Country(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
    /*singleStatement ::= State .*/
    case ARTL_ART_singleStatement_124: 
      ID1 = new ARTAT_ART_ID();
      e01 = new ARTAT_ART_e0();
      elseOpt1 = new ARTAT_ART_elseOpt();
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement, ID1, e01, elseOpt1, singleStatement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_State(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
        default:
          throw new ARTException("ARTRD_singleStatement: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_statements(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_singleStatement singleStatement1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*statements ::= singleStatement .*/
    case ARTL_ART_statements_4: 
      singleStatement1 = new ARTAT_ART_singleStatement();
            ARTRD_statements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, singleStatement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_singleStatement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, singleStatement1, null, null, null, null);
            break;
    /*statements ::= singleStatement statements .*/
    case ARTL_ART_statements_10: 
      singleStatement1 = new ARTAT_ART_singleStatement();
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_singleStatement(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, singleStatement1, null, null, null, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
        default:
          throw new ARTException("ARTRD_statements: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_subCall(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_subCall subCall) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*subCall ::= Health .*/
    case ARTL_ART_subCall_170: 
            ARTRD_subCall(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subCall);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_Health(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
       subCall.v = artLexeme(subCall.leftExtent, subCall.rightExtent).trim(); 
      break;
        default:
          throw new ARTException("ARTRD_subCall: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_subCall2(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_subCall2 subCall2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*subCall2 ::= Symptoms .*/
    case ARTL_ART_subCall2_176: 
            ARTRD_subCall2(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subCall2);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_Symptoms(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
       subCall2.v = artLexeme(subCall2.leftExtent, subCall2.rightExtent).trim(); 
      break;
        default:
          throw new ARTException("ARTRD_subCall2: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_subCall3(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_subCall3 subCall3) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*subCall3 ::= Travels .*/
    case ARTL_ART_subCall3_182: 
            ARTRD_subCall3(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, subCall3);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_Travels(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
       subCall3.v = artLexeme(subCall3.leftExtent, subCall3.rightExtent).trim(); 
      break;
        default:
          throw new ARTException("ARTRD_subCall3: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void artEvaluate(ARTGLLRDTHandle artElement, Object artAttributes, ARTGLLRDTVertex artParent, Boolean artWriteable) throws ARTException {
  switch (artSPPFNodeLabel(artElement.element)) {
    case ARTL_ART_Comments: ARTRD_Comments(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_Country: ARTRD_Country(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_Health: ARTRD_Health(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_HealthType:  ARTRD_HealthType(artElement.element, artParent, artWriteable, (ARTAT_ART_HealthType) artAttributes); break;
    case ARTL_ART_ID:  ARTRD_ID(artElement.element, artParent, artWriteable, (ARTAT_ART_ID) artAttributes); break;
    case ARTL_ART_INTEGER:  ARTRD_INTEGER(artElement.element, artParent, artWriteable, (ARTAT_ART_INTEGER) artAttributes); break;
    case ARTL_ART_REAL:  ARTRD_REAL(artElement.element, artParent, artWriteable, (ARTAT_ART_REAL) artAttributes); break;
    case ARTL_ART_STRING_DQ:  ARTRD_STRING_DQ(artElement.element, artParent, artWriteable, (ARTAT_ART_STRING_DQ) artAttributes); break;
    case ARTL_ART_State: ARTRD_State(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_Symptoms: ARTRD_Symptoms(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_SymptomsType:  ARTRD_SymptomsType(artElement.element, artParent, artWriteable, (ARTAT_ART_SymptomsType) artAttributes); break;
    case ARTL_ART_Travels: ARTRD_Travels(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_TravelsType:  ARTRD_TravelsType(artElement.element, artParent, artWriteable, (ARTAT_ART_TravelsType) artAttributes); break;
    case ARTL_ART_YourAge: ARTRD_YourAge(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_e0:  ARTRD_e0(artElement.element, artParent, artWriteable, (ARTAT_ART_e0) artAttributes, null, null); break;
    case ARTL_ART_e1:  ARTRD_e1(artElement.element, artParent, artWriteable, (ARTAT_ART_e1) artAttributes, null, null); break;
    case ARTL_ART_e2:  ARTRD_e2(artElement.element, artParent, artWriteable, (ARTAT_ART_e2) artAttributes, null, null); break;
    case ARTL_ART_e3:  ARTRD_e3(artElement.element, artParent, artWriteable, (ARTAT_ART_e3) artAttributes, null, null); break;
    case ARTL_ART_e4:  ARTRD_e4(artElement.element, artParent, artWriteable, (ARTAT_ART_e4) artAttributes, null, null); break;
    case ARTL_ART_e5:  ARTRD_e5(artElement.element, artParent, artWriteable, (ARTAT_ART_e5) artAttributes, null, null, null); break;
    case ARTL_ART_elseOpt: ARTRD_elseOpt(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_genderType:  ARTRD_genderType(artElement.element, artParent, artWriteable, (ARTAT_ART_genderType) artAttributes); break;
    case ARTL_ART_mainCall: ARTRD_mainCall(artElement.element, artParent, artWriteable, null, null, null, null, null, null, null); break;
    case ARTL_ART_printElements: ARTRD_printElements(artElement.element, artParent, artWriteable, null, null); break;
    case ARTL_ART_singleStatement:  ARTRD_singleStatement(artElement.element, artParent, artWriteable, (ARTAT_ART_singleStatement) artAttributes, null, null, null, null); break;
    case ARTL_ART_statements: ARTRD_statements(artElement.element, artParent, artWriteable, null); break;
    case ARTL_ART_subCall:  ARTRD_subCall(artElement.element, artParent, artWriteable, (ARTAT_ART_subCall) artAttributes); break;
    case ARTL_ART_subCall2:  ARTRD_subCall2(artElement.element, artParent, artWriteable, (ARTAT_ART_subCall2) artAttributes); break;
    case ARTL_ART_subCall3:  ARTRD_subCall3(artElement.element, artParent, artWriteable, (ARTAT_ART_subCall3) artAttributes); break;
  }
}

public ARTGLLRDT artEvaluator() throws ARTException {
  artRDT = new ARTGLLRDT("RDT", artKindOfs, artLabelStrings, artAnnotations, artLexer.artInputString);
  ARTGLLRDTVertex artNewParent = new ARTGLLRDTVertex(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artRootSPPFNode),artSPPFNodeRightExtent(artRootSPPFNode),artSPPFNodeLabel(artRootSPPFNode), null));
  artRDT.setRoot(artNewParent);
  boolean artNewWriteable = true;
  artEvaluate(new ARTGLLRDTHandle(artRootSPPFNode), null, artNewParent, artNewWriteable);
  artAttributeEvaluateCompleteTime = artReadClock();
  return artRDT;
}
};
