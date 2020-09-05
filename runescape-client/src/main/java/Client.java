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
import netscape.javascript.JSObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed {
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		signature = "Lhq;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -738274361
	)
	static int field881;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = -548379031
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		longValue = -5904511497921322921L
	)
	static long field890;
	@ObfuscatedName("oo")
	static boolean[] field882;
	@ObfuscatedName("or")
	static boolean[] field884;
	@ObfuscatedName("oz")
	static boolean[] field883;
	@ObfuscatedName("no")
	static boolean field880;
	@ObfuscatedName("ol")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = -565689219
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -509271729
	)
	public static int field946;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 1680416831
	)
	static int field870;
	@ObfuscatedName("nx")
	static boolean field799;
	@ObfuscatedName("qk")
	static boolean field704;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -1698989409
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = 907230791
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = -1025599455
	)
	static int field856;
	@ObfuscatedName("og")
	@ObfuscatedSignature(
		signature = "Llc;"
	)
	@Export("widgetClickMasks")
	static NodeHashTable widgetClickMasks;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		signature = "Lhq;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("os")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("ou")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = -2016835687
	)
	static int field785;
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		signature = "Lhq;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 2115914755
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("oy")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -1986502797
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("om")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -1644651357
	)
	static int field864;
	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		signature = "Lbv;"
	)
	static final ApproximateRouteStrategy field950;
	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		signature = "Lji;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = 1703929767
	)
	static int field859;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = 1650820599
	)
	static int field947;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = 918307921
	)
	static int field795;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -1571954779
	)
	static int field775;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -1071833827
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("nw")
	static int[] field863;
	@ObfuscatedName("te")
	static int[] field830;
	@ObfuscatedName("tv")
	static int[] field952;
	@ObfuscatedName("nv")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 965072955
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -259926039
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 706119953
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 347041669
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 1612540519
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ro")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 940085397
	)
	static int field937;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		signature = "Lha;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -812618355
	)
	@Export("areaSoundEffectVolume")
	static int areaSoundEffectVolume;
	@ObfuscatedName("rz")
	static boolean[] field922;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = 1407217563
	)
	static int field942;
	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		signature = "Lhq;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = -751525007
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("qo")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		signature = "Lhq;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("qi")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = 1720412197
	)
	@Export("musicVolume")
	static int musicVolume;
	@ObfuscatedName("qp")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sn")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		signature = "[Ldj;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("se")
	@ObfuscatedGetter(
		intValue = 1815598231
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("qt")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -549724569
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 512054773
	)
	@Export("soundEffectVolume")
	static int soundEffectVolume;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -1205130553
	)
	static int field902;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		longValue = -1783844530730786273L
	)
	static long field901;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 131534275
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		signature = "Lmo;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = -127705051
	)
	static int field707;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = 1491507455
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -1223881297
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("rw")
	static short field769;
	@ObfuscatedName("ru")
	static short field928;
	@ObfuscatedName("np")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("rm")
	static short field938;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 2062422777
	)
	static int field903;
	@ObfuscatedName("pl")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("ry")
	static short field934;
	@ObfuscatedName("rx")
	static short field932;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = 1522828843
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("rq")
	static short field931;
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = 112709455
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		signature = "[Llp;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("pk")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -618238831
	)
	static int field871;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -372222431
	)
	static int field898;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = -1397478813
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = 1838939771
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -1096742287
	)
	static int field873;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -1729596091
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -1158906153
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -1755840079
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("rd")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("rv")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = 197263845
	)
	static int field949;
	@ObfuscatedName("pa")
	static int[] field900;
	@ObfuscatedName("po")
	static int[] field899;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		signature = "Lji;"
	)
	static NodeDeque field877;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		signature = "[Lv;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		signature = "Lji;"
	)
	static NodeDeque field912;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = -1452534743
	)
	static int field872;
	@ObfuscatedName("rr")
	static int[] field740;
	@ObfuscatedName("rh")
	static int[] field678;
	@ObfuscatedName("rl")
	static int[] field926;
	@ObfuscatedName("rk")
	static int[] field925;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 250230651
	)
	static int field865;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = 2027886515
	)
	static int field840;
	@ObfuscatedName("mm")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pj")
	static long[] field896;
	@ObfuscatedName("nq")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = -1157540783
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -541473949
	)
	static int field794;
	@ObfuscatedName("pr")
	static int[] field892;
	@ObfuscatedName("pm")
	static String field913;
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		signature = "Lbt;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = -1163412349
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "[Lft;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("ac")
	static boolean field841;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 908915111
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2146116225
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -77282259
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bg")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("br")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1456761211
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("ba")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1382758875
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cu")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -925075011
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		longValue = -6291898819943529903L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -359806485
	)
	static int field798;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -40955973
	)
	static int field686;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		longValue = -3347850541832475541L
	)
	static long field687;
	@ObfuscatedName("cx")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("cp")
	@Export("displayFps")
	static boolean displayFps;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1440208899
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1549228635
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 748257717
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1282268129
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1561023113
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 4072295
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 2033541658
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1928507712
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -2073298368
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		signature = "Lcd;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		signature = "Lcd;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1866562123
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1673766287
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1209579601
	)
	static int field712;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive1")
	static Archive archive1;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = -55276913
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = -789394093
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -600822047
	)
	static int field822;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -1163587017
	)
	static int field708;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 1593310077
	)
	static int field709;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		signature = "Lff;"
	)
	static class169 field710;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -764965423
	)
	@Export("port1")
	static int port1;
	@ObfuscatedName("ex")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		signature = "Lcs;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("fq")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		signature = "[Lcw;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = 1098794217
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("fz")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = -1040652309
	)
	static int field702;
	@ObfuscatedName("fe")
	static int[] field721;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		signature = "Ldx;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = 1553785571
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("fr")
	static boolean field713;
	@ObfuscatedName("fi")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		signature = "Ljz;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("fw")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -621015009
	)
	static int field728;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -1370106321
	)
	static int field711;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -814779395
	)
	static int field895;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -544516033
	)
	static int field791;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 1012536071
	)
	static int field732;
	@ObfuscatedName("gp")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("gt")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("gn")
	static final int[] field736;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = -570359939
	)
	static int field737;
	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		signature = "[Llp;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = 1066075353
	)
	static int field739;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = 41176893
	)
	static int field670;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = -50916181
	)
	static int field741;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 1119037931
	)
	static int field742;
	@ObfuscatedName("ht")
	static boolean field743;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -977399091
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -1443068431
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = -711285885
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = 1183878553
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = -1283166721
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = -759899857
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -1838293597
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = 170315783
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -1104542973
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = 692568591
	)
	static int field753;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = -1371213621
	)
	static int field796;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = 1555483319
	)
	static int field755;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 1271248647
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = -883817203
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 1521960939
	)
	static int field758;
	@ObfuscatedName("id")
	static boolean field759;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = -1208339905
	)
	static int field829;
	@ObfuscatedName("ik")
	static boolean field761;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = 1611520535
	)
	static int field762;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = 997551691
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -1325247089
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("iu")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("ie")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ir")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("in")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("iy")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("il")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("jj")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("jp")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("jd")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = -383835205
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = -22531197
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -1575851953
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = -693132223
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 1819425115
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -1679326135
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1707383795
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("jv")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = 505509921
	)
	static int field782;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 11951309
	)
	static int field944;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 526374909
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -1126513777
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -1580012453
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = -1831513887
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("jy")
	static boolean field788;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = -1995966425
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -331224419
	)
	static int field790;
	@ObfuscatedName("jn")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		signature = "[Lbf;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = -1852431749
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 648141605
	)
	static int field888;
	@ObfuscatedName("kw")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = -1302257309
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 157805175
	)
	static int field771;
	@ObfuscatedName("ks")
	static int[] field930;
	@ObfuscatedName("kd")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("kz")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("kl")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("kv")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 1152347413
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		signature = "[[[Lji;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		signature = "Lji;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		signature = "Lji;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		signature = "Lji;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("kf")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("kn")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("kg")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -475626583
	)
	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("ll")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 366838629
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 1781251597
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("la")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("lb")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ly")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("lt")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("lg")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("lq")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("lo")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("lc")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("lu")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("lv")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("lw")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 2121046681
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -116000717
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 1628287905
	)
	static int field828;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -1310390487
	)
	static int field770;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -1061875105
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("md")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -1613408879
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -1738766663
	)
	static int field834;
	@ObfuscatedName("mp")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("mu")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -1035655229
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		signature = "Llc;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		signature = "Lkf;"
	)
	Buffer field754;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		signature = "Lm;"
	)
	class9 field714;

	static {
		field841 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		clientType = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field798 = -1;
		field686 = -1;
		field687 = -1L;
		hadFocus = true;
		displayFps = false;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		titleLoadingStage = 0;
		js5ConnectState = 0;
		field712 = 0;
		js5Errors = 0;
		loginState = 0;
		field822 = 0;
		field708 = 0;
		field709 = 0;
		field710 = class169.field2043;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field702 = 0;
		field721 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		field713 = false;
		useBufferedSocket = true;
		timer = new Timer();
		fontsMap = new HashMap();
		field728 = 0;
		field711 = 1;
		field895 = 0;
		field791 = 1;
		field732 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field736 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field737 = 0;
		field739 = 2301979;
		field670 = 5063219;
		field741 = 3353893;
		field742 = 7759444;
		field743 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field753 = 0;
		field796 = 0;
		field755 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field758 = 0;
		field759 = false;
		field829 = 0;
		field761 = false;
		field762 = 0;
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
		field782 = 0;
		field944 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field788 = false;
		itemDragDuration = 0;
		field790 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field888 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field771 = 0;
		field930 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
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
		field828 = 0;
		field770 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field834 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field865 = 0;
		field840 = -1;
		chatEffects = 0;
		field707 = 0;
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
		field799 = false;
		field856 = -1;
		field785 = -1;
		field880 = false;
		field859 = -1;
		field795 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		field863 = new int[32];
		field864 = 0;
		changedItemContainers = new int[32];
		field903 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		chatCycle = 0;
		field870 = 0;
		field871 = 0;
		field872 = 0;
		field873 = 0;
		field775 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field877 = new NodeDeque();
		field912 = new NodeDeque();
		widgetClickMasks = new NodeHashTable(512);
		rootWidgetCount = 0;
		field881 = -2;
		field882 = new boolean[100];
		field883 = new boolean[100];
		field884 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field890 = 0L;
		isResizable = true;
		field892 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field913 = "";
		field896 = new long[100];
		field794 = 0;
		field898 = 0;
		field899 = new int[128];
		field900 = new int[128];
		field901 = -1L;
		field902 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		musicVolume = 255;
		currentTrackGroupId = -1;
		field704 = false;
		soundEffectVolume = 127;
		areaSoundEffectVolume = 127;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field922 = new boolean[5];
		field678 = new int[5];
		field740 = new int[5];
		field925 = new int[5];
		field926 = new int[5];
		field769 = 256;
		field928 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field931 = 1;
		field932 = 32767;
		field938 = 1;
		field934 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field937 = -1;
		field942 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field946 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field949 = 0;
		field950 = new ApproximateRouteStrategy();
		field830 = new int[50];
		field952 = new int[50];
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "912814062"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field890 = PacketWriter.currentTimeMillis() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1974240025"
	)
	@Export("setUp")
	protected final void setUp() {
		class277.method5089(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		port1 = gameBuild == 0 ? 43594 : worldId + 40000;
		class23.port2 = gameBuild == 0 ? 443 : worldId + 50000;
		WorldMapScaleHandler.port3 = port1;
		Calendar.field2535 = class224.field2587;
		WorldMapSprite.field253 = class224.field2589;
		GrandExchangeOfferTotalQuantityComparator.field83 = class224.field2584;
		UserComparator7.field2021 = class224.field2586;
		UserComparator4.urlRequester = new UrlRequester();
		this.setUpKeyboard();
		this.setUpMouse();
		Player.mouseWheel = this.mouseWheel();
		Skeleton.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = class2.getPreferencesFile("", Tiles.field532.name, false);
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

		Tile.clientPreferences = var3;
		this.setUpClipboard();
		VarbitComposition.method4593(this, class60.null_string);
		if (gameBuild != 0) {
			displayFps = true;
		}

		FontName.setWindowedMode(Tile.clientPreferences.windowMode);
		class60.friendSystem = new FriendSystem(WorldMapAreaData.loginType);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-720509728"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		class58.method907();
		GraphicsObject.method2095();
		RouteStrategy.playPcmPlayers();
		int var2;
		synchronized(KeyHandler.KeyHandler_instance) {
			++KeyHandler.KeyHandler_idleCycles;
			KeyHandler.field423 = KeyHandler.field399;
			KeyHandler.field422 = 0;
			if (KeyHandler.field418 >= 0) {
				while (KeyHandler.field418 != KeyHandler.field417) {
					var2 = KeyHandler.field409[KeyHandler.field417];
					KeyHandler.field417 = KeyHandler.field417 + 1 & 127;
					if (var2 < 0) {
						KeyHandler.KeyHandler_pressedKeys[~var2] = false;
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var2] && KeyHandler.field422 < KeyHandler.field421.length - 1) {
							KeyHandler.field421[++KeyHandler.field422 - 1] = var2;
						}

						KeyHandler.KeyHandler_pressedKeys[var2] = true;
					}
				}
			} else {
				for (var2 = 0; var2 < 112; ++var2) {
					KeyHandler.KeyHandler_pressedKeys[var2] = false;
				}

				KeyHandler.field418 = KeyHandler.field417;
			}

			if (KeyHandler.field422 > 0) {
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field399 = KeyHandler.field424;
		}

		WallDecoration.method3409();
		if (Player.mouseWheel != null) {
			int var43 = Player.mouseWheel.useRotation();
			mouseWheelRotation = var43;
		}

		if (gameState == 0) {
			class3.load();
			WorldMapLabel.method498();
		} else if (gameState == 5) {
			class3.doCycleTitle(this);
			class3.load();
			WorldMapLabel.method498();
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class3.doCycleTitle(this);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				AttackOption.method2154(false);
				field728 = 0;
				boolean var54 = true;

				for (var2 = 0; var2 < AbstractUserComparator.regionLandArchives.length; ++var2) {
					if (GrandExchangeEvents.regionMapArchiveIds[var2] != -1 && AbstractUserComparator.regionLandArchives[var2] == null) {
						AbstractUserComparator.regionLandArchives[var2] = WorldMapLabel.archive5.takeFile(GrandExchangeEvents.regionMapArchiveIds[var2], 0);
						if (AbstractUserComparator.regionLandArchives[var2] == null) {
							var54 = false;
							++field728;
						}
					}

					if (Skeleton.regionLandArchiveIds[var2] != -1 && AbstractWorldMapData.regionMapArchives[var2] == null) {
						AbstractWorldMapData.regionMapArchives[var2] = WorldMapLabel.archive5.takeFileEncrypted(Skeleton.regionLandArchiveIds[var2], 0, BoundaryObject.xteaKeys[var2]);
						if (AbstractWorldMapData.regionMapArchives[var2] == null) {
							var54 = false;
							++field728;
						}
					}
				}

				if (!var54) {
					field732 = 1;
				} else {
					field895 = 0;
					var54 = true;

					int var4;
					int var5;
					for (var2 = 0; var2 < AbstractUserComparator.regionLandArchives.length; ++var2) {
						byte[] var3 = AbstractWorldMapData.regionMapArchives[var2];
						if (var3 != null) {
							var4 = (class90.regions[var2] >> 8) * 64 - WorldMapManager.baseX * 64;
							var5 = (class90.regions[var2] & 255) * 64 - WorldMapLabel.baseY * 64;
							if (isInInstance) {
								var4 = 10;
								var5 = 10;
							}

							var54 &= class224.method4117(var3, var4, var5);
						}
					}

					if (!var54) {
						field732 = 2;
					} else {
						if (field732 != 0) {
							Actor.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
						}

						RouteStrategy.playPcmPlayers();
						ScriptEvent.scene.clear();

						for (var2 = 0; var2 < 4; ++var2) {
							collisionMaps[var2].clear();
						}

						int var44;
						for (var2 = 0; var2 < 4; ++var2) {
							for (var44 = 0; var44 < 104; ++var44) {
								for (var4 = 0; var4 < 104; ++var4) {
									Tiles.Tiles_renderFlags[var2][var44][var4] = 0;
								}
							}
						}

						RouteStrategy.playPcmPlayers();
						MidiPcmStream.method3920();
						var2 = AbstractUserComparator.regionLandArchives.length;
						ModeWhere.method3772();
						AttackOption.method2154(true);
						int var7;
						int var8;
						int var10;
						int var11;
						int var12;
						int var13;
						int[] var10000;
						int var47;
						if (!isInInstance) {
							var44 = 0;

							label624:
							while (true) {
								byte[] var6;
								if (var44 >= var2) {
									for (var44 = 0; var44 < var2; ++var44) {
										var4 = (class90.regions[var44] >> 8) * 64 - WorldMapManager.baseX * 64;
										var5 = (class90.regions[var44] & 255) * 64 - WorldMapLabel.baseY * 64;
										var6 = AbstractUserComparator.regionLandArchives[var44];
										if (var6 == null && SpotAnimationDefinition.field3261 < 800) {
											RouteStrategy.playPcmPlayers();
											Player.method1327(var4, var5, 64, 64);
										}
									}

									AttackOption.method2154(true);
									var44 = 0;

									while (true) {
										if (var44 >= var2) {
											break label624;
										}

										byte[] var46 = AbstractWorldMapData.regionMapArchives[var44];
										if (var46 != null) {
											var5 = (class90.regions[var44] >> 8) * 64 - WorldMapManager.baseX * 64;
											var47 = (class90.regions[var44] & 255) * 64 - WorldMapLabel.baseY * 64;
											RouteStrategy.playPcmPlayers();
											BuddyRankComparator.method3524(var46, var5, var47, ScriptEvent.scene, collisionMaps);
										}

										++var44;
									}
								}

								var4 = (class90.regions[var44] >> 8) * 64 - WorldMapManager.baseX * 64;
								var5 = (class90.regions[var44] & 255) * 64 - WorldMapLabel.baseY * 64;
								var6 = AbstractUserComparator.regionLandArchives[var44];
								if (var6 != null) {
									RouteStrategy.playPcmPlayers();
									var7 = class52.field396 * 8 - 48;
									var8 = SpotAnimationDefinition.field3261 * 8 - 48;
									CollisionMap[] var9 = collisionMaps;
									var10 = 0;

									label621:
									while (true) {
										if (var10 >= 4) {
											Buffer var45 = new Buffer(var6);
											var11 = 0;

											while (true) {
												if (var11 >= 4) {
													break label621;
												}

												for (var12 = 0; var12 < 64; ++var12) {
													for (var13 = 0; var13 < 64; ++var13) {
														DynamicObject.loadTerrain(var45, var11, var4 + var12, var5 + var13, var7, var8, 0);
													}
												}

												++var11;
											}
										}

										for (var11 = 0; var11 < 64; ++var11) {
											for (var12 = 0; var12 < 64; ++var12) {
												if (var4 + var11 > 0 && var4 + var11 < 103 && var12 + var5 > 0 && var5 + var12 < 103) {
													var10000 = var9[var10].flags[var11 + var4];
													var10000[var12 + var5] &= -16777217;
												}
											}
										}

										++var10;
									}
								}

								++var44;
							}
						}

						int var48;
						if (isInInstance) {
							var44 = 0;

							label570:
							while (true) {
								int var15;
								int var16;
								int var17;
								CollisionMap[] var19;
								int var21;
								int var22;
								int var23;
								Buffer var49;
								if (var44 >= 4) {
									for (var44 = 0; var44 < 13; ++var44) {
										for (var4 = 0; var4 < 13; ++var4) {
											var5 = instanceChunkTemplates[0][var44][var4];
											if (var5 == -1) {
												Player.method1327(var44 * 8, var4 * 8, 8, 8);
											}
										}
									}

									AttackOption.method2154(true);
									var44 = 0;

									while (true) {
										if (var44 >= 4) {
											break label570;
										}

										RouteStrategy.playPcmPlayers();

										for (var4 = 0; var4 < 13; ++var4) {
											label493:
											for (var5 = 0; var5 < 13; ++var5) {
												var47 = instanceChunkTemplates[var44][var4][var5];
												if (var47 != -1) {
													var7 = var47 >> 24 & 3;
													var8 = var47 >> 1 & 3;
													var48 = var47 >> 14 & 1023;
													var10 = var47 >> 3 & 2047;
													var11 = (var48 / 8 << 8) + var10 / 8;

													for (var12 = 0; var12 < class90.regions.length; ++var12) {
														if (class90.regions[var12] == var11 && AbstractWorldMapData.regionMapArchives[var12] != null) {
															byte[] var50 = AbstractWorldMapData.regionMapArchives[var12];
															int var51 = var4 * 8;
															var15 = var5 * 8;
															var16 = (var48 & 7) * 8;
															var17 = (var10 & 7) * 8;
															Scene var52 = ScriptEvent.scene;
															var19 = collisionMaps;
															var49 = new Buffer(var50);
															var21 = -1;

															while (true) {
																var22 = var49.method5632();
																if (var22 == 0) {
																	continue label493;
																}

																var21 += var22;
																var23 = 0;

																while (true) {
																	int var24 = var49.readUShortSmart();
																	if (var24 == 0) {
																		break;
																	}

																	var23 += var24 - 1;
																	int var25 = var23 & 63;
																	int var26 = var23 >> 6 & 63;
																	int var27 = var23 >> 12;
																	int var28 = var49.readUnsignedByte();
																	int var29 = var28 >> 2;
																	int var30 = var28 & 3;
																	if (var7 == var27 && var26 >= var16 && var26 < var16 + 8 && var25 >= var17 && var25 < var17 + 8) {
																		ObjectComposition var31 = MidiPcmStream.getObjectDefinition(var21);
																		int var34 = var26 & 7;
																		int var35 = var25 & 7;
																		int var37 = var31.sizeX;
																		int var38 = var31.sizeY;
																		int var39;
																		if ((var30 & 1) == 1) {
																			var39 = var37;
																			var37 = var38;
																			var38 = var39;
																		}

																		int var36 = var8 & 3;
																		int var33;
																		if (var36 == 0) {
																			var33 = var34;
																		} else if (var36 == 1) {
																			var33 = var35;
																		} else if (var36 == 2) {
																			var33 = 7 - var34 - (var37 - 1);
																		} else {
																			var33 = 7 - var35 - (var38 - 1);
																		}

																		var39 = var51 + var33;
																		int var40 = var15 + class58.method912(var26 & 7, var25 & 7, var8, var31.sizeX, var31.sizeY, var30);
																		if (var39 > 0 && var40 > 0 && var39 < 103 && var40 < 103) {
																			int var41 = var44;
																			if ((Tiles.Tiles_renderFlags[1][var39][var40] & 2) == 2) {
																				var41 = var44 - 1;
																			}

																			CollisionMap var42 = null;
																			if (var41 >= 0) {
																				var42 = var19[var41];
																			}

																			GrandExchangeOfferWorldComparator.method137(var44, var39, var40, var21, var8 + var30 & 3, var29, var52, var42);
																		}
																	}
																}
															}
														}
													}
												}
											}
										}

										++var44;
									}
								}

								RouteStrategy.playPcmPlayers();

								for (var4 = 0; var4 < 13; ++var4) {
									for (var5 = 0; var5 < 13; ++var5) {
										boolean var57 = false;
										var7 = instanceChunkTemplates[var44][var4][var5];
										if (var7 != -1) {
											var8 = var7 >> 24 & 3;
											var48 = var7 >> 1 & 3;
											var10 = var7 >> 14 & 1023;
											var11 = var7 >> 3 & 2047;
											var12 = (var10 / 8 << 8) + var11 / 8;

											for (var13 = 0; var13 < class90.regions.length; ++var13) {
												if (class90.regions[var13] == var12 && AbstractUserComparator.regionLandArchives[var13] != null) {
													byte[] var14 = AbstractUserComparator.regionLandArchives[var13];
													var15 = var4 * 8;
													var16 = var5 * 8;
													var17 = (var10 & 7) * 8;
													int var18 = (var11 & 7) * 8;
													var19 = collisionMaps;

													for (int var20 = 0; var20 < 8; ++var20) {
														for (var21 = 0; var21 < 8; ++var21) {
															if (var15 + var20 > 0 && var15 + var20 < 103 && var21 + var16 > 0 && var16 + var21 < 103) {
																var10000 = var19[var44].flags[var15 + var20];
																var10000[var16 + var21] &= -16777217;
															}
														}
													}

													var49 = new Buffer(var14);

													for (var21 = 0; var21 < 4; ++var21) {
														for (var22 = 0; var22 < 64; ++var22) {
															for (var23 = 0; var23 < 64; ++var23) {
																if (var8 == var21 && var22 >= var17 && var22 < var17 + 8 && var23 >= var18 && var23 < var18 + 8) {
																	DynamicObject.loadTerrain(var49, var44, var15 + TaskHandler.method3568(var22 & 7, var23 & 7, var48), var16 + Huffman.method4041(var22 & 7, var23 & 7, var48), 0, 0, var48);
																} else {
																	DynamicObject.loadTerrain(var49, 0, -1, -1, 0, 0, 0);
																}
															}
														}
													}

													var57 = true;
													break;
												}
											}
										}

										if (!var57) {
											class58.method914(var44, var4 * 8, var5 * 8);
										}
									}
								}

								++var44;
							}
						}

						AttackOption.method2154(true);
						RouteStrategy.playPcmPlayers();
						HealthBar.method2113(ScriptEvent.scene, collisionMaps);
						AttackOption.method2154(true);
						var44 = Tiles.Tiles_minPlane;
						if (var44 > Huffman.Client_plane) {
							var44 = Huffman.Client_plane;
						}

						if (var44 < Huffman.Client_plane - 1) {
							var44 = Huffman.Client_plane - 1;
						}

						if (isLowDetail) {
							ScriptEvent.scene.init(Tiles.Tiles_minPlane);
						} else {
							ScriptEvent.scene.init(0);
						}

						for (var4 = 0; var4 < 104; ++var4) {
							for (var5 = 0; var5 < 104; ++var5) {
								class13.updateItemPile(var4, var5);
							}
						}

						RouteStrategy.playPcmPlayers();

						for (PendingSpawn var55 = (PendingSpawn)pendingSpawns.last(); var55 != null; var55 = (PendingSpawn)pendingSpawns.previous()) {
							if (var55.hitpoints == -1) {
								var55.delay = 0;
								WorldMapIcon_1.method375(var55);
							} else {
								var55.remove();
							}
						}

						ObjectComposition.ObjectDefinition_cachedModelData.clear();
						PacketBufferNode var56;
						if (class2.client.hasFrame()) {
							var56 = getPacketBufferNode(ClientPacket.field2251, packetWriter.isaacCipher);
							var56.packetBuffer.writeInt(1057001181);
							packetWriter.addNode(var56);
						}

						if (!isInInstance) {
							var4 = (class52.field396 - 6) / 8;
							var5 = (class52.field396 + 6) / 8;
							var47 = (SpotAnimationDefinition.field3261 - 6) / 8;
							var7 = (SpotAnimationDefinition.field3261 + 6) / 8;

							for (var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
								for (var48 = var47 - 1; var48 <= var7 + 1; ++var48) {
									if (var8 < var4 || var8 > var5 || var48 < var47 || var48 > var7) {
										WorldMapLabel.archive5.loadRegionFromName("m" + var8 + "_" + var48);
										WorldMapLabel.archive5.loadRegionFromName("l" + var8 + "_" + var48);
									}
								}
							}
						}

						CollisionMap.updateGameState(30);
						RouteStrategy.playPcmPlayers();
						Messages.method2288();
						var56 = getPacketBufferNode(ClientPacket.field2318, packetWriter.isaacCipher);
						packetWriter.addNode(var56);
						WorldMapLabel.method498();
					}
				}
			}
		} else {
			class3.doCycleTitle(this);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(ZB)V",
		garbageValue = "-63"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = Script.method2326();
		if (var2 && field704 && WorldMapManager.pcmPlayer0 != null) {
			WorldMapManager.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && field890 != 0L && PacketWriter.currentTimeMillis() > field890) {
			FontName.setWindowedMode(class39.getWindowedMode());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field882[var3] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			Player.drawTitle(class4.fontBold12, DynamicObject.fontPlain11, ItemComposition.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				Player.drawTitle(class4.fontBold12, DynamicObject.fontPlain11, ItemComposition.fontPlain12);
			} else if (gameState == 25) {
				if (field732 == 1) {
					if (field728 > field711) {
						field711 = field728;
					}

					var3 = (field711 * 50 - field728 * 50) / field711;
					Actor.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else if (field732 == 2) {
					if (field895 > field791) {
						field791 = field895;
					}

					var3 = (field791 * 50 - field895 * 50) / field791 + 50;
					Actor.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
				} else {
					Actor.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				Actor.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				Actor.drawLoadingMessage("Please wait...", false);
			}
		} else {
			Player.drawTitle(class4.fontBold12, DynamicObject.fontPlain11, ItemComposition.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				if (field883[var3]) {
					WorldMapSprite.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
					field883[var3] = false;
				}
			}
		} else if (gameState > 0) {
			WorldMapSprite.rasterProvider.drawFull(0, 0);

			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				field883[var3] = false;
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-645621446"
	)
	@Export("kill0")
	protected final void kill0() {
		if (ClientPreferences.varcs.hasUnwrittenChanges()) {
			ClientPreferences.varcs.write();
		}

		if (ByteArrayPool.mouseRecorder != null) {
			ByteArrayPool.mouseRecorder.isRunning = false;
		}

		ByteArrayPool.mouseRecorder = null;
		packetWriter.close();
		class195.method3714();
		PacketWriter.method2357();
		Player.mouseWheel = null;
		if (WorldMapManager.pcmPlayer0 != null) {
			WorldMapManager.pcmPlayer0.shutdown();
		}

		if (IntHashTable.pcmPlayer1 != null) {
			IntHashTable.pcmPlayer1.shutdown();
		}

		GameObject.method3411();
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3179 != 0) {
				ArchiveDiskActionHandler.field3179 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var5) {
				}
			}
		}

		if (UserComparator4.urlRequester != null) {
			UserComparator4.urlRequester.close();
			UserComparator4.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var4 = 0; var4 < GZipDecompressor.idxCount; ++var4) {
				JagexCache.JagexCache_idxFiles[var4].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var6) {
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "28"
	)
	protected final void vmethod1761() {
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 19; ++var1) {
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
							int var4 = Integer.parseInt(var2);
							Language var3;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var3 = Language.Language_valuesOrdered[var4];
							} else {
								var3 = null;
							}

							class58.clientLanguage = var3;
							break;
						case 7:
							DirectByteArrayCopier.field2525 = TextureProvider.method2863(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							class200.field2403 = var2;
							break;
						case 10:
							Tiles.field532 = (StudioGame)TextureProvider.findEnumerated(class41.method624(), Integer.parseInt(var2));
							if (StudioGame.oldscape == Tiles.field532) {
								WorldMapAreaData.loginType = LoginType.oldscape;
							} else {
								WorldMapAreaData.loginType = LoginType.field4062;
							}
							break;
						case 12:
							worldId = Integer.parseInt(var2);
							break;
						case 14:
							GrandExchangeOffer.field99 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							BZip2State.field3771 = var2;
						}
					}
				}

				HealthBarUpdate.method1818();
				ItemContainer.worldHost = this.getCodeBase().getHost();
				String var5 = DirectByteArrayCopier.field2525.name;
				byte var6 = 0;

				try {
					class90.method2138("oldschool", var5, var6, 21);
				} catch (Exception var7) {
					Decimator.RunException_sendStackTrace((String)null, var7);
				}

				class2.client = this;
				WorldMapID.clientType = clientType;
				this.startThread(765, 503, 191);
			}
		} catch (RuntimeException var8) {
			throw class25.newRunException(var8, "client.init(" + ')');
		}
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "858164113"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = BoundaryObject.method3384();
			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-32277298"
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

				field712 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (--field712 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						UserComparator7.js5SocketTask = GameEngine.taskHandler.newSocketTask(ItemContainer.worldHost, WorldMapScaleHandler.port3);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (UserComparator7.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (UserComparator7.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							ItemContainer.js5Socket = ModelData0.method3375((Socket)UserComparator7.js5SocketTask.result, 40000, 5000);
						} else {
							ItemContainer.js5Socket = new NetSocket((Socket)UserComparator7.js5SocketTask.result, GameEngine.taskHandler, 5000);
						}

						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(191);
						ItemContainer.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						KeyHandler.field428 = PacketWriter.currentTimeMillis();
					}

					if (js5ConnectState == 3) {
						if (ItemContainer.js5Socket.available() > 0 || !useBufferedSocket && gameState <= 5) {
							int var2 = ItemContainer.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (PacketWriter.currentTimeMillis() - KeyHandler.field428 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						Widget.method4173(ItemContainer.js5Socket, gameState > 20);
						UserComparator7.js5SocketTask = null;
						ItemContainer.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1255510114"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		UserComparator7.js5SocketTask = null;
		ItemContainer.js5Socket = null;
		js5ConnectState = 0;
		if (WorldMapScaleHandler.port3 == port1) {
			WorldMapScaleHandler.port3 = class23.port2;
		} else {
			WorldMapScaleHandler.port3 = port1;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				gameState = 1000;
			} else {
				field712 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			gameState = 1000;
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				gameState = 1000;
			} else {
				field712 = 3000;
			}
		}

	}

	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-407945770"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (WorldMapID.secureRandom == null && (secureRandomFuture.isDone() || field822 > 250)) {
					WorldMapID.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (WorldMapID.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					MouseRecorder.socketTask = null;
					field713 = false;
					field822 = 0;
					loginState = 1;
				}
			}

			if (loginState == 1) {
				if (MouseRecorder.socketTask == null) {
					MouseRecorder.socketTask = GameEngine.taskHandler.newSocketTask(ItemContainer.worldHost, WorldMapScaleHandler.port3);
				}

				if (MouseRecorder.socketTask.status == 2) {
					throw new IOException();
				}

				if (MouseRecorder.socketTask.status == 1) {
					if (useBufferedSocket) {
						var1 = ModelData0.method3375((Socket)MouseRecorder.socketTask.result, 40000, 5000);
					} else {
						var1 = new NetSocket((Socket)MouseRecorder.socketTask.result, GameEngine.taskHandler, 5000);
					}

					packetWriter.setSocket((AbstractSocket)var1);
					MouseRecorder.socketTask = null;
					loginState = 2;
				}
			}

			PacketBufferNode var3;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var3 = Archive.method4385();
				var3.packetBuffer.writeByte(LoginPacket.field2360.id);
				packetWriter.addNode(var3);
				packetWriter.flush();
				var2.offset = 0;
				loginState = 3;
			}

			int var4;
			boolean var12;
			if (loginState == 3) {
				if (WorldMapManager.pcmPlayer0 != null) {
					WorldMapManager.pcmPlayer0.method2517();
				}

				if (IntHashTable.pcmPlayer1 != null) {
					IntHashTable.pcmPlayer1.method2517();
				}

				var12 = true;
				if (useBufferedSocket && !((AbstractSocket)var1).isAvailable(1)) {
					var12 = false;
				}

				if (var12) {
					var4 = ((AbstractSocket)var1).readUnsignedByte();
					if (WorldMapManager.pcmPlayer0 != null) {
						WorldMapManager.pcmPlayer0.method2517();
					}

					if (IntHashTable.pcmPlayer1 != null) {
						IntHashTable.pcmPlayer1.method2517();
					}

					if (var4 != 0) {
						class58.getLoginError(var4);
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
					PcmPlayer.field1430 = var2.readLong();
					loginState = 5;
				}
			}

			int var7;
			int var9;
			int var14;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var22 = new PacketBuffer(500);
				int[] var13 = new int[]{WorldMapID.secureRandom.nextInt(), WorldMapID.secureRandom.nextInt(), WorldMapID.secureRandom.nextInt(), WorldMapID.secureRandom.nextInt()};
				var22.offset = 0;
				var22.writeByte(1);
				var22.writeInt(var13[0]);
				var22.writeInt(var13[1]);
				var22.writeInt(var13[2]);
				var22.writeInt(var13[3]);
				var22.writeLong(PcmPlayer.field1430);
				int var10;
				if (gameState == 40) {
					var22.writeInt(UserComparator10.field2017[0]);
					var22.writeInt(UserComparator10.field2017[1]);
					var22.writeInt(UserComparator10.field2017[2]);
					var22.writeInt(UserComparator10.field2017[3]);
				} else {
					var22.writeByte(field710.rsOrdinal());
					switch(field710.field2042) {
					case 0:
					case 1:
						var22.writeMedium(LoginScreenAnimation.field1070);
						++var22.offset;
						break;
					case 2:
						var22.offset += 4;
						break;
					case 3:
						LinkedHashMap var6 = Tile.clientPreferences.parameters;
						String var8 = Login.Login_username;
						var9 = var8.length();
						var10 = 0;

						for (int var11 = 0; var11 < var9; ++var11) {
							var10 = (var10 << 5) - var10 + var8.charAt(var11);
						}

						var22.writeInt((Integer)var6.get(var10));
					}

					var22.writeByte(class322.field3841.rsOrdinal());
					var22.writeStringCp1252NullTerminated(Login.Login_password);
				}

				var22.encryptRsa(class92.field1186, class92.field1187);
				UserComparator10.field2017 = var13;
				PacketBufferNode var5 = Archive.method4385();
				var5.packetBuffer.offset = 0;
				if (gameState == 40) {
					var5.packetBuffer.writeByte(LoginPacket.field2352.id);
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field2351.id);
				}

				var5.packetBuffer.writeShort(0);
				var14 = var5.packetBuffer.offset;
				var5.packetBuffer.writeInt(191);
				var5.packetBuffer.writeInt(1);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeBytes(var22.array, 0, var22.offset);
				var7 = var5.packetBuffer.offset;
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var5.packetBuffer.writeShort(FloorDecoration.canvasWidth);
				var5.packetBuffer.writeShort(GameEngine.canvasHeight);
				WorldMapData_1.method783(var5.packetBuffer);
				var5.packetBuffer.writeStringCp1252NullTerminated(class200.field2403);
				var5.packetBuffer.writeInt(GrandExchangeOffer.field99);
				Buffer var32 = new Buffer(WorldMapArea.platformInfo.size());
				WorldMapArea.platformInfo.write(var32);
				var5.packetBuffer.writeBytes(var32.array, 0, var32.array.length);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeInt(0);
				var5.packetBuffer.method5663(WorldMapData_1.archive19.hash);
				var5.packetBuffer.method5663(PlayerComposition.archive14.hash);
				var5.packetBuffer.method5669(Occluder.archive10.hash);
				var5.packetBuffer.method5662(Huffman.archive8.hash);
				var5.packetBuffer.writeInt(FontName.archive20.hash);
				var5.packetBuffer.method5663(MouseRecorder.archive18.hash);
				var5.packetBuffer.method5669(GrandExchangeOfferUnitPriceComparator.archive4.hash);
				var5.packetBuffer.method5669(PlayerComposition.archive15.hash);
				var5.packetBuffer.method5662(GrandExchangeEvent.archive11.hash);
				var5.packetBuffer.method5663(WorldMapID.archive3.hash);
				var5.packetBuffer.method5663(SceneTilePaint.archive13.hash);
				var5.packetBuffer.method5663(WorldMapSection1.archive7.hash);
				var5.packetBuffer.method5669(class3.archive17.hash);
				var5.packetBuffer.writeInt(archive1.hash);
				var5.packetBuffer.method5663(0);
				var5.packetBuffer.writeInt(ApproximateRouteStrategy.archive12.hash);
				var5.packetBuffer.method5663(UrlRequester.archive9.hash);
				var5.packetBuffer.method5663(class182.archive0.hash);
				var5.packetBuffer.writeInt(NetFileRequest.archive2.hash);
				var5.packetBuffer.writeInt(CollisionMap.archive6.hash);
				var5.packetBuffer.method5663(WorldMapLabel.archive5.hash);
				var5.packetBuffer.xteaEncrypt(var13, var7, var5.packetBuffer.offset);
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var14);
				packetWriter.addNode(var5);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var13);
				int[] var15 = new int[4];

				for (var10 = 0; var10 < 4; ++var10) {
					var15[var10] = var13[var10] + 50;
				}

				var2.newIsaacCipher(var15);
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
				} else if (var34 == 23 && field708 < 1) {
					++field708;
					loginState = 0;
				} else if (var34 == 29) {
					loginState = 17;
				} else {
					if (var34 != 69) {
						class58.getLoginError(var34);
						return;
					}

					loginState = 7;
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				WorldMapIcon_1.field212 = var2.readUnsignedShort();
				loginState = 8;
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= WorldMapIcon_1.field212) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, WorldMapIcon_1.field212);
				class7[] var23 = new class7[]{class7.field37};
				class7 var35 = var23[var2.readUnsignedByte()];

				try {
					class12 var27 = class7.method102(var35);
					this.field714 = new class9(var2, var27);
					loginState = 9;
				} catch (Exception var20) {
					class58.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field714.method109()) {
				this.field754 = this.field714.method122();
				this.field714.method110();
				this.field714 = null;
				if (this.field754 == null) {
					class58.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var3 = Archive.method4385();
				var3.packetBuffer.writeByte(LoginPacket.field2353.id);
				var3.packetBuffer.writeShort(this.field754.offset);
				var3.packetBuffer.method5611(this.field754);
				packetWriter.addNode(var3);
				packetWriter.flush();
				this.field754 = null;
				loginState = 6;
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
				class60.field456 = ((AbstractSocket)var1).readUnsignedByte();
				loginState = 11;
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= class60.field456) {
				((AbstractSocket)var1).read(var2.array, 0, class60.field456);
				var2.offset = 0;
				loginState = 6;
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
				field709 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				loginState = 13;
			}

			if (loginState == 13) {
				field822 = 0;
				UrlRequester.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field709 / 60 + " seconds.");
				if (--field709 <= 0) {
					loginState = 0;
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
					LoginScreenAnimation.field1076 = ((AbstractSocket)var1).readUnsignedByte();
					loginState = 15;
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= LoginScreenAnimation.field1076) {
					var12 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var24 = false;
					if (var12) {
						var4 = var2.readByteIsaac() << 24;
						var4 |= var2.readByteIsaac() << 16;
						var4 |= var2.readByteIsaac() << 8;
						var4 |= var2.readByteIsaac();
						String var30 = Login.Login_username;
						var7 = var30.length();
						int var16 = 0;
						var9 = 0;

						while (true) {
							if (var9 >= var7) {
								if (Tile.clientPreferences.parameters.size() >= 10 && !Tile.clientPreferences.parameters.containsKey(var16)) {
									Iterator var33 = Tile.clientPreferences.parameters.entrySet().iterator();
									var33.next();
									var33.remove();
								}

								Tile.clientPreferences.parameters.put(var16, var4);
								break;
							}

							var16 = (var16 << 5) - var16 + var30.charAt(var9);
							++var9;
						}
					}

					if (Login_isUsernameRemembered) {
						Tile.clientPreferences.rememberedUsername = Login.Login_username;
					} else {
						Tile.clientPreferences.rememberedUsername = null;
					}

					WorldMapData_1.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field888 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var28 = class198.ServerPacket_values();
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
						Client var18 = class2.client;
						JSObject.getWindow(var18).call("zap", (Object[])null);
					} catch (Throwable var19) {
					}

					loginState = 16;
				}

				if (loginState == 16) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method5100();
						mouseLastLastPressedTimeMillis = -1L;
						ByteArrayPool.mouseRecorder.index = 0;
						GameEngine.hasFocus = true;
						hadFocus = true;
						field901 = -1L;
						class171.method3543();
						packetWriter.clearBuffer();
						packetWriter.packetBuffer.offset = 0;
						packetWriter.serverPacket = null;
						packetWriter.field1336 = null;
						packetWriter.field1348 = null;
						packetWriter.field1346 = null;
						packetWriter.serverPacketLength = 0;
						packetWriter.field1345 = 0;
						rebootTimer = 0;
						logoutTimer = 0;
						hintArrowType = 0;
						class279.method5091();
						MouseHandler.MouseHandler_idleCycles = 0;
						Messages.Messages_channels.clear();
						Messages.Messages_hashTable.clear();
						Messages.Messages_queue.clear();
						Messages.Messages_count = 0;
						isItemSelected = 0;
						isSpellSelected = false;
						soundEffectCount = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						ModelData0.field1901 = null;
						minimapState = 0;
						field902 = -1;
						destinationX = 0;
						destinationY = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						WorldMapRectangle.method361();

						for (var34 = 0; var34 < 2048; ++var34) {
							players[var34] = null;
						}

						for (var34 = 0; var34 < 32768; ++var34) {
							npcs[var34] = null;
						}

						combatTargetPlayerIndex = -1;
						projectiles.clear();
						graphicsObjects.clear();

						for (var34 = 0; var34 < 4; ++var34) {
							for (var4 = 0; var4 < 104; ++var4) {
								for (int var17 = 0; var17 < 104; ++var17) {
									groundItems[var34][var4][var17] = null;
								}
							}
						}

						pendingSpawns = new NodeDeque();
						class60.friendSystem.clear();

						for (var34 = 0; var34 < VarpDefinition.VarpDefinition_fileCount; ++var34) {
							VarpDefinition var37 = class195.VarpDefinition_get(var34);
							if (var37 != null) {
								Varps.Varps_temp[var34] = 0;
								Varps.Varps_main[var34] = 0;
							}
						}

						ClientPreferences.varcs.clearTransient();
						followerIndex = -1;
						if (rootInterface != -1) {
							SecureRandomFuture.method2225(rootInterface);
						}

						for (InterfaceParent var26 = (InterfaceParent)interfaceParents.first(); var26 != null; var26 = (InterfaceParent)interfaceParents.next()) {
							class58.closeInterface(var26, true);
						}

						rootInterface = -1;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						class279.method5091();
						playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

						for (var34 = 0; var34 < 8; ++var34) {
							playerMenuActions[var34] = null;
							playerOptionsPriorities[var34] = false;
						}

						ItemContainer.itemContainers = new NodeHashTable(32);
						isLoading = true;

						for (var34 = 0; var34 < 100; ++var34) {
							field882[var34] = true;
						}

						GrandExchangeEvent.method160();
						Renderable.clanChat = null;

						for (var34 = 0; var34 < 8; ++var34) {
							grandExchangeOffers[var34] = new GrandExchangeOffer();
						}

						WorldMapSection1.grandExchangeEvents = null;
						HorizontalAlignment.updatePlayer(var2);
						class52.field396 = -1;
						WorldMapID.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						WorldMapAreaData.field352 = var2.readUnsignedShort();
						loginState = 18;
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= WorldMapAreaData.field352) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, WorldMapAreaData.field352);
						var2.offset = 0;
						String var25 = var2.readStringCp1252NullTerminated();
						String var36 = var2.readStringCp1252NullTerminated();
						String var29 = var2.readStringCp1252NullTerminated();
						UrlRequester.setLoginResponseString(var25, var36, var29);
						CollisionMap.updateGameState(10);
					}

					if (loginState != 19) {
						++field822;
						if (field822 > 2000) {
							if (field708 < 1) {
								if (port1 == WorldMapScaleHandler.port3) {
									WorldMapScaleHandler.port3 = class23.port2;
								} else {
									WorldMapScaleHandler.port3 = port1;
								}

								++field708;
								loginState = 0;
							} else {
								class58.getLoginError(-3);
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
							timer.method5099();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1336 = null;
							packetWriter.field1348 = null;
							packetWriter.field1346 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1345 = 0;
							rebootTimer = 0;
							class279.method5091();
							minimapState = 0;
							destinationX = 0;

							for (var4 = 0; var4 < 2048; ++var4) {
								players[var4] = null;
							}

							WorldMapLabelSize.localPlayer = null;

							for (var4 = 0; var4 < npcs.length; ++var4) {
								NPC var31 = npcs[var4];
								if (var31 != null) {
									var31.targetIndex = -1;
									var31.false0 = false;
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32);
							CollisionMap.updateGameState(30);

							for (var4 = 0; var4 < 100; ++var4) {
								field882[var4] = true;
							}

							GrandExchangeEvent.method160();
							HorizontalAlignment.updatePlayer(var2);
							if (var34 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var21) {
			if (field708 < 1) {
				if (WorldMapScaleHandler.port3 == port1) {
					WorldMapScaleHandler.port3 = class23.port2;
				} else {
					WorldMapScaleHandler.port3 = port1;
				}

				++field708;
				loginState = 0;
			} else {
				class58.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-634429203"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (field713) {
			field713 = false;
			ArchiveLoader.method1208();
		} else {
			if (!isMenuOpen) {
				WorldMapAreaData.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1707(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class105.reflectionChecks.last();
					boolean var29;
					if (var2 == null) {
						var29 = false;
					} else {
						var29 = true;
					}

					int var3;
					PacketBufferNode var30;
					if (!var29) {
						PacketBufferNode var14;
						int var15;
						if (timer.field3598) {
							var14 = getPacketBufferNode(ClientPacket.field2271, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method5101();
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
						PacketBuffer var10000;
						synchronized(ByteArrayPool.mouseRecorder.lock) {
							if (!field841) {
								ByteArrayPool.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || ByteArrayPool.mouseRecorder.index >= 40) {
								var30 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < ByteArrayPool.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = ByteArrayPool.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = ByteArrayPool.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field798 || var8 != field686) {
										if (var30 == null) {
											var30 = getPacketBufferNode(ClientPacket.field2269, packetWriter.isaacCipher);
											var30.packetBuffer.writeByte(0);
											var3 = var30.packetBuffer.offset;
											var10000 = var30.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if (field687 != -1L) {
											var10 = var9 - field798;
											var11 = var8 - field686;
											var12 = (int)((ByteArrayPool.mouseRecorder.millis[var7] - field687) / 20L);
											var5 = (int)((long)var5 + (ByteArrayPool.mouseRecorder.millis[var7] - field687) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field798 = var9;
										field686 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var30.packetBuffer.writeByte(var12 + 128);
											var30.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var30.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var30.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var30.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var30.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field687 = ByteArrayPool.mouseRecorder.millis[var7];
									}
								}

								if (var30 != null) {
									var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3);
									var7 = var30.packetBuffer.offset;
									var30.packetBuffer.offset = var3;
									var30.packetBuffer.writeByte(var5 / var6);
									var30.packetBuffer.writeByte(var5 % var6);
									var30.packetBuffer.offset = var7;
									packetWriter.addNode(var30);
								}

								if (var4 >= ByteArrayPool.mouseRecorder.index) {
									ByteArrayPool.mouseRecorder.index = 0;
								} else {
									MouseRecorder var49 = ByteArrayPool.mouseRecorder;
									var49.index -= var4;
									System.arraycopy(ByteArrayPool.mouseRecorder.xs, var4, ByteArrayPool.mouseRecorder.xs, 0, ByteArrayPool.mouseRecorder.index);
									System.arraycopy(ByteArrayPool.mouseRecorder.ys, var4, ByteArrayPool.mouseRecorder.ys, 0, ByteArrayPool.mouseRecorder.index);
									System.arraycopy(ByteArrayPool.mouseRecorder.millis, var4, ByteArrayPool.mouseRecorder.millis, 0, ByteArrayPool.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !ScriptEvent.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
							if (var16 > 32767L) {
								var16 = 32767L;
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
							} else if (var4 > FloorDecoration.canvasWidth) {
								var4 = FloorDecoration.canvasWidth;
							}

							var5 = (int)var16;
							var18 = getPacketBufferNode(ClientPacket.field2312, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (KeyHandler.field422 > 0) {
							var14 = getPacketBufferNode(ClientPacket.field2308, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = PacketWriter.currentTimeMillis();

							for (var5 = 0; var5 < KeyHandler.field422; ++var5) {
								long var21 = var19 - field901;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field901 = var19;
								var14.packetBuffer.method5660((int)var21);
								var14.packetBuffer.writeIntME(KeyHandler.field421[var5]);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (field829 > 0) {
							--field829;
						}

						if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
							field761 = true;
						}

						if (field761 && field829 <= 0) {
							field829 = 20;
							field761 = false;
							var14 = getPacketBufferNode(ClientPacket.field2289, packetWriter.isaacCipher);
							var14.packetBuffer.method5654(camAngleY);
							var14.packetBuffer.method5653(camAngleX);
							packetWriter.addNode(var14);
						}

						if (GameEngine.hasFocus && !hadFocus) {
							hadFocus = true;
							var14 = getPacketBufferNode(ClientPacket.field2299, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!GameEngine.hasFocus && hadFocus) {
							hadFocus = false;
							var14 = getPacketBufferNode(ClientPacket.field2299, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (Message.worldMap != null) {
							Message.worldMap.method6428();
						}

						if (class8.ClanChat_inClanChat) {
							if (Renderable.clanChat != null) {
								Renderable.clanChat.sort();
							}

							for (var1 = 0; var1 < Players.Players_count; ++var1) {
								Player var31 = players[Players.Players_indices[var1]];
								var31.clearIsInClanChat();
							}

							class8.ClanChat_inClanChat = false;
						}

						AbstractWorldMapData.method354();
						if (gameState != 30) {
							return;
						}

						for (PendingSpawn var36 = (PendingSpawn)pendingSpawns.last(); var36 != null; var36 = (PendingSpawn)pendingSpawns.previous()) {
							if (var36.hitpoints > 0) {
								--var36.hitpoints;
							}

							ObjectComposition var23;
							boolean var37;
							if (var36.hitpoints == 0) {
								if (var36.objectId >= 0) {
									var3 = var36.objectId;
									var4 = var36.field961;
									var23 = MidiPcmStream.getObjectDefinition(var3);
									if (var4 == 11) {
										var4 = 10;
									}

									if (var4 >= 5 && var4 <= 8) {
										var4 = 4;
									}

									var37 = var23.method4703(var4);
									if (!var37) {
										continue;
									}
								}

								WorldMapLabelSize.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y, var36.objectId, var36.field960, var36.field961);
								var36.remove();
							} else {
								if (var36.delay > 0) {
									--var36.delay;
								}

								if (var36.delay == 0 && var36.x >= 1 && var36.y >= 1 && var36.x <= 102 && var36.y <= 102) {
									if (var36.id >= 0) {
										var3 = var36.id;
										var4 = var36.field964;
										var23 = MidiPcmStream.getObjectDefinition(var3);
										if (var4 == 11) {
											var4 = 10;
										}

										if (var4 >= 5 && var4 <= 8) {
											var4 = 4;
										}

										var37 = var23.method4703(var4);
										if (!var37) {
											continue;
										}
									}

									WorldMapLabelSize.addPendingSpawnToScene(var36.plane, var36.type, var36.x, var36.y, var36.id, var36.orientation, var36.field964);
									var36.delay = -1;
									if (var36.objectId == var36.id && var36.objectId == -1) {
										var36.remove();
									} else if (var36.id == var36.objectId && var36.field960 == var36.orientation && var36.field964 == var36.field961) {
										var36.remove();
									}
								}
							}
						}

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) {
							var10002 = queuedSoundEffectDelays[var1]--;
							if (queuedSoundEffectDelays[var1] >= -10) {
								SoundEffect var32 = soundEffects[var1];
								if (var32 == null) {
									var10000 = null;
									var32 = SoundEffect.readSoundEffect(GrandExchangeOfferUnitPriceComparator.archive4, soundEffectIds[var1], 0);
									if (var32 == null) {
										continue;
									}

									int[] var50 = queuedSoundEffectDelays;
									var50[var1] += var32.calculateDelay();
									soundEffects[var1] = var32;
								}

								if (queuedSoundEffectDelays[var1] < 0) {
									if (soundLocations[var1] != 0) {
										var4 = (soundLocations[var1] & 255) * 128;
										var5 = soundLocations[var1] >> 16 & 255;
										var6 = var5 * 128 + 64 - WorldMapLabelSize.localPlayer.x;
										if (var6 < 0) {
											var6 = -var6;
										}

										var7 = soundLocations[var1] >> 8 & 255;
										var8 = var7 * 128 + 64 - WorldMapLabelSize.localPlayer.y;
										if (var8 < 0) {
											var8 = -var8;
										}

										var9 = var8 + var6 - 128;
										if (var9 > var4) {
											queuedSoundEffectDelays[var1] = -100;
											continue;
										}

										if (var9 < 0) {
											var9 = 0;
										}

										var3 = (var4 - var9) * areaSoundEffectVolume / var4;
									} else {
										var3 = soundEffectVolume;
									}

									if (var3 > 0) {
										RawSound var24 = var32.toRawSound().resample(class9.decimator);
										RawPcmStream var40 = RawPcmStream.createRawPcmStream(var24, 100, var3);
										var40.setNumLoops(queuedSoundEffectLoops[var1] - 1);
										Players.pcmStreamMixer.addSubStream(var40);
									}

									queuedSoundEffectDelays[var1] = -100;
								}
							} else {
								--soundEffectCount;

								for (var15 = var1; var15 < soundEffectCount; ++var15) {
									soundEffectIds[var15] = soundEffectIds[var15 + 1];
									soundEffects[var15] = soundEffects[var15 + 1];
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1];
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1];
									soundLocations[var15] = soundLocations[var15 + 1];
								}

								--var1;
							}
						}

						if (field704 && !HealthBarUpdate.method1815()) {
							if (musicVolume != 0 && currentTrackGroupId != -1) {
								Script.method2322(CollisionMap.archive6, currentTrackGroupId, 0, musicVolume, false);
							}

							field704 = false;
						}

						++packetWriter.field1345;
						if (packetWriter.field1345 > 750) {
							ArchiveLoader.method1208();
							return;
						}

						var1 = Players.Players_count;
						int[] var33 = Players.Players_indices;

						for (var3 = 0; var3 < var1; ++var3) {
							Player var42 = players[var33[var3]];
							if (var42 != null) {
								CollisionMap.updateActorSequence(var42, 1);
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) {
							var15 = npcIndices[var1];
							NPC var25 = npcs[var15];
							if (var25 != null) {
								CollisionMap.updateActorSequence(var25, var25.definition.size);
							}
						}

						ClientPacket.method3706();
						++field737;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (GrandExchangeEvent.field79 != null) {
							++field782;
							if (field782 >= 15) {
								class52.invalidateWidget(GrandExchangeEvent.field79);
								GrandExchangeEvent.field79 = null;
							}
						}

						Widget var38 = TriBool.mousedOverWidgetIf1;
						Widget var34 = Occluder.field1950;
						TriBool.mousedOverWidgetIf1 = null;
						Occluder.field1950 = null;
						draggedOnWidget = null;
						field880 = false;
						field799 = false;
						field898 = 0;

						while (class60.isKeyDown() && field898 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && PlayerComposition.field2581 == 66) {
								String var44 = "";

								Message var39;
								for (Iterator var41 = Messages.Messages_hashTable.iterator(); var41.hasNext(); var44 = var44 + var39.sender + ':' + var39.text + '\n') {
									var39 = (Message)var41.next();
								}

								class2.client.clipboardSetString(var44);
							} else if (oculusOrbState != 1 || PacketWriter.field1350 <= 0) {
								field900[field898] = PlayerComposition.field2581;
								field899[field898] = PacketWriter.field1350;
								++field898;
							}
						}

						if (JagexCache.method3576() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var3 = WorldMapLabelSize.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != WorldMapLabelSize.localPlayer.plane) {
								var4 = WorldMapLabelSize.localPlayer.pathX[0] + WorldMapManager.baseX * 64;
								var5 = WorldMapLabelSize.localPlayer.pathY[0] + WorldMapLabel.baseY * 64;
								var18 = getPacketBufferNode(ClientPacket.field2327, packetWriter.isaacCipher);
								var18.packetBuffer.writeShort(var5);
								var18.packetBuffer.method5662(0);
								var18.packetBuffer.writeShort(var4);
								var18.packetBuffer.method5644(var3);
								packetWriter.addNode(var18);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							GameObject.updateRootInterface(rootInterface, 0, 0, FloorDecoration.canvasWidth, GameEngine.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var43;
							ScriptEvent var45;
							Widget var46;
							do {
								var45 = (ScriptEvent)field877.removeLast();
								if (var45 == null) {
									while (true) {
										do {
											var45 = (ScriptEvent)field912.removeLast();
											if (var45 == null) {
												while (true) {
													do {
														var45 = (ScriptEvent)scriptEvents.removeLast();
														if (var45 == null) {
															this.menu();
															if (Message.worldMap != null) {
																Message.worldMap.method6482(Huffman.Client_plane, WorldMapManager.baseX * 64 + (WorldMapLabelSize.localPlayer.x >> 7), WorldMapLabel.baseY * 64 + (WorldMapLabelSize.localPlayer.y >> 7), false);
																Message.worldMap.loadCache();
															}

															if (clickedWidget != null) {
																this.method1458();
															}

															PacketBufferNode var47;
															if (BuddyRankComparator.dragInventoryWidget != null) {
																class52.invalidateWidget(BuddyRankComparator.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field788) {
																		if (BuddyRankComparator.dragInventoryWidget == VerticalAlignment.field3226 && dragItemSlotSource != dragItemSlotDestination) {
																			Widget var48 = BuddyRankComparator.dragInventoryWidget;
																			byte var35 = 0;
																			if (field707 == 1 && var48.contentType == 206) {
																				var35 = 1;
																			}

																			if (var48.itemIds[dragItemSlotDestination] <= 0) {
																				var35 = 0;
																			}

																			if (Widget.method4172(WorldMapIcon_0.getWidgetClickMask(var48))) {
																				var5 = dragItemSlotSource;
																				var6 = dragItemSlotDestination;
																				var48.itemIds[var6] = var48.itemIds[var5];
																				var48.itemQuantities[var6] = var48.itemQuantities[var5];
																				var48.itemIds[var5] = -1;
																				var48.itemQuantities[var5] = 0;
																			} else if (var35 == 1) {
																				var5 = dragItemSlotSource;
																				var6 = dragItemSlotDestination;

																				while (var6 != var5) {
																					if (var5 > var6) {
																						var48.swapItems(var5 - 1, var5);
																						--var5;
																					} else if (var5 < var6) {
																						var48.swapItems(var5 + 1, var5);
																						++var5;
																					}
																				}
																			} else {
																				var48.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			var47 = getPacketBufferNode(ClientPacket.field2309, packetWriter.isaacCipher);
																			var47.packetBuffer.method5662(BuddyRankComparator.dragInventoryWidget.id);
																			var47.packetBuffer.writeShort(dragItemSlotDestination);
																			var47.packetBuffer.writeByte(var35);
																			var47.packetBuffer.method5654(dragItemSlotSource);
																			packetWriter.addNode(var47);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		SecureRandomFuture.method2211(draggedWidgetX, draggedWidgetY);
																	}

																	field782 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	BuddyRankComparator.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field788 = true;
																}
															}

															if (Scene.method3227()) {
																var3 = Scene.Scene_selectedX;
																var4 = Scene.Scene_selectedY;
																var47 = getPacketBufferNode(ClientPacket.field2344, packetWriter.isaacCipher);
																var47.packetBuffer.writeByte(5);
																var47.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
																var47.packetBuffer.method5654(WorldMapManager.baseX * 64 + var3);
																var47.packetBuffer.writeShort(WorldMapLabel.baseY * 64 + var4);
																packetWriter.addNode(var47);
																Scene.method3360();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var3;
																destinationY = var4;
															}

															if (var38 != TriBool.mousedOverWidgetIf1) {
																if (var38 != null) {
																	class52.invalidateWidget(var38);
																}

																if (TriBool.mousedOverWidgetIf1 != null) {
																	class52.invalidateWidget(TriBool.mousedOverWidgetIf1);
																}
															}

															if (var34 != Occluder.field1950 && field770 == field828) {
																if (var34 != null) {
																	class52.invalidateWidget(var34);
																}

																if (Occluder.field1950 != null) {
																	class52.invalidateWidget(Occluder.field1950);
																}
															}

															if (Occluder.field1950 != null) {
																if (field828 < field770) {
																	++field828;
																	if (field770 == field828) {
																		class52.invalidateWidget(Occluder.field1950);
																	}
																}
															} else if (field828 > 0) {
																--field828;
															}

															WorldMapAreaData.method752();
															if (isCameraLocked) {
																var3 = HealthBarUpdate.field1038 * 16384 + 64;
																var4 = class8.field43 * 16384 + 64;
																var5 = ArchiveLoader.getTileHeight(var3, var4, Huffman.Client_plane) - FileSystem.field2099;
																if (VertexNormal.cameraX < var3) {
																	VertexNormal.cameraX = (var3 - VertexNormal.cameraX) * FloorDecoration.field1640 / 1000 + VertexNormal.cameraX + MouseRecorder.field609;
																	if (VertexNormal.cameraX > var3) {
																		VertexNormal.cameraX = var3;
																	}
																}

																if (VertexNormal.cameraX > var3) {
																	VertexNormal.cameraX -= FloorDecoration.field1640 * (VertexNormal.cameraX - var3) / 1000 + MouseRecorder.field609;
																	if (VertexNormal.cameraX < var3) {
																		VertexNormal.cameraX = var3;
																	}
																}

																if (FaceNormal.cameraY < var5) {
																	FaceNormal.cameraY = (var5 - FaceNormal.cameraY) * FloorDecoration.field1640 / 1000 + FaceNormal.cameraY + MouseRecorder.field609;
																	if (FaceNormal.cameraY > var5) {
																		FaceNormal.cameraY = var5;
																	}
																}

																if (FaceNormal.cameraY > var5) {
																	FaceNormal.cameraY -= FloorDecoration.field1640 * (FaceNormal.cameraY - var5) / 1000 + MouseRecorder.field609;
																	if (FaceNormal.cameraY < var5) {
																		FaceNormal.cameraY = var5;
																	}
																}

																if (AbstractWorldMapData.cameraZ < var4) {
																	AbstractWorldMapData.cameraZ = (var4 - AbstractWorldMapData.cameraZ) * FloorDecoration.field1640 / 1000 + AbstractWorldMapData.cameraZ + MouseRecorder.field609;
																	if (AbstractWorldMapData.cameraZ > var4) {
																		AbstractWorldMapData.cameraZ = var4;
																	}
																}

																if (AbstractWorldMapData.cameraZ > var4) {
																	AbstractWorldMapData.cameraZ -= FloorDecoration.field1640 * (AbstractWorldMapData.cameraZ - var4) / 1000 + MouseRecorder.field609;
																	if (AbstractWorldMapData.cameraZ < var4) {
																		AbstractWorldMapData.cameraZ = var4;
																	}
																}

																var3 = SoundCache.field1472 * 128 + 64;
																var4 = TextureProvider.field1561 * 128 + 64;
																var5 = ArchiveLoader.getTileHeight(var3, var4, Huffman.Client_plane) - IgnoreList.field3620;
																var6 = var3 - VertexNormal.cameraX;
																var7 = var5 - FaceNormal.cameraY;
																var8 = var4 - AbstractWorldMapData.cameraZ;
																var9 = (int)Math.sqrt((double)(var8 * var8 + var6 * var6));
																var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.949D) & 2047;
																var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.949D) & 2047;
																if (var10 < 128) {
																	var10 = 128;
																}

																if (var10 > 383) {
																	var10 = 383;
																}

																if (PacketBuffer.cameraPitch < var10) {
																	PacketBuffer.cameraPitch = (var10 - PacketBuffer.cameraPitch) * class225.field2592 / 1000 + PacketBuffer.cameraPitch + UserComparator9.field2013;
																	if (PacketBuffer.cameraPitch > var10) {
																		PacketBuffer.cameraPitch = var10;
																	}
																}

																if (PacketBuffer.cameraPitch > var10) {
																	PacketBuffer.cameraPitch -= class225.field2592 * (PacketBuffer.cameraPitch - var10) / 1000 + UserComparator9.field2013;
																	if (PacketBuffer.cameraPitch < var10) {
																		PacketBuffer.cameraPitch = var10;
																	}
																}

																var12 = var11 - ServerPacket.cameraYaw;
																if (var12 > 1024) {
																	var12 -= 2048;
																}

																if (var12 < -1024) {
																	var12 += 2048;
																}

																if (var12 > 0) {
																	ServerPacket.cameraYaw = var12 * class225.field2592 / 1000 + ServerPacket.cameraYaw + UserComparator9.field2013;
																	ServerPacket.cameraYaw &= 2047;
																}

																if (var12 < 0) {
																	ServerPacket.cameraYaw -= UserComparator9.field2013 + -var12 * class225.field2592 / 1000;
																	ServerPacket.cameraYaw &= 2047;
																}

																int var26 = var11 - ServerPacket.cameraYaw;
																if (var26 > 1024) {
																	var26 -= 2048;
																}

																if (var26 < -1024) {
																	var26 += 2048;
																}

																if (var26 < 0 && var12 > 0 || var26 > 0 && var12 < 0) {
																	ServerPacket.cameraYaw = var11;
																}
															}

															for (var3 = 0; var3 < 5; ++var3) {
																var10002 = field926[var3]++;
															}

															ClientPreferences.varcs.tryWrite();
															var3 = ++MouseHandler.MouseHandler_idleCycles - 1;
															var5 = class41.method622();
															if (var3 > 15000 && var5 > 15000) {
																logoutTimer = 250;
																MouseHandler.MouseHandler_idleCycles = 14500;
																var18 = getPacketBufferNode(ClientPacket.field2258, packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															class60.friendSystem.processFriendUpdates();
															++packetWriter.pendingWrites;
															if (packetWriter.pendingWrites > 50) {
																var18 = getPacketBufferNode(ClientPacket.field2267, packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															try {
																packetWriter.flush();
															} catch (IOException var27) {
																ArchiveLoader.method1208();
															}

															return;
														}

														var46 = var45.widget;
														if (var46.childIndex < 0) {
															break;
														}

														var43 = TileItem.getWidget(var46.parentId);
													} while(var43 == null || var43.children == null || var46.childIndex >= var43.children.length || var46 != var43.children[var46.childIndex]);

													Script.runScriptEvent(var45);
												}
											}

											var46 = var45.widget;
											if (var46.childIndex < 0) {
												break;
											}

											var43 = TileItem.getWidget(var46.parentId);
										} while(var43 == null || var43.children == null || var46.childIndex >= var43.children.length || var46 != var43.children[var46.childIndex]);

										Script.runScriptEvent(var45);
									}
								}

								var46 = var45.widget;
								if (var46.childIndex < 0) {
									break;
								}

								var43 = TileItem.getWidget(var46.parentId);
							} while(var43 == null || var43.children == null || var46.childIndex >= var43.children.length || var46 != var43.children[var46.childIndex]);

							Script.runScriptEvent(var45);
						}
					}

					var30 = getPacketBufferNode(ClientPacket.field2329, packetWriter.isaacCipher);
					var30.packetBuffer.writeByte(0);
					var3 = var30.packetBuffer.offset;
					class195.performReflectionCheck(var30.packetBuffer);
					var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3);
					packetWriter.addNode(var30);
				}
			}
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-415953705"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = FloorDecoration.canvasWidth;
		int var2 = GameEngine.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (Tile.clientPreferences != null) {
			try {
				class56.method899(class2.client, "resize", new Object[]{class39.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1826762039"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			class58.method913(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field882[var1]) {
				field883[var1] = true;
			}

			field884[var1] = field882[var1];
			field882[var1] = false;
		}

		field881 = cycle;
		viewportX = -1;
		viewportY = -1;
		VerticalAlignment.field3226 = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			PlayerComposition.drawWidgets(rootInterface, 0, 0, FloorDecoration.canvasWidth, GameEngine.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				ArchiveLoader.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				ArchiveLoader.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				int var2 = viewportY;
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					int var3 = GrandExchangeOffer.method209();
					String var4;
					if (isItemSelected == 1 && menuOptionsCount < 2) {
						var4 = "Use" + " " + selectedItemName + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) {
						var4 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var4 = ApproximateRouteStrategy.method1273(var3);
					}

					if (menuOptionsCount > 2) {
						var4 = var4 + WorldMapAreaData.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					class4.fontBold12.drawRandomAlphaAndSpacing(var4, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			UserComparator1.method6040();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field884[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field883[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		class197.method3743(Huffman.Client_plane, WorldMapLabelSize.localPlayer.x, WorldMapLabelSize.localPlayer.y, field737);
		field737 = 0;
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		signature = "(Ldx;B)Z",
		garbageValue = "13"
	)
	final boolean method1707(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			String var17;
			int var18;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1344) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1345 = 0;
						var1.field1344 = false;
					}

					var3.offset = 0;
					if (var3.method5564()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1345 = 0;
					}

					var1.field1344 = true;
					ServerPacket[] var4 = class198.ServerPacket_values();
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
				var1.field1345 = 0;
				timer.method5106();
				var1.field1346 = var1.field1348;
				var1.field1348 = var1.field1336;
				var1.field1336 = var1.serverPacket;
				int var16;
				if (ServerPacket.field2161 == var1.serverPacket) {
					for (var16 = 0; var16 < VarpDefinition.VarpDefinition_fileCount; ++var16) {
						VarpDefinition var55 = class195.VarpDefinition_get(var16);
						if (var55 != null) {
							Varps.Varps_temp[var16] = 0;
							Varps.Varps_main[var16] = 0;
						}
					}

					DevicePcmPlayerProvider.method897();
					field864 += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2219 == var1.serverPacket) {
					byte var59 = var3.method5730();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var59;
					if (Varps.Varps_main[var5] != var59) {
						Varps.Varps_main[var5] = var59;
					}

					Clock.changeGameOptions(var5);
					field863[++field864 - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2160 == var1.serverPacket) {
					MouseHandler.method1134(class194.field2363);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2208 == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShort() * 30;
					field775 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2186 == var1.serverPacket) {
					World var39 = new World();
					var39.host = var3.readStringCp1252NullTerminated();
					var39.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var39.properties = var5;
					CollisionMap.updateGameState(45);
					var2.close();
					var2 = null;
					Canvas.changeWorld(var39);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2196 == var1.serverPacket) {
					var16 = var3.readInt();
					if (var16 != field758) {
						field758 = var16;
						ItemContainer.method1225();
					}

					var1.serverPacket = null;
					return true;
				}

				String var42;
				boolean var48;
				if (ServerPacket.field2222 == var1.serverPacket) {
					var16 = var3.readUShortSmart();
					var48 = var3.readUnsignedByte() == 1;
					var42 = "";
					boolean var47 = false;
					if (var48) {
						var42 = var3.readStringCp1252NullTerminated();
						if (class60.friendSystem.isIgnored(new Username(var42, WorldMapAreaData.loginType))) {
							var47 = true;
						}
					}

					String var44 = var3.readStringCp1252NullTerminated();
					if (!var47) {
						WorldMapRectangle.addGameMessage(var16, var42, var44);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2234 == var1.serverPacket) {
					if (rootInterface != -1) {
						ClientPacket.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				int var7;
				long var9;
				int var19;
				if (ServerPacket.field2223 == var1.serverPacket) {
					var16 = var3.method5667();
					var5 = var3.method5656();
					if (var5 == 65535) {
						var5 = -1;
					}

					var18 = var3.readInt();
					var7 = var3.method5656();
					if (var7 == 65535) {
						var7 = -1;
					}

					for (var19 = var5; var19 <= var7; ++var19) {
						var9 = ((long)var16 << 32) + (long)var19;
						Node var46 = widgetClickMasks.get(var9);
						if (var46 != null) {
							var46.remove();
						}

						widgetClickMasks.put(new IntegerNode(var18), var9);
					}

					var1.serverPacket = null;
					return true;
				}

				long var12;
				int var20;
				int var22;
				InterfaceParent var56;
				if (ServerPacket.field2180 == var1.serverPacket) {
					var16 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var18 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						PacketWriter.Widget_resetModelFrames(rootInterface);
						class235.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							field882[var7] = true;
						}
					}

					InterfaceParent var45;
					for (; var18-- > 0; var45.field580 = true) {
						var7 = var3.readInt();
						var19 = var3.readUnsignedShort();
						var20 = var3.readUnsignedByte();
						var45 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var45 != null && var19 != var45.group) {
							class58.closeInterface(var45, true);
							var45 = null;
						}

						if (var45 == null) {
							var45 = WorldMapSprite.method494(var7, var19, var20);
						}
					}

					for (var56 = (InterfaceParent)interfaceParents.first(); var56 != null; var56 = (InterfaceParent)interfaceParents.next()) {
						if (var56.field580) {
							var56.field580 = false;
						} else {
							class58.closeInterface(var56, true);
						}
					}

					widgetClickMasks = new NodeHashTable(512);

					while (var3.offset < var16) {
						var7 = var3.readInt();
						var19 = var3.readUnsignedShort();
						var20 = var3.readUnsignedShort();
						var22 = var3.readInt();

						for (int var23 = var19; var23 <= var20; ++var23) {
							var12 = ((long)var7 << 32) + (long)var23;
							widgetClickMasks.put(new IntegerNode(var22), var12);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2179 == var1.serverPacket) {
					class60.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					KitDefinition.FriendSystem_invalidateIgnoreds();
					field870 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2172 == var1.serverPacket) {
					WorldMapID.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2206 == var1.serverPacket) {
					MouseHandler.method1134(class194.field2367);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2221 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					Frames.method3393(var16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2184 == var1.serverPacket) {
					WorldMapLabelSize.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2174 == var1.serverPacket) {
					isCameraLocked = true;
					SoundCache.field1472 = var3.readUnsignedByte() * 16384;
					TextureProvider.field1561 = var3.readUnsignedByte() * 16384;
					IgnoreList.field3620 = var3.readUnsignedShort();
					UserComparator9.field2013 = var3.readUnsignedByte();
					class225.field2592 = var3.readUnsignedByte();
					if (class225.field2592 >= 100) {
						var16 = SoundCache.field1472 * 128 + 64;
						var5 = TextureProvider.field1561 * 128 + 64;
						var18 = ArchiveLoader.getTileHeight(var16, var5, Huffman.Client_plane) - IgnoreList.field3620;
						var7 = var16 - VertexNormal.cameraX;
						var19 = var18 - FaceNormal.cameraY;
						var20 = var5 - AbstractWorldMapData.cameraZ;
						var22 = (int)Math.sqrt((double)(var7 * var7 + var20 * var20));
						PacketBuffer.cameraPitch = (int)(Math.atan2((double)var19, (double)var22) * 325.949D) & 2047;
						ServerPacket.cameraYaw = (int)(Math.atan2((double)var7, (double)var20) * -325.949D) & 2047;
						if (PacketBuffer.cameraPitch < 128) {
							PacketBuffer.cameraPitch = 128;
						}

						if (PacketBuffer.cameraPitch > 383) {
							PacketBuffer.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2195 == var1.serverPacket) {
					isCameraLocked = false;

					for (var16 = 0; var16 < 5; ++var16) {
						field922[var16] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2164 == var1.serverPacket) {
					var16 = var3.readInt();
					InterfaceParent var54 = (InterfaceParent)interfaceParents.get((long)var16);
					if (var54 != null) {
						class58.closeInterface(var54, true);
					}

					if (meslayerContinueWidget != null) {
						class52.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2191 == var1.serverPacket) {
					byte[] var38 = new byte[var1.serverPacketLength];
					var3.method5566(var38, 0, var38.length);
					Buffer var53 = new Buffer(var38);
					var42 = var53.readStringCp1252NullTerminated();
					class280.openURL(var42, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2205 == var1.serverPacket) {
					var16 = var3.method5655();
					rootInterface = var16;
					this.resizeRoot(false);
					PacketWriter.Widget_resetModelFrames(var16);
					class235.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field882[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2244 == var1.serverPacket) {
					isCameraLocked = true;
					HealthBarUpdate.field1038 = var3.readUnsignedByte() * 128;
					class8.field43 = var3.readUnsignedByte() * 128;
					FileSystem.field2099 = var3.readUnsignedShort();
					MouseRecorder.field609 = var3.readUnsignedByte();
					FloorDecoration.field1640 = var3.readUnsignedByte();
					if (FloorDecoration.field1640 >= 100) {
						VertexNormal.cameraX = HealthBarUpdate.field1038 * 16384 + 64;
						AbstractWorldMapData.cameraZ = class8.field43 * 16384 + 64;
						FaceNormal.cameraY = ArchiveLoader.getTileHeight(VertexNormal.cameraX, AbstractWorldMapData.cameraZ, Huffman.Client_plane) - FileSystem.field2099;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2239 == var1.serverPacket) {
					FloorOverlayDefinition.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2211 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.method5657();
					Varps.Varps_temp[var5] = var16;
					if (Varps.Varps_main[var5] != var16) {
						Varps.Varps_main[var5] = var16;
					}

					Clock.changeGameOptions(var5);
					field863[++field864 - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				Widget var6;
				if (ServerPacket.field2189 == var1.serverPacket) {
					var16 = var3.method5655();
					var5 = var3.method5667();
					var6 = TileItem.getWidget(var5);
					if (var6.modelType != 1 || var16 != var6.modelId) {
						var6.modelType = 1;
						var6.modelId = var16;
						class52.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2242 == var1.serverPacket) {
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

				if (ServerPacket.field2220 == var1.serverPacket) {
					Player.privateChatMode = TileItem.method2202(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2227 == var1.serverPacket) {
					var16 = var3.method5708();
					var48 = var3.method5612() == 1;
					var6 = TileItem.getWidget(var16);
					if (var48 != var6.isHidden) {
						var6.isHidden = var48;
						class52.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2202 == var1.serverPacket) {
					MouseHandler.method1134(class194.field2371);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2238 == var1.serverPacket) {
					var16 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var18 = var3.readUnsignedShort();
					class7.queueSoundEffect(var16, var5, var18);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2171 == var1.serverPacket) {
					ViewportMouse.method3098(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				Widget var51;
				if (ServerPacket.field2182 == var1.serverPacket) {
					var16 = var3.method5708();
					var51 = TileItem.getWidget(var16);

					for (var18 = 0; var18 < var51.itemIds.length; ++var18) {
						var51.itemIds[var18] = -1;
						var51.itemIds[var18] = 0;
					}

					class52.invalidateWidget(var51);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2214 == var1.serverPacket) {
					class60.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field870 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2165 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var16 < -70000) {
						var5 += 32768;
					}

					if (var16 >= 0) {
						var6 = TileItem.getWidget(var16);
					} else {
						var6 = null;
					}

					if (var6 != null) {
						for (var7 = 0; var7 < var6.itemIds.length; ++var7) {
							var6.itemIds[var7] = 0;
							var6.itemQuantities[var7] = 0;
						}
					}

					SequenceDefinition.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var19 = 0; var19 < var7; ++var19) {
						var20 = var3.method5655();
						var22 = var3.method5612();
						if (var22 == 255) {
							var22 = var3.method5708();
						}

						if (var6 != null && var19 < var6.itemIds.length) {
							var6.itemIds[var19] = var20;
							var6.itemQuantities[var19] = var22;
						}

						MidiPcmStream.itemContainerSetItem(var5, var19, var20 - 1, var22);
					}

					if (var6 != null) {
						class52.invalidateWidget(var6);
					}

					DevicePcmPlayerProvider.method897();
					changedItemContainers[++field903 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2209 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readInt();
					var18 = WorldMapData_1.getGcDuration();
					PacketBufferNode var57 = getPacketBufferNode(ClientPacket.field2262, packetWriter.isaacCipher);
					var57.packetBuffer.writeIntME(var18);
					var57.packetBuffer.method5645(GameEngine.fps);
					var57.packetBuffer.method5662(var16);
					var57.packetBuffer.method5669(var5);
					packetWriter.addNode(var57);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2163 == var1.serverPacket) {
					for (var16 = 0; var16 < Varps.Varps_main.length; ++var16) {
						if (Varps.Varps_main[var16] != Varps.Varps_temp[var16]) {
							Varps.Varps_main[var16] = Varps.Varps_temp[var16];
							Clock.changeGameOptions(var16);
							field863[++field864 - 1 & 31] = var16;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2216 == var1.serverPacket) {
					DevicePcmPlayerProvider.method897();
					weight = var3.readShort();
					field775 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2240 == var1.serverPacket) {
					MouseHandler.method1134(class194.field2362);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2203 == var1.serverPacket) {
					var16 = var3.readUnsignedShort();
					if (var16 == 65535) {
						var16 = -1;
					}

					WorldMapCacheName.playSong(var16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2215 == var1.serverPacket) {
					var16 = var3.method5657();
					if (var16 == 65535) {
						var16 = -1;
					}

					var5 = var3.method5740();
					class298.playSoundJingle(var16, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2241 == var1.serverPacket) {
					var16 = var3.readUnsignedShort();
					var5 = var3.method5667();
					var6 = TileItem.getWidget(var5);
					if (var6 != null && var6.type == 0) {
						if (var16 > var6.scrollHeight - var6.height) {
							var16 = var6.scrollHeight - var6.height;
						}

						if (var16 < 0) {
							var16 = 0;
						}

						if (var16 != var6.scrollY) {
							var6.scrollY = var16;
							class52.invalidateWidget(var6);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2197 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						Renderable.clanChat = null;
					} else {
						if (Renderable.clanChat == null) {
							Renderable.clanChat = new FriendsChatManager(WorldMapAreaData.loginType, class2.client);
						}

						Renderable.clanChat.readUpdate(var3);
					}

					ReflectionCheck.method2380();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2168 == var1.serverPacket) {
					FloorOverlayDefinition.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2162 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					class89.forceDisconnect(var16);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2226 == var1.serverPacket) {
					if (Renderable.clanChat != null) {
						Renderable.clanChat.method5350(var3);
					}

					ReflectionCheck.method2380();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2228 == var1.serverPacket) {
					MouseHandler.method1134(class194.field2364);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2178 == var1.serverPacket) {
					var16 = var3.method5639();
					var5 = var3.method5639();
					var42 = var3.readStringCp1252NullTerminated();
					if (var16 >= 1 && var16 <= 8) {
						if (var42.equalsIgnoreCase("null")) {
							var42 = null;
						}

						playerMenuActions[var16 - 1] = var42;
						playerOptionsPriorities[var16 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var58;
				if (ServerPacket.field2200 == var1.serverPacket) {
					var58 = var3.readUnsignedByte() == 1;
					if (var58) {
						ItemContainer.field553 = PacketWriter.currentTimeMillis() - var3.readLong();
						WorldMapSection1.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						WorldMapSection1.grandExchangeEvents = null;
					}

					field873 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2173 == var1.serverPacket) {
					var16 = var3.method5639();
					var5 = var3.method5708();
					var18 = var3.method5655();
					var56 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var56 != null) {
						class58.closeInterface(var56, var18 != var56.group);
					}

					WorldMapSprite.method494(var5, var18, var16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2183 == var1.serverPacket) {
					tradeChatMode = var3.method5612();
					publicChatMode = var3.method5612();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2169 == var1.serverPacket) {
					WorldMapIcon_0.field154 = var3.method5646();
					ScriptEvent.field597 = var3.method5612();

					while (var3.offset < var1.serverPacketLength) {
						var16 = var3.readUnsignedByte();
						class194 var52 = UserComparator5.method3518()[var16];
						MouseHandler.method1134(var52);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2188 == var1.serverPacket) {
					class2.updatePlayers(var3, var1.serverPacketLength);
					GameEngine.method1109();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2187 == var1.serverPacket) {
					var58 = var3.readBoolean();
					if (var58) {
						if (ModelData0.field1901 == null) {
							ModelData0.field1901 = new class247();
						}
					} else {
						ModelData0.field1901 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2204 == var1.serverPacket) {
					MouseHandler.method1134(class194.field2368);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2231 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.method5657();
					var6 = TileItem.getWidget(var16);
					if (var6.modelType != 2 || var5 != var6.modelId) {
						var6.modelType = 2;
						var6.modelId = var5;
						class52.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2225 == var1.serverPacket) {
					WorldMapIcon_0.field154 = var3.readUnsignedByte();
					ScriptEvent.field597 = var3.method5646();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2159 == var1.serverPacket) {
					MouseHandler.method1134(class194.field2366);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2217 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var16] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var16] = new GrandExchangeOffer(var3, false);
					}

					field872 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				Widget var21;
				if (ServerPacket.field2207 == var1.serverPacket) {
					var16 = var3.method5656();
					var5 = var3.method5667();
					var18 = var3.method5657();
					var21 = TileItem.getWidget(var5);
					var21.field2633 = var16 + (var18 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2158 == var1.serverPacket) {
					var16 = var3.method5708();
					var5 = var3.method5656();
					var18 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var19 = var5 & 31;
					var20 = (var7 << 11) + (var18 << 19) + (var19 << 3);
					Widget var10 = TileItem.getWidget(var16);
					if (var20 != var10.color) {
						var10.color = var20;
						class52.invalidateWidget(var10);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2167 == var1.serverPacket) {
					for (var16 = 0; var16 < players.length; ++var16) {
						if (players[var16] != null) {
							players[var16].sequence = -1;
						}
					}

					for (var16 = 0; var16 < npcs.length; ++var16) {
						if (npcs[var16] != null) {
							npcs[var16].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2194 == var1.serverPacket) {
					var16 = var3.readUnsignedShort();
					if (var16 == 65535) {
						var16 = -1;
					}

					var5 = var3.method5678();
					var18 = var3.method5678();
					var21 = TileItem.getWidget(var18);
					ItemComposition var43;
					if (!var21.isIf3) {
						if (var16 == -1) {
							var21.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var43 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var16);
						var21.modelType = 4;
						var21.modelId = var16;
						var21.modelAngleX = var43.xan2d;
						var21.modelAngleY = var43.yan2d;
						var21.modelZoom = var43.zoom2d * 100 / var5;
						class52.invalidateWidget(var21);
					} else {
						var21.itemId = var16;
						var21.itemQuantity = var5;
						var43 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var16);
						var21.modelAngleX = var43.xan2d;
						var21.modelAngleY = var43.yan2d;
						var21.modelAngleZ = var43.zan2d;
						var21.modelOffsetX = var43.offsetX2d;
						var21.modelOffsetY = var43.offsetY2d;
						var21.modelZoom = var43.zoom2d;
						if (var43.isStackable == 1) {
							var21.itemQuantityMode = 1;
						} else {
							var21.itemQuantityMode = 2;
						}

						if (var21.field2728 > 0) {
							var21.modelZoom = var21.modelZoom * 32 / var21.field2728;
						} else if (var21.rawWidth > 0) {
							var21.modelZoom = var21.modelZoom * 32 / var21.rawWidth;
						}

						class52.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var8;
				if (ServerPacket.field2212 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readUnsignedShort();
					var18 = var3.method5655();
					var7 = var3.method5656();
					var8 = TileItem.getWidget(var16);
					if (var18 != var8.modelAngleX || var5 != var8.modelAngleY || var7 != var8.modelZoom) {
						var8.modelAngleX = var18;
						var8.modelAngleY = var5;
						var8.modelZoom = var7;
						class52.invalidateWidget(var8);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2181 == var1.serverPacket) {
					WorldMapIcon_0.field154 = var3.method5612();
					ScriptEvent.field597 = var3.method5639();

					for (var16 = WorldMapIcon_0.field154; var16 < WorldMapIcon_0.field154 + 8; ++var16) {
						for (var5 = ScriptEvent.field597; var5 < ScriptEvent.field597 + 8; ++var5) {
							if (groundItems[Huffman.Client_plane][var16][var5] != null) {
								groundItems[Huffman.Client_plane][var16][var5] = null;
								class13.updateItemPile(var16, var5);
							}
						}
					}

					for (PendingSpawn var37 = (PendingSpawn)pendingSpawns.last(); var37 != null; var37 = (PendingSpawn)pendingSpawns.previous()) {
						if (var37.x >= WorldMapIcon_0.field154 && var37.x < WorldMapIcon_0.field154 + 8 && var37.y >= ScriptEvent.field597 && var37.y < ScriptEvent.field597 + 8 && var37.plane == Huffman.Client_plane) {
							var37.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2170 == var1.serverPacket) {
					DevicePcmPlayerProvider.method897();
					runEnergy = var3.readUnsignedByte();
					field775 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				long var24;
				long var26;
				String var36;
				if (ServerPacket.field2218 == var1.serverPacket) {
					var36 = var3.readStringCp1252NullTerminated();
					var24 = (long)var3.readUnsignedShort();
					var26 = (long)var3.readMedium();
					PlayerType var28 = (PlayerType)TextureProvider.findEnumerated(ApproximateRouteStrategy.PlayerType_values(), var3.readUnsignedByte());
					long var29 = var26 + (var24 << 32);
					boolean var31 = false;

					for (int var13 = 0; var13 < 100; ++var13) {
						if (var29 == field896[var13]) {
							var31 = true;
							break;
						}
					}

					if (class60.friendSystem.isIgnored(new Username(var36, WorldMapAreaData.loginType))) {
						var31 = true;
					}

					if (!var31 && field790 == 0) {
						field896[field794] = var29;
						field794 = (field794 + 1) % 100;
						String var32 = AbstractFont.escapeBrackets(Huffman.method4049(ScriptEvent.method1235(var3)));
						byte var49;
						if (var28.isPrivileged) {
							var49 = 7;
						} else {
							var49 = 3;
						}

						if (var28.modIcon != -1) {
							WorldMapRectangle.addGameMessage(var49, WorldMapScaleHandler.method824(var28.modIcon) + var36, var32);
						} else {
							WorldMapRectangle.addGameMessage(var49, var36, var32);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2229 == var1.serverPacket) {
					class60.friendSystem.method1919();
					field870 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2213 == var1.serverPacket) {
					var16 = var3.method5659();
					var5 = var3.readInt();
					var6 = TileItem.getWidget(var5);
					if (var16 != var6.sequenceId || var16 == -1) {
						var6.sequenceId = var16;
						var6.modelFrame = 0;
						var6.modelFrameCycle = 0;
						class52.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2199 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class60.method937(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2175 == var1.serverPacket) {
					var16 = var3.method5667();
					var51 = TileItem.getWidget(var16);
					var51.modelType = 3;
					var51.modelId = WorldMapLabelSize.localPlayer.appearance.getChatHeadId();
					class52.invalidateWidget(var51);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2192 == var1.serverPacket) {
					DevicePcmPlayerProvider.method897();
					var16 = var3.readInt();
					var5 = var3.method5612();
					var18 = var3.readUnsignedByte();
					experience[var5] = var16;
					currentLevels[var5] = var18;
					levels[var5] = 1;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var16 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2235 == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 4096;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 8192;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 4096;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 4096;
							hintArrowSubY = 8192;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte() * 2;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2176 == var1.serverPacket) {
					var16 = var3.method5667();
					var17 = var3.readStringCp1252NullTerminated();
					var6 = TileItem.getWidget(var16);
					if (!var17.equals(var6.text)) {
						var6.text = var17;
						class52.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2185 == var1.serverPacket) {
					var16 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var18 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field922[var16] = true;
					field678[var16] = var5;
					field740[var16] = var18;
					field925[var16] = var7;
					field926[var16] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2237 == var1.serverPacket) {
					MouseHandler.method1134(class194.field2370);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2224 == var1.serverPacket) {
					var36 = var3.readStringCp1252NullTerminated();
					Object[] var50 = new Object[var36.length() + 1];

					for (var18 = var36.length() - 1; var18 >= 0; --var18) {
						if (var36.charAt(var18) == 's') {
							var50[var18 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var50[var18 + 1] = new Integer(var3.readInt());
						}
					}

					var50[0] = new Integer(var3.readInt());
					ScriptEvent var41 = new ScriptEvent();
					var41.args = var50;
					Script.runScriptEvent(var41);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2177 == var1.serverPacket) {
					WorldMapID.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2201 == var1.serverPacket) {
					var16 = var3.method5708();
					var5 = var3.readInt();
					InterfaceParent var40 = (InterfaceParent)interfaceParents.get((long)var16);
					var56 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var56 != null) {
						class58.closeInterface(var56, var40 == null || var56.group != var40.group);
					}

					if (var40 != null) {
						var40.remove();
						interfaceParents.put(var40, (long)var5);
					}

					var8 = TileItem.getWidget(var16);
					if (var8 != null) {
						class52.invalidateWidget(var8);
					}

					var8 = TileItem.getWidget(var5);
					if (var8 != null) {
						class52.invalidateWidget(var8);
						class4.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var8.id >>> 16], var8, true);
					}

					if (rootInterface != -1) {
						ClientPacket.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2166 == var1.serverPacket) {
					MouseHandler.method1134(class194.field2361);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2193 == var1.serverPacket) {
					var16 = var3.method5657();
					WorldMapData_0.method263(var16);
					changedItemContainers[++field903 - 1 & 31] = var16 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2230 == var1.serverPacket) {
					ViewportMouse.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field2232 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2190 == var1.serverPacket) {
					var36 = var3.readStringCp1252NullTerminated();
					var17 = AbstractFont.escapeBrackets(Huffman.method4049(ScriptEvent.method1235(var3)));
					WorldMapRectangle.addGameMessage(6, var36, var17);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2243 == var1.serverPacket) {
					var16 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var16 < -70000) {
						var5 += 32768;
					}

					if (var16 >= 0) {
						var6 = TileItem.getWidget(var16);
					} else {
						var6 = null;
					}

					for (; var3.offset < var1.serverPacketLength; MidiPcmStream.itemContainerSetItem(var5, var7, var19 - 1, var20)) {
						var7 = var3.readUShortSmart();
						var19 = var3.readUnsignedShort();
						var20 = 0;
						if (var19 != 0) {
							var20 = var3.readUnsignedByte();
							if (var20 == 255) {
								var20 = var3.readInt();
							}
						}

						if (var6 != null && var7 >= 0 && var7 < var6.itemIds.length) {
							var6.itemIds[var7] = var19;
							var6.itemQuantities[var7] = var20;
						}
					}

					if (var6 != null) {
						class52.invalidateWidget(var6);
					}

					DevicePcmPlayerProvider.method897();
					changedItemContainers[++field903 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2236 == var1.serverPacket) {
					var36 = var3.readStringCp1252NullTerminated();
					var24 = var3.readLong();
					var26 = (long)var3.readUnsignedShort();
					var9 = (long)var3.readMedium();
					PlayerType var11 = (PlayerType)TextureProvider.findEnumerated(ApproximateRouteStrategy.PlayerType_values(), var3.readUnsignedByte());
					var12 = (var26 << 32) + var9;
					boolean var14 = false;

					for (int var15 = 0; var15 < 100; ++var15) {
						if (field896[var15] == var12) {
							var14 = true;
							break;
						}
					}

					if (var11.isUser && class60.friendSystem.isIgnored(new Username(var36, WorldMapAreaData.loginType))) {
						var14 = true;
					}

					if (!var14 && field790 == 0) {
						field896[field794] = var12;
						field794 = (field794 + 1) % 100;
						String var33 = AbstractFont.escapeBrackets(Huffman.method4049(ScriptEvent.method1235(var3)));
						if (var11.modIcon != -1) {
							WorldMapData_0.addChatMessage(9, WorldMapScaleHandler.method824(var11.modIcon) + var36, var33, GrandExchangeOfferTotalQuantityComparator.base37DecodeLong(var24));
						} else {
							WorldMapData_0.addChatMessage(9, var36, var33, GrandExchangeOfferTotalQuantityComparator.base37DecodeLong(var24));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2233 == var1.serverPacket) {
					MouseHandler.method1134(class194.field2365);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field2210 == var1.serverPacket) {
					var16 = var3.method5678();
					var5 = var3.readShort();
					var18 = var3.method5658();
					var21 = TileItem.getWidget(var16);
					if (var18 != var21.rawX || var5 != var21.rawY || var21.xAlignment != 0 || var21.yAlignment != 0) {
						var21.rawX = var18;
						var21.rawY = var5;
						var21.xAlignment = 0;
						var21.yAlignment = 0;
						class52.invalidateWidget(var21);
						this.alignWidget(var21);
						if (var21.type == 0) {
							class4.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var16 >> 16], var21, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Decimator.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1348 != null ? var1.field1348.id : -1) + "," + (var1.field1346 != null ? var1.field1346.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				ViewportMouse.logOut();
			} catch (IOException var34) {
				ArchiveLoader.method1208();
			} catch (Exception var35) {
				var17 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1348 != null ? var1.field1348.id : -1) + "," + (var1.field1346 != null ? var1.field1346.id : -1) + "," + var1.serverPacketLength + "," + (WorldMapLabelSize.localPlayer.pathX[0] + WorldMapManager.baseX * 64) + "," + (WorldMapLabelSize.localPlayer.pathY[0] + WorldMapLabel.baseY * 64) + ",";

				for (var18 = 0; var18 < var1.serverPacketLength && var18 < 50; ++var18) {
					var17 = var17 + var3.array[var18] + ",";
				}

				Decimator.RunException_sendStackTrace(var17, var35);
				ViewportMouse.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "736639709"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false;

		int var2;
		int var5;
		while (!var1) {
			var1 = true;

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
					String var3 = menuTargets[var2];
					menuTargets[var2] = menuTargets[var2 + 1];
					menuTargets[var2 + 1] = var3;
					String var4 = menuActions[var2];
					menuActions[var2] = menuActions[var2 + 1];
					menuActions[var2 + 1] = var4;
					var5 = menuOpcodes[var2];
					menuOpcodes[var2] = menuOpcodes[var2 + 1];
					menuOpcodes[var2 + 1] = var5;
					var5 = menuArguments1[var2];
					menuArguments1[var2] = menuArguments1[var2 + 1];
					menuArguments1[var2 + 1] = var5;
					var5 = menuArguments2[var2];
					menuArguments2[var2] = menuArguments2[var2 + 1];
					menuArguments2[var2 + 1] = var5;
					var5 = menuIdentifiers[var2];
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1];
					menuIdentifiers[var2 + 1] = var5;
					boolean var6 = menuShiftClick[var2];
					menuShiftClick[var2] = menuShiftClick[var2 + 1];
					menuShiftClick[var2 + 1] = var6;
					var1 = false;
				}
			}
		}

		if (BuddyRankComparator.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var14;
				label310: {
					int var16 = MouseHandler.MouseHandler_lastButton;
					int var8;
					int var13;
					if (isMenuOpen) {
						int var17;
						int var18;
						if (var16 != 1 && (ScriptEvent.mouseCam || var16 != 4)) {
							var2 = MouseHandler.MouseHandler_x;
							var13 = MouseHandler.MouseHandler_y;
							if (var2 < ChatChannel.menuX - 10 || var2 > DevicePcmPlayerProvider.menuWidth + ChatChannel.menuX + 10 || var13 < menuY - 10 || var13 > WorldMapManager.menuHeight + menuY + 10) {
								isMenuOpen = false;
								var14 = ChatChannel.menuX;
								var5 = menuY;
								var17 = DevicePcmPlayerProvider.menuWidth;
								var18 = WorldMapManager.menuHeight;

								for (var8 = 0; var8 < rootWidgetCount; ++var8) {
									if (rootWidgetWidths[var8] + rootWidgetXs[var8] > var14 && rootWidgetXs[var8] < var14 + var17 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var5 + var18) {
										field882[var8] = true;
									}
								}
							}
						}

						if (var16 == 1 || !ScriptEvent.mouseCam && var16 == 4) {
							var2 = ChatChannel.menuX;
							var13 = menuY;
							var14 = DevicePcmPlayerProvider.menuWidth;
							var5 = MouseHandler.MouseHandler_lastPressedX;
							var17 = MouseHandler.MouseHandler_lastPressedY;
							var18 = -1;

							int var9;
							for (var8 = 0; var8 < menuOptionsCount; ++var8) {
								var9 = var13 + (menuOptionsCount - 1 - var8) * 15 + 31;
								if (var5 > var2 && var5 < var14 + var2 && var17 > var9 - 13 && var17 < var9 + 3) {
									var18 = var8;
								}
							}

							if (var18 != -1) {
								Widget.method4175(var18);
							}

							isMenuOpen = false;
							var8 = ChatChannel.menuX;
							var9 = menuY;
							int var10 = DevicePcmPlayerProvider.menuWidth;
							int var11 = WorldMapManager.menuHeight;

							for (int var12 = 0; var12 < rootWidgetCount; ++var12) {
								if (rootWidgetXs[var12] + rootWidgetWidths[var12] > var8 && rootWidgetXs[var12] < var8 + var10 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var9 && rootWidgetYs[var12] < var9 + var11) {
									field882[var12] = true;
								}
							}
						}
					} else {
						var2 = GrandExchangeOffer.method209();
						if ((var16 == 1 || !ScriptEvent.mouseCam && var16 == 4) && var2 >= 0) {
							var13 = menuOpcodes[var2];
							if (var13 == 39 || var13 == 40 || var13 == 41 || var13 == 42 || var13 == 43 || var13 == 33 || var13 == 34 || var13 == 35 || var13 == 36 || var13 == 37 || var13 == 38 || var13 == 1005) {
								var14 = menuArguments1[var2];
								var5 = menuArguments2[var2];
								Widget var15 = TileItem.getWidget(var5);
								var8 = WorldMapIcon_0.getWidgetClickMask(var15);
								boolean var7 = (var8 >> 28 & 1) != 0;
								if (var7) {
									break label310;
								}

								Object var10000 = null;
								if (Widget.method4172(WorldMapIcon_0.getWidgetClickMask(var15))) {
									break label310;
								}
							}
						}

						if ((var16 == 1 || !ScriptEvent.mouseCam && var16 == 4) && this.shouldLeftClickOpenMenu()) {
							var16 = 2;
						}

						if ((var16 == 1 || !ScriptEvent.mouseCam && var16 == 4) && menuOptionsCount > 0) {
							Widget.method4175(var2);
						}

						if (var16 == 2 && menuOptionsCount > 0) {
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return;
				}

				if (BuddyRankComparator.dragInventoryWidget != null && !field788 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
					SecureRandomFuture.method2211(draggedWidgetX, draggedWidgetY);
				}

				field788 = false;
				itemDragDuration = 0;
				if (BuddyRankComparator.dragInventoryWidget != null) {
					class52.invalidateWidget(BuddyRankComparator.dragInventoryWidget);
				}

				BuddyRankComparator.dragInventoryWidget = TileItem.getWidget(var5);
				dragItemSlotSource = var14;
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
				if (var2 >= 0) {
					ObjectSound.method1983(var2);
				}

				class52.invalidateWidget(BuddyRankComparator.dragInventoryWidget);
			}
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-40940345"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = GrandExchangeOffer.method209();
		boolean var2 = leftClickOpensMenu == 1 && menuOptionsCount > 2;
		if (!var2) {
			boolean var3;
			if (var1 < 0) {
				var3 = false;
			} else {
				int var4 = menuOpcodes[var1];
				if (var4 >= 2000) {
					var4 -= 2000;
				}

				if (var4 == 1007) {
					var3 = true;
				} else {
					var3 = false;
				}
			}

			var2 = var3;
		}

		return var2 && !menuShiftClick[var1];
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-756667188"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		WorldMapSprite.method493(var1, var2);
		ScriptEvent.scene.menuOpen(Huffman.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		signature = "(ZB)V",
		garbageValue = "56"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface;
		int var3 = FloorDecoration.canvasWidth;
		int var4 = GameEngine.canvasHeight;
		if (WorldMapSprite.loadInterface(var2)) {
			KeyHandler.resizeInterface(Widget.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		signature = "(Lhq;I)V",
		garbageValue = "1722928474"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : TileItem.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = FloorDecoration.canvasWidth;
			var4 = GameEngine.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		MouseRecorder.alignWidgetSize(var1, var3, var4, false);
		DirectByteArrayCopier.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "10"
	)
	final void method1458() {
		class52.invalidateWidget(clickedWidget);
		++BoundaryObject.widgetDragDuration;
		if (field880 && field799) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field856) {
				var1 = field856;
			}

			if (var1 + clickedWidget.width > field856 + clickedWidgetParent.width) {
				var1 = field856 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field785) {
				var2 = field785;
			}

			if (var2 + clickedWidget.height > field785 + clickedWidgetParent.height) {
				var2 = field785 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field859;
			int var4 = var2 - field795;
			int var5 = clickedWidget.dragZoneSize;
			if (BoundaryObject.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field856 + clickedWidgetParent.scrollX;
			int var7 = var2 - field785 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				Script.runScriptEvent(var8);
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
						Script.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && ReflectionCheck.method2381(clickedWidget) != null) {
						PacketBufferNode var9 = getPacketBufferNode(ClientPacket.field2266, packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(draggedOnWidget.id);
						var9.packetBuffer.method5663(clickedWidget.id);
						var9.packetBuffer.method5665(clickedWidget.childIndex);
						var9.packetBuffer.method5653(draggedOnWidget.itemId);
						var9.packetBuffer.method5653(draggedOnWidget.childIndex);
						var9.packetBuffer.method5653(clickedWidget.itemId);
						packetWriter.addNode(var9);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(widgetClickX + field859, field795 + widgetClickY);
				} else if (menuOptionsCount > 0) {
					SecureRandomFuture.method2211(widgetClickX + field859, widgetClickY + field795);
				}

				clickedWidget = null;
			}

		} else {
			if (BoundaryObject.widgetDragDuration > 1) {
				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		signature = "(I)Lku;",
		garbageValue = "1348007061"
	)
	@Export("username")
	public Username username() {
		return WorldMapLabelSize.localPlayer != null ? WorldMapLabelSize.localPlayer.username : null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-2048198145"
	)
	public static int method1789(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(DDII)[D",
		garbageValue = "1556840096"
	)
	public static double[] method1378(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = class278.method5090((double)var7, var0, var2);
			++var7;
		}

		return var6;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lgf;Llh;I)Lgb;",
		garbageValue = "-1510216701"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = ItemContainer.method1226();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "887338283"
	)
	static boolean method1792() {
		return (drawPlayerNames & 1) != 0;
	}
}
