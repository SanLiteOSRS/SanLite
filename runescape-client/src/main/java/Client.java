import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class325 {
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = 1025060263
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vp")
	@ObfuscatedGetter(
		intValue = 441278609
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = -550294613
	)
	public static int field814;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	static final class232 field816;
	@ObfuscatedName("xx")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	static final ApproximateRouteStrategy field643;
	@ObfuscatedName("xo")
	static int[] field821;
	@ObfuscatedName("xu")
	static int[] field637;
	@ObfuscatedName("wu")
	@ObfuscatedGetter(
		intValue = 2042036807
	)
	static int field805;
	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("ww")
	@ObfuscatedGetter(
		intValue = 1362741755
	)
	static int field806;
	@ObfuscatedName("wc")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("xp")
	@ObfuscatedGetter(
		intValue = -72664761
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("vt")
	static int[] field707;
	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "[Log;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("xy")
	@ObfuscatedGetter(
		intValue = 521838813
	)
	static int field819;
	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	static class490 field737;
	@ObfuscatedName("vm")
	static short field791;
	@ObfuscatedName("vc")
	static short field792;
	@ObfuscatedName("vv")
	static short field594;
	@ObfuscatedName("vo")
	static short field798;
	@ObfuscatedName("vy")
	static short field662;
	@ObfuscatedName("vx")
	@ObfuscatedGetter(
		intValue = 352410347
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vw")
	static short field795;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = 1587678989
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = -1695078929
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vq")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vs")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("wz")
	static List field815;
	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static class438 field810;
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("ws")
	@ObfuscatedGetter(
		intValue = -949581313
	)
	static int field587;
	@ObfuscatedName("bq")
	static boolean field536;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1845111543
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -678916321
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1141159649
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cg")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cq")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 190783413
	)
	static int field717;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1953789213
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1843463469
	)
	static int field525;
	@ObfuscatedName("cs")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -34504981
	)
	public static int field527;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -536970535
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("ds")
	static boolean field615;
	@ObfuscatedName("eo")
	static boolean field531;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 1478401101
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		longValue = 1781940677952610751L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -1636995889
	)
	static int field652;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -448589971
	)
	static int field597;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		longValue = 4950206723942446097L
	)
	static long field708;
	@ObfuscatedName("ek")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 1975774047
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 1931950625
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 2139633527
	)
	static int field540;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 2061765689
	)
	static int field541;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -1088840979
	)
	static int field583;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 1552857465
	)
	static int field543;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 1648916966
	)
	static int field544;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -921682624
	)
	static int field629;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -1057122752
	)
	static int field797;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ey")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	static class94 field577;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = -1477389957
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = -1208586899
	)
	static int field552;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 178361339
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -2050897657
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 41305447
	)
	static int field555;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = -1259040265
	)
	static int field732;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 714300877
	)
	static int field557;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static class141 field558;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	static class534 field559;
	@ObfuscatedName("ha")
	static final String field570;
	@ObfuscatedName("hh")
	static final String field571;
	@ObfuscatedName("hr")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("im")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "[Ldc;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = 1607562291
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("if")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -614171483
	)
	static int field581;
	@ObfuscatedName("ib")
	static int[] field533;
	@ObfuscatedName("it")
	static String field772;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = 1835674189
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ip")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("ji")
	static HashMap field636;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1965397131
	)
	static int field588;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 596527587
	)
	static int field589;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -1395552755
	)
	static int field590;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 335846101
	)
	static int field591;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 415283483
	)
	static int field545;
	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "[Lih;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jb")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jg")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("km")
	static final int[] field596;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 596305001
	)
	static int field709;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 1285310077
	)
	static int field598;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = -1186719255
	)
	static int field801;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -1019436009
	)
	static int field556;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -504922113
	)
	static int field601;
	@ObfuscatedName("kv")
	static boolean field582;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -2037781071
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -1872737735
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -1380774171
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -2065740293
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1633491125
	)
	static int field678;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -1725957457
	)
	static int field682;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -1381138387
	)
	static int field608;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -848420063
	)
	static int field609;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 197447207
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 597336379
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 1398857067
	)
	static int field612;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 683276725
	)
	static int field613;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -1676940483
	)
	static int field614;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -199987921
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -4178743
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 1998035387
	)
	public static int field547;
	@ObfuscatedName("le")
	static boolean field618;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = 261421435
	)
	static int field619;
	@ObfuscatedName("ln")
	static boolean field550;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -452116849
	)
	static int field621;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -1011934611
	)
	static int field617;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -118095121
	)
	static int field807;
	@ObfuscatedName("mi")
	static int[] field624;
	@ObfuscatedName("ma")
	static int[] field625;
	@ObfuscatedName("mj")
	static int[] field626;
	@ObfuscatedName("mm")
	static int[] field627;
	@ObfuscatedName("mc")
	static int[] field628;
	@ObfuscatedName("mw")
	static int[] field824;
	@ObfuscatedName("mx")
	static int[][] field630;
	@ObfuscatedName("mr")
	static int[] field733;
	@ObfuscatedName("mt")
	static String[] field632;
	@ObfuscatedName("mf")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 1268729305
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -954692081
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -53982227
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 445764083
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = -536149059
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = 800686561
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -1358084465
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("ms")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = -251513165
	)
	static int field790;
	@ObfuscatedName("my")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "[Ldj;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -505989115
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = 1142496111
	)
	static int field646;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		longValue = 4613200119782930099L
	)
	static long field538;
	@ObfuscatedName("nv")
	static boolean field648;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -1279467103
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 344108283
	)
	static int field650;
	@ObfuscatedName("nc")
	static int[] field651;
	@ObfuscatedName("nk")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("nn")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("na")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nh")
	static int[] field655;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = 1612926111
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "[[[Lpf;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nr")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("ne")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nq")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ng")
	static boolean field745;
	@ObfuscatedName("np")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -1679392067
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("oe")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("ob")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ok")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("ou")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("om")
	static int[] field671;
	@ObfuscatedName("oo")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ox")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("oc")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("oz")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("op")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ov")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -235410389
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = 1491278035
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1350255941
	)
	static int field788;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 910505255
	)
	static int field530;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 134903783
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("pc")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = 490485615
	)
	static int field585;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -1680657639
	)
	static int field686;
	@ObfuscatedName("ph")
	static String field751;
	@ObfuscatedName("ps")
	static String field688;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -702019829
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = -838666147
	)
	static int field691;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = 1703110501
	)
	static int field692;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -766426161
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -1040295617
	)
	static int field695;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 574925483
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = -1216858893
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = -1202113569
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pe")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -1707638011
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 102610401
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("qw")
	static boolean field647;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -1189995383
	)
	static int field750;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -1811446391
	)
	static int field748;
	@ObfuscatedName("qm")
	static boolean field685;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = -1866235119
	)
	static int field554;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = 1207332227
	)
	static int field711;
	@ObfuscatedName("qn")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = 3592763
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qy")
	static int[] field716;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 456212605
	)
	static int field631;
	@ObfuscatedName("qv")
	static int[] field676;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -60781103
	)
	static int field602;
	@ObfuscatedName("qs")
	static int[] field718;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = -197182683
	)
	static int field605;
	@ObfuscatedName("qe")
	static int[] field720;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -1079499457
	)
	static int field721;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = 482337689
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 1351992329
	)
	static int field723;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = -1504198831
	)
	static int field710;
	@ObfuscatedName("rl")
	@ObfuscatedGetter(
		intValue = -2036430613
	)
	static int field642;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = -9738657
	)
	static int field517;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -1041356011
	)
	static int field727;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = 656160353
	)
	static int field744;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = 1573332305
	)
	static int field729;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = -473358783
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	static class547 field785;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	static NodeDeque field542;
	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	static NodeDeque field734;
	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	static NodeDeque field534;
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -2037831695
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 327497997
	)
	static int field738;
	@ObfuscatedName("ro")
	static boolean[] field739;
	@ObfuscatedName("rd")
	static boolean[] field735;
	@ObfuscatedName("rb")
	static boolean[] field677;
	@ObfuscatedName("rz")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rg")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("sz")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("sr")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = -627973459
	)
	static int field719;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		longValue = 3140104511378205691L
	)
	static long field700;
	@ObfuscatedName("sl")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sy")
	static int[] field749;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 288886593
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = 240907527
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sb")
	static String field752;
	@ObfuscatedName("se")
	static long[] field753;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 759544711
	)
	static int field754;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	static class226 field755;
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	static class224 field756;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = -623625213
	)
	static int field757;
	@ObfuscatedName("so")
	static int[] field661;
	@ObfuscatedName("sc")
	static int[] field759;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		longValue = 7564198371908948165L
	)
	static long field760;
	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "[Lgb;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("tm")
	@ObfuscatedGetter(
		intValue = 188633027
	)
	static int field763;
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = 902990863
	)
	static int field599;
	@ObfuscatedName("tf")
	static int[] field765;
	@ObfuscatedName("ts")
	static int[] field766;
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	static SpritePixels[] field767;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = 755346193
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = -19262227
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = -1790146335
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tk")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = 858023415
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("uq")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ug")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("uu")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("ua")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "[Lbr;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("ub")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("uk")
	static boolean field779;
	@ObfuscatedName("uh")
	static boolean field780;
	@ObfuscatedName("uw")
	static boolean field781;
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	static class494 field782;
	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static class493 field783;
	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static class493 field784;
	@ObfuscatedName("ue")
	static boolean field726;
	@ObfuscatedName("vf")
	static boolean[] field786;
	@ObfuscatedName("vj")
	static int[] field787;
	@ObfuscatedName("vu")
	static int[] field680;
	@ObfuscatedName("ve")
	static int[] field789;
	@ObfuscatedName("hi")
	String field560;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	class14 field697;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	class18 field562;
	@ObfuscatedName("hy")
	OtlTokenRequester field563;
	@ObfuscatedName("hl")
	Future field740;
	@ObfuscatedName("hm")
	boolean field565;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = -1980265847
	)
	int field566;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	class18 field567;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field568;
	@ObfuscatedName("hn")
	Future field607;
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	Buffer field764;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	class7 field575;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		longValue = 5776892925694285285L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field536 = true; // L: 163
		worldId = 1; // L: 164
		worldProperties = 0; // L: 165
		gameBuild = 0; // L: 167
		isMembersWorld = false; // L: 170
		isLowDetail = false; // L: 171
		field717 = -1; // L: 176
		clientType = -1; // L: 177
		field525 = -1; // L: 178
		onMobile = false; // L: 179
		field527 = 217; // L: 180
		gameState = 0; // L: 192
		field615 = false; // L: 193
		field531 = true; // L: 217
		cycle = 0; // L: 218
		mouseLastLastPressedTimeMillis = 1L; // L: 219
		field652 = -1; // L: 221
		field597 = -1; // L: 222
		field708 = -1L; // L: 223
		hadFocus = true; // L: 224
		rebootTimer = 0; // L: 225
		hintArrowType = 0; // L: 226
		field540 = 0; // L: 227
		field541 = 0; // L: 228
		field583 = 0; // L: 229
		field543 = 0; // L: 230
		field544 = 0; // L: 231
		field629 = 0; // L: 232
		field797 = 0; // L: 233
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 235
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 236
		renderSelf = false; // L: 238
		field577 = class94.field1161; // L: 247
		js5ConnectState = 0; // L: 250
		field552 = 0; // L: 251
		js5Errors = 0; // L: 275
		loginState = 0; // L: 277
		field555 = 0; // L: 278
		field732 = 0; // L: 279
		field557 = 0; // L: 280
		field558 = class141.field1630; // L: 281
		field559 = class534.field5199; // L: 282
		int var1 = "com_jagex_auth_desktop_osrs:public".length(); // L: 310
		byte[] var2 = new byte[var1]; // L: 311

		for (int var3 = 0; var3 < var1; ++var3) { // L: 312
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3); // L: 313
			if (var4 > 127) { // L: 314
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 315
			}
		}

		field570 = class233.method4421(var2); // L: 319
		field571 = class233.method4421(FriendSystem.method1945("com_jagex_auth_desktop_runelite:public")); // L: 322
		Login_isUsernameRemembered = false; // L: 336
		secureRandomFuture = new SecureRandomFuture(); // L: 337
		randomDatData = null; // L: 343
		npcs = new NPC[65536]; // L: 347
		npcCount = 0; // L: 348
		npcIndices = new int[65536]; // L: 349
		field581 = 0; // L: 350
		field533 = new int[250]; // L: 351
		packetWriter = new PacketWriter(); // L: 354
		logoutTimer = 0; // L: 356
		hadNetworkError = false; // L: 357
		timer = new Timer(); // L: 358
		field636 = new HashMap(); // L: 364
		field588 = 0; // L: 371
		field589 = 1; // L: 372
		field590 = 0; // L: 373
		field591 = 1; // L: 374
		field545 = 0; // L: 375
		collisionMaps = new CollisionMap[4]; // L: 383
		isInInstance = false; // L: 384
		instanceChunkTemplates = new int[4][13][13]; // L: 385
		field596 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 386
		field709 = 0; // L: 389
		field598 = 2301979; // L: 401
		field801 = 5063219; // L: 402
		field556 = 3353893; // L: 403
		field601 = 7759444; // L: 404
		field582 = false; // L: 405
		alternativeScrollbarWidth = 0; // L: 406
		camAngleX = 128; // L: 414
		camAngleY = 0; // L: 415
		field678 = 0; // L: 416
		field682 = 0; // L: 417
		field608 = 0; // L: 418
		field609 = 0; // L: 419
		oculusOrbState = 0; // L: 420
		camFollowHeight = 50; // L: 421
		field612 = 0; // L: 425
		field613 = 0; // L: 426
		field614 = 0; // L: 427
		oculusOrbNormalSpeed = 12; // L: 429
		oculusOrbSlowedSpeed = 6; // L: 430
		field547 = 0; // L: 431
		field618 = false; // L: 432
		field619 = 0; // L: 433
		field550 = false; // L: 434
		field621 = 0; // L: 435
		field617 = 0; // L: 436
		field807 = 50; // L: 437
		field624 = new int[field807]; // L: 438
		field625 = new int[field807]; // L: 439
		field626 = new int[field807]; // L: 440
		field627 = new int[field807]; // L: 441
		field628 = new int[field807]; // L: 442
		field824 = new int[field807]; // L: 443
		field630 = new int[field807][]; // L: 444
		field733 = new int[field807]; // L: 445
		field632 = new String[field807]; // L: 446
		tileLastDrawnActor = new int[104][104]; // L: 447
		viewportDrawCount = 0; // L: 448
		viewportTempX = -1; // L: 449
		viewportTempY = -1; // L: 450
		mouseCrossX = 0; // L: 451
		mouseCrossY = 0; // L: 452
		mouseCrossState = 0; // L: 453
		mouseCrossColor = 0; // L: 454
		showMouseCross = true; // L: 455
		field790 = 0; // L: 456
		showLoadingMessages = true; // L: 458
		players = new Player[2048]; // L: 460
		localPlayerIndex = -1; // L: 462
		field646 = 0; // L: 463
		field538 = -1L; // L: 464
		field648 = true; // L: 466
		drawPlayerNames = 0; // L: 471
		field650 = 0; // L: 472
		field651 = new int[1000]; // L: 473
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 475
		playerMenuActions = new String[8]; // L: 476
		playerOptionsPriorities = new boolean[8]; // L: 477
		field655 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 478
		combatTargetPlayerIndex = -1; // L: 479
		groundItems = new NodeDeque[4][104][104]; // L: 480
		pendingSpawns = new NodeDeque(); // L: 481
		projectiles = new NodeDeque(); // L: 482
		graphicsObjects = new NodeDeque(); // L: 483
		currentLevels = new int[25]; // L: 484
		levels = new int[25]; // L: 485
		experience = new int[25]; // L: 486
		field745 = false; // L: 487
		isMenuOpen = false; // L: 488
		menuOptionsCount = 0; // L: 494
		menuArguments1 = new int[500]; // L: 495
		menuArguments2 = new int[500]; // L: 496
		menuOpcodes = new int[500]; // L: 497
		menuIdentifiers = new int[500]; // L: 498
		field671 = new int[500]; // L: 499
		menuActions = new String[500]; // L: 500
		menuTargets = new String[500]; // L: 501
		menuShiftClick = new boolean[500]; // L: 502
		followerOpsLowPriority = false; // L: 503
		tapToDrop = false; // L: 505
		showMouseOverText = true; // L: 506
		viewportX = -1; // L: 507
		viewportY = -1; // L: 508
		field788 = 0; // L: 512
		field530 = 50; // L: 513
		isItemSelected = 0; // L: 514
		field772 = null; // L: 518
		isSpellSelected = false; // L: 519
		field585 = -1; // L: 521
		field686 = -1; // L: 522
		field751 = null; // L: 524
		field688 = null; // L: 525
		rootInterface = -1; // L: 526
		interfaceParents = new NodeHashTable(8); // L: 527
		field691 = 0; // L: 532
		field692 = -1; // L: 533
		chatEffects = 0; // L: 534
		meslayerContinueWidget = null; // L: 535
		field695 = 0; // L: 536
		weight = 0; // L: 537
		staffModLevel = 0; // L: 538
		followerIndex = -1; // L: 539
		playerMod = false; // L: 540
		viewportWidget = null; // L: 541
		clickedWidget = null; // L: 542
		clickedWidgetParent = null; // L: 543
		widgetClickX = 0; // L: 544
		widgetClickY = 0; // L: 545
		draggedOnWidget = null; // L: 546
		field647 = false; // L: 547
		field750 = -1; // L: 548
		field748 = -1; // L: 549
		field685 = false; // L: 550
		field554 = -1; // L: 551
		field711 = -1; // L: 552
		isDraggingWidget = false; // L: 553
		cycleCntr = 1; // L: 558
		field716 = new int[32]; // L: 561
		field631 = 0; // L: 562
		field676 = new int[32]; // L: 563
		field602 = 0; // L: 564
		field718 = new int[32]; // L: 565
		field605 = 0; // L: 566
		field720 = new int[32]; // L: 567
		field721 = 0; // L: 568
		chatCycle = 0; // L: 569
		field723 = 0; // L: 570
		field710 = 0; // L: 571
		field642 = 0; // L: 572
		field517 = 0; // L: 573
		field727 = 0; // L: 574
		field744 = 0; // L: 575
		field729 = 0; // L: 576
		mouseWheelRotation = 0; // L: 582
		field785 = new class547(); // L: 583
		scriptEvents = new NodeDeque(); // L: 584
		field542 = new NodeDeque(); // L: 585
		field734 = new NodeDeque(); // L: 586
		field534 = new NodeDeque(); // L: 587
		widgetFlags = new NodeHashTable(512); // L: 588
		rootWidgetCount = 0; // L: 590
		field738 = -2; // L: 591
		field739 = new boolean[100]; // L: 592
		field735 = new boolean[100]; // L: 593
		field677 = new boolean[100]; // L: 594
		rootWidgetXs = new int[100]; // L: 595
		rootWidgetYs = new int[100]; // L: 596
		rootWidgetWidths = new int[100]; // L: 597
		rootWidgetHeights = new int[100]; // L: 598
		field719 = 0; // L: 599
		field700 = 0L; // L: 600
		isResizable = true; // L: 601
		field749 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 608
		publicChatMode = 0; // L: 609
		tradeChatMode = 0; // L: 611
		field752 = ""; // L: 612
		field753 = new long[100]; // L: 614
		field754 = 0; // L: 615
		field755 = new class226(); // L: 616
		field756 = new class224(); // L: 617
		field757 = 0; // L: 619
		field661 = new int[128]; // L: 620
		field759 = new int[128]; // L: 621
		field760 = -1L; // L: 622
		currentClanSettings = new ClanSettings[4]; // L: 626
		currentClanChannels = new ClanChannel[4]; // L: 628
		field763 = -1; // L: 630
		field599 = 0; // L: 631
		field765 = new int[1000]; // L: 632
		field766 = new int[1000]; // L: 633
		field767 = new SpritePixels[1000]; // L: 634
		destinationX = 0; // L: 635
		destinationY = 0; // L: 636
		minimapState = 0; // L: 643
		playingJingle = false; // L: 644
		soundEffectCount = 0; // L: 649
		soundEffectIds = new int[50]; // L: 650
		queuedSoundEffectLoops = new int[50]; // L: 651
		queuedSoundEffectDelays = new int[50]; // L: 652
		soundLocations = new int[50]; // L: 653
		soundEffects = new SoundEffect[50]; // L: 654
		isCameraLocked = false; // L: 656
		field779 = false; // L: 662
		field780 = false; // L: 663
		field781 = false; // L: 664
		field782 = null; // L: 670
		field783 = null; // L: 671
		field784 = null; // L: 672
		field726 = false; // L: 673
		field786 = new boolean[5]; // L: 681
		field787 = new int[5]; // L: 682
		field680 = new int[5]; // L: 683
		field789 = new int[5]; // L: 684
		field707 = new int[5]; // L: 685
		field791 = 256; // L: 686
		field792 = 205; // L: 687
		zoomHeight = 256; // L: 688
		zoomWidth = 320; // L: 689
		field795 = 1; // L: 690
		field662 = 32767; // L: 691
		field594 = 1; // L: 692
		field798 = 32767; // L: 693
		viewportOffsetX = 0; // L: 694
		viewportOffsetY = 0; // L: 695
		viewportWidth = 0; // L: 696
		viewportHeight = 0; // L: 697
		viewportZoom = 0; // L: 698
		playerAppearance = new PlayerComposition(); // L: 700
		field805 = -1; // L: 701
		field806 = -1; // L: 702
		field737 = new DesktopPlatformInfoProvider(); // L: 704
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 706
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 709
		field810 = new class438(8, class436.field4651); // L: 711
		Widget_cachedModels = new EvictingDualNodeHashTable(64); // L: 713
		Widget_cachedFonts = new EvictingDualNodeHashTable(64); // L: 714
		field587 = -1; // L: 717
		field814 = -1; // L: 723
		field815 = new ArrayList(); // L: 724
		field816 = new class232(); // L: 725
		archiveLoaders = new ArrayList(10); // L: 726
		archiveLoadersDone = 0; // L: 727
		field819 = 0; // L: 728
		field643 = new ApproximateRouteStrategy(); // L: 737
		field821 = new int[50]; // L: 738
		field637 = new int[50]; // L: 739
	}

	public Client() {
		this.field565 = false; // L: 300
		this.field566 = 0; // L: 301
		this.accountHash = -1L; // L: 342
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-953371865"
	)
	protected final void vmethod1746() {
		field700 = GrandExchangeOfferTotalQuantityComparator.method7049() + 500L; // L: 4640
		this.resizeJS(); // L: 4641
		if (rootInterface != -1) { // L: 4642
			this.method1340(true);
		}

	} // L: 4643

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-84"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000}; // L: 1021
		int[] var2 = new int[]{1000, 100, 500}; // L: 1022
		if (var1 != null && var2 != null) { // L: 1024
			ByteArrayPool.ByteArrayPool_alternativeSizes = var1; // L: 1037
			class425.ByteArrayPool_altSizeArrayCounts = new int[var1.length]; // L: 1038
			KeyHandler.ByteArrayPool_arrays = new byte[var1.length][][]; // L: 1039

			for (int var3 = 0; var3 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var3) { // L: 1040
				KeyHandler.ByteArrayPool_arrays[var3] = new byte[var2[var3]][]; // L: 1041
				ByteArrayPool.field4591.add(var1[var3]); // L: 1042
			}

			Collections.sort(ByteArrayPool.field4591); // L: 1044
		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null; // L: 1025
			class425.ByteArrayPool_altSizeArrayCounts = null; // L: 1026
			KeyHandler.ByteArrayPool_arrays = null; // L: 1027
			ByteArrayPool.field4591.clear(); // L: 1029
			ByteArrayPool.field4591.add(100); // L: 1030
			ByteArrayPool.field4591.add(5000); // L: 1031
			ByteArrayPool.field4591.add(10000); // L: 1032
			ByteArrayPool.field4591.add(30000); // L: 1033
		}

		ObjectComposition.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 1046
		class363.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 1047
		class164.currentPort = ObjectComposition.worldPort; // L: 1048
		PlayerComposition.field3615 = class345.field3664; // L: 1049
		class104.field1342 = class345.field3660; // L: 1050
		Coord.field3572 = class345.field3661; // L: 1051
		class33.field187 = class345.field3663; // L: 1052
		AbstractWorldMapIcon.urlRequester = new class115(this.field565, 217); // L: 1053
		this.setUpKeyboard(); // L: 1055
		this.method552(); // L: 1056
		class493.mouseWheel = this.mouseWheel(); // L: 1057
		this.method488(field756, 0); // L: 1058
		this.method488(field755, 1); // L: 1059
		this.setUpClipboard(); // L: 1060
		UserComparator10.field1480 = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 1062
		class91.clientPreferences = class420.method7759(); // L: 1063
		class416.method7746(this, GraphicsObject.field888); // L: 1064
		NPCComposition.setWindowedMode(class91.clientPreferences.method2525()); // L: 1065
		InvDefinition.friendSystem = new FriendSystem(class166.loginType); // L: 1066
		this.field697 = new class14("tokenRequest", 1, 1); // L: 1067
		WorldMapIcon_1.method5236(this); // L: 1068
		field816.method4389(); // L: 1069
	} // L: 1070

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-800201684"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 1078
		this.doCycleJs5(); // L: 1079
		Skills.method6794(); // L: 1080
		boolean var1 = CollisionMap.method4325(); // L: 1081
		if (var1 && playingJingle && class171.pcmPlayer1 != null) { // L: 1082 1083
			class171.pcmPlayer1.tryDiscard();
		}

		class313.method5891(); // L: 1085
		field755.method4250(); // L: 1086
		this.method539(); // L: 1087
		synchronized(MouseHandler.MouseHandler_instance) { // L: 1089
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1090
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1091
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1092
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1093
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1094
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1095
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1096
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1097
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1098
		} // L: 1099

		if (class493.mouseWheel != null) { // L: 1101
			int var4 = class493.mouseWheel.useRotation(); // L: 1102
			mouseWheelRotation = var4; // L: 1103
		}

		if (gameState == 0) { // L: 1105
			class314.method5896(); // L: 1106
			class19.method283(); // L: 1107
		} else if (gameState == 5) { // L: 1109
			WorldMapManager.method5506(this, class14.field80, UserComparator6.fontPlain12); // L: 1110
			class314.method5896(); // L: 1111
			class19.method283(); // L: 1112
		} else if (gameState != 10 && gameState != 11) { // L: 1114
			if (gameState == 20) { // L: 1115
				WorldMapManager.method5506(this, class14.field80, UserComparator6.fontPlain12); // L: 1116
				this.doCycleLoggedOut(); // L: 1117
			} else if (gameState == 50) { // L: 1119
				WorldMapManager.method5506(this, class14.field80, UserComparator6.fontPlain12); // L: 1120
				this.doCycleLoggedOut(); // L: 1121
			} else if (gameState == 25) { // L: 1123
				Occluder.method4858();
			}
		} else {
			WorldMapManager.method5506(this, class14.field80, UserComparator6.fontPlain12);
		}

		if (gameState == 30) { // L: 1124
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1125
			this.doCycleLoggedOut();
		}

	} // L: 1126

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "40"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && field700 != 0L && GrandExchangeOfferTotalQuantityComparator.method7049() > field700) { // L: 1130 1131
			NPCComposition.setWindowedMode(class178.getWindowedMode()); // L: 1132
		}

		int var2;
		if (var1) { // L: 1135
			for (var2 = 0; var2 < 100; ++var2) { // L: 1136
				field739[var2] = true;
			}
		}

		if (gameState == 0) { // L: 1138
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1139
			class367.drawTitle(SoundCache.fontBold12, class14.field80, UserComparator6.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1140
			if (gameState == 20) { // L: 1141
				class367.drawTitle(SoundCache.fontBold12, class14.field80, UserComparator6.fontPlain12);
			} else if (gameState == 50) { // L: 1142
				class367.drawTitle(SoundCache.fontBold12, class14.field80, UserComparator6.fontPlain12);
			} else if (gameState == 25) { // L: 1143
				if (field545 == 1) { // L: 1144
					if (field588 > field589) { // L: 1145
						field589 = field588;
					}

					var2 = (field589 * 50 - field588 * 50) / field589; // L: 1146
					class427.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1147
				} else if (field545 == 2) { // L: 1149
					if (field590 > field591) { // L: 1150
						field591 = field590;
					}

					var2 = (field591 * 50 - field590 * 50) / field591 + 50; // L: 1151
					class427.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false); // L: 1152
				} else {
					class427.drawLoadingMessage("Loading - please wait.", false); // L: 1154
				}
			} else if (gameState == 30) { // L: 1156
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1157
				class427.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1158
				class427.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class367.drawTitle(SoundCache.fontBold12, class14.field80, UserComparator6.fontPlain12); // L: 1148
		}

		if (gameState == 30 && field719 == 0 && !var1 && !isResizable) { // L: 1159
			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1160
				if (field735[var2]) { // L: 1161
					class223.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]); // L: 1162
					field735[var2] = false; // L: 1163
				}
			}
		} else if (gameState > 0) { // L: 1167
			class223.rasterProvider.drawFull(0, 0); // L: 1168

			for (var2 = 0; var2 < rootWidgetCount; ++var2) { // L: 1169
				field735[var2] = false;
			}
		}

	} // L: 1171

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1875481219"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class33.varcs.hasUnwrittenChanges()) { // L: 1174
			class33.varcs.write();
		}

		if (class233.mouseRecorder != null) { // L: 1175
			class233.mouseRecorder.isRunning = false;
		}

		class233.mouseRecorder = null; // L: 1176
		packetWriter.close(); // L: 1177
		BufferedSink.method8239(); // L: 1178
		class493.mouseWheel = null; // L: 1179
		if (class171.pcmPlayer1 != null) { // L: 1180
			class171.pcmPlayer1.shutdown();
		}

		class59.field452.method7008(); // L: 1181
		WorldMapDecorationType.method6792(); // L: 1182
		if (AbstractWorldMapIcon.urlRequester != null) { // L: 1183
			AbstractWorldMapIcon.urlRequester.close(); // L: 1184
			AbstractWorldMapIcon.urlRequester = null; // L: 1185
		}

		HealthBar.method2615(); // L: 1187
		this.field697.method175(); // L: 1188
	} // L: 1189

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "390692392"
	)
	protected final void vmethod1244() {
	} // L: 746

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "28669"
	)
	boolean method1246() {
		return this.field566 == 1; // L: 918
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-83"
	)
	boolean method1768() {
		return class467.field4804 != null && !class467.field4804.trim().isEmpty() && class191.field1917 != null && !class191.field1917.trim().isEmpty(); // L: 958
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1137874919"
	)
	boolean method1248() {
		return LoginScreenAnimation.field1283 != null && !LoginScreenAnimation.field1283.trim().isEmpty() && class155.field1698 != null && !class155.field1698.trim().isEmpty(); // L: 962
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("isOtlTokenRequesterInitialized")
	boolean isOtlTokenRequesterInitialized() {
		return this.field563 != null; // L: 966
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-10"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 970
		var2.put("grant_type", "refresh_token"); // L: 971
		var2.put("scope", "gamesso.token.create"); // L: 972
		var2.put("refresh_token", var1); // L: 973
		URL var3 = new URL(class59.field453 + "shield/oauth/token" + (new class478(var2)).method8510()); // L: 974
		class434 var4 = new class434(); // L: 975
		if (this.method1246()) { // L: 976
			var4.method7865(field571); // L: 977
		} else {
			var4.method7865(field570); // L: 980
		}

		var4.method7893("Host", (new URL(class59.field453)).getHost()); // L: 982
		var4.method7870(class475.field4818); // L: 983
		class9 var5 = class9.field41; // L: 984
		RefreshAccessTokenRequester var6 = this.field568; // L: 985
		if (var6 != null) { // L: 986
			this.field607 = var6.request(var5.method70(), var3, var4.method7898(), ""); // L: 987
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field565); // L: 990
			this.field567 = this.field697.method174(var7); // L: 991
		}
	} // L: 988 992

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2007713791"
	)
	void method1251(String var1) throws IOException {
		URL var2 = new URL(class59.field453 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 995
		class434 var3 = new class434(); // L: 996
		var3.method7885(var1); // L: 997
		class9 var4 = class9.field32; // L: 998
		OtlTokenRequester var5 = this.field563; // L: 999
		if (var5 != null) { // L: 1000
			this.field740 = var5.request(var4.method70(), var2, var3.method7898(), ""); // L: 1001
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field565); // L: 1004
			this.field562 = this.field697.method174(var6); // L: 1005
		}
	} // L: 1002 1006

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-259118253"
	)
	void method1252(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(Actor.field1264 + "game-session/v1/tokens"); // L: 1009
		class10 var4 = new class10(var3, class9.field41, this.field565); // L: 1010
		var4.method102().method7885(var1); // L: 1011
		var4.method102().method7870(class475.field4818); // L: 1012
		JSONObject var5 = new JSONObject(); // L: 1013
		var5.put("accountId", var2); // L: 1014
		var4.method86(new class477(var5)); // L: 1015
		this.field562 = this.field697.method174(var4); // L: 1016
	} // L: 1017

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-19583"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1327
			boolean var1 = class59.field452.method7027(); // L: 1328
			if (!var1) { // L: 1329
				this.method1258();
			}

		}
	} // L: 1330

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1822852781"
	)
	void method1258() {
		if (class59.field452.field4364 >= 4) { // L: 1333
			this.error("js5crc"); // L: 1334
			DefaultsGroup.method8263(1000); // L: 1335
		} else {
			if (class59.field452.field4356 >= 4) { // L: 1338
				if (gameState <= 5) { // L: 1339
					this.error("js5io"); // L: 1340
					DefaultsGroup.method8263(1000); // L: 1341
					return; // L: 1342
				}

				field552 = 3000; // L: 1345
				class59.field452.field4356 = 3; // L: 1346
			}

			if (--field552 + 1 <= 0) { // L: 1349
				try {
					if (js5ConnectState == 0) { // L: 1351
						class199.js5SocketTask = GameEngine.taskHandler.newSocketTask(MouseHandler.worldHost, class164.currentPort); // L: 1352
						++js5ConnectState; // L: 1353
					}

					if (js5ConnectState == 1) { // L: 1355
						if (class199.js5SocketTask.status == 2) { // L: 1356
							this.js5Error(-1); // L: 1357
							return; // L: 1358
						}

						if (class199.js5SocketTask.status == 1) { // L: 1360
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1362
						class162.js5Socket = WorldMapData_1.method5535((Socket)class199.js5SocketTask.result, 40000, 5000); // L: 1363
						Buffer var1 = new Buffer(5); // L: 1364
						var1.writeByte(15); // L: 1365
						var1.writeInt(217); // L: 1366
						class162.js5Socket.write(var1.array, 0, 5); // L: 1367
						++js5ConnectState; // L: 1368
						GroundObject.field2499 = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 1369
					}

					if (js5ConnectState == 3) { // L: 1371
						if (class162.js5Socket.available() > 0) { // L: 1372
							int var2 = class162.js5Socket.readUnsignedByte(); // L: 1373
							if (var2 != 0) { // L: 1374
								this.js5Error(var2); // L: 1375
								return; // L: 1376
							}

							++js5ConnectState; // L: 1378
						} else if (GrandExchangeOfferTotalQuantityComparator.method7049() - GroundObject.field2499 > 30000L) { // L: 1381
							this.js5Error(-2); // L: 1382
							return; // L: 1383
						}
					}

					if (js5ConnectState == 4) { // L: 1387
						class59.field452.method7001(class162.js5Socket, gameState > 20); // L: 1388
						class199.js5SocketTask = null; // L: 1389
						class162.js5Socket = null; // L: 1390
						js5ConnectState = 0; // L: 1391
						js5Errors = 0; // L: 1392
					}
				} catch (IOException var3) { // L: 1395
					this.js5Error(-3); // L: 1396
				}

			}
		}
	} // L: 1336 1398

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class199.js5SocketTask = null; // L: 1401
		class162.js5Socket = null; // L: 1402
		js5ConnectState = 0; // L: 1403
		if (class164.currentPort == ObjectComposition.worldPort) { // L: 1404
			class164.currentPort = class363.js5Port;
		} else {
			class164.currentPort = ObjectComposition.worldPort; // L: 1405
		}

		++js5Errors; // L: 1406
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) { // L: 1407
			if (gameState <= 5) { // L: 1408
				this.error("js5connect_full"); // L: 1409
				DefaultsGroup.method8263(1000); // L: 1410
			} else {
				field552 = 3000; // L: 1412
			}
		} else if (js5Errors >= 2 && var1 == 6) { // L: 1414
			this.error("js5connect_outofdate"); // L: 1415
			DefaultsGroup.method8263(1000); // L: 1416
		} else if (js5Errors >= 4) { // L: 1418
			if (gameState <= 5) { // L: 1419
				this.error("js5connect"); // L: 1420
				DefaultsGroup.method8263(1000); // L: 1421
			} else {
				field552 = 3000; // L: 1423
			}
		}

	} // L: 1425

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket(); // L: 2051
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 2052

		try {
			if (loginState == 0) { // L: 2054
				if (class224.secureRandom == null && (secureRandomFuture.isDone() || field555 > 250)) { // L: 2055
					class224.secureRandom = secureRandomFuture.get(); // L: 2056
					secureRandomFuture.shutdown(); // L: 2057
					secureRandomFuture = null; // L: 2058
				}

				if (class224.secureRandom != null) { // L: 2060
					if (var1 != null) { // L: 2061
						var1.close(); // L: 2062
						var1 = null; // L: 2063
					}

					MouseHandler.socketTask = null; // L: 2065
					hadNetworkError = false; // L: 2066
					field555 = 0; // L: 2067
					if (field559.method9506()) { // L: 2068
						if (this.method1768()) { // L: 2069
							try {
								this.requestOtlToken(class191.field1917); // L: 2071
								class409.method7554(21); // L: 2072
							} catch (Throwable var24) { // L: 2074
								class190.RunException_sendStackTrace((String)null, var24); // L: 2075
								class198.getLoginError(65); // L: 2076
								return; // L: 2077
							}
						} else {
							if (!this.method1248()) { // L: 2080
								class198.getLoginError(65); // L: 2092
								return; // L: 2093
							}

							try {
								this.method1252(LoginScreenAnimation.field1283, class155.field1698); // L: 2082
								class409.method7554(20); // L: 2083
							} catch (Exception var23) { // L: 2085
								class190.RunException_sendStackTrace((String)null, var23); // L: 2086
								class198.getLoginError(65); // L: 2087
								return; // L: 2088
							}
						}
					} else {
						class409.method7554(1); // L: 2097
					}
				}
			}

			class20 var26;
			if (loginState == 21) { // L: 2101
				if (this.field607 != null) { // L: 2102
					if (!this.field607.isDone()) { // L: 2103
						return; // L: 2104
					}

					if (this.field607.isCancelled()) { // L: 2106
						class198.getLoginError(65); // L: 2107
						this.field607 = null; // L: 2108
						return; // L: 2109
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field607.get(); // L: 2112
						if (!var3.isSuccess()) { // L: 2113
							class198.getLoginError(65); // L: 2114
							this.field607 = null; // L: 2115
							return; // L: 2116
						}

						class467.field4804 = var3.getAccessToken(); // L: 2118
						class191.field1917 = var3.getRefreshToken(); // L: 2119
						this.field607 = null; // L: 2120
					} catch (Exception var22) { // L: 2122
						class190.RunException_sendStackTrace((String)null, var22); // L: 2123
						class198.getLoginError(65); // L: 2124
						this.field607 = null; // L: 2125
						return; // L: 2126
					}
				} else {
					if (this.field567 == null) { // L: 2129
						class198.getLoginError(65); // L: 2159
						return; // L: 2160
					}

					if (!this.field567.method279()) { // L: 2130
						return; // L: 2131
					}

					if (this.field567.method270()) { // L: 2133
						class190.RunException_sendStackTrace(this.field567.method269(), (Throwable)null); // L: 2134
						class198.getLoginError(65); // L: 2135
						this.field567 = null; // L: 2136
						return; // L: 2137
					}

					var26 = this.field567.method272(); // L: 2139
					if (var26.method287() != 200) { // L: 2140
						class198.getLoginError(65); // L: 2141
						this.field567 = null; // L: 2142
						return; // L: 2143
					}

					field555 = 0; // L: 2145
					class477 var4 = new class477(var26.method289()); // L: 2146

					try {
						class467.field4804 = var4.method8491().getString("access_token"); // L: 2148
						class191.field1917 = var4.method8491().getString("refresh_token"); // L: 2149
					} catch (Exception var21) { // L: 2151
						class190.RunException_sendStackTrace("Error parsing tokens", var21); // L: 2152
						class198.getLoginError(65); // L: 2153
						this.field567 = null; // L: 2154
						return; // L: 2155
					}
				}

				this.method1251(class467.field4804); // L: 2162
				class409.method7554(20); // L: 2163
			}

			if (loginState == 20) { // L: 2165
				if (this.field740 != null) { // L: 2166
					if (!this.field740.isDone()) { // L: 2167
						return; // L: 2168
					}

					if (this.field740.isCancelled()) { // L: 2170
						class198.getLoginError(65); // L: 2171
						this.field740 = null; // L: 2172
						return; // L: 2173
					}

					try {
						OtlTokenResponse var27 = (OtlTokenResponse)this.field740.get(); // L: 2176
						if (!var27.isSuccess()) { // L: 2177
							class198.getLoginError(65); // L: 2178
							this.field740 = null; // L: 2179
							return; // L: 2180
						}

						this.field560 = var27.getToken(); // L: 2182
						this.field740 = null; // L: 2183
					} catch (Exception var20) { // L: 2185
						class190.RunException_sendStackTrace((String)null, var20); // L: 2186
						class198.getLoginError(65); // L: 2187
						this.field740 = null; // L: 2188
						return; // L: 2189
					}
				} else {
					if (this.field562 == null) { // L: 2192
						class198.getLoginError(65); // L: 2228
						return; // L: 2229
					}

					if (!this.field562.method279()) { // L: 2193
						return; // L: 2194
					}

					if (this.field562.method270()) { // L: 2196
						class190.RunException_sendStackTrace(this.field562.method269(), (Throwable)null); // L: 2197
						class198.getLoginError(65); // L: 2198
						this.field562 = null; // L: 2199
						return; // L: 2200
					}

					var26 = this.field562.method272(); // L: 2202
					if (var26.method287() != 200) { // L: 2203
						class190.RunException_sendStackTrace("Response code: " + var26.method287() + "Response body: " + var26.method289(), (Throwable)null); // L: 2204
						class198.getLoginError(65); // L: 2205
						this.field562 = null; // L: 2206
						return; // L: 2207
					}

					List var29 = (List)var26.method288().get("Content-Type"); // L: 2209
					if (var29 != null && var29.contains(class475.field4818.method8476())) { // L: 2210
						try {
							JSONObject var5 = new JSONObject(var26.method289()); // L: 2212
							this.field560 = var5.getString("token"); // L: 2213
						} catch (JSONException var19) { // L: 2215
							class190.RunException_sendStackTrace((String)null, var19); // L: 2216
							class198.getLoginError(65); // L: 2217
							this.field562 = null; // L: 2218
							return; // L: 2219
						}
					} else {
						this.field560 = var26.method289(); // L: 2223
					}

					this.field562 = null; // L: 2225
				}

				field555 = 0; // L: 2231
				class409.method7554(1); // L: 2232
			}

			if (loginState == 1) { // L: 2234
				if (MouseHandler.socketTask == null) { // L: 2235
					MouseHandler.socketTask = GameEngine.taskHandler.newSocketTask(MouseHandler.worldHost, class164.currentPort); // L: 2236
				}

				if (MouseHandler.socketTask.status == 2) { // L: 2238
					throw new IOException();
				}

				if (MouseHandler.socketTask.status == 1) { // L: 2239
					var1 = WorldMapData_1.method5535((Socket)MouseHandler.socketTask.result, 40000, 5000); // L: 2240
					packetWriter.setSocket(var1); // L: 2241
					MouseHandler.socketTask = null; // L: 2242
					class409.method7554(2); // L: 2243
				}
			}

			PacketBufferNode var28;
			if (loginState == 2) { // L: 2246
				packetWriter.clearBuffer(); // L: 2247
				var28 = class103.method2692(); // L: 2248
				var28.packetBuffer.writeByte(LoginPacket.field3387.id); // L: 2249
				packetWriter.addNode(var28); // L: 2250
				packetWriter.flush(); // L: 2251
				var2.offset = 0; // L: 2252
				class409.method7554(3); // L: 2253
			}

			int var13;
			if (loginState == 3) { // L: 2255
				if (class171.pcmPlayer1 != null) { // L: 2256
					class171.pcmPlayer1.method780();
				}

				if (var1.isAvailable(1)) { // L: 2257
					var13 = var1.readUnsignedByte(); // L: 2258
					if (class171.pcmPlayer1 != null) { // L: 2259
						class171.pcmPlayer1.method780();
					}

					if (var13 != 0) { // L: 2260
						class198.getLoginError(var13); // L: 2261
						return; // L: 2262
					}

					var2.offset = 0; // L: 2264
					class409.method7554(4); // L: 2265
				}
			}

			if (loginState == 4) { // L: 2268
				if (var2.offset < 8) { // L: 2269
					var13 = var1.available(); // L: 2270
					if (var13 > 8 - var2.offset) { // L: 2271
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) { // L: 2272
						var1.read(var2.array, var2.offset, var13); // L: 2273
						var2.offset += var13; // L: 2274
					}
				}

				if (var2.offset == 8) { // L: 2277
					var2.offset = 0; // L: 2278
					AttackOption.field1354 = var2.readLong(); // L: 2279
					class409.method7554(5); // L: 2280
				}
			}

			int var6;
			if (loginState == 5) { // L: 2283
				packetWriter.packetBuffer.offset = 0; // L: 2284
				packetWriter.clearBuffer(); // L: 2285
				PacketBuffer var30 = new PacketBuffer(500); // L: 2286
				int[] var31 = new int[]{class224.secureRandom.nextInt(), class224.secureRandom.nextInt(), class224.secureRandom.nextInt(), class224.secureRandom.nextInt()}; // L: 2287 2288 2289 2290 2291
				var30.offset = 0; // L: 2292
				var30.writeByte(1); // L: 2293
				var30.writeInt(var31[0]); // L: 2294
				var30.writeInt(var31[1]); // L: 2295
				var30.writeInt(var31[2]); // L: 2296
				var30.writeInt(var31[3]); // L: 2297
				var30.writeLong(AttackOption.field1354); // L: 2298
				if (gameState == 40) { // L: 2299
					var30.writeInt(SecureRandomFuture.field1000[0]); // L: 2300
					var30.writeInt(SecureRandomFuture.field1000[1]); // L: 2301
					var30.writeInt(SecureRandomFuture.field1000[2]); // L: 2302
					var30.writeInt(SecureRandomFuture.field1000[3]); // L: 2303
				} else {
					if (gameState == 50) { // L: 2306
						var30.writeByte(class141.field1634.rsOrdinal()); // L: 2307
						var30.writeInt(class153.field1693); // L: 2308
					} else {
						var30.writeByte(field558.rsOrdinal()); // L: 2311
						switch(field558.field1626) { // L: 2312
						case 1:
							var30.offset += 4; // L: 2315
							break; // L: 2316
						case 2:
							var30.writeInt(class91.clientPreferences.method2510(Login.Login_username)); // L: 2327
							break;
						case 3:
						case 4:
							var30.writeMedium(ClientPreferences.field1295); // L: 2321
							++var30.offset; // L: 2322
						}
					}

					if (field559.method9506()) { // L: 2332
						var30.writeByte(class534.field5192.rsOrdinal()); // L: 2333
						var30.writeStringCp1252NullTerminated(this.field560); // L: 2334
					} else {
						var30.writeByte(class534.field5199.rsOrdinal()); // L: 2337
						var30.writeStringCp1252NullTerminated(Login.Login_password); // L: 2338
					}
				}

				var30.encryptRsa(class76.field921, class76.field922); // L: 2341
				SecureRandomFuture.field1000 = var31; // L: 2342
				PacketBufferNode var34 = class103.method2692(); // L: 2343
				var34.packetBuffer.offset = 0; // L: 2344
				if (gameState == 40) { // L: 2345
					var34.packetBuffer.writeByte(LoginPacket.field3391.id); // L: 2346
				} else {
					var34.packetBuffer.writeByte(LoginPacket.field3386.id); // L: 2349
				}

				var34.packetBuffer.writeShort(0); // L: 2351
				var6 = var34.packetBuffer.offset; // L: 2352
				var34.packetBuffer.writeInt(217); // L: 2353
				var34.packetBuffer.writeInt(1); // L: 2354
				var34.packetBuffer.writeByte(clientType); // L: 2355
				var34.packetBuffer.writeByte(field525); // L: 2356
				byte var7 = 0; // L: 2357
				var34.packetBuffer.writeByte(var7); // L: 2358
				var34.packetBuffer.writeBytes(var30.array, 0, var30.offset); // L: 2359
				int var8 = var34.packetBuffer.offset; // L: 2360
				var34.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2361
				var34.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2362
				var34.packetBuffer.writeShort(class340.canvasWidth); // L: 2363
				var34.packetBuffer.writeShort(class491.canvasHeight); // L: 2364
				PacketBuffer var9 = var34.packetBuffer; // L: 2365
				if (randomDatData != null) { // L: 2367
					var9.writeBytes(randomDatData, 0, randomDatData.length); // L: 2368
				} else {
					byte[] var10 = class131.method3015(); // L: 2371
					var9.writeBytes(var10, 0, var10.length); // L: 2372
				}

				var34.packetBuffer.writeStringCp1252NullTerminated(HealthBarDefinition.field1995); // L: 2374
				var34.packetBuffer.writeInt(WorldMapIcon_1.field2916); // L: 2375
				if (field527 > 213) { // L: 2376
					var34.packetBuffer.writeByte(0); // L: 2377
				}

				Buffer var40 = new Buffer(Skeleton.field2583.size()); // L: 2379
				Skeleton.field2583.write(var40); // L: 2380
				var34.packetBuffer.writeBytes(var40.array, 0, var40.array.length); // L: 2381
				var34.packetBuffer.writeByte(clientType); // L: 2382
				var34.packetBuffer.writeInt(0); // L: 2383
				var34.packetBuffer.writeInt(WorldMapDecorationType.field3881.hash); // L: 2384
				var34.packetBuffer.writeInt(class199.field2009.hash); // L: 2385
				var34.packetBuffer.method9258(class199.field2010.hash); // L: 2386
				var34.packetBuffer.method9423(class241.field2558.hash); // L: 2387
				var34.packetBuffer.method9256(class27.archive13.hash); // L: 2388
				var34.packetBuffer.method9256(class469.field4812.hash); // L: 2389
				var34.packetBuffer.method9256(SoundSystem.archive2.hash); // L: 2390
				var34.packetBuffer.method9423(class190.field1916.hash); // L: 2391
				var34.packetBuffer.method9258(HorizontalAlignment.field2028.hash); // L: 2392
				var34.packetBuffer.method9423(GrandExchangeOfferOwnWorldComparator.field515.hash); // L: 2393
				var34.packetBuffer.writeInt(class358.field3898.hash); // L: 2394
				var34.packetBuffer.method9423(Language.field4435.hash); // L: 2395
				var34.packetBuffer.method9423(0); // L: 2396
				var34.packetBuffer.method9256(AbstractByteArrayCopier.field3839.hash); // L: 2397
				var34.packetBuffer.method9256(class198.archive9.hash); // L: 2398
				var34.packetBuffer.method9256(class245.field2658.hash); // L: 2399
				var34.packetBuffer.writeInt(ArchiveDiskAction.field4291.hash); // L: 2400
				var34.packetBuffer.method9256(CollisionMap.field2392.hash); // L: 2401
				var34.packetBuffer.writeInt(class421.archive12.hash); // L: 2402
				var34.packetBuffer.method9256(class317.field3415.hash); // L: 2403
				var34.packetBuffer.method9258(class92.field1117.hash); // L: 2404
				var34.packetBuffer.xteaEncrypt(var31, var8, var34.packetBuffer.offset); // L: 2405
				var34.packetBuffer.writeLengthShort(var34.packetBuffer.offset - var6); // L: 2406
				packetWriter.addNode(var34); // L: 2407
				packetWriter.flush(); // L: 2408
				packetWriter.isaacCipher = new IsaacCipher(var31); // L: 2409
				int[] var11 = new int[4]; // L: 2410

				for (int var12 = 0; var12 < 4; ++var12) { // L: 2411
					var11[var12] = var31[var12] + 50;
				}

				var2.newIsaacCipher(var11); // L: 2412
				class409.method7554(6); // L: 2413
			}

			int var14;
			if (loginState == 6 && var1.available() > 0) { // L: 2415 2416
				var13 = var1.readUnsignedByte(); // L: 2417
				if (var13 == 61) { // L: 2418
					var14 = var1.available(); // L: 2419
					MusicPatchNode2.field3427 = var14 == 1 && var1.readUnsignedByte() == 1; // L: 2420
					class409.method7554(5); // L: 2421
				}

				if (var13 == 21 && gameState == 20) { // L: 2423
					class409.method7554(12); // L: 2424
				} else if (var13 == 2) { // L: 2426
					class409.method7554(14); // L: 2427
				} else if (var13 == 15 && gameState == 40) { // L: 2429
					packetWriter.serverPacketLength = -1; // L: 2430
					class409.method7554(19); // L: 2431
				} else if (var13 == 64) { // L: 2433
					class409.method7554(10); // L: 2434
				} else if (var13 == 23 && field732 < 1) { // L: 2436
					++field732; // L: 2437
					class409.method7554(0); // L: 2438
				} else if (var13 == 29) { // L: 2440
					class409.method7554(17); // L: 2441
				} else {
					if (var13 != 69) { // L: 2443
						class198.getLoginError(var13); // L: 2447
						return; // L: 2448
					}

					class409.method7554(7); // L: 2444
				}
			}

			if (loginState == 7 && var1.available() >= 2) { // L: 2452 2453
				var1.read(var2.array, 0, 2); // L: 2454
				var2.offset = 0; // L: 2455
				class13.field68 = var2.readUnsignedShort(); // L: 2456
				class409.method7554(8); // L: 2457
			}

			if (loginState == 8 && var1.available() >= class13.field68) { // L: 2460 2461
				var2.offset = 0; // L: 2462
				var1.read(var2.array, var2.offset, class13.field68); // L: 2463
				class6[] var32 = new class6[]{class6.field14}; // L: 2466
				class6 var33 = var32[var2.readUnsignedByte()]; // L: 2468

				try {
					switch(var33.field21) { // L: 2472
					case 0:
						class0 var36 = new class0(); // L: 2475
						this.field575 = new class7(var2, var36); // L: 2485
						class409.method7554(9); // L: 2486
						break;
					default:
						throw new IllegalArgumentException(); // L: 2480
					}
				} catch (Exception var18) { // L: 2488
					class198.getLoginError(22); // L: 2489
					return; // L: 2490
				}
			}

			if (loginState == 9 && this.field575.method44()) { // L: 2494 2495
				this.field764 = this.field575.method46(); // L: 2496
				this.field575.method45(); // L: 2497
				this.field575 = null; // L: 2498
				if (this.field764 == null) { // L: 2499
					class198.getLoginError(22); // L: 2500
					return; // L: 2501
				}

				packetWriter.clearBuffer(); // L: 2503
				var28 = class103.method2692(); // L: 2504
				var28.packetBuffer.writeByte(LoginPacket.field3388.id); // L: 2505
				var28.packetBuffer.writeShort(this.field764.offset); // L: 2506
				var28.packetBuffer.method9197(this.field764); // L: 2507
				packetWriter.addNode(var28); // L: 2508
				packetWriter.flush(); // L: 2509
				this.field764 = null; // L: 2510
				class409.method7554(6); // L: 2511
			}

			if (loginState == 10 && var1.available() > 0) { // L: 2514 2515
				class174.field1833 = var1.readUnsignedByte(); // L: 2516
				class409.method7554(11); // L: 2517
			}

			if (loginState == 11 && var1.available() >= class174.field1833) { // L: 2520 2521
				var1.read(var2.array, 0, class174.field1833); // L: 2522
				var2.offset = 0; // L: 2523
				class409.method7554(6); // L: 2524
			}

			if (loginState == 12 && var1.available() > 0) { // L: 2527 2528
				field557 = (var1.readUnsignedByte() + 3) * 60; // L: 2529
				class409.method7554(13); // L: 2530
			}

			if (loginState == 13) { // L: 2533
				field555 = 0; // L: 2534
				AbstractWorldMapIcon.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field557 / 60 + " seconds."); // L: 2535
				if (--field557 <= 0) { // L: 2536
					class409.method7554(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) { // L: 2539 2540
					Tiles.field1039 = var1.readUnsignedByte(); // L: 2541
					class409.method7554(15); // L: 2542
				}

				if (loginState == 15 && var1.available() >= Tiles.field1039) { // L: 2545 2546
					boolean var42 = var1.readUnsignedByte() == 1; // L: 2547
					var1.read(var2.array, 0, 4); // L: 2548
					var2.offset = 0; // L: 2549
					boolean var41 = false; // L: 2550
					if (var42) { // L: 2551
						var14 = var2.readByteIsaac() << 24; // L: 2552
						var14 |= var2.readByteIsaac() << 16; // L: 2553
						var14 |= var2.readByteIsaac() << 8; // L: 2554
						var14 |= var2.readByteIsaac(); // L: 2555
						class91.clientPreferences.method2583(Login.Login_username, var14); // L: 2556
					}

					if (Login_isUsernameRemembered) { // L: 2558
						class91.clientPreferences.method2520(Login.Login_username); // L: 2559
					} else {
						class91.clientPreferences.method2520((String)null); // L: 2562
					}

					class144.savePreferences(); // L: 2564
					staffModLevel = var1.readUnsignedByte(); // L: 2565
					playerMod = var1.readUnsignedByte() == 1; // L: 2566
					localPlayerIndex = var1.readUnsignedByte(); // L: 2567
					localPlayerIndex <<= 8; // L: 2568
					localPlayerIndex += var1.readUnsignedByte(); // L: 2569
					field646 = var1.readUnsignedByte(); // L: 2570
					var1.read(var2.array, 0, 8); // L: 2571
					var2.offset = 0; // L: 2572
					this.accountHash = var2.readLong(); // L: 2573
					var1.read(var2.array, 0, 8); // L: 2574
					var2.offset = 0; // L: 2575
					field538 = var2.readLong(); // L: 2576
					if (field527 >= 214) { // L: 2577
						var1.read(var2.array, 0, 8); // L: 2578
						var2.offset = 0; // L: 2579
						var2.readLong(); // L: 2580
					}

					var1.read(var2.array, 0, 1); // L: 2582
					var2.offset = 0; // L: 2583
					ServerPacket[] var38 = class209.method3849(); // L: 2584
					var6 = var2.readSmartByteShortIsaac(); // L: 2585
					if (var6 < 0 || var6 >= var38.length) { // L: 2586
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var38[var6]; // L: 2587
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2588
					var1.read(var2.array, 0, 2); // L: 2589
					var2.offset = 0; // L: 2590
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2591

					try {
						Client var16 = class159.client; // L: 2593
						JSObject.getWindow(var16).call("zap", (Object[])null); // L: 2596
					} catch (Throwable var17) { // L: 2599
					}

					class409.method7554(16); // L: 2600
				}

				if (loginState == 16) { // L: 2603
					if (var1.available() >= packetWriter.serverPacketLength) { // L: 2604
						var2.offset = 0; // L: 2605
						var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2606
						timer.method7834(); // L: 2607
						MusicPatchNode2.method5928(); // L: 2608
						class180.updatePlayer(var2); // L: 2609
						class94.field1150 = -1; // L: 2610
						class151.loadRegions(false, var2); // L: 2611
						packetWriter.serverPacket = null; // L: 2612
					}

				} else {
					if (loginState == 17 && var1.available() >= 2) { // L: 2616 2617
						var2.offset = 0; // L: 2618
						var1.read(var2.array, 0, 2); // L: 2619
						var2.offset = 0; // L: 2620
						ApproximateRouteStrategy.field508 = var2.readUnsignedShort(); // L: 2621
						class409.method7554(18); // L: 2622
					}

					if (loginState == 18 && var1.available() >= ApproximateRouteStrategy.field508) { // L: 2625 2626
						var2.offset = 0; // L: 2627
						var1.read(var2.array, 0, ApproximateRouteStrategy.field508); // L: 2628
						var2.offset = 0; // L: 2629
						String var37 = var2.readStringCp1252NullTerminated(); // L: 2630
						String var35 = var2.readStringCp1252NullTerminated(); // L: 2631
						String var39 = var2.readStringCp1252NullTerminated(); // L: 2632
						AbstractWorldMapIcon.setLoginResponseString(var37, var35, var39); // L: 2633
						DefaultsGroup.method8263(10); // L: 2634
						if (field559.method9506()) { // L: 2635
							GameEngine.method647(9); // L: 2636
						}
					}

					if (loginState == 19) { // L: 2640
						if (packetWriter.serverPacketLength == -1) { // L: 2641
							if (var1.available() < 2) { // L: 2642
								return;
							}

							var1.read(var2.array, 0, 2); // L: 2643
							var2.offset = 0; // L: 2644
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2645
						}

						if (var1.available() >= packetWriter.serverPacketLength) { // L: 2647
							var1.read(var2.array, 0, packetWriter.serverPacketLength); // L: 2648
							var2.offset = 0; // L: 2649
							var13 = packetWriter.serverPacketLength; // L: 2650
							timer.method7837(); // L: 2651
							MouseHandler.method683(); // L: 2652
							class180.updatePlayer(var2); // L: 2653
							if (var13 != var2.offset) { // L: 2654
								throw new RuntimeException(); // L: 2655
							}
						}
					} else {
						++field555; // L: 2659
						if (field555 > 2000) { // L: 2660
							if (field732 < 1) { // L: 2661
								if (ObjectComposition.worldPort == class164.currentPort) { // L: 2662
									class164.currentPort = class363.js5Port;
								} else {
									class164.currentPort = ObjectComposition.worldPort; // L: 2663
								}

								++field732; // L: 2664
								class409.method7554(0); // L: 2665
							} else {
								class198.getLoginError(-3); // L: 2668
							}
						}
					}
				}
			}
		} catch (IOException var25) { // L: 2672
			if (field732 < 1) { // L: 2673
				if (ObjectComposition.worldPort == class164.currentPort) { // L: 2674
					class164.currentPort = class363.js5Port;
				} else {
					class164.currentPort = ObjectComposition.worldPort; // L: 2675
				}

				++field732; // L: 2676
				class409.method7554(0); // L: 2677
			} else {
				class198.getLoginError(-2); // L: 2680
			}
		}
	} // L: 2537 2614 2657 2666 2669 2678 2681 2683

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 3089
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 3090
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 3091
			hadNetworkError = false; // L: 3092
			class148.method3177(); // L: 3093
		} else {
			if (!isMenuOpen) { // L: 3096
				StudioGame.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1268(packetWriter); ++var1) { // L: 3097 3098
			}

			if (gameState == 30) { // L: 3100
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 3104
					boolean var41;
					if (var2 == null) { // L: 3105
						var41 = false; // L: 3106
					} else {
						var41 = true; // L: 3109
					}

					int var3;
					PacketBufferNode var42;
					if (!var41) { // L: 3111
						PacketBufferNode var20;
						int var21;
						if (timer.field4617) { // L: 3119
							var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3211, packetWriter.isaacCipher); // L: 3121
							var20.packetBuffer.writeByte(0); // L: 3122
							var21 = var20.packetBuffer.offset; // L: 3123
							timer.write(var20.packetBuffer); // L: 3124
							var20.packetBuffer.method9200(var20.packetBuffer.offset - var21); // L: 3125
							packetWriter.addNode(var20); // L: 3126
							timer.method7835(); // L: 3127
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						synchronized(class233.mouseRecorder.lock) { // L: 3130
							if (!field536) { // L: 3131
								class233.mouseRecorder.index = 0; // L: 3217
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class233.mouseRecorder.index >= 40) { // L: 3132
								var42 = null; // L: 3134
								var3 = 0; // L: 3135
								var4 = 0; // L: 3136
								var5 = 0; // L: 3137
								var6 = 0; // L: 3138

								for (var7 = 0; var7 < class233.mouseRecorder.index && (var42 == null || var42.packetBuffer.offset - var3 < 246); ++var7) { // L: 3139 3140
									var4 = var7; // L: 3141
									var8 = class233.mouseRecorder.ys[var7]; // L: 3142
									if (var8 < -1) { // L: 3143
										var8 = -1;
									} else if (var8 > 65534) { // L: 3144
										var8 = 65534;
									}

									var9 = class233.mouseRecorder.xs[var7]; // L: 3145
									if (var9 < -1) { // L: 3146
										var9 = -1;
									} else if (var9 > 65534) { // L: 3147
										var9 = 65534;
									}

									if (var9 != field652 || var8 != field597) { // L: 3148
										if (var42 == null) { // L: 3151
											var42 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3188, packetWriter.isaacCipher); // L: 3152
											var42.packetBuffer.writeByte(0); // L: 3153
											var3 = var42.packetBuffer.offset; // L: 3154
											PacketBuffer var10000 = var42.packetBuffer; // L: 3155
											var10000.offset += 2;
											var5 = 0; // L: 3156
											var6 = 0; // L: 3157
										}

										if (-1L != field708) { // L: 3162
											var10 = var9 - field652; // L: 3163
											var11 = var8 - field597; // L: 3164
											var12 = (int)((class233.mouseRecorder.millis[var7] - field708) / 20L); // L: 3165
											var5 = (int)((long)var5 + (class233.mouseRecorder.millis[var7] - field708) % 20L); // L: 3166
										} else {
											var10 = var9; // L: 3169
											var11 = var8; // L: 3170
											var12 = Integer.MAX_VALUE; // L: 3171
										}

										field652 = var9; // L: 3173
										field597 = var8; // L: 3174
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 3175
											var10 += 32; // L: 3176
											var11 += 32; // L: 3177
											var42.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 3178
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 3180
											var10 += 128; // L: 3181
											var11 += 128; // L: 3182
											var42.packetBuffer.writeByte(var12 + 128); // L: 3183
											var42.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 3184
										} else if (var12 < 32) { // L: 3186
											var42.packetBuffer.writeByte(var12 + 192); // L: 3187
											if (var9 != -1 && var8 != -1) { // L: 3188
												var42.packetBuffer.writeInt(var9 | var8 << 16); // L: 3189
											} else {
												var42.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var42.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3192
											if (var9 != -1 && var8 != -1) { // L: 3193
												var42.packetBuffer.writeInt(var9 | var8 << 16); // L: 3194
											} else {
												var42.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6; // L: 3196
										field708 = class233.mouseRecorder.millis[var7]; // L: 3197
									}
								}

								if (var42 != null) { // L: 3199
									var42.packetBuffer.method9200(var42.packetBuffer.offset - var3); // L: 3200
									var7 = var42.packetBuffer.offset; // L: 3201
									var42.packetBuffer.offset = var3; // L: 3202
									var42.packetBuffer.writeByte(var5 / var6); // L: 3203
									var42.packetBuffer.writeByte(var5 % var6); // L: 3204
									var42.packetBuffer.offset = var7; // L: 3205
									packetWriter.addNode(var42); // L: 3206
								}

								if (var4 >= class233.mouseRecorder.index) { // L: 3208
									class233.mouseRecorder.index = 0;
								} else {
									MouseRecorder var58 = class233.mouseRecorder; // L: 3210
									var58.index -= var4;
									System.arraycopy(class233.mouseRecorder.xs, var4, class233.mouseRecorder.xs, 0, class233.mouseRecorder.index); // L: 3211
									System.arraycopy(class233.mouseRecorder.ys, var4, class233.mouseRecorder.ys, 0, class233.mouseRecorder.index); // L: 3212
									System.arraycopy(class233.mouseRecorder.millis, var4, class233.mouseRecorder.millis, 0, class233.mouseRecorder.index); // L: 3213
								}
							}
						}

						PacketBufferNode var24;
						if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator8.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3219
							long var22 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L; // L: 3220
							if (var22 > 32767L) { // L: 3221
								var22 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L; // L: 3222
							var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3223
							if (var3 < 0) { // L: 3224
								var3 = 0;
							} else if (var3 > class491.canvasHeight) { // L: 3225
								var3 = class491.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3226
							if (var4 < 0) { // L: 3227
								var4 = 0;
							} else if (var4 > class340.canvasWidth) { // L: 3228
								var4 = class340.canvasWidth;
							}

							var5 = (int)var22; // L: 3229
							var24 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3215, packetWriter.isaacCipher); // L: 3230
							var24.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0)); // L: 3231
							var24.packetBuffer.writeShort(var4); // L: 3232
							var24.packetBuffer.writeShort(var3); // L: 3233
							packetWriter.addNode(var24); // L: 3234
						}

						if (mouseWheelRotation != 0) { // L: 3236
							var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3149, packetWriter.isaacCipher); // L: 3237
							var20.packetBuffer.writeShort(mouseWheelRotation); // L: 3238
							packetWriter.addNode(var20); // L: 3239
						}

						if (field755.field2376 > 0) { // L: 3241
							var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3194, packetWriter.isaacCipher); // L: 3242
							var20.packetBuffer.writeShort(0); // L: 3243
							var21 = var20.packetBuffer.offset; // L: 3244
							long var25 = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 3245

							for (var5 = 0; var5 < field755.field2376; ++var5) { // L: 3246
								long var27 = var25 - field760; // L: 3247
								if (var27 > 16777215L) { // L: 3248
									var27 = 16777215L;
								}

								field760 = var25; // L: 3249
								var20.packetBuffer.writeByte(field755.field2373[var5]); // L: 3250
								var20.packetBuffer.method9409((int)var27); // L: 3251
							}

							var20.packetBuffer.writeLengthShort(var20.packetBuffer.offset - var21); // L: 3253
							packetWriter.addNode(var20); // L: 3254
						}

						if (field619 > 0) { // L: 3256
							--field619;
						}

						if (field755.method4280(96) || field755.method4280(97) || field755.method4280(98) || field755.method4280(99)) { // L: 3257
							field550 = true; // L: 3258
						}

						if (field550 && field619 <= 0) { // L: 3260
							field619 = 20; // L: 3261
							field550 = false; // L: 3262
							var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3155, packetWriter.isaacCipher); // L: 3264
							var20.packetBuffer.method9344(camAngleY); // L: 3265
							var20.packetBuffer.method9243(camAngleX); // L: 3266
							packetWriter.addNode(var20); // L: 3267
						}

						if (class25.hasFocus && !hadFocus) { // L: 3269
							hadFocus = true; // L: 3270
							var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3170, packetWriter.isaacCipher); // L: 3272
							var20.packetBuffer.writeByte(1); // L: 3273
							packetWriter.addNode(var20); // L: 3274
						}

						if (!class25.hasFocus && hadFocus) { // L: 3276
							hadFocus = false; // L: 3277
							var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3170, packetWriter.isaacCipher); // L: 3279
							var20.packetBuffer.writeByte(0); // L: 3280
							packetWriter.addNode(var20); // L: 3281
						}

						if (class434.worldMap != null) { // L: 3284
							class434.worldMap.method8718();
						}

						class143.method3142(); // L: 3285
						if (PcmPlayer.field307) { // L: 3287
							for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3289
								Player var43 = players[Players.Players_indices[var1]]; // L: 3290
								var43.method2396(); // L: 3291
							}

							PcmPlayer.field307 = false; // L: 3294
						}

						if (field763 != class87.Client_plane) { // L: 3298
							field763 = class87.Client_plane; // L: 3299
							class87.method2310(class87.Client_plane); // L: 3300
						}

						if (gameState != 30) { // L: 3303
							return;
						}

						UserComparator8.method2890(); // L: 3304
						class73.method2110(); // L: 3305
						++packetWriter.field1429; // L: 3306
						if (packetWriter.field1429 > 750) { // L: 3307
							class148.method3177(); // L: 3308
							return; // L: 3309
						}

						class139.method3084(); // L: 3311

						for (var1 = 0; var1 < npcCount; ++var1) { // L: 3313
							var21 = npcIndices[var1]; // L: 3314
							NPC var29 = npcs[var21]; // L: 3315
							if (var29 != null) { // L: 3316
								class6.updateActorSequence(var29, var29.definition.size); // L: 3317
							}
						}

						int[] var49 = Players.Players_indices; // L: 3322

						for (var21 = 0; var21 < Players.Players_count; ++var21) { // L: 3323
							Player var52 = players[var49[var21]]; // L: 3324
							if (var52 != null && var52.overheadTextCyclesRemaining > 0) { // L: 3325
								--var52.overheadTextCyclesRemaining; // L: 3326
								if (var52.overheadTextCyclesRemaining == 0) { // L: 3327
									var52.overheadText = null;
								}
							}
						}

						for (var21 = 0; var21 < npcCount; ++var21) { // L: 3330
							var3 = npcIndices[var21]; // L: 3331
							NPC var30 = npcs[var3]; // L: 3332
							if (var30 != null && var30.overheadTextCyclesRemaining > 0) { // L: 3333
								--var30.overheadTextCyclesRemaining; // L: 3334
								if (var30.overheadTextCyclesRemaining == 0) { // L: 3335
									var30.overheadText = null;
								}
							}
						}

						++field709; // L: 3339
						if (mouseCrossColor != 0) { // L: 3340
							mouseCrossState = mouseCrossState * 400 + 20; // L: 3341
							if (mouseCrossState * 400 >= 400) { // L: 3342
								mouseCrossColor = 0;
							}
						}

						Widget var50 = class64.mousedOverWidgetIf1; // L: 3344
						Widget var44 = GrandExchangeOfferNameComparator.field4374; // L: 3345
						class64.mousedOverWidgetIf1 = null; // L: 3346
						GrandExchangeOfferNameComparator.field4374 = null; // L: 3347
						draggedOnWidget = null; // L: 3348
						field685 = false; // L: 3349
						field647 = false; // L: 3350
						field757 = 0; // L: 3351

						while (field755.method4256() && field757 < 128) { // L: 3352
							if (staffModLevel >= 2 && field755.method4280(82) && field755.field2386 == 66) { // L: 3353
								String var53 = RouteStrategy.method4341(); // L: 3354
								class159.client.method558(var53); // L: 3355
							} else if (oculusOrbState != 1 || field755.field2375 <= 0) { // L: 3358
								field759[field757] = field755.field2386; // L: 3361
								field661[field757] = field755.field2375; // L: 3362
								++field757; // L: 3363
							}
						}

						boolean var45 = staffModLevel >= 2; // L: 3367
						PacketBufferNode var31;
						if (var45 && field755.method4280(82) && field755.method4280(81) && mouseWheelRotation != 0) { // L: 3369
							var4 = TextureProvider.localPlayer.plane - mouseWheelRotation; // L: 3370
							if (var4 < 0) { // L: 3371
								var4 = 0;
							} else if (var4 > 3) { // L: 3372
								var4 = 3;
							}

							if (var4 != TextureProvider.localPlayer.plane) { // L: 3373
								var5 = TextureProvider.localPlayer.pathX[0] + class20.baseX * 64; // L: 3374
								var6 = TextureProvider.localPlayer.pathY[0] + class19.baseY * 64; // L: 3375
								var31 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3154, packetWriter.isaacCipher); // L: 3378
								var31.packetBuffer.method9243(var5); // L: 3379
								var31.packetBuffer.method9344(var6); // L: 3380
								var31.packetBuffer.writeInt(0); // L: 3381
								var31.packetBuffer.method9323(var4); // L: 3382
								packetWriter.addNode(var31); // L: 3383
							}

							mouseWheelRotation = 0; // L: 3386
						}

						if (MouseHandler.MouseHandler_lastButton == 1) { // L: 3388
							field756.method4232(); // L: 3389
						}

						if (rootInterface != -1) { // L: 3391
							class511.addPendingSpawnToScene(rootInterface, 0, 0, class340.canvasWidth, class491.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3392

						while (true) {
							Widget var32;
							Widget var51;
							ScriptEvent var54;
							do {
								var54 = (ScriptEvent)field542.removeLast(); // L: 3394
								if (var54 == null) { // L: 3395
									while (true) {
										do {
											var54 = (ScriptEvent)field734.removeLast(); // L: 3406
											if (var54 == null) { // L: 3407
												while (true) {
													do {
														var54 = (ScriptEvent)scriptEvents.removeLast(); // L: 3418
														if (var54 == null) { // L: 3419
															while (true) {
																while (true) {
																	class225 var55;
																	do {
																		do {
																			do {
																				var55 = (class225)field534.removeLast(); // L: 3430
																				if (var55 == null) { // L: 3431
																					this.menu(); // L: 3486
																					class30.method446(); // L: 3487
																					if (clickedWidget != null) { // L: 3488
																						this.method1274();
																					}

																					if (Scene.shouldSendWalk()) { // L: 3489
																						var4 = Scene.Scene_selectedX; // L: 3490
																						var5 = Scene.Scene_selectedY; // L: 3491
																						var24 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3221, packetWriter.isaacCipher); // L: 3493
																						var24.packetBuffer.writeByte(5); // L: 3494
																						var24.packetBuffer.method9244(class19.baseY * 64 + var5); // L: 3495
																						var24.packetBuffer.writeByte(field755.method4280(82) ? (field755.method4280(81) ? 2 : 1) : 0); // L: 3496
																						var24.packetBuffer.method9244(class20.baseX * 64 + var4); // L: 3497
																						packetWriter.addNode(var24); // L: 3498
																						Scene.method4783(); // L: 3499
																						mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3500
																						mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3501
																						mouseCrossColor = 1; // L: 3502
																						mouseCrossState = 0; // L: 3503
																						destinationX = var4; // L: 3504
																						destinationY = var5; // L: 3505
																					}

																					if (var50 != class64.mousedOverWidgetIf1) { // L: 3507
																						if (var50 != null) { // L: 3508
																							ClanChannelMember.invalidateWidget(var50);
																						}

																						if (class64.mousedOverWidgetIf1 != null) { // L: 3509
																							ClanChannelMember.invalidateWidget(class64.mousedOverWidgetIf1);
																						}
																					}

																					if (var44 != GrandExchangeOfferNameComparator.field4374 && field788 == field530) { // L: 3511
																						if (var44 != null) { // L: 3512
																							ClanChannelMember.invalidateWidget(var44);
																						}

																						if (GrandExchangeOfferNameComparator.field4374 != null) { // L: 3513
																							ClanChannelMember.invalidateWidget(GrandExchangeOfferNameComparator.field4374);
																						}
																					}

																					if (GrandExchangeOfferNameComparator.field4374 != null) { // L: 3515
																						if (field788 < field530) { // L: 3516
																							++field788; // L: 3517
																							if (field788 == field530) { // L: 3518
																								ClanChannelMember.invalidateWidget(GrandExchangeOfferNameComparator.field4374);
																							}
																						}
																					} else if (field788 > 0) { // L: 3521
																						--field788;
																					}

																					if (oculusOrbState == 0) { // L: 3523
																						var4 = TextureProvider.localPlayer.x; // L: 3524
																						var5 = TextureProvider.localPlayer.y; // L: 3525
																						if (ChatChannel.oculusOrbFocalPointX - var4 < -500 || ChatChannel.oculusOrbFocalPointX - var4 > 500 || AbstractWorldMapData.oculusOrbFocalPointY - var5 < -500 || AbstractWorldMapData.oculusOrbFocalPointY - var5 > 500) { // L: 3526
																							ChatChannel.oculusOrbFocalPointX = var4; // L: 3527
																							AbstractWorldMapData.oculusOrbFocalPointY = var5; // L: 3528
																						}

																						if (var4 != ChatChannel.oculusOrbFocalPointX) { // L: 3530
																							ChatChannel.oculusOrbFocalPointX += (var4 - ChatChannel.oculusOrbFocalPointX) / 16;
																						}

																						if (var5 != AbstractWorldMapData.oculusOrbFocalPointY) { // L: 3531
																							AbstractWorldMapData.oculusOrbFocalPointY += (var5 - AbstractWorldMapData.oculusOrbFocalPointY) / 16;
																						}

																						var6 = ChatChannel.oculusOrbFocalPointX >> 7; // L: 3532
																						var7 = AbstractWorldMapData.oculusOrbFocalPointY >> 7; // L: 3533
																						var8 = class115.getTileHeight(ChatChannel.oculusOrbFocalPointX, AbstractWorldMapData.oculusOrbFocalPointY, class87.Client_plane); // L: 3534
																						var9 = 0; // L: 3535
																						if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) { // L: 3536
																							for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) { // L: 3537
																								for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) { // L: 3538
																									var12 = class87.Client_plane; // L: 3539
																									if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) { // L: 3540
																										++var12;
																									}

																									int var34 = var8 - Tiles.Tiles_heights[var12][var10][var11]; // L: 3541
																									if (var34 > var9) { // L: 3542
																										var9 = var34;
																									}
																								}
																							}
																						}

																						var10 = var9 * 192; // L: 3546
																						if (var10 > 98048) { // L: 3547
																							var10 = 98048;
																						}

																						if (var10 < 32768) { // L: 3548
																							var10 = 32768;
																						}

																						if (var10 > field621) { // L: 3549
																							field621 += (var10 - field621) / 24;
																						} else if (var10 < field621) { // L: 3550
																							field621 += (var10 - field621) / 80;
																						}

																						class433.field4639 = class115.getTileHeight(TextureProvider.localPlayer.x, TextureProvider.localPlayer.y, class87.Client_plane) - camFollowHeight; // L: 3551
																					} else if (oculusOrbState == 1) { // L: 3553
																						if (field618 && TextureProvider.localPlayer != null) { // L: 3555
																							var4 = TextureProvider.localPlayer.pathX[0]; // L: 3556
																							var5 = TextureProvider.localPlayer.pathY[0]; // L: 3557
																							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 3558
																								ChatChannel.oculusOrbFocalPointX = TextureProvider.localPlayer.x; // L: 3559
																								var6 = class115.getTileHeight(TextureProvider.localPlayer.x, TextureProvider.localPlayer.y, class87.Client_plane) - camFollowHeight; // L: 3560
																								if (var6 < class433.field4639) { // L: 3561
																									class433.field4639 = var6;
																								}

																								AbstractWorldMapData.oculusOrbFocalPointY = TextureProvider.localPlayer.y; // L: 3562
																								field618 = false; // L: 3563
																							}
																						}

																						short var47 = -1; // L: 3566
																						if (field755.method4280(33)) { // L: 3567
																							var47 = 0;
																						} else if (field755.method4280(49)) { // L: 3568
																							var47 = 1024;
																						}

																						if (field755.method4280(48)) { // L: 3569
																							if (var47 == 0) { // L: 3570
																								var47 = 1792;
																							} else if (var47 == 1024) { // L: 3571
																								var47 = 1280;
																							} else {
																								var47 = 1536; // L: 3572
																							}
																						} else if (field755.method4280(50)) { // L: 3574
																							if (var47 == 0) { // L: 3575
																								var47 = 256;
																							} else if (var47 == 1024) { // L: 3576
																								var47 = 768;
																							} else {
																								var47 = 512; // L: 3577
																							}
																						}

																						byte var48 = 0; // L: 3579
																						if (field755.method4280(35)) { // L: 3580
																							var48 = -1;
																						} else if (field755.method4280(51)) { // L: 3581
																							var48 = 1;
																						}

																						var6 = 0; // L: 3582
																						if (var47 >= 0 || var48 != 0) { // L: 3583
																							var6 = field755.method4280(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed; // L: 3584
																							var6 *= 16; // L: 3585
																							field613 = var47; // L: 3586
																							field614 = var48; // L: 3587
																						}

																						if (field612 < var6) { // L: 3589
																							field612 += var6 / 8; // L: 3590
																							if (field612 > var6) { // L: 3591
																								field612 = var6;
																							}
																						} else if (field612 > var6) { // L: 3593
																							field612 = field612 * 9 / 10;
																						}

																						if (field612 > 0) { // L: 3594
																							var7 = field612 / 16; // L: 3595
																							if (field613 >= 0) { // L: 3596
																								var4 = field613 - DecorativeObject.cameraYaw & 2047; // L: 3597
																								var8 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 3598
																								var9 = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 3599
																								ChatChannel.oculusOrbFocalPointX += var7 * var8 / 65536; // L: 3600
																								AbstractWorldMapData.oculusOrbFocalPointY += var9 * var7 / 65536; // L: 3601
																							}

																							if (field614 != 0) { // L: 3603
																								class433.field4639 += var7 * field614; // L: 3604
																								if (class433.field4639 > 0) { // L: 3605
																									class433.field4639 = 0;
																								}
																							}
																						} else {
																							field613 = -1; // L: 3609
																							field614 = -1; // L: 3610
																						}

																						if (field755.method4280(13)) { // L: 3612
																							class425.method7821(); // L: 3613
																						}
																					}

																					if (MouseHandler.MouseHandler_currentButton == 4 && UserComparator8.mouseCam) { // L: 3616
																						var4 = MouseHandler.MouseHandler_y - field609; // L: 3617
																						field682 = var4 * 2; // L: 3618
																						field609 = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + field609) / 2 : MouseHandler.MouseHandler_y; // L: 3619
																						var5 = field608 - MouseHandler.MouseHandler_x; // L: 3620
																						field678 = var5 * 2; // L: 3621
																						field608 = var5 != -1 && var5 != 1 ? (field608 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x; // L: 3622
																					} else {
																						if (field755.method4280(96)) { // L: 3625
																							field678 += (-24 - field678) / 2;
																						} else if (field755.method4280(97)) { // L: 3626
																							field678 += (24 - field678) / 2;
																						} else {
																							field678 /= 2; // L: 3627
																						}

																						if (field755.method4280(98)) { // L: 3628
																							field682 += (12 - field682) / 2;
																						} else if (field755.method4280(99)) { // L: 3629
																							field682 += (-12 - field682) / 2;
																						} else {
																							field682 /= 2; // L: 3630
																						}

																						field609 = MouseHandler.MouseHandler_y; // L: 3631
																						field608 = MouseHandler.MouseHandler_x; // L: 3632
																					}

																					camAngleY = field678 / 2 + camAngleY & 2047; // L: 3634
																					camAngleX += field682 / 2; // L: 3635
																					if (camAngleX < 128) { // L: 3636
																						camAngleX = 128;
																					}

																					if (camAngleX > 383) { // L: 3637
																						camAngleX = 383;
																					}

																					if (field726) { // L: 3639
																						WorldMapSectionType.method5616(AbstractUserComparator.field4701, TriBool.field4718, JagexCache.field1844); // L: 3640
																						Projectile.method2184(class14.field76, GrandExchangeOfferOwnWorldComparator.field516); // L: 3641
																						if (AbstractUserComparator.field4701 == cameraX && class17.cameraY == TriBool.field4718 && JagexCache.field1844 == WorldMapArea.cameraZ && class14.field76 == class365.cameraPitch && DecorativeObject.cameraYaw == GrandExchangeOfferOwnWorldComparator.field516) { // L: 3642
																							field726 = false; // L: 3643
																							isCameraLocked = false; // L: 3644
																							field779 = false; // L: 3645
																							field780 = false; // L: 3646
																							class148.field1663 = 0; // L: 3647
																							BufferedNetSocket.field4722 = 0; // L: 3648
																							class161.field1754 = 0; // L: 3649
																							class232.field2431 = 0; // L: 3650
																							class465.field4788 = 0; // L: 3651
																							class131.field1535 = 0; // L: 3652
																							SecureRandomCallable.field1049 = 0; // L: 3653
																							class191.field1922 = 0; // L: 3654
																							MouseHandler.field224 = 0; // L: 3655
																							SoundSystem.field323 = 0; // L: 3656
																							field782 = null; // L: 3657
																							field784 = null; // L: 3658
																							field783 = null; // L: 3659
																						}
																					} else if (isCameraLocked) { // L: 3662
																						PcmPlayer.method819();
																					}

																					for (var4 = 0; var4 < 5; ++var4) { // L: 3663
																						int var10002 = field707[var4]++;
																					}

																					class33.varcs.tryWrite(); // L: 3664
																					var4 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 3667
																					var6 = BuddyRankComparator.method2936(); // L: 3670
																					if (var4 > 15000 && var6 > 15000) { // L: 3671
																						logoutTimer = 250; // L: 3672
																						class138.method3081(14500); // L: 3673
																						var31 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3226, packetWriter.isaacCipher); // L: 3675
																						packetWriter.addNode(var31); // L: 3676
																					}

																					InvDefinition.friendSystem.processFriendUpdates(); // L: 3678

																					for (var7 = 0; var7 < field815.size(); ++var7) { // L: 3680
																						var9 = (Integer)field815.get(var7); // L: 3682
																						class139 var35 = (class139)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var9); // L: 3686
																						class139 var36;
																						if (var35 != null) { // L: 3687
																							var36 = var35; // L: 3688
																						} else {
																							AbstractArchive var13 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 3692
																							AbstractArchive var14 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 3693
																							boolean var15 = true; // L: 3695
																							byte[] var16 = var13.getFile(var9 >> 16 & 65535, var9 & 65535); // L: 3696
																							class139 var37;
																							if (var16 == null) { // L: 3697
																								var15 = false; // L: 3698
																								var37 = null; // L: 3699
																							} else {
																								int var17 = (var16[1] & 255) << 8 | var16[2] & 255; // L: 3702
																								byte[] var18 = var14.getFile(var17, 0); // L: 3705
																								if (var18 == null) { // L: 3706
																									var15 = false;
																								}

																								if (!var15) { // L: 3707
																									var37 = null; // L: 3708
																								} else {
																									if (SoundCache.field333 == null) { // L: 3711
																										MusicPatchPcmStream.field3510 = Runtime.getRuntime().availableProcessors(); // L: 3712
																										SoundCache.field333 = new ThreadPoolExecutor(0, MusicPatchPcmStream.field3510, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(MusicPatchPcmStream.field3510 * 100 + 100), new class64(this)); // L: 3713
																									}

																									try {
																										var37 = new class139(var13, var14, var9, false); // L: 3721
																									} catch (Exception var39) { // L: 3723
																										var37 = null; // L: 3724
																									}
																								}
																							}

																							if (var37 != null) { // L: 3728
																								SequenceDefinition.SequenceDefinition_cachedModel.put(var37, (long)var9);
																							}

																							var36 = var37; // L: 3729
																						}

																						if (var36 == null) { // L: 3732
																							var8 = 2; // L: 3733
																						} else {
																							var8 = var36.method3091() ? 0 : 1; // L: 3736
																						}

																						if (var8 != 2) { // L: 3738
																							field815.remove(var7); // L: 3739
																							--var7; // L: 3740
																						}
																					}

																					++packetWriter.pendingWrites; // L: 3744
																					if (packetWriter.pendingWrites > 50) { // L: 3745
																						var31 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3180, packetWriter.isaacCipher); // L: 3747
																						packetWriter.addNode(var31); // L: 3748
																					}

																					try {
																						packetWriter.flush(); // L: 3751
																					} catch (IOException var38) { // L: 3753
																						class148.method3177(); // L: 3754
																					}

																					return; // L: 3756
																				}
																			} while(var55 == null); // L: 3433
																		} while(var55.field2365 == null);

																		if (var55.field2365.childIndex < 0) { // L: 3434
																			break;
																		}

																		var32 = class33.field184.method6240(var55.field2365.parentId); // L: 3435
																	} while(var32 == null || var32.children == null || var32.children.length == 0 || var55.field2365.childIndex >= var32.children.length || var55.field2365 != var32.children[var55.field2365.childIndex]); // L: 3436

																	if (var55.field2365.type == 11 && var55.field2368 == 0) { // L: 3440
																		if (var55.field2365.method6680(var55.field2370, var55.field2367, 0, 0)) { // L: 3441
																			switch(var55.field2365.method6631()) { // L: 3442
																			case 0:
																				VertexNormal.openURL(var55.field2365.method6609(), true, false); // L: 3464
																				break;
																			case 1:
																				var6 = MouseRecorder.getWidgetFlags(var55.field2365); // L: 3445
																				boolean var46 = (var6 >> 22 & 1) != 0; // L: 3447
																				if (var46) { // L: 3449
																					int[] var56 = var55.field2365.method6610(); // L: 3450
																					if (var56 != null) { // L: 3451
																						PacketBufferNode var33 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3137, packetWriter.isaacCipher); // L: 3452
																						var33.packetBuffer.method9344(var55.field2365.childIndex); // L: 3453
																						var33.packetBuffer.writeInt(var55.field2365.method6688()); // L: 3454
																						var33.packetBuffer.method9256(var55.field2365.id); // L: 3455
																						var33.packetBuffer.method9258(var56[1]); // L: 3456
																						var33.packetBuffer.method9423(var56[0]); // L: 3457
																						var33.packetBuffer.method9423(var56[2]); // L: 3458
																						packetWriter.addNode(var33); // L: 3459
																					}
																				}
																			}
																		}
																	} else if (var55.field2365.type == 12) { // L: 3469
																		class344 var57 = var55.field2365.method6614(); // L: 3470
																		if (var57 != null && var57.method6356()) { // L: 3471
																			switch(var55.field2368) { // L: 3472
																			case 0:
																				field756.method4216(var55.field2365); // L: 3477
																				var57.method6304(true); // L: 3478
																				var57.method6343(var55.field2370, var55.field2367, field755.method4280(82), field755.method4280(81)); // L: 3479
																				break;
																			case 1:
																				var57.method6562(var55.field2370, var55.field2367); // L: 3474
																			}
																		}
																	}
																}
															}
														}

														var32 = var54.widget; // L: 3420
														if (var32.childIndex < 0) { // L: 3421
															break;
														}

														var51 = class33.field184.method6240(var32.parentId); // L: 3422
													} while(var51 == null || var51.children == null || var32.childIndex >= var51.children.length || var32 != var51.children[var32.childIndex]); // L: 3423

													Interpreter.runScriptEvent(var54); // L: 3427
												}
											}

											var32 = var54.widget; // L: 3408
											if (var32.childIndex < 0) { // L: 3409
												break;
											}

											var51 = class33.field184.method6240(var32.parentId); // L: 3410
										} while(var51 == null || var51.children == null || var32.childIndex >= var51.children.length || var32 != var51.children[var32.childIndex]); // L: 3411

										Interpreter.runScriptEvent(var54); // L: 3415
									}
								}

								var32 = var54.widget; // L: 3396
								if (var32.childIndex < 0) { // L: 3397
									break;
								}

								var51 = class33.field184.method6240(var32.parentId); // L: 3398
							} while(var51 == null || var51.children == null || var32.childIndex >= var51.children.length || var32 != var51.children[var32.childIndex]); // L: 3399

							Interpreter.runScriptEvent(var54); // L: 3403
						}
					}

					var42 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3138, packetWriter.isaacCipher); // L: 3112
					var42.packetBuffer.writeByte(0); // L: 3113
					var3 = var42.packetBuffer.offset; // L: 3114
					class305.performReflectionCheck(var42.packetBuffer); // L: 3115
					var42.packetBuffer.method9200(var42.packetBuffer.offset - var3); // L: 3116
					packetWriter.addNode(var42); // L: 3117
				}
			}
		}
	} // L: 3094

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "328818380"
	)
	public void vmethod6161(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) { // L: 3937
			if (var1 > -1 && class91.clientPreferences.method2515() > 0 && !playingJingle) { // L: 3938
				PacketBufferNode var3 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3150, packetWriter.isaacCipher); // L: 3939
				var3.packetBuffer.writeInt(var1); // L: 3940
				packetWriter.addNode(var3); // L: 3941
			}

		}
	} // L: 3943

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1844765006"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class340.canvasWidth; // L: 4646
		int var2 = class491.canvasHeight; // L: 4647
		if (super.contentWidth < var1) { // L: 4648
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) { // L: 4649
			var2 = super.contentHeight;
		}

		if (class91.clientPreferences != null) { // L: 4650
			try {
				Client var3 = class159.client; // L: 4652
				Object[] var4 = new Object[]{class178.getWindowedMode()}; // L: 4653
				JSObject.getWindow(var3).call("resize", var4); // L: 4656
			} catch (Throwable var5) { // L: 4659
			}
		}

	} // L: 4661

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4664
			class178.method3552(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4665
			if (field739[var1]) { // L: 4666
				field735[var1] = true;
			}

			field677[var1] = field739[var1]; // L: 4667
			field739[var1] = false; // L: 4668
		}

		field738 = cycle; // L: 4670
		viewportX = -1; // L: 4671
		viewportY = -1; // L: 4672
		if (rootInterface != -1) { // L: 4673
			rootWidgetCount = 0; // L: 4674
			class410.method7604(rootInterface, 0, 0, class340.canvasWidth, class491.canvasHeight, 0, 0, -1); // L: 4675
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4677
		if (showMouseCross) { // L: 4678
			if (mouseCrossColor == 1) { // L: 4679
				EnumComposition.field2021[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4680
			}

			if (mouseCrossColor == 2) { // L: 4682
				EnumComposition.field2021[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4683
			}
		}

		int var2;
		int var3;
		int var4;
		int var6;
		int var7;
		int var8;
		if (!isMenuOpen) { // L: 4686
			if (viewportX != -1) { // L: 4687
				class135.method3072(viewportX, viewportY);
			}
		} else {
			var1 = KeyHandler.menuX; // L: 4690
			var2 = class463.menuY; // L: 4691
			var3 = class341.menuWidth; // L: 4692
			var4 = Language.menuHeight; // L: 4693
			int var5 = 6116423; // L: 4694
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5); // L: 4695
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0); // L: 4696
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0); // L: 4697
			SoundCache.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1); // L: 4698
			var6 = MouseHandler.MouseHandler_x; // L: 4699
			var7 = MouseHandler.MouseHandler_y; // L: 4700

			int var9;
			int var10;
			for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 4701
				var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31; // L: 4702
				var10 = 16777215; // L: 4703
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) { // L: 4704
					var10 = 16776960;
				}

				SoundCache.fontBold12.draw(class169.method3418(var8), var1 + 3, var9, var10, 0); // L: 4705
			}

			var8 = KeyHandler.menuX; // L: 4707
			var9 = class463.menuY; // L: 4708
			var10 = class341.menuWidth; // L: 4709
			int var11 = Language.menuHeight; // L: 4710

			for (int var12 = 0; var12 < rootWidgetCount; ++var12) { // L: 4712
				if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var10 + var8 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var9 && rootWidgetYs[var12] < var9 + var11) { // L: 4713
					field735[var12] = true;
				}
			}
		}

		if (field719 == 3) { // L: 4717
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4718
				if (field677[var1]) { // L: 4719
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4720
				} else if (field735[var1]) { // L: 4722
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4723
				}
			}
		}

		var1 = class87.Client_plane; // L: 4727
		var2 = TextureProvider.localPlayer.x; // L: 4728
		var3 = TextureProvider.localPlayer.y; // L: 4729
		var4 = field709; // L: 4730

		for (ObjectSound var13 = (ObjectSound)ObjectSound.objectSounds.last(); var13 != null; var13 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 4732
			if (var13.soundEffectId != -1 || var13.soundEffectIds != null) { // L: 4733
				var6 = 0; // L: 4734
				if (var2 > var13.maxX * 16384) { // L: 4735
					var6 += var2 - var13.maxX * 16384;
				} else if (var2 < var13.x * 128) { // L: 4736
					var6 += var13.x * 128 - var2;
				}

				if (var3 > var13.maxY * 16384) { // L: 4737
					var6 += var3 - var13.maxY * 16384;
				} else if (var3 < var13.y * 16384) { // L: 4738
					var6 += var13.y * 16384 - var3;
				}

				if (var6 - 64 <= var13.field853 && class91.clientPreferences.method2589() != 0 && var1 == var13.plane) { // L: 4739
					var6 -= 64; // L: 4750
					if (var6 < 0) { // L: 4751
						var6 = 0;
					}

					var7 = (var13.field853 - var6) * class91.clientPreferences.method2589() / var13.field853; // L: 4752
					Object var10000;
					if (var13.stream1 == null) { // L: 4753
						if (var13.soundEffectId >= 0) { // L: 4754
							var10000 = null; // L: 4755
							SoundEffect var14 = SoundEffect.readSoundEffect(class469.field4812, var13.soundEffectId, 0);
							if (var14 != null) { // L: 4756
								RawSound var15 = var14.toRawSound().resample(class136.decimator); // L: 4757
								RawPcmStream var16 = RawPcmStream.createRawPcmStream(var15, 100, var7); // L: 4758
								var16.setNumLoops(-1); // L: 4759
								class140.pcmStreamMixer.addSubStream(var16); // L: 4760
								var13.stream1 = var16; // L: 4761
							}
						}
					} else {
						var13.stream1.method880(var7); // L: 4765
					}

					if (var13.stream2 == null) { // L: 4766
						if (var13.soundEffectIds != null && (var13.field864 -= var4) <= 0) { // L: 4767
							var8 = (int)(Math.random() * (double)var13.soundEffectIds.length); // L: 4768
							var10000 = null; // L: 4769
							SoundEffect var18 = SoundEffect.readSoundEffect(class469.field4812, var13.soundEffectIds[var8], 0);
							if (var18 != null) { // L: 4770
								RawSound var19 = var18.toRawSound().resample(class136.decimator); // L: 4771
								RawPcmStream var17 = RawPcmStream.createRawPcmStream(var19, 100, var7); // L: 4772
								var17.setNumLoops(0); // L: 4773
								class140.pcmStreamMixer.addSubStream(var17); // L: 4774
								var13.stream2 = var17; // L: 4775
								var13.field864 = var13.field860 + (int)(Math.random() * (double)(var13.field862 - var13.field860)); // L: 4776
							}
						}
					} else {
						var13.stream2.method880(var7); // L: 4781
						if (!var13.stream2.hasNext()) { // L: 4782
							var13.stream2 = null; // L: 4783
						}
					}
				} else {
					if (var13.stream1 != null) { // L: 4740
						class140.pcmStreamMixer.removeSubStream(var13.stream1); // L: 4741
						var13.stream1 = null; // L: 4742
					}

					if (var13.stream2 != null) { // L: 4744
						class140.pcmStreamMixer.removeSubStream(var13.stream2); // L: 4745
						var13.stream2 = null; // L: 4746
					}
				}
			}
		}

		field709 = 0; // L: 4788
	} // L: 4789

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lez;IS)Z",
		garbageValue = "-3136"
	)
	boolean method1680(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 6474
			class358.friendsChatManager = null; // L: 6475
		} else {
			if (class358.friendsChatManager == null) { // L: 6478
				class358.friendsChatManager = new FriendsChatManager(class166.loginType, class159.client); // L: 6479
			}

			class358.friendsChatManager.method8009(var1.packetBuffer, var2); // L: 6481
		}

		UserComparator10.method2922(); // L: 6483
		var1.serverPacket = null; // L: 6484
		return true; // L: 6485
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)Z",
		garbageValue = "-1216543487"
	)
	boolean method1772(PacketWriter var1) {
		if (class358.friendsChatManager != null) { // L: 6489
			class358.friendsChatManager.method7985(var1.packetBuffer); // L: 6490
		}

		UserComparator10.method2922(); // L: 6492
		var1.serverPacket = null; // L: 6493
		return true; // L: 6494
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)Z",
		garbageValue = "1463612350"
	)
	final boolean method1268(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 6499
		PacketBuffer var3 = var1.packetBuffer; // L: 6500
		if (var2 == null) { // L: 6501
			return false;
		} else {
			String var21;
			int var22;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 6503
					if (var1.field1432) { // L: 6504
						if (!var2.isAvailable(1)) { // L: 6505
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 6506
						var1.field1429 = 0; // L: 6507
						var1.field1432 = false; // L: 6508
					}

					var3.offset = 0; // L: 6510
					if (var3.method9163()) { // L: 6511
						if (!var2.isAvailable(1)) { // L: 6512
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 6513
						var1.field1429 = 0; // L: 6514
					}

					var1.field1432 = true; // L: 6516
					ServerPacket[] var4 = class209.method3849(); // L: 6517
					var5 = var3.readSmartByteShortIsaac(); // L: 6518
					if (var5 < 0 || var5 >= var4.length) { // L: 6519
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 6520
					var1.serverPacketLength = var1.serverPacket.length; // L: 6521
				}

				if (var1.serverPacketLength == -1) { // L: 6523
					if (!var2.isAvailable(1)) { // L: 6524
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 6525
					var1.serverPacketLength = var3.array[0] & 255; // L: 6526
				}

				if (var1.serverPacketLength == -2) { // L: 6528
					if (!var2.isAvailable(2)) { // L: 6529
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 6530
					var3.offset = 0; // L: 6531
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 6532
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 6534
					return false;
				}

				var3.offset = 0; // L: 6535
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 6536
				var1.field1429 = 0; // L: 6537
				timer.method7832(); // L: 6538
				var1.field1433 = var1.field1420; // L: 6539
				var1.field1420 = var1.field1431; // L: 6540
				var1.field1431 = var1.serverPacket; // L: 6541
				if (ServerPacket.field3266 == var1.serverPacket) { // L: 6542
					return this.method1680(var1, 1); // L: 6543
				}

				byte var72;
				if (ServerPacket.field3287 == var1.serverPacket) { // L: 6545
					class172.method3496(); // L: 6546
					var72 = var3.readByte(); // L: 6547
					class148 var83 = new class148(var3); // L: 6548
					ClanSettings var67;
					if (var72 >= 0) { // L: 6550
						var67 = currentClanSettings[var72];
					} else {
						var67 = VerticalAlignment.guestClanSettings; // L: 6551
					}

					if (var67 == null) { // L: 6552
						this.method1277(var72); // L: 6553
						var1.serverPacket = null; // L: 6554
						return true; // L: 6555
					}

					if (var83.field1661 > var67.field1704) { // L: 6557
						this.method1277(var72); // L: 6558
						var1.serverPacket = null; // L: 6559
						return true; // L: 6560
					}

					if (var83.field1661 < var67.field1704) { // L: 6562
						var1.serverPacket = null; // L: 6563
						return true; // L: 6564
					}

					var83.method3167(var67); // L: 6566
					var1.serverPacket = null; // L: 6567
					return true; // L: 6568
				}

				if (ServerPacket.field3351 == var1.serverPacket) { // L: 6570
					class172.method3496(); // L: 6571
					var72 = var3.readByte(); // L: 6572
					if (var1.serverPacketLength == 1) { // L: 6573
						if (var72 >= 0) { // L: 6574
							currentClanSettings[var72] = null;
						} else {
							VerticalAlignment.guestClanSettings = null; // L: 6575
						}

						var1.serverPacket = null; // L: 6576
						return true; // L: 6577
					}

					if (var72 >= 0) { // L: 6579
						currentClanSettings[var72] = new ClanSettings(var3); // L: 6580
					} else {
						VerticalAlignment.guestClanSettings = new ClanSettings(var3); // L: 6583
					}

					var1.serverPacket = null; // L: 6585
					return true; // L: 6586
				}

				if (ServerPacket.field3348 == var1.serverPacket) { // L: 6588
					UrlRequest.method2877(class309.field3242); // L: 6589
					var1.serverPacket = null; // L: 6590
					return true; // L: 6591
				}

				if (ServerPacket.field3371 == var1.serverPacket) { // L: 6593
					class332.updateNpcs(true, var3); // L: 6594
					var1.serverPacket = null; // L: 6595
					return true; // L: 6596
				}

				int var7;
				int var8;
				int var20;
				if (ServerPacket.field3378 == var1.serverPacket) { // L: 6598
					var22 = var3.method9184(); // L: 6604
					var7 = var3.method9245(); // L: 6605
					var8 = var3.method9184(); // L: 6606
					var5 = var3.readUnsignedShort(); // L: 6607
					var20 = var3.method9184(); // L: 6608
					if (var20 == 65535) { // L: 6609
						var20 = -1; // L: 6610
					}

					ArrayList var56 = new ArrayList(); // L: 6612
					var56.add(var20); // L: 6613
					class202.method3764(var56, var5, var22, var7, var8); // L: 6614
					var1.serverPacket = null; // L: 6615
					return true; // L: 6616
				}

				if (ServerPacket.field3261 == var1.serverPacket) { // L: 6618
					isCameraLocked = true; // L: 6619
					field726 = false; // L: 6620
					field780 = true; // L: 6621
					var20 = NPC.method2684(var3.readShort() & 2027); // L: 6622
					var5 = class153.method3210(var3.readShort() & 2027); // L: 6623
					var22 = var3.readUnsignedShort(); // L: 6624
					var7 = var3.readUnsignedByte(); // L: 6625
					field784 = new class493(class365.cameraPitch, var5, var22, var7); // L: 6626
					field783 = new class493(DecorativeObject.cameraYaw, var20, var22, var7); // L: 6627
					var1.serverPacket = null; // L: 6628
					return true; // L: 6629
				}

				if (ServerPacket.field3265 == var1.serverPacket) { // L: 6631
					UrlRequest.method2877(class309.field3239); // L: 6632
					var1.serverPacket = null; // L: 6633
					return true; // L: 6634
				}

				Widget var6;
				if (ServerPacket.field3331 == var1.serverPacket) { // L: 6636
					var20 = var3.readInt(); // L: 6637
					var21 = var3.readStringCp1252NullTerminated(); // L: 6638
					var6 = class33.field184.method6240(var20); // L: 6639
					if (!var21.equals(var6.text)) { // L: 6640
						var6.text = var21; // L: 6641
						ClanChannelMember.invalidateWidget(var6); // L: 6642
					}

					var1.serverPacket = null; // L: 6644
					return true; // L: 6645
				}

				if (ServerPacket.field3299 == var1.serverPacket) { // L: 6647
					var22 = var3.method9237(); // L: 6651
					var5 = var3.method9245(); // L: 6652
					var20 = var3.method9184(); // L: 6653
					if (var5 == 65535) { // L: 6654
						var5 = -1; // L: 6655
					}

					NPC var86 = npcs[var20]; // L: 6657
					if (var86 != null) { // L: 6658
						if (var5 == var86.sequence && var5 != -1) { // L: 6659
							var8 = class36.SequenceDefinition_get(var5).field2340; // L: 6660
							if (var8 == 1) { // L: 6661
								var86.sequenceFrame = 0; // L: 6662
								var86.sequenceFrameCycle = 0; // L: 6663
								var86.sequenceDelay = var22; // L: 6664
								var86.field1235 = 0; // L: 6665
							} else if (var8 == 2) { // L: 6667
								var86.field1235 = 0; // L: 6668
							}
						} else if (var5 == -1 || var86.sequence == -1 || class36.SequenceDefinition_get(var5).field2333 >= class36.SequenceDefinition_get(var86.sequence).field2333) { // L: 6671
							var86.sequence = var5; // L: 6672
							var86.sequenceFrame = 0; // L: 6673
							var86.sequenceFrameCycle = 0; // L: 6674
							var86.sequenceDelay = var22; // L: 6675
							var86.field1235 = 0; // L: 6676
							var86.field1261 = var86.pathLength; // L: 6677
						}
					}

					var1.serverPacket = null; // L: 6681
					return true; // L: 6682
				}

				if (ServerPacket.field3257 == var1.serverPacket) { // L: 6684
					var20 = var3.method9245(); // L: 6685
					GrandExchangeOfferUnitPriceComparator.method7111(var20); // L: 6686
					field676[++field602 - 1 & 31] = var20 & 32767; // L: 6687
					var1.serverPacket = null; // L: 6688
					return true; // L: 6689
				}

				if (ServerPacket.field3339 == var1.serverPacket) { // L: 6691
					for (var20 = 0; var20 < VarpDefinition.field1924; ++var20) { // L: 6692
						VarpDefinition var82 = class150.VarpDefinition_get(var20); // L: 6693
						if (var82 != null) { // L: 6694
							Varps.Varps_temp[var20] = 0; // L: 6695
							Varps.Varps_main[var20] = 0; // L: 6696
						}
					}

					class304.method5860(); // L: 6699
					field631 += 32; // L: 6700
					var1.serverPacket = null; // L: 6701
					return true; // L: 6702
				}

				if (ServerPacket.field3381 == var1.serverPacket) { // L: 6704
					UrlRequest.method2877(class309.field3244); // L: 6705
					var1.serverPacket = null; // L: 6706
					return true; // L: 6707
				}

				String var55;
				if (ServerPacket.field3319 == var1.serverPacket) { // L: 6709
					byte[] var54 = new byte[var1.serverPacketLength]; // L: 6710
					var3.method9149(var54, 0, var54.length); // L: 6711
					Buffer var80 = new Buffer(var54); // L: 6712
					var55 = var80.readStringCp1252NullTerminated(); // L: 6713
					VertexNormal.openURL(var55, true, false); // L: 6714
					var1.serverPacket = null; // L: 6715
					return true; // L: 6716
				}

				if (ServerPacket.field3260 == var1.serverPacket) { // L: 6718
					var20 = var3.method9238(); // L: 6719
					var5 = var3.method9183(); // L: 6720
					if (var5 == 65535) { // L: 6721
						var5 = -1; // L: 6722
					}

					WorldMapEvent.performPlayerAnimation(TextureProvider.localPlayer, var5, var20); // L: 6724
					var1.serverPacket = null; // L: 6725
					return true; // L: 6726
				}

				if (ServerPacket.field3365 == var1.serverPacket) { // L: 6728
					var20 = var3.method9261(); // L: 6729
					var5 = var3.method9245(); // L: 6730
					var6 = class33.field184.method6240(var20); // L: 6731
					if (var6.modelType != 1 || var5 != var6.modelId) { // L: 6732
						var6.modelType = 1; // L: 6733
						var6.modelId = var5; // L: 6734
						ClanChannelMember.invalidateWidget(var6); // L: 6735
					}

					var1.serverPacket = null; // L: 6737
					return true; // L: 6738
				}

				if (ServerPacket.field3315 == var1.serverPacket) { // L: 6740
					var20 = var3.readUnsignedByte(); // L: 6741
					var5 = var3.readUnsignedByte(); // L: 6742
					var22 = var3.readUnsignedByte(); // L: 6743
					var7 = var3.readUnsignedByte(); // L: 6744
					field786[var20] = true; // L: 6745
					field787[var20] = var5; // L: 6746
					field680[var20] = var22; // L: 6747
					field789[var20] = var7; // L: 6748
					field707[var20] = 0; // L: 6749
					var1.serverPacket = null; // L: 6750
					return true; // L: 6751
				}

				if (ServerPacket.field3364 == var1.serverPacket) { // L: 6753
					field726 = false; // L: 6754
					isCameraLocked = false; // L: 6755
					field779 = false; // L: 6756
					field780 = false; // L: 6757
					class148.field1663 = 0; // L: 6758
					BufferedNetSocket.field4722 = 0; // L: 6759
					class161.field1754 = 0; // L: 6760
					field781 = false; // L: 6761
					class232.field2431 = 0; // L: 6762
					class465.field4788 = 0; // L: 6763
					class131.field1535 = 0; // L: 6764
					SecureRandomCallable.field1049 = 0; // L: 6765
					class191.field1922 = 0; // L: 6766
					MouseHandler.field224 = 0; // L: 6767
					SoundSystem.field323 = 0; // L: 6768
					field782 = null; // L: 6769
					field784 = null; // L: 6770
					field783 = null; // L: 6771

					for (var20 = 0; var20 < 5; ++var20) { // L: 6772
						field786[var20] = false; // L: 6773
					}

					var1.serverPacket = null; // L: 6775
					return true; // L: 6776
				}

				if (ServerPacket.field3318 == var1.serverPacket) { // L: 6778
					if (rootInterface != -1) { // L: 6779
						Interpreter.method2071(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6780
					return true; // L: 6781
				}

				if (ServerPacket.field3346 == var1.serverPacket) { // L: 6783
					class304.method5860(); // L: 6784
					field695 = var3.readUnsignedShort(); // L: 6785
					field729 = cycleCntr; // L: 6786
					var1.serverPacket = null; // L: 6787
					return true; // L: 6788
				}

				if (ServerPacket.field3370 == var1.serverPacket) { // L: 6790
					var20 = var3.method9259(); // L: 6791
					var5 = var3.method9236(); // L: 6792
					var6 = class33.field184.method6240(var20); // L: 6793
					UrlRequester.method2842(var6, TextureProvider.localPlayer.appearance.field3611, var5); // L: 6794
					ClanChannelMember.invalidateWidget(var6); // L: 6795
					var1.serverPacket = null; // L: 6796
					return true; // L: 6797
				}

				if (ServerPacket.field3262 == var1.serverPacket) { // L: 6799
					var20 = var3.readInt(); // L: 6800
					var5 = var3.readInt(); // L: 6801
					var22 = TileItem.getGcDuration(); // L: 6802
					PacketBufferNode var84 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3143, packetWriter.isaacCipher); // L: 6804
					var84.packetBuffer.method9423(var20); // L: 6805
					var84.packetBuffer.method9258(var5); // L: 6806
					var84.packetBuffer.writeByte(var22); // L: 6807
					var84.packetBuffer.method9234(GameEngine.fps); // L: 6808
					packetWriter.addNode(var84); // L: 6809
					var1.serverPacket = null; // L: 6810
					return true; // L: 6811
				}

				if (ServerPacket.field3283 == var1.serverPacket) { // L: 6813
					UrlRequest.method2877(class309.field3234); // L: 6814
					var1.serverPacket = null; // L: 6815
					return true; // L: 6816
				}

				int var10;
				int var24;
				if (ServerPacket.field3374 == var1.serverPacket) { // L: 6818
					isCameraLocked = true; // L: 6819
					field726 = false; // L: 6820
					field780 = false; // L: 6821
					class148.field1663 = var3.readUnsignedByte() * 128; // L: 6822
					BufferedNetSocket.field4722 = var3.readUnsignedByte() * 128; // L: 6823
					class161.field1754 = var3.readUnsignedShort(); // L: 6824
					class232.field2431 = var3.readUnsignedByte(); // L: 6825
					class465.field4788 = var3.readUnsignedByte(); // L: 6826
					if (class465.field4788 >= 100) { // L: 6827
						var20 = class148.field1663 * 16384 + 64; // L: 6828
						var5 = BufferedNetSocket.field4722 * 16384 + 64; // L: 6829
						var22 = class115.getTileHeight(var20, var5, class87.Client_plane) - class161.field1754; // L: 6830
						var7 = var20 - cameraX; // L: 6831
						var8 = var22 - class17.cameraY; // L: 6832
						var24 = var5 - WorldMapArea.cameraZ; // L: 6833
						var10 = (int)Math.sqrt((double)(var24 * var24 + var7 * var7)); // L: 6834
						class365.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 6835
						DecorativeObject.cameraYaw = (int)(Math.atan2((double)var7, (double)var24) * -325.9490051269531D) & 2047; // L: 6836
						if (class365.cameraPitch < 128) { // L: 6837
							class365.cameraPitch = 128;
						}

						if (class365.cameraPitch > 383) { // L: 6838
							class365.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6840
					return true; // L: 6841
				}

				if (ServerPacket.field3356 == var1.serverPacket) { // L: 6843
					var20 = var3.method9184(); // L: 6844
					var5 = var3.method9260(); // L: 6845
					var6 = class33.field184.method6240(var5); // L: 6846
					if (var6.modelType != 6 || var20 != var6.modelId) { // L: 6847
						var6.modelType = 6; // L: 6848
						var6.modelId = var20; // L: 6849
						ClanChannelMember.invalidateWidget(var6); // L: 6850
					}

					var1.serverPacket = null; // L: 6852
					return true; // L: 6853
				}

				if (ServerPacket.field3311 == var1.serverPacket) { // L: 6855
					var20 = var3.readUnsignedByte(); // L: 6856
					if (var3.readUnsignedByte() == 0) { // L: 6857
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 6858
						var3.offset += 18; // L: 6859
					} else {
						--var3.offset; // L: 6862
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 6863
					}

					field727 = cycleCntr; // L: 6865
					var1.serverPacket = null; // L: 6866
					return true; // L: 6867
				}

				if (ServerPacket.field3342 == var1.serverPacket) { // L: 6869
					class304.method5860(); // L: 6870
					weight = var3.readShort(); // L: 6871
					field729 = cycleCntr; // L: 6872
					var1.serverPacket = null; // L: 6873
					return true; // L: 6874
				}

				Widget var79;
				if (ServerPacket.field3336 == var1.serverPacket) { // L: 6876
					var20 = var3.method9259(); // L: 6877
					var79 = class33.field184.method6240(var20); // L: 6878
					var79.modelType = 3; // L: 6879
					var79.modelId = TextureProvider.localPlayer.appearance.getChatHeadId(); // L: 6880
					ClanChannelMember.invalidateWidget(var79); // L: 6881
					var1.serverPacket = null; // L: 6882
					return true; // L: 6883
				}

				if (ServerPacket.field3379 == var1.serverPacket) { // L: 6885
					tradeChatMode = var3.readUnsignedByte(); // L: 6886
					publicChatMode = var3.method9237(); // L: 6887
					var1.serverPacket = null; // L: 6888
					return true; // L: 6889
				}

				boolean var11;
				long var25;
				long var27;
				long var29;
				String var31;
				int var68;
				int var69;
				if (ServerPacket.field3341 == var1.serverPacket) { // L: 6891
					var72 = var3.readByte(); // L: 6892
					var25 = (long)var3.readUnsignedShort(); // L: 6893
					var27 = (long)var3.readMedium(); // L: 6894
					var29 = var27 + (var25 << 32); // L: 6895
					var11 = false; // L: 6896
					ClanChannel var63 = var72 >= 0 ? currentClanChannels[var72] : ClanChannelMember.guestClanChannel; // L: 6897
					if (var63 == null) { // L: 6898
						var11 = true;
					} else {
						for (var68 = 0; var68 < 100; ++var68) { // L: 6900
							if (field753[var68] == var29) { // L: 6901
								var11 = true; // L: 6902
								break; // L: 6903
							}
						}
					}

					if (!var11) { // L: 6907
						field753[field754] = var29; // L: 6908
						field754 = (field754 + 1) % 100; // L: 6909
						var31 = class172.method3430(var3); // L: 6910
						var69 = var72 >= 0 ? 43 : 46; // L: 6911
						class164.addChatMessage(var69, "", var31, var63.name); // L: 6912
					}

					var1.serverPacket = null; // L: 6914
					return true; // L: 6915
				}

				if (ServerPacket.field3324 == var1.serverPacket) { // L: 6917
					var1.serverPacket = null; // L: 6918
					return true; // L: 6919
				}

				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				int var60;
				byte var62;
				byte var85;
				int var87;
				if (ServerPacket.field3277 == var1.serverPacket) { // L: 6921
					var17 = var3.readUnsignedByte(); // L: 6937
					var60 = var3.method9254(); // L: 6938
					var62 = var3.readByte(); // L: 6939
					var69 = var3.method9236() * 4; // L: 6940
					var18 = var3.readUnsignedByte(); // L: 6941
					var68 = var3.method9237() * 4; // L: 6942
					var87 = var3.method9183(); // L: 6943
					var22 = var3.method9253(); // L: 6944
					var20 = var22 >> 16; // L: 6945
					var5 = var22 >> 8 & 255; // L: 6946
					var7 = var20 + (var22 >> 4 & 7); // L: 6947
					var8 = var5 + (var22 & 7); // L: 6948
					var16 = var3.method9245(); // L: 6949
					var15 = var3.method9183(); // L: 6950
					var85 = var3.readByte(); // L: 6951
					var24 = var85 + var7; // L: 6952
					var10 = var62 + var8; // L: 6953
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var24 >= 0 && var10 >= 0 && var24 < 104 && var10 < 104 && var87 != 65535) { // L: 6954
						var7 = var7 * 128 + 64; // L: 6955
						var8 = var8 * 128 + 64; // L: 6956
						var24 = var24 * 128 + 64; // L: 6957
						var10 = var10 * 128 + 64; // L: 6958
						var19 = new Projectile(var87, class87.Client_plane, var7, var8, class115.getTileHeight(var7, var8, class87.Client_plane) - var68, var15 + cycle, var16 + cycle, var17, var18, var60, var69); // L: 6959
						var19.setDestination(var24, var10, class115.getTileHeight(var24, var10, class87.Client_plane) - var69, var15 + cycle); // L: 6960
						projectiles.addFirst(var19); // L: 6961
					}

					var1.serverPacket = null; // L: 6963
					return true; // L: 6964
				}

				if (ServerPacket.field3272 == var1.serverPacket) { // L: 6966
					class151.loadRegions(true, var1.packetBuffer); // L: 6967
					var1.serverPacket = null; // L: 6968
					return true; // L: 6969
				}

				if (ServerPacket.field3345 == var1.serverPacket) { // L: 6971
					InvDefinition.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6972
					class492.FriendSystem_invalidateIgnoreds(); // L: 6973
					field723 = cycleCntr; // L: 6974
					var1.serverPacket = null; // L: 6975
					return true; // L: 6976
				}

				if (ServerPacket.field3289 == var1.serverPacket) { // L: 6978
					UrlRequest.method2877(class309.field3246); // L: 6979
					var1.serverPacket = null; // L: 6980
					return true; // L: 6981
				}

				Widget var23;
				if (ServerPacket.field3258 == var1.serverPacket) { // L: 6983
					var20 = var3.readInt(); // L: 6984
					var5 = var3.method9245(); // L: 6985
					if (var5 == 65535) { // L: 6986
						var5 = -1;
					}

					var22 = var3.method9260(); // L: 6987
					var23 = class33.field184.method6240(var22); // L: 6988
					ItemComposition var92;
					if (!var23.isIf3) { // L: 6989
						if (var5 == -1) { // L: 6990
							var23.modelType = 0; // L: 6991
							var1.serverPacket = null; // L: 6992
							return true; // L: 6993
						}

						var92 = class214.ItemComposition_get(var5).getCountObj(var20); // L: 6995
						var23.modelType = 4; // L: 6996
						var23.modelId = var5; // L: 6997
						var23.modelAngleX = var92.xan2d; // L: 6998
						var23.modelAngleY = var92.yan2d; // L: 6999
						var23.modelZoom = var92.zoom2d * 100 / var20; // L: 7000
						ClanChannelMember.invalidateWidget(var23); // L: 7001
					} else {
						var23.itemId = var5; // L: 7004
						var23.itemQuantity = var20; // L: 7005
						var92 = class214.ItemComposition_get(var5).getCountObj(var20); // L: 7006
						var23.modelAngleX = var92.xan2d; // L: 7007
						var23.modelAngleY = var92.yan2d; // L: 7008
						var23.modelAngleZ = var92.zan2d; // L: 7009
						var23.modelOffsetX = var92.offsetX2d; // L: 7010
						var23.modelOffsetY = var92.offsetY2d; // L: 7011
						var23.modelZoom = var92.zoom2d; // L: 7012
						if (var92.isStackable == 1) { // L: 7013
							var23.itemQuantityMode = 1;
						} else {
							var23.itemQuantityMode = 2; // L: 7014
						}

						if (var23.field3732 > 0) { // L: 7015
							var23.modelZoom = var23.modelZoom * 32 / var23.field3732;
						} else if (var23.rawWidth > 0) { // L: 7016
							var23.modelZoom = var23.modelZoom * 32 / var23.rawWidth;
						}

						ClanChannelMember.invalidateWidget(var23); // L: 7017
					}

					var1.serverPacket = null; // L: 7019
					return true; // L: 7020
				}

				if (ServerPacket.field3368 == var1.serverPacket) { // L: 7022
					UrlRequest.method2877(class309.field3236); // L: 7023
					var1.serverPacket = null; // L: 7024
					return true; // L: 7025
				}

				Widget var33;
				InterfaceParent var78;
				if (ServerPacket.field3377 == var1.serverPacket) { // L: 7027
					var20 = var3.readInt(); // L: 7028
					var5 = var3.method9260(); // L: 7029
					InterfaceParent var65 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7030
					var78 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7031
					if (var78 != null) { // L: 7032
						ArchiveDisk.closeInterface(var78, var65 == null || var65.group != var78.group);
					}

					if (var65 != null) { // L: 7033
						var65.remove(); // L: 7034
						interfaceParents.put(var65, (long)var5); // L: 7035
					}

					var33 = class33.field184.method6240(var20); // L: 7037
					if (var33 != null) { // L: 7038
						ClanChannelMember.invalidateWidget(var33);
					}

					var33 = class33.field184.method6240(var5); // L: 7039
					if (var33 != null) { // L: 7040
						ClanChannelMember.invalidateWidget(var33); // L: 7041
						PendingSpawn.revalidateWidgetScroll(class33.field184.field3587[var33.id >>> 16], var33, true); // L: 7042
					}

					if (rootInterface != -1) { // L: 7044
						Interpreter.method2071(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7045
					return true; // L: 7046
				}

				if (ServerPacket.field3375 == var1.serverPacket) { // L: 7048
					field517 = cycleCntr; // L: 7049
					var72 = var3.readByte(); // L: 7050
					if (var1.serverPacketLength == 1) { // L: 7051
						if (var72 >= 0) { // L: 7052
							currentClanChannels[var72] = null;
						} else {
							ClanChannelMember.guestClanChannel = null; // L: 7053
						}

						var1.serverPacket = null; // L: 7054
						return true; // L: 7055
					}

					if (var72 >= 0) { // L: 7057
						currentClanChannels[var72] = new ClanChannel(var3); // L: 7058
					} else {
						ClanChannelMember.guestClanChannel = new ClanChannel(var3); // L: 7061
					}

					var1.serverPacket = null; // L: 7063
					return true; // L: 7064
				}

				if (ServerPacket.field3264 == var1.serverPacket) { // L: 7066
					var20 = var3.method9184(); // L: 7067
					var5 = var3.method9237(); // L: 7068
					var22 = var3.method9259(); // L: 7069
					var78 = (InterfaceParent)interfaceParents.get((long)var22); // L: 7070
					if (var78 != null) { // L: 7071
						ArchiveDisk.closeInterface(var78, var20 != var78.group);
					}

					ClanChannel.method3396(var22, var20, var5); // L: 7072
					var1.serverPacket = null; // L: 7073
					return true; // L: 7074
				}

				if (ServerPacket.field3329 == var1.serverPacket) { // L: 7076
					minimapState = var3.readUnsignedByte(); // L: 7077
					var1.serverPacket = null; // L: 7078
					return true; // L: 7079
				}

				if (ServerPacket.field3276 == var1.serverPacket) { // L: 7081
					SequenceDefinition.field2316 = new class469(class53.Widget_cachedFonts); // L: 7082
					var1.serverPacket = null; // L: 7083
					return true; // L: 7084
				}

				if (ServerPacket.field3292 == var1.serverPacket) { // L: 7086
					var20 = var3.method9260(); // L: 7087
					var79 = class33.field184.method6240(var20); // L: 7088

					for (var22 = 0; var22 < var79.field3786.length; ++var22) { // L: 7089
						var79.field3786[var22] = -1; // L: 7090
						var79.field3786[var22] = 0; // L: 7091
					}

					ClanChannelMember.invalidateWidget(var79); // L: 7093
					var1.serverPacket = null; // L: 7094
					return true; // L: 7095
				}

				if (ServerPacket.field3332 == var1.serverPacket) { // L: 7097
					isCameraLocked = true; // L: 7098
					field726 = false; // L: 7099
					field780 = true; // L: 7100
					class148.field1663 = var3.readUnsignedByte() * 128; // L: 7101
					BufferedNetSocket.field4722 = var3.readUnsignedByte() * 128; // L: 7102
					class161.field1754 = var3.readUnsignedShort(); // L: 7103
					var20 = var3.readUnsignedShort(); // L: 7104
					var5 = var3.readUnsignedByte(); // L: 7105
					var22 = class148.field1663 * 16384 + 64; // L: 7106
					var7 = BufferedNetSocket.field4722 * 16384 + 64; // L: 7107
					var8 = class115.getTileHeight(var22, var7, class87.Client_plane) - class161.field1754; // L: 7108
					var24 = var22 - cameraX; // L: 7109
					var10 = var8 - class17.cameraY; // L: 7110
					var60 = var7 - WorldMapArea.cameraZ; // L: 7111
					double var91 = Math.sqrt((double)(var60 * var60 + var24 * var24)); // L: 7112
					var69 = class153.method3210((int)(Math.atan2((double)var10, var91) * 325.9490051269531D) & 2047); // L: 7113
					var15 = NPC.method2684((int)(Math.atan2((double)var24, (double)var60) * -325.9490051269531D) & 2047); // L: 7114
					field784 = new class493(class365.cameraPitch, var69, var20, var5); // L: 7115
					field783 = new class493(DecorativeObject.cameraYaw, var15, var20, var5); // L: 7116
					var1.serverPacket = null; // L: 7117
					return true; // L: 7118
				}

				if (ServerPacket.field3294 == var1.serverPacket) { // L: 7120
					var5 = var3.method9183(); // L: 7123
					var20 = var3.method9245(); // L: 7124
					ItemComposition.method4136(var20, var5); // L: 7125
					var1.serverPacket = null; // L: 7126
					return true; // L: 7127
				}

				if (ServerPacket.field3301 == var1.serverPacket) { // L: 7129
					class332.updateNpcs(false, var3); // L: 7130
					var1.serverPacket = null; // L: 7131
					return true; // L: 7132
				}

				if (ServerPacket.field3300 == var1.serverPacket) { // L: 7134
					var24 = var3.method9183(); // L: 7143
					var10 = var3.method9237(); // L: 7144
					var22 = var3.method9253(); // L: 7145
					var20 = var22 >> 16; // L: 7146
					var5 = var22 >> 8 & 255; // L: 7147
					var7 = var20 + (var22 >> 4 & 7); // L: 7148
					var8 = var5 + (var22 & 7); // L: 7149
					var60 = var3.method9184(); // L: 7150
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7151
						var7 = var7 * 128 + 64; // L: 7152
						var8 = var8 * 128 + 64; // L: 7153
						GraphicsObject var12 = new GraphicsObject(var24, class87.Client_plane, var7, var8, class115.getTileHeight(var7, var8, class87.Client_plane) - var10, var60, cycle); // L: 7154
						graphicsObjects.addFirst(var12); // L: 7155
					}

					var1.serverPacket = null; // L: 7157
					return true; // L: 7158
				}

				if (ServerPacket.field3273 == var1.serverPacket) { // L: 7160
					var20 = var3.readUnsignedByte(); // L: 7161
					class180.method3565(var20); // L: 7162
					var1.serverPacket = null; // L: 7163
					return true; // L: 7164
				}

				String var50;
				if (ServerPacket.field3279 == var1.serverPacket) { // L: 7166
					var50 = var3.readStringCp1252NullTerminated(); // L: 7167
					Object[] var77 = new Object[var50.length() + 1]; // L: 7168

					for (var22 = var50.length() - 1; var22 >= 0; --var22) { // L: 7169
						if (var50.charAt(var22) == 's') { // L: 7170
							var77[var22 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var77[var22 + 1] = new Integer(var3.readInt()); // L: 7171
						}
					}

					var77[0] = new Integer(var3.readInt()); // L: 7173
					ScriptEvent var64 = new ScriptEvent(); // L: 7174
					var64.args = var77; // L: 7175
					Interpreter.runScriptEvent(var64); // L: 7176
					var1.serverPacket = null; // L: 7177
					return true; // L: 7178
				}

				if (ServerPacket.field3322 == var1.serverPacket) { // L: 7180
					field517 = cycleCntr; // L: 7181
					var72 = var3.readByte(); // L: 7182
					class162 var76 = new class162(var3); // L: 7183
					ClanChannel var59;
					if (var72 >= 0) { // L: 7185
						var59 = currentClanChannels[var72];
					} else {
						var59 = ClanChannelMember.guestClanChannel; // L: 7186
					}

					if (var59 == null) { // L: 7187
						this.method1507(var72); // L: 7188
						var1.serverPacket = null; // L: 7189
						return true; // L: 7190
					}

					if (var76.field1758 > var59.field1775) { // L: 7192
						this.method1507(var72); // L: 7193
						var1.serverPacket = null; // L: 7194
						return true; // L: 7195
					}

					if (var76.field1758 < var59.field1775) { // L: 7197
						var1.serverPacket = null; // L: 7198
						return true; // L: 7199
					}

					var76.method3353(var59); // L: 7201
					var1.serverPacket = null; // L: 7202
					return true; // L: 7203
				}

				if (ServerPacket.field3306 == var1.serverPacket) { // L: 7205
					var20 = var3.method9184(); // L: 7206
					if (var20 == 65535) { // L: 7207
						var20 = -1;
					}

					rootInterface = var20; // L: 7208
					this.method1340(false); // L: 7209
					class357.method6796(var20); // L: 7210
					VerticalAlignment.method3845(rootInterface); // L: 7211

					for (var5 = 0; var5 < 100; ++var5) { // L: 7212
						field739[var5] = true;
					}

					var1.serverPacket = null; // L: 7213
					return true; // L: 7214
				}

				boolean var32;
				if (ServerPacket.field3286 == var1.serverPacket) { // L: 7216
					var50 = var3.readStringCp1252NullTerminated(); // L: 7217
					var25 = (long)var3.readUnsignedShort(); // L: 7218
					var27 = (long)var3.readMedium(); // L: 7219
					PlayerType var9 = (PlayerType)SequenceDefinition.findEnumerated(class183.PlayerType_values(), var3.readUnsignedByte()); // L: 7220
					long var36 = var27 + (var25 << 32); // L: 7221
					var32 = false; // L: 7222

					for (var68 = 0; var68 < 100; ++var68) { // L: 7223
						if (var36 == field753[var68]) { // L: 7224
							var32 = true; // L: 7225
							break; // L: 7226
						}
					}

					if (InvDefinition.friendSystem.isIgnored(new Username(var50, class166.loginType))) { // L: 7229
						var32 = true;
					}

					if (!var32 && field790 == 0) { // L: 7230
						field753[field754] = var36; // L: 7231
						field754 = (field754 + 1) % 100; // L: 7232
						var31 = AbstractFont.escapeBrackets(HealthBarUpdate.method2462(class172.method3430(var3))); // L: 7233
						byte var70;
						if (var9.isPrivileged) { // L: 7235
							var70 = 7;
						} else {
							var70 = 3; // L: 7236
						}

						if (var9.modIcon != -1) { // L: 7237
							class411.addGameMessage(var70, class436.method7916(var9.modIcon) + var50, var31);
						} else {
							class411.addGameMessage(var70, var50, var31); // L: 7238
						}
					}

					var1.serverPacket = null; // L: 7240
					return true; // L: 7241
				}

				if (ServerPacket.field3304 == var1.serverPacket) { // L: 7243
					var20 = var3.readShort(); // L: 7244
					var5 = var3.method9259(); // L: 7245
					var22 = var3.method9281(); // L: 7246
					var23 = class33.field184.method6240(var5); // L: 7247
					if (var20 != var23.rawX || var22 != var23.rawY || var23.xAlignment != 0 || var23.yAlignment != 0) { // L: 7248
						var23.rawX = var20; // L: 7249
						var23.rawY = var22; // L: 7250
						var23.xAlignment = 0; // L: 7251
						var23.yAlignment = 0; // L: 7252
						ClanChannelMember.invalidateWidget(var23); // L: 7253
						this.alignWidget(var23); // L: 7254
						if (var23.type == 0) { // L: 7255
							PendingSpawn.revalidateWidgetScroll(class33.field184.field3587[var5 >> 16], var23, false);
						}
					}

					var1.serverPacket = null; // L: 7257
					return true; // L: 7258
				}

				if (ServerPacket.field3382 == var1.serverPacket) { // L: 7260
					var20 = var3.readInt(); // L: 7261
					var5 = var3.method9238(); // L: 7262
					var22 = var3.readUnsignedByte(); // L: 7263
					var23 = class33.field184.method6240(var20); // L: 7264
					UrlRequest.method2875(var23, var22, var5); // L: 7265
					ClanChannelMember.invalidateWidget(var23); // L: 7266
					var1.serverPacket = null; // L: 7267
					return true; // L: 7268
				}

				if (ServerPacket.field3305 == var1.serverPacket) { // L: 7270
					var20 = var3.method9184(); // L: 7271
					var5 = var3.readInt(); // L: 7272
					var22 = var20 >> 10 & 31; // L: 7273
					var7 = var20 >> 5 & 31; // L: 7274
					var8 = var20 & 31; // L: 7275
					var24 = (var7 << 11) + (var22 << 19) + (var8 << 3); // L: 7276
					Widget var97 = class33.field184.method6240(var5); // L: 7277
					if (var24 != var97.color) { // L: 7278
						var97.color = var24; // L: 7279
						ClanChannelMember.invalidateWidget(var97); // L: 7280
					}

					var1.serverPacket = null; // L: 7282
					return true; // L: 7283
				}

				if (ServerPacket.field3308 == var1.serverPacket) { // L: 7285
					var20 = var3.method9245(); // L: 7286
					byte var71 = var3.readByte(); // L: 7287
					Varps.Varps_temp[var20] = var71; // L: 7288
					if (Varps.Varps_main[var20] != var71) { // L: 7289
						Varps.Varps_main[var20] = var71; // L: 7290
					}

					ScriptEvent.changeGameOptions(var20); // L: 7292
					field716[++field631 - 1 & 31] = var20; // L: 7293
					var1.serverPacket = null; // L: 7294
					return true; // L: 7295
				}

				boolean var61;
				if (ServerPacket.field3296 == var1.serverPacket) { // L: 7297
					var20 = var3.method9260(); // L: 7298
					var61 = var3.readUnsignedByte() == 1; // L: 7299
					var6 = class33.field184.method6240(var20); // L: 7300
					class366.method6820(var6, TextureProvider.localPlayer.appearance, var61); // L: 7301
					ClanChannelMember.invalidateWidget(var6); // L: 7302
					var1.serverPacket = null; // L: 7303
					return true; // L: 7304
				}

				if (ServerPacket.field3349 == var1.serverPacket) { // L: 7306
					var20 = var3.method9184(); // L: 7313
					if (var20 == 65535) { // L: 7314
						var20 = -1; // L: 7315
					}

					var24 = var3.readUnsignedShort(); // L: 7317
					var7 = var3.method9184(); // L: 7318
					var8 = var3.method9183(); // L: 7319
					var22 = var3.method9184(); // L: 7320
					var5 = var3.method9183(); // L: 7321
					if (var5 == 65535) { // L: 7322
						var5 = -1; // L: 7323
					}

					ArrayList var95 = new ArrayList(); // L: 7325
					var95.add(var20); // L: 7326
					var95.add(var5); // L: 7327
					class202.method3764(var95, var22, var7, var8, var24); // L: 7328
					var1.serverPacket = null; // L: 7329
					return true; // L: 7330
				}

				if (ServerPacket.field3358 == var1.serverPacket) { // L: 7332
					return this.method1772(var1); // L: 7333
				}

				if (ServerPacket.field3376 == var1.serverPacket) { // L: 7335
					UrlRequest.method2877(class309.field3243); // L: 7336
					var1.serverPacket = null; // L: 7337
					return true; // L: 7338
				}

				if (ServerPacket.field3290 == var1.serverPacket) { // L: 7340
					UrlRequest.method2877(class309.field3240); // L: 7341
					var1.serverPacket = null; // L: 7342
					return true; // L: 7343
				}

				if (ServerPacket.field3327 == var1.serverPacket) { // L: 7345
					SequenceDefinition.field2316 = null; // L: 7346
					var1.serverPacket = null; // L: 7347
					return true; // L: 7348
				}

				if (ServerPacket.field3367 == var1.serverPacket) { // L: 7350
					UrlRequest.method2877(class309.field3238); // L: 7351
					var1.serverPacket = null; // L: 7352
					return true; // L: 7353
				}

				if (ServerPacket.field3354 == var1.serverPacket) { // L: 7355
					var20 = var3.readUnsignedShort(); // L: 7356
					var5 = var3.readUnsignedByte(); // L: 7357
					var22 = var3.readUnsignedShort(); // L: 7358
					GraphicsDefaults.queueSoundEffect(var20, var5, var22); // L: 7359
					var1.serverPacket = null; // L: 7360
					return true; // L: 7361
				}

				long var34;
				if (ServerPacket.field3383 == var1.serverPacket) { // L: 7363
					var20 = var3.offset + var1.serverPacketLength; // L: 7364
					var5 = var3.readUnsignedShort(); // L: 7365
					if (var5 == 65535) { // L: 7366
						var5 = -1;
					}

					var22 = var3.readUnsignedShort(); // L: 7367
					if (var5 != rootInterface) { // L: 7368
						rootInterface = var5; // L: 7369
						this.method1340(false); // L: 7370
						class357.method6796(rootInterface); // L: 7371
						VerticalAlignment.method3845(rootInterface); // L: 7372

						for (var7 = 0; var7 < 100; ++var7) { // L: 7373
							field739[var7] = true;
						}
					}

					InterfaceParent var93;
					for (; var22-- > 0; var93.field1074 = true) { // L: 7375 7385
						var7 = var3.readInt(); // L: 7376
						var8 = var3.readUnsignedShort(); // L: 7377
						var24 = var3.readUnsignedByte(); // L: 7378
						var93 = (InterfaceParent)interfaceParents.get((long)var7); // L: 7379
						if (var93 != null && var8 != var93.group) { // L: 7380
							ArchiveDisk.closeInterface(var93, true); // L: 7381
							var93 = null; // L: 7382
						}

						if (var93 == null) { // L: 7384
							var93 = ClanChannel.method3396(var7, var8, var24);
						}
					}

					for (var78 = (InterfaceParent)interfaceParents.first(); var78 != null; var78 = (InterfaceParent)interfaceParents.next()) { // L: 7387
						if (var78.field1074) { // L: 7388
							var78.field1074 = false;
						} else {
							ArchiveDisk.closeInterface(var78, true); // L: 7390
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 7393

					while (var3.offset < var20) { // L: 7394
						var7 = var3.readInt(); // L: 7395
						var8 = var3.readUnsignedShort(); // L: 7396
						var24 = var3.readUnsignedShort(); // L: 7397
						var10 = var3.readInt(); // L: 7398

						for (var60 = var8; var60 <= var24; ++var60) { // L: 7399
							var34 = ((long)var7 << 32) + (long)var60; // L: 7400
							widgetFlags.put(new IntegerNode(var10), var34); // L: 7401
						}
					}

					var1.serverPacket = null; // L: 7404
					return true; // L: 7405
				}

				if (ServerPacket.field3313 == var1.serverPacket) { // L: 7407
					Tiles.updatePlayers(var3, var1.serverPacketLength); // L: 7408
					SecureRandomCallable.method2285(); // L: 7409
					var1.serverPacket = null; // L: 7410
					return true; // L: 7411
				}

				boolean var74;
				if (ServerPacket.field3314 == var1.serverPacket) { // L: 7413
					var74 = var3.readUnsignedByte() == 1; // L: 7414
					if (var74) { // L: 7415
						class411.field4526 = GrandExchangeOfferTotalQuantityComparator.method7049() - var3.readLong(); // L: 7416
						Varps.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 7417
					} else {
						Varps.grandExchangeEvents = null; // L: 7419
					}

					field744 = cycleCntr; // L: 7420
					var1.serverPacket = null; // L: 7421
					return true; // L: 7422
				}

				if (ServerPacket.field3268 == var1.serverPacket) { // L: 7424
					Clock.field1891 = var3.readUnsignedByte(); // L: 7425
					class354.field3856 = var3.readUnsignedByte(); // L: 7426
					var1.serverPacket = null; // L: 7427
					return true; // L: 7428
				}

				if (ServerPacket.field3281 == var1.serverPacket) { // L: 7430
					var20 = var3.readInt(); // L: 7431
					var5 = var3.readInt(); // L: 7432
					var6 = class33.field184.method6240(var5); // L: 7433
					class309.method5870(var6, var20); // L: 7434
					ClanChannelMember.invalidateWidget(var6); // L: 7435
					var1.serverPacket = null; // L: 7436
					return true; // L: 7437
				}

				if (ServerPacket.field3280 == var1.serverPacket) { // L: 7439
					var24 = var3.method9237(); // L: 7450
					var10 = var24 >> 2; // L: 7451
					var60 = var24 & 3; // L: 7452
					var87 = field596[var10]; // L: 7453
					var22 = var3.method9252(); // L: 7454
					var20 = var22 >> 16; // L: 7455
					var5 = var22 >> 8 & 255; // L: 7456
					var7 = var20 + (var22 >> 4 & 7); // L: 7457
					var8 = var5 + (var22 & 7); // L: 7458
					var68 = var3.method9183(); // L: 7459
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) { // L: 7460
						if (var87 == 0) { // L: 7461
							WallObject var100 = class10.scene.method4681(class87.Client_plane, var7, var8); // L: 7462
							if (var100 != null) { // L: 7463
								var15 = SecureRandomFuture.Entity_unpackID(var100.tag); // L: 7464
								if (var10 == 2) { // L: 7465
									var100.renderable1 = new DynamicObject(var15, 2, var60 + 4, class87.Client_plane, var7, var8, var68, false, var100.renderable1); // L: 7466
									var100.renderable2 = new DynamicObject(var15, 2, var60 + 1 & 3, class87.Client_plane, var7, var8, var68, false, var100.renderable2); // L: 7467
								} else {
									var100.renderable1 = new DynamicObject(var15, var10, var60, class87.Client_plane, var7, var8, var68, false, var100.renderable1); // L: 7469
								}
							}
						} else if (var87 == 1) { // L: 7472
							DecorativeObject var98 = class10.scene.method4682(class87.Client_plane, var7, var8); // L: 7473
							if (var98 != null) { // L: 7474
								var15 = SecureRandomFuture.Entity_unpackID(var98.tag); // L: 7475
								if (var10 != 4 && var10 != 5) { // L: 7476
									if (var10 == 6) { // L: 7479
										var98.renderable1 = new DynamicObject(var15, 4, var60 + 4, class87.Client_plane, var7, var8, var68, false, var98.renderable1); // L: 7480
									} else if (var10 == 7) { // L: 7482
										var98.renderable1 = new DynamicObject(var15, 4, (var60 + 2 & 3) + 4, class87.Client_plane, var7, var8, var68, false, var98.renderable1); // L: 7483
									} else if (var10 == 8) { // L: 7485
										var98.renderable1 = new DynamicObject(var15, 4, var60 + 4, class87.Client_plane, var7, var8, var68, false, var98.renderable1); // L: 7486
										var98.renderable2 = new DynamicObject(var15, 4, (var60 + 2 & 3) + 4, class87.Client_plane, var7, var8, var68, false, var98.renderable2); // L: 7487
									}
								} else {
									var98.renderable1 = new DynamicObject(var15, 4, var60, class87.Client_plane, var7, var8, var68, false, var98.renderable1); // L: 7477
								}
							}
						} else if (var87 == 2) { // L: 7491
							GameObject var94 = class10.scene.getGameObject(class87.Client_plane, var7, var8); // L: 7492
							if (var10 == 11) { // L: 7493
								var10 = 10; // L: 7494
							}

							if (var94 != null) { // L: 7496
								var94.renderable = new DynamicObject(SecureRandomFuture.Entity_unpackID(var94.tag), var10, var60, class87.Client_plane, var7, var8, var68, false, var94.renderable); // L: 7497
							}
						} else if (var87 == 3) { // L: 7500
							GroundObject var96 = class10.scene.getGroundObject(class87.Client_plane, var7, var8); // L: 7501
							if (var96 != null) { // L: 7502
								var96.renderable = new DynamicObject(SecureRandomFuture.Entity_unpackID(var96.tag), 22, var60, class87.Client_plane, var7, var8, var68, false, var96.renderable); // L: 7503
							}
						}
					}

					var1.serverPacket = null; // L: 7507
					return true; // L: 7508
				}

				if (ServerPacket.field3334 == var1.serverPacket) { // L: 7510
					var5 = var3.method9245(); // L: 7516
					var7 = var3.method9237(); // L: 7517
					var20 = var3.method9184(); // L: 7518
					Player var90;
					if (var20 == localPlayerIndex) { // L: 7519
						var90 = TextureProvider.localPlayer; // L: 7520
					} else {
						var90 = players[var20]; // L: 7523
					}

					var22 = var3.readInt(); // L: 7525
					if (var90 != null) { // L: 7526
						var90.method2426(var7, var5, var22 >> 16, var22 & 65535); // L: 7527
					}

					var1.serverPacket = null; // L: 7529
					return true; // L: 7530
				}

				if (ServerPacket.field3340 == var1.serverPacket) { // L: 7532
					var20 = var3.readInt(); // L: 7533
					var61 = var3.readUnsignedByte() == 1; // L: 7534
					var6 = class33.field184.method6240(var20); // L: 7535
					if (var61 != var6.isHidden) { // L: 7536
						var6.isHidden = var61; // L: 7537
						ClanChannelMember.invalidateWidget(var6); // L: 7538
					}

					var1.serverPacket = null; // L: 7540
					return true; // L: 7541
				}

				if (ServerPacket.field3303 == var1.serverPacket) { // L: 7543
					var20 = var3.method9184(); // L: 7548
					var5 = var3.readUnsignedShort(); // L: 7549
					var22 = var3.method9183(); // L: 7550
					var7 = var3.method9184(); // L: 7551
					class206.method3837(var20, var5, var22, var7); // L: 7552
					var1.serverPacket = null; // L: 7553
					return true; // L: 7554
				}

				if (ServerPacket.field3352 == var1.serverPacket) { // L: 7556
					rebootTimer = var3.method9245() * 30; // L: 7557
					field729 = cycleCntr; // L: 7558
					var1.serverPacket = null; // L: 7559
					return true; // L: 7560
				}

				if (ServerPacket.field3343 == var1.serverPacket) { // L: 7562
					var20 = var3.method9259(); // L: 7563
					var5 = var3.method9183(); // L: 7564
					var6 = class33.field184.method6240(var20); // L: 7565
					if (var6 != null && var6.type == 0) { // L: 7566
						if (var5 > var6.scrollHeight - var6.height) { // L: 7567
							var5 = var6.scrollHeight - var6.height;
						}

						if (var5 < 0) { // L: 7568
							var5 = 0;
						}

						if (var5 != var6.scrollY) { // L: 7569
							var6.scrollY = var5; // L: 7570
							ClanChannelMember.invalidateWidget(var6); // L: 7571
						}
					}

					var1.serverPacket = null; // L: 7574
					return true; // L: 7575
				}

				if (ServerPacket.field3282 == var1.serverPacket) { // L: 7577
					var20 = var3.method9259(); // L: 7578
					var5 = var3.method9183(); // L: 7579
					if (var5 == 65535) { // L: 7580
						var5 = -1;
					}

					var22 = var3.readUnsignedShort(); // L: 7581
					if (var22 == 65535) { // L: 7582
						var22 = -1;
					}

					var7 = var3.method9260(); // L: 7583

					for (var8 = var22; var8 <= var5; ++var8) { // L: 7584
						var29 = ((long)var7 << 32) + (long)var8; // L: 7585
						Node var99 = widgetFlags.get(var29); // L: 7586
						if (var99 != null) { // L: 7587
							var99.remove();
						}

						widgetFlags.put(new IntegerNode(var20), var29); // L: 7588
					}

					var1.serverPacket = null; // L: 7590
					return true; // L: 7591
				}

				if (ServerPacket.field3263 == var1.serverPacket) { // L: 7593
					var20 = var3.method9245(); // L: 7594
					if (var20 == 65535) { // L: 7595
						var20 = -1;
					}

					MusicPatch.playSong(var20); // L: 7596
					var1.serverPacket = null; // L: 7597
					return true; // L: 7598
				}

				if (ServerPacket.field3274 == var1.serverPacket) { // L: 7600
					var20 = var3.method9184(); // L: 7601
					if (var20 == 65535) { // L: 7602
						var20 = -1;
					}

					var5 = var3.method9252(); // L: 7603
					class437.method7924(var20, var5); // L: 7604
					var1.serverPacket = null; // L: 7605
					return true; // L: 7606
				}

				if (ServerPacket.field3326 == var1.serverPacket) { // L: 7608
					World var53 = new World(); // L: 7609
					var53.host = var3.readStringCp1252NullTerminated(); // L: 7610
					var53.id = var3.readUnsignedShort(); // L: 7611
					var5 = var3.readInt(); // L: 7612
					var53.properties = var5; // L: 7613
					if (var53.isDeadman()) { // L: 7614
						var53.field833 = "beta"; // L: 7615
					}

					DefaultsGroup.method8263(45); // L: 7617
					var2.close(); // L: 7618
					var2 = null; // L: 7619
					Language.changeWorld(var53); // L: 7620
					var1.serverPacket = null; // L: 7621
					return false; // L: 7622
				}

				NPC var89;
				if (ServerPacket.field3269 == var1.serverPacket) { // L: 7624
					var20 = var3.method9184(); // L: 7625
					short var66 = (short)var3.method9249(); // L: 7626
					var22 = var3.method9259(); // L: 7627
					var7 = var3.method9237(); // L: 7628
					var89 = npcs[var20]; // L: 7629
					if (var89 != null) { // L: 7630
						var89.method2666(var7, var22, var66); // L: 7631
					}

					var1.serverPacket = null; // L: 7633
					return true; // L: 7634
				}

				if (ServerPacket.field3321 == var1.serverPacket) { // L: 7636
					var50 = var3.readStringCp1252NullTerminated(); // L: 7637
					var5 = var3.readUnsignedByte(); // L: 7638
					var22 = var3.method9237(); // L: 7639
					if (var5 >= 1 && var5 <= 8) { // L: 7640
						if (var50.equalsIgnoreCase("null")) { // L: 7641
							var50 = null;
						}

						playerMenuActions[var5 - 1] = var50; // L: 7642
						playerOptionsPriorities[var5 - 1] = var22 == 0; // L: 7643
					}

					var1.serverPacket = null; // L: 7645
					return true; // L: 7646
				}

				if (ServerPacket.field3298 == var1.serverPacket) { // L: 7648
					var5 = var3.method9259(); // L: 7654
					var22 = var3.method9245(); // L: 7655
					var7 = var3.readUnsignedByte(); // L: 7656
					var20 = var3.readUnsignedShort(); // L: 7657
					var89 = npcs[var20]; // L: 7658
					if (var89 != null) { // L: 7659
						var89.method2426(var7, var22, var5 >> 16, var5 & 65535); // L: 7660
					}

					var1.serverPacket = null; // L: 7662
					return true; // L: 7663
				}

				if (ServerPacket.field3293 == var1.serverPacket) { // L: 7665
					for (var20 = 0; var20 < players.length; ++var20) { // L: 7666
						if (players[var20] != null) { // L: 7667
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 7669
						if (npcs[var20] != null) { // L: 7670
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 7672
					return true; // L: 7673
				}

				if (ServerPacket.field3271 == var1.serverPacket) { // L: 7675
					destinationX = var3.readUnsignedByte(); // L: 7676
					if (destinationX == 255) { // L: 7677
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 7678
					if (destinationY == 255) { // L: 7679
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 7680
					return true; // L: 7681
				}

				if (ServerPacket.field3372 == var1.serverPacket) { // L: 7683
					if (SequenceDefinition.field2316 == null) { // L: 7684
						SequenceDefinition.field2316 = new class469(class53.Widget_cachedFonts);
					}

					class538 var52 = class53.Widget_cachedFonts.method8450(var3); // L: 7685
					SequenceDefinition.field2316.field4815.vmethod8918(var52.field5205, var52.field5204); // L: 7686
					field720[++field721 - 1 & 31] = var52.field5205; // L: 7687
					var1.serverPacket = null; // L: 7688
					return true; // L: 7689
				}

				if (ServerPacket.field3317 == var1.serverPacket) { // L: 7691
					var20 = var3.readUShortSmart(); // L: 7692
					var61 = var3.readUnsignedByte() == 1; // L: 7693
					var55 = ""; // L: 7694
					boolean var58 = false; // L: 7695
					if (var61) { // L: 7696
						var55 = var3.readStringCp1252NullTerminated(); // L: 7697
						if (InvDefinition.friendSystem.isIgnored(new Username(var55, class166.loginType))) { // L: 7698
							var58 = true;
						}
					}

					String var88 = var3.readStringCp1252NullTerminated(); // L: 7700
					if (!var58) { // L: 7701
						class411.addGameMessage(var20, var55, var88);
					}

					var1.serverPacket = null; // L: 7702
					return true; // L: 7703
				}

				if (ServerPacket.field3295 == var1.serverPacket) { // L: 7705
					Clock.field1891 = var3.readUnsignedByte(); // L: 7706
					class354.field3856 = var3.method9238(); // L: 7707

					while (var3.offset < var1.serverPacketLength) { // L: 7708
						var20 = var3.readUnsignedByte(); // L: 7709
						class309 var75 = class404.method7414()[var20]; // L: 7710
						UrlRequest.method2877(var75); // L: 7711
					}

					var1.serverPacket = null; // L: 7713
					return true; // L: 7714
				}

				if (ServerPacket.field3363 == var1.serverPacket) { // L: 7716
					var20 = var3.readInt(); // L: 7717
					var5 = var3.readUnsignedShort(); // L: 7718
					if (var20 < -70000) { // L: 7719
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7721
						var6 = class33.field184.method6240(var20);
					} else {
						var6 = null; // L: 7722
					}

					for (; var3.offset < var1.serverPacketLength; SecureRandomFuture.itemContainerSetItem(var5, var7, var8 - 1, var24)) { // L: 7723 7737
						var7 = var3.readUShortSmart(); // L: 7724
						var8 = var3.readUnsignedShort(); // L: 7725
						var24 = 0; // L: 7726
						if (var8 != 0) { // L: 7727
							var24 = var3.readUnsignedByte(); // L: 7728
							if (var24 == 255) { // L: 7729
								var24 = var3.readInt();
							}
						}

						if (var6 != null && var7 >= 0 && var7 < var6.field3786.length) { // L: 7731 7732
							var6.field3786[var7] = var8; // L: 7733
							var6.field3809[var7] = var24; // L: 7734
						}
					}

					if (var6 != null) { // L: 7739
						ClanChannelMember.invalidateWidget(var6);
					}

					class304.method5860(); // L: 7740
					field676[++field602 - 1 & 31] = var5 & 32767; // L: 7741
					var1.serverPacket = null; // L: 7742
					return true; // L: 7743
				}

				if (ServerPacket.field3320 == var1.serverPacket) { // L: 7745
					InvDefinition.friendSystem.method1889(); // L: 7746
					field723 = cycleCntr; // L: 7747
					var1.serverPacket = null; // L: 7748
					return true; // L: 7749
				}

				if (ServerPacket.field3344 == var1.serverPacket) { // L: 7751
					UrlRequest.method2877(class309.field3245); // L: 7752
					var1.serverPacket = null; // L: 7753
					return true; // L: 7754
				}

				if (ServerPacket.field3259 == var1.serverPacket) { // L: 7756
					var3.offset += 28; // L: 7757
					if (var3.checkCrc()) { // L: 7758
						NPC.method2643(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 7759
					return true; // L: 7760
				}

				if (ServerPacket.field3316 == var1.serverPacket) { // L: 7762
					var20 = var3.readInt(); // L: 7763
					var5 = var3.method9184(); // L: 7764
					var6 = class33.field184.method6240(var20); // L: 7765
					if (var6.modelType != 2 || var5 != var6.modelId) { // L: 7766
						var6.modelType = 2; // L: 7767
						var6.modelId = var5; // L: 7768
						ClanChannelMember.invalidateWidget(var6); // L: 7769
					}

					var1.serverPacket = null; // L: 7771
					return true; // L: 7772
				}

				if (ServerPacket.field3297 == var1.serverPacket) { // L: 7774
					var20 = var3.method9261(); // L: 7775
					var5 = var3.method9245(); // L: 7776
					var22 = var3.readUnsignedShort(); // L: 7777
					var23 = class33.field184.method6240(var20); // L: 7778
					var23.field3733 = var5 + (var22 << 16); // L: 7779
					var1.serverPacket = null; // L: 7780
					return true; // L: 7781
				}

				if (ServerPacket.field3373 == var1.serverPacket) { // L: 7783
					var20 = var3.readInt(); // L: 7784
					if (var20 != field547) { // L: 7785
						field547 = var20; // L: 7786
						class174.method3513(); // L: 7787
					}

					var1.serverPacket = null; // L: 7789
					return true; // L: 7790
				}

				if (ServerPacket.field3337 == var1.serverPacket) { // L: 7792
					class357.readReflectionCheck(var3, var1.serverPacketLength); // L: 7793
					var1.serverPacket = null; // L: 7794
					return true; // L: 7795
				}

				if (ServerPacket.field3307 == var1.serverPacket) { // L: 7797
					var20 = var3.readInt(); // L: 7798
					InterfaceParent var73 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7799
					if (var73 != null) { // L: 7800
						ArchiveDisk.closeInterface(var73, true);
					}

					if (meslayerContinueWidget != null) { // L: 7801
						ClanChannelMember.invalidateWidget(meslayerContinueWidget); // L: 7802
						meslayerContinueWidget = null; // L: 7803
					}

					var1.serverPacket = null; // L: 7805
					return true; // L: 7806
				}

				if (ServerPacket.field3312 == var1.serverPacket) { // L: 7808
					var20 = var3.readInt(); // L: 7809
					var5 = var3.readUnsignedShort(); // L: 7810
					if (var20 < -70000) { // L: 7811
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 7813
						var6 = class33.field184.method6240(var20);
					} else {
						var6 = null; // L: 7814
					}

					if (var6 != null) { // L: 7815
						for (var7 = 0; var7 < var6.field3786.length; ++var7) { // L: 7816
							var6.field3786[var7] = 0; // L: 7817
							var6.field3809[var7] = 0; // L: 7818
						}
					}

					class155.clearItemContainer(var5); // L: 7821
					var7 = var3.readUnsignedShort(); // L: 7822

					for (var8 = 0; var8 < var7; ++var8) { // L: 7823
						var24 = var3.readUnsignedByte(); // L: 7824
						if (var24 == 255) { // L: 7825
							var24 = var3.method9260();
						}

						var10 = var3.readUnsignedShort(); // L: 7826
						if (var6 != null && var8 < var6.field3786.length) { // L: 7827 7828
							var6.field3786[var8] = var10; // L: 7829
							var6.field3809[var8] = var24; // L: 7830
						}

						SecureRandomFuture.itemContainerSetItem(var5, var8, var10 - 1, var24); // L: 7833
					}

					if (var6 != null) { // L: 7835
						ClanChannelMember.invalidateWidget(var6);
					}

					class304.method5860(); // L: 7836
					field676[++field602 - 1 & 31] = var5 & 32767; // L: 7837
					var1.serverPacket = null; // L: 7838
					return true; // L: 7839
				}

				if (ServerPacket.field3285 == var1.serverPacket) { // L: 7841
					class304.method5860(); // L: 7842
					var20 = var3.readUnsignedByte(); // L: 7843
					var5 = var3.method9238(); // L: 7844
					var22 = var3.method9260(); // L: 7845
					experience[var20] = var22; // L: 7846
					currentLevels[var20] = var5; // L: 7847
					levels[var20] = 1; // L: 7848

					for (var7 = 0; var7 < 98; ++var7) { // L: 7849
						if (var22 >= Skills.Skills_experienceTable[var7]) {
							levels[var20] = var7 + 2;
						}
					}

					field718[++field605 - 1 & 31] = var20; // L: 7850
					var1.serverPacket = null; // L: 7851
					return true; // L: 7852
				}

				if (ServerPacket.field3310 == var1.serverPacket) { // L: 7854
					return this.method1680(var1, 2); // L: 7855
				}

				if (ServerPacket.field3330 == var1.serverPacket) { // L: 7857
					UrlRequest.method2877(class309.field3237); // L: 7858
					var1.serverPacket = null; // L: 7859
					return true; // L: 7860
				}

				if (ServerPacket.field3270 == var1.serverPacket) { // L: 7862
					hintArrowType = var3.readUnsignedByte(); // L: 7863
					if (hintArrowType == 1) { // L: 7864
						field540 = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 7865
						if (hintArrowType == 2) { // L: 7866
							field629 = 4096; // L: 7867
							field797 = 4096; // L: 7868
						}

						if (hintArrowType == 3) { // L: 7870
							field629 = 0; // L: 7871
							field797 = 4096; // L: 7872
						}

						if (hintArrowType == 4) { // L: 7874
							field629 = 8192; // L: 7875
							field797 = 4096; // L: 7876
						}

						if (hintArrowType == 5) { // L: 7878
							field629 = 4096; // L: 7879
							field797 = 0; // L: 7880
						}

						if (hintArrowType == 6) { // L: 7882
							field629 = 4096; // L: 7883
							field797 = 8192; // L: 7884
						}

						hintArrowType = 2; // L: 7886
						field583 = var3.readUnsignedShort(); // L: 7887
						field543 = var3.readUnsignedShort(); // L: 7888
						field544 = var3.readUnsignedByte() * 2; // L: 7889
					}

					if (hintArrowType == 10) { // L: 7891
						field541 = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 7892
					return true; // L: 7893
				}

				if (ServerPacket.field3302 == var1.serverPacket) { // L: 7895
					InvDefinition.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 7896
					field723 = cycleCntr; // L: 7897
					var1.serverPacket = null; // L: 7898
					return true; // L: 7899
				}

				if (ServerPacket.field3359 == var1.serverPacket) { // L: 7901
					var20 = var3.method9260(); // L: 7902
					var5 = var3.method9245(); // L: 7903
					Varps.Varps_temp[var5] = var20; // L: 7904
					if (Varps.Varps_main[var5] != var20) { // L: 7905
						Varps.Varps_main[var5] = var20; // L: 7906
					}

					ScriptEvent.changeGameOptions(var5); // L: 7908
					field716[++field631 - 1 & 31] = var5; // L: 7909
					var1.serverPacket = null; // L: 7910
					return true; // L: 7911
				}

				if (ServerPacket.field3275 == var1.serverPacket) { // L: 7913
					class151.loadRegions(false, var1.packetBuffer); // L: 7914
					var1.serverPacket = null; // L: 7915
					return true; // L: 7916
				}

				if (ServerPacket.field3361 == var1.serverPacket) { // L: 7918
					Clock.field1891 = var3.readUnsignedByte(); // L: 7919
					class354.field3856 = var3.method9237(); // L: 7920

					for (var20 = Clock.field1891; var20 < Clock.field1891 + 8; ++var20) { // L: 7921
						for (var5 = class354.field3856; var5 < class354.field3856 + 8; ++var5) { // L: 7922
							if (groundItems[class87.Client_plane][var20][var5] != null) { // L: 7923
								groundItems[class87.Client_plane][var20][var5] = null; // L: 7924
								class30.updateItemPile(var20, var5); // L: 7925
							}
						}
					}

					for (PendingSpawn var51 = (PendingSpawn)pendingSpawns.last(); var51 != null; var51 = (PendingSpawn)pendingSpawns.previous()) { // L: 7929 7930 7932
						if (var51.x >= Clock.field1891 && var51.x < Clock.field1891 + 8 && var51.y >= class354.field3856 && var51.y < class354.field3856 + 8 && var51.plane == class87.Client_plane) { // L: 7931
							var51.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 7934
					return true; // L: 7935
				}

				if (ServerPacket.field3323 == var1.serverPacket) { // L: 7937
					isCameraLocked = true; // L: 7938
					field726 = false; // L: 7939
					field780 = true; // L: 7940
					var20 = var3.readShort(); // L: 7941
					var5 = var3.readShort(); // L: 7942
					var22 = class153.method3210(var5 + class365.cameraPitch & 2027); // L: 7943
					var7 = var20 + DecorativeObject.cameraYaw; // L: 7944
					var8 = var3.readUnsignedShort(); // L: 7945
					var24 = var3.readUnsignedByte(); // L: 7946
					field784 = new class493(class365.cameraPitch, var22, var8, var24); // L: 7947
					field783 = new class493(DecorativeObject.cameraYaw, var7, var8, var24); // L: 7948
					var1.serverPacket = null; // L: 7949
					return true; // L: 7950
				}

				if (ServerPacket.field3309 == var1.serverPacket) { // L: 7952
					Canvas.privateChatMode = UserComparator9.method2919(var3.readUnsignedByte()); // L: 7953
					var1.serverPacket = null; // L: 7954
					return true; // L: 7955
				}

				if (ServerPacket.field3380 == var1.serverPacket) { // L: 7957
					var87 = var3.method9184(); // L: 7973
					var22 = var3.method9252(); // L: 7974
					var20 = var22 >> 16; // L: 7975
					var5 = var22 >> 8 & 255; // L: 7976
					var7 = var20 + (var22 >> 4 & 7); // L: 7977
					var8 = var5 + (var22 & 7); // L: 7978
					var18 = var3.method9183(); // L: 7979
					var68 = var3.method9237() * 4; // L: 7980
					var85 = var3.method9240(); // L: 7981
					var62 = var3.method9239(); // L: 7982
					var16 = var3.method9184(); // L: 7983
					var15 = var3.method9183(); // L: 7984
					var60 = var3.method9208(); // L: 7985
					var17 = var3.method9238(); // L: 7986
					var69 = var3.method9236() * 4; // L: 7987
					var24 = var85 + var7; // L: 7988
					var10 = var62 + var8; // L: 7989
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var24 >= 0 && var10 >= 0 && var24 < 104 && var10 < 104 && var87 != 65535) { // L: 7990
						var7 = var7 * 128 + 64; // L: 7991
						var8 = var8 * 128 + 64; // L: 7992
						var24 = var24 * 128 + 64; // L: 7993
						var10 = var10 * 128 + 64; // L: 7994
						var19 = new Projectile(var87, class87.Client_plane, var7, var8, class115.getTileHeight(var7, var8, class87.Client_plane) - var68, var15 + cycle, var16 + cycle, var17, var18, var60, var69); // L: 7995
						var19.setDestination(var24, var10, class115.getTileHeight(var24, var10, class87.Client_plane) - var69, var15 + cycle); // L: 7996
						projectiles.addFirst(var19); // L: 7997
					}

					var1.serverPacket = null; // L: 7999
					return true; // L: 8000
				}

				String var41;
				if (ServerPacket.field3267 == var1.serverPacket) { // L: 8002
					var50 = var3.readStringCp1252NullTerminated(); // L: 8003
					var25 = var3.readLong(); // L: 8004
					var27 = (long)var3.readUnsignedShort(); // L: 8005
					var29 = (long)var3.readMedium(); // L: 8006
					PlayerType var40 = (PlayerType)SequenceDefinition.findEnumerated(class183.PlayerType_values(), var3.readUnsignedByte()); // L: 8007
					var34 = (var27 << 32) + var29; // L: 8008
					boolean var14 = false; // L: 8009

					for (var15 = 0; var15 < 100; ++var15) { // L: 8010
						if (var34 == field753[var15]) { // L: 8011
							var14 = true; // L: 8012
							break; // L: 8013
						}
					}

					if (var40.isUser && InvDefinition.friendSystem.isIgnored(new Username(var50, class166.loginType))) { // L: 8016 8017
						var14 = true;
					}

					if (!var14 && field790 == 0) { // L: 8019
						field753[field754] = var34; // L: 8020
						field754 = (field754 + 1) % 100; // L: 8021
						var41 = AbstractFont.escapeBrackets(HealthBarUpdate.method2462(class172.method3430(var3))); // L: 8022
						if (var40.modIcon != -1) { // L: 8023
							class164.addChatMessage(9, class436.method7916(var40.modIcon) + var50, var41, class163.base37DecodeLong(var25));
						} else {
							class164.addChatMessage(9, var50, var41, class163.base37DecodeLong(var25)); // L: 8024
						}
					}

					var1.serverPacket = null; // L: 8026
					return true; // L: 8027
				}

				if (ServerPacket.field3338 == var1.serverPacket && isCameraLocked) { // L: 8029 8030
					field726 = true; // L: 8031
					field780 = false; // L: 8032
					field779 = false; // L: 8033

					for (var20 = 0; var20 < 5; ++var20) { // L: 8034
						field786[var20] = false; // L: 8035
					}

					var1.serverPacket = null; // L: 8037
					return true; // L: 8038
				}

				if (ServerPacket.field3291 == var1.serverPacket) { // L: 8041
					var20 = var3.method9412(); // L: 8042
					var5 = var3.method9260(); // L: 8043
					var6 = class33.field184.method6240(var5); // L: 8044
					if (var20 != var6.sequenceId || var20 == -1) { // L: 8045
						var6.sequenceId = var20; // L: 8046
						var6.modelFrame = 0; // L: 8047
						var6.modelFrameCycle = 0; // L: 8048
						ClanChannelMember.invalidateWidget(var6); // L: 8049
					}

					var1.serverPacket = null; // L: 8051
					return true; // L: 8052
				}

				if (ServerPacket.field3278 == var1.serverPacket) { // L: 8054
					var74 = var3.readBoolean(); // L: 8055
					if (var74) { // L: 8056
						if (DecorativeObject.field2871 == null) { // L: 8057
							DecorativeObject.field2871 = new class384();
						}
					} else {
						DecorativeObject.field2871 = null; // L: 8059
					}

					var1.serverPacket = null; // L: 8060
					return true; // L: 8061
				}

				if (ServerPacket.field3333 == var1.serverPacket) { // L: 8063
					var72 = var3.readByte(); // L: 8064
					var21 = var3.readStringCp1252NullTerminated(); // L: 8065
					long var42 = (long)var3.readUnsignedShort(); // L: 8066
					long var44 = (long)var3.readMedium(); // L: 8067
					PlayerType var38 = (PlayerType)SequenceDefinition.findEnumerated(class183.PlayerType_values(), var3.readUnsignedByte()); // L: 8068
					long var46 = (var42 << 32) + var44; // L: 8069
					boolean var13 = false; // L: 8070
					ClanChannel var39 = null; // L: 8071
					var39 = var72 >= 0 ? currentClanChannels[var72] : ClanChannelMember.guestClanChannel; // L: 8073
					if (var39 == null) { // L: 8074
						var13 = true; // L: 8075
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var38.isUser && InvDefinition.friendSystem.isIgnored(new Username(var21, class166.loginType))) { // L: 8084 8085
									var13 = true;
								}
								break;
							}

							if (field753[var15] == var46) { // L: 8079
								var13 = true; // L: 8080
								break; // L: 8081
							}

							++var15; // L: 8078
						}
					}

					if (!var13) { // L: 8088
						field753[field754] = var46; // L: 8089
						field754 = (field754 + 1) % 100; // L: 8090
						var41 = AbstractFont.escapeBrackets(class172.method3430(var3)); // L: 8091
						var16 = var72 >= 0 ? 41 : 44; // L: 8092
						if (var38.modIcon != -1) { // L: 8093
							class164.addChatMessage(var16, class436.method7916(var38.modIcon) + var21, var41, var39.name);
						} else {
							class164.addChatMessage(var16, var21, var41, var39.name); // L: 8094
						}
					}

					var1.serverPacket = null; // L: 8096
					return true; // L: 8097
				}

				if (ServerPacket.field3362 == var1.serverPacket) { // L: 8099
					isCameraLocked = true; // L: 8100
					field726 = false; // L: 8101
					field779 = true; // L: 8102
					class191.field1922 = var3.readUnsignedByte() * 16384; // L: 8103
					MouseHandler.field224 = var3.readUnsignedByte() * 128; // L: 8104
					var20 = var3.readUnsignedShort(); // L: 8105
					var5 = var3.readUnsignedShort(); // L: 8106
					field781 = var3.readBoolean(); // L: 8107
					var22 = var3.readUnsignedByte(); // L: 8108
					var7 = class191.field1922 * 128 + 64; // L: 8109
					var8 = MouseHandler.field224 * 16384 + 64; // L: 8110
					boolean var81 = false; // L: 8111
					boolean var57 = false; // L: 8112
					if (field781) { // L: 8113
						var24 = class17.cameraY; // L: 8114
						var10 = class115.getTileHeight(var7, var8, class87.Client_plane) - var20; // L: 8115
					} else {
						var24 = class115.getTileHeight(cameraX, WorldMapArea.cameraZ, class87.Client_plane) - class17.cameraY; // L: 8118
						var10 = var20; // L: 8119
					}

					field782 = new class492(cameraX, WorldMapArea.cameraZ, var24, var7, var8, var10, var5, var22); // L: 8121
					var1.serverPacket = null; // L: 8122
					return true; // L: 8123
				}

				if (ServerPacket.field3353 == var1.serverPacket) { // L: 8125
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 8126
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) { // L: 8127
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 8128
							ScriptEvent.changeGameOptions(var20); // L: 8129
							field716[++field631 - 1 & 31] = var20; // L: 8130
						}
					}

					var1.serverPacket = null; // L: 8133
					return true; // L: 8134
				}

				if (ServerPacket.field3288 == var1.serverPacket) { // L: 8136
					var20 = var3.readUnsignedByte(); // L: 8137
					class7.forceDisconnect(var20); // L: 8138
					var1.serverPacket = null; // L: 8139
					return false; // L: 8140
				}

				if (ServerPacket.field3347 == var1.serverPacket) { // L: 8142
					isCameraLocked = true; // L: 8143
					field726 = false; // L: 8144
					field779 = true; // L: 8145
					class191.field1922 = var3.readUnsignedByte() * 16384; // L: 8146
					MouseHandler.field224 = var3.readUnsignedByte() * 128; // L: 8147
					var20 = var3.readUnsignedShort(); // L: 8148
					var5 = var3.readUnsignedByte() * 128 + 64; // L: 8149
					var22 = var3.readUnsignedByte() * 128 + 64; // L: 8150
					var7 = var3.readUnsignedShort(); // L: 8151
					field781 = var3.readBoolean(); // L: 8152
					var8 = var3.readUnsignedByte(); // L: 8153
					var24 = class191.field1922 * 128 + 64; // L: 8154
					var10 = MouseHandler.field224 * 16384 + 64; // L: 8155
					var11 = false; // L: 8156
					var32 = false; // L: 8157
					if (field781) { // L: 8158
						var60 = class17.cameraY; // L: 8159
						var87 = class115.getTileHeight(var24, var10, class87.Client_plane) - var20; // L: 8160
					} else {
						var60 = class115.getTileHeight(cameraX, WorldMapArea.cameraZ, class87.Client_plane) - class17.cameraY; // L: 8163
						var87 = var20; // L: 8164
					}

					field782 = new class491(cameraX, WorldMapArea.cameraZ, var60, var24, var10, var87, var5, var22, var7, var8); // L: 8166
					var1.serverPacket = null; // L: 8167
					return true; // L: 8168
				}

				if (ServerPacket.field3328 == var1.serverPacket) { // L: 8170
					CollisionMap.method4301(); // L: 8171
					var1.serverPacket = null; // L: 8172
					return false; // L: 8173
				}

				if (ServerPacket.field3369 == var1.serverPacket) { // L: 8175
					isCameraLocked = true; // L: 8176
					field726 = false; // L: 8177
					field779 = false; // L: 8178
					class191.field1922 = var3.readUnsignedByte() * 16384; // L: 8179
					MouseHandler.field224 = var3.readUnsignedByte() * 128; // L: 8180
					SoundSystem.field323 = var3.readUnsignedShort(); // L: 8181
					SecureRandomCallable.field1049 = var3.readUnsignedByte(); // L: 8182
					class131.field1535 = var3.readUnsignedByte(); // L: 8183
					if (class131.field1535 >= 100) { // L: 8184
						cameraX = class191.field1922 * 128 + 64; // L: 8185
						WorldMapArea.cameraZ = MouseHandler.field224 * 16384 + 64; // L: 8186
						class17.cameraY = class115.getTileHeight(cameraX, WorldMapArea.cameraZ, class87.Client_plane) - SoundSystem.field323; // L: 8187
					}

					var1.serverPacket = null; // L: 8189
					return true; // L: 8190
				}

				if (ServerPacket.field3284 == var1.serverPacket) { // L: 8192
					var50 = var3.readStringCp1252NullTerminated(); // L: 8193
					var21 = AbstractFont.escapeBrackets(HealthBarUpdate.method2462(class172.method3430(var3))); // L: 8194
					class411.addGameMessage(6, var50, var21); // L: 8195
					var1.serverPacket = null; // L: 8196
					return true; // L: 8197
				}

				if (ServerPacket.field3355 == var1.serverPacket) { // L: 8199
					World.method1852(var3.readStringCp1252NullTerminated()); // L: 8200
					var1.serverPacket = null; // L: 8201
					return true; // L: 8202
				}

				if (ServerPacket.field3366 == var1.serverPacket) { // L: 8204
					var20 = var3.readUnsignedShort(); // L: 8205
					var5 = var3.method9259(); // L: 8206
					var22 = var3.readUnsignedShort(); // L: 8207
					var7 = var3.method9183(); // L: 8208
					var33 = class33.field184.method6240(var5); // L: 8209
					if (var20 != var33.modelAngleX || var7 != var33.modelAngleY || var22 != var33.modelZoom) { // L: 8210
						var33.modelAngleX = var20; // L: 8211
						var33.modelAngleY = var7; // L: 8212
						var33.modelZoom = var22; // L: 8213
						ClanChannelMember.invalidateWidget(var33); // L: 8214
					}

					var1.serverPacket = null; // L: 8216
					return true; // L: 8217
				}

				if (ServerPacket.field3335 == var1.serverPacket) { // L: 8219
					UrlRequest.method2877(class309.field3241); // L: 8220
					var1.serverPacket = null; // L: 8221
					return true; // L: 8222
				}

				if (ServerPacket.field3360 == var1.serverPacket) { // L: 8224
					UrlRequest.method2877(class309.field3235); // L: 8225
					var1.serverPacket = null; // L: 8226
					return true; // L: 8227
				}

				class190.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1420 != null ? var1.field1420.id : -1) + "," + (var1.field1433 != null ? var1.field1433.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 8229
				CollisionMap.method4301(); // L: 8230
			} catch (IOException var48) { // L: 8232
				class148.method3177(); // L: 8233
			} catch (Exception var49) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1420 != null ? var1.field1420.id : -1) + "," + (var1.field1433 != null ? var1.field1433.id : -1) + "," + var1.serverPacketLength + "," + (TextureProvider.localPlayer.pathX[0] + class20.baseX * 64) + "," + (TextureProvider.localPlayer.pathY[0] + class19.baseY * 64) + ","; // L: 8236

				for (var22 = 0; var22 < var1.serverPacketLength && var22 < 50; ++var22) { // L: 8237
					var21 = var21 + var3.array[var22] + ",";
				}

				class190.RunException_sendStackTrace(var21, var49); // L: 8238
				CollisionMap.method4301(); // L: 8239
			}

			return true; // L: 8241
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 9317

		int var2;
		int var5;
		while (!var1) { // L: 9318
			var1 = true; // L: 9319

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 9320
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 9321
					String var10 = menuTargets[var2]; // L: 9322
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 9323
					menuTargets[var2 + 1] = var10; // L: 9324
					String var11 = menuActions[var2]; // L: 9325
					menuActions[var2] = menuActions[var2 + 1]; // L: 9326
					menuActions[var2 + 1] = var11; // L: 9327
					var5 = menuOpcodes[var2]; // L: 9328
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 9329
					menuOpcodes[var2 + 1] = var5; // L: 9330
					var5 = menuArguments1[var2]; // L: 9331
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 9332
					menuArguments1[var2 + 1] = var5; // L: 9333
					var5 = menuArguments2[var2]; // L: 9334
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 9335
					menuArguments2[var2 + 1] = var5; // L: 9336
					var5 = menuIdentifiers[var2]; // L: 9337
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 9338
					menuIdentifiers[var2 + 1] = var5; // L: 9339
					var5 = field671[var2]; // L: 9340
					field671[var2] = field671[var2 + 1]; // L: 9341
					field671[var2 + 1] = var5; // L: 9342
					boolean var6 = menuShiftClick[var2]; // L: 9343
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 9344
					menuShiftClick[var2 + 1] = var6; // L: 9345
					var1 = false; // L: 9346
				}
			}
		}

		if (clickedWidget == null) { // L: 9351
			int var12 = MouseHandler.MouseHandler_lastButton; // L: 9352
			if (isMenuOpen) { // L: 9353
				int var3;
				if (var12 != 1 && (UserComparator8.mouseCam || var12 != 4)) { // L: 9354
					var2 = MouseHandler.MouseHandler_x; // L: 9355
					var3 = MouseHandler.MouseHandler_y; // L: 9356
					if (var2 < KeyHandler.menuX - 10 || var2 > class341.menuWidth + KeyHandler.menuX + 10 || var3 < class463.menuY - 10 || var3 > class463.menuY + Language.menuHeight + 10) { // L: 9357
						isMenuOpen = false; // L: 9358
						class19.method284(KeyHandler.menuX, class463.menuY, class341.menuWidth, Language.menuHeight); // L: 9359
					}
				}

				if (var12 == 1 || !UserComparator8.mouseCam && var12 == 4) { // L: 9362
					var2 = KeyHandler.menuX; // L: 9363
					var3 = class463.menuY; // L: 9364
					int var4 = class341.menuWidth; // L: 9365
					var5 = MouseHandler.MouseHandler_lastPressedX; // L: 9366
					int var13 = MouseHandler.MouseHandler_lastPressedY; // L: 9367
					int var7 = -1; // L: 9368

					for (int var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 9369
						int var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 9370
						if (var5 > var2 && var5 < var2 + var4 && var13 > var9 - 13 && var13 < var9 + 3) { // L: 9371
							var7 = var8;
						}
					}

					if (var7 != -1) { // L: 9373
						class414.method7738(var7);
					}

					isMenuOpen = false; // L: 9374
					class19.method284(KeyHandler.menuX, class463.menuY, class341.menuWidth, Language.menuHeight); // L: 9375
				}
			} else {
				var2 = AttackOption.method2714(); // L: 9379
				if ((var12 == 1 || !UserComparator8.mouseCam && var12 == 4) && this.shouldLeftClickOpenMenu()) { // L: 9380 9381
					var12 = 2; // L: 9382
				}

				if ((var12 == 1 || !UserComparator8.mouseCam && var12 == 4) && menuOptionsCount > 0) { // L: 9385
					class414.method7738(var2); // L: 9386
				}

				if (var12 == 2 && menuOptionsCount > 0) { // L: 9388
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	} // L: 9390

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "29401"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = AttackOption.method2714(); // L: 9393
		return (field745 && menuOptionsCount > 2 || DecorativeObject.method5194(var1)) && !menuShiftClick[var1]; // L: 9394
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-2675"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class481.method8540(var1, var2); // L: 9398
		var1 -= viewportOffsetX; // L: 9399
		var2 -= viewportOffsetY; // L: 9400
		class10.scene.menuOpen(class87.Client_plane, var1, var2, false); // L: 9401
		isMenuOpen = true; // L: 9402
	} // L: 9403

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-758466559"
	)
	final void method1340(boolean var1) {
		int var2 = rootInterface; // L: 11106
		int var3 = class340.canvasWidth; // L: 11107
		int var4 = class491.canvasHeight; // L: 11108
		if (class33.field184.method6242(var2)) { // L: 11110
			class360.resizeInterface(class33.field184.field3587[var2], -1, var3, var4, var1); // L: 11111
		}

	} // L: 11113

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)V",
		garbageValue = "0"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class33.field184.method6240(var1.parentId); // L: 11116
		int var3;
		int var4;
		if (var2 == null) { // L: 11119
			var3 = class340.canvasWidth; // L: 11120
			var4 = class491.canvasHeight; // L: 11121
		} else {
			var3 = var2.width; // L: 11124
			var4 = var2.height; // L: 11125
		}

		class140.alignWidgetSize(var1, var3, var4, false); // L: 11127
		Username.alignWidgetPosition(var1, var3, var4); // L: 11128
	} // L: 11129

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2017777407"
	)
	final void method1274() {
		ClanChannelMember.invalidateWidget(clickedWidget); // L: 12041
		++FriendsChatManager.widgetDragDuration; // L: 12042
		if (field685 && field647) { // L: 12043
			int var1 = MouseHandler.MouseHandler_x; // L: 12052
			int var2 = MouseHandler.MouseHandler_y; // L: 12053
			var1 -= widgetClickX; // L: 12054
			var2 -= widgetClickY; // L: 12055
			if (var1 < field750) { // L: 12056
				var1 = field750;
			}

			if (var1 + clickedWidget.width > field750 + clickedWidgetParent.width) { // L: 12057
				var1 = field750 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field748) { // L: 12058
				var2 = field748;
			}

			if (var2 + clickedWidget.height > field748 + clickedWidgetParent.height) { // L: 12059
				var2 = field748 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field554; // L: 12060
			int var4 = var2 - field711; // L: 12061
			int var5 = clickedWidget.dragZoneSize; // L: 12062
			if (FriendsChatManager.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 12063 12064
				isDraggingWidget = true; // L: 12065
			}

			int var6 = var1 - field750 + clickedWidgetParent.scrollX; // L: 12068
			int var7 = var2 - field748 + clickedWidgetParent.scrollY; // L: 12069
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 12070
				var8 = new ScriptEvent(); // L: 12071
				var8.widget = clickedWidget; // L: 12072
				var8.mouseX = var6; // L: 12073
				var8.mouseY = var7; // L: 12074
				var8.args = clickedWidget.onDrag; // L: 12075
				Interpreter.runScriptEvent(var8); // L: 12076
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 12078
				if (isDraggingWidget) { // L: 12079
					if (clickedWidget.onDragComplete != null) { // L: 12080
						var8 = new ScriptEvent(); // L: 12081
						var8.widget = clickedWidget; // L: 12082
						var8.mouseX = var6; // L: 12083
						var8.mouseY = var7; // L: 12084
						var8.dragTarget = draggedOnWidget; // L: 12085
						var8.args = clickedWidget.onDragComplete; // L: 12086
						Interpreter.runScriptEvent(var8); // L: 12087
					}

					if (draggedOnWidget != null && class212.method3891(clickedWidget) != null) { // L: 12089
						PacketBufferNode var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3220, packetWriter.isaacCipher); // L: 12091
						var9.packetBuffer.method9256(clickedWidget.id); // L: 12092
						var9.packetBuffer.writeShort(draggedOnWidget.childIndex); // L: 12093
						var9.packetBuffer.writeShort(clickedWidget.childIndex); // L: 12094
						var9.packetBuffer.writeInt(draggedOnWidget.id); // L: 12095
						var9.packetBuffer.method9243(clickedWidget.itemId); // L: 12096
						var9.packetBuffer.writeShort(draggedOnWidget.itemId); // L: 12097
						packetWriter.addNode(var9); // L: 12098
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 12102
					this.openMenu(field554 + widgetClickX, field711 + widgetClickY); // L: 12103
				} else if (menuOptionsCount > 0) { // L: 12105
					VarbitComposition.method3905(widgetClickX + field554, widgetClickY + field711); // L: 12106
				}

				clickedWidget = null; // L: 12109
			}

		} else {
			if (FriendsChatManager.widgetDragDuration > 1) { // L: 12044
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 12045
					VarbitComposition.method3905(field554 + widgetClickX, field711 + widgetClickY); // L: 12046
				}

				clickedWidget = null; // L: 12048
			}

		}
	} // L: 12050 12111

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "-1440888763"
	)
	@Export("username")
	public Username username() {
		return TextureProvider.localPlayer != null ? TextureProvider.localPlayer.username : null; // L: 12819
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "95"
	)
	void method1507(int var1) {
		if (field527 >= 216) { // L: 12973
			PacketBufferNode var2 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3136, packetWriter.isaacCipher); // L: 12974
			var2.packetBuffer.writeByte(var1); // L: 12975
			packetWriter.addNode(var2); // L: 12976
		}

	} // L: 12978

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-859215777"
	)
	void method1277(int var1) {
		if (field527 >= 216) { // L: 12981
			PacketBufferNode var2 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3175, packetWriter.isaacCipher); // L: 12982
			var2.packetBuffer.writeByte(var1); // L: 12983
			packetWriter.addNode(var2); // L: 12984
		}

	} // L: 12986

	public final void init() {
		try {
			if (this.checkHost()) { // L: 752
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 753
					String var2 = this.getParameter(Integer.toString(var1)); // L: 754
					if (var2 != null) { // L: 755
						switch(var1) { // L: 756
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 821
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 822
							}
							break;
						case 4:
							if (clientType == -1) { // L: 787
								clientType = Integer.parseInt(var2); // L: 788
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 837
							break; // L: 838
						case 6:
							WorldMapLabelSize.clientLanguage = Language.method7160(Integer.parseInt(var2)); // L: 827
							break; // L: 828
						case 7:
							SoundSystem.field325 = class432.method7855(Integer.parseInt(var2)); // L: 772
							break; // L: 773
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 766
							}
							break;
						case 9:
							HealthBarDefinition.field1995 = var2; // L: 777
							break; // L: 778
						case 10:
							UrlRequester.field1436 = (StudioGame)SequenceDefinition.findEnumerated(Calendar.method6760(), Integer.parseInt(var2)); // L: 759
							if (UrlRequester.field1436 == StudioGame.oldscape) { // L: 760
								class166.loginType = LoginType.oldscape;
							} else {
								class166.loginType = LoginType.field5032; // L: 761
							}
							break;
						case 11:
							class59.field453 = var2; // L: 816
							break; // L: 817
						case 12:
							worldId = Integer.parseInt(var2); // L: 847
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
							WorldMapIcon_1.field2916 = Integer.parseInt(var2); // L: 794
							break; // L: 795
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 782
							break; // L: 783
						case 17:
							class59.field450 = var2; // L: 832
							break; // L: 833
						case 21:
							field717 = Integer.parseInt(var2); // L: 799
							break; // L: 800
						case 22:
							Actor.field1264 = var2; // L: 842
							break; // L: 843
						case 25:
							int var3 = var2.indexOf("."); // L: 804
							if (var3 == -1) { // L: 805
								field527 = Integer.parseInt(var2); // L: 806
							} else {
								field527 = Integer.parseInt(var2.substring(0, var3)); // L: 809
								Integer.parseInt(var2.substring(var3 + 1)); // L: 810
							}
						}
					}
				}

				class414.method7739(); // L: 853
				MouseHandler.worldHost = this.getCodeBase().getHost(); // L: 854
				class59.field452 = new class374(); // L: 855
				String var4 = SoundSystem.field325.name; // L: 856
				byte var5 = 0; // L: 857
				if ((worldProperties & class525.field5112.rsOrdinal()) != 0) { // L: 858
					UserComparator3.field1471 = "beta"; // L: 859
				}

				try {
					class139.method3110("oldschool", UserComparator3.field1471, var4, var5, 23); // L: 862
				} catch (Exception var7) { // L: 864
					class190.RunException_sendStackTrace((String)null, var7); // L: 865
				}

				class159.client = this; // L: 867
				class189.field1912 = clientType; // L: 868
				class223.method4213(); // L: 869
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 870
					this.field565 = true; // L: 871
				}

				if (field525 == -1) { // L: 873
					if (!this.method1768() && !this.method1248()) { // L: 874
						field525 = 0; // L: 878
					} else {
						field525 = 5; // L: 875
					}
				}

				this.startThread(765, 503, 217, 1); // L: 881
			}
		} catch (RuntimeException var8) {
			throw GrandExchangeOfferTotalQuantityComparator.newRunException(var8, "client.init(" + ')');
		}
	} // L: 882

	protected void finalize() throws Throwable {
		class319.field3434.remove(this); // L: 888
		super.finalize(); // L: 890
	} // L: 891

	public void setClient(int var1) {
		this.field566 = var1; // L: 924
	} // L: 925

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 930
			this.field563 = var1; // L: 933
			GameEngine.method647(10); // L: 934
		}
	} // L: 931 935

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 940
			this.field568 = var1; // L: 943
		}
	} // L: 941 944

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 949
	}

	public long getAccountHash() {
		return this.accountHash; // L: 954
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhg;",
		garbageValue = "-1459620271"
	)
	public static VarcInt method1828(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0); // L: 21
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0); // L: 23
			var1 = new VarcInt(); // L: 24
			if (var2 != null) { // L: 25
				var1.method3671(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1501700081"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}
}
