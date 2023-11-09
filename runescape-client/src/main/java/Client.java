import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class322 {
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = -1269216115
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vr")
	@ObfuscatedGetter(
		intValue = 1225799997
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("wi")
	@ObfuscatedGetter(
		intValue = -1604975679
	)
	public static int field783;
	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	static final class229 field673;
	@ObfuscatedName("xl")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	static final ApproximateRouteStrategy field750;
	@ObfuscatedName("xn")
	static int[] field790;
	@ObfuscatedName("xf")
	static int[] field718;
	@ObfuscatedName("wl")
	@ObfuscatedGetter(
		intValue = 1907598029
	)
	static int field774;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("ww")
	@ObfuscatedGetter(
		intValue = -1508952755
	)
	static int field720;
	@ObfuscatedName("xe")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("xd")
	@ObfuscatedGetter(
		intValue = 480920095
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("xi")
	@ObfuscatedGetter(
		intValue = 910334529
	)
	static int field645;
	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "Lsz;"
	)
	static class487 field776;
	@ObfuscatedName("vt")
	static short field760;
	@ObfuscatedName("vd")
	static short field761;
	@ObfuscatedName("vp")
	static short field531;
	@ObfuscatedName("vb")
	static short field722;
	@ObfuscatedName("vk")
	static short field765;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = -655369499
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vs")
	static short field764;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = -1682958733
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vm")
	@ObfuscatedGetter(
		intValue = -1652855937
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vi")
	static boolean[] field755;
	@ObfuscatedName("vo")
	static int[] field756;
	@ObfuscatedName("va")
	static int[] field704;
	@ObfuscatedName("vy")
	static int[] field758;
	@ObfuscatedName("vw")
	static int[] field728;
	@ObfuscatedName("vc")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vx")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("wf")
	static List field500;
	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	static class435 field779;
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("wh")
	@ObfuscatedGetter(
		intValue = 2077097019
	)
	static int field636;
	@ObfuscatedName("br")
	static boolean field729;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1578693191
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -863214713
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1196057225
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("ce")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("ci")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1519857313
	)
	static int field488;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 243947283
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1862855915
	)
	static int field490;
	@ObfuscatedName("cn")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -2139283279
	)
	public static int field492;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1549345675
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dk")
	static boolean field494;
	@ObfuscatedName("ec")
	static boolean field498;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 962758423
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		longValue = -8142216681054424443L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = 2093024465
	)
	static int field501;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 22566591
	)
	static int field502;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		longValue = 9058783913221914729L
	)
	static long field503;
	@ObfuscatedName("ef")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 1125128507
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -289097033
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -2096187297
	)
	static int field507;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 2023720801
	)
	static int field508;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -1822706211
	)
	static int field509;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1244039727
	)
	static int field510;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -419045454
	)
	static int field511;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = -500344000
	)
	static int field512;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = -552169536
	)
	static int field513;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ed")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static class92 field517;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = -588032653
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = -1477360267
	)
	static int field791;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1100594471
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -1129030311
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -761293713
	)
	static int field522;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 1521786269
	)
	static int field614;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1849205089
	)
	static int field675;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static class124 field525;
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	static class531 field526;
	@ObfuscatedName("hc")
	static final String field537;
	@ObfuscatedName("ha")
	static final String field538;
	@ObfuscatedName("hn")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("ib")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "[Ldn;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -906746739
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("iu")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -984446247
	)
	static int field637;
	@ObfuscatedName("il")
	static int[] field549;
	@ObfuscatedName("it")
	static String field767;
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 355075581
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ii")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("jf")
	static HashMap field633;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = 1992662775
	)
	static int field555;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 2146509421
	)
	static int field678;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 2062057009
	)
	static int field521;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = 1974863003
	)
	static int field558;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 666285399
	)
	static int field559;
	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "[Liw;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ja")
	static boolean field595;
	@ObfuscatedName("jt")
	static int[][][] field562;
	@ObfuscatedName("kj")
	static final int[] field563;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = -1774127427
	)
	static int field564;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -1776115789
	)
	static int field565;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = -570178499
	)
	static int field670;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = 540973989
	)
	static int field567;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -785299787
	)
	static int field568;
	@ObfuscatedName("ka")
	static boolean field569;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -650496269
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 1248624645
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -455128087
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 1352056963
	)
	static int field653;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 299500625
	)
	static int field574;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -915258713
	)
	static int field548;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = -1998128165
	)
	static int field576;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -1814827049
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -469827945
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -2117744859
	)
	static int field579;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1967585531
	)
	static int field529;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -747448447
	)
	static int field763;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -203139789
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 1910388411
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 1574301625
	)
	public static int field584;
	@ObfuscatedName("ly")
	static boolean field585;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = -1479145315
	)
	static int field523;
	@ObfuscatedName("lu")
	static boolean field587;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -909114115
	)
	static int field759;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -447515851
	)
	static int field780;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 1790424759
	)
	static int field746;
	@ObfuscatedName("mb")
	static int[] field591;
	@ObfuscatedName("md")
	static int[] field592;
	@ObfuscatedName("my")
	static int[] field734;
	@ObfuscatedName("mk")
	static int[] field594;
	@ObfuscatedName("mi")
	static int[] field721;
	@ObfuscatedName("mn")
	static int[] field596;
	@ObfuscatedName("mx")
	static int[][] field597;
	@ObfuscatedName("mv")
	static int[] field598;
	@ObfuscatedName("mm")
	static String[] field599;
	@ObfuscatedName("mq")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -212258435
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = 2138989585
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -190656905
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -1690442785
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 1378067361
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -61447401
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 263783731
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("ml")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = 1977190337
	)
	static int field736;
	@ObfuscatedName("mg")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "[Lds;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = 724172563
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1501940983
	)
	static int field754;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		longValue = -2389555093516551195L
	)
	static long field698;
	@ObfuscatedName("nb")
	static boolean field615;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = -1022035151
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -539073287
	)
	static int field617;
	@ObfuscatedName("na")
	static int[] field618;
	@ObfuscatedName("nh")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ny")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nu")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nx")
	static int[] field622;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = -1508153399
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "[[[Lon;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nv")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nt")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("ne")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nz")
	static int[] field540;
	@ObfuscatedName("nl")
	static boolean field632;
	@ObfuscatedName("nr")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 1368885637
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("ol")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("oz")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ov")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("oq")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("oo")
	static int[] field639;
	@ObfuscatedName("oa")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ou")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("om")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("og")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ob")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("os")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 481752741
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 1626319321
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 757921443
	)
	static int field648;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -1812084391
	)
	static int field768;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1413140383
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("pm")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = 1265673147
	)
	static int field534;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -565449129
	)
	static int field654;
	@ObfuscatedName("pp")
	static String field655;
	@ObfuscatedName("pb")
	static String field656;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = 1658925683
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -1742450303
	)
	static int field659;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = 982091517
	)
	static int field660;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -1324071041
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 213622459
	)
	static int field663;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 1814135357
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -896347093
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 1369038927
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pi")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -1053586819
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = 568507323
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("qu")
	static boolean field674;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 1350248817
	)
	static int field554;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 950659321
	)
	static int field676;
	@ObfuscatedName("qy")
	static boolean field516;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 653531587
	)
	static int field533;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 483934473
	)
	static int field679;
	@ObfuscatedName("qn")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -796191257
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qm")
	static int[] field712;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = -1725531237
	)
	static int field683;
	@ObfuscatedName("qc")
	static int[] field541;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = -532017517
	)
	static int field685;
	@ObfuscatedName("qs")
	static int[] field686;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = -2093121121
	)
	static int field687;
	@ObfuscatedName("qh")
	static int[] field688;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 1767752687
	)
	static int field689;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -343622715
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = 366761651
	)
	static int field747;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = 1639645287
	)
	static int field692;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 654262707
	)
	static int field693;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = -389268847
	)
	static int field588;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = -1924930575
	)
	static int field551;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = 892305799
	)
	static int field782;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = -159332949
	)
	static int field697;
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	static class466 field677;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = -488483027
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	static class544 field573;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static NodeDeque field793;
	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static NodeDeque field703;
	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static NodeDeque field682;
	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 1270662475
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = -193277661
	)
	static int field557;
	@ObfuscatedName("ri")
	static boolean[] field708;
	@ObfuscatedName("ru")
	static boolean[] field785;
	@ObfuscatedName("rx")
	static boolean[] field515;
	@ObfuscatedName("rt")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("sg")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("sj")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("sr")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("sa")
	@ObfuscatedGetter(
		intValue = 1676430659
	)
	static int field715;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		longValue = -5976517433399259521L
	)
	static long field716;
	@ObfuscatedName("sd")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sn")
	static int[] field483;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = 1686012707
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 1585421373
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sh")
	static String field694;
	@ObfuscatedName("sb")
	static long[] field575;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = -738645525
	)
	static int field723;
	@ObfuscatedName("sp")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	public static class223 field724;
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static class221 field725;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 1219207087
	)
	static int field726;
	@ObfuscatedName("so")
	static int[] field586;
	@ObfuscatedName("sl")
	static int[] field518;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		longValue = -2398500741580166883L
	)
	static long field638;
	@ObfuscatedName("tp")
	@ObfuscatedSignature(
		descriptor = "[Lfc;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "[Lgn;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = 1069400751
	)
	static int field601;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = 819467357
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tt")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tg")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("to")
	@ObfuscatedSignature(
		descriptor = "[Luz;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = 1769781979
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -313105013
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = -1359162591
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tj")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = -128069645
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("ug")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ui")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("uv")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("uo")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "[Lbo;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uq")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ur")
	static boolean field748;
	@ObfuscatedName("ux")
	static boolean field749;
	@ObfuscatedName("uw")
	static boolean field661;
	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	static class491 field751;
	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	static class490 field752;
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	static class490 field672;
	@ObfuscatedName("un")
	static boolean field482;
	@ObfuscatedName("hb")
	String field527;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	class14 field528;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	class18 field657;
	@ObfuscatedName("hi")
	OtlTokenRequester field530;
	@ObfuscatedName("hq")
	Future field605;
	@ObfuscatedName("hf")
	boolean field532;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -1106066733
	)
	int field545;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	class18 field611;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field535;
	@ObfuscatedName("hk")
	Future field536;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	Buffer field702;
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	class7 field542;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		longValue = -3042549022967002225L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field729 = true; // L: 163
		worldId = 1; // L: 164
		worldProperties = 0; // L: 165
		gameBuild = 0; // L: 167
		isMembersWorld = false; // L: 170
		isLowDetail = false; // L: 171
		field488 = -1; // L: 176
		clientType = -1; // L: 177
		field490 = -1; // L: 178
		onMobile = false; // L: 179
		field492 = 218; // L: 180
		gameState = 0;
		field494 = false;
		field498 = true; // L: 217
		cycle = 0; // L: 218
		mouseLastLastPressedTimeMillis = 1L; // L: 219
		field501 = -1; // L: 221
		field502 = -1; // L: 222
		field503 = -1L; // L: 223
		hadFocus = true; // L: 224
		rebootTimer = 0; // L: 225
		hintArrowType = 0; // L: 226
		field507 = 0; // L: 227
		field508 = 0; // L: 228
		field509 = 0; // L: 229
		field510 = 0; // L: 230
		field511 = 0; // L: 231
		field512 = 0; // L: 232
		field513 = 0; // L: 233
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 235
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 236
		renderSelf = false; // L: 238
		field517 = class92.field1136; // L: 247
		js5ConnectState = 0; // L: 250
		field791 = 0; // L: 251
		js5Errors = 0; // L: 275
		loginState = 0; // L: 277
		field522 = 0; // L: 278
		field614 = 0; // L: 279
		field675 = 0; // L: 280
		field525 = class124.field1470; // L: 281
		field526 = class531.field5197; // L: 282
		int var1 = "com_jagex_auth_desktop_osrs:public".length(); // L: 310
		byte[] var2 = new byte[var1]; // L: 311

		int var3;
		char var4;
		for (var3 = 0; var3 < var1; ++var3) { // L: 312
			var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3); // L: 313
			if (var4 > 127) { // L: 314
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 315
			}
		}

		field537 = class415.method7821(var2); // L: 319
		var1 = "com_jagex_auth_desktop_runelite:public".length(); // L: 327
		var2 = new byte[var1]; // L: 328

		for (var3 = 0; var3 < var1; ++var3) { // L: 329
			var4 = "com_jagex_auth_desktop_runelite:public".charAt(var3); // L: 330
			if (var4 > 127) { // L: 331
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 332
			}
		}

		field538 = class415.method7821(var2); // L: 336
		Login_isUsernameRemembered = false; // L: 352
		secureRandomFuture = new SecureRandomFuture(); // L: 353
		randomDatData = null; // L: 359
		npcs = new NPC[65536]; // L: 363
		npcCount = 0; // L: 364
		npcIndices = new int[65536]; // L: 365
		field637 = 0; // L: 366
		field549 = new int[250]; // L: 367
		packetWriter = new PacketWriter(); // L: 370
		logoutTimer = 0; // L: 372
		hadNetworkError = false; // L: 373
		timer = new Timer(); // L: 374
		field633 = new HashMap(); // L: 380
		field555 = 0; // L: 387
		field678 = 1; // L: 388
		field521 = 0; // L: 389
		field558 = 1; // L: 390
		field559 = 0; // L: 391
		collisionMaps = new CollisionMap[4]; // L: 399
		field595 = false; // L: 400
		field562 = new int[4][13][13]; // L: 401
		field563 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 402
		field564 = 0; // L: 405
		field565 = 2301979; // L: 417
		field670 = 5063219; // L: 418
		field567 = 3353893; // L: 419
		field568 = 7759444; // L: 420
		field569 = false; // L: 421
		alternativeScrollbarWidth = 0; // L: 422
		camAngleX = 128; // L: 430
		camAngleY = 0; // L: 431
		field653 = 0; // L: 432
		field574 = 0; // L: 433
		field548 = 0; // L: 434
		field576 = 0; // L: 435
		titleLoadingStage = 0; // L: 436
		camFollowHeight = 50; // L: 437
		field579 = 0;
		field529 = 0;
		field763 = 0;
		oculusOrbNormalSpeed = 12; // L: 445
		oculusOrbSlowedSpeed = 6; // L: 446
		field584 = 0; // L: 447
		field585 = false; // L: 448
		field523 = 0; // L: 449
		field587 = false; // L: 450
		field759 = 0; // L: 451
		field780 = 0; // L: 452
		field746 = 50; // L: 453
		field591 = new int[field746]; // L: 454
		field592 = new int[field746]; // L: 455
		field734 = new int[field746]; // L: 456
		field594 = new int[field746]; // L: 457
		field721 = new int[field746]; // L: 458
		field596 = new int[field746]; // L: 459
		field597 = new int[field746][]; // L: 460
		field598 = new int[field746]; // L: 461
		field599 = new String[field746]; // L: 462
		tileLastDrawnActor = new int[104][104]; // L: 463
		viewportDrawCount = 0; // L: 464
		viewportTempX = -1; // L: 465
		viewportTempY = -1; // L: 466
		mouseCrossX = 0; // L: 467
		mouseCrossY = 0; // L: 468
		mouseCrossState = 0; // L: 469
		mouseCrossColor = 0; // L: 470
		showMouseCross = true; // L: 471
		field736 = 0; // L: 472
		showLoadingMessages = true; // L: 474
		players = new Player[2048]; // L: 476
		localPlayerIndex = -1; // L: 478
		field754 = 0; // L: 479
		field698 = -1L; // L: 480
		field615 = true; // L: 482
		drawPlayerNames = 0; // L: 487
		field617 = 0; // L: 488
		field618 = new int[1000]; // L: 489
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 491
		playerMenuActions = new String[8]; // L: 492
		playerOptionsPriorities = new boolean[8]; // L: 493
		field622 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 494
		combatTargetPlayerIndex = -1; // L: 495
		groundItems = new NodeDeque[4][104][104]; // L: 496
		pendingSpawns = new NodeDeque(); // L: 497
		projectiles = new NodeDeque(); // L: 498
		graphicsObjects = new NodeDeque(); // L: 499
		currentLevels = new int[25]; // L: 500
		levels = new int[25]; // L: 501
		experience = new int[25]; // L: 502
		field540 = new int[25]; // L: 503
		field632 = false; // L: 504
		isMenuOpen = false; // L: 505
		menuOptionsCount = 0; // L: 511
		menuArguments1 = new int[500]; // L: 512
		menuArguments2 = new int[500]; // L: 513
		menuOpcodes = new int[500]; // L: 514
		menuIdentifiers = new int[500]; // L: 515
		field639 = new int[500]; // L: 516
		menuActions = new String[500]; // L: 517
		menuTargets = new String[500]; // L: 518
		menuShiftClick = new boolean[500]; // L: 519
		followerOpsLowPriority = false; // L: 520
		tapToDrop = false; // L: 522
		showMouseOverText = true; // L: 523
		viewportX = -1; // L: 524
		viewportY = -1; // L: 525
		field648 = 0; // L: 529
		field768 = 50; // L: 530
		isItemSelected = 0; // L: 531
		field767 = null; // L: 535
		isSpellSelected = false; // L: 536
		field534 = -1; // L: 538
		field654 = -1; // L: 539
		field655 = null; // L: 541
		field656 = null; // L: 542
		rootInterface = -1; // L: 543
		interfaceParents = new NodeHashTable(8); // L: 544
		field659 = 0; // L: 549
		field660 = -1; // L: 550
		chatEffects = 0; // L: 551
		meslayerContinueWidget = null; // L: 552
		field663 = 0; // L: 553
		weight = 0; // L: 554
		staffModLevel = 0; // L: 555
		followerIndex = -1; // L: 556
		playerMod = false; // L: 557
		viewportWidget = null; // L: 558
		clickedWidget = null; // L: 559
		clickedWidgetParent = null; // L: 560
		widgetClickX = 0; // L: 561
		widgetClickY = 0; // L: 562
		draggedOnWidget = null; // L: 563
		field674 = false; // L: 564
		field554 = -1; // L: 565
		field676 = -1; // L: 566
		field516 = false; // L: 567
		field533 = -1; // L: 568
		field679 = -1; // L: 569
		isDraggingWidget = false; // L: 570
		cycleCntr = 1; // L: 575
		field712 = new int[32]; // L: 578
		field683 = 0; // L: 579
		field541 = new int[32]; // L: 580
		field685 = 0; // L: 581
		field686 = new int[32]; // L: 582
		field687 = 0; // L: 583
		field688 = new int[32]; // L: 584
		field689 = 0; // L: 585
		chatCycle = 0; // L: 586
		field747 = 0; // L: 587
		field692 = 0; // L: 588
		field693 = 0; // L: 589
		field588 = 0; // L: 590
		field551 = 0; // L: 591
		field782 = 0; // L: 592
		field697 = 0; // L: 593
		mouseWheelRotation = 0; // L: 599
		field573 = new class544(); // L: 600
		scriptEvents = new NodeDeque(); // L: 601
		field793 = new NodeDeque(); // L: 602
		field703 = new NodeDeque(); // L: 603
		field682 = new NodeDeque(); // L: 604
		widgetFlags = new NodeHashTable(512); // L: 605
		rootWidgetCount = 0; // L: 607
		field557 = -2; // L: 608
		field708 = new boolean[100]; // L: 609
		field785 = new boolean[100]; // L: 610
		field515 = new boolean[100]; // L: 611
		rootWidgetXs = new int[100]; // L: 612
		rootWidgetYs = new int[100]; // L: 613
		rootWidgetWidths = new int[100]; // L: 614
		rootWidgetHeights = new int[100]; // L: 615
		field715 = 0; // L: 616
		field716 = 0L; // L: 617
		isResizable = true; // L: 618
		field483 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 625
		publicChatMode = 0; // L: 626
		tradeChatMode = 0; // L: 628
		field694 = ""; // L: 629
		field575 = new long[100]; // L: 631
		field723 = 0; // L: 632
		field724 = new class223(); // L: 633
		field725 = new class221(); // L: 634
		field726 = 0; // L: 636
		field586 = new int[128]; // L: 637
		field518 = new int[128]; // L: 638
		field638 = -1L; // L: 639
		currentClanSettings = new ClanSettings[4]; // L: 643
		currentClanChannels = new ClanChannel[4]; // L: 645
		field601 = -1; // L: 647
		mapIconCount = 0; // L: 648
		mapIconXs = new int[1000]; // L: 649
		mapIconYs = new int[1000]; // L: 650
		mapIcons = new SpritePixels[1000]; // L: 651
		destinationX = 0; // L: 652
		destinationY = 0; // L: 653
		minimapState = 0; // L: 660
		playingJingle = false; // L: 661
		soundEffectCount = 0; // L: 666
		soundEffectIds = new int[50]; // L: 667
		queuedSoundEffectLoops = new int[50]; // L: 668
		queuedSoundEffectDelays = new int[50]; // L: 669
		soundLocations = new int[50]; // L: 670
		soundEffects = new SoundEffect[50]; // L: 671
		isCameraLocked = false; // L: 673
		field748 = false; // L: 679
		field749 = false; // L: 680
		field661 = false; // L: 681
		field751 = null; // L: 687
		field752 = null; // L: 688
		field672 = null; // L: 689
		field482 = false; // L: 690
		field755 = new boolean[5]; // L: 698
		field756 = new int[5]; // L: 699
		field704 = new int[5]; // L: 700
		field758 = new int[5]; // L: 701
		field728 = new int[5]; // L: 702
		field760 = 256; // L: 703
		field761 = 205; // L: 704
		zoomHeight = 256; // L: 705
		zoomWidth = 320; // L: 706
		field764 = 1; // L: 707
		field765 = 32767; // L: 708
		field531 = 1; // L: 709
		field722 = 32767; // L: 710
		viewportOffsetX = 0; // L: 711
		viewportOffsetY = 0; // L: 712
		viewportWidth = 0; // L: 713
		viewportHeight = 0; // L: 714
		viewportZoom = 0; // L: 715
		playerAppearance = new PlayerComposition(); // L: 717
		field774 = -1; // L: 718
		field720 = -1; // L: 719
		field776 = new DesktopPlatformInfoProvider(); // L: 721
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 723
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 726
		field779 = new class435(8, class433.field4645); // L: 728
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 730
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 731
		field636 = -1; // L: 734
		field783 = -1; // L: 740
		field500 = new ArrayList(); // L: 741
		field673 = new class229(); // L: 742
		archiveLoaders = new ArrayList(10); // L: 743
		archiveLoadersDone = 0; // L: 744
		field645 = 0; // L: 745
		field750 = new ApproximateRouteStrategy(); // L: 754
		field790 = new int[50]; // L: 755
		field718 = new int[50]; // L: 756
	}

	public Client() {
		this.field532 = false; // L: 300
		this.field545 = 0; // L: 301
		this.accountHash = -1L; // L: 358
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field716 = SpotAnimationDefinition.method3775() + 500L; // L: 4568
		this.resizeJS(); // L: 4569
		if (rootInterface != -1) { // L: 4570
			this.resizeRoot(true);
		}

	} // L: 4571

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-550390769"
	)
	@Export("setUp")
	protected final void setUp() {
		class4.method20(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 1048
		WorldMapCacheName.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1049
		AbstractSocket.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1050
		class252.currentPort = WorldMapCacheName.worldPort; // L: 1051
		WorldMapLabelSize.field2440 = class342.field3642; // L: 1052
		class90.field1094 = class342.field3641; // L: 1053
		class503.field5015 = class342.field3643; // L: 1054
		PlayerComposition.field3606 = class342.field3640; // L: 1055
		class60.urlRequester = new class113(this.field532, 218); // L: 1056
		this.setUpKeyboard(); // L: 1058
		this.method506(); // L: 1059
		class396.mouseWheel = this.mouseWheel(); // L: 1060
		this.method505(field725, 0); // L: 1061
		this.method505(field724, 1); // L: 1062
		this.setUpClipboard(); // L: 1063
		class302.field3118 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1065
		AccessFile var2 = null; // L: 1068
		ClientPreferences var3 = new ClientPreferences(); // L: 1069

		try {
			var2 = class131.getPreferencesFile("", Messages.field1401.name, false); // L: 1071
			byte[] var4 = new byte[(int)var2.length()]; // L: 1072

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) { // L: 1073 1074 1077
				var6 = var2.read(var4, var5, var4.length - var5); // L: 1075
				if (var6 == -1) { // L: 1076
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4)); // L: 1079
		} catch (Exception var8) { // L: 1081
		}

		try {
			if (var2 != null) { // L: 1083
				var2.close(); // L: 1084
			}
		} catch (Exception var7) { // L: 1087
		}

		WorldMapIcon_1.clientPreferences = var3; // L: 1090
		class27.method445(this, class14.field67); // L: 1091
		class9.setWindowedMode(WorldMapIcon_1.clientPreferences.method2564()); // L: 1092
		class12.friendSystem = new FriendSystem(class89.loginType); // L: 1093
		this.field528 = new class14("tokenRequest", 1, 1); // L: 1094
		if (!class316.field3420.contains(this)) { // L: 1097
			class316.field3420.add(this); // L: 1098
		}

		field673.method4440(); // L: 1101
	} // L: 1102

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "564244601"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1106
		this.doCycleJs5(); // L: 1107

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 1111
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 1112
			} // L: 1113

			if (var1 == null) { // L: 1114
				boolean var5 = class516.method9145(); // L: 1118
				if (var5 && playingJingle && MusicPatchPcmStream.pcmPlayer0 != null) { // L: 1119 1120
					MusicPatchPcmStream.pcmPlayer0.tryDiscard();
				}

				class102.method2728(); // L: 1122
				field724.method4313(); // L: 1123
				this.method567(); // L: 1124
				synchronized(MouseHandler.MouseHandler_instance) { // L: 1126
					MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1127
					MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1128
					MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1129
					MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1130
					MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1131
					MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1132
					MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1133
					MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1134
					MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1135
				} // L: 1136

				if (class396.mouseWheel != null) { // L: 1138
					int var6 = class396.mouseWheel.useRotation(); // L: 1139
					mouseWheelRotation = var6; // L: 1140
				}

				if (gameState == 0) { // L: 1142
					WorldMapCacheName.method5005(); // L: 1143
					WorldMapManager.method4746(); // L: 1144
				} else if (gameState == 5) { // L: 1146
					Actor.method2496(this, class369.field4300, ItemLayer.fontPlain12); // L: 1147
					WorldMapCacheName.method5005(); // L: 1148
					WorldMapManager.method4746(); // L: 1149
				} else if (gameState != 10 && gameState != 11) { // L: 1151
					if (gameState == 20) { // L: 1152
						Actor.method2496(this, class369.field4300, ItemLayer.fontPlain12); // L: 1153
						this.doCycleLoggedOut(); // L: 1154
					} else if (gameState == 50) { // L: 1156
						Actor.method2496(this, class369.field4300, ItemLayer.fontPlain12); // L: 1157
						this.doCycleLoggedOut(); // L: 1158
					} else if (gameState == 25) { // L: 1160
						ModeWhere.method7205();
					}
				} else {
					Actor.method2496(this, class369.field4300, ItemLayer.fontPlain12);
				}

				if (gameState == 30) { // L: 1161
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) { // L: 1162
					this.doCycleLoggedOut();
				}

				return; // L: 1163
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false); // L: 1115
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-851092167"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && field716 != 0L && SpotAnimationDefinition.method3775() > field716) { // L: 1167 1168
			class9.setWindowedMode(ApproximateRouteStrategy.getWindowedMode()); // L: 1169
		}

		int var2;
		if (var1) { // L: 1172
			for (var2 = 0; var2 < 100; ++var2) { // L: 1173
				field708[var2] = true;
			}
		}

		if (gameState == 0) { // L: 1175
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1176
			UrlRequest.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class369.field4300, ItemLayer.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1177
			if (gameState == 20) { // L: 1178
				UrlRequest.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class369.field4300, ItemLayer.fontPlain12);
			} else if (gameState == 50) { // L: 1179
				UrlRequest.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class369.field4300, ItemLayer.fontPlain12);
			} else if (gameState == 25) { // L: 1180
				if (field559 == 1) { // L: 1181
					if (field555 > field678) { // L: 1182
						field678 = field555;
					}

					var2 = (field678 * 50 - field555 * 50) / field678; // L: 1183
					LoginPacket.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1184
				} else if (field559 == 2) { // L: 1186
					if (field521 > field558) { // L: 1187
						field558 = field521;
					}

					var2 = (field558 * 50 - field521 * 50) / field558 + 50; // L: 1188
					LoginPacket.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1189
				} else {
					LoginPacket.drawLoadingMessage("Loading - please wait.", false); // L: 1191
				}
			} else if (gameState == 30) { // L: 1193
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1194
				LoginPacket.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1195
				LoginPacket.drawLoadingMessage("Please wait...", false);
			}
		} else {
			UrlRequest.drawTitle(GrandExchangeOfferTotalQuantityComparator.fontBold12, class369.field4300, ItemLayer.fontPlain12); // L: 1185
		}

		if (gameState == 30 && field715 == 0 && !var1 && !isResizable) { // L: 1196
			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1197
				if (field785[var2]) { // L: 1198
					class338.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]); // L: 1199
					field785[var2] = false; // L: 1200
				}
			}
		} else if (gameState > 0) { // L: 1204
			class338.rasterProvider.drawFull(0, 0); // L: 1205

			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1206
				field785[var2] = false;
			}
		}

	} // L: 1208

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1863199463"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class176.varcs.hasUnwrittenChanges()) { // L: 1211
			class176.varcs.write();
		}

		if (Message.mouseRecorder != null) { // L: 1212
			Message.mouseRecorder.isRunning = false;
		}

		Message.mouseRecorder = null; // L: 1213
		packetWriter.close(); // L: 1214
		if (MouseHandler.MouseHandler_instance != null) { // L: 1216
			synchronized(MouseHandler.MouseHandler_instance) { // L: 1217
				MouseHandler.MouseHandler_instance = null; // L: 1218
			} // L: 1219
		}

		class396.mouseWheel = null; // L: 1222
		if (MusicPatchPcmStream.pcmPlayer0 != null) { // L: 1223
			MusicPatchPcmStream.pcmPlayer0.shutdown();
		}

		WorldMapSectionType.field2556.method7049(); // L: 1224
		class227.method4406(); // L: 1225
		if (class60.urlRequester != null) { // L: 1226
			class60.urlRequester.close(); // L: 1227
			class60.urlRequester = null; // L: 1228
		}

		HealthBarDefinition.method3654(); // L: 1230
		this.field528.method179(); // L: 1231
	} // L: 1232

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-94"
	)
	protected final void vmethod1353() {
	} // L: 763

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2071645038"
	)
	boolean method1263() {
		return this.field545 == 1; // L: 945
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-22117"
	)
	boolean method1351() {
		return Messages.field1402 != null && !Messages.field1402.trim().isEmpty() && ObjectComposition.field2126 != null && !ObjectComposition.field2126.trim().isEmpty(); // L: 985
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "74"
	)
	boolean method1267() {
		return class369.field4299 != null && !class369.field4299.trim().isEmpty() && InterfaceParent.field1046 != null && !InterfaceParent.field1046.trim().isEmpty(); // L: 989
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1304458364"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.field530 != null; // L: 993
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-191398087"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 997
		var2.put("grant_type", "refresh_token"); // L: 998
		var2.put("scope", "gamesso.token.create"); // L: 999
		var2.put("refresh_token", var1); // L: 1000
		URL var3 = new URL(class314.field3401 + "shield/oauth/token" + (new class475(var2)).method8589()); // L: 1001
		class431 var4 = new class431(); // L: 1002
		if (this.method1263()) { // L: 1003
			var4.method7957(field538); // L: 1004
		} else {
			var4.method7957(field537); // L: 1007
		}

		var4.method7954("Host", (new URL(class314.field3401)).getHost()); // L: 1009
		var4.method7961(class472.field4810); // L: 1010
		class9 var5 = class9.field33; // L: 1011
		RefreshAccessTokenRequester var6 = this.field535; // L: 1012
		if (var6 != null) { // L: 1013
			this.field536 = var6.request(var5.method75(), var3, var4.method7953(), ""); // L: 1014
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field532); // L: 1017
			this.field611 = this.field528.method181(var7); // L: 1018
		}
	} // L: 1015 1019

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-43"
	)
	void method1386(String var1) throws IOException {
		URL var2 = new URL(class314.field3401 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 1022
		class431 var3 = new class431(); // L: 1023
		var3.method7977(var1); // L: 1024
		class9 var4 = class9.field31; // L: 1025
		OtlTokenRequester var5 = this.field530; // L: 1026
		if (var5 != null) { // L: 1027
			this.field605 = var5.request(var4.method75(), var2, var3.method7953(), ""); // L: 1028
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field532); // L: 1031
			this.field657 = this.field528.method181(var6); // L: 1032
		}
	} // L: 1029 1033

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "169401816"
	)
	void method1270(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(FriendsChatManager.field4677 + "game-session/v1/tokens"); // L: 1036
		class10 var4 = new class10(var3, class9.field33, this.field532); // L: 1037
		var4.method95().method7977(var1); // L: 1038
		var4.method95().method7961(class472.field4810); // L: 1039
		JSONObject var5 = new JSONObject(); // L: 1040
		var5.put("accountId", var2); // L: 1041
		var4.method92(new class474(var5)); // L: 1042
		this.field657 = this.field528.method181(var4); // L: 1043
	} // L: 1044

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "121204254"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1346
			boolean var1 = WorldMapSectionType.field2556.method7044(); // L: 1347
			if (!var1) { // L: 1348
				this.method1276();
			}

		}
	} // L: 1349

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1703369019"
	)
	void method1276() {
		if (WorldMapSectionType.field2556.field4343 >= 4) { // L: 1352
			this.error("js5crc"); // L: 1353
			WorldMapSection2.method4516(1000); // L: 1354
		} else {
			if (WorldMapSectionType.field2556.field4327 >= 4) { // L: 1357
				if (gameState <= 5) { // L: 1358
					this.error("js5io"); // L: 1359
					WorldMapSection2.method4516(1000); // L: 1360
					return; // L: 1361
				}

				field791 = 3000; // L: 1364
				WorldMapSectionType.field2556.field4327 = 3; // L: 1365
			}

			if (--field791 + 1 <= 0) { // L: 1368
				try {
					if (js5ConnectState == 0) { // L: 1370
						class101.js5SocketTask = GameEngine.taskHandler.newSocketTask(Friend.worldHost, class252.currentPort); // L: 1371
						++js5ConnectState; // L: 1372
					}

					if (js5ConnectState == 1) { // L: 1374
						if (class101.js5SocketTask.status == 2) { // L: 1375
							this.js5Error(-1); // L: 1376
							return; // L: 1377
						}

						if (class101.js5SocketTask.status == 1) { // L: 1379
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1381
						class167.js5Socket = WorldMapData_0.method4467((Socket)class101.js5SocketTask.result, 40000, 5000); // L: 1382
						Buffer var1 = new Buffer(5); // L: 1383
						var1.writeByte(15); // L: 1384
						var1.writeInt(218); // L: 1385
						class167.js5Socket.write(var1.array, 0, 5); // L: 1386
						++js5ConnectState; // L: 1387
						class310.field3388 = SpotAnimationDefinition.method3775(); // L: 1388
					}

					if (js5ConnectState == 3) { // L: 1390
						if (class167.js5Socket.available() > 0) { // L: 1391
							int var2 = class167.js5Socket.readUnsignedByte(); // L: 1392
							if (var2 != 0) { // L: 1393
								this.js5Error(var2); // L: 1394
								return; // L: 1395
							}

							++js5ConnectState; // L: 1397
						} else if (SpotAnimationDefinition.method3775() - class310.field3388 > 30000L) { // L: 1400
							this.js5Error(-2); // L: 1401
							return; // L: 1402
						}
					}

					if (js5ConnectState == 4) { // L: 1406
						WorldMapSectionType.field2556.method7046(class167.js5Socket, gameState > 20); // L: 1407
						class101.js5SocketTask = null; // L: 1408
						class167.js5Socket = null; // L: 1409
						js5ConnectState = 0; // L: 1410
						js5Errors = 0; // L: 1411
					}
				} catch (IOException var3) { // L: 1414
					this.js5Error(-3); // L: 1415
				}

			}
		}
	} // L: 1355 1417

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-267215757"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class101.js5SocketTask = null; // L: 1420
		class167.js5Socket = null; // L: 1421
		js5ConnectState = 0; // L: 1422
		if (class252.currentPort == WorldMapCacheName.worldPort) { // L: 1423
			class252.currentPort = AbstractSocket.js5Port;
		} else {
			class252.currentPort = WorldMapCacheName.worldPort; // L: 1424
		}

		++js5Errors; // L: 1425
		if (js5Errors < 2 || var1 != 7 && var1 != 9) { // L: 1426
			if (js5Errors >= 2 && var1 == 6) { // L: 1433
				this.error("js5connect_outofdate"); // L: 1434
				WorldMapSection2.method4516(1000); // L: 1435
			} else if (js5Errors >= 4) { // L: 1437
				if (gameState <= 5) { // L: 1438
					this.error("js5connect"); // L: 1439
					WorldMapSection2.method4516(1000); // L: 1440
				} else {
					field791 = 3000; // L: 1442
				}
			}
		} else if (gameState <= 5) { // L: 1427
			this.error("js5connect_full"); // L: 1428
			WorldMapSection2.method4516(1000); // L: 1429
		} else {
			field791 = 3000; // L: 1431
		}

	} // L: 1444

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1040776320"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket(); // L: 1997
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1998

		try {
			if (loginState == 0) { // L: 2000
				if (EnumComposition.secureRandom == null && (secureRandomFuture.isDone() || field522 > 250)) { // L: 2001
					EnumComposition.secureRandom = secureRandomFuture.get(); // L: 2002
					secureRandomFuture.shutdown(); // L: 2003
					secureRandomFuture = null; // L: 2004
				}

				if (EnumComposition.secureRandom != null) { // L: 2006
					if (var1 != null) { // L: 2007
						var1.close(); // L: 2008
						var1 = null; // L: 2009
					}

					Player.socketTask = null; // L: 2011
					hadNetworkError = false; // L: 2012
					field522 = 0; // L: 2013
					if (field526.method9577()) { // L: 2014
						if (this.method1351()) { // L: 2015
							try {
								this.requestOtlToken(ObjectComposition.field2126); // L: 2017
								class19.method295(21); // L: 2018
							} catch (Throwable var22) { // L: 2020
								GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var22); // L: 2021
								class149.getLoginError(65); // L: 2022
								return; // L: 2023
							}
						} else {
							if (!this.method1267()) { // L: 2026
								class149.getLoginError(65); // L: 2038
								return; // L: 2039
							}

							try {
								this.method1270(class369.field4299, InterfaceParent.field1046); // L: 2028
								class19.method295(20); // L: 2029
							} catch (Exception var21) { // L: 2031
								GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var21); // L: 2032
								class149.getLoginError(65); // L: 2033
								return; // L: 2034
							}
						}
					} else {
						class19.method295(1); // L: 2043
					}
				}
			}

			class20 var24;
			if (loginState == 21) { // L: 2047
				if (this.field536 != null) { // L: 2048
					if (!this.field536.isDone()) { // L: 2049
						return; // L: 2050
					}

					if (this.field536.isCancelled()) { // L: 2052
						class149.getLoginError(65); // L: 2053
						this.field536 = null; // L: 2054
						return; // L: 2055
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field536.get(); // L: 2058
						if (!var3.isSuccess()) { // L: 2059
							class149.getLoginError(65); // L: 2060
							this.field536 = null; // L: 2061
							return; // L: 2062
						}

						Messages.field1402 = var3.getAccessToken(); // L: 2064
						ObjectComposition.field2126 = var3.getRefreshToken(); // L: 2065
						this.field536 = null; // L: 2066
					} catch (Exception var20) { // L: 2068
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var20); // L: 2069
						class149.getLoginError(65); // L: 2070
						this.field536 = null; // L: 2071
						return; // L: 2072
					}
				} else {
					if (this.field611 == null) { // L: 2075
						class149.getLoginError(65); // L: 2105
						return; // L: 2106
					}

					if (!this.field611.method283()) { // L: 2076
						return; // L: 2077
					}

					if (this.field611.method267()) { // L: 2079
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace(this.field611.method264(), (Throwable)null); // L: 2080
						class149.getLoginError(65); // L: 2081
						this.field611 = null; // L: 2082
						return; // L: 2083
					}

					var24 = this.field611.method269(); // L: 2085
					if (var24.method297() != 200) { // L: 2086
						class149.getLoginError(65); // L: 2087
						this.field611 = null; // L: 2088
						return; // L: 2089
					}

					field522 = 0; // L: 2091
					class474 var4 = new class474(var24.method299()); // L: 2092

					try {
						Messages.field1402 = var4.method8573().getString("access_token"); // L: 2094
						ObjectComposition.field2126 = var4.method8573().getString("refresh_token"); // L: 2095
					} catch (Exception var19) { // L: 2097
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace("Error parsing tokens", var19); // L: 2098
						class149.getLoginError(65); // L: 2099
						this.field611 = null; // L: 2100
						return; // L: 2101
					}
				}

				this.method1386(Messages.field1402); // L: 2108
				class19.method295(20); // L: 2109
			}

			if (loginState == 20) { // L: 2111
				if (this.field605 != null) { // L: 2112
					if (!this.field605.isDone()) { // L: 2113
						return; // L: 2114
					}

					if (this.field605.isCancelled()) { // L: 2116
						class149.getLoginError(65); // L: 2117
						this.field605 = null; // L: 2118
						return; // L: 2119
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.field605.get(); // L: 2122
						if (!var25.isSuccess()) { // L: 2123
							class149.getLoginError(65); // L: 2124
							this.field605 = null; // L: 2125
							return; // L: 2126
						}

						this.field527 = var25.getToken(); // L: 2128
						this.field605 = null; // L: 2129
					} catch (Exception var18) { // L: 2131
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var18); // L: 2132
						class149.getLoginError(65); // L: 2133
						this.field605 = null; // L: 2134
						return; // L: 2135
					}
				} else {
					if (this.field657 == null) { // L: 2138
						class149.getLoginError(65); // L: 2174
						return; // L: 2175
					}

					if (!this.field657.method283()) { // L: 2139
						return; // L: 2140
					}

					if (this.field657.method267()) { // L: 2142
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace(this.field657.method264(), (Throwable)null); // L: 2143
						class149.getLoginError(65); // L: 2144
						this.field657 = null; // L: 2145
						return; // L: 2146
					}

					var24 = this.field657.method269(); // L: 2148
					if (var24.method297() != 200) { // L: 2149
						GrandExchangeOfferWorldComparator.RunException_sendStackTrace("Response code: " + var24.method297() + "Response body: " + var24.method299(), (Throwable)null); // L: 2150
						class149.getLoginError(65); // L: 2151
						this.field657 = null; // L: 2152
						return; // L: 2153
					}

					List var27 = (List)var24.method301().get("Content-Type"); // L: 2155
					if (var27 != null && var27.contains(class472.field4810.method8563())) { // L: 2156
						try {
							JSONObject var5 = new JSONObject(var24.method299()); // L: 2158
							this.field527 = var5.getString("token"); // L: 2159
						} catch (JSONException var17) { // L: 2161
							GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var17); // L: 2162
							class149.getLoginError(65); // L: 2163
							this.field657 = null; // L: 2164
							return; // L: 2165
						}
					} else {
						this.field527 = var24.method299(); // L: 2169
					}

					this.field657 = null; // L: 2171
				}

				field522 = 0; // L: 2177
				class19.method295(1); // L: 2178
			}

			if (loginState == 1) { // L: 2180
				if (Player.socketTask == null) { // L: 2181
					Player.socketTask = GameEngine.taskHandler.newSocketTask(Friend.worldHost, class252.currentPort); // L: 2182
				}

				if (Player.socketTask.status == 2) { // L: 2184
					throw new IOException();
				}

				if (Player.socketTask.status == 1) { // L: 2185
					var1 = WorldMapData_0.method4467((Socket)Player.socketTask.result, 40000, 5000); // L: 2186
					packetWriter.setSocket(var1); // L: 2187
					Player.socketTask = null; // L: 2188
					class19.method295(2); // L: 2189
				}
			}

			PacketBufferNode var26;
			if (loginState == 2) { // L: 2192
				packetWriter.clearBuffer(); // L: 2193
				var26 = HorizontalAlignment.method3686(); // L: 2194
				var26.packetBuffer.writeByte(LoginPacket.field3377.id); // L: 2195
				packetWriter.addNode(var26); // L: 2196
				packetWriter.flush(); // L: 2197
				var2.offset = 0; // L: 2198
				class19.method295(3); // L: 2199
			}

			int var12;
			if (loginState == 3) { // L: 2201
				if (MusicPatchPcmStream.pcmPlayer0 != null) { // L: 2202
					MusicPatchPcmStream.pcmPlayer0.method795();
				}

				if (var1.isAvailable(1)) { // L: 2203
					var12 = var1.readUnsignedByte(); // L: 2204
					if (MusicPatchPcmStream.pcmPlayer0 != null) { // L: 2205
						MusicPatchPcmStream.pcmPlayer0.method795();
					}

					if (var12 != 0) { // L: 2206
						class149.getLoginError(var12); // L: 2207
						return; // L: 2208
					}

					var2.offset = 0; // L: 2210
					class19.method295(4); // L: 2211
				}
			}

			if (loginState == 4) { // L: 2214
				if (var2.offset < 8) { // L: 2215
					var12 = var1.available(); // L: 2216
					if (var12 > 8 - var2.offset) { // L: 2217
						var12 = 8 - var2.offset;
					}

					if (var12 > 0) { // L: 2218
						var1.read(var2.array, var2.offset, var12); // L: 2219
						var2.offset += var12; // L: 2220
					}
				}

				if (var2.offset == 8) { // L: 2223
					var2.offset = 0; // L: 2224
					Clock.field2337 = var2.readLong(); // L: 2225
					class19.method295(5); // L: 2226
				}
			}

			int var6;
			if (loginState == 5) { // L: 2229
				packetWriter.packetBuffer.offset = 0; // L: 2230
				packetWriter.clearBuffer(); // L: 2231
				PacketBuffer var28 = new PacketBuffer(500); // L: 2232
				int[] var29 = new int[]{EnumComposition.secureRandom.nextInt(), EnumComposition.secureRandom.nextInt(), EnumComposition.secureRandom.nextInt(), EnumComposition.secureRandom.nextInt()}; // L: 2233 2234 2235 2236 2237
				var28.offset = 0; // L: 2238
				var28.writeByte(1); // L: 2239
				var28.writeInt(var29[0]); // L: 2240
				var28.writeInt(var29[1]); // L: 2241
				var28.writeInt(var29[2]); // L: 2242
				var28.writeInt(var29[3]); // L: 2243
				var28.writeLong(Clock.field2337); // L: 2244
				if (gameState == 40) { // L: 2245
					var28.writeInt(class215.field2305[0]); // L: 2246
					var28.writeInt(class215.field2305[1]); // L: 2247
					var28.writeInt(class215.field2305[2]); // L: 2248
					var28.writeInt(class215.field2305[3]); // L: 2249
				} else {
					if (gameState == 50) { // L: 2252
						var28.writeByte(class124.field1472.rsOrdinal()); // L: 2253
						var28.writeInt(class160.field1748); // L: 2254
					} else {
						var28.writeByte(field525.rsOrdinal()); // L: 2257
						switch(field525.field1468) { // L: 2258
						case 0:
						case 1:
							var28.writeMedium(class53.field350); // L: 2272
							++var28.offset; // L: 2273
							break;
						case 2:
							var28.offset += 4; // L: 2266
							break; // L: 2267
						case 3:
							var28.writeInt(WorldMapIcon_1.clientPreferences.method2567(Login.Login_username)); // L: 2261
						}
					}

					if (field526.method9577()) { // L: 2278
						var28.writeByte(class531.field5192.rsOrdinal()); // L: 2279
						var28.writeStringCp1252NullTerminated(this.field527); // L: 2280
					} else {
						var28.writeByte(class531.field5197.rsOrdinal()); // L: 2283
						var28.writeStringCp1252NullTerminated(Login.Login_password); // L: 2284
					}
				}

				var28.encryptRsa(class74.field889, class74.field890); // L: 2287
				class215.field2305 = var29; // L: 2288
				PacketBufferNode var32 = HorizontalAlignment.method3686(); // L: 2289
				var32.packetBuffer.offset = 0; // L: 2290
				if (gameState == 40) { // L: 2291
					var32.packetBuffer.writeByte(LoginPacket.field3380.id); // L: 2292
				} else {
					var32.packetBuffer.writeByte(LoginPacket.field3383.id); // L: 2295
				}

				var32.packetBuffer.writeShort(0); // L: 2297
				var6 = var32.packetBuffer.offset; // L: 2298
				var32.packetBuffer.writeInt(218); // L: 2299
				var32.packetBuffer.writeInt(1); // L: 2300
				var32.packetBuffer.writeByte(clientType); // L: 2301
				var32.packetBuffer.writeByte(field490); // L: 2302
				byte var7 = 0; // L: 2303
				var32.packetBuffer.writeByte(var7); // L: 2304
				var32.packetBuffer.writeBytes(var28.array, 0, var28.offset); // L: 2305
				int var8 = var32.packetBuffer.offset; // L: 2306
				var32.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2307
				var32.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2308
				var32.packetBuffer.writeShort(Language.canvasWidth); // L: 2309
				var32.packetBuffer.writeShort(class47.canvasHeight); // L: 2310
				class354.method6858(var32.packetBuffer); // L: 2311
				var32.packetBuffer.writeStringCp1252NullTerminated(MenuAction.field878); // L: 2312
				var32.packetBuffer.writeInt(DevicePcmPlayerProvider.field111); // L: 2313
				if (field492 > 213) { // L: 2314
					var32.packetBuffer.writeByte(0); // L: 2315
				}

				Buffer var9 = new Buffer(class60.field419.size()); // L: 2317
				class60.field419.write(var9); // L: 2318
				var32.packetBuffer.writeBytes(var9.array, 0, var9.array.length); // L: 2319
				var32.packetBuffer.writeByte(clientType); // L: 2320
				var32.packetBuffer.writeInt(0); // L: 2321
				var32.packetBuffer.method9311(PcmPlayer.field281.hash); // L: 2322
				var32.packetBuffer.method9316(SoundSystem.field298.hash); // L: 2323
				var32.packetBuffer.writeIntME(class145.field1643.hash); // L: 2324
				var32.packetBuffer.method9316(class7.field25.hash); // L: 2325
				var32.packetBuffer.writeIntME(class514.field5059.hash); // L: 2326
				var32.packetBuffer.writeIntME(StructComposition.field2041.hash); // L: 2327
				var32.packetBuffer.method9316(class313.field3398.hash); // L: 2328
				var32.packetBuffer.method9311(UserComparator7.field1441.hash); // L: 2329
				var32.packetBuffer.writeIntME(WorldMapDecorationType.field3867.hash); // L: 2330
				var32.packetBuffer.method9311(SpotAnimationDefinition.field2007.hash); // L: 2331
				var32.packetBuffer.method9316(Canvas.field114.hash); // L: 2332
				var32.packetBuffer.method9311(VarbitComposition.archive13.hash); // L: 2333
				var32.packetBuffer.writeInt(WorldMapData_0.field2426.hash); // L: 2334
				var32.packetBuffer.method9316(0); // L: 2335
				var32.packetBuffer.writeIntME(class47.archive12.hash); // L: 2336
				var32.packetBuffer.writeIntME(GrandExchangeOfferOwnWorldComparator.field481.hash); // L: 2337
				var32.packetBuffer.writeIntME(Language.field4412.hash); // L: 2338
				var32.packetBuffer.writeInt(WorldMapSection0.field2532.hash); // L: 2339
				var32.packetBuffer.writeIntME(class19.field92.hash); // L: 2340
				var32.packetBuffer.method9311(class344.archive2.hash); // L: 2341
				var32.packetBuffer.method9311(BuddyRankComparator.field1460.hash); // L: 2342
				var32.packetBuffer.xteaEncrypt(var29, var8, var32.packetBuffer.offset); // L: 2343
				var32.packetBuffer.writeLengthShort(var32.packetBuffer.offset - var6); // L: 2344
				packetWriter.addNode(var32); // L: 2345
				packetWriter.flush(); // L: 2346
				packetWriter.isaacCipher = new IsaacCipher(var29); // L: 2347
				int[] var10 = new int[4]; // L: 2348

				for (int var11 = 0; var11 < 4; ++var11) { // L: 2349
					var10[var11] = var29[var11] + 50;
				}

				var2.newIsaacCipher(var10); // L: 2350
				class19.method295(6); // L: 2351
			}

			int var13;
			if (loginState == 6 && var1.available() > 0) { // L: 2353 2354
				var12 = var1.readUnsignedByte(); // L: 2355
				if (var12 == 61) { // L: 2356
					var13 = var1.available(); // L: 2357
					PendingSpawn.field1169 = var13 == 1 && var1.readUnsignedByte() == 1; // L: 2358
					class19.method295(5); // L: 2359
				}

				if (var12 == 21 && gameState == 20) { // L: 2361
					class19.method295(12); // L: 2362
				} else if (var12 == 2) { // L: 2364
					class19.method295(14); // L: 2365
				} else if (var12 == 15 && gameState == 40) { // L: 2367
					packetWriter.serverPacketLength = -1; // L: 2368
					class19.method295(19); // L: 2369
				} else if (var12 == 64) { // L: 2371
					class19.method295(10); // L: 2372
				} else if (var12 == 23 && field614 < 1) { // L: 2374
					++field614; // L: 2375
					class19.method295(0); // L: 2376
				} else if (var12 == 29) { // L: 2378
					class19.method295(17); // L: 2379
				} else {
					if (var12 != 69) { // L: 2381
						class149.getLoginError(var12); // L: 2385
						return; // L: 2386
					}

					class19.method295(7); // L: 2382
				}
			}

			if (loginState == 7 && var1.available() >= 2) { // L: 2390 2391
				var1.read(var2.array, 0, 2); // L: 2392
				var2.offset = 0; // L: 2393
				Language.field4410 = var2.readUnsignedShort(); // L: 2394
				class19.method295(8); // L: 2395
			}

			if (loginState == 8 && var1.available() >= Language.field4410) { // L: 2398 2399
				var2.offset = 0; // L: 2400
				var1.read(var2.array, var2.offset, Language.field4410); // L: 2401
				class6 var30 = class221.method4305()[var2.readUnsignedByte()]; // L: 2402

				try {
					class3 var31 = WorldMapElement.method3590(var30); // L: 2404
					this.field542 = new class7(var2, var31); // L: 2405
					class19.method295(9); // L: 2406
				} catch (Exception var16) { // L: 2408
					class149.getLoginError(22); // L: 2409
					return; // L: 2410
				}
			}

			if (loginState == 9 && this.field542.method51()) { // L: 2414 2415
				this.field702 = this.field542.method52(); // L: 2416
				this.field542.method62(); // L: 2417
				this.field542 = null; // L: 2418
				if (this.field702 == null) { // L: 2419
					class149.getLoginError(22); // L: 2420
					return; // L: 2421
				}

				packetWriter.clearBuffer(); // L: 2423
				var26 = HorizontalAlignment.method3686(); // L: 2424
				var26.packetBuffer.writeByte(LoginPacket.field3379.id); // L: 2425
				var26.packetBuffer.writeShort(this.field702.offset); // L: 2426
				var26.packetBuffer.method9367(this.field702); // L: 2427
				packetWriter.addNode(var26); // L: 2428
				packetWriter.flush(); // L: 2429
				this.field702 = null; // L: 2430
				class19.method295(6); // L: 2431
			}

			if (loginState == 10 && var1.available() > 0) { // L: 2434 2435
				class223.field2351 = var1.readUnsignedByte(); // L: 2436
				class19.method295(11); // L: 2437
			}

			if (loginState == 11 && var1.available() >= class223.field2351) { // L: 2440 2441
				var1.read(var2.array, 0, class223.field2351); // L: 2442
				var2.offset = 0; // L: 2443
				class19.method295(6); // L: 2444
			}

			if (loginState == 12 && var1.available() > 0) { // L: 2447 2448
				field675 = (var1.readUnsignedByte() + 3) * 60; // L: 2449
				class19.method295(13); // L: 2450
			}

			if (loginState == 13) { // L: 2453
				field522 = 0; // L: 2454
				class139.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field675 / 60 + " seconds."); // L: 2455
				if (--field675 <= 0) { // L: 2456
					class19.method295(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) { // L: 2459 2460
					SoundCache.field303 = var1.readUnsignedByte(); // L: 2461
					class19.method295(15); // L: 2462
				}

				if (loginState == 15 && var1.available() >= SoundCache.field303) { // L: 2465 2466
					boolean var38 = var1.readUnsignedByte() == 1; // L: 2467
					var1.read(var2.array, 0, 4); // L: 2468
					var2.offset = 0; // L: 2469
					boolean var37 = false; // L: 2470
					if (var38) { // L: 2471
						var13 = var2.readByteIsaac() << 24; // L: 2472
						var13 |= var2.readByteIsaac() << 16; // L: 2473
						var13 |= var2.readByteIsaac() << 8; // L: 2474
						var13 |= var2.readByteIsaac(); // L: 2475
						WorldMapIcon_1.clientPreferences.method2565(Login.Login_username, var13); // L: 2476
					}

					if (Login_isUsernameRemembered) { // L: 2478
						WorldMapIcon_1.clientPreferences.method2586(Login.Login_username); // L: 2479
					} else {
						WorldMapIcon_1.clientPreferences.method2586((String)null); // L: 2482
					}

					TextureProvider.savePreferences(); // L: 2484
					staffModLevel = var1.readUnsignedByte(); // L: 2485
					playerMod = var1.readUnsignedByte() == 1; // L: 2486
					localPlayerIndex = var1.readUnsignedByte(); // L: 2487
					localPlayerIndex <<= 8; // L: 2488
					localPlayerIndex += var1.readUnsignedByte(); // L: 2489
					field754 = var1.readUnsignedByte(); // L: 2490
					var1.read(var2.array, 0, 8); // L: 2491
					var2.offset = 0; // L: 2492
					this.accountHash = var2.readLong(); // L: 2493
					var1.read(var2.array, 0, 8); // L: 2494
					var2.offset = 0; // L: 2495
					field698 = var2.readLong(); // L: 2496
					if (field492 >= 214) { // L: 2497
						var1.read(var2.array, 0, 8); // L: 2498
						var2.offset = 0; // L: 2499
						var2.readLong(); // L: 2500
					}

					var1.read(var2.array, 0, 1); // L: 2502
					var2.offset = 0; // L: 2503
					ServerPacket[] var35 = class12.method168(); // L: 2504
					var6 = var2.readSmartByteShortIsaac(); // L: 2505
					if (var6 < 0 || var6 >= var35.length) { // L: 2506
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var35[var6]; // L: 2507
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2508
					var1.read(var2.array, 0, 2); // L: 2509
					var2.offset = 0; // L: 2510
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2511

					try {
						class26.method394(SpriteMask.client, "zap"); // L: 2513
					} catch (Throwable var15) { // L: 2515
					}

					class19.method295(16); // L: 2516
				}

				if (loginState == 16) { // L: 2519
					if (var1.available() >= packetWriter.serverPacketLength) { // L: 2520
						var2.offset = 0; // L: 2521
						var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2522
						timer.method7926(); // L: 2523
						class53.method1110(); // L: 2524
						Players.updatePlayer(var2); // L: 2525
						DefaultsGroup.field4740 = -1; // L: 2526
						GrandExchangeOfferUnitPriceComparator.method7146(false, var2, field492 >= 218); // L: 2527
						packetWriter.serverPacket = null; // L: 2528
					}

				} else {
					if (loginState == 17 && var1.available() >= 2) { // L: 2532 2533
						var2.offset = 0; // L: 2534
						var1.read(var2.array, 0, 2); // L: 2535
						var2.offset = 0; // L: 2536
						GrandExchangeOfferOwnWorldComparator.field478 = var2.readUnsignedShort(); // L: 2537
						class19.method295(18); // L: 2538
					}

					if (loginState == 18 && var1.available() >= GrandExchangeOfferOwnWorldComparator.field478) { // L: 2541 2542
						var2.offset = 0; // L: 2543
						var1.read(var2.array, 0, GrandExchangeOfferOwnWorldComparator.field478); // L: 2544
						var2.offset = 0; // L: 2545
						String var34 = var2.readStringCp1252NullTerminated(); // L: 2546
						String var33 = var2.readStringCp1252NullTerminated(); // L: 2547
						String var36 = var2.readStringCp1252NullTerminated(); // L: 2548
						class139.setLoginResponseString(var34, var33, var36); // L: 2549
						WorldMapSection2.method4516(10); // L: 2550
						if (field526.method9577()) { // L: 2551
							UserComparator7.method2966(9); // L: 2552
						}
					}

					if (loginState == 19) { // L: 2556
						if (packetWriter.serverPacketLength == -1) { // L: 2557
							if (var1.available() < 2) { // L: 2558
								return;
							}

							var1.read(var2.array, 0, 2); // L: 2559
							var2.offset = 0; // L: 2560
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2561
						}

						if (var1.available() >= packetWriter.serverPacketLength) { // L: 2563
							var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2564
							var2.offset = 0; // L: 2565
							var12 = packetWriter.serverPacketLength; // L: 2566
							timer.method7928(); // L: 2567
							class17.method263(); // L: 2568
							Players.updatePlayer(var2); // L: 2569
							if (var12 != var2.offset) { // L: 2570
								throw new RuntimeException(); // L: 2571
							}
						}
					} else {
						++field522; // L: 2575
						if (field522 > 2000) { // L: 2576
							if (field614 < 1) { // L: 2577
								if (WorldMapCacheName.worldPort == class252.currentPort) { // L: 2578
									class252.currentPort = AbstractSocket.js5Port;
								} else {
									class252.currentPort = WorldMapCacheName.worldPort; // L: 2579
								}

								++field614; // L: 2580
								class19.method295(0); // L: 2581
							} else {
								class149.getLoginError(-3); // L: 2584
							}
						}
					}
				}
			}
		} catch (IOException var23) { // L: 2588
			if (field614 < 1) { // L: 2589
				if (WorldMapCacheName.worldPort == class252.currentPort) { // L: 2590
					class252.currentPort = AbstractSocket.js5Port;
				} else {
					class252.currentPort = WorldMapCacheName.worldPort; // L: 2591
				}

				++field614; // L: 2592
				class19.method295(0); // L: 2593
			} else {
				class149.getLoginError(-2); // L: 2596
			}
		}
	} // L: 2457 2530 2573 2582 2585 2594 2597 2599

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-614967617"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3024
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3025
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3026
			hadNetworkError = false; // L: 3027
			class9.method85(); // L: 3028
		} else {
			if (!isMenuOpen) { // L: 3031
				UserComparator10.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1829(packetWriter); ++var1) { // L: 3032 3033
			}

			if (gameState == 30) { // L: 3035
				int var2;
				PacketBufferNode var14;
				while (class216.method4239()) { // L: 3036
					var14 = class113.getPacketBufferNode(ClientPacket.field3192, packetWriter.isaacCipher); // L: 3037
					var14.packetBuffer.writeByte(0); // L: 3038
					var2 = var14.packetBuffer.offset; // L: 3039
					class415.performReflectionCheck(var14.packetBuffer); // L: 3040
					var14.packetBuffer.method9257(var14.packetBuffer.offset - var2); // L: 3041
					packetWriter.addNode(var14); // L: 3042
				}

				if (timer.field4596) { // L: 3044
					var14 = class113.getPacketBufferNode(ClientPacket.field3169, packetWriter.isaacCipher); // L: 3046
					var14.packetBuffer.writeByte(0); // L: 3047
					var2 = var14.packetBuffer.offset; // L: 3048
					timer.write(var14.packetBuffer); // L: 3049
					var14.packetBuffer.method9257(var14.packetBuffer.offset - var2); // L: 3050
					packetWriter.addNode(var14); // L: 3051
					timer.method7927(); // L: 3052
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				PacketBuffer var10000;
				synchronized(Message.mouseRecorder.lock) { // L: 3055
					if (!field729) { // L: 3056
						Message.mouseRecorder.index = 0; // L: 3142
					} else if (MouseHandler.MouseHandler_lastButton != 0 || Message.mouseRecorder.index >= 40) { // L: 3057
						PacketBufferNode var15 = null; // L: 3059
						var3 = 0; // L: 3060
						var4 = 0; // L: 3061
						var5 = 0; // L: 3062
						var6 = 0; // L: 3063

						for (var7 = 0; var7 < Message.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 3064 3065
							var4 = var7; // L: 3066
							var8 = Message.mouseRecorder.ys[var7]; // L: 3067
							if (var8 < -1) { // L: 3068
								var8 = -1;
							} else if (var8 > 65534) { // L: 3069
								var8 = 65534;
							}

							var9 = Message.mouseRecorder.xs[var7]; // L: 3070
							if (var9 < -1) { // L: 3071
								var9 = -1;
							} else if (var9 > 65534) { // L: 3072
								var9 = 65534;
							}

							if (var9 != field501 || var8 != field502) { // L: 3073
								if (var15 == null) { // L: 3076
									var15 = class113.getPacketBufferNode(ClientPacket.field3197, packetWriter.isaacCipher); // L: 3077
									var15.packetBuffer.writeByte(0); // L: 3078
									var3 = var15.packetBuffer.offset; // L: 3079
									var10000 = var15.packetBuffer; // L: 3080
									var10000.offset += 2;
									var5 = 0; // L: 3081
									var6 = 0; // L: 3082
								}

								if (-1L != field503) { // L: 3087
									var10 = var9 - field501; // L: 3088
									var11 = var8 - field502; // L: 3089
									var12 = (int)((Message.mouseRecorder.millis[var7] - field503) / 20L); // L: 3090
									var5 = (int)((long)var5 + (Message.mouseRecorder.millis[var7] - field503) % 20L); // L: 3091
								} else {
									var10 = var9; // L: 3094
									var11 = var8; // L: 3095
									var12 = Integer.MAX_VALUE; // L: 3096
								}

								field501 = var9; // L: 3098
								field502 = var8; // L: 3099
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3100
									var10 += 32; // L: 3101
									var11 += 32; // L: 3102
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3103
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3105
									var10 += 128; // L: 3106
									var11 += 128; // L: 3107
									var15.packetBuffer.writeByte(var12 + 128); // L: 3108
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3109
								} else if (var12 < 32) { // L: 3111
									var15.packetBuffer.writeByte(var12 + 192); // L: 3112
									if (var9 != -1 && var8 != -1) { // L: 3113
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3114
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3117
									if (var9 != -1 && var8 != -1) { // L: 3118
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3119
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3121
								field503 = Message.mouseRecorder.millis[var7]; // L: 3122
							}
						}

						if (var15 != null) { // L: 3124
							var15.packetBuffer.method9257(var15.packetBuffer.offset - var3); // L: 3125
							var7 = var15.packetBuffer.offset; // L: 3126
							var15.packetBuffer.offset = var3; // L: 3127
							var15.packetBuffer.writeByte(var5 / var6); // L: 3128
							var15.packetBuffer.writeByte(var5 % var6); // L: 3129
							var15.packetBuffer.offset = var7; // L: 3130
							packetWriter.addNode(var15); // L: 3131
						}

						if (var4 >= Message.mouseRecorder.index) { // L: 3133
							Message.mouseRecorder.index = 0;
						} else {
							MouseRecorder var52 = Message.mouseRecorder; // L: 3135
							var52.index -= var4;
							System.arraycopy(Message.mouseRecorder.xs, var4, Message.mouseRecorder.xs, 0, Message.mouseRecorder.index); // L: 3136
							System.arraycopy(Message.mouseRecorder.ys, var4, Message.mouseRecorder.ys, 0, Message.mouseRecorder.index); // L: 3137
							System.arraycopy(Message.mouseRecorder.millis, var4, Message.mouseRecorder.millis, 0, Message.mouseRecorder.index); // L: 3138
						}
					}
				}

				if (MouseHandler.MouseHandler_lastButton == 1 || !class19.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3144
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L; // L: 3145
					if (var16 > 32767L) { // L: 3146
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L; // L: 3147
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3148
					if (var3 < 0) { // L: 3149
						var3 = 0;
					} else if (var3 > class47.canvasHeight) { // L: 3150
						var3 = class47.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3151
					if (var4 < 0) { // L: 3152
						var4 = 0;
					} else if (var4 > Language.canvasWidth) { // L: 3153
						var4 = Language.canvasWidth;
					}

					var5 = (int)var16; // L: 3154
					PacketBufferNode var18 = class113.getPacketBufferNode(ClientPacket.field3164, packetWriter.isaacCipher); // L: 3155
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 3156
					var18.packetBuffer.writeShort(var4); // L: 3157
					var18.packetBuffer.writeShort(var3); // L: 3158
					packetWriter.addNode(var18); // L: 3159
				}

				if (mouseWheelRotation != 0) { // L: 3161
					var14 = class113.getPacketBufferNode(ClientPacket.field3171, packetWriter.isaacCipher); // L: 3162
					var14.packetBuffer.writeShort(mouseWheelRotation); // L: 3163
					packetWriter.addNode(var14); // L: 3164
				}

				if (field724.field2354 > 0) { // L: 3166
					var14 = class113.getPacketBufferNode(ClientPacket.field3213, packetWriter.isaacCipher); // L: 3167
					var14.packetBuffer.writeShort(0); // L: 3168
					var2 = var14.packetBuffer.offset; // L: 3169
					long var19 = SpotAnimationDefinition.method3775(); // L: 3170

					for (var5 = 0; var5 < field724.field2354; ++var5) { // L: 3171
						long var21 = var19 - field638; // L: 3172
						if (var21 > 16777215L) { // L: 3173
							var21 = 16777215L;
						}

						field638 = var19; // L: 3174
						var14.packetBuffer.method9314((int)var21); // L: 3175
						var14.packetBuffer.method9291(field724.field2353[var5]); // L: 3176
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 3178
					packetWriter.addNode(var14); // L: 3179
				}

				if (field523 > 0) { // L: 3181
					--field523;
				}

				if (field724.method4316(96) || field724.method4316(97) || field724.method4316(98) || field724.method4316(99)) { // L: 3182
					field587 = true; // L: 3183
				}

				if (field587 && field523 <= 0) { // L: 3185
					field523 = 20; // L: 3186
					field587 = false; // L: 3187
					var14 = class113.getPacketBufferNode(ClientPacket.field3216, packetWriter.isaacCipher); // L: 3189
					var14.packetBuffer.method9299(camAngleX); // L: 3190
					var14.packetBuffer.method9299(camAngleY); // L: 3191
					packetWriter.addNode(var14); // L: 3192
				}

				if (class357.hasFocus && !hadFocus) { // L: 3194
					hadFocus = true; // L: 3195
					var14 = class113.getPacketBufferNode(ClientPacket.field3196, packetWriter.isaacCipher); // L: 3197
					var14.packetBuffer.writeByte(1); // L: 3198
					packetWriter.addNode(var14); // L: 3199
				}

				if (!class357.hasFocus && hadFocus) { // L: 3201
					hadFocus = false; // L: 3202
					var14 = class113.getPacketBufferNode(ClientPacket.field3196, packetWriter.isaacCipher); // L: 3204
					var14.packetBuffer.writeByte(0); // L: 3205
					packetWriter.addNode(var14); // L: 3206
				}

				if (class187.worldMap != null) { // L: 3209
					class187.worldMap.method8713();
				}

				if (class344.FriendsChatManager_inFriendsChat) { // L: 3211
					if (class20.friendsChatManager != null) { // L: 3212
						class20.friendsChatManager.sort(); // L: 3213
					}

					for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3216
						Player var35 = players[Players.Players_indices[var1]]; // L: 3217
						var35.method2423(); // L: 3218
					}

					class344.FriendsChatManager_inFriendsChat = false; // L: 3221
				}

				class153.method3311(); // L: 3224
				class435.method8025(); // L: 3225
				if (gameState == 30) { // L: 3226
					for (PendingSpawn var34 = (PendingSpawn)pendingSpawns.last(); var34 != null; var34 = (PendingSpawn)pendingSpawns.previous()) { // L: 3228 3229 3260
						if (var34.hitpoints > 0) { // L: 3230
							--var34.hitpoints;
						}

						if (var34.hitpoints == 0) { // L: 3231
							if (var34.objectId >= 0) { // L: 3233
								var3 = var34.objectId; // L: 3235
								var4 = var34.field1158; // L: 3236
								ObjectComposition var23 = WorldMapSection2.getObjectDefinition(var3); // L: 3238
								if (var4 == 11) { // L: 3239
									var4 = 10;
								}

								if (var4 >= 5 && var4 <= 8) { // L: 3240
									var4 = 4;
								}

								boolean var30 = var23.method3892(var4); // L: 3241
								if (!var30) { // L: 3243
									continue;
								}
							}

							WorldMapAreaData.method5045(var34.plane, var34.type, var34.x, var34.y, var34.objectId, var34.field1157, var34.field1158, var34.field1152); // L: 3245
							var34.remove(); // L: 3246
						} else {
							if (var34.delay > 0) { // L: 3250
								--var34.delay;
							}

							if (var34.delay == 0 && var34.x >= 1 && var34.y >= 1 && var34.x <= 102 && var34.y <= 102 && (var34.field1162 < 0 || class141.method3211(var34.field1162, var34.field1161))) { // L: 3251 3252
								WorldMapAreaData.method5045(var34.plane, var34.type, var34.x, var34.y, var34.field1162, var34.field1160, var34.field1161, var34.field1152); // L: 3253
								var34.delay = -1; // L: 3254
								if (var34.field1162 == var34.objectId && var34.objectId == -1) { // L: 3255
									var34.remove();
								} else if (var34.field1162 == var34.objectId && var34.field1157 == var34.field1160 && var34.field1161 == var34.field1158) { // L: 3256
									var34.remove();
								}
							}
						}
					}

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) { // L: 3264
						var10002 = queuedSoundEffectDelays[var1]--; // L: 3265
						if (queuedSoundEffectDelays[var1] >= -10) { // L: 3266
							SoundEffect var37 = soundEffects[var1]; // L: 3278
							if (var37 == null) { // L: 3279
								var10000 = null; // L: 3280
								var37 = SoundEffect.readSoundEffect(Language.field4412, soundEffectIds[var1], 0);
								if (var37 == null) { // L: 3281
									continue;
								}

								int[] var53 = queuedSoundEffectDelays; // L: 3282
								var53[var1] += var37.calculateDelay();
								soundEffects[var1] = var37; // L: 3283
							}

							if (queuedSoundEffectDelays[var1] < 0) { // L: 3289
								if (soundLocations[var1] != 0) { // L: 3291
									var4 = (soundLocations[var1] & 255) * 128; // L: 3292
									var5 = soundLocations[var1] >> 16 & 255; // L: 3293
									var6 = var5 * 128 + 64 - class229.localPlayer.x; // L: 3294
									if (var6 < 0) { // L: 3295
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255; // L: 3296
									var8 = var7 * 128 + 64 - class229.localPlayer.y; // L: 3297
									if (var8 < 0) { // L: 3298
										var8 = -var8;
									}

									var9 = var8 + var6 - 128; // L: 3299
									if (var9 > var4) { // L: 3300
										queuedSoundEffectDelays[var1] = -100; // L: 3301
										continue; // L: 3302
									}

									if (var9 < 0) { // L: 3304
										var9 = 0;
									}

									var3 = (var4 - var9) * WorldMapIcon_1.clientPreferences.method2605() / var4; // L: 3305
								} else {
									var3 = WorldMapIcon_1.clientPreferences.method2556(); // L: 3307
								}

								if (var3 > 0) { // L: 3308
									RawSound var24 = var37.toRawSound().resample(class521.decimator); // L: 3309
									RawPcmStream var44 = RawPcmStream.createRawPcmStream(var24, 100, var3); // L: 3310
									var44.setNumLoops(queuedSoundEffectLoops[var1] - 1); // L: 3311
									LoginScreenAnimation.pcmStreamMixer.addSubStream(var44); // L: 3312
								}

								queuedSoundEffectDelays[var1] = -100; // L: 3314
							}
						} else {
							--soundEffectCount; // L: 3267

							for (var2 = var1; var2 < soundEffectCount; ++var2) { // L: 3268
								soundEffectIds[var2] = soundEffectIds[var2 + 1]; // L: 3269
								soundEffects[var2] = soundEffects[var2 + 1]; // L: 3270
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1]; // L: 3271
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1]; // L: 3272
								soundLocations[var2] = soundLocations[var2 + 1]; // L: 3273
							}

							--var1; // L: 3275
						}
					}

					if (playingJingle && !BuddyRankComparator.method3006()) { // L: 3317
						if (WorldMapIcon_1.clientPreferences.method2554() != 0) { // L: 3318
							boolean var31 = !class316.field3424.isEmpty(); // L: 3321
							if (var31) { // L: 3323
								class72.method2137(class514.field5059, WorldMapIcon_1.clientPreferences.method2554()); // L: 3324
							}
						}

						playingJingle = false; // L: 3327
					}

					++packetWriter.field1412; // L: 3330
					if (packetWriter.field1412 > 750) { // L: 3331
						class9.method85(); // L: 3332
					} else {
						var1 = Players.Players_count; // L: 3336
						int[] var39 = Players.Players_indices; // L: 3337

						for (var3 = 0; var3 < var1; ++var3) { // L: 3338
							Player var46 = players[var39[var3]]; // L: 3339
							if (var46 != null) { // L: 3340
								class228.updateActorSequence(var46, 1); // L: 3341
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3346
							var2 = npcIndices[var1]; // L: 3347
							NPC var25 = npcs[var2]; // L: 3348
							if (var25 != null) { // L: 3349
								class228.updateActorSequence(var25, var25.definition.size); // L: 3350
							}
						}

						int[] var36 = Players.Players_indices; // L: 3355

						for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 3356
							Player var50 = players[var36[var2]]; // L: 3357
							if (var50 != null && var50.field1195 > 0) { // L: 3358
								--var50.field1195; // L: 3359
								if (var50.field1195 == 0) { // L: 3360
									var50.field1225 = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) { // L: 3363
							var3 = npcIndices[var2]; // L: 3364
							NPC var47 = npcs[var3]; // L: 3365
							if (var47 != null && var47.field1195 > 0) { // L: 3366
								--var47.field1195; // L: 3367
								if (var47.field1195 == 0) { // L: 3368
									var47.field1225 = null;
								}
							}
						}

						++field564; // L: 3372
						if (mouseCrossColor != 0) { // L: 3373
							mouseCrossState = mouseCrossState * 400 + 20; // L: 3374
							if (mouseCrossState * 400 >= 400) { // L: 3375
								mouseCrossColor = 0;
							}
						}

						Widget var38 = Interpreter.mousedOverWidgetIf1; // L: 3377
						Widget var41 = class412.field4539; // L: 3378
						Interpreter.mousedOverWidgetIf1 = null; // L: 3379
						class412.field4539 = null; // L: 3380
						draggedOnWidget = null; // L: 3381
						field516 = false; // L: 3382
						field674 = false; // L: 3383
						field726 = 0; // L: 3384

						while (field724.method4324() && field726 < 128) { // L: 3385
							if (staffModLevel >= 2 && field724.method4316(82) && field724.field2360 == 66) { // L: 3386
								String var51 = class250.method4935(); // L: 3387
								SpriteMask.client.method501(var51); // L: 3388
							} else if (titleLoadingStage != 1 || field724.field2363 <= 0) { // L: 3391
								field518[field726] = field724.field2360; // L: 3394
								field586[field726] = field724.field2363; // L: 3395
								++field726; // L: 3396
							}
						}

						boolean var32 = staffModLevel >= 2; // L: 3400
						PacketBufferNode var26;
						if (var32 && field724.method4316(82) && field724.method4316(81) && mouseWheelRotation != 0) { // L: 3402
							var4 = class229.localPlayer.plane - mouseWheelRotation; // L: 3403
							if (var4 < 0) { // L: 3404
								var4 = 0;
							} else if (var4 > 3) { // L: 3405
								var4 = 3;
							}

							if (var4 != class229.localPlayer.plane) { // L: 3406
								var5 = class229.localPlayer.pathX[0] + class187.baseX * 64; // L: 3407
								var6 = class229.localPlayer.pathY[0] + class101.baseY * 64; // L: 3408
								var26 = class113.getPacketBufferNode(ClientPacket.field3223, packetWriter.isaacCipher); // L: 3411
								var26.packetBuffer.writeInt(0); // L: 3412
								var26.packetBuffer.method9300(var5); // L: 3413
								var26.packetBuffer.method9300(var6); // L: 3414
								var26.packetBuffer.writeByte(var4); // L: 3415
								packetWriter.addNode(var26); // L: 3416
							}

							mouseWheelRotation = 0; // L: 3419
						}

						if (rootInterface != -1) { // L: 3421
							class406.addPendingSpawnToScene(rootInterface, 0, 0, Language.canvasWidth, class47.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3422

						while (true) {
							Widget var40;
							Widget var45;
							ScriptEvent var49;
							do {
								var49 = (ScriptEvent)field793.removeLast(); // L: 3424
								if (var49 == null) { // L: 3425
									while (true) {
										do {
											var49 = (ScriptEvent)field703.removeLast(); // L: 3436
											if (var49 == null) { // L: 3437
												while (true) {
													do {
														var49 = (ScriptEvent)scriptEvents.removeLast(); // L: 3448
														if (var49 == null) { // L: 3449
															boolean var33 = false; // L: 3459

															while (true) {
																class222 var48 = (class222)field682.removeLast(); // L: 3461
																if (var48 == null) { // L: 3462
																	if (!var33 && MouseHandler.MouseHandler_lastButton == 1) { // L: 3513
																		field725.method4281(); // L: 3514
																	}

																	this.menu(); // L: 3516
																	class127.method3038(); // L: 3517
																	if (clickedWidget != null) { // L: 3518
																		this.method1727();
																	}

																	if (Scene.shouldSendWalk()) { // L: 3519
																		var5 = Scene.Scene_selectedX; // L: 3520
																		var6 = Scene.Scene_selectedY; // L: 3521
																		var26 = class113.getPacketBufferNode(ClientPacket.field3135, packetWriter.isaacCipher); // L: 3523
																		var26.packetBuffer.writeByte(5); // L: 3524
																		var26.packetBuffer.writeShort(class187.baseX * 64 + var5); // L: 3525
																		var26.packetBuffer.method9299(class101.baseY * 64 + var6); // L: 3526
																		var26.packetBuffer.method9292(field724.method4316(82) ? (field724.method4316(81) ? 2 : 1) : 0); // L: 3527
																		packetWriter.addNode(var26); // L: 3528
																		Scene.method5365(); // L: 3529
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3530
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3531
																		mouseCrossColor = 1; // L: 3532
																		mouseCrossState = 0; // L: 3533
																		destinationX = var5; // L: 3534
																		destinationY = var6; // L: 3535
																	}

																	if (var38 != Interpreter.mousedOverWidgetIf1) { // L: 3537
																		if (var38 != null) { // L: 3538
																			class159.invalidateWidget(var38);
																		}

																		if (Interpreter.mousedOverWidgetIf1 != null) { // L: 3539
																			class159.invalidateWidget(Interpreter.mousedOverWidgetIf1);
																		}
																	}

																	if (var41 != class412.field4539 && field648 == field768) { // L: 3541
																		if (var41 != null) { // L: 3542
																			class159.invalidateWidget(var41);
																		}

																		if (class412.field4539 != null) { // L: 3543
																			class159.invalidateWidget(class412.field4539);
																		}
																	}

																	if (class412.field4539 != null) { // L: 3545
																		if (field648 < field768) { // L: 3546
																			++field648; // L: 3547
																			if (field768 == field648) { // L: 3548
																				class159.invalidateWidget(class412.field4539);
																			}
																		}
																	} else if (field648 > 0) { // L: 3551
																		--field648;
																	}

																	class336.load(); // L: 3552
																	if (field482) { // L: 3553
																		TextureProvider.method5533();
																	} else if (isCameraLocked) { // L: 3554
																		if (!field748) { // L: 3555
																			var5 = ScriptFrame.field456 * 16384 + 64; // L: 3556
																			var6 = class216.field2314 * 16384 + 64; // L: 3557
																			var7 = WorldMapDecorationType.getTileHeight(var5, var6, ItemLayer.Client_plane) - class127.field1488; // L: 3558
																			class314.method5953(var5, var7, var6); // L: 3559
																		} else if (field751 != null) { // L: 3561
																			ViewportMouse.cameraX = field751.vmethod8673(); // L: 3562
																			class36.cameraZ = field751.vmethod8674(); // L: 3563
																			if (field661) { // L: 3564
																				SecureRandomFuture.cameraY = field751.vmethod8675(); // L: 3565
																			} else {
																				SecureRandomFuture.cameraY = WorldMapDecorationType.getTileHeight(ViewportMouse.cameraX, class36.cameraZ, ItemLayer.Client_plane) - field751.vmethod8675(); // L: 3568
																			}

																			field751.method8684(); // L: 3570
																		}

																		if (!field749) { // L: 3572
																			var5 = Messages.field1400 * 16384 + 64; // L: 3573
																			var6 = AbstractWorldMapData.field2575 * 16384 + 64; // L: 3574
																			var7 = WorldMapDecorationType.getTileHeight(var5, var6, ItemLayer.Client_plane) - class302.field3119; // L: 3575
																			var8 = var5 - ViewportMouse.cameraX; // L: 3576
																			var9 = var7 - SecureRandomFuture.cameraY; // L: 3577
																			var10 = var6 - class36.cameraZ; // L: 3578
																			var11 = (int)Math.sqrt((double)(var10 * var10 + var8 * var8)); // L: 3579
																			var12 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531D) & 2047; // L: 3580
																			int var27 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531D) & 2047; // L: 3581
																			class303.method5908(var12, var27); // L: 3582
																		} else {
																			if (field672 != null) { // L: 3585
																				Varcs.cameraPitch = field672.method8668(); // L: 3586
																				Varcs.cameraPitch = Math.min(Math.max(Varcs.cameraPitch, 128), 383); // L: 3587
																				field672.method8684(); // L: 3588
																			}

																			if (field752 != null) { // L: 3590
																				class192.cameraYaw = field752.method8668() & 2047; // L: 3591
																				field752.method8684(); // L: 3592
																			}
																		}
																	}

																	for (var5 = 0; var5 < 5; ++var5) { // L: 3596
																		var10002 = field728[var5]++;
																	}

																	class176.varcs.tryWrite(); // L: 3597
																	var5 = InterfaceParent.method2351(); // L: 3598
																	var6 = class181.method3656(); // L: 3599
																	if (var5 > 15000 && var6 > 15000) { // L: 3600
																		logoutTimer = 250; // L: 3601
																		WorldMapEvent.method5097(14500); // L: 3602
																		var26 = class113.getPacketBufferNode(ClientPacket.field3132, packetWriter.isaacCipher); // L: 3604
																		packetWriter.addNode(var26); // L: 3605
																	}

																	class12.friendSystem.processFriendUpdates(); // L: 3607

																	for (var7 = 0; var7 < field500.size(); ++var7) { // L: 3609
																		if (MouseRecorder.method2372((Integer)field500.get(var7)) != 2) { // L: 3610
																			field500.remove(var7); // L: 3611
																			--var7; // L: 3612
																		}
																	}

																	++packetWriter.pendingWrites; // L: 3616
																	if (packetWriter.pendingWrites > 50) { // L: 3617
																		var26 = class113.getPacketBufferNode(ClientPacket.field3153, packetWriter.isaacCipher); // L: 3619
																		packetWriter.addNode(var26); // L: 3620
																	}

																	try {
																		packetWriter.flush(); // L: 3623
																	} catch (IOException var28) { // L: 3625
																		class9.method85(); // L: 3626
																	}

																	return; // L: 3628
																}

																if (var48.field2349.type == 12) { // L: 3463
																	var33 = true;
																}

																if (var48 != null && var48.field2349 != null) { // L: 3465
																	if (var48.field2349.childIndex >= 0) { // L: 3466
																		var40 = HealthBarDefinition.field1877.method6285(var48.field2349.parentId); // L: 3467
																		if (var40 == null || var40.children == null || var40.children.length == 0 || var48.field2349.childIndex >= var40.children.length || var48.field2349 != var40.children[var48.field2349.childIndex]) { // L: 3468
																			continue;
																		}
																	}

																	if (var48.field2349.type == 11 && var48.field2344 == 0) { // L: 3472
																		if (var48.field2349.method6723(var48.field2346, var48.field2347, 0, 0)) { // L: 3473
																			switch(var48.field2349.method6681()) { // L: 3474
																			case 0:
																				HealthBar.openURL(var48.field2349.method6683(), true, false); // L: 3476
																				break; // L: 3477
																			case 1:
																				if (ClanChannel.method3483(class361.getWidgetFlags(var48.field2349))) { // L: 3479
																					int[] var43 = var48.field2349.method6684(); // L: 3480
																					if (var43 != null) { // L: 3481
																						var26 = class113.getPacketBufferNode(ClientPacket.field3167, packetWriter.isaacCipher); // L: 3482
																						var26.packetBuffer.method9311(var43[1]); // L: 3483
																						var26.packetBuffer.writeInt(var43[0]); // L: 3484
																						var26.packetBuffer.method9490(var48.field2349.childIndex); // L: 3485
																						var26.packetBuffer.writeInt(var43[2]); // L: 3486
																						var26.packetBuffer.method9311(var48.field2349.id); // L: 3487
																						var26.packetBuffer.writeIntME(var48.field2349.method6689()); // L: 3488
																						packetWriter.addNode(var26); // L: 3489
																					}
																				}
																			}
																		}
																	} else if (var48.field2349.type == 12) { // L: 3496
																		class341 var42 = var48.field2349.method6688(); // L: 3497
																		if (var42 != null && var42.method6409()) { // L: 3498
																			switch(var48.field2344) { // L: 3499
																			case 0:
																				field725.method4279(var48.field2349); // L: 3504
																				var42.method6361(true); // L: 3505
																				var42.method6400(var48.field2346, var48.field2347, field724.method4316(82), field724.method4316(81)); // L: 3506
																				break;
																			case 1:
																				var42.method6401(var48.field2346, var48.field2347); // L: 3501
																			}
																		}
																	}
																}
															}
														}

														var45 = var49.widget; // L: 3450
														if (var45.childIndex < 0) { // L: 3451
															break;
														}

														var40 = HealthBarDefinition.field1877.method6285(var45.parentId); // L: 3452
													} while(var40 == null || var40.children == null || var45.childIndex >= var40.children.length || var45 != var40.children[var45.childIndex]); // L: 3453

													class157.runScriptEvent(var49); // L: 3457
												}
											}

											var45 = var49.widget; // L: 3438
											if (var45.childIndex < 0) { // L: 3439
												break;
											}

											var40 = HealthBarDefinition.field1877.method6285(var45.parentId); // L: 3440
										} while(var40 == null || var40.children == null || var45.childIndex >= var40.children.length || var45 != var40.children[var45.childIndex]); // L: 3441

										class157.runScriptEvent(var49); // L: 3445
									}
								}

								var45 = var49.widget; // L: 3426
								if (var45.childIndex < 0) { // L: 3427
									break;
								}

								var40 = HealthBarDefinition.field1877.method6285(var45.parentId); // L: 3428
							} while(var40 == null || var40.children == null || var45.childIndex >= var40.children.length || var45 != var40.children[var45.childIndex]); // L: 3429

							class157.runScriptEvent(var49); // L: 3433
						}
					}
				}
			}
		}
	} // L: 3029 3333

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1786579284"
	)
	public void vmethod6202(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) { // L: 3794
			if (var1 > -1 && WorldMapIcon_1.clientPreferences.method2554() > 0 && !playingJingle) { // L: 3795
				PacketBufferNode var3 = class113.getPacketBufferNode(ClientPacket.field3185, packetWriter.isaacCipher); // L: 3796
				var3.packetBuffer.writeInt(var1); // L: 3797
				packetWriter.addNode(var3); // L: 3798
			}

		}
	} // L: 3800

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = Language.canvasWidth; // L: 4574
		int var2 = class47.canvasHeight; // L: 4575
		if (super.contentWidth < var1) { // L: 4576
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4577
		}

		if (WorldMapIcon_1.clientPreferences != null) { // L: 4578
			try {
				class26.method396(SpriteMask.client, "resize", new Object[]{ApproximateRouteStrategy.getWindowedMode()}); // L: 4580
			} catch (Throwable var4) { // L: 4582
			}
		}

	} // L: 4584

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4587
			ClanChannel.method3471(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4588
			if (field708[var1]) { // L: 4589
				field785[var1] = true;
			}

			field515[var1] = field708[var1]; // L: 4590
			field708[var1] = false; // L: 4591
		}

		field557 = cycle; // L: 4593
		viewportX = -1; // L: 4594
		viewportY = -1; // L: 4595
		if (rootInterface != -1) { // L: 4596
			rootWidgetCount = 0; // L: 4597
			Canvas.method327(rootInterface, 0, 0, Language.canvasWidth, class47.canvasHeight, 0, 0, -1); // L: 4598
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4600
		if (showMouseCross) { // L: 4601
			if (mouseCrossColor == 1) { // L: 4602
				VarpDefinition.field1816[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4603
			}

			if (mouseCrossColor == 2) { // L: 4605
				VarpDefinition.field1816[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4606
			}
		}

		if (!isMenuOpen) { // L: 4609
			if (viewportX != -1) { // L: 4610
				class478.method8608(viewportX, viewportY);
			}
		} else {
			ClanSettings.method3333(); // L: 4612
		}

		if (field715 == 3) { // L: 4613
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4614
				if (field515[var1]) { // L: 4615
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4616
				} else if (field785[var1]) { // L: 4618
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4619
				}
			}
		}

		IgnoreList.method8061(ItemLayer.Client_plane, class229.localPlayer.x, class229.localPlayer.y, field564); // L: 4623
		field564 = 0; // L: 4624
	} // L: 4625

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Lef;II)Z",
		garbageValue = "-2137639716"
	)
	boolean method1284(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6276
			class20.friendsChatManager = null; // L: 6277
		} else {
			if (class20.friendsChatManager == null) { // L: 6280
				class20.friendsChatManager = new FriendsChatManager(class89.loginType, SpriteMask.client); // L: 6281
			}

			class20.friendsChatManager.method8087(var1.packetBuffer, var2); // L: 6283
		}

		field692 = cycleCntr; // L: 6286
		class344.FriendsChatManager_inFriendsChat = true; // L: 6287
		var1.serverPacket = null; // L: 6289
		return true; // L: 6290
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lef;B)Z",
		garbageValue = "-16"
	)
	boolean method1576(PacketWriter var1) {
		if (class20.friendsChatManager != null) { // L: 6294
			class20.friendsChatManager.method8088(var1.packetBuffer); // L: 6295
		}

		field692 = cycleCntr; // L: 6298
		class344.FriendsChatManager_inFriendsChat = true; // L: 6299
		var1.serverPacket = null; // L: 6301
		return true; // L: 6302
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Lef;B)Z",
		garbageValue = "1"
	)
	final boolean method1829(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6307
		PacketBuffer var3 = var1.packetBuffer; // L: 6308
		if (var2 == null) { // L: 6309
			return false;
		} else {
			int var6;
			String var20;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6311
					if (var1.field1411) { // L: 6312
						if (!var2.isAvailable(1)) { // L: 6313
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6314
						var1.field1412 = 0; // L: 6315
						var1.field1411 = false; // L: 6316
					}

					var3.offset = 0; // L: 6318
					if (var3.method9206()) { // L: 6319
						if (!var2.isAvailable(1)) { // L: 6320
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6321
						var1.field1412 = 0; // L: 6322
					}

					var1.field1411 = true; // L: 6324
					ServerPacket[] var4 = class12.method168(); // L: 6325
					var5 = var3.readSmartByteShortIsaac(); // L: 6326
					if (var5 < 0 || var5 >= var4.length) { // L: 6327
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6328
					var1.serverPacketLength = var1.serverPacket.length; // L: 6329
				}

				if (var1.serverPacketLength == -1) { // L: 6331
					if (!var2.isAvailable(1)) { // L: 6332
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6333
					var1.serverPacketLength = var3.array[0] & 255; // L: 6334
				}

				if (var1.serverPacketLength == -2) { // L: 6336
					if (!var2.isAvailable(2)) { // L: 6337
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6338
					var3.offset = 0; // L: 6339
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6340
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6342
					return false;
				}

				var3.offset = 0; // L: 6343
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6344
				var1.field1412 = 0; // L: 6345
				timer.method7923(); // L: 6346
				var1.field1416 = var1.field1409; // L: 6347
				var1.field1409 = var1.field1414; // L: 6348
				var1.field1414 = var1.serverPacket; // L: 6349
				String var52;
				if (ServerPacket.field3272 == var1.serverPacket) { // L: 6350
					var52 = var3.readStringCp1252NullTerminated(); // L: 6351
					var20 = AbstractFont.escapeBrackets(class20.method303(class128.method3076(var3))); // L: 6352
					GrandExchangeOfferUnitPriceComparator.addGameMessage(6, var52, var20); // L: 6353
					var1.serverPacket = null; // L: 6354
					return true; // L: 6355
				}

				if (ServerPacket.field3291 == var1.serverPacket) { // L: 6357
					class106.method2777(class306.field3227); // L: 6358
					var1.serverPacket = null; // L: 6359
					return true; // L: 6360
				}

				byte var76;
				if (ServerPacket.field3313 == var1.serverPacket) { // L: 6362
					class316.method5982(); // L: 6363
					var76 = var3.readByte(); // L: 6364
					if (var1.serverPacketLength == 1) { // L: 6365
						if (var76 >= 0) { // L: 6366
							currentClanSettings[var76] = null;
						} else {
							class478.guestClanSettings = null; // L: 6367
						}

						var1.serverPacket = null; // L: 6368
						return true; // L: 6369
					}

					if (var76 >= 0) { // L: 6371
						currentClanSettings[var76] = new ClanSettings(var3); // L: 6372
					} else {
						class478.guestClanSettings = new ClanSettings(var3); // L: 6375
					}

					var1.serverPacket = null; // L: 6377
					return true; // L: 6378
				}

				int var7;
				int var8;
				int var9;
				int var11;
				int var21;
				int var23;
				long var63;
				InterfaceParent var75;
				if (ServerPacket.field3274 == var1.serverPacket) { // L: 6380
					var21 = var3.offset + var1.serverPacketLength; // L: 6381
					var5 = var3.readUnsignedShort(); // L: 6382
					if (var5 == 65535) { // L: 6383
						var5 = -1;
					}

					var6 = var3.readUnsignedShort(); // L: 6384
					if (var5 != rootInterface) { // L: 6385
						rootInterface = var5; // L: 6386
						this.resizeRoot(false); // L: 6387
						class130.method3095(rootInterface); // L: 6388
						class106.method2778(rootInterface); // L: 6389

						for (var7 = 0; var7 < 100; ++var7) { // L: 6390
							field708[var7] = true;
						}
					}

					InterfaceParent var59;
					for (; var6-- > 0; var59.field1047 = true) { // L: 6392 6402
						var7 = var3.readInt(); // L: 6393
						var8 = var3.readUnsignedShort(); // L: 6394
						var9 = var3.readUnsignedByte(); // L: 6395
						var59 = (InterfaceParent)interfaceParents.get((long)var7); // L: 6396
						if (var59 != null && var8 != var59.group) { // L: 6397
							class302.closeInterface(var59, true); // L: 6398
							var59 = null; // L: 6399
						}

						if (var59 == null) { // L: 6401
							var59 = UserComparator8.method2954(var7, var8, var9);
						}
					}

					for (var75 = (InterfaceParent)interfaceParents.first(); var75 != null; var75 = (InterfaceParent)interfaceParents.next()) { // L: 6404
						if (var75.field1047) { // L: 6405
							var75.field1047 = false;
						} else {
							class302.closeInterface(var75, true); // L: 6407
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6410

					while (var3.offset < var21) { // L: 6411
						var7 = var3.readInt(); // L: 6412
						var8 = var3.readUnsignedShort(); // L: 6413
						var9 = var3.readUnsignedShort(); // L: 6414
						var23 = var3.readInt(); // L: 6415

						for (var11 = var8; var11 <= var9; ++var11) { // L: 6416
							var63 = ((long)var7 << 32) + (long)var11; // L: 6417
							widgetFlags.put(new IntegerNode(var23), var63); // L: 6418
						}
					}

					var1.serverPacket = null; // L: 6421
					return true; // L: 6422
				}

				if (ServerPacket.field3271 == var1.serverPacket) { // L: 6424
					var21 = var3.readUnsignedShort(); // L: 6425
					var5 = var3.readUnsignedByte(); // L: 6426
					var6 = var3.readUnsignedShort(); // L: 6427
					class460.queueSoundEffect(var21, var5, var6); // L: 6428
					var1.serverPacket = null; // L: 6429
					return true; // L: 6430
				}

				int var24;
				boolean var62;
				boolean var82;
				if (ServerPacket.field3357 == var1.serverPacket) { // L: 6432
					isCameraLocked = true; // L: 6433
					field482 = false; // L: 6434
					field748 = true; // L: 6435
					ScriptFrame.field456 = var3.readUnsignedByte() * 128; // L: 6436
					class216.field2314 = var3.readUnsignedByte() * 128; // L: 6437
					var21 = var3.readUnsignedShort(); // L: 6438
					var5 = var3.readUnsignedByte() * 128 + 64; // L: 6439
					var6 = var3.readUnsignedByte() * 128 + 64; // L: 6440
					var7 = var3.readUnsignedShort(); // L: 6441
					field661 = var3.readBoolean(); // L: 6442
					var8 = var3.readUnsignedByte(); // L: 6443
					var9 = ScriptFrame.field456 * 16384 + 64; // L: 6444
					var23 = class216.field2314 * 16384 + 64; // L: 6445
					var62 = false; // L: 6446
					var82 = false; // L: 6447
					if (field661) { // L: 6448
						var11 = SecureRandomFuture.cameraY; // L: 6449
						var24 = WorldMapDecorationType.getTileHeight(var9, var23, ItemLayer.Client_plane) - var21; // L: 6450
					} else {
						var11 = WorldMapDecorationType.getTileHeight(ViewportMouse.cameraX, class36.cameraZ, ItemLayer.Client_plane) - SecureRandomFuture.cameraY; // L: 6453
						var24 = var21; // L: 6454
					}

					field751 = new class488(ViewportMouse.cameraX, class36.cameraZ, var11, var9, var23, var24, var5, var6, var7, var8); // L: 6456
					var1.serverPacket = null; // L: 6457
					return true; // L: 6458
				}

				if (ServerPacket.field3266 == var1.serverPacket) { // L: 6460
					publicChatMode = var3.method9295(); // L: 6461
					tradeChatMode = var3.method9496(); // L: 6462
					var1.serverPacket = null; // L: 6463
					return true; // L: 6464
				}

				Widget var25;
				if (ServerPacket.field3255 == var1.serverPacket) { // L: 6466
					var21 = var3.method9303(); // L: 6467
					var5 = var3.method9319(); // L: 6468
					var25 = HealthBarDefinition.field1877.method6285(var5); // L: 6469
					if (var25 != null && var25.type == 0) { // L: 6470
						if (var21 > var25.scrollHeight - var25.height) { // L: 6471
							var21 = var25.scrollHeight - var25.height;
						}

						if (var21 < 0) { // L: 6472
							var21 = 0;
						}

						if (var21 != var25.scrollY) { // L: 6473
							var25.scrollY = var21; // L: 6474
							class159.invalidateWidget(var25); // L: 6475
						}
					}

					var1.serverPacket = null; // L: 6478
					return true; // L: 6479
				}

				if (ServerPacket.field3354 == var1.serverPacket) { // L: 6481
					class90.updateNpcs(true, var3); // L: 6482
					var1.serverPacket = null; // L: 6483
					return true; // L: 6484
				}

				if (ServerPacket.field3364 == var1.serverPacket) { // L: 6486
					field677 = null; // L: 6487
					var1.serverPacket = null; // L: 6488
					return true; // L: 6489
				}

				boolean var98;
				if (ServerPacket.field3289 == var1.serverPacket) { // L: 6491
					var98 = var3.readBoolean(); // L: 6492
					if (var98) { // L: 6493
						if (MidiPcmStream.field3456 == null) { // L: 6494
							MidiPcmStream.field3456 = new class381();
						}
					} else {
						MidiPcmStream.field3456 = null; // L: 6496
					}

					var1.serverPacket = null; // L: 6497
					return true; // L: 6498
				}

				if (ServerPacket.field3298 == var1.serverPacket) { // L: 6500
					var21 = var3.readUnsignedShort(); // L: 6501
					var5 = var3.method9319(); // L: 6502
					var25 = HealthBarDefinition.field1877.method6285(var5); // L: 6503
					if (var25.modelType != 6 || var21 != var25.modelId) { // L: 6504
						var25.modelType = 6; // L: 6505
						var25.modelId = var21; // L: 6506
						class159.invalidateWidget(var25); // L: 6507
					}

					var1.serverPacket = null; // L: 6509
					return true; // L: 6510
				}

				if (ServerPacket.field3328 == var1.serverPacket) { // L: 6512
					return this.method1284(var1, 1); // L: 6513
				}

				if (ServerPacket.field3374 == var1.serverPacket) { // L: 6515
					class153.readReflectionCheck(var3, var1.serverPacketLength); // L: 6516
					var1.serverPacket = null; // L: 6517
					return true; // L: 6518
				}

				if (ServerPacket.field3279 == var1.serverPacket) { // L: 6520
					var21 = var3.readUnsignedByte(); // L: 6521
					if (var3.readUnsignedByte() == 0) { // L: 6522
						grandExchangeOffers[var21] = new GrandExchangeOffer(); // L: 6523
						var3.offset += 18; // L: 6524
					} else {
						--var3.offset; // L: 6527
						grandExchangeOffers[var21] = new GrandExchangeOffer(var3, false); // L: 6528
					}

					field551 = cycleCntr; // L: 6530
					var1.serverPacket = null; // L: 6531
					return true; // L: 6532
				}

				if (ServerPacket.field3325 == var1.serverPacket) { // L: 6534
					class106.method2777(class306.field3235); // L: 6535
					var1.serverPacket = null; // L: 6536
					return true; // L: 6537
				}

				if (ServerPacket.field3290 == var1.serverPacket) { // L: 6539
					minimapState = var3.readUnsignedByte(); // L: 6540
					var1.serverPacket = null; // L: 6541
					return true; // L: 6542
				}

				if (ServerPacket.field3331 == var1.serverPacket) { // L: 6544
					Interpreter.updatePlayers(var3, var1.serverPacketLength); // L: 6545
					WorldMapSectionType.method4889(); // L: 6546
					var1.serverPacket = null; // L: 6547
					return true; // L: 6548
				}

				if (ServerPacket.field3307 == var1.serverPacket) { // L: 6550
					for (var21 = 0; var21 < Varps.Varps_main.length; ++var21) { // L: 6551
						if (Varps.Varps_main[var21] != Varps.Varps_temp[var21]) { // L: 6552
							Varps.Varps_main[var21] = Varps.Varps_temp[var21]; // L: 6553
							Projectile.changeGameOptions(var21); // L: 6554
							field712[++field683 - 1 & 31] = var21; // L: 6555
						}
					}

					var1.serverPacket = null; // L: 6558
					return true; // L: 6559
				}

				if (ServerPacket.field3282 == var1.serverPacket) { // L: 6561
					var21 = var3.readInt(); // L: 6562
					InterfaceParent var80 = (InterfaceParent)interfaceParents.get((long)var21); // L: 6563
					if (var80 != null) { // L: 6564
						class302.closeInterface(var80, true);
					}

					if (meslayerContinueWidget != null) { // L: 6565
						class159.invalidateWidget(meslayerContinueWidget); // L: 6566
						meslayerContinueWidget = null; // L: 6567
					}

					var1.serverPacket = null; // L: 6569
					return true; // L: 6570
				}

				if (ServerPacket.field3251 == var1.serverPacket) { // L: 6572
					class316.method5982(); // L: 6573
					var76 = var3.readByte(); // L: 6574
					class147 var78 = new class147(var3); // L: 6575
					ClanSettings var91;
					if (var76 >= 0) { // L: 6577
						var91 = currentClanSettings[var76];
					} else {
						var91 = class478.guestClanSettings; // L: 6578
					}

					if (var91 == null) { // L: 6579
						this.method1295(var76); // L: 6580
						var1.serverPacket = null; // L: 6581
						return true; // L: 6582
					}

					if (var78.field1655 > var91.field1701) { // L: 6584
						this.method1295(var76); // L: 6585
						var1.serverPacket = null; // L: 6586
						return true; // L: 6587
					}

					if (var78.field1655 < var91.field1701) { // L: 6589
						var1.serverPacket = null; // L: 6590
						return true; // L: 6591
					}

					var78.method3252(var91); // L: 6593
					var1.serverPacket = null; // L: 6594
					return true; // L: 6595
				}

				int var15;
				int var65;
				if (ServerPacket.field3292 == var1.serverPacket) { // L: 6597
					var9 = var3.method9294(); // L: 6608
					var23 = var9 >> 2; // L: 6609
					var11 = var9 & 3; // L: 6610
					var24 = field563[var23]; // L: 6611
					var65 = var3.readUnsignedShort(); // L: 6612
					var6 = var3.readMedium(); // L: 6613
					var21 = var6 >> 16; // L: 6614
					var5 = var6 >> 8 & 255; // L: 6615
					var7 = var21 + (var6 >> 4 & 7); // L: 6616
					var8 = var5 + (var6 & 7); // L: 6617
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) { // L: 6618
						if (var24 == 0) { // L: 6619
							WallObject var68 = class36.scene.method5346(ItemLayer.Client_plane, var7, var8); // L: 6620
							if (var68 != null) { // L: 6621
								var15 = class232.Entity_unpackID(var68.tag); // L: 6622
								if (var23 == 2) { // L: 6623
									var68.renderable1 = new DynamicObject(var15, 2, var11 + 4, ItemLayer.Client_plane, var7, var8, var65, false, var68.renderable1); // L: 6624
									var68.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, ItemLayer.Client_plane, var7, var8, var65, false, var68.renderable2); // L: 6625
								} else {
									var68.renderable1 = new DynamicObject(var15, var23, var11, ItemLayer.Client_plane, var7, var8, var65, false, var68.renderable1); // L: 6627
								}
							}
						} else if (var24 == 1) { // L: 6630
							DecorativeObject var67 = class36.scene.method5347(ItemLayer.Client_plane, var7, var8); // L: 6631
							if (var67 != null) { // L: 6632
								var15 = class232.Entity_unpackID(var67.tag); // L: 6633
								if (var23 != 4 && var23 != 5) { // L: 6634
									if (var23 == 6) { // L: 6637
										var67.renderable1 = new DynamicObject(var15, 4, var11 + 4, ItemLayer.Client_plane, var7, var8, var65, false, var67.renderable1); // L: 6638
									} else if (var23 == 7) { // L: 6640
										var67.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, ItemLayer.Client_plane, var7, var8, var65, false, var67.renderable1); // L: 6641
									} else if (var23 == 8) { // L: 6643
										var67.renderable1 = new DynamicObject(var15, 4, var11 + 4, ItemLayer.Client_plane, var7, var8, var65, false, var67.renderable1); // L: 6644
										var67.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, ItemLayer.Client_plane, var7, var8, var65, false, var67.renderable2); // L: 6645
									}
								} else {
									var67.renderable1 = new DynamicObject(var15, 4, var11, ItemLayer.Client_plane, var7, var8, var65, false, var67.renderable1); // L: 6635
								}
							}
						} else if (var24 == 2) { // L: 6649
							GameObject var64 = class36.scene.getGameObject(ItemLayer.Client_plane, var7, var8); // L: 6650
							if (var23 == 11) { // L: 6651
								var23 = 10; // L: 6652
							}

							if (var64 != null) { // L: 6654
								var64.renderable = new DynamicObject(class232.Entity_unpackID(var64.tag), var23, var11, ItemLayer.Client_plane, var7, var8, var65, false, var64.renderable); // L: 6655
							}
						} else if (var24 == 3) { // L: 6658
							GroundObject var66 = class36.scene.getGroundObject(ItemLayer.Client_plane, var7, var8); // L: 6659
							if (var66 != null) { // L: 6660
								var66.renderable = new DynamicObject(class232.Entity_unpackID(var66.tag), 22, var11, ItemLayer.Client_plane, var7, var8, var65, false, var66.renderable); // L: 6661
							}
						}
					}

					var1.serverPacket = null; // L: 6665
					return true; // L: 6666
				}

				int var16;
				int var17;
				int var18;
				Projectile var19;
				int var26;
				byte var57;
				byte var81;
				if (ServerPacket.field3270 == var1.serverPacket) { // L: 6668
					var15 = var3.readUnsignedShort(); // L: 6684
					var17 = var3.readUnsignedByte(); // L: 6685
					var6 = var3.readMedium(); // L: 6686
					var21 = var6 >> 16; // L: 6687
					var5 = var6 >> 8 & 255; // L: 6688
					var7 = var21 + (var6 >> 4 & 7); // L: 6689
					var8 = var5 + (var6 & 7); // L: 6690
					var57 = var3.readByte(); // L: 6691
					var16 = var3.method9304(); // L: 6692
					var24 = var3.readUnsignedShort(); // L: 6693
					var11 = var3.method9313(); // L: 6694
					var26 = var3.method9496() * 4; // L: 6695
					var65 = var3.readUnsignedByte() * 4; // L: 6696
					var18 = var3.method9303(); // L: 6697
					var81 = var3.method9296(); // L: 6698
					var9 = var57 + var7; // L: 6699
					var23 = var81 + var8; // L: 6700
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var23 >= 0 && var9 < 104 && var23 < 104 && var24 != 65535) { // L: 6701
						var7 = var7 * 128 + 64; // L: 6702
						var8 = var8 * 128 + 64; // L: 6703
						var9 = var9 * 128 + 64; // L: 6704
						var23 = var23 * 128 + 64; // L: 6705
						var19 = new Projectile(var24, ItemLayer.Client_plane, var7, var8, WorldMapDecorationType.getTileHeight(var7, var8, ItemLayer.Client_plane) - var65, var15 + cycle, var16 + cycle, var17, var18, var11, var26); // L: 6706
						var19.setDestination(var9, var23, WorldMapDecorationType.getTileHeight(var9, var23, ItemLayer.Client_plane) - var26, var15 + cycle); // L: 6707
						projectiles.addFirst(var19); // L: 6708
					}

					var1.serverPacket = null; // L: 6710
					return true; // L: 6711
				}

				if (ServerPacket.field3342 == var1.serverPacket) { // L: 6713
					class106.method2777(class306.field3236); // L: 6714
					var1.serverPacket = null; // L: 6715
					return true; // L: 6716
				}

				Widget var22;
				if (ServerPacket.field3344 == var1.serverPacket) { // L: 6718
					var21 = var3.readUnsignedByte(); // L: 6719
					var5 = var3.method9496(); // L: 6720
					var6 = var3.readInt(); // L: 6721
					var22 = HealthBarDefinition.field1877.method6285(var6); // L: 6722
					class306.method5915(var22, var21, var5); // L: 6723
					class159.invalidateWidget(var22); // L: 6724
					var1.serverPacket = null; // L: 6725
					return true; // L: 6726
				}

				if (ServerPacket.field3295 == var1.serverPacket) { // L: 6728
					var21 = var3.method9302(); // L: 6729
					var5 = var3.method9318(); // L: 6730
					var6 = var3.method9496(); // L: 6731
					var75 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6732
					if (var75 != null) { // L: 6733
						class302.closeInterface(var75, var21 != var75.group);
					}

					UserComparator8.method2954(var5, var21, var6); // L: 6734
					var1.serverPacket = null; // L: 6735
					return true; // L: 6736
				}

				if (ServerPacket.field3333 == var1.serverPacket) { // L: 6738
					var21 = var3.readInt(); // L: 6739
					var5 = var3.readUnsignedShort(); // L: 6740
					if (var21 < -70000) { // L: 6741
						var5 += 32768;
					}

					if (var21 >= 0) { // L: 6743
						var25 = HealthBarDefinition.field1877.method6285(var21);
					} else {
						var25 = null; // L: 6744
					}

					if (var25 != null) { // L: 6745
						for (var7 = 0; var7 < var25.field3790.length; ++var7) { // L: 6746
							var25.field3790[var7] = 0; // L: 6747
							var25.field3791[var7] = 0; // L: 6748
						}
					}

					KeyHandler.clearItemContainer(var5); // L: 6751
					var7 = var3.readUnsignedShort(); // L: 6752

					for (var8 = 0; var8 < var7; ++var8) { // L: 6753
						var9 = var3.method9303(); // L: 6754
						var23 = var3.method9496(); // L: 6755
						if (var23 == 255) { // L: 6756
							var23 = var3.readInt();
						}

						if (var25 != null && var8 < var25.field3790.length) { // L: 6757 6758
							var25.field3790[var8] = var9; // L: 6759
							var25.field3791[var8] = var23; // L: 6760
						}

						class185.itemContainerSetItem(var5, var8, var9 - 1, var23); // L: 6763
					}

					if (var25 != null) { // L: 6765
						class159.invalidateWidget(var25);
					}

					class396.method7403(); // L: 6766
					field541[++field685 - 1 & 31] = var5 & 32767; // L: 6767
					var1.serverPacket = null; // L: 6768
					return true; // L: 6769
				}

				Widget var74;
				if (ServerPacket.field3369 == var1.serverPacket) { // L: 6771
					var21 = var3.method9318(); // L: 6772
					var74 = HealthBarDefinition.field1877.method6285(var21); // L: 6773

					for (var6 = 0; var6 < var74.field3790.length; ++var6) { // L: 6774
						var74.field3790[var6] = -1; // L: 6775
						var74.field3790[var6] = 0; // L: 6776
					}

					class159.invalidateWidget(var74); // L: 6778
					var1.serverPacket = null; // L: 6779
					return true; // L: 6780
				}

				long var27;
				long var29;
				String var34;
				if (ServerPacket.field3320 == var1.serverPacket) { // L: 6782
					var52 = var3.readStringCp1252NullTerminated(); // L: 6783
					var27 = (long)var3.readUnsignedShort(); // L: 6784
					var29 = (long)var3.readMedium(); // L: 6785
					PlayerType var90 = (PlayerType)class12.findEnumerated(class320.PlayerType_values(), var3.readUnsignedByte()); // L: 6786
					long var32 = (var27 << 32) + var29; // L: 6787
					var82 = false; // L: 6788

					for (var65 = 0; var65 < 100; ++var65) { // L: 6789
						if (field575[var65] == var32) { // L: 6790
							var82 = true; // L: 6791
							break; // L: 6792
						}
					}

					if (class12.friendSystem.isIgnored(new Username(var52, class89.loginType))) { // L: 6795
						var82 = true;
					}

					if (!var82 && field736 == 0) { // L: 6796
						field575[field723] = var32; // L: 6797
						field723 = (field723 + 1) % 100; // L: 6798
						var34 = AbstractFont.escapeBrackets(class20.method303(class128.method3076(var3))); // L: 6799
						byte var87;
						if (var90.isPrivileged) { // L: 6801
							var87 = 7;
						} else {
							var87 = 3; // L: 6802
						}

						if (var90.modIcon != -1) { // L: 6803
							GrandExchangeOfferUnitPriceComparator.addGameMessage(var87, FloorUnderlayDefinition.method3799(var90.modIcon) + var52, var34);
						} else {
							GrandExchangeOfferUnitPriceComparator.addGameMessage(var87, var52, var34); // L: 6804
						}
					}

					var1.serverPacket = null; // L: 6806
					return true; // L: 6807
				}

				if (ServerPacket.field3278 == var1.serverPacket) { // L: 6809
					class169.privateChatMode = WorldMapArea.method4580(var3.readUnsignedByte()); // L: 6810
					var1.serverPacket = null; // L: 6811
					return true; // L: 6812
				}

				if (ServerPacket.field3250 == var1.serverPacket) { // L: 6814
					isCameraLocked = true; // L: 6815
					field482 = false; // L: 6816
					field749 = true; // L: 6817
					var21 = class319.method6186(var3.readShort() & 2027); // L: 6818
					var5 = class240.method4829(var3.readShort() & 2027); // L: 6819
					var6 = var3.readUnsignedShort(); // L: 6820
					var7 = var3.readUnsignedByte(); // L: 6821
					field672 = new class490(Varcs.cameraPitch, var5, var6, var7); // L: 6822
					field752 = new class490(class192.cameraYaw, var21, var6, var7); // L: 6823
					var1.serverPacket = null; // L: 6824
					return true; // L: 6825
				}

				if (ServerPacket.field3262 == var1.serverPacket) { // L: 6827
					rebootTimer = var3.readUnsignedShort() * 30; // L: 6828
					field697 = cycleCntr; // L: 6829
					var1.serverPacket = null; // L: 6830
					return true; // L: 6831
				}

				if (ServerPacket.field3267 == var1.serverPacket) { // L: 6833
					var21 = var3.readInt(); // L: 6834
					var74 = HealthBarDefinition.field1877.method6285(var21); // L: 6835
					var74.modelType = 3; // L: 6836
					var74.modelId = class229.localPlayer.appearance.getChatHeadId(); // L: 6837
					class159.invalidateWidget(var74); // L: 6838
					var1.serverPacket = null; // L: 6839
					return true; // L: 6840
				}

				if (ServerPacket.field3308 == var1.serverPacket) { // L: 6842
					var21 = var3.method9305(); // L: 6843
					var5 = var3.readInt(); // L: 6844
					var25 = HealthBarDefinition.field1877.method6285(var5); // L: 6845
					if (var21 != var25.sequenceId || var21 == -1) { // L: 6846
						var25.sequenceId = var21; // L: 6847
						var25.modelFrame = 0; // L: 6848
						var25.modelFrameCycle = 0; // L: 6849
						class159.invalidateWidget(var25); // L: 6850
					}

					var1.serverPacket = null; // L: 6852
					return true; // L: 6853
				}

				if (ServerPacket.field3366 == var1.serverPacket) { // L: 6855
					class396.method7403(); // L: 6856
					field663 = var3.readUnsignedShort(); // L: 6857
					field697 = cycleCntr; // L: 6858
					var1.serverPacket = null; // L: 6859
					return true; // L: 6860
				}

				if (ServerPacket.field3275 == var1.serverPacket) { // L: 6862
					var76 = var3.method9297(); // L: 6863
					var5 = var3.readUnsignedShort(); // L: 6864
					Varps.Varps_temp[var5] = var76; // L: 6865
					if (Varps.Varps_main[var5] != var76) { // L: 6866
						Varps.Varps_main[var5] = var76; // L: 6867
					}

					Projectile.changeGameOptions(var5); // L: 6869
					field712[++field683 - 1 & 31] = var5; // L: 6870
					var1.serverPacket = null; // L: 6871
					return true; // L: 6872
				}

				if (ServerPacket.field3371 == var1.serverPacket) { // L: 6874
					return this.method1284(var1, 2); // L: 6875
				}

				if (ServerPacket.field3358 == var1.serverPacket) { // L: 6877
					class106.method2777(class306.field3234); // L: 6878
					var1.serverPacket = null; // L: 6879
					return true; // L: 6880
				}

				if (ServerPacket.field3277 == var1.serverPacket) { // L: 6882
					hintArrowType = var3.readUnsignedByte(); // L: 6883
					if (hintArrowType == 1) { // L: 6884
						field507 = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6885
						if (hintArrowType == 2) { // L: 6886
							field512 = 4096; // L: 6887
							field513 = 4096; // L: 6888
						}

						if (hintArrowType == 3) { // L: 6890
							field512 = 0; // L: 6891
							field513 = 4096; // L: 6892
						}

						if (hintArrowType == 4) { // L: 6894
							field512 = 8192; // L: 6895
							field513 = 4096; // L: 6896
						}

						if (hintArrowType == 5) { // L: 6898
							field512 = 4096; // L: 6899
							field513 = 0; // L: 6900
						}

						if (hintArrowType == 6) { // L: 6902
							field512 = 4096; // L: 6903
							field513 = 8192; // L: 6904
						}

						hintArrowType = 2; // L: 6906
						field509 = var3.readUnsignedShort(); // L: 6907
						field510 = var3.readUnsignedShort(); // L: 6908
						field511 = var3.readUnsignedByte() * 2; // L: 6909
					}

					if (hintArrowType == 10) { // L: 6911
						field508 = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6912
					return true; // L: 6913
				}

				if (ServerPacket.field3319 == var1.serverPacket) { // L: 6915
					if (field677 == null) { // L: 6916
						field677 = new class466(Players.Widget_cachedFonts);
					}

					class535 var53 = Players.Widget_cachedFonts.method8534(var3); // L: 6917
					field677.field4799.vmethod9001(var53.field5204, var53.field5205); // L: 6918
					field688[++field689 - 1 & 31] = var53.field5204; // L: 6919
					var1.serverPacket = null; // L: 6920
					return true; // L: 6921
				}

				if (ServerPacket.field3368 == var1.serverPacket) { // L: 6923
					var21 = var3.readUnsignedShort(); // L: 6924
					var5 = var3.method9317(); // L: 6925
					var25 = HealthBarDefinition.field1877.method6285(var5); // L: 6926
					if (var25.modelType != 1 || var21 != var25.modelId) { // L: 6927
						var25.modelType = 1; // L: 6928
						var25.modelId = var21; // L: 6929
						class159.invalidateWidget(var25); // L: 6930
					}

					var1.serverPacket = null; // L: 6932
					return true; // L: 6933
				}

				if (ServerPacket.field3254 == var1.serverPacket) { // L: 6935
					var5 = var3.method9302(); // L: 6941
					var7 = var3.method9496(); // L: 6942
					var6 = var3.method9319(); // L: 6943
					var21 = var3.method9303(); // L: 6944
					Player var95;
					if (var21 == localPlayerIndex) { // L: 6945
						var95 = class229.localPlayer; // L: 6946
					} else {
						var95 = players[var21]; // L: 6949
					}

					if (var95 != null) { // L: 6951
						var95.method2466(var7, var5, var6 >> 16, var6 & 65535); // L: 6952
					}

					var1.serverPacket = null; // L: 6954
					return true; // L: 6955
				}

				if (ServerPacket.field3345 == var1.serverPacket) { // L: 6957
					var21 = var3.method9303(); // L: 6958
					WorldMapEvent.method5099(var21); // L: 6959
					field541[++field685 - 1 & 31] = var21 & 32767; // L: 6960
					var1.serverPacket = null; // L: 6961
					return true; // L: 6962
				}

				if (ServerPacket.field3312 == var1.serverPacket) { // L: 6964
					var21 = var3.readInt(); // L: 6965
					var5 = var3.readInt(); // L: 6966
					var6 = class167.getGcDuration(); // L: 6967
					PacketBufferNode var79 = class113.getPacketBufferNode(ClientPacket.field3128, packetWriter.isaacCipher); // L: 6969
					var79.packetBuffer.method9316(var21); // L: 6970
					var79.packetBuffer.writeIntME(var5); // L: 6971
					var79.packetBuffer.method9291(var6); // L: 6972
					var79.packetBuffer.writeByte(GameEngine.fps); // L: 6973
					packetWriter.addNode(var79); // L: 6974
					var1.serverPacket = null; // L: 6975
					return true; // L: 6976
				}

				String var84;
				if (ServerPacket.field3352 == var1.serverPacket) { // L: 6978
					var21 = var3.readUnsignedByte(); // L: 6979
					var5 = var3.method9295(); // L: 6980
					var84 = var3.readStringCp1252NullTerminated(); // L: 6981
					if (var21 >= 1 && var21 <= 8) { // L: 6982
						if (var84.equalsIgnoreCase("null")) { // L: 6983
							var84 = null;
						}

						playerMenuActions[var21 - 1] = var84; // L: 6984
						playerOptionsPriorities[var21 - 1] = var5 == 0; // L: 6985
					}

					var1.serverPacket = null; // L: 6987
					return true; // L: 6988
				}

				if (ServerPacket.field3339 == var1.serverPacket) { // L: 6990
					class12.friendSystem.method1929(); // L: 6991
					field747 = cycleCntr; // L: 6992
					var1.serverPacket = null; // L: 6993
					return true; // L: 6994
				}

				if (ServerPacket.field3336 == var1.serverPacket) { // L: 6996
					field677 = new class466(Players.Widget_cachedFonts); // L: 6997
					var1.serverPacket = null; // L: 6998
					return true; // L: 6999
				}

				if (ServerPacket.field3280 == var1.serverPacket) { // L: 7001
					var1.serverPacket = null; // L: 7002
					return true; // L: 7003
				}

				if (ServerPacket.field3321 == var1.serverPacket) { // L: 7005
					var21 = var3.readUnsignedByte(); // L: 7006
					var5 = var3.readUnsignedByte(); // L: 7007
					var6 = var3.readUnsignedByte(); // L: 7008
					var7 = var3.readUnsignedByte(); // L: 7009
					field755[var21] = true; // L: 7010
					field756[var21] = var5; // L: 7011
					field704[var21] = var6; // L: 7012
					field758[var21] = var7; // L: 7013
					field728[var21] = 0; // L: 7014
					var1.serverPacket = null; // L: 7015
					return true; // L: 7016
				}

				Widget var93;
				if (ServerPacket.field3273 == var1.serverPacket) { // L: 7018
					var21 = var3.method9303(); // L: 7019
					var5 = var3.readInt(); // L: 7020
					var6 = var3.method9302(); // L: 7021
					var7 = var3.method9304(); // L: 7022
					var93 = HealthBarDefinition.field1877.method6285(var5); // L: 7023
					if (var21 != var93.modelAngleX || var6 != var93.modelAngleY || var7 != var93.modelZoom) { // L: 7024
						var93.modelAngleX = var21; // L: 7025
						var93.modelAngleY = var6; // L: 7026
						var93.modelZoom = var7; // L: 7027
						class159.invalidateWidget(var93); // L: 7028
					}

					var1.serverPacket = null; // L: 7030
					return true; // L: 7031
				}

				if (ServerPacket.field3370 == var1.serverPacket) { // L: 7033
					class106.method2777(class306.field3228); // L: 7034
					var1.serverPacket = null; // L: 7035
					return true; // L: 7036
				}

				if (ServerPacket.field3343 == var1.serverPacket) { // L: 7038
					var21 = var3.readInt(); // L: 7039
					if (var21 != field584) { // L: 7040
						field584 = var21; // L: 7041
						VerticalAlignment.method3756(); // L: 7042
					}

					var1.serverPacket = null; // L: 7044
					return true; // L: 7045
				}

				if (ServerPacket.field3311 == var1.serverPacket) { // L: 7047
					class12.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 7048
					field747 = cycleCntr; // L: 7049
					var1.serverPacket = null; // L: 7050
					return true; // L: 7051
				}

				if (ServerPacket.field3332 == var1.serverPacket) { // L: 7053
					var98 = var3.readUnsignedByte() == 1; // L: 7054
					if (var98) { // L: 7055
						class489.field4905 = SpotAnimationDefinition.method3775() - var3.readLong(); // L: 7056
						class6.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7057
					} else {
						class6.grandExchangeEvents = null; // L: 7059
					}

					field782 = cycleCntr; // L: 7060
					var1.serverPacket = null; // L: 7061
					return true; // L: 7062
				}

				if (ServerPacket.field3248 == var1.serverPacket) { // L: 7064
					var21 = var3.readUnsignedShort(); // L: 7065
					if (var21 == 65535) { // L: 7066
						var21 = -1;
					}

					rootInterface = var21; // L: 7067
					this.resizeRoot(false); // L: 7068
					class130.method3095(var21); // L: 7069
					class106.method2778(rootInterface); // L: 7070

					for (var5 = 0; var5 < 100; ++var5) { // L: 7071
						field708[var5] = true;
					}

					var1.serverPacket = null; // L: 7072
					return true; // L: 7073
				}

				if (ServerPacket.field3337 == var1.serverPacket) { // L: 7075
					var21 = var3.method9304(); // L: 7079
					var6 = var3.method9295(); // L: 7080
					var5 = var3.method9302(); // L: 7081
					if (var5 == 65535) { // L: 7082
						var5 = -1; // L: 7083
					}

					NPC var77 = npcs[var21]; // L: 7085
					if (var77 != null) { // L: 7086
						if (var5 == var77.sequence && var5 != -1) { // L: 7087
							var8 = DynamicObject.SequenceDefinition_get(var5).field2230; // L: 7088
							if (var8 == 1) { // L: 7089
								var77.sequenceFrame = 0; // L: 7090
								var77.sequenceFrameCycle = 0; // L: 7091
								var77.sequenceDelay = var6; // L: 7092
								var77.field1199 = 0; // L: 7093
							} else if (var8 == 2) { // L: 7095
								var77.field1199 = 0; // L: 7096
							}
						} else if (var5 == -1 || var77.sequence == -1 || DynamicObject.SequenceDefinition_get(var5).field2223 >= DynamicObject.SequenceDefinition_get(var77.sequence).field2223) { // L: 7099
							var77.sequence = var5; // L: 7100
							var77.sequenceFrame = 0; // L: 7101
							var77.sequenceFrameCycle = 0; // L: 7102
							var77.sequenceDelay = var6; // L: 7103
							var77.field1199 = 0; // L: 7104
							var77.field1220 = var77.pathLength; // L: 7105
						}
					}

					var1.serverPacket = null; // L: 7109
					return true; // L: 7110
				}

				if (ServerPacket.field3304 == var1.serverPacket) { // L: 7112
					for (var21 = 0; var21 < players.length; ++var21) { // L: 7113
						if (players[var21] != null) { // L: 7114
							players[var21].sequence = -1;
						}
					}

					for (var21 = 0; var21 < npcs.length; ++var21) { // L: 7116
						if (npcs[var21] != null) { // L: 7117
							npcs[var21].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 7119
					return true; // L: 7120
				}

				if (ServerPacket.field3355 == var1.serverPacket) { // L: 7122
					class90.updateNpcs(false, var3); // L: 7123
					var1.serverPacket = null; // L: 7124
					return true; // L: 7125
				}

				if (ServerPacket.field3347 == var1.serverPacket) { // L: 7127
					class13.method177(); // L: 7128
					var1.serverPacket = null; // L: 7129
					return false; // L: 7130
				}

				if (ServerPacket.field3367 == var1.serverPacket) { // L: 7132
					class396.method7403(); // L: 7133
					weight = var3.readShort(); // L: 7134
					field697 = cycleCntr; // L: 7135
					var1.serverPacket = null; // L: 7136
					return true; // L: 7137
				}

				if (ServerPacket.field3373 == var1.serverPacket) { // L: 7139
					class106.method2777(class306.field3231); // L: 7140
					var1.serverPacket = null; // L: 7141
					return true; // L: 7142
				}

				if (ServerPacket.field3318 == var1.serverPacket) { // L: 7144
					isCameraLocked = true; // L: 7145
					field482 = false; // L: 7146
					field748 = false; // L: 7147
					ScriptFrame.field456 = var3.readUnsignedByte() * 128; // L: 7148
					class216.field2314 = var3.readUnsignedByte() * 128; // L: 7149
					class127.field1488 = var3.readUnsignedShort(); // L: 7150
					WorldMapIcon_0.field2529 = var3.readUnsignedByte(); // L: 7151
					class1.field2 = var3.readUnsignedByte(); // L: 7152
					if (class1.field2 >= 100) { // L: 7153
						ViewportMouse.cameraX = ScriptFrame.field456 * 16384 + 64; // L: 7154
						class36.cameraZ = class216.field2314 * 16384 + 64; // L: 7155
						SecureRandomFuture.cameraY = WorldMapDecorationType.getTileHeight(ViewportMouse.cameraX, class36.cameraZ, ItemLayer.Client_plane) - class127.field1488; // L: 7156
					}

					var1.serverPacket = null; // L: 7158
					return true; // L: 7159
				}

				if (ServerPacket.field3353 == var1.serverPacket) { // L: 7161
					return this.method1576(var1); // L: 7162
				}

				if (ServerPacket.field3372 == var1.serverPacket) { // L: 7164
					destinationX = var3.readUnsignedByte(); // L: 7165
					if (destinationX == 255) { // L: 7166
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 7167
					if (destinationY == 255) { // L: 7168
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 7169
					return true; // L: 7170
				}

				if (ServerPacket.field3324 == var1.serverPacket) { // L: 7172
					var3.offset += 28; // L: 7173
					if (var3.checkCrc()) { // L: 7174
						class336.method6303(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7175
					return true; // L: 7176
				}

				long var36;
				if (ServerPacket.field3283 == var1.serverPacket) { // L: 7178
					var76 = var3.readByte(); // L: 7179
					var27 = (long)var3.readUnsignedShort(); // L: 7180
					var29 = (long)var3.readMedium(); // L: 7181
					var36 = (var27 << 32) + var29; // L: 7182
					var62 = false; // L: 7183
					ClanChannel var96 = var76 >= 0 ? currentClanChannels[var76] : ItemContainer.guestClanChannel; // L: 7184
					if (var96 == null) { // L: 7185
						var62 = true;
					} else {
						for (var65 = 0; var65 < 100; ++var65) { // L: 7187
							if (var36 == field575[var65]) { // L: 7188
								var62 = true; // L: 7189
								break; // L: 7190
							}
						}
					}

					if (!var62) { // L: 7194
						field575[field723] = var36; // L: 7195
						field723 = (field723 + 1) % 100; // L: 7196
						var34 = class128.method3076(var3); // L: 7197
						var26 = var76 >= 0 ? 43 : 46; // L: 7198
						ArchiveLoader.addChatMessage(var26, "", var34, var96.name); // L: 7199
					}

					var1.serverPacket = null; // L: 7201
					return true; // L: 7202
				}

				if (ServerPacket.field3297 == var1.serverPacket) { // L: 7204
					var8 = var3.method9304(); // L: 7210
					var5 = var3.method9302(); // L: 7211
					var7 = var3.method9303(); // L: 7212
					var6 = var3.method9302(); // L: 7213
					var21 = var3.method9304(); // L: 7214
					if (var21 == 65535) { // L: 7215
						var21 = -1; // L: 7216
					}

					ArrayList var31 = new ArrayList(); // L: 7218
					var31.add(var21); // L: 7219
					class135.method3152(var31, var5, var6, var7, var8); // L: 7220
					var1.serverPacket = null; // L: 7221
					return true; // L: 7222
				}

				if (ServerPacket.field3258 == var1.serverPacket) { // L: 7224
					var21 = var3.method9318(); // L: 7225
					var20 = var3.readStringCp1252NullTerminated(); // L: 7226
					var25 = HealthBarDefinition.field1877.method6285(var21); // L: 7227
					if (!var20.equals(var25.text)) { // L: 7228
						var25.text = var20; // L: 7229
						class159.invalidateWidget(var25); // L: 7230
					}

					var1.serverPacket = null; // L: 7232
					return true; // L: 7233
				}

				if (ServerPacket.field3306 == var1.serverPacket) { // L: 7235
					var5 = var3.readUnsignedShort(); // L: 7240
					var7 = var3.method9303(); // L: 7241
					var21 = var3.method9302(); // L: 7242
					var6 = var3.method9304(); // L: 7243
					class191.method3758(var21, var5, var6, var7); // L: 7244
					var1.serverPacket = null; // L: 7245
					return true; // L: 7246
				}

				if (ServerPacket.field3363 == var1.serverPacket) { // L: 7248
					class12.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 7249
					class414.FriendSystem_invalidateIgnoreds(); // L: 7250
					field747 = cycleCntr; // L: 7251
					var1.serverPacket = null; // L: 7252
					return true; // L: 7253
				}

				if (ServerPacket.field3300 == var1.serverPacket) { // L: 7255
					class106.method2777(class306.field3230); // L: 7256
					var1.serverPacket = null; // L: 7257
					return true; // L: 7258
				}

				String var40;
				if (ServerPacket.field3265 == var1.serverPacket) { // L: 7260
					var52 = var3.readStringCp1252NullTerminated(); // L: 7261
					var27 = var3.readLong(); // L: 7262
					var29 = (long)var3.readUnsignedShort(); // L: 7263
					var36 = (long)var3.readMedium(); // L: 7264
					PlayerType var97 = (PlayerType)class12.findEnumerated(class320.PlayerType_values(), var3.readUnsignedByte()); // L: 7265
					var63 = (var29 << 32) + var36; // L: 7266
					boolean var85 = false; // L: 7267

					for (var15 = 0; var15 < 100; ++var15) { // L: 7268
						if (field575[var15] == var63) { // L: 7269
							var85 = true; // L: 7270
							break; // L: 7271
						}
					}

					if (var97.isUser && class12.friendSystem.isIgnored(new Username(var52, class89.loginType))) { // L: 7274 7275
						var85 = true;
					}

					if (!var85 && field736 == 0) { // L: 7277
						field575[field723] = var63; // L: 7278
						field723 = (field723 + 1) % 100; // L: 7279
						var40 = AbstractFont.escapeBrackets(class20.method303(class128.method3076(var3))); // L: 7280
						if (var97.modIcon != -1) { // L: 7281
							ArchiveLoader.addChatMessage(9, FloorUnderlayDefinition.method3799(var97.modIcon) + var52, var40, HitSplatDefinition.base37DecodeLong(var27));
						} else {
							ArchiveLoader.addChatMessage(9, var52, var40, HitSplatDefinition.base37DecodeLong(var27)); // L: 7282
						}
					}

					var1.serverPacket = null; // L: 7284
					return true; // L: 7285
				}

				if (ServerPacket.field3315 == var1.serverPacket) { // L: 7287
					var52 = var3.readStringCp1252NullTerminated(); // L: 7288
					Object[] var73 = new Object[var52.length() + 1]; // L: 7289

					for (var6 = var52.length() - 1; var6 >= 0; --var6) { // L: 7290
						if (var52.charAt(var6) == 's') { // L: 7291
							var73[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var73[var6 + 1] = new Integer(var3.readInt()); // L: 7292
						}
					}

					var73[0] = new Integer(var3.readInt()); // L: 7294
					ScriptEvent var89 = new ScriptEvent(); // L: 7295
					var89.args = var73; // L: 7296
					class157.runScriptEvent(var89); // L: 7297
					var1.serverPacket = null; // L: 7298
					return true; // L: 7299
				}

				if (ServerPacket.field3296 == var1.serverPacket) { // L: 7301
					var21 = var3.readUnsignedByte(); // L: 7302
					WorldMapIcon_1.method4514(var21); // L: 7303
					var1.serverPacket = null; // L: 7304
					return true; // L: 7305
				}

				if (ServerPacket.field3257 == var1.serverPacket) { // L: 7307
					if (rootInterface != -1) { // L: 7308
						class514.method9131(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 7309
					return true; // L: 7310
				}

				if (ServerPacket.field3256 == var1.serverPacket && isCameraLocked) { // L: 7312 7313
					field482 = true; // L: 7314
					field749 = false; // L: 7315
					field748 = false; // L: 7316

					for (var21 = 0; var21 < 5; ++var21) { // L: 7317
						field755[var21] = false; // L: 7318
					}

					var1.serverPacket = null; // L: 7320
					return true; // L: 7321
				}

				if (ServerPacket.field3338 == var1.serverPacket) { // L: 7324
					var21 = var3.method9302(); // L: 7325
					var5 = var3.readInt(); // L: 7326
					var6 = var21 >> 10 & 31; // L: 7327
					var7 = var21 >> 5 & 31; // L: 7328
					var8 = var21 & 31; // L: 7329
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3); // L: 7330
					Widget var58 = HealthBarDefinition.field1877.method6285(var5); // L: 7331
					if (var9 != var58.color) { // L: 7332
						var58.color = var9; // L: 7333
						class159.invalidateWidget(var58); // L: 7334
					}

					var1.serverPacket = null; // L: 7336
					return true; // L: 7337
				}

				NPC var94;
				if (ServerPacket.field3322 == var1.serverPacket) { // L: 7339
					var21 = var3.method9304(); // L: 7345
					var94 = npcs[var21]; // L: 7346
					var6 = var3.method9304(); // L: 7347
					var5 = var3.method9318(); // L: 7348
					var7 = var3.method9496(); // L: 7349
					if (var94 != null) { // L: 7350
						var94.method2466(var7, var6, var5 >> 16, var5 & 65535); // L: 7351
					}

					var1.serverPacket = null; // L: 7353
					return true; // L: 7354
				}

				if (ServerPacket.field3305 == var1.serverPacket) { // L: 7356
					field588 = cycleCntr; // L: 7357
					var76 = var3.readByte(); // L: 7358
					if (var1.serverPacketLength == 1) { // L: 7359
						if (var76 >= 0) { // L: 7360
							currentClanChannels[var76] = null;
						} else {
							ItemContainer.guestClanChannel = null; // L: 7361
						}

						var1.serverPacket = null; // L: 7362
						return true; // L: 7363
					}

					if (var76 >= 0) { // L: 7365
						currentClanChannels[var76] = new ClanChannel(var3); // L: 7366
					} else {
						ItemContainer.guestClanChannel = new ClanChannel(var3); // L: 7369
					}

					var1.serverPacket = null; // L: 7371
					return true; // L: 7372
				}

				if (ServerPacket.field3259 == var1.serverPacket) { // L: 7374
					var21 = var3.method9319(); // L: 7375
					var5 = var3.method9302(); // L: 7376
					short var60 = (short)var3.readShort(); // L: 7377
					var7 = var3.method9496(); // L: 7378
					var94 = npcs[var5]; // L: 7379
					if (var94 != null) { // L: 7380
						var94.method2666(var7, var21, var60); // L: 7381
					}

					var1.serverPacket = null; // L: 7383
					return true; // L: 7384
				}

				if (ServerPacket.field3334 == var1.serverPacket) { // L: 7386
					class18.field85 = var3.method9295(); // L: 7387
					class6.field14 = var3.method9294(); // L: 7388

					while (var3.offset < var1.serverPacketLength) { // L: 7389
						var21 = var3.readUnsignedByte(); // L: 7390
						class306 var72 = class520.method9189()[var21]; // L: 7391
						class106.method2777(var72); // L: 7392
					}

					var1.serverPacket = null; // L: 7394
					return true; // L: 7395
				}

				if (ServerPacket.field3293 == var1.serverPacket) { // L: 7397
					field588 = cycleCntr; // L: 7398
					var76 = var3.readByte(); // L: 7399
					class161 var71 = new class161(var3); // L: 7400
					ClanChannel var88;
					if (var76 >= 0) { // L: 7402
						var88 = currentClanChannels[var76];
					} else {
						var88 = ItemContainer.guestClanChannel; // L: 7403
					}

					if (var88 == null) { // L: 7404
						this.method1294(var76); // L: 7405
						var1.serverPacket = null; // L: 7406
						return true; // L: 7407
					}

					if (var71.field1752 > var88.field1772) { // L: 7409
						this.method1294(var76); // L: 7410
						var1.serverPacket = null; // L: 7411
						return true; // L: 7412
					}

					if (var71.field1752 < var88.field1772) { // L: 7414
						var1.serverPacket = null; // L: 7415
						return true; // L: 7416
					}

					var71.method3437(var88); // L: 7418
					var1.serverPacket = null; // L: 7419
					return true; // L: 7420
				}

				if (ServerPacket.field3340 == var1.serverPacket) { // L: 7422
					class106.method2777(class306.field3225); // L: 7423
					var1.serverPacket = null; // L: 7424
					return true; // L: 7425
				}

				if (ServerPacket.field3294 == var1.serverPacket) { // L: 7427
					class106.method2777(class306.field3226); // L: 7428
					var1.serverPacket = null; // L: 7429
					return true; // L: 7430
				}

				if (ServerPacket.field3348 == var1.serverPacket) { // L: 7432
					class396.method7403(); // L: 7433
					var21 = var3.method9294(); // L: 7434
					var5 = var3.method9317(); // L: 7435
					var6 = var3.readUnsignedByte(); // L: 7436
					experience[var21] = var5; // L: 7437
					currentLevels[var21] = var6; // L: 7438
					levels[var21] = 1; // L: 7439
					field540[var21] = var6; // L: 7440

					for (var7 = 0; var7 < 98; ++var7) { // L: 7441
						if (var5 >= Skills.Skills_experienceTable[var7]) {
							levels[var21] = var7 + 2;
						}
					}

					field686[++field687 - 1 & 31] = var21; // L: 7442
					var1.serverPacket = null; // L: 7443
					return true; // L: 7444
				}

				if (ServerPacket.field3285 == var1.serverPacket) { // L: 7446
					class106.method2777(class306.field3229); // L: 7447
					var1.serverPacket = null; // L: 7448
					return true; // L: 7449
				}

				if (ServerPacket.field3314 == var1.serverPacket) { // L: 7451
					class410.method7801(var3.readStringCp1252NullTerminated()); // L: 7452
					var1.serverPacket = null; // L: 7453
					return true; // L: 7454
				}

				boolean var55;
				if (ServerPacket.field3361 == var1.serverPacket) { // L: 7456
					var21 = var3.method9317(); // L: 7457
					var55 = var3.readUnsignedByte() == 1; // L: 7458
					var25 = HealthBarDefinition.field1877.method6285(var21); // L: 7459
					if (var55 != var25.isHidden) { // L: 7460
						var25.isHidden = var55; // L: 7461
						class159.invalidateWidget(var25); // L: 7462
					}

					var1.serverPacket = null; // L: 7464
					return true; // L: 7465
				}

				if (ServerPacket.field3260 == var1.serverPacket) { // L: 7467
					class106.method2777(class306.field3237); // L: 7468
					var1.serverPacket = null; // L: 7469
					return true; // L: 7470
				}

				if (ServerPacket.field3335 == var1.serverPacket) { // L: 7472
					class18.field85 = var3.method9496(); // L: 7473
					class6.field14 = var3.method9294(); // L: 7474
					var1.serverPacket = null; // L: 7475
					return true; // L: 7476
				}

				if (ServerPacket.field3263 == var1.serverPacket) { // L: 7478
					for (var21 = 0; var21 < VarpDefinition.field1815; ++var21) { // L: 7479
						VarpDefinition var70 = FloorOverlayDefinition.VarpDefinition_get(var21); // L: 7480
						if (var70 != null) { // L: 7481
							Varps.Varps_temp[var21] = 0; // L: 7482
							Varps.Varps_main[var21] = 0; // L: 7483
						}
					}

					class396.method7403(); // L: 7486
					field683 += 32; // L: 7487
					var1.serverPacket = null; // L: 7488
					return true; // L: 7489
				}

				if (ServerPacket.field3301 == var1.serverPacket) { // L: 7491
					class106.method2777(class306.field3233); // L: 7492
					var1.serverPacket = null; // L: 7493
					return true; // L: 7494
				}

				if (ServerPacket.field3286 == var1.serverPacket) { // L: 7496
					var21 = var3.readInt(); // L: 7497
					var5 = var3.readUnsignedShort(); // L: 7498
					if (var21 < -70000) { // L: 7499
						var5 += 32768;
					}

					if (var21 >= 0) { // L: 7501
						var25 = HealthBarDefinition.field1877.method6285(var21);
					} else {
						var25 = null; // L: 7502
					}

					for (; var3.offset < var1.serverPacketLength; class185.itemContainerSetItem(var5, var7, var8 - 1, var9)) { // L: 7503 7517
						var7 = var3.readUShortSmart(); // L: 7504
						var8 = var3.readUnsignedShort(); // L: 7505
						var9 = 0; // L: 7506
						if (var8 != 0) { // L: 7507
							var9 = var3.readUnsignedByte(); // L: 7508
							if (var9 == 255) { // L: 7509
								var9 = var3.readInt();
							}
						}

						if (var25 != null && var7 >= 0 && var7 < var25.field3790.length) { // L: 7511 7512
							var25.field3790[var7] = var8; // L: 7513
							var25.field3791[var7] = var9; // L: 7514
						}
					}

					if (var25 != null) { // L: 7519
						class159.invalidateWidget(var25);
					}

					class396.method7403(); // L: 7520
					field541[++field685 - 1 & 31] = var5 & 32767; // L: 7521
					var1.serverPacket = null; // L: 7522
					return true; // L: 7523
				}

				if (ServerPacket.field3346 == var1.serverPacket) { // L: 7525
					World var51 = new World(); // L: 7526
					var51.host = var3.readStringCp1252NullTerminated(); // L: 7527
					var51.id = var3.readUnsignedShort(); // L: 7528
					var5 = var3.readInt(); // L: 7529
					var51.properties = var5; // L: 7530
					if (var51.isDeadman()) { // L: 7531
						var51.field808 = "beta"; // L: 7532
					}

					WorldMapSection2.method4516(45); // L: 7534
					var2.close(); // L: 7535
					var2 = null; // L: 7536
					KeyHandler.changeWorld(var51); // L: 7537
					var1.serverPacket = null; // L: 7538
					return false; // L: 7539
				}

				if (ServerPacket.field3253 == var1.serverPacket) { // L: 7541
					var21 = var3.method9319(); // L: 7542
					var5 = var3.method9318(); // L: 7543
					InterfaceParent var86 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7544
					var75 = (InterfaceParent)interfaceParents.get((long)var21); // L: 7545
					if (var75 != null) { // L: 7546
						class302.closeInterface(var75, var86 == null || var86.group != var75.group);
					}

					if (var86 != null) { // L: 7547
						var86.remove(); // L: 7548
						interfaceParents.put(var86, (long)var21); // L: 7549
					}

					var93 = HealthBarDefinition.field1877.method6285(var5); // L: 7551
					if (var93 != null) { // L: 7552
						class159.invalidateWidget(var93);
					}

					var93 = HealthBarDefinition.field1877.method6285(var21); // L: 7553
					if (var93 != null) { // L: 7554
						class159.invalidateWidget(var93); // L: 7555
						class132.revalidateWidgetScroll(HealthBarDefinition.field1877.field3568[var93.id >>> 16], var93, true); // L: 7556
					}

					if (rootInterface != -1) { // L: 7558
						class514.method9131(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7559
					return true; // L: 7560
				}

				if (ServerPacket.field3261 == var1.serverPacket) { // L: 7562
					isCameraLocked = true; // L: 7563
					field482 = false; // L: 7564
					field748 = true; // L: 7565
					ScriptFrame.field456 = var3.readUnsignedByte() * 128; // L: 7566
					class216.field2314 = var3.readUnsignedByte() * 128; // L: 7567
					var21 = var3.readUnsignedShort(); // L: 7568
					var5 = var3.readUnsignedShort(); // L: 7569
					field661 = var3.readBoolean(); // L: 7570
					var6 = var3.readUnsignedByte(); // L: 7571
					var7 = ScriptFrame.field456 * 16384 + 64; // L: 7572
					var8 = class216.field2314 * 16384 + 64; // L: 7573
					boolean var61 = false; // L: 7574
					boolean var83 = false; // L: 7575
					if (field661) { // L: 7576
						var9 = SecureRandomFuture.cameraY; // L: 7577
						var23 = WorldMapDecorationType.getTileHeight(var7, var8, ItemLayer.Client_plane) - var21; // L: 7578
					} else {
						var9 = WorldMapDecorationType.getTileHeight(ViewportMouse.cameraX, class36.cameraZ, ItemLayer.Client_plane) - SecureRandomFuture.cameraY; // L: 7581
						var23 = var21; // L: 7582
					}

					field751 = new class489(ViewportMouse.cameraX, class36.cameraZ, var9, var7, var8, var23, var5, var6); // L: 7584
					var1.serverPacket = null; // L: 7585
					return true; // L: 7586
				}

				if (ServerPacket.field3287 == var1.serverPacket) { // L: 7588
					var9 = var3.method9302(); // L: 7595
					var8 = var3.method9304(); // L: 7596
					var21 = var3.method9304(); // L: 7597
					if (var21 == 65535) { // L: 7598
						var21 = -1; // L: 7599
					}

					var7 = var3.method9302(); // L: 7601
					var6 = var3.method9302(); // L: 7602
					var5 = var3.method9302(); // L: 7603
					if (var5 == 65535) { // L: 7604
						var5 = -1; // L: 7605
					}

					ArrayList var56 = new ArrayList(); // L: 7607
					var56.add(var21); // L: 7608
					var56.add(var5); // L: 7609
					class135.method3152(var56, var6, var7, var8, var9); // L: 7610
					var1.serverPacket = null; // L: 7611
					return true; // L: 7612
				}

				if (ServerPacket.field3329 == var1.serverPacket) { // L: 7614
					GrandExchangeOfferUnitPriceComparator.method7146(true, var1.packetBuffer, false); // L: 7615
					var1.serverPacket = null; // L: 7616
					return true; // L: 7617
				}

				if (ServerPacket.field3351 == var1.serverPacket) { // L: 7619
					var11 = var3.method9313(); // L: 7635
					var26 = var3.method9295() * 4; // L: 7636
					var24 = var3.method9304(); // L: 7637
					var6 = var3.method9418(); // L: 7638
					var21 = var6 >> 16; // L: 7639
					var5 = var6 >> 8 & 255; // L: 7640
					var7 = var21 + (var6 >> 4 & 7); // L: 7641
					var8 = var5 + (var6 & 7); // L: 7642
					var15 = var3.method9302(); // L: 7643
					var57 = var3.readByte(); // L: 7644
					var18 = var3.method9294(); // L: 7645
					var16 = var3.method9303(); // L: 7646
					var17 = var3.method9496(); // L: 7647
					var81 = var3.method9296(); // L: 7648
					var65 = var3.readUnsignedByte() * 4; // L: 7649
					var9 = var57 + var7; // L: 7650
					var23 = var81 + var8; // L: 7651
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var23 >= 0 && var9 < 104 && var23 < 104 && var24 != 65535) { // L: 7652
						var7 = var7 * 128 + 64; // L: 7653
						var8 = var8 * 128 + 64; // L: 7654
						var9 = var9 * 128 + 64; // L: 7655
						var23 = var23 * 128 + 64; // L: 7656
						var19 = new Projectile(var24, ItemLayer.Client_plane, var7, var8, WorldMapDecorationType.getTileHeight(var7, var8, ItemLayer.Client_plane) - var65, var15 + cycle, var16 + cycle, var17, var18, var11, var26); // L: 7657
						var19.setDestination(var9, var23, WorldMapDecorationType.getTileHeight(var9, var23, ItemLayer.Client_plane) - var26, var15 + cycle); // L: 7658
						projectiles.addFirst(var19); // L: 7659
					}

					var1.serverPacket = null; // L: 7661
					return true; // L: 7662
				}

				if (ServerPacket.field3365 == var1.serverPacket) { // L: 7664
					GrandExchangeOfferUnitPriceComparator.method7146(false, var1.packetBuffer, false); // L: 7665
					var1.serverPacket = null; // L: 7666
					return true; // L: 7667
				}

				if (ServerPacket.field3341 == var1.serverPacket) { // L: 7669
					GrandExchangeOfferUnitPriceComparator.method7146(false, var1.packetBuffer, true); // L: 7670
					var1.serverPacket = null; // L: 7671
					return true; // L: 7672
				}

				if (ServerPacket.field3323 == var1.serverPacket) { // L: 7674
					var5 = var3.method9304(); // L: 7677
					var21 = var3.method9302(); // L: 7678
					WorldMapManager.method4769(var21, var5); // L: 7679
					var1.serverPacket = null; // L: 7680
					return true; // L: 7681
				}

				if (ServerPacket.field3264 == var1.serverPacket) { // L: 7683
					var21 = var3.method9305(); // L: 7684
					var5 = var3.method9307(); // L: 7685
					var6 = var3.method9318(); // L: 7686
					var22 = HealthBarDefinition.field1877.method6285(var6); // L: 7687
					if (var5 != var22.rawX || var21 != var22.rawY || var22.xAlignment != 0 || var22.yAlignment != 0) { // L: 7688
						var22.rawX = var5; // L: 7689
						var22.rawY = var21; // L: 7690
						var22.xAlignment = 0; // L: 7691
						var22.yAlignment = 0; // L: 7692
						class159.invalidateWidget(var22); // L: 7693
						this.alignWidget(var22); // L: 7694
						if (var22.type == 0) { // L: 7695
							class132.revalidateWidgetScroll(HealthBarDefinition.field1877.field3568[var6 >> 16], var22, false);
						}
					}

					var1.serverPacket = null; // L: 7697
					return true; // L: 7698
				}

				if (ServerPacket.field3327 == var1.serverPacket) { // L: 7700
					var21 = var3.readUnsignedShort(); // L: 7701
					if (var21 == 65535) { // L: 7702
						var21 = -1;
					}

					class102.playSong(var21); // L: 7703
					var1.serverPacket = null; // L: 7704
					return true; // L: 7705
				}

				if (ServerPacket.field3284 == var1.serverPacket) { // L: 7707
					var21 = var3.method9310(); // L: 7708
					var5 = var3.method9303(); // L: 7709
					if (var5 == 65535) { // L: 7710
						var5 = -1;
					}

					FileSystem.method4224(var5, var21); // L: 7711
					var1.serverPacket = null; // L: 7712
					return true; // L: 7713
				}

				if (ServerPacket.field3303 == var1.serverPacket) { // L: 7715
					isCameraLocked = true; // L: 7716
					field482 = false; // L: 7717
					field749 = true; // L: 7718
					var21 = var3.readShort(); // L: 7719
					var5 = var3.readShort(); // L: 7720
					var6 = class240.method4829(var5 + Varcs.cameraPitch & 2027); // L: 7721
					var7 = var21 + class192.cameraYaw; // L: 7722
					var8 = var3.readUnsignedShort(); // L: 7723
					var9 = var3.readUnsignedByte(); // L: 7724
					field672 = new class490(Varcs.cameraPitch, var6, var8, var9); // L: 7725
					field752 = new class490(class192.cameraYaw, var7, var8, var9); // L: 7726
					var1.serverPacket = null; // L: 7727
					return true; // L: 7728
				}

				if (ServerPacket.field3316 == var1.serverPacket) { // L: 7730
					var21 = var3.method9302(); // L: 7731
					var5 = var3.method9302(); // L: 7732
					var6 = var3.method9318(); // L: 7733
					var22 = HealthBarDefinition.field1877.method6285(var6); // L: 7734
					var22.field3716 = var5 + (var21 << 16); // L: 7735
					var1.serverPacket = null; // L: 7736
					return true; // L: 7737
				}

				if (ServerPacket.field3326 == var1.serverPacket) { // L: 7739
					class18.field85 = var3.method9496(); // L: 7740
					class6.field14 = var3.method9496(); // L: 7741

					for (var21 = class18.field85; var21 < class18.field85 + 8; ++var21) { // L: 7742
						for (var5 = class6.field14; var5 < class6.field14 + 8; ++var5) { // L: 7743
							if (groundItems[ItemLayer.Client_plane][var21][var5] != null) { // L: 7744
								groundItems[ItemLayer.Client_plane][var21][var5] = null; // L: 7745
								ClanSettings.updateItemPile(var21, var5); // L: 7746
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) { // L: 7750 7751 7753
						if (var50.x >= class18.field85 && var50.x < class18.field85 + 8 && var50.y >= class6.field14 && var50.y < class6.field14 + 8 && var50.plane == ItemLayer.Client_plane) { // L: 7752
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7755
					return true; // L: 7756
				}

				if (ServerPacket.field3317 == var1.serverPacket) { // L: 7758
					isCameraLocked = true; // L: 7759
					field482 = false; // L: 7760
					field749 = true; // L: 7761
					Messages.field1400 = var3.readUnsignedByte() * 128; // L: 7762
					AbstractWorldMapData.field2575 = var3.readUnsignedByte() * 128; // L: 7763
					class302.field3119 = var3.readUnsignedShort(); // L: 7764
					var21 = var3.readUnsignedShort(); // L: 7765
					var5 = var3.readUnsignedByte(); // L: 7766
					var6 = Messages.field1400 * 16384 + 64; // L: 7767
					var7 = AbstractWorldMapData.field2575 * 16384 + 64; // L: 7768
					var8 = WorldMapDecorationType.getTileHeight(var6, var7, ItemLayer.Client_plane) - class302.field3119; // L: 7769
					var9 = var6 - ViewportMouse.cameraX; // L: 7770
					var23 = var8 - SecureRandomFuture.cameraY; // L: 7771
					var11 = var7 - class36.cameraZ; // L: 7772
					double var12 = Math.sqrt((double)(var9 * var9 + var11 * var11)); // L: 7773
					var26 = class240.method4829((int)(Math.atan2((double)var23, var12) * 325.9490051269531D) & 2047); // L: 7774
					var15 = class319.method6186((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047); // L: 7775
					field672 = new class490(Varcs.cameraPitch, var26, var21, var5); // L: 7776
					field752 = new class490(class192.cameraYaw, var15, var21, var5); // L: 7777
					var1.serverPacket = null; // L: 7778
					return true; // L: 7779
				}

				if (ServerPacket.field3349 == var1.serverPacket) { // L: 7781
					var21 = var3.method9317(); // L: 7782
					var55 = var3.method9295() == 1; // L: 7783
					var25 = HealthBarDefinition.field1877.method6285(var21); // L: 7784
					class18.method290(var25, class229.localPlayer.appearance, var55); // L: 7785
					class159.invalidateWidget(var25); // L: 7786
					var1.serverPacket = null; // L: 7787
					return true; // L: 7788
				}

				if (ServerPacket.field3330 == var1.serverPacket) { // L: 7790
					var21 = var3.readUnsignedByte(); // L: 7791
					var5 = var3.readInt(); // L: 7792
					var25 = HealthBarDefinition.field1877.method6285(var5); // L: 7793
					class302.method5906(var25, class229.localPlayer.appearance.field3600, var21); // L: 7794
					class159.invalidateWidget(var25); // L: 7795
					var1.serverPacket = null; // L: 7796
					return true; // L: 7797
				}

				if (ServerPacket.field3281 == var1.serverPacket) { // L: 7799
					var21 = var3.readUShortSmart(); // L: 7800
					var55 = var3.readUnsignedByte() == 1; // L: 7801
					var84 = ""; // L: 7802
					boolean var54 = false; // L: 7803
					if (var55) { // L: 7804
						var84 = var3.readStringCp1252NullTerminated(); // L: 7805
						if (class12.friendSystem.isIgnored(new Username(var84, class89.loginType))) { // L: 7806
							var54 = true;
						}
					}

					String var92 = var3.readStringCp1252NullTerminated(); // L: 7808
					if (!var54) { // L: 7809
						GrandExchangeOfferUnitPriceComparator.addGameMessage(var21, var84, var92);
					}

					var1.serverPacket = null; // L: 7810
					return true; // L: 7811
				}

				if (ServerPacket.field3350 == var1.serverPacket) { // L: 7813
					var9 = var3.method9304(); // L: 7822
					var23 = var3.method9496(); // L: 7823
					var6 = var3.readMedium(); // L: 7824
					var21 = var6 >> 16; // L: 7825
					var5 = var6 >> 8 & 255; // L: 7826
					var7 = var21 + (var6 >> 4 & 7); // L: 7827
					var8 = var5 + (var6 & 7); // L: 7828
					var11 = var3.method9302(); // L: 7829
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7830
						var7 = var7 * 128 + 64; // L: 7831
						var8 = var8 * 128 + 64; // L: 7832
						GraphicsObject var38 = new GraphicsObject(var9, ItemLayer.Client_plane, var7, var8, WorldMapDecorationType.getTileHeight(var7, var8, ItemLayer.Client_plane) - var23, var11, cycle); // L: 7833
						graphicsObjects.addFirst(var38); // L: 7834
					}

					var1.serverPacket = null; // L: 7836
					return true; // L: 7837
				}

				if (ServerPacket.field3268 == var1.serverPacket) { // L: 7839
					var21 = var3.method9319(); // L: 7840
					var5 = var3.method9317(); // L: 7841
					var25 = HealthBarDefinition.field1877.method6285(var5); // L: 7842
					AbstractWorldMapData.method4899(var25, var21); // L: 7843
					class159.invalidateWidget(var25); // L: 7844
					var1.serverPacket = null; // L: 7845
					return true; // L: 7846
				}

				if (ServerPacket.field3362 == var1.serverPacket) { // L: 7848
					var21 = var3.method9319(); // L: 7849
					var5 = var3.method9303(); // L: 7850
					if (var5 == 65535) { // L: 7851
						var5 = -1;
					}

					var6 = var3.method9317(); // L: 7852
					var22 = HealthBarDefinition.field1877.method6285(var6); // L: 7853
					ItemComposition var35;
					if (!var22.isIf3) { // L: 7854
						if (var5 == -1) { // L: 7855
							var22.modelType = 0; // L: 7856
							var1.serverPacket = null; // L: 7857
							return true; // L: 7858
						}

						var35 = class214.ItemComposition_get(var5).getCountObj(var21); // L: 7860
						var22.modelType = 4; // L: 7861
						var22.modelId = var5; // L: 7862
						var22.modelAngleX = var35.xan2d; // L: 7863
						var22.modelAngleY = var35.yan2d; // L: 7864
						var22.modelZoom = var35.zoom2d * 100 / var21; // L: 7865
						class159.invalidateWidget(var22); // L: 7866
					} else {
						var22.itemId = var5; // L: 7869
						var22.itemQuantity = var21; // L: 7870
						var35 = class214.ItemComposition_get(var5).getCountObj(var21); // L: 7871
						var22.modelAngleX = var35.xan2d; // L: 7872
						var22.modelAngleY = var35.yan2d; // L: 7873
						var22.modelAngleZ = var35.zan2d; // L: 7874
						var22.modelOffsetX = var35.offsetX2d; // L: 7875
						var22.modelOffsetY = var35.offsetY2d; // L: 7876
						var22.modelZoom = var35.zoom2d; // L: 7877
						if (var35.isStackable == 1) { // L: 7878
							var22.itemQuantityMode = 1;
						} else {
							var22.itemQuantityMode = 2; // L: 7879
						}

						if (var22.field3684 > 0) { // L: 7880
							var22.modelZoom = var22.modelZoom * 32 / var22.field3684;
						} else if (var22.rawWidth > 0) { // L: 7881
							var22.modelZoom = var22.modelZoom * 32 / var22.rawWidth;
						}

						class159.invalidateWidget(var22); // L: 7882
					}

					var1.serverPacket = null; // L: 7884
					return true; // L: 7885
				}

				if (ServerPacket.field3309 == var1.serverPacket) { // L: 7887
					field482 = false; // L: 7888
					isCameraLocked = false; // L: 7889
					field748 = false; // L: 7890
					field749 = false; // L: 7891
					Messages.field1400 = 0; // L: 7892
					AbstractWorldMapData.field2575 = 0; // L: 7893
					class302.field3119 = 0; // L: 7894
					field661 = false; // L: 7895
					class60.field421 = 0; // L: 7896
					class134.field1581 = 0; // L: 7897
					class1.field2 = 0; // L: 7898
					WorldMapIcon_0.field2529 = 0; // L: 7899
					ScriptFrame.field456 = 0; // L: 7900
					class216.field2314 = 0; // L: 7901
					class127.field1488 = 0; // L: 7902
					field751 = null; // L: 7903
					field672 = null; // L: 7904
					field752 = null; // L: 7905

					for (var21 = 0; var21 < 5; ++var21) { // L: 7906
						field755[var21] = false; // L: 7907
					}

					var1.serverPacket = null; // L: 7909
					return true; // L: 7910
				}

				if (ServerPacket.field3360 == var1.serverPacket) { // L: 7912
					byte[] var49 = new byte[var1.serverPacketLength]; // L: 7913
					var3.method9208(var49, 0, var49.length); // L: 7914
					Buffer var69 = new Buffer(var49); // L: 7915
					var84 = var69.readStringCp1252NullTerminated(); // L: 7916
					HealthBar.openURL(var84, true, false); // L: 7917
					var1.serverPacket = null; // L: 7918
					return true; // L: 7919
				}

				if (ServerPacket.field3249 == var1.serverPacket) { // L: 7921
					isCameraLocked = true; // L: 7922
					field482 = false; // L: 7923
					field749 = false; // L: 7924
					Messages.field1400 = var3.readUnsignedByte() * 128; // L: 7925
					AbstractWorldMapData.field2575 = var3.readUnsignedByte() * 128; // L: 7926
					class302.field3119 = var3.readUnsignedShort(); // L: 7927
					class60.field421 = var3.readUnsignedByte(); // L: 7928
					class134.field1581 = var3.readUnsignedByte(); // L: 7929
					if (class134.field1581 >= 100) { // L: 7930
						var21 = Messages.field1400 * 16384 + 64; // L: 7931
						var5 = AbstractWorldMapData.field2575 * 16384 + 64; // L: 7932
						var6 = WorldMapDecorationType.getTileHeight(var21, var5, ItemLayer.Client_plane) - class302.field3119; // L: 7933
						var7 = var21 - ViewportMouse.cameraX; // L: 7934
						var8 = var6 - SecureRandomFuture.cameraY; // L: 7935
						var9 = var5 - class36.cameraZ; // L: 7936
						var23 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7)); // L: 7937
						Varcs.cameraPitch = (int)(Math.atan2((double)var8, (double)var23) * 325.9490051269531D) & 2047; // L: 7938
						class192.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 7939
						if (Varcs.cameraPitch < 128) { // L: 7940
							Varcs.cameraPitch = 128;
						}

						if (Varcs.cameraPitch > 383) { // L: 7941
							Varcs.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 7943
					return true; // L: 7944
				}

				if (ServerPacket.field3276 == var1.serverPacket) { // L: 7946
					class396.method7403(); // L: 7947
					var21 = var3.method9295(); // L: 7948
					var5 = var3.method9318(); // L: 7949
					var6 = var3.readUnsignedByte(); // L: 7950
					var7 = var3.method9294(); // L: 7951
					experience[var6] = var5; // L: 7952
					currentLevels[var6] = var7; // L: 7953
					levels[var6] = 1; // L: 7954
					field540[var6] = var21; // L: 7955

					for (var8 = 0; var8 < 98; ++var8) { // L: 7956
						if (var5 >= Skills.Skills_experienceTable[var8]) {
							levels[var6] = var8 + 2;
						}
					}

					field686[++field687 - 1 & 31] = var6; // L: 7957
					var1.serverPacket = null; // L: 7958
					return true; // L: 7959
				}

				if (ServerPacket.field3252 == var1.serverPacket) { // L: 7961
					var21 = var3.readUnsignedShort(); // L: 7962
					var5 = var3.readInt(); // L: 7963
					Varps.Varps_temp[var21] = var5; // L: 7964
					if (Varps.Varps_main[var21] != var5) { // L: 7965
						Varps.Varps_main[var21] = var5; // L: 7966
					}

					Projectile.changeGameOptions(var21); // L: 7968
					field712[++field683 - 1 & 31] = var21; // L: 7969
					var1.serverPacket = null; // L: 7970
					return true; // L: 7971
				}

				if (ServerPacket.field3288 == var1.serverPacket) { // L: 7973
					class106.method2777(class306.field3232); // L: 7974
					var1.serverPacket = null; // L: 7975
					return true; // L: 7976
				}

				if (ServerPacket.field3299 == var1.serverPacket) { // L: 7978
					var76 = var3.readByte(); // L: 7979
					var20 = var3.readStringCp1252NullTerminated(); // L: 7980
					long var41 = (long)var3.readUnsignedShort(); // L: 7981
					long var43 = (long)var3.readMedium(); // L: 7982
					PlayerType var10 = (PlayerType)class12.findEnumerated(class320.PlayerType_values(), var3.readUnsignedByte()); // L: 7983
					long var45 = var43 + (var41 << 32); // L: 7984
					boolean var13 = false; // L: 7985
					ClanChannel var14 = null; // L: 7986
					var14 = var76 >= 0 ? currentClanChannels[var76] : ItemContainer.guestClanChannel; // L: 7988
					if (var14 == null) { // L: 7989
						var13 = true; // L: 7990
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var10.isUser && class12.friendSystem.isIgnored(new Username(var20, class89.loginType))) { // L: 7999 8000
									var13 = true;
								}
								break;
							}

							if (var45 == field575[var15]) { // L: 7994
								var13 = true; // L: 7995
								break; // L: 7996
							}

							++var15; // L: 7993
						}
					}

					if (!var13) { // L: 8003
						field575[field723] = var45; // L: 8004
						field723 = (field723 + 1) % 100; // L: 8005
						var40 = AbstractFont.escapeBrackets(class128.method3076(var3)); // L: 8006
						var16 = var76 >= 0 ? 41 : 44; // L: 8007
						if (var10.modIcon != -1) { // L: 8008
							ArchiveLoader.addChatMessage(var16, FloorUnderlayDefinition.method3799(var10.modIcon) + var20, var40, var14.name);
						} else {
							ArchiveLoader.addChatMessage(var16, var20, var40, var14.name); // L: 8009
						}
					}

					var1.serverPacket = null; // L: 8011
					return true; // L: 8012
				}

				if (ServerPacket.field3359 == var1.serverPacket) { // L: 8014
					var21 = var3.method9319(); // L: 8015
					var5 = var3.method9302(); // L: 8016
					if (var5 == 65535) { // L: 8017
						var5 = -1;
					}

					var6 = var3.method9318(); // L: 8018
					var7 = var3.readUnsignedShort(); // L: 8019
					if (var7 == 65535) { // L: 8020
						var7 = -1;
					}

					for (var8 = var7; var8 <= var5; ++var8) { // L: 8021
						var36 = ((long)var6 << 32) + (long)var8; // L: 8022
						Node var39 = widgetFlags.get(var36); // L: 8023
						if (var39 != null) { // L: 8024
							var39.remove();
						}

						widgetFlags.put(new IntegerNode(var21), var36); // L: 8025
					}

					var1.serverPacket = null; // L: 8027
					return true; // L: 8028
				}

				if (ServerPacket.field3269 == var1.serverPacket) { // L: 8030
					var21 = var3.method9304(); // L: 8031
					var5 = var3.method9295(); // L: 8032
					if (var21 == 65535) { // L: 8033
						var21 = -1; // L: 8034
					}

					WorldMapLabelSize.performPlayerAnimation(class229.localPlayer, var21, var5); // L: 8036
					var1.serverPacket = null; // L: 8037
					return true; // L: 8038
				}

				if (ServerPacket.field3356 == var1.serverPacket) { // L: 8040
					var21 = var3.method9318(); // L: 8041
					var5 = var3.method9302(); // L: 8042
					var25 = HealthBarDefinition.field1877.method6285(var21); // L: 8043
					if (var25.modelType != 2 || var5 != var25.modelId) { // L: 8044
						var25.modelType = 2; // L: 8045
						var25.modelId = var5; // L: 8046
						class159.invalidateWidget(var25); // L: 8047
					}

					var1.serverPacket = null; // L: 8049
					return true; // L: 8050
				}

				if (ServerPacket.field3310 == var1.serverPacket) { // L: 8052
					var21 = var3.readUnsignedByte(); // L: 8053
					PacketWriter.forceDisconnect(var21); // L: 8054
					var1.serverPacket = null; // L: 8055
					return false; // L: 8056
				}

				GrandExchangeOfferWorldComparator.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1409 != null ? var1.field1409.id : -1) + "," + (var1.field1416 != null ? var1.field1416.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 8058
				class13.method177(); // L: 8059
			} catch (IOException var47) { // L: 8061
				class9.method85(); // L: 8062
			} catch (Exception var48) {
				var20 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1409 != null ? var1.field1409.id : -1) + "," + (var1.field1416 != null ? var1.field1416.id : -1) + "," + var1.serverPacketLength + "," + (class229.localPlayer.pathX[0] + class187.baseX * 64) + "," + (class229.localPlayer.pathY[0] + class101.baseY * 64) + ","; // L: 8065

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) { // L: 8066
					var20 = var20 + var3.array[var6] + ",";
				}

				GrandExchangeOfferWorldComparator.RunException_sendStackTrace(var20, var48); // L: 8067
				class13.method177(); // L: 8068
			}

			return true; // L: 8070
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1598980943"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 9332

		int var2;
		int var5;
		while (!var1) { // L: 9333
			var1 = true; // L: 9334

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 9335
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 9336
					String var17 = menuTargets[var2]; // L: 9337
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 9338
					menuTargets[var2 + 1] = var17; // L: 9339
					String var18 = menuActions[var2]; // L: 9340
					menuActions[var2] = menuActions[var2 + 1]; // L: 9341
					menuActions[var2 + 1] = var18; // L: 9342
					var5 = menuOpcodes[var2]; // L: 9343
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 9344
					menuOpcodes[var2 + 1] = var5; // L: 9345
					var5 = menuArguments1[var2]; // L: 9346
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 9347
					menuArguments1[var2 + 1] = var5; // L: 9348
					var5 = menuArguments2[var2]; // L: 9349
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 9350
					menuArguments2[var2 + 1] = var5; // L: 9351
					var5 = menuIdentifiers[var2]; // L: 9352
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 9353
					menuIdentifiers[var2 + 1] = var5; // L: 9354
					var5 = field639[var2]; // L: 9355
					field639[var2] = field639[var2 + 1]; // L: 9356
					field639[var2 + 1] = var5; // L: 9357
					boolean var6 = menuShiftClick[var2]; // L: 9358
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 9359
					menuShiftClick[var2 + 1] = var6; // L: 9360
					var1 = false; // L: 9361
				}
			}
		}

		if (clickedWidget == null) { // L: 9366
			int var19 = MouseHandler.MouseHandler_lastButton; // L: 9367
			int var4;
			int var7;
			int var8;
			int var20;
			if (isMenuOpen) { // L: 9368
				int var3;
				if (var19 != 1 && (class19.mouseCam || var19 != 4)) { // L: 9369
					var2 = MouseHandler.MouseHandler_x; // L: 9370
					var3 = MouseHandler.MouseHandler_y; // L: 9371
					if (var2 < FriendSystem.menuX - 10 || var2 > FriendSystem.menuX + class428.menuWidth + 10 || var3 < class60.menuY - 10 || var3 > class515.menuHeight + class60.menuY + 10) { // L: 9372
						isMenuOpen = false; // L: 9373
						var4 = FriendSystem.menuX; // L: 9374
						var5 = class60.menuY; // L: 9375
						var20 = class428.menuWidth; // L: 9376
						var7 = class515.menuHeight; // L: 9377

						for (var8 = 0; var8 < rootWidgetCount; ++var8) { // L: 9379
							if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var4 && rootWidgetXs[var8] < var20 + var4 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var5 + var7) { // L: 9380
								field708[var8] = true;
							}
						}
					}
				}

				if (var19 == 1 || !class19.mouseCam && var19 == 4) { // L: 9385
					var2 = FriendSystem.menuX; // L: 9386
					var3 = class60.menuY; // L: 9387
					var4 = class428.menuWidth; // L: 9388
					var5 = MouseHandler.MouseHandler_lastPressedX; // L: 9389
					var20 = MouseHandler.MouseHandler_lastPressedY; // L: 9390
					var7 = -1; // L: 9391

					int var15;
					for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 9392
						var15 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 9393
						if (var5 > var2 && var5 < var2 + var4 && var20 > var15 - 13 && var20 < var15 + 3) { // L: 9394
							var7 = var8;
						}
					}

					int var11;
					int var12;
					int var16;
					if (var7 != -1 && var7 >= 0) { // L: 9396 9397
						var8 = menuArguments1[var7]; // L: 9398
						var15 = menuArguments2[var7]; // L: 9399
						var16 = menuOpcodes[var7]; // L: 9400
						var11 = menuIdentifiers[var7]; // L: 9401
						var12 = field639[var7]; // L: 9402
						String var13 = menuActions[var7]; // L: 9403
						String var14 = menuTargets[var7]; // L: 9404
						class407.method7656(var8, var15, var16, var11, var12, var13, var14, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9405
					}

					isMenuOpen = false; // L: 9407
					var8 = FriendSystem.menuX; // L: 9408
					var15 = class60.menuY; // L: 9409
					var16 = class428.menuWidth; // L: 9410
					var11 = class515.menuHeight; // L: 9411

					for (var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 9413
						if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var8 + var16 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var15 && rootWidgetYs[var12] < var11 + var15) { // L: 9414
							field708[var12] = true;
						}
					}
				}
			} else {
				var2 = menuOptionsCount - 1; // L: 9422
				if ((var19 == 1 || !class19.mouseCam && var19 == 4) && this.shouldLeftClickOpenMenu()) { // L: 9425 9426
					var19 = 2; // L: 9427
				}

				if ((var19 == 1 || !class19.mouseCam && var19 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 9430 9432
					var4 = menuArguments1[var2]; // L: 9433
					var5 = menuArguments2[var2]; // L: 9434
					var20 = menuOpcodes[var2]; // L: 9435
					var7 = menuIdentifiers[var2]; // L: 9436
					var8 = field639[var2]; // L: 9437
					String var9 = menuActions[var2]; // L: 9438
					String var10 = menuTargets[var2]; // L: 9439
					class407.method7656(var4, var5, var20, var7, var8, var9, var10, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9440
				}

				if (var19 == 2 && menuOptionsCount > 0) { // L: 9443
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	} // L: 9445

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1230030345"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1; // L: 9450
		return (field632 && menuOptionsCount > 2 || class514.method9121(var1)) && !menuShiftClick[var1]; // L: 9453
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-26"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		Decimator.method1151(var1, var2); // L: 9457
		var1 -= viewportOffsetX; // L: 9458
		var2 -= viewportOffsetY; // L: 9459
		class36.scene.menuOpen(ItemLayer.Client_plane, var1, var2, false); // L: 9460
		isMenuOpen = true; // L: 9461
	} // L: 9462

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-577799502"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		NPCComposition.method3748(rootInterface, Language.canvasWidth, class47.canvasHeight, var1); // L: 11165
	} // L: 11166

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "1484692020"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : HealthBarDefinition.field1877.method6285(var1.parentId); // L: 11169
		int var3;
		int var4;
		if (var2 == null) { // L: 11172
			var3 = Language.canvasWidth; // L: 11173
			var4 = class47.canvasHeight; // L: 11174
		} else {
			var3 = var2.width; // L: 11177
			var4 = var2.height; // L: 11178
		}

		Renderable.alignWidgetSize(var1, var3, var4, false); // L: 11180
		JagexCache.alignWidgetPosition(var1, var3, var4); // L: 11181
	} // L: 11182

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-74"
	)
	final void method1727() {
		class159.invalidateWidget(clickedWidget); // L: 12100
		++class148.widgetDragDuration; // L: 12101
		if (field516 && field674) { // L: 12102
			int var1 = MouseHandler.MouseHandler_x; // L: 12111
			int var2 = MouseHandler.MouseHandler_y; // L: 12112
			var1 -= widgetClickX; // L: 12113
			var2 -= widgetClickY; // L: 12114
			if (var1 < field554) { // L: 12115
				var1 = field554;
			}

			if (var1 + clickedWidget.width > field554 + clickedWidgetParent.width) { // L: 12116
				var1 = field554 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field676) { // L: 12117
				var2 = field676;
			}

			if (var2 + clickedWidget.height > field676 + clickedWidgetParent.height) { // L: 12118
				var2 = field676 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field533; // L: 12119
			int var4 = var2 - field679; // L: 12120
			int var5 = clickedWidget.dragZoneSize; // L: 12121
			if (class148.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 12122 12123
				isDraggingWidget = true; // L: 12124
			}

			int var6 = var1 - field554 + clickedWidgetParent.scrollX; // L: 12127
			int var7 = var2 - field676 + clickedWidgetParent.scrollY; // L: 12128
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 12129
				var8 = new ScriptEvent(); // L: 12130
				var8.widget = clickedWidget; // L: 12131
				var8.mouseX = var6; // L: 12132
				var8.mouseY = var7; // L: 12133
				var8.args = clickedWidget.onDrag; // L: 12134
				class157.runScriptEvent(var8); // L: 12135
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 12137
				if (isDraggingWidget) { // L: 12138
					if (clickedWidget.onDragComplete != null) { // L: 12139
						var8 = new ScriptEvent(); // L: 12140
						var8.widget = clickedWidget; // L: 12141
						var8.mouseX = var6; // L: 12142
						var8.mouseY = var7; // L: 12143
						var8.dragTarget = draggedOnWidget; // L: 12144
						var8.args = clickedWidget.onDragComplete; // L: 12145
						class157.runScriptEvent(var8); // L: 12146
					}

					if (draggedOnWidget != null && class227.method4434(clickedWidget) != null) { // L: 12148
						PacketBufferNode var9 = class113.getPacketBufferNode(ClientPacket.field3146, packetWriter.isaacCipher); // L: 12150
						var9.packetBuffer.method9299(clickedWidget.itemId); // L: 12151
						var9.packetBuffer.method9300(draggedOnWidget.childIndex); // L: 12152
						var9.packetBuffer.writeIntME(clickedWidget.id); // L: 12153
						var9.packetBuffer.writeInt(draggedOnWidget.id); // L: 12154
						var9.packetBuffer.method9299(clickedWidget.childIndex); // L: 12155
						var9.packetBuffer.method9300(draggedOnWidget.itemId); // L: 12156
						packetWriter.addNode(var9); // L: 12157
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 12161
					this.openMenu(field533 + widgetClickX, field679 + widgetClickY); // L: 12162
				} else if (menuOptionsCount > 0) { // L: 12164
					method1847(widgetClickX + field533, field679 + widgetClickY); // L: 12165
				}

				clickedWidget = null; // L: 12168
			}

		} else {
			if (class148.widgetDragDuration > 1) { // L: 12103
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 12104
					method1847(widgetClickX + field533, widgetClickY + field679); // L: 12105
				}

				clickedWidget = null; // L: 12107
			}

		}
	} // L: 12109 12170

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(I)Lvj;",
		garbageValue = "-1748725154"
	)
	@Export("username")
	public Username username() {
		return class229.localPlayer != null ? class229.localPlayer.username : null; // L: 12879
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1572672090"
	)
	void method1294(int var1) {
		if (field492 >= 216) { // L: 12984
			PacketBufferNode var2 = class113.getPacketBufferNode(ClientPacket.field3190, packetWriter.isaacCipher); // L: 12985
			var2.packetBuffer.writeByte(var1); // L: 12986
			packetWriter.addNode(var2); // L: 12987
		}

	} // L: 12989

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1728239313"
	)
	void method1295(int var1) {
		if (field492 >= 216) { // L: 12992
			PacketBufferNode var2 = class113.getPacketBufferNode(ClientPacket.field3151, packetWriter.isaacCipher); // L: 12993
			var2.packetBuffer.writeByte(var1); // L: 12994
			packetWriter.addNode(var2); // L: 12995
		}

	} // L: 12997

	public final void init() {
		try {
			if (this.checkHost()) { // L: 769
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 770
					String var2 = this.getParameter(Integer.toString(var1)); // L: 771
					if (var2 != null) { // L: 772
						switch(var1) { // L: 773
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 794
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 795
							}
							break;
						case 4:
							if (clientType == -1) { // L: 776
								clientType = Integer.parseInt(var2); // L: 777
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 837
							break; // L: 838
						case 6:
							class85.clientLanguage = Language.method7190(Integer.parseInt(var2)); // L: 789
							break; // L: 790
						case 7:
							int var4 = Integer.parseInt(var2); // L: 865
							GameBuild[] var5 = class13.method173(); // L: 868
							int var6 = 0;

							GameBuild var8;
							while (true) {
								if (var6 >= var5.length) {
									var8 = null; // L: 879
									break;
								}

								GameBuild var7 = var5[var6]; // L: 870
								if (var4 == var7.buildId) { // L: 872
									var8 = var7; // L: 873
									break; // L: 874
								}

								++var6; // L: 869
							}

							class191.field1978 = var8; // L: 881
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 783
							}
							break;
						case 9:
							MenuAction.field878 = var2; // L: 815
							break; // L: 816
						case 10:
							Messages.field1401 = (StudioGame)class12.findEnumerated(VerticalAlignment.method3755(), Integer.parseInt(var2)); // L: 830
							if (Messages.field1401 == StudioGame.oldscape) { // L: 831
								class89.loginType = LoginType.oldscape;
							} else {
								class89.loginType = LoginType.field5027; // L: 832
							}
							break;
						case 11:
							class314.field3401 = var2; // L: 800
							break; // L: 801
						case 12:
							worldId = Integer.parseInt(var2); // L: 842
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 23:
						case 24:
						default:
							break;
						case 14:
							DevicePcmPlayerProvider.field111 = Integer.parseInt(var2); // L: 847
							break; // L: 848
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 810
							break; // L: 811
						case 17:
							class228.field2415 = var2; // L: 820
							break; // L: 821
						case 21:
							field488 = Integer.parseInt(var2); // L: 825
							break; // L: 826
						case 22:
							FriendsChatManager.field4677 = var2; // L: 805
							break; // L: 806
						case 25:
							int var3 = var2.indexOf("."); // L: 852
							if (var3 == -1) { // L: 853
								field492 = Integer.parseInt(var2); // L: 854
							} else {
								field492 = Integer.parseInt(var2.substring(0, var3)); // L: 857
								Integer.parseInt(var2.substring(var3 + 1)); // L: 858
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false; // L: 888
				isLowDetail = false; // L: 889
				Friend.worldHost = this.getCodeBase().getHost(); // L: 891
				WorldMapSectionType.field2556 = new class371(); // L: 892
				String var9 = class191.field1978.name; // L: 893
				byte var10 = 0; // L: 894
				if ((worldProperties & class522.field5109.rsOrdinal()) != 0) { // L: 895
					ItemLayer.field2655 = "beta"; // L: 896
				}

				try {
					class339.method6310("oldschool", ItemLayer.field2655, var9, var10, 23); // L: 899
				} catch (Exception var12) { // L: 901
					GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var12); // L: 902
				}

				SpriteMask.client = this; // L: 904
				RunException.field5299 = clientType; // L: 905
				Messages.field1402 = System.getenv("JX_ACCESS_TOKEN"); // L: 907
				ObjectComposition.field2126 = System.getenv("JX_REFRESH_TOKEN"); // L: 908
				class369.field4299 = System.getenv("JX_SESSION_ID"); // L: 909
				InterfaceParent.field1046 = System.getenv("JX_CHARACTER_ID"); // L: 910
				String var14 = System.getenv("JX_DISPLAY_NAME"); // L: 911
				String var11;
				if (var14 != null && !var14.isEmpty() && var14.charAt(0) != '#') { // L: 915
					var11 = var14; // L: 919
				} else {
					var11 = ""; // L: 916
				}

				Login.field917 = var11; // L: 921
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 924
					this.field532 = true; // L: 925
				}

				if (field490 == -1) { // L: 927
					if (!this.method1351() && !this.method1267()) { // L: 928
						field490 = 0; // L: 932
					} else {
						field490 = 5; // L: 929
					}
				}

				this.startThread(765, 503, 218, 1); // L: 935
			}
		} catch (RuntimeException var13) {
			throw CollisionMap.newRunException(var13, "client.init(" + ')');
		}
	} // L: 936

	protected void finalize() throws Throwable {
		InterfaceParent.method2353(this); // L: 940
		super.finalize(); // L: 941
	} // L: 942

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 957
			this.field530 = var1; // L: 960
			UserComparator7.method2966(10); // L: 961
		}
	} // L: 958 962

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 967
			this.field535 = var1; // L: 970
		}
	} // L: 968 971

	public long getAccountHash() {
		return this.accountHash; // L: 981
	}

	public void setClient(int var1) {
		this.field545 = var1; // L: 951
	} // L: 952

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 976
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luo;B)I",
		garbageValue = "80"
	)
	static int method1394(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 438
		int var2;
		if (var1 == 0) { // L: 440
			var2 = 0;
		} else if (var1 == 1) { // L: 441
			var2 = var0.readBits(5);
		} else if (var1 == 2) { // L: 442
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 443
		}

		return var2; // L: 444
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "743374996"
	)
	public static void method1848() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 192
		HitSplatDefinition.field2053.clear(); // L: 193
		HitSplatDefinition.field2054.clear(); // L: 194
	} // L: 195

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2100775885"
	)
	static void method1847(int var0, int var1) {
		class59.method1177(class174.tempMenuAction, var0, var1); // L: 12184
		class174.tempMenuAction = null; // L: 12185
	} // L: 12186
}
