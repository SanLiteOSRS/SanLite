import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed {
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -682660239
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -747091901
	)
	static int field810;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		longValue = 5382423932192303621L
	)
	static long field819;
	@ObfuscatedName("qy")
	static boolean field842;
	@ObfuscatedName("oo")
	static boolean[] field811;
	@ObfuscatedName("od")
	static boolean[] field704;
	@ObfuscatedName("og")
	static boolean[] field812;
	@ObfuscatedName("pv")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 1943798093
	)
	public static int field623;
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		signature = "Lmg;"
	)
	@Export("widgetClickMasks")
	static NodeHashTable widgetClickMasks;
	@ObfuscatedName("px")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("pi")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = 1273380035
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("pf")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("pb")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("tt")
	@ObfuscatedSignature(
		signature = "Lbm;"
	)
	static final ApproximateRouteStrategy field878;
	@ObfuscatedName("op")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -1162506743
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -642989317
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = -1926454051
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("td")
	static int[] field879;
	@ObfuscatedName("tq")
	static int[] field726;
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		signature = "[Ljn;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = 1247880161
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rw")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		signature = "[Lp;"
	)
	static class3[] field820;
	@ObfuscatedName("rj")
	static boolean[] field850;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 1954140693
	)
	static int field871;
	@ObfuscatedName("ts")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = -1745248339
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = 48563957
	)
	static int field713;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -116212155
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("rq")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("rk")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("rm")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		signature = "[Lan;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("ru")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = -381302747
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("pt")
	static long[] field689;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -163319865
	)
	static int field833;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		longValue = 2385662544800034671L
	)
	static long field678;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 1846796199
	)
	static int field760;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		signature = "Lmi;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ra")
	static short field855;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 454240781
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("sd")
	static short field856;
	@ObfuscatedName("sa")
	static short field707;
	@ObfuscatedName("qn")
	static int[] field835;
	@ObfuscatedName("sr")
	static short field862;
	@ObfuscatedName("ss")
	static short field742;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = 295711759
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("se")
	static short field859;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = -64925191
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("qp")
	static int[] field836;
	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		signature = "[Loh;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = -272940265
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = 544272473
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -163290725
	)
	static int field827;
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = 1561763743
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -1962349553
	)
	static int field740;
	@ObfuscatedName("sp")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("sf")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("pe")
	static int[] field792;
	@ObfuscatedName("of")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	static NodeDeque field806;
	@ObfuscatedName("pu")
	static int[] field828;
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	static NodeDeque field688;
	@ObfuscatedName("rg")
	static int[] field698;
	@ObfuscatedName("rp")
	static int[] field601;
	@ObfuscatedName("rn")
	static int[] field853;
	@ObfuscatedName("rh")
	static int[] field854;
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		signature = "[Lm;"
	)
	static class11[] field831;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = 241170089
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -1079120289
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("pc")
	static int[] field821;
	@ObfuscatedName("pd")
	static String field824;
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		signature = "Lbz;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Loh;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "[Lel;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ae")
	static boolean field867;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 552624005
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 2131247803
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -314365739
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bt")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("ba")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -288951115
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 2088572863
	)
	static int field605;
	@ObfuscatedName("bq")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 284753475
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("ca")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 923749023
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		longValue = -5043335151957037887L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1203452297
	)
	static int field875;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1304944871
	)
	static int field759;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		longValue = 5446174913048845565L
	)
	static long field851;
	@ObfuscatedName("cj")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("cy")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1192352679
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -45138847
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1361076413
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1697851223
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -98255553
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -538636661
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 430815638
	)
	static int field607;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -1162986359
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1666549933
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		signature = "Ldy;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		signature = "Ldy;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 296972281
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -2004840955
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1450698847
	)
	static int field630;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 1573978957
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 1602941259
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -1017174837
	)
	static int field633;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -798312209
	)
	static int field634;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 189453593
	)
	static int field635;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		signature = "Ldx;"
	)
	static class125 field636;
	@ObfuscatedName("ed")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		signature = "Lcz;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fy")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		signature = "[Ldo;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = -1634539077
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("fv")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = 1757350889
	)
	static int field645;
	@ObfuscatedName("fw")
	static int[] field646;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		signature = "Lep;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		signature = "Ldn;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		signature = "Lli;"
	)
	static AbstractSocket field686;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = 734890615
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ft")
	static boolean field737;
	@ObfuscatedName("fx")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		signature = "Lkh;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("fd")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 1733290173
	)
	static int field655;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = -1750406597
	)
	static int field656;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 1065721221
	)
	static int field657;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 2141323521
	)
	static int field752;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -906456671
	)
	static int field659;
	@ObfuscatedName("gf")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gw")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gm")
	static final int[] field663;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 1694121313
	)
	static int field799;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -1122631231
	)
	static int field665;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = -479029123
	)
	static int field666;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 1599811931
	)
	static int field667;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = 785660529
	)
	static int field668;
	@ObfuscatedName("hw")
	static boolean field669;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = -76493703
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 147847129
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		intValue = 206120351
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = -1232313345
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = -480575637
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = -1057422407
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = -660688745
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 1806653119
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = 416588195
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 793641371
	)
	static int field679;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -1538078599
	)
	static int field702;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -1065509781
	)
	static int field681;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 2029670705
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = -1466920965
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -1126512847
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -320583695
	)
	static int field684;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("if")
	static boolean field685;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 1428883113
	)
	static int field826;
	@ObfuscatedName("ig")
	static boolean field687;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = -2048625487
	)
	static int field735;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -952041977
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 1506427229
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("is")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("iw")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("iv")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("io")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ib")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("jt")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jn")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("ja")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("jf")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -1422454763
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = -1419535011
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = 1293682241
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = -344110517
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -45016791
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = 722841516
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 299893465
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("ju")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = -308485147
	)
	static int field708;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 1815166709
	)
	static int field709;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1995553501
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1701113733
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = -1899145373
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -1317847501
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jq")
	static boolean field714;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = 1705786143
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = -1564319989
	)
	static int field716;
	@ObfuscatedName("jd")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		signature = "[Lcs;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 507281317
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1786300969
	)
	static int field720;
	@ObfuscatedName("ka")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -1826358719
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 1014585
	)
	static int field723;
	@ObfuscatedName("kx")
	static int[] field724;
	@ObfuscatedName("ks")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ku")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("km")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("kv")
	static int[] field728;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = -375939239
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		signature = "[[[Lju;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("kk")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("ki")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("le")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -343514321
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("la")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -676387903
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("ll")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("lf")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("lz")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("lg")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("ls")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("lw")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("li")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("lo")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ld")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("lp")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ln")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 351354593
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = -47840029
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 233385425
	)
	static int field753;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -796964637
	)
	static int field696;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = -1862250245
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ma")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 1559657187
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1973847065
	)
	static int field874;
	@ObfuscatedName("mw")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("mb")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -1769483355
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		signature = "Lmg;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 432404741
	)
	static int field764;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 943374115
	)
	static int field765;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 543822711
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -632422509
	)
	static int field767;
	@ObfuscatedName("me")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -1222250575
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 1127684145
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 613808213
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -828285273
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("nm")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = -48358575
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = -691888487
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("no")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("np")
	static boolean field780;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = -1314877581
	)
	static int field727;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = 290813887
	)
	static int field782;
	@ObfuscatedName("nc")
	static boolean field783;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -1611922761
	)
	static int field784;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = 719879569
	)
	static int field845;
	@ObfuscatedName("nr")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = -1228541083
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("nj")
	static int[] field788;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = -544134857
	)
	static int field789;
	@ObfuscatedName("nt")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -1782026175
	)
	static int field791;
	@ObfuscatedName("nl")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -1372172675
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("oe")
	static int[] field794;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -1785174409
	)
	static int field613;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = -507783339
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = -294436167
	)
	static int field797;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = 163984103
	)
	static int field798;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 1092884023
	)
	static int field786;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 1340248461
	)
	static int field800;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 1564656757
	)
	static int field801;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1529362963
	)
	static int field802;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 160490891
	)
	static int field803;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		signature = "Lnu;"
	)
	Buffer field746;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		signature = "Lax;"
	)
	class35 field640;

	static {
		field867 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		clientType = -1;
		field605 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field875 = -1;
		field759 = -1;
		field851 = -1L;
		hadFocus = true;
		displayFps = false;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		field607 = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		titleLoadingStage = 0;
		js5ConnectState = 0;
		field630 = 0;
		js5Errors = 0;
		loginState = 0;
		field633 = 0;
		field634 = 0;
		field635 = 0;
		field636 = class125.field1458;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field645 = 0;
		field646 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		field737 = false;
		useBufferedSocket = true;
		timer = new Timer();
		fontsMap = new HashMap();
		field655 = 0;
		field656 = 1;
		field657 = 0;
		field752 = 1;
		field659 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field663 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field799 = 0;
		field665 = 2301979;
		field666 = 5063219;
		field667 = 3353893;
		field668 = 7759444;
		field669 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field679 = 0;
		field702 = 0;
		field681 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field684 = 0;
		field685 = false;
		field826 = 0;
		field687 = false;
		field735 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field708 = 0;
		field709 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field714 = false;
		itemDragDuration = 0;
		field716 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field720 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field723 = 0;
		field724 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		field728 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		leftClickOpensMenu = 0;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		shiftClickDrop = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field753 = 0;
		field696 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field874 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field764 = 0;
		field765 = -1;
		chatEffects = 0;
		field767 = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field780 = false;
		field727 = -1;
		field782 = -1;
		field783 = false;
		field784 = -1;
		field845 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		field788 = new int[32];
		field789 = 0;
		changedItemContainers = new int[32];
		field791 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field794 = new int[32];
		field613 = 0;
		chatCycle = 0;
		field797 = 0;
		field798 = 0;
		field786 = 0;
		field800 = 0;
		field801 = 0;
		field802 = 0;
		field803 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field806 = new NodeDeque();
		field688 = new NodeDeque();
		widgetClickMasks = new NodeHashTable(512);
		rootWidgetCount = 0;
		field810 = -2;
		field811 = new boolean[100];
		field812 = new boolean[100];
		field704 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field819 = 0L;
		isResizable = true;
		field821 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field824 = "";
		field689 = new long[100];
		field760 = 0;
		field827 = 0;
		field828 = new int[128];
		field792 = new int[128];
		field678 = -1L;
		field831 = new class11[1];
		field820 = new class3[1];
		field833 = -1;
		mapIconCount = 0;
		field835 = new int[1000];
		field836 = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		field842 = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field850 = new boolean[5];
		field601 = new int[5];
		field698 = new int[5];
		field853 = new int[5];
		field854 = new int[5];
		field855 = 256;
		field856 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field859 = 1;
		field742 = 32767;
		field707 = 1;
		field862 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field871 = -1;
		field713 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field623 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field740 = 0;
		field878 = new ApproximateRouteStrategy();
		field879 = new int[50];
		field726 = new int[50];
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1835470787"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field819 = ObjectSound.currentTimeMillis() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-473168642"
	)
	@Export("setUp")
	protected final void setUp() {
		class0.method12(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		AttackOption.port1 = gameBuild == 0 ? 43594 : worldId + 40000;
		Calendar.port2 = gameBuild == 0 ? 443 : worldId + 50000;
		class5.port3 = AttackOption.port1;
		PlayerComposition.field2601 = class223.field2609;
		ChatChannel.field1086 = class223.field2608;
		WorldMapSection1.field1753 = class223.field2611;
		PlayerComposition.field2596 = class223.field2610;
		class32.urlRequester = new UrlRequester();
		this.setUpKeyboard();
		this.setUpMouse();
		class9.mouseWheel = this.mouseWheel();
		FriendLoginUpdate.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = class15.getPreferencesFile("", class27.field208.name, false);
			byte[] var4 = new byte[(int)var2.length()];

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) {
				var6 = var2.read(var4, var5, var4.length - var5);
				if (var6 == -1) {
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4));
		} catch (Exception var8) {
		}

		try {
			if (var2 != null) {
				var2.close();
			}
		} catch (Exception var7) {
		}

		Login.clientPreferences = var3;
		this.setUpClipboard();
		String var9 = DevicePcmPlayerProvider.null_string;
		class44.applet = this;
		if (var9 != null) {
			class44.field294 = var9;
		}

		if (gameBuild != 0) {
			displayFps = true;
		}

		Tile.setWindowedMode(Login.clientPreferences.windowMode);
		class13.friendSystem = new FriendSystem(AbstractUserComparator.loginType);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-102"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				int var4;
				try {
					if (class210.musicPlayerStatus == 1) {
						var4 = class210.midiPcmStream.method4018();
						if (var4 > 0 && class210.midiPcmStream.isReady()) {
							var4 -= class1.pcmSampleLength;
							if (var4 < 0) {
								var4 = 0;
							}

							class210.midiPcmStream.setPcmStreamVolume(var4);
						} else {
							class210.midiPcmStream.clear();
							class210.midiPcmStream.removeAll();
							if (class210.musicTrackArchive != null) {
								class210.musicPlayerStatus = 2;
							} else {
								class210.musicPlayerStatus = 0;
							}

							WallDecoration.musicTrack = null;
							class210.soundCache = null;
						}
					}
				} catch (Exception var6) {
					var6.printStackTrace();
					class210.midiPcmStream.clear();
					class210.musicPlayerStatus = 0;
					WallDecoration.musicTrack = null;
					class210.soundCache = null;
					class210.musicTrackArchive = null;
				}

				BoundaryObject.playPcmPlayers();
				WorldMapIcon_1.method2699();
				PlayerType.method4414();
				if (class9.mouseWheel != null) {
					var4 = class9.mouseWheel.useRotation();
					mouseWheelRotation = var4;
				}

				if (gameState == 0) {
					class34.load();
					Decimator.clock.mark();

					for (var4 = 0; var4 < 32; ++var4) {
						GameEngine.graphicsTickTimes[var4] = 0L;
					}

					for (var4 = 0; var4 < 32; ++var4) {
						GameEngine.clientTickTimes[var4] = 0L;
					}

					class232.gameCyclesToDo = 0;
				} else if (gameState == 5) {
					UserComparator7.doCycleTitle(this);
					class34.load();
					Decimator.clock.mark();

					for (var4 = 0; var4 < 32; ++var4) {
						GameEngine.graphicsTickTimes[var4] = 0L;
					}

					for (var4 = 0; var4 < 32; ++var4) {
						GameEngine.clientTickTimes[var4] = 0L;
					}

					class232.gameCyclesToDo = 0;
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						UserComparator7.doCycleTitle(this);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						Varcs.method2340();
					}
				} else {
					UserComparator7.doCycleTitle(this);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-278821415"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label172: {
			try {
				if (class210.musicPlayerStatus == 2) {
					if (WallDecoration.musicTrack == null) {
						WallDecoration.musicTrack = MusicTrack.readTrack(class210.musicTrackArchive, FaceNormal.musicTrackGroupId, WorldMapID.musicTrackFileId);
						if (WallDecoration.musicTrack == null) {
							var2 = false;
							break label172;
						}
					}

					if (class210.soundCache == null) {
						class210.soundCache = new SoundCache(class210.soundEffectsArchive, class372.musicSamplesArchive);
					}

					if (class210.midiPcmStream.loadMusicTrack(WallDecoration.musicTrack, class210.musicPatchesArchive, class210.soundCache, 22050)) {
						class210.midiPcmStream.clearAll();
						class210.midiPcmStream.setPcmStreamVolume(class375.musicTrackVolume);
						class210.midiPcmStream.setMusicTrack(WallDecoration.musicTrack, class210.musicTrackBoolean);
						class210.musicPlayerStatus = 0;
						WallDecoration.musicTrack = null;
						class210.soundCache = null;
						class210.musicTrackArchive = null;
						var2 = true;
						break label172;
					}
				}
			} catch (Exception var6) {
				var6.printStackTrace();
				class210.midiPcmStream.clear();
				class210.musicPlayerStatus = 0;
				WallDecoration.musicTrack = null;
				class210.soundCache = null;
				class210.musicTrackArchive = null;
			}

			var2 = false;
		}

		if (var2 && field842 && ApproximateRouteStrategy.pcmPlayer0 != null) {
			ApproximateRouteStrategy.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field819 != 0L && ObjectSound.currentTimeMillis() > field819) {
			Tile.setWindowedMode(WorldMapScaleHandler.getWindowedMode());
		}

		int var4;
		if (var1) {
			for (var4 = 0; var4 < 100; ++var4) {
				field811[var4] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			class32.drawTitle(class368.fontBold12, class0.fontPlain11, class14.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class32.drawTitle(class368.fontBold12, class0.fontPlain11, class14.fontPlain12);
			} else if (gameState == 25) {
				if (field659 == 1) {
					if (field655 > field656) {
						field656 = field655;
					}

					var4 = (field656 * 50 - field655 * 50) / field656;
					class2.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else if (field659 == 2) {
					if (field657 > field752) {
						field752 = field657;
					}

					var4 = (field752 * 50 - field657 * 50) / field752 + 50;
					class2.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
				} else {
					class2.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class2.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class2.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class32.drawTitle(class368.fontBold12, class0.fontPlain11, class14.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				if (field812[var4]) {
					GameEngine.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
					field812[var4] = false;
				}
			}
		} else if (gameState > 0) {
			GameEngine.rasterProvider.drawFull(0, 0);

			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				field812[var4] = false;
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "74"
	)
	@Export("kill0")
	protected final void kill0() {
		if (TextureProvider.varcs.hasUnwrittenChanges()) {
			TextureProvider.varcs.write();
		}

		if (Language.mouseRecorder != null) {
			Language.mouseRecorder.isRunning = false;
		}

		Language.mouseRecorder = null;
		packetWriter.close();
		if (KeyHandler.KeyHandler_instance != null) {
			synchronized(KeyHandler.KeyHandler_instance) {
				KeyHandler.KeyHandler_instance = null;
			}
		}

		class139.method2669();
		class9.mouseWheel = null;
		if (ApproximateRouteStrategy.pcmPlayer0 != null) {
			ApproximateRouteStrategy.pcmPlayer0.shutdown();
		}

		if (class43.pcmPlayer1 != null) {
			class43.pcmPlayer1.shutdown();
		}

		Skills.method4377();
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3239 != 0) {
				ArchiveDiskActionHandler.field3239 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var4) {
				}
			}
		}

		if (class32.urlRequester != null) {
			class32.urlRequester.close();
			class32.urlRequester = null;
		}

		class19.method284();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1242495393"
	)
	protected final void vmethod1219() {
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 20; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 1:
							useBufferedSocket = Integer.parseInt(var2) != 0;
						case 2:
						case 11:
						case 13:
						case 16:
						default:
							break;
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							class35.clientLanguage = Language.method4691(Integer.parseInt(var2));
							break;
						case 7:
							FriendsList.field3812 = ItemLayer.method3270(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							class0.field4 = var2;
							break;
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.game3, StudioGame.game4, StudioGame.game5, StudioGame.stellardawn, StudioGame.oldscape, StudioGame.runescape};
							class27.field208 = (StudioGame)UserComparator8.findEnumerated(var3, Integer.parseInt(var2));
							if (class27.field208 == StudioGame.oldscape) {
								AbstractUserComparator.loginType = LoginType.oldscape;
							} else {
								AbstractUserComparator.loginType = LoginType.field4086;
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							FaceNormal.field2002 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class244.field2909 = var2;
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				MusicPatch.worldHost = this.getCodeBase().getHost();
				String var4 = FriendsList.field3812.name;
				byte var5 = 0;

				try {
					CollisionMap.method2649("oldschool", var4, var5, 21);
				} catch (Exception var6) {
					class223.RunException_sendStackTrace((String)null, var6);
				}

				class10.client = this;
				RunException.clientType = clientType;
				if (field605 == -1) {
					field605 = 0;
				}

				this.startThread(765, 503, 195);
			}
		} catch (RuntimeException var7) {
			throw UserComparator10.newRunException(var7, "client.init(" + ')');
		}
	}

	@ObfuscatedName("en")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-733084897"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = WorldMapCacheName.method3189();
			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1791659166"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			gameState = 1000;
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					gameState = 1000;
					return;
				}

				field630 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field630 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						Message.js5SocketTask = GameEngine.taskHandler.newSocketTask(MusicPatch.worldHost, class5.port3);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (Message.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (Message.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							KeyHandler.js5Socket = ServerPacket.method3901((Socket)Message.js5SocketTask.result, 40000, 5000);
						} else {
							KeyHandler.js5Socket = new NetSocket((Socket)Message.js5SocketTask.result, GameEngine.taskHandler, 5000);
						}

						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(195);
						KeyHandler.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						PacketBufferNode.field2348 = ObjectSound.currentTimeMillis();
					}

					if (js5ConnectState == 3) {
						if (KeyHandler.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var5 = KeyHandler.js5Socket.readUnsignedByte();
							if (var5 != 0) {
								this.js5Error(var5);
								return;
							}

							++js5ConnectState;
						} else if (ObjectSound.currentTimeMillis() - PacketBufferNode.field2348 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						AbstractSocket var10 = KeyHandler.js5Socket;
						boolean var2 = gameState > 20;
						if (class303.NetCache_socket != null) {
							try {
								class303.NetCache_socket.close();
							} catch (Exception var8) {
							}

							class303.NetCache_socket = null;
						}

						class303.NetCache_socket = var10;
						class246.method4409(var2);
						NetCache.NetCache_responseHeaderBuffer.offset = 0;
						class208.NetCache_currentResponse = null;
						InterfaceParent.NetCache_responseArchiveBuffer = null;
						NetCache.field3295 = 0;

						while (true) {
							NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
							if (var3 == null) {
								while (true) {
									var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
									if (var3 == null) {
										if (NetCache.field3287 != 0) {
											try {
												Buffer var11 = new Buffer(4);
												var11.writeByte(4);
												var11.writeByte(NetCache.field3287);
												var11.writeShort(0);
												class303.NetCache_socket.write(var11.array, 0, 4);
											} catch (IOException var7) {
												try {
													class303.NetCache_socket.close();
												} catch (Exception var6) {
												}

												++NetCache.NetCache_ioExceptions;
												class303.NetCache_socket = null;
											}
										}

										NetCache.NetCache_loadTime = 0;
										NetCache.field3284 = ObjectSound.currentTimeMillis();
										Message.js5SocketTask = null;
										KeyHandler.js5Socket = null;
										js5ConnectState = 0;
										js5Errors = 0;
										return;
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3);
									NetCache.NetCache_pendingWrites.put(var3, var3.key);
									++NetCache.NetCache_pendingWritesCount;
									--NetCache.NetCache_pendingResponsesCount;
								}
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key);
							++NetCache.NetCache_pendingPriorityWritesCount;
							--NetCache.NetCache_pendingPriorityResponsesCount;
						}
					}
				} catch (IOException var9) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1994468046"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		Message.js5SocketTask = null;
		KeyHandler.js5Socket = null;
		js5ConnectState = 0;
		if (class5.port3 == AttackOption.port1) {
			class5.port3 = Calendar.port2;
		} else {
			class5.port3 = AttackOption.port1;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				gameState = 1000;
			} else {
				field630 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			gameState = 1000;
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				gameState = 1000;
			} else {
				field630 = 3000;
			}
		}

	}

	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "36"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (Canvas.secureRandom == null && (secureRandomFuture.isDone() || field633 > 250)) {
					Canvas.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (Canvas.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					socketTask = null;
					field737 = false;
					field633 = 0;
					loginState = 1;
				}
			}

			if (loginState == 1) {
				if (socketTask == null) {
					socketTask = GameEngine.taskHandler.newSocketTask(MusicPatch.worldHost, class5.port3);
				}

				if (socketTask.status == 2) {
					throw new IOException();
				}

				if (socketTask.status == 1) {
					if (useBufferedSocket) {
						var1 = ServerPacket.method3901((Socket)socketTask.result, 40000, 5000);
					} else {
						var1 = new NetSocket((Socket)socketTask.result, GameEngine.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					socketTask = null;
					loginState = 2;
				}
			}

			PacketBufferNode var3;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var3 = class6.method98();
				var3.packetBuffer.writeByte(LoginPacket.field2456.id);
				packetWriter.addNode(var3);
				packetWriter.flush();
				var2.offset = 0;
				loginState = 3;
			}

			int var4;
			boolean var12;
			if (loginState == 3) {
				if (ApproximateRouteStrategy.pcmPlayer0 != null) {
					ApproximateRouteStrategy.pcmPlayer0.method807();
				}

				if (class43.pcmPlayer1 != null) {
					class43.pcmPlayer1.method807();
				}

				var12 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var12 = false;
				}

				if (var12) {
					var4 = ((AbstractSocket)var1).readUnsignedByte();
					if (ApproximateRouteStrategy.pcmPlayer0 != null) {
						ApproximateRouteStrategy.pcmPlayer0.method807();
					}

					if (class43.pcmPlayer1 != null) {
						class43.pcmPlayer1.method807();
					}

					if (var4 != 0) {
						Messages.getLoginError(var4);
						return;
					}

					var2.offset = 0;
					loginState = 4;
				}
			}

			int var34;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var34 = ((AbstractSocket)var1).available();
					if (var34 > 8 - var2.offset) {
						var34 = 8 - var2.offset;
					}

					if (var34 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var34);
						var2.offset += var34;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					HealthBarUpdate.field1277 = var2.readLong();
					loginState = 5;
				}
			}

			int var7;
			int var9;
			int var14;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var23 = new PacketBuffer(500);
				int[] var13 = new int[]{Canvas.secureRandom.nextInt(), Canvas.secureRandom.nextInt(), Canvas.secureRandom.nextInt(), Canvas.secureRandom.nextInt()};
				var23.offset = 0;
				var23.writeByte(1);
				var23.writeInt(var13[0]);
				var23.writeInt(var13[1]);
				var23.writeInt(var13[2]);
				var23.writeInt(var13[3]);
				var23.writeLong(HealthBarUpdate.field1277);
				int var11;
				if (gameState == 40) {
					var23.writeInt(class231.field2803[0]);
					var23.writeInt(class231.field2803[1]);
					var23.writeInt(class231.field2803[2]);
					var23.writeInt(class231.field2803[3]);
				} else {
					var23.writeByte(field636.rsOrdinal());
					switch(field636.field1460) {
					case 0:
					case 3:
						var23.writeMedium(class139.field1560);
						++var23.offset;
						break;
					case 1:
						LinkedHashMap var6 = Login.clientPreferences.parameters;
						String var8 = Login.Login_username;
						var9 = var8.length();
						int var10 = 0;

						for (var11 = 0; var11 < var9; ++var11) {
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var23.writeInt((Integer)var6.get(var10));
						break;
					case 2:
						var23.offset += 4;
					}

					var23.writeByte(class385.field4204.rsOrdinal());
					var23.writeStringCp1252NullTerminated(Login.Login_password);
				}

				var23.encryptRsa(class82.field983, class82.field982);
				class231.field2803 = var13;
				PacketBufferNode var5 = class6.method98();
				var5.packetBuffer.offset = 0;
				if (gameState == 40) {
					var5.packetBuffer.writeByte(LoginPacket.field2452.id);
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field2451.id);
				}

				var5.packetBuffer.writeShort(0);
				var14 = var5.packetBuffer.offset;
				var5.packetBuffer.writeInt(195);
				var5.packetBuffer.writeInt(1);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeByte(field605);
				var5.packetBuffer.writeBytes(var23.array, 0, var23.offset);
				var7 = var5.packetBuffer.offset;
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var5.packetBuffer.writeShort(InterfaceParent.canvasWidth);
				var5.packetBuffer.writeShort(GameEngine.canvasHeight);
				PacketBuffer var32 = var5.packetBuffer;
				if (randomDatData != null) {
					var32.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var15 = Tile.method3356();
					var32.writeBytes(var15, 0, var15.length);
				}

				var5.packetBuffer.writeStringCp1252NullTerminated(class0.field4);
				var5.packetBuffer.writeInt(FaceNormal.field2002);
				Buffer var37 = new Buffer(UserComparator8.platformInfo.size());
				UserComparator8.platformInfo.write(var37);
				var5.packetBuffer.writeBytes(var37.array, 0, var37.array.length);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeInt(0);
				var5.packetBuffer.method6754(MilliClock.archive13.hash);
				var5.packetBuffer.method6625(NPCComposition.archive20.hash);
				var5.packetBuffer.writeInt(class246.archive18.hash);
				var5.packetBuffer.writeInt(class373.archive10.hash);
				var5.packetBuffer.method6754(class8.archive6.hash);
				var5.packetBuffer.method6624(AbstractWorldMapData.archive9.hash);
				var5.packetBuffer.method6625(SoundSystem.archive8.hash);
				var5.packetBuffer.method6754(class12.archive7.hash);
				var5.packetBuffer.method6754(class283.archive19.hash);
				var5.packetBuffer.method6754(0);
				var5.packetBuffer.method6624(class10.archive11.hash);
				var5.packetBuffer.method6624(class0.archive17.hash);
				var5.packetBuffer.method6754(Buddy.archive15.hash);
				var5.packetBuffer.method6624(BuddyRankComparator.archive12.hash);
				var5.packetBuffer.writeInt(class367.archive1.hash);
				var5.packetBuffer.method6624(WorldMapSection0.archive14.hash);
				var5.packetBuffer.method6754(class5.archive3.hash);
				var5.packetBuffer.method6624(class157.archive5.hash);
				var5.packetBuffer.method6625(ItemContainer.archive4.hash);
				var5.packetBuffer.writeInt(TriBool.archive0.hash);
				var5.packetBuffer.method6625(class235.archive2.hash);
				var5.packetBuffer.xteaEncrypt(var13, var7, var5.packetBuffer.offset);
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var14);
				packetWriter.addNode(var5);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var13);
				int[] var16 = new int[4];

				for (var11 = 0; var11 < 4; ++var11) {
					var16[var11] = var13[var11] + 50;
				}

				var2.newIsaacCipher(var16);
				loginState = 6;
			}

			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
				var34 = ((AbstractSocket)var1).readUnsignedByte();
				if (var34 == 21 && gameState == 20) {
					loginState = 12;
				} else if (var34 == 2) {
					loginState = 14;
				} else if (var34 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					loginState = 19;
				} else if (var34 == 64) {
					loginState = 10;
				} else if (var34 == 23 && field634 < 1) {
					++field634;
					loginState = 0;
				} else if (var34 == 29) {
					loginState = 17;
				} else {
					if (var34 != 69) {
						Messages.getLoginError(var34);
						return;
					}

					loginState = 7;
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				class367.field4117 = var2.readUnsignedShort();
				loginState = 8;
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= class367.field4117) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, class367.field4117);
				class34[] var24 = new class34[]{class34.field236};
				class34 var35 = var24[var2.readUnsignedByte()];

				try {
					switch(var35.field230) {
					case 0:
						class28 var27 = new class28();
						this.field640 = new class35(var2, var27);
						loginState = 9;
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var21) {
					Messages.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field640.method426()) {
				this.field746 = this.field640.method425();
				this.field640.method427();
				this.field640 = null;
				if (this.field746 == null) {
					Messages.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var3 = class6.method98();
				var3.packetBuffer.writeByte(LoginPacket.field2450.id);
				var3.packetBuffer.writeShort(this.field746.offset);
				var3.packetBuffer.method6574(this.field746);
				packetWriter.addNode(var3);
				packetWriter.flush();
				this.field746 = null;
				loginState = 6;
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				class11.field108 = ((AbstractSocket)var1).readUnsignedByte();
				loginState = 11;
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class11.field108) {
				((AbstractSocket)var1).read(var2.array, 0, class11.field108);
				var2.offset = 0;
				loginState = 6;
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field635 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				loginState = 13;
			}

			if (loginState == 13) {
				field633 = 0;
				class9.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field635 / 60 + " seconds.");
				if (--field635 <= 0) {
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					WorldMapLabelSize.field1572 = ((AbstractSocket)var1).readUnsignedByte();
					loginState = 15;
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= WorldMapLabelSize.field1572) {
					var12 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var25 = false;
					if (var12) {
						var4 = var2.readByteIsaac() << 24;
						var4 |= var2.readByteIsaac() << 16;
						var4 |= var2.readByteIsaac() << 8;
						var4 |= var2.readByteIsaac();
						String var30 = Login.Login_username;
						var7 = var30.length();
						int var17 = 0;
						var9 = 0;

						while (true) {
							if (var9 >= var7) {
								if (Login.clientPreferences.parameters.size() >= 10 && !Login.clientPreferences.parameters.containsKey(var17)) {
									Iterator var33 = Login.clientPreferences.parameters.entrySet().iterator();
									var33.next();
									var33.remove();
								}

								Login.clientPreferences.parameters.put(var17, var4);
								break;
							}

							var17 = (var17 << 5) - var17 + var30.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) {
						Login.clientPreferences.rememberedUsername = Login.Login_username;
					} else {
						Login.clientPreferences.rememberedUsername = null;
					}

					Message.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field720 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var28 = ItemLayer.ServerPacket_values();
					var14 = var2.readSmartByteShortIsaac();
					if (var14 < 0 || var14 >= var28.length) {
						throw new IOException(var14 + " " + var2.offset);
					}

					packetWriter.serverPacket = var28[var14];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class42.method509(class10.client, "zap");
					} catch (Throwable var20) {
					}

					loginState = 16;
				}

				if (loginState == 16) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method5587();
						class304.method5536();
						AccessFile.updatePlayer(var2);
						class105.field1327 = -1;
						Players.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						class9.field63 = var2.readUnsignedShort();
						loginState = 18;
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class9.field63) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, class9.field63);
						var2.offset = 0;
						String var26 = var2.readStringCp1252NullTerminated();
						String var36 = var2.readStringCp1252NullTerminated();
						String var29 = var2.readStringCp1252NullTerminated();
						class9.setLoginResponseString(var26, var36, var29);
						class20.updateGameState(10);
					}

					if (loginState != 19) {
						++field633;
						if (field633 > 2000) {
							if (field634 < 1) {
								if (AttackOption.port1 == class5.port3) {
									class5.port3 = Calendar.port2;
								} else {
									class5.port3 = AttackOption.port1;
								}

								++field634;
								loginState = 0;
							} else {
								Messages.getLoginError(-3);
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) {
							if (((AbstractSocket)var1).available() < 2) {
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var34 = packetWriter.serverPacketLength;
							timer.method5582();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1381 = null;
							packetWriter.field1392 = null;
							packetWriter.field1393 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1391 = 0;
							rebootTimer = 0;
							menuOptionsCount = 0;
							isMenuOpen = false;
							minimapState = 0;
							destinationX = 0;

							for (var4 = 0; var4 < 2048; ++var4) {
								players[var4] = null;
							}

							Varcs.localPlayer = null;

							for (var4 = 0; var4 < npcs.length; ++var4) {
								NPC var31 = npcs[var4];
								if (var31 != null) {
									var31.targetIndex = -1;
									var31.false0 = false;
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32);
							class20.updateGameState(30);

							for (var4 = 0; var4 < 100; ++var4) {
								field811[var4] = true;
							}

							ItemContainer.method2093();
							AccessFile.updatePlayer(var2);
							if (var34 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var22) {
			if (field634 < 1) {
				if (class5.port3 == AttackOption.port1) {
					class5.port3 = Calendar.port2;
				} else {
					class5.port3 = AttackOption.port1;
				}

				++field634;
				loginState = 0;
			} else {
				Messages.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "25"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (field737) {
			field737 = false;
			HealthBarUpdate.method2181();
		} else {
			if (!isMenuOpen) {
				VerticalAlignment.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1233(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				int var2;
				PacketBufferNode var15;
				while (class34.method415()) {
					var15 = ObjectComposition.getPacketBufferNode(ClientPacket.field2245, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(0);
					var2 = var15.packetBuffer.offset;
					class11.performReflectionCheck(var15.packetBuffer);
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2);
					packetWriter.addNode(var15);
				}

				if (timer.field3773) {
					var15 = ObjectComposition.getPacketBufferNode(ClientPacket.field2234, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(0);
					var2 = var15.packetBuffer.offset;
					timer.write(var15.packetBuffer);
					var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var2);
					packetWriter.addNode(var15);
					timer.method5581();
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
				synchronized(Language.mouseRecorder.lock) {
					if (!field867) {
						Language.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || Language.mouseRecorder.index >= 40) {
						PacketBufferNode var16 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < Language.mouseRecorder.index && (var16 == null || var16.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = Language.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = Language.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field875 || var8 != field759) {
								if (var16 == null) {
									var16 = ObjectComposition.getPacketBufferNode(ClientPacket.field2241, packetWriter.isaacCipher);
									var16.packetBuffer.writeByte(0);
									var3 = var16.packetBuffer.offset;
									var10000 = var16.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								if (field851 != -1L) {
									var10 = var9 - field875;
									var11 = var8 - field759;
									var12 = (int)((Language.mouseRecorder.millis[var7] - field851) / 20L);
									var5 = (int)((long)var5 + (Language.mouseRecorder.millis[var7] - field851) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field875 = var9;
								field759 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var16.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var16.packetBuffer.writeByte(var12 + 128);
									var16.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var16.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var16.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var16.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var16.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field851 = Language.mouseRecorder.millis[var7];
							}
						}

						if (var16 != null) {
							var16.packetBuffer.writeLengthByte(var16.packetBuffer.offset - var3);
							var7 = var16.packetBuffer.offset;
							var16.packetBuffer.offset = var3;
							var16.packetBuffer.writeByte(var5 / var6);
							var16.packetBuffer.writeByte(var5 % var6);
							var16.packetBuffer.offset = var7;
							packetWriter.addNode(var16);
						}

						if (var4 >= Language.mouseRecorder.index) {
							Language.mouseRecorder.index = 0;
						} else {
							MouseRecorder var47 = Language.mouseRecorder;
							var47.index -= var4;
							System.arraycopy(Language.mouseRecorder.xs, var4, Language.mouseRecorder.xs, 0, Language.mouseRecorder.index);
							System.arraycopy(Language.mouseRecorder.ys, var4, Language.mouseRecorder.ys, 0, Language.mouseRecorder.index);
							System.arraycopy(Language.mouseRecorder.millis, var4, Language.mouseRecorder.millis, 0, Language.mouseRecorder.index);
						}
					}
				}

				PacketBufferNode var19;
				if (MouseHandler.MouseHandler_lastButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var17 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
					if (var17 > 32767L) {
						var17 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > GameEngine.canvasHeight) {
						var3 = GameEngine.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > InterfaceParent.canvasWidth) {
						var4 = InterfaceParent.canvasWidth;
					}

					var5 = (int)var17;
					var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field2216, packetWriter.isaacCipher);
					var19.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
					var19.packetBuffer.writeShort(var4);
					var19.packetBuffer.writeShort(var3);
					packetWriter.addNode(var19);
				}

				if (KeyHandler.field263 > 0) {
					var15 = ObjectComposition.getPacketBufferNode(ClientPacket.field2226, packetWriter.isaacCipher);
					var15.packetBuffer.writeShort(0);
					var2 = var15.packetBuffer.offset;
					long var20 = ObjectSound.currentTimeMillis();

					for (var5 = 0; var5 < KeyHandler.field263; ++var5) {
						long var22 = var20 - field678;
						if (var22 > 16777215L) {
							var22 = 16777215L;
						}

						field678 = var20;
						var15.packetBuffer.writeMedium((int)var22);
						var15.packetBuffer.method6639(KeyHandler.field262[var5]);
					}

					var15.packetBuffer.writeLengthShort(var15.packetBuffer.offset - var2);
					packetWriter.addNode(var15);
				}

				if (field826 > 0) {
					--field826;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
					field687 = true;
				}

				if (field687 && field826 <= 0) {
					field826 = 20;
					field687 = false;
					var15 = ObjectComposition.getPacketBufferNode(ClientPacket.field2293, packetWriter.isaacCipher);
					var15.packetBuffer.method6614(camAngleX);
					var15.packetBuffer.method6716(camAngleY);
					packetWriter.addNode(var15);
				}

				if (GrandExchangeOfferAgeComparator.hasFocus && !hadFocus) {
					hadFocus = true;
					var15 = ObjectComposition.getPacketBufferNode(ClientPacket.field2272, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(1);
					packetWriter.addNode(var15);
				}

				if (!GrandExchangeOfferAgeComparator.hasFocus && hadFocus) {
					hadFocus = false;
					var15 = ObjectComposition.getPacketBufferNode(ClientPacket.field2272, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(0);
					packetWriter.addNode(var15);
				}

				if (UserComparator4.worldMap != null) {
					UserComparator4.worldMap.method6148();
				}

				if (WorldMapSection2.ClanChat_inClanChat) {
					if (InterfaceParent.clanChat != null) {
						InterfaceParent.clanChat.sort();
					}

					class157.FriendSystem_invalidateFriends();
					WorldMapSection2.ClanChat_inClanChat = false;
				}

				if (field833 != class26.Client_plane) {
					field833 = class26.Client_plane;
					class14.method237(class26.Client_plane);
				}

				if (gameState == 30) {
					PacketBufferNode.method3888();

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) {
						var10002 = queuedSoundEffectDelays[var1]--;
						if (queuedSoundEffectDelays[var1] >= -10) {
							SoundEffect var35 = soundEffects[var1];
							if (var35 == null) {
								var10000 = null;
								var35 = SoundEffect.readSoundEffect(ItemContainer.archive4, soundEffectIds[var1], 0);
								if (var35 == null) {
									continue;
								}

								int[] var48 = queuedSoundEffectDelays;
								var48[var1] += var35.calculateDelay();
								soundEffects[var1] = var35;
							}

							if (queuedSoundEffectDelays[var1] < 0) {
								if (soundLocations[var1] != 0) {
									var4 = (soundLocations[var1] & 255) * 128;
									var5 = soundLocations[var1] >> 16 & 255;
									var6 = var5 * 128 + 64 - Varcs.localPlayer.x;
									if (var6 < 0) {
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255;
									var8 = var7 * 128 + 64 - Varcs.localPlayer.y;
									if (var8 < 0) {
										var8 = -var8;
									}

									var9 = var6 + var8 - 128;
									if (var9 > var4) {
										queuedSoundEffectDelays[var1] = -100;
										continue;
									}

									if (var9 < 0) {
										var9 = 0;
									}

									var3 = (var4 - var9) * Login.clientPreferences.areaSoundEffectsVolume / var4;
								} else {
									var3 = Login.clientPreferences.soundEffectsVolume;
								}

								if (var3 > 0) {
									RawSound var24 = var35.toRawSound().resample(class34.decimator);
									RawPcmStream var25 = RawPcmStream.createRawPcmStream(var24, 100, var3);
									var25.setNumLoops(queuedSoundEffectLoops[var1] - 1);
									Huffman.pcmStreamMixer.addSubStream(var25);
								}

								queuedSoundEffectDelays[var1] = -100;
							}
						} else {
							--soundEffectCount;

							for (var2 = var1; var2 < soundEffectCount; ++var2) {
								soundEffectIds[var2] = soundEffectIds[var2 + 1];
								soundEffects[var2] = soundEffects[var2 + 1];
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1];
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1];
								soundLocations[var2] = soundLocations[var2 + 1];
							}

							--var1;
						}
					}

					if (field842) {
						boolean var30;
						if (class210.musicPlayerStatus != 0) {
							var30 = true;
						} else {
							var30 = class210.midiPcmStream.isReady();
						}

						if (!var30) {
							if (Login.clientPreferences.musicVolume != 0 && currentTrackGroupId != -1) {
								PacketBufferNode.method3898(class8.archive6, currentTrackGroupId, 0, Login.clientPreferences.musicVolume, false);
							}

							field842 = false;
						}
					}

					++packetWriter.field1391;
					if (packetWriter.field1391 > 750) {
						HealthBarUpdate.method2181();
					} else {
						var1 = Players.Players_count;
						int[] var36 = Players.Players_indices;

						for (var3 = 0; var3 < var1; ++var3) {
							Player var40 = players[var36[var3]];
							if (var40 != null) {
								class137.updateActorSequence(var40, 1);
							}
						}

						WorldMapCacheName.method3188();
						int[] var33 = Players.Players_indices;

						for (var2 = 0; var2 < Players.Players_count; ++var2) {
							Player var26 = players[var33[var2]];
							if (var26 != null && var26.overheadTextCyclesRemaining > 0) {
								--var26.overheadTextCyclesRemaining;
								if (var26.overheadTextCyclesRemaining == 0) {
									var26.overheadText = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) {
							var3 = npcIndices[var2];
							NPC var41 = npcs[var3];
							if (var41 != null && var41.overheadTextCyclesRemaining > 0) {
								--var41.overheadTextCyclesRemaining;
								if (var41.overheadTextCyclesRemaining == 0) {
									var41.overheadText = null;
								}
							}
						}

						++field799;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 400;
							if (mouseCrossState * 20 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (PacketWriter.field1394 != null) {
							++field708;
							if (field708 >= 15) {
								class29.invalidateWidget(PacketWriter.field1394);
								PacketWriter.field1394 = null;
							}
						}

						Widget var34 = Varps.mousedOverWidgetIf1;
						Widget var37 = Player.field1192;
						Varps.mousedOverWidgetIf1 = null;
						Player.field1192 = null;
						draggedOnWidget = null;
						field783 = false;
						field780 = false;
						field827 = 0;

						while (class231.isKeyDown() && field827 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class19.field146 == 66) {
								String var42 = "";

								Message var38;
								for (Iterator var43 = Messages.Messages_hashTable.iterator(); var43.hasNext(); var42 = var42 + var38.sender + ':' + var38.text + '\n') {
									var38 = (Message)var43.next();
								}

								class10.client.clipboardSetString(var42);
							} else if (oculusOrbState != 1 || Message.field591 <= 0) {
								field792[field827] = class19.field146;
								field828[field827] = Message.field591;
								++field827;
							}
						}

						boolean var31 = staffModLevel >= 2;
						if (var31 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var4 = Varcs.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != Varcs.localPlayer.plane) {
								class9.method123(Varcs.localPlayer.pathX[0] + ItemLayer.baseX * 64, Varcs.localPlayer.pathY[0] + Tile.baseY * 64, var4, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class5.updateRootInterface(rootInterface, 0, 0, InterfaceParent.canvasWidth, GameEngine.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var39;
							ScriptEvent var44;
							Widget var45;
							do {
								var44 = (ScriptEvent)field806.removeLast();
								if (var44 == null) {
									while (true) {
										do {
											var44 = (ScriptEvent)field688.removeLast();
											if (var44 == null) {
												while (true) {
													do {
														var44 = (ScriptEvent)scriptEvents.removeLast();
														if (var44 == null) {
															this.menu();
															if (UserComparator4.worldMap != null) {
																UserComparator4.worldMap.method6116(class26.Client_plane, ItemLayer.baseX * 64 + (Varcs.localPlayer.x >> 7), Tile.baseY * 64 + (Varcs.localPlayer.y >> 7), false);
																UserComparator4.worldMap.loadCache();
															}

															if (clickedWidget != null) {
																this.method1239();
															}

															if (ClientPacket.dragInventoryWidget != null) {
																class29.invalidateWidget(ClientPacket.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field714) {
																		if (ClientPacket.dragInventoryWidget == ScriptFrame.field579 && dragItemSlotSource != dragItemSlotDestination) {
																			Widget var46 = ClientPacket.dragInventoryWidget;
																			byte var32 = 0;
																			if (field767 == 1 && var46.contentType == 206) {
																				var32 = 1;
																			}

																			if (var46.itemIds[dragItemSlotDestination] <= 0) {
																				var32 = 0;
																			}

																			if (class69.method1165(DirectByteArrayCopier.getWidgetClickMask(var46))) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;
																				var46.itemIds[var7] = var46.itemIds[var6];
																				var46.itemQuantities[var7] = var46.itemQuantities[var6];
																				var46.itemIds[var6] = -1;
																				var46.itemQuantities[var6] = 0;
																			} else if (var32 == 1) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;

																				while (var6 != var7) {
																					if (var6 > var7) {
																						var46.swapItems(var6 - 1, var6);
																						--var6;
																					} else if (var6 < var7) {
																						var46.swapItems(var6 + 1, var6);
																						++var6;
																					}
																				}
																			} else {
																				var46.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field2230, packetWriter.isaacCipher);
																			var19.packetBuffer.method6625(ClientPacket.dragInventoryWidget.id);
																			var19.packetBuffer.method6614(dragItemSlotSource);
																			var19.packetBuffer.method6606(var32);
																			var19.packetBuffer.method6614(dragItemSlotDestination);
																			packetWriter.addNode(var19);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		class26.method357(draggedWidgetX, draggedWidgetY);
																	}

																	field708 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	ClientPacket.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field714 = true;
																}
															}

															if (Scene.method3474()) {
																var4 = Scene.Scene_selectedX;
																var5 = Scene.Scene_selectedY;
																var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field2267, packetWriter.isaacCipher);
																var19.packetBuffer.writeByte(5);
																var19.packetBuffer.method6771(Tile.baseY * 64 + var5);
																var19.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																var19.packetBuffer.method6716(ItemLayer.baseX * 64 + var4);
																packetWriter.addNode(var19);
																Scene.method3476();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var4;
																destinationY = var5;
															}

															if (var34 != Varps.mousedOverWidgetIf1) {
																if (var34 != null) {
																	class29.invalidateWidget(var34);
																}

																if (Varps.mousedOverWidgetIf1 != null) {
																	class29.invalidateWidget(Varps.mousedOverWidgetIf1);
																}
															}

															if (var37 != Player.field1192 && field696 == field753) {
																if (var37 != null) {
																	class29.invalidateWidget(var37);
																}

																if (Player.field1192 != null) {
																	class29.invalidateWidget(Player.field1192);
																}
															}

															if (Player.field1192 != null) {
																if (field753 < field696) {
																	++field753;
																	if (field696 == field753) {
																		class29.invalidateWidget(Player.field1192);
																	}
																}
															} else if (field753 > 0) {
																--field753;
															}

															MusicPatchPcmStream.method4122();
															if (isCameraLocked) {
																var4 = class5.field40 * 16384 + 64;
																var5 = ApproximateRouteStrategy.field592 * 16384 + 64;
																var6 = UserComparator7.getTileHeight(var4, var5, class26.Client_plane) - WorldMapLabelSize.field1569;
																if (ModeWhere.cameraX < var4) {
																	ModeWhere.cameraX = (var4 - ModeWhere.cameraX) * UserComparator9.field1435 / 1000 + ModeWhere.cameraX + Skeleton.field1927;
																	if (ModeWhere.cameraX > var4) {
																		ModeWhere.cameraX = var4;
																	}
																}

																if (ModeWhere.cameraX > var4) {
																	ModeWhere.cameraX -= UserComparator9.field1435 * (ModeWhere.cameraX - var4) / 1000 + Skeleton.field1927;
																	if (ModeWhere.cameraX < var4) {
																		ModeWhere.cameraX = var4;
																	}
																}

																if (WorldMapRectangle.cameraY < var6) {
																	WorldMapRectangle.cameraY = (var6 - WorldMapRectangle.cameraY) * UserComparator9.field1435 / 1000 + WorldMapRectangle.cameraY + Skeleton.field1927;
																	if (WorldMapRectangle.cameraY > var6) {
																		WorldMapRectangle.cameraY = var6;
																	}
																}

																if (WorldMapRectangle.cameraY > var6) {
																	WorldMapRectangle.cameraY -= UserComparator9.field1435 * (WorldMapRectangle.cameraY - var6) / 1000 + Skeleton.field1927;
																	if (WorldMapRectangle.cameraY < var6) {
																		WorldMapRectangle.cameraY = var6;
																	}
																}

																if (ReflectionCheck.cameraZ < var5) {
																	ReflectionCheck.cameraZ = (var5 - ReflectionCheck.cameraZ) * UserComparator9.field1435 / 1000 + ReflectionCheck.cameraZ + Skeleton.field1927;
																	if (ReflectionCheck.cameraZ > var5) {
																		ReflectionCheck.cameraZ = var5;
																	}
																}

																if (ReflectionCheck.cameraZ > var5) {
																	ReflectionCheck.cameraZ -= UserComparator9.field1435 * (ReflectionCheck.cameraZ - var5) / 1000 + Skeleton.field1927;
																	if (ReflectionCheck.cameraZ < var5) {
																		ReflectionCheck.cameraZ = var5;
																	}
																}

																var4 = ModeWhere.field3368 * 16384 + 64;
																var5 = AttackOption.field1339 * 16384 + 64;
																var6 = UserComparator7.getTileHeight(var4, var5, class26.Client_plane) - class2.field15;
																var7 = var4 - ModeWhere.cameraX;
																var8 = var6 - WorldMapRectangle.cameraY;
																var9 = var5 - ReflectionCheck.cameraZ;
																var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
																var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.949D) & 2047;
																var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047;
																if (var11 < 128) {
																	var11 = 128;
																}

																if (var11 > 383) {
																	var11 = 383;
																}

																if (WorldMapArea.cameraPitch < var11) {
																	WorldMapArea.cameraPitch = (var11 - WorldMapArea.cameraPitch) * class0.field6 / 1000 + WorldMapArea.cameraPitch + Players.field1363;
																	if (WorldMapArea.cameraPitch > var11) {
																		WorldMapArea.cameraPitch = var11;
																	}
																}

																if (WorldMapArea.cameraPitch > var11) {
																	WorldMapArea.cameraPitch -= class0.field6 * (WorldMapArea.cameraPitch - var11) / 1000 + Players.field1363;
																	if (WorldMapArea.cameraPitch < var11) {
																		WorldMapArea.cameraPitch = var11;
																	}
																}

																int var27 = var12 - class69.cameraYaw;
																if (var27 > 1024) {
																	var27 -= 2048;
																}

																if (var27 < -1024) {
																	var27 += 2048;
																}

																if (var27 > 0) {
																	class69.cameraYaw = class69.cameraYaw + Players.field1363 + var27 * class0.field6 / 1000;
																	class69.cameraYaw &= 2047;
																}

																if (var27 < 0) {
																	class69.cameraYaw -= Players.field1363 + -var27 * class0.field6 / 1000;
																	class69.cameraYaw &= 2047;
																}

																int var14 = var12 - class69.cameraYaw;
																if (var14 > 1024) {
																	var14 -= 2048;
																}

																if (var14 < -1024) {
																	var14 += 2048;
																}

																if (var14 < 0 && var27 > 0 || var14 > 0 && var27 < 0) {
																	class69.cameraYaw = var12;
																}
															}

															for (var4 = 0; var4 < 5; ++var4) {
																var10002 = field854[var4]++;
															}

															TextureProvider.varcs.tryWrite();
															var4 = MouseRecorder.method2107();
															var5 = class9.method125();
															if (var4 > 15000 && var5 > 15000) {
																logoutTimer = 250;
																MouseHandler.MouseHandler_idleCycles = 14500;
																var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field2269, packetWriter.isaacCipher);
																packetWriter.addNode(var19);
															}

															class13.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field2271, packetWriter.isaacCipher);
																packetWriter.addNode(var19);
															}

															try {
																packetWriter.flush();
															} catch (IOException var28) {
																HealthBarUpdate.method2181();
															}

															return;
														}

														var45 = var44.widget;
														if (var45.childIndex < 0) {
															break;
														}

														var39 = class139.getWidget(var45.parentId);
													} while(var39 == null || var39.children == null || var45.childIndex >= var39.children.length || var45 != var39.children[var45.childIndex]);

													class19.runScriptEvent(var44);
												}
											}

											var45 = var44.widget;
											if (var45.childIndex < 0) {
												break;
											}

											var39 = class139.getWidget(var45.parentId);
										} while(var39 == null || var39.children == null || var45.childIndex >= var39.children.length || var45 != var39.children[var45.childIndex]);

										class19.runScriptEvent(var44);
									}
								}

								var45 = var44.widget;
								if (var45.childIndex < 0) {
									break;
								}

								var39 = class139.getWidget(var45.parentId);
							} while(var39 == null || var39.children == null || var45.childIndex >= var39.children.length || var45 != var39.children[var45.childIndex]);

							class19.runScriptEvent(var44);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-594125034"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = InterfaceParent.canvasWidth;
		int var2 = GameEngine.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (Login.clientPreferences != null) {
			try {
				class42.method511(class10.client, "resize", new Object[]{WorldMapScaleHandler.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "-15264"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			Archive.method4471(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field811[var1]) {
				field812[var1] = true;
			}

			field704[var1] = field811[var1];
			field811[var1] = false;
		}

		field810 = cycle;
		viewportX = -1;
		viewportY = -1;
		ScriptFrame.field579 = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			Skeleton.drawWidgets(rootInterface, 0, 0, InterfaceParent.canvasWidth, GameEngine.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class18.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class18.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				WorldMapDecoration.method3105(viewportX, viewportY);
			}
		} else {
			BufferedSource.method5918();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field704[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field812[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		class258.method4608(class26.Client_plane, Varcs.localPlayer.x, Varcs.localPlayer.y, field799);
		field799 = 0;
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		signature = "(Ldn;I)Z",
		garbageValue = "2074217891"
	)
	final boolean method1233(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var18;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1388) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1391 = 0;
						var1.field1388 = false;
					}

					var3.offset = 0;
					if (var3.method6529()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1391 = 0;
					}

					var1.field1388 = true;
					ServerPacket[] var4 = ItemLayer.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1391 = 0;
				timer.method5577();
				var1.field1393 = var1.field1392;
				var1.field1392 = var1.field1381;
				var1.field1381 = var1.serverPacket;
				int var17;
				Widget var57;
				if (ServerPacket.field2412 == var1.serverPacket) {
					var17 = var3.method6629();
					var57 = class139.getWidget(var17);

					for (var6 = 0; var6 < var57.itemIds.length; ++var6) {
						var57.itemIds[var6] = -1;
						var57.itemIds[var6] = 0;
					}

					class29.invalidateWidget(var57);
					var1.serverPacket = null;
					return true;
				}

				Widget var19;
				boolean var73;
				if (ServerPacket.field2405 == var1.serverPacket) {
					var73 = var3.method6610() == 1;
					var5 = var3.readInt();
					var19 = class139.getWidget(var5);
					if (var73 != var19.isHidden) {
						var19.isHidden = var73;
						class29.invalidateWidget(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2369 == var1.serverPacket) {
					class105.method2255();
					runEnergy = var3.readUnsignedByte();
					field803 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2370 == var1.serverPacket) {
					MusicPatchPcmStream.method4148(class203.field2327);
					var1.serverPacket = null;
					return true;
				}

				String var45;
				if (ServerPacket.field2435 == var1.serverPacket) {
					var45 = var3.readStringCp1252NullTerminated();
					var18 = AbstractFont.escapeBrackets(GrandExchangeOfferAgeComparator.method4607(class16.method258(var3)));
					class69.addGameMessage(6, var45, var18);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2394 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					var19 = class139.getWidget(var17);
					if (var19.modelType != 1 || var5 != var19.modelId) {
						var19.modelType = 1;
						var19.modelId = var5;
						class29.invalidateWidget(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2432 == var1.serverPacket) {
					MusicPatchPcmStream.method4148(class203.field2335);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2378 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var17] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false);
					}

					field801 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				byte var56;
				if (ServerPacket.field2440 == var1.serverPacket) {
					field800 = cycleCntr;
					var56 = var3.readByte();
					class19 var66 = new class19(var3);
					class3 var71;
					if (var56 >= 0) {
						var71 = field820[var56];
					} else {
						var71 = IsaacCipher.field4266;
					}

					var66.method286(var71);
					var1.serverPacket = null;
					return true;
				}

				long var7;
				long var20;
				String var22;
				int var53;
				if (ServerPacket.field2376 == var1.serverPacket) {
					var45 = var3.readStringCp1252NullTerminated();
					var20 = (long)var3.readUnsignedShort();
					var7 = (long)var3.readMedium();
					PlayerType var9 = (PlayerType)UserComparator8.findEnumerated(WallDecoration.PlayerType_values(), var3.readUnsignedByte());
					long var10 = var7 + (var20 << 32);
					boolean var12 = false;

					for (var53 = 0; var53 < 100; ++var53) {
						if (field689[var53] == var10) {
							var12 = true;
							break;
						}
					}

					if (class13.friendSystem.isIgnored(new Username(var45, AbstractUserComparator.loginType))) {
						var12 = true;
					}

					if (!var12 && field716 == 0) {
						field689[field760] = var10;
						field760 = (field760 + 1) % 100;
						var22 = AbstractFont.escapeBrackets(GrandExchangeOfferAgeComparator.method4607(class16.method258(var3)));
						byte var55;
						if (var9.isPrivileged) {
							var55 = 7;
						} else {
							var55 = 3;
						}

						if (var9.modIcon != -1) {
							class69.addGameMessage(var55, class337.method5986(var9.modIcon) + var45, var22);
						} else {
							class69.addGameMessage(var55, var45, var22);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2401 == var1.serverPacket) {
					isCameraLocked = false;

					for (var17 = 0; var17 < 5; ++var17) {
						field850[var17] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2411 == var1.serverPacket) {
					var56 = var3.method6678();
					var5 = var3.method6766();
					Varps.Varps_temp[var5] = var56;
					if (Varps.Varps_main[var5] != var56) {
						Varps.Varps_main[var5] = var56;
					}

					class27.changeGameOptions(var5);
					field788[++field789 - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2416 == var1.serverPacket) {
					FriendsChatManager.field3818 = var3.method6609();
					class18.field145 = var3.method6623();

					while (var3.offset < var1.serverPacketLength) {
						var17 = var3.readUnsignedByte();
						class203 var65 = AbstractWorldMapData.method3099()[var17];
						MusicPatchPcmStream.method4148(var65);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2380 == var1.serverPacket) {
					var45 = var3.readStringCp1252NullTerminated();
					Object[] var64 = new Object[var45.length() + 1];

					for (var6 = var45.length() - 1; var6 >= 0; --var6) {
						if (var45.charAt(var6) == 's') {
							var64[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var64[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var64[0] = new Integer(var3.readInt());
					ScriptEvent var70 = new ScriptEvent();
					var70.args = var64;
					class19.runScriptEvent(var70);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2385 == var1.serverPacket) {
					var45 = var3.readStringCp1252NullTerminated();
					var5 = var3.method6609();
					var6 = var3.readUnsignedByte();
					if (var5 >= 1 && var5 <= 8) {
						if (var45.equalsIgnoreCase("null")) {
							var45 = null;
						}

						playerMenuActions[var5 - 1] = var45;
						playerOptionsPriorities[var5 - 1] = var6 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				String var68;
				if (ServerPacket.field2377 == var1.serverPacket) {
					byte[] var49 = new byte[var1.serverPacketLength];
					var3.method6530(var49, 0, var49.length);
					Buffer var63 = new Buffer(var49);
					var68 = var63.readStringCp1252NullTerminated();
					class302.openURL(var68, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2363 == var1.serverPacket) {
					for (var17 = 0; var17 < players.length; ++var17) {
						if (players[var17] != null) {
							players[var17].sequence = -1;
						}
					}

					for (var17 = 0; var17 < npcs.length; ++var17) {
						if (npcs[var17] != null) {
							npcs[var17].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2419 == var1.serverPacket) {
					for (var17 = 0; var17 < VarpDefinition.VarpDefinition_fileCount; ++var17) {
						VarpDefinition var61 = class303.VarpDefinition_get(var17);
						if (var61 != null) {
							Varps.Varps_temp[var17] = 0;
							Varps.Varps_main[var17] = 0;
						}
					}

					class105.method2255();
					field789 += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2382 == var1.serverPacket) {
					var17 = var3.readUShortSmart();
					boolean var58 = var3.readUnsignedByte() == 1;
					var68 = "";
					boolean var76 = false;
					if (var58) {
						var68 = var3.readStringCp1252NullTerminated();
						if (class13.friendSystem.isIgnored(new Username(var68, AbstractUserComparator.loginType))) {
							var76 = true;
						}
					}

					String var51 = var3.readStringCp1252NullTerminated();
					if (!var76) {
						class69.addGameMessage(var17, var68, var51);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2352 == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 64;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 128;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 64;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 64;
							hintArrowSubY = 128;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						field607 = var3.readUnsignedByte() * 2;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2441 == var1.serverPacket) {
					Coord.field2591 = new class338(FriendSystem.field910);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2425 == var1.serverPacket) {
					MusicPatchPcmStream.method4148(class203.field2334);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2365 == var1.serverPacket) {
					var73 = var3.readBoolean();
					if (var73) {
						if (class105.field1331 == null) {
							class105.field1331 = new class263();
						}
					} else {
						class105.field1331 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2353 == var1.serverPacket) {
					rebootTimer = var3.method6766() * 30;
					field803 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				int var23;
				Widget var50;
				if (ServerPacket.field2395 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					var5 = var3.method6617();
					var6 = var3.method6628();
					var23 = var3.method6766();
					var50 = class139.getWidget(var6);
					if (var23 != var50.modelAngleX || var5 != var50.modelAngleY || var17 != var50.modelZoom) {
						var50.modelAngleX = var23;
						var50.modelAngleY = var5;
						var50.modelZoom = var17;
						class29.invalidateWidget(var50);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2387 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readInt();
					var6 = class80.getGcDuration();
					PacketBufferNode var72 = ObjectComposition.getPacketBufferNode(ClientPacket.field2297, packetWriter.isaacCipher);
					var72.packetBuffer.method6658(GameEngine.fps);
					var72.packetBuffer.method6624(var17);
					var72.packetBuffer.writeInt(var5);
					var72.packetBuffer.method6606(var6);
					packetWriter.addNode(var72);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2354 == var1.serverPacket) {
					class13.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class1.FriendSystem_invalidateIgnoreds();
					field797 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2361 == var1.serverPacket) {
					class11.updatePlayers(var3, var1.serverPacketLength);
					TaskHandler.method2523();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2384 == var1.serverPacket) {
					var17 = var3.method6766();
					var5 = var3.method6629();
					var19 = class139.getWidget(var5);
					if (var19.modelType != 2 || var17 != var19.modelId) {
						var19.modelType = 2;
						var19.modelId = var17;
						class29.invalidateWidget(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2355 == var1.serverPacket) {
					MusicPatchPcmStream.method4148(class203.field2331);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2442 == var1.serverPacket) {
					Coord.field2591 = null;
					var1.serverPacket = null;
					return true;
				}

				Widget var24;
				if (ServerPacket.field2364 == var1.serverPacket) {
					var17 = var3.method6621();
					var5 = var3.method6622();
					var6 = var3.method6629();
					var24 = class139.getWidget(var6);
					if (var17 != var24.rawX || var5 != var24.rawY || var24.xAlignment != 0 || var24.yAlignment != 0) {
						var24.rawX = var17;
						var24.rawY = var5;
						var24.xAlignment = 0;
						var24.yAlignment = 0;
						class29.invalidateWidget(var24);
						this.alignWidget(var24);
						if (var24.type == 0) {
							NameableContainer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var6 >> 16], var24, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2445 == var1.serverPacket) {
					field800 = cycleCntr;
					var56 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var56 >= 0) {
							field820[var56] = null;
						} else {
							IsaacCipher.field4266 = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var56 >= 0) {
						field820[var56] = new class3(var3);
					} else {
						IsaacCipher.field4266 = new class3(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2430 == var1.serverPacket) {
					var17 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					ArchiveDiskAction.queueSoundEffect(var17, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2396 == var1.serverPacket) {
					var17 = var3.readInt();
					InterfaceParent var60 = (InterfaceParent)interfaceParents.get((long)var17);
					if (var60 != null) {
						WorldMapData_1.closeInterface(var60, true);
					}

					if (meslayerContinueWidget != null) {
						class29.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var69;
				if (ServerPacket.field2448 == var1.serverPacket) {
					var17 = var3.method6629();
					var5 = var3.method6766();
					var6 = var3.method6623();
					var69 = (InterfaceParent)interfaceParents.get((long)var17);
					if (var69 != null) {
						WorldMapData_1.closeInterface(var69, var5 != var69.group);
					}

					Player.method2151(var17, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2362 == var1.serverPacket) {
					class13.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field797 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2402 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						WorldMapLabelSize.method2679(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2351 == var1.serverPacket) {
					for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) {
						if (Varps.Varps_main[var17] != Varps.Varps_temp[var17]) {
							Varps.Varps_main[var17] = Varps.Varps_temp[var17];
							class27.changeGameOptions(var17);
							field788[++field789 - 1 & 31] = var17;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2422 == var1.serverPacket) {
					Canvas.privateChatMode = MidiPcmStream.method3952(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				int var25;
				int var26;
				int var28;
				long var29;
				if (ServerPacket.field2408 == var1.serverPacket) {
					var17 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						PlayerComposition.Widget_resetModelFrames(rootInterface);
						AbstractSocket.runWidgetOnLoadListener(rootInterface);

						for (var23 = 0; var23 < 100; ++var23) {
							field811[var23] = true;
						}
					}

					InterfaceParent var75;
					for (; var6-- > 0; var75.field1136 = true) {
						var23 = var3.readInt();
						var25 = var3.readUnsignedShort();
						var26 = var3.readUnsignedByte();
						var75 = (InterfaceParent)interfaceParents.get((long)var23);
						if (var75 != null && var25 != var75.group) {
							WorldMapData_1.closeInterface(var75, true);
							var75 = null;
						}

						if (var75 == null) {
							var75 = Player.method2151(var23, var25, var26);
						}
					}

					for (var69 = (InterfaceParent)interfaceParents.first(); var69 != null; var69 = (InterfaceParent)interfaceParents.next()) {
						if (var69.field1136) {
							var69.field1136 = false;
						} else {
							WorldMapData_1.closeInterface(var69, true);
						}
					}

					widgetClickMasks = new NodeHashTable(512);

					while (var3.offset < var17) {
						var23 = var3.readInt();
						var25 = var3.readUnsignedShort();
						var26 = var3.readUnsignedShort();
						var28 = var3.readInt();

						for (int var52 = var25; var52 <= var26; ++var52) {
							var29 = ((long)var23 << 32) + (long)var52;
							widgetClickMasks.put(new IntegerNode(var28), var29);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2357 == var1.serverPacket) {
					if (rootInterface != -1) {
						class379.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2434 == var1.serverPacket) {
					World var48 = new World();
					var48.host = var3.readStringCp1252NullTerminated();
					var48.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var48.properties = var5;
					class20.updateGameState(45);
					var2.close();
					var2 = null;
					class148.changeWorld(var48);
					var1.serverPacket = null;
					return false;
				}

				long var31;
				if (ServerPacket.field2439 == var1.serverPacket) {
					var56 = var3.readByte();
					var20 = (long)var3.readUnsignedShort();
					var7 = (long)var3.readMedium();
					var31 = (var20 << 32) + var7;
					boolean var11 = false;
					class3 var33 = var56 >= 0 ? field820[var56] : IsaacCipher.field4266;
					if (var33 == null) {
						var11 = true;
					} else {
						for (var53 = 0; var53 < 100; ++var53) {
							if (field689[var53] == var31) {
								var11 = true;
								break;
							}
						}
					}

					if (!var11) {
						field689[field760] = var31;
						field760 = (field760 + 1) % 100;
						var22 = class16.method258(var3);
						int var54 = var56 >= 0 ? 43 : 46;
						Projectile.addChatMessage(var54, "", var22, var33.field25);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2415 == var1.serverPacket) {
					isCameraLocked = true;
					ModeWhere.field3368 = var3.readUnsignedByte() * 128;
					AttackOption.field1339 = var3.readUnsignedByte() * 128;
					class2.field15 = var3.readUnsignedShort();
					Players.field1363 = var3.readUnsignedByte();
					class0.field6 = var3.readUnsignedByte();
					if (class0.field6 >= 100) {
						var17 = ModeWhere.field3368 * 16384 + 64;
						var5 = AttackOption.field1339 * 16384 + 64;
						var6 = UserComparator7.getTileHeight(var17, var5, class26.Client_plane) - class2.field15;
						var23 = var17 - ModeWhere.cameraX;
						var25 = var6 - WorldMapRectangle.cameraY;
						var26 = var5 - ReflectionCheck.cameraZ;
						var28 = (int)Math.sqrt((double)(var26 * var26 + var23 * var23));
						WorldMapArea.cameraPitch = (int)(Math.atan2((double)var25, (double)var28) * 325.949D) & 2047;
						class69.cameraYaw = (int)(Math.atan2((double)var23, (double)var26) * -325.949D) & 2047;
						if (WorldMapArea.cameraPitch < 128) {
							WorldMapArea.cameraPitch = 128;
						}

						if (WorldMapArea.cameraPitch > 383) {
							WorldMapArea.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2358 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2392 == var1.serverPacket) {
					var17 = var3.method6629();
					var5 = var3.method6718();
					var19 = class139.getWidget(var17);
					if (var5 != var19.sequenceId || var5 == -1) {
						var19.sequenceId = var5;
						var19.modelFrame = 0;
						var19.modelFrameCycle = 0;
						class29.invalidateWidget(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2424 == var1.serverPacket) {
					var73 = var3.readUnsignedByte() == 1;
					if (var73) {
						HealthBarUpdate.field1272 = ObjectSound.currentTimeMillis() - var3.readLong();
						Calendar.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						Calendar.grandExchangeEvents = null;
					}

					field802 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2404 == var1.serverPacket) {
					MusicPatchPcmStream.method4148(class203.field2328);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2393 == var1.serverPacket) {
					if (InterfaceParent.clanChat != null) {
						InterfaceParent.clanChat.method5653(var3);
					}

					class159.method3121();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2390 == var1.serverPacket) {
					var17 = var3.method6617();
					if (var17 == 65535) {
						var17 = -1;
					}

					var5 = var3.method6628();
					var6 = var3.method6748();
					if (var6 == 65535) {
						var6 = -1;
					}

					var23 = var3.readInt();

					for (var25 = var17; var25 <= var6; ++var25) {
						var31 = ((long)var5 << 32) + (long)var25;
						Node var77 = widgetClickMasks.get(var31);
						if (var77 != null) {
							var77.remove();
						}

						widgetClickMasks.put(new IntegerNode(var23), var31);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2418 == var1.serverPacket) {
					Players.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2413 == var1.serverPacket) {
					var17 = var3.method6628();
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					var24 = class139.getWidget(var17);
					var24.field2680 = var5 + (var6 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2366 == var1.serverPacket) {
					var45 = var3.readStringCp1252NullTerminated();
					var5 = var3.method6627();
					var19 = class139.getWidget(var5);
					if (!var45.equals(var19.text)) {
						var19.text = var45;
						class29.invalidateWidget(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2427 == var1.serverPacket) {
					MusicPatchPcmStream.method4148(class203.field2332);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2446 == var1.serverPacket) {
					var17 = var3.method6748();
					if (var17 == 65535) {
						var17 = -1;
					}

					class4.playSong(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2428 == var1.serverPacket) {
					var17 = var3.method6642();
					var5 = var3.method6766();
					if (var5 == 65535) {
						var5 = -1;
					}

					HealthBarUpdate.method2175(var5, var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2437 == var1.serverPacket) {
					UserComparator4.updateNpcs(true, var3, true);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2386 == var1.serverPacket) {
					MusicPatchPcmStream.method4148(class203.field2330);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2372 == var1.serverPacket) {
					MusicPatchPcmStream.method4148(class203.field2329);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2356 == var1.serverPacket) {
					MusicPatchPcmStream.method4148(class203.field2339);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2423 == var1.serverPacket) {
					var17 = var3.method6629();
					var5 = var3.method6629();
					InterfaceParent var67 = (InterfaceParent)interfaceParents.get((long)var5);
					var69 = (InterfaceParent)interfaceParents.get((long)var17);
					if (var69 != null) {
						WorldMapData_1.closeInterface(var69, var67 == null || var67.group != var69.group);
					}

					if (var67 != null) {
						var67.remove();
						interfaceParents.put(var67, (long)var17);
					}

					var50 = class139.getWidget(var5);
					if (var50 != null) {
						class29.invalidateWidget(var50);
					}

					var50 = class139.getWidget(var17);
					if (var50 != null) {
						class29.invalidateWidget(var50);
						NameableContainer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var50.id >>> 16], var50, true);
					}

					if (rootInterface != -1) {
						class379.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2429 == var1.serverPacket) {
					UserComparator4.updateNpcs(false, var3, true);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2367 == var1.serverPacket) {
					class23.logOut();
					var1.serverPacket = null;
					return false;
				}

				int var15;
				String var42;
				if (ServerPacket.field2438 == var1.serverPacket) {
					var56 = var3.readByte();
					var18 = var3.readStringCp1252NullTerminated();
					long var35 = (long)var3.readUnsignedShort();
					long var37 = (long)var3.readMedium();
					PlayerType var74 = (PlayerType)UserComparator8.findEnumerated(WallDecoration.PlayerType_values(), var3.readUnsignedByte());
					long var39 = var37 + (var35 << 32);
					boolean var13 = false;
					class3 var41 = null;
					var41 = var56 >= 0 ? field820[var56] : IsaacCipher.field4266;
					if (var41 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var74.isUser && class13.friendSystem.isIgnored(new Username(var18, AbstractUserComparator.loginType))) {
									var13 = true;
								}
								break;
							}

							if (var39 == field689[var15]) {
								var13 = true;
								break;
							}

							++var15;
						}
					}

					if (!var13) {
						field689[field760] = var39;
						field760 = (field760 + 1) % 100;
						var42 = AbstractFont.escapeBrackets(class16.method258(var3));
						int var16 = var56 >= 0 ? 41 : 44;
						if (var74.modIcon != -1) {
							Projectile.addChatMessage(var16, class337.method5986(var74.modIcon) + var18, var42, var41.field25);
						} else {
							Projectile.addChatMessage(var16, var18, var42, var41.field25);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2414 == var1.serverPacket) {
					class18.field145 = var3.method6610();
					FriendsChatManager.field3818 = var3.method6623();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2374 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					ItemContainer.forceDisconnect(var17);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2431 == var1.serverPacket) {
					UserComparator4.updateNpcs(true, var3, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2379 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.method6617();
					var19 = class139.getWidget(var17);
					if (var19 != null && var19.type == 0) {
						if (var5 > var19.scrollHeight - var19.height) {
							var5 = var19.scrollHeight - var19.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var19.scrollY) {
							var19.scrollY = var5;
							class29.invalidateWidget(var19);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2391 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var23 = var3.readUnsignedByte();
					field850[var17] = true;
					field601[var17] = var5;
					field698[var17] = var6;
					field853[var17] = var23;
					field854[var17] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2417 == var1.serverPacket) {
					isCameraLocked = true;
					class5.field40 = var3.readUnsignedByte() * 128;
					ApproximateRouteStrategy.field592 = var3.readUnsignedByte() * 128;
					WorldMapLabelSize.field1569 = var3.readUnsignedShort();
					Skeleton.field1927 = var3.readUnsignedByte();
					UserComparator9.field1435 = var3.readUnsignedByte();
					if (UserComparator9.field1435 >= 100) {
						ModeWhere.cameraX = class5.field40 * 16384 + 64;
						ReflectionCheck.cameraZ = ApproximateRouteStrategy.field592 * 16384 + 64;
						WorldMapRectangle.cameraY = UserComparator7.getTileHeight(ModeWhere.cameraX, ReflectionCheck.cameraZ, class26.Client_plane) - WorldMapLabelSize.field1569;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2400 == var1.serverPacket) {
					class105.method2255();
					var17 = var3.method6609();
					var5 = var3.method6628();
					var6 = var3.method6623();
					experience[var6] = var5;
					currentLevels[var6] = var17;
					levels[var6] = 1;

					for (var23 = 0; var23 < 98; ++var23) {
						if (var5 >= Skills.Skills_experienceTable[var23]) {
							levels[var6] = var23 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2443 == var1.serverPacket) {
					field786 = cycleCntr;
					var56 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var56 >= 0) {
							field831[var56] = null;
						} else {
							ObjectSound.field928 = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var56 >= 0) {
						field831[var56] = new class11(var3);
					} else {
						ObjectSound.field928 = new class11(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2375 == var1.serverPacket) {
					var17 = var3.method6766();
					var5 = var3.method6627();
					Varps.Varps_temp[var17] = var5;
					if (Varps.Varps_main[var17] != var5) {
						Varps.Varps_main[var17] = var5;
					}

					class27.changeGameOptions(var17);
					field788[++field789 - 1 & 31] = var17;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2407 == var1.serverPacket) {
					class18.field145 = var3.method6609();
					FriendsChatManager.field3818 = var3.method6610();

					for (var17 = class18.field145; var17 < class18.field145 + 8; ++var17) {
						for (var5 = FriendsChatManager.field3818; var5 < FriendsChatManager.field3818 + 8; ++var5) {
							if (groundItems[class26.Client_plane][var17][var5] != null) {
								groundItems[class26.Client_plane][var17][var5] = null;
								class225.updateItemPile(var17, var5);
							}
						}
					}

					for (PendingSpawn var47 = (PendingSpawn)pendingSpawns.last(); var47 != null; var47 = (PendingSpawn)pendingSpawns.previous()) {
						if (var47.x >= class18.field145 && var47.x < class18.field145 + 8 && var47.y >= FriendsChatManager.field3818 && var47.y < FriendsChatManager.field3818 + 8 && var47.plane == class26.Client_plane) {
							var47.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2368 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var17 < -70000) {
						var5 += 32768;
					}

					if (var17 >= 0) {
						var19 = class139.getWidget(var17);
					} else {
						var19 = null;
					}

					for (; var3.offset < var1.serverPacketLength; SecureRandomFuture.itemContainerSetItem(var5, var23, var25 - 1, var26)) {
						var23 = var3.readUShortSmart();
						var25 = var3.readUnsignedShort();
						var26 = 0;
						if (var25 != 0) {
							var26 = var3.readUnsignedByte();
							if (var26 == 255) {
								var26 = var3.readInt();
							}
						}

						if (var19 != null && var23 >= 0 && var23 < var19.itemIds.length) {
							var19.itemIds[var23] = var25;
							var19.itemQuantities[var23] = var26;
						}
					}

					if (var19 != null) {
						class29.invalidateWidget(var19);
					}

					class105.method2255();
					changedItemContainers[++field791 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2433 == var1.serverPacket) {
					var17 = var3.readInt();
					if (var17 != field684) {
						field684 = var17;
						class9.method119();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2359 == var1.serverPacket) {
					publicChatMode = var3.method6623();
					tradeChatMode = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2403 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.method6629();
					var24 = class139.getWidget(var17);
					ItemComposition var8;
					if (!var24.isIf3) {
						if (var5 == -1) {
							var24.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var8 = class23.ItemDefinition_get(var5);
						var24.modelType = 4;
						var24.modelId = var5;
						var24.modelAngleX = var8.xan2d;
						var24.modelAngleY = var8.yan2d;
						var24.modelZoom = var8.zoom2d * 100 / var6;
						class29.invalidateWidget(var24);
					} else {
						var24.itemId = var5;
						var24.itemQuantity = var6;
						var8 = class23.ItemDefinition_get(var5);
						var24.modelAngleX = var8.xan2d;
						var24.modelAngleY = var8.yan2d;
						var24.modelAngleZ = var8.zan2d;
						var24.modelOffsetX = var8.offsetX2d;
						var24.modelOffsetY = var8.offsetY2d;
						var24.modelZoom = var8.zoom2d;
						if (var8.isStackable == 1) {
							var24.itemQuantityMode = 1;
						} else {
							var24.itemQuantityMode = 2;
						}

						if (var24.field2720 > 0) {
							var24.modelZoom = var24.modelZoom * 32 / var24.field2720;
						} else if (var24.rawWidth > 0) {
							var24.modelZoom = var24.modelZoom * 32 / var24.rawWidth;
						}

						class29.invalidateWidget(var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2383 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					Actor.method2174(var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2444 == var1.serverPacket) {
					field786 = cycleCntr;
					var56 = var3.readByte();
					class2 var59 = new class2(var3);
					class11 var62;
					if (var56 >= 0) {
						var62 = field831[var56];
					} else {
						var62 = ObjectSound.field928;
					}

					var59.method29(var62);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2389 == var1.serverPacket) {
					if (Coord.field2591 == null) {
						Coord.field2591 = new class338(FriendSystem.field910);
					}

					class389 var46 = FriendSystem.field910.method5996(var3);
					Coord.field2591.field3926.vmethod6336(var46.field4215, var46.field4216);
					field794[++field613 - 1 & 31] = var46.field4215;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2410 == var1.serverPacket) {
					class13.friendSystem.method1720();
					field797 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2360 == var1.serverPacket) {
					var17 = var3.method6748();
					rootInterface = var17;
					this.resizeRoot(false);
					PlayerComposition.Widget_resetModelFrames(var17);
					AbstractSocket.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field811[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2398 == var1.serverPacket) {
					var45 = var3.readStringCp1252NullTerminated();
					var20 = var3.readLong();
					var7 = (long)var3.readUnsignedShort();
					var31 = (long)var3.readMedium();
					PlayerType var34 = (PlayerType)UserComparator8.findEnumerated(WallDecoration.PlayerType_values(), var3.readUnsignedByte());
					var29 = var31 + (var7 << 32);
					boolean var14 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (var29 == field689[var15]) {
							var14 = true;
							break;
						}
					}

					if (var34.isUser && class13.friendSystem.isIgnored(new Username(var45, AbstractUserComparator.loginType))) {
						var14 = true;
					}

					if (!var14 && field716 == 0) {
						field689[field760] = var29;
						field760 = (field760 + 1) % 100;
						var42 = AbstractFont.escapeBrackets(GrandExchangeOfferAgeComparator.method4607(class16.method258(var3)));
						if (var34.modIcon != -1) {
							Projectile.addChatMessage(9, class337.method5986(var34.modIcon) + var45, var42, Varcs.base37DecodeLong(var20));
						} else {
							Projectile.addChatMessage(9, var45, var42, Varcs.base37DecodeLong(var20));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2421 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						InterfaceParent.clanChat = null;
					} else {
						if (InterfaceParent.clanChat == null) {
							InterfaceParent.clanChat = new FriendsChatManager(AbstractUserComparator.loginType, class10.client);
						}

						InterfaceParent.clanChat.readUpdate(var3);
					}

					class159.method3121();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2399 == var1.serverPacket) {
					class105.method2255();
					weight = var3.readShort();
					field803 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2350 == var1.serverPacket) {
					var17 = var3.method6766();
					class32.method393(var17);
					changedItemContainers[++field791 - 1 & 31] = var17 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2409 == var1.serverPacket) {
					var17 = var3.method6766();
					var5 = var3.method6628();
					var6 = var17 >> 10 & 31;
					var23 = var17 >> 5 & 31;
					var25 = var17 & 31;
					var26 = (var23 << 11) + (var6 << 19) + (var25 << 3);
					Widget var27 = class139.getWidget(var5);
					if (var26 != var27.color) {
						var27.color = var26;
						class29.invalidateWidget(var27);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2397 == var1.serverPacket) {
					UserComparator4.updateNpcs(false, var3, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2381 == var1.serverPacket) {
					Players.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2371 == var1.serverPacket) {
					class4.method77(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2406 == var1.serverPacket) {
					var17 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var17 < -70000) {
						var5 += 32768;
					}

					if (var17 >= 0) {
						var19 = class139.getWidget(var17);
					} else {
						var19 = null;
					}

					if (var19 != null) {
						for (var23 = 0; var23 < var19.itemIds.length; ++var23) {
							var19.itemIds[var23] = 0;
							var19.itemQuantities[var23] = 0;
						}
					}

					UserComparator8.clearItemContainer(var5);
					var23 = var3.readUnsignedShort();

					for (var25 = 0; var25 < var23; ++var25) {
						var26 = var3.method6617();
						var28 = var3.method6623();
						if (var28 == 255) {
							var28 = var3.method6628();
						}

						if (var19 != null && var25 < var19.itemIds.length) {
							var19.itemIds[var25] = var26;
							var19.itemQuantities[var25] = var28;
						}

						SecureRandomFuture.itemContainerSetItem(var5, var25, var26 - 1, var28);
					}

					if (var19 != null) {
						class29.invalidateWidget(var19);
					}

					class105.method2255();
					changedItemContainers[++field791 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2426 == var1.serverPacket) {
					class1.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2436 == var1.serverPacket) {
					var17 = var3.method6629();
					var57 = class139.getWidget(var17);
					var57.modelType = 3;
					var57.modelId = Varcs.localPlayer.appearance.getChatHeadId();
					class29.invalidateWidget(var57);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2373 == var1.serverPacket) {
					MusicPatchPcmStream.method4148(class203.field2333);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2388 == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				class223.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1392 != null ? var1.field1392.id : -1) + "," + (var1.field1393 != null ? var1.field1393.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class23.logOut();
			} catch (IOException var43) {
				HealthBarUpdate.method2181();
			} catch (Exception var44) {
				var18 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1392 != null ? var1.field1392.id : -1) + "," + (var1.field1393 != null ? var1.field1393.id : -1) + "," + var1.serverPacketLength + "," + (Varcs.localPlayer.pathX[0] + ItemLayer.baseX * 64) + "," + (Varcs.localPlayer.pathY[0] + Tile.baseY * 64) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var18 = var18 + var3.array[var6] + ",";
				}

				class223.RunException_sendStackTrace(var18, var44);
				class23.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "53"
	)
	@Export("menu")
	final void menu() {
		PlayerType.method4410();
		if (ClientPacket.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var1 = MouseHandler.MouseHandler_lastButton;
				int var2;
				int var4;
				int var5;
				int var6;
				int var7;
				if (isMenuOpen) {
					int var3;
					int var8;
					if (var1 != 1 && (MouseHandler.mouseCam || var1 != 4)) {
						var2 = MouseHandler.MouseHandler_x;
						var3 = MouseHandler.MouseHandler_y;
						if (var2 < class16.menuX - 10 || var2 > class16.menuX + Player.menuWidth + 10 || var3 < FontName.menuY - 10 || var3 > class11.menuHeight + FontName.menuY + 10) {
							isMenuOpen = false;
							var4 = class16.menuX;
							var5 = FontName.menuY;
							var6 = Player.menuWidth;
							var7 = class11.menuHeight;

							for (var8 = 0; var8 < rootWidgetCount; ++var8) {
								if (rootWidgetXs[var8] + rootWidgetWidths[var8] > var4 && rootWidgetXs[var8] < var6 + var4 && rootWidgetYs[var8] + rootWidgetHeights[var8] > var5 && rootWidgetYs[var8] < var7 + var5) {
									field811[var8] = true;
								}
							}
						}
					}

					if (var1 == 1 || !MouseHandler.mouseCam && var1 == 4) {
						var2 = class16.menuX;
						var3 = FontName.menuY;
						var4 = Player.menuWidth;
						var5 = MouseHandler.MouseHandler_lastPressedX;
						var6 = MouseHandler.MouseHandler_lastPressedY;
						var7 = -1;

						int var9;
						for (var8 = 0; var8 < menuOptionsCount; ++var8) {
							var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31;
							if (var5 > var2 && var5 < var2 + var4 && var6 > var9 - 13 && var6 < var9 + 3) {
								var7 = var8;
							}
						}

						int var10;
						int var11;
						if (var7 != -1 && var7 >= 0) {
							var8 = menuArguments1[var7];
							var9 = menuArguments2[var7];
							var10 = menuOpcodes[var7];
							var11 = menuIdentifiers[var7];
							String var14 = menuActions[var7];
							String var13 = menuTargets[var7];
							UserComparator9.menuAction(var8, var9, var10, var11, var14, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}

						isMenuOpen = false;
						var8 = class16.menuX;
						var9 = FontName.menuY;
						var10 = Player.menuWidth;
						var11 = class11.menuHeight;

						for (int var12 = 0; var12 < rootWidgetCount; ++var12) {
							if (rootWidgetXs[var12] + rootWidgetWidths[var12] > var8 && rootWidgetXs[var12] < var8 + var10 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var9 && rootWidgetYs[var12] < var11 + var9) {
								field811[var12] = true;
							}
						}
					}
				} else {
					var2 = menuOptionsCount - 1;
					if ((var1 == 1 || !MouseHandler.mouseCam && var1 == 4) && var2 >= 0) {
						var4 = menuOpcodes[var2];
						if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) {
							var5 = menuArguments1[var2];
							var6 = menuArguments2[var2];
							Widget var17 = class139.getWidget(var6);
							if (class2.method39(DirectByteArrayCopier.getWidgetClickMask(var17)) || class69.method1165(DirectByteArrayCopier.getWidgetClickMask(var17))) {
								if (ClientPacket.dragInventoryWidget != null && !field714 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
									class26.method357(draggedWidgetX, draggedWidgetY);
								}

								field714 = false;
								itemDragDuration = 0;
								if (ClientPacket.dragInventoryWidget != null) {
									class29.invalidateWidget(ClientPacket.dragInventoryWidget);
								}

								ClientPacket.dragInventoryWidget = class139.getWidget(var6);
								dragItemSlotSource = var5;
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
								if (var2 >= 0) {
									class25.tempMenuAction = new MenuAction();
									class25.tempMenuAction.param0 = menuArguments1[var2];
									class25.tempMenuAction.param1 = menuArguments2[var2];
									class25.tempMenuAction.opcode = menuOpcodes[var2];
									class25.tempMenuAction.identifier = menuIdentifiers[var2];
									class25.tempMenuAction.action = menuActions[var2];
								}

								class29.invalidateWidget(ClientPacket.dragInventoryWidget);
								return;
							}
						}
					}

					if ((var1 == 1 || !MouseHandler.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
						var1 = 2;
					}

					if ((var1 == 1 || !MouseHandler.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) {
						var4 = menuArguments1[var2];
						var5 = menuArguments2[var2];
						var6 = menuOpcodes[var2];
						var7 = menuIdentifiers[var2];
						String var15 = menuActions[var2];
						String var16 = menuTargets[var2];
						UserComparator9.menuAction(var4, var5, var6, var7, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}

					if (var1 == 2 && menuOptionsCount > 0) {
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1310382933"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = Skeleton.method3433();
		return (leftClickOpensMenu == 1 && menuOptionsCount > 2 || Player.method2150(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1656231949"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		SpriteMask.method4172(var1, var2);
		WorldMapArea.scene.menuOpen(class26.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "230478005"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		ModelData0.method3784(rootInterface, InterfaceParent.canvasWidth, GameEngine.canvasHeight, var1);
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		signature = "(Lhu;I)V",
		garbageValue = "2095666186"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class139.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = InterfaceParent.canvasWidth;
			var4 = GameEngine.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		class401.alignWidgetSize(var1, var3, var4, false);
		KeyHandler.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2104011211"
	)
	final void method1239() {
		class29.invalidateWidget(clickedWidget);
		++class34.widgetDragDuration;
		if (field783 && field780) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field727) {
				var1 = field727;
			}

			if (var1 + clickedWidget.width > field727 + clickedWidgetParent.width) {
				var1 = field727 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field782) {
				var2 = field782;
			}

			if (var2 + clickedWidget.height > field782 + clickedWidgetParent.height) {
				var2 = field782 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field784;
			int var4 = var2 - field845;
			int var5 = clickedWidget.dragZoneSize;
			if (class34.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field727 + clickedWidgetParent.scrollX;
			int var7 = var2 - field782 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class19.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						class19.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var9 = clickedWidget;
						int var10 = AbstractWorldMapData.method3079(DirectByteArrayCopier.getWidgetClickMask(var9));
						Widget var13;
						if (var10 == 0) {
							var13 = null;
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9;
									break;
								}

								var9 = class139.getWidget(var9.parentId);
								if (var9 == null) {
									var13 = null;
									break;
								}

								++var11;
							}
						}

						if (var13 != null) {
							PacketBufferNode var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field2307, packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(clickedWidget.childIndex);
							var12.packetBuffer.writeShort(draggedOnWidget.itemId);
							var12.packetBuffer.method6614(clickedWidget.itemId);
							var12.packetBuffer.method6624(draggedOnWidget.id);
							var12.packetBuffer.writeShort(draggedOnWidget.childIndex);
							var12.packetBuffer.method6624(clickedWidget.id);
							packetWriter.addNode(var12);
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field784 + widgetClickX, widgetClickY + field845);
				} else if (menuOptionsCount > 0) {
					class26.method357(widgetClickX + field784, field845 + widgetClickY);
				}

				clickedWidget = null;
			}

		} else {
			if (class34.widgetDragDuration > 1) {
				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		signature = "(I)Llw;",
		garbageValue = "-447538147"
	)
	@Export("username")
	public Username username() {
		return Varcs.localPlayer != null ? Varcs.localPlayer.username : null;
	}
}
