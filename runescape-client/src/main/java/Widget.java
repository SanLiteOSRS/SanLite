import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static class411 field3598;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static class411 field3633;
	@ObfuscatedName("bx")
	public static boolean field3600;
	@ObfuscatedName("be")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1486786309
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 112312013
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1659025395
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 260373891
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1123460323
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -660386297
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1642335409
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1868684071
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1242256455
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1805858379
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 2060114855
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 590805653
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1302734365
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -319445197
	)
	@Export("x")
	public int x;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 779262443
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1387970291
	)
	@Export("width")
	public int width;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -175088023
	)
	@Export("height")
	public int height;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -2251387
	)
	public int field3619;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 701370315
	)
	public int field3620;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1437254475
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("cy")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1598973959
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 614514497
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 83109607
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 2136913233
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1020923441
	)
	@Export("color")
	public int color;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -290912119
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -517257297
	)
	public int field3704;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1954010095
	)
	public int field3630;
	@ObfuscatedName("ck")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("fillMode")
	public class512 fillMode;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -252985877
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1183866781
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1790024679
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cn")
	public boolean field3658;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 712819103
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 86335445
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("co")
	public String field3693;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -428690419
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("dd")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1429504887
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1116641991
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("da")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("dt")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -2015482681
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 52437899
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -10425679
	)
	int field3648;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 1204630069
	)
	int field3649;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1811319287
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 209572647
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 910361673
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 2134243185
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1882890785
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1676195677
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1464089405
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -797771265
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1546296991
	)
	public int field3667;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -205849923
	)
	public int field3659;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public PlayerComposition field3631;
	@ObfuscatedName("dg")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("de")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1042005455
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1075969391
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("ds")
	@Export("text")
	public String text;
	@ObfuscatedName("dr")
	public String field3666;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -577725377
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = -45471049
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -97667965
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("eu")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	class169 field3692;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 2144662483
	)
	int field3689;
	@ObfuscatedName("em")
	HashMap field3707;
	@ObfuscatedName("ea")
	HashMap field3674;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	class325 field3675;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = 1405882523
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ec")
	public boolean field3677;
	@ObfuscatedName("el")
	public byte[][] field3678;
	@ObfuscatedName("ed")
	public byte[][] field3671;
	@ObfuscatedName("ep")
	public int[] field3639;
	@ObfuscatedName("ew")
	public int[] field3681;
	@ObfuscatedName("ex")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ev")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 403399243
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = 407242931
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("eq")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("fg")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("fa")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("fm")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("fc")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fl")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fe")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fz")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fp")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fw")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ff")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ft")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fv")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fu")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fd")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fr")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fh")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fj")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fo")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fb")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fy")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fx")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fq")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fi")
	public Object[] field3739;
	@ObfuscatedName("fs")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fn")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fk")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("gw")
	public Object[] field3714;
	@ObfuscatedName("gd")
	public Object[] field3715;
	@ObfuscatedName("go")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gh")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("ge")
	public Object[] field3718;
	@ObfuscatedName("gb")
	public Object[] field3719;
	@ObfuscatedName("gv")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("ga")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gk")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gt")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gz")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gm")
	public Object[] field3725;
	@ObfuscatedName("gg")
	public Object[] field3703;
	@ObfuscatedName("gi")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gr")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gc")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 1291355075
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gp")
	public String field3731;
	@ObfuscatedName("gy")
	public String field3732;
	@ObfuscatedName("gf")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gx")
	public int[] field3655;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 1705418949
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 886241183
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 694669037
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 1626901995
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "[Lmb;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("he")
	public boolean field3740;
	@ObfuscatedName("ha")
	public boolean field3741;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = -169488509
	)
	public int field3742;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = 495401197
	)
	public int field3743;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -1829233171
	)
	public int field3744;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = -1098667907
	)
	public int field3601;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = 310782007
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 1601831101
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hc")
	public int[] field3669;
	@ObfuscatedName("hh")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hw")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hs")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 60
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 61
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 62
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 63
		field3598 = new class411(10, class409.field4549); // L: 64
		field3633 = new class411(10, class409.field4549); // L: 65
		field3600 = false; // L: 66
	}

	public Widget() {
		this.isIf3 = false; // L: 67
		this.id = -1; // L: 68
		this.childIndex = -1; // L: 69
		this.buttonType = 0; // L: 71
		this.contentType = 0; // L: 72
		this.xAlignment = 0; // L: 73
		this.yAlignment = 0;
		this.widthAlignment = 0; // L: 75
		this.heightAlignment = 0; // L: 76
		this.rawX = 0; // L: 77
		this.rawY = 0; // L: 78
		this.rawWidth = 0; // L: 79
		this.rawHeight = 0; // L: 80
		this.x = 0; // L: 81
		this.y = 0; // L: 82
		this.width = 0; // L: 83
		this.height = 0; // L: 84
		this.field3619 = 1; // L: 85
		this.field3620 = 1; // L: 86
		this.parentId = -1; // L: 87
		this.isHidden = false; // L: 88
		this.scrollX = 0; // L: 89
		this.scrollY = 0; // L: 90
		this.scrollWidth = 0; // L: 91
		this.scrollHeight = 0; // L: 92
		this.color = 0; // L: 93
		this.color2 = 0; // L: 94
		this.field3704 = 0; // L: 95
		this.field3630 = 0; // L: 96
		this.fill = false; // L: 97
		this.fillMode = class512.SOLID; // L: 98
		this.transparencyTop = 0; // L: 99
		this.transparencyBot = 0; // L: 100
		this.lineWid = 1; // L: 101
		this.field3658 = false; // L: 102
		this.spriteId2 = -1; // L: 103
		this.spriteId = -1; // L: 104
		this.spriteAngle = 0; // L: 106
		this.spriteTiling = false; // L: 107
		this.outline = 0; // L: 108
		this.spriteShadow = 0; // L: 109
		this.modelType = 1; // L: 112
		this.modelId = -1; // L: 113
		this.field3648 = 1; // L: 114
		this.field3649 = -1; // L: 115
		this.sequenceId = -1; // L: 116
		this.sequenceId2 = -1; // L: 117
		this.modelOffsetX = 0; // L: 118
		this.modelOffsetY = 0; // L: 119
		this.modelAngleX = 0; // L: 120
		this.modelAngleY = 0; // L: 121
		this.modelAngleZ = 0; // L: 122
		this.modelZoom = 100; // L: 123
		this.field3667 = 0; // L: 124
		this.field3659 = 0;
		this.modelOrthog = false; // L: 127
		this.modelTransparency = false; // L: 128
		this.itemQuantityMode = 2; // L: 129
		this.fontId = -1; // L: 130
		this.text = ""; // L: 131
		this.field3666 = ""; // L: 132
		this.textLineHeight = 0; // L: 133
		this.textXAlignment = 0; // L: 134
		this.textYAlignment = 0; // L: 135
		this.textShadowed = false; // L: 136
		this.field3689 = -1; // L: 138
		this.flags = 0; // L: 143
		this.field3677 = false; // L: 144
		this.dataText = ""; // L: 153
		this.parent = null; // L: 155
		this.dragZoneSize = 0; // L: 156
		this.dragThreshold = 0; // L: 157
		this.isScrollBar = false; // L: 158
		this.spellActionName = ""; // L: 159
		this.hasListener = false; // L: 160
		this.mouseOverRedirect = -1; // L: 201
		this.field3731 = ""; // L: 202
		this.field3732 = "Ok"; // L: 203
		this.itemId = -1; // L: 206
		this.itemQuantity = 0; // L: 207
		this.modelFrame = 0; // L: 208
		this.modelFrameCycle = 0; // L: 209
		this.field3740 = false; // L: 211
		this.field3741 = false; // L: 212
		this.field3742 = -1; // L: 213
		this.field3743 = 0; // L: 214
		this.field3744 = 0; // L: 215
		this.field3601 = 0; // L: 216
		this.rootIndex = -1; // L: 217
		this.cycle = -1; // L: 218
		this.noClickThrough = false; // L: 220
		this.noScrollThrough = false; // L: 221
		this.prioritizeMenuEntry = false; // L: 222
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-145893950"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 280
		this.type = var1.readUnsignedByte(); // L: 281
		this.buttonType = var1.readUnsignedByte(); // L: 282
		this.contentType = var1.readUnsignedShort(); // L: 283
		this.rawX = var1.readShort(); // L: 284
		this.rawY = var1.readShort(); // L: 285
		this.rawWidth = var1.readUnsignedShort(); // L: 286
		this.rawHeight = var1.readUnsignedShort(); // L: 287
		this.transparencyTop = var1.readUnsignedByte(); // L: 288
		this.parentId = var1.readUnsignedShort(); // L: 289
		if (this.parentId == 65535) { // L: 290
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 291
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 292
		if (this.mouseOverRedirect == 65535) { // L: 293
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 294
		int var3;
		if (var2 > 0) { // L: 295
			this.cs1Comparisons = new int[var2]; // L: 296
			this.cs1ComparisonValues = new int[var2]; // L: 297

			for (var3 = 0; var3 < var2; ++var3) { // L: 298
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 299
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 300
			}
		}

		var3 = var1.readUnsignedByte(); // L: 303
		int var4;
		if (var3 > 0) { // L: 304
			this.cs1Instructions = new int[var3][]; // L: 305

			for (var4 = 0; var4 < var3; ++var4) { // L: 306
				int var5 = var1.readUnsignedShort(); // L: 307
				this.cs1Instructions[var4] = new int[var5]; // L: 308

				for (int var6 = 0; var6 < var5; ++var6) { // L: 309
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 310
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 311
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 315
			this.scrollHeight = var1.readUnsignedShort(); // L: 316
			this.isHidden = var1.readUnsignedByte() == 1; // L: 317
		}

		if (this.type == 1) { // L: 319
			var1.readUnsignedShort(); // L: 320
			var1.readUnsignedByte(); // L: 321
		}

		if (this.type == 3) { // L: 323
			this.fill = var1.readUnsignedByte() == 1; // L: 324
		}

		if (this.type == 4 || this.type == 1) { // L: 326
			this.textXAlignment = var1.readUnsignedByte(); // L: 327
			this.textYAlignment = var1.readUnsignedByte(); // L: 328
			this.textLineHeight = var1.readUnsignedByte(); // L: 329
			this.fontId = var1.readUnsignedShort(); // L: 330
			if (this.fontId == 65535) { // L: 331
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 332
		}

		if (this.type == 4) { // L: 334
			this.text = var1.readStringCp1252NullTerminated(); // L: 335
			this.field3666 = var1.readStringCp1252NullTerminated(); // L: 336
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 338
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 339
			this.color2 = var1.readInt(); // L: 340
			this.field3704 = var1.readInt(); // L: 341
			this.field3630 = var1.readInt(); // L: 342
		}

		if (this.type == 5) { // L: 344
			this.spriteId2 = var1.readInt(); // L: 345
			this.spriteId = var1.readInt(); // L: 346
		}

		if (this.type == 6) { // L: 348
			this.modelType = 1; // L: 349
			this.modelId = var1.readUnsignedShort(); // L: 350
			if (this.modelId == 65535) { // L: 351
				this.modelId = -1;
			}

			this.field3648 = 1; // L: 352
			this.field3649 = var1.readUnsignedShort(); // L: 353
			if (this.field3649 == 65535) { // L: 354
				this.field3649 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 355
			if (this.sequenceId == 65535) { // L: 356
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 357
			if (this.sequenceId2 == 65535) { // L: 358
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 359
			this.modelAngleX = var1.readUnsignedShort(); // L: 360
			this.modelAngleY = var1.readUnsignedShort(); // L: 361
		}

		if (this.type == 8) { // L: 363
			this.text = var1.readStringCp1252NullTerminated(); // L: 364
		}

		if (this.buttonType == 2) { // L: 366
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 367
			this.field3731 = var1.readStringCp1252NullTerminated(); // L: 368
			var4 = var1.readUnsignedShort() & 63; // L: 369
			this.flags |= var4 << 11; // L: 370
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 372
			this.field3732 = var1.readStringCp1252NullTerminated(); // L: 373
			if (this.field3732.length() == 0) { // L: 374
				if (this.buttonType == 1) { // L: 375
					this.field3732 = "Ok";
				}

				if (this.buttonType == 4) { // L: 376
					this.field3732 = "Select";
				}

				if (this.buttonType == 5) { // L: 377
					this.field3732 = "Select";
				}

				if (this.buttonType == 6) { // L: 378
					this.field3732 = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 381
			this.flags |= 4194304; // L: 382
		}

		if (this.buttonType == 6) { // L: 384
			this.flags |= 1; // L: 385
		}

	} // L: 387

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "714197315"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 390
		this.isIf3 = true; // L: 391
		this.type = var1.readUnsignedByte(); // L: 392
		this.contentType = var1.readUnsignedShort(); // L: 393
		this.rawX = var1.readShort(); // L: 394
		this.rawY = var1.readShort(); // L: 395
		this.rawWidth = var1.readUnsignedShort(); // L: 396
		if (this.type == 9) { // L: 397
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 398
		}

		this.widthAlignment = var1.readByte(); // L: 399
		this.heightAlignment = var1.readByte(); // L: 400
		this.xAlignment = var1.readByte(); // L: 401
		this.yAlignment = var1.readByte(); // L: 402
		this.parentId = var1.readUnsignedShort(); // L: 403
		if (this.parentId == 65535) { // L: 404
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 405
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 406
		if (this.type == 0) { // L: 407
			this.scrollWidth = var1.readUnsignedShort(); // L: 408
			this.scrollHeight = var1.readUnsignedShort(); // L: 409
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 410
		}

		if (this.type == 5) { // L: 412
			this.spriteId2 = var1.readInt(); // L: 413
			this.spriteAngle = var1.readUnsignedShort(); // L: 414
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 415
			this.transparencyTop = var1.readUnsignedByte(); // L: 416
			this.outline = var1.readUnsignedByte(); // L: 417
			this.spriteShadow = var1.readInt(); // L: 418
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 419
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 420
		}

		if (this.type == 6) { // L: 422
			this.modelType = 1; // L: 423
			this.modelId = var1.readUnsignedShort(); // L: 424
			if (this.modelId == 65535) { // L: 425
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 426
			this.modelOffsetY = var1.readShort(); // L: 427
			this.modelAngleX = var1.readUnsignedShort(); // L: 428
			this.modelAngleY = var1.readUnsignedShort(); // L: 429
			this.modelAngleZ = var1.readUnsignedShort(); // L: 430
			this.modelZoom = var1.readUnsignedShort(); // L: 431
			this.sequenceId = var1.readUnsignedShort(); // L: 432
			if (this.sequenceId == 65535) { // L: 433
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 434
			var1.readUnsignedShort(); // L: 435
			if (this.widthAlignment != 0) { // L: 436
				this.field3667 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 437
				var1.readUnsignedShort(); // L: 438
			}
		}

		if (this.type == 4) { // L: 441
			this.fontId = var1.readUnsignedShort(); // L: 442
			if (this.fontId == 65535) { // L: 443
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 444
			this.textLineHeight = var1.readUnsignedByte(); // L: 445
			this.textXAlignment = var1.readUnsignedByte(); // L: 446
			this.textYAlignment = var1.readUnsignedByte(); // L: 447
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 448
			this.color = var1.readInt(); // L: 449
		}

		if (this.type == 3) { // L: 451
			this.color = var1.readInt(); // L: 452
			this.fill = var1.readUnsignedByte() == 1; // L: 453
			this.transparencyTop = var1.readUnsignedByte(); // L: 454
		}

		if (this.type == 9) { // L: 456
			this.lineWid = var1.readUnsignedByte(); // L: 457
			this.color = var1.readInt(); // L: 458
			this.field3658 = var1.readUnsignedByte() == 1; // L: 459
		}

		this.flags = var1.readMedium(); // L: 461
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 462
		int var2 = var1.readUnsignedByte(); // L: 463
		if (var2 > 0) { // L: 464
			this.actions = new String[var2]; // L: 465

			for (int var3 = 0; var3 < var2; ++var3) { // L: 466
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 468
		this.dragThreshold = var1.readUnsignedByte(); // L: 469
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 470
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 471
		this.onLoad = this.readListener(var1); // L: 472
		this.onMouseOver = this.readListener(var1); // L: 473
		this.onMouseLeave = this.readListener(var1); // L: 474
		this.onTargetLeave = this.readListener(var1); // L: 475
		this.onTargetEnter = this.readListener(var1); // L: 476
		this.onVarTransmit = this.readListener(var1); // L: 477
		this.onInvTransmit = this.readListener(var1); // L: 478
		this.onStatTransmit = this.readListener(var1); // L: 479
		this.onTimer = this.readListener(var1); // L: 480
		this.onOp = this.readListener(var1); // L: 481
		this.onMouseRepeat = this.readListener(var1); // L: 482
		this.onClick = this.readListener(var1); // L: 483
		this.onClickRepeat = this.readListener(var1); // L: 484
		this.onRelease = this.readListener(var1); // L: 485
		this.onHold = this.readListener(var1); // L: 486
		this.onDrag = this.readListener(var1); // L: 487
		this.onDragComplete = this.readListener(var1); // L: 488
		this.onScroll = this.readListener(var1); // L: 489
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 490
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 491
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 492
	} // L: 493

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)[Ljava/lang/Object;",
		garbageValue = "399481851"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 496
		if (var2 == 0) { // L: 497
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 498

			for (int var4 = 0; var4 < var2; ++var4) { // L: 499
				int var5 = var1.readUnsignedByte(); // L: 500
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 501
				} else if (var5 == 1) { // L: 502
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 504
			return var3; // L: 505
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)[I",
		garbageValue = "-1822709459"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 509
		if (var2 == 0) { // L: 510
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 511

			for (int var4 = 0; var4 < var2; ++var4) { // L: 512
				var3[var4] = var1.readInt(); // L: 513
			}

			return var3; // L: 515
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZLea;I)Ltm;",
		garbageValue = "-1389466695"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3600 = false; // L: 519
		if (this.field3693 != null) { // L: 520
			SpritePixels var3 = this.method6354(var2); // L: 521
			if (var3 != null) { // L: 522
				return var3; // L: 523
			}
		}

		int var7;
		if (var1) { // L: 527
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2; // L: 528
		}

		if (var7 == -1) { // L: 529
			return null;
		} else {
			long var4 = ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40); // L: 530
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 531
			if (var6 != null) { // L: 532
				return var6;
			} else {
				var6 = class107.SpriteBuffer_getSprite(MenuAction.Widget_spritesArchive, var7, 0); // L: 533
				if (var6 == null) { // L: 534
					field3600 = true; // L: 535
					return null; // L: 536
				} else {
					this.method6357(var6); // L: 538
					Widget_cachedSprites.put(var6, var4); // L: 539
					return var6; // L: 540
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lea;B)Ltm;",
		garbageValue = "10"
	)
	SpritePixels method6354(UrlRequester var1) {
		if (!this.method6356()) { // L: 544
			return this.method6438(var1); // L: 545
		} else {
			String var2 = this.field3693 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 547
			SpritePixels var3 = (SpritePixels)field3633.method7714(var2); // L: 548
			if (var3 == null) { // L: 549
				SpritePixels var4 = this.method6438(var1); // L: 550
				if (var4 != null) { // L: 551
					var3 = var4.method9394(); // L: 552
					this.method6357(var3); // L: 553
					field3633.method7696(var2, var3); // L: 554
				}
			}

			return var3; // L: 557
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)Ltm;",
		garbageValue = "69187803"
	)
	SpritePixels method6438(UrlRequester var1) {
		if (this.field3693 != null && var1 != null) { // L: 561
			class324 var2 = (class324)field3598.method7714(this.field3693); // L: 562
			if (var2 == null) { // L: 563
				var2 = new class324(this.field3693, var1); // L: 564
				field3598.method7696(this.field3693, var2); // L: 565
			}

			return var2.method6005(); // L: 567
		} else {
			return null; // L: 569
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1715273921"
	)
	boolean method6356() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 573
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-3"
	)
	void method6357(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 577
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 578
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 579
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 580
			var1.outline(1);
		}

		if (this.outline >= 2) { // L: 581
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 582
			var1.shadow(this.spriteShadow);
		}

	} // L: 583

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lph;",
		garbageValue = "821843286"
	)
	@Export("getFont")
	public Font getFont() {
		field3600 = false; // L: 586
		if (this.fontId == -1) { // L: 587
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 588
			if (var1 != null) { // L: 589
				return var1;
			} else {
				var1 = Bounds.method8030(MenuAction.Widget_spritesArchive, class13.Widget_fontsArchive, this.fontId, 0); // L: 590
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 591
				} else {
					field3600 = true; // L: 592
				}

				return var1; // L: 593
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lhy;IZLmk;Lhd;Lhs;B)Ljd;",
		garbageValue = "1"
	)
	public Model method6379(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, class193 var6) {
		field3600 = false; // L: 597
		int var7;
		int var8;
		if (var3) { // L: 600
			var7 = this.field3648; // L: 601
			var8 = this.field3649; // L: 602
		} else {
			var7 = this.modelType; // L: 605
			var8 = this.modelId; // L: 606
		}

		if (var7 == 6) { // L: 608
			if (var5 == null) { // L: 609
				return null;
			}

			var8 = var5.id; // L: 610
		}

		if (var7 == 0) { // L: 612
			return null;
		} else if (var7 == 1 && var8 == -1) { // L: 613
			return null;
		} else {
			if (var6 != null && var6.field1990 && var7 == 6) { // L: 614
				var7 = 3; // L: 615
			}

			long var9 = (long)(var8 + (var7 << 16)); // L: 617
			if (var6 != null) { // L: 618
				var9 |= var6.field1989 << 20;
			}

			Model var11 = (Model)Widget_cachedModels.get(var9); // L: 619
			if (var11 == null) { // L: 620
				ModelData var12 = null; // L: 621
				int var13 = 64; // L: 622
				int var14 = 768; // L: 623
				switch(var7) { // L: 624
				case 1:
					var12 = ModelData.ModelData_get(class309.field3453, var8, 0); // L: 626
					break;
				case 2:
					var12 = Bounds.getNpcDefinition(var8).method3692((class193)null); // L: 641
					break;
				case 3:
					var12 = var4 != null ? var4.getModelData() : null; // L: 629
					break; // L: 630
				case 4:
					ItemComposition var15 = class300.ItemComposition_get(var8); // L: 632
					var12 = var15.getModelData(10); // L: 633
					var13 += var15.field2238; // L: 634
					var14 += var15.field2239; // L: 635
				case 5:
				default:
					break;
				case 6:
					var12 = Bounds.getNpcDefinition(var8).method3692(var6); // L: 638
				}

				if (var12 == null) { // L: 644
					field3600 = true; // L: 645
					return null; // L: 646
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50); // L: 648
				Widget_cachedModels.put(var11, var9); // L: 649
			}

			if (var1 != null) { // L: 651
				var11 = var1.transformWidgetModel(var11, var2); // L: 652
			}

			return var11; // L: 654
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lmc;",
		garbageValue = "78"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 658
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2; // L: 659
		if (var2 == -1) { // L: 660
			return null;
		} else {
			long var3 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 661
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 662
			if (var5 != null) { // L: 663
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 664
				if (var6 == null) { // L: 665
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 666
					int[] var8 = new int[var7.subHeight]; // L: 667
					int[] var9 = new int[var7.subHeight]; // L: 668

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 669
						int var11 = 0; // L: 670
						int var12 = var7.subWidth; // L: 671

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 672
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 673
								var11 = var13; // L: 674
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 678
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 679
								var12 = var13 + 1; // L: 680
								break;
							}
						}

						var8[var10] = var11; // L: 684
						var9[var10] = var12 - var11; // L: 685
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 687
					Widget_cachedSpriteMasks.put(var5, var3); // L: 688
					return var5; // L: 689
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 700
			String[] var3 = new String[var1 + 1]; // L: 701
			if (this.actions != null) { // L: 702
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 703
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 705
		}

		this.actions[var1] = var2; // L: 707
	} // L: 708

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-777535745"
	)
	public boolean method6456() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 711
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1178243183"
	)
	public boolean method6363() {
		return this.type == 11 || this.type == 12; // L: 715
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;J)V"
	)
	public void method6386(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) { // L: 719
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 720
			this.field3692 = new class169(); // L: 721
			if (!this.field3692.method3403(var1, var2)) { // L: 722
				this.field3692 = null; // L: 723
			} else {
				if (this.field3707 == null || this.field3674 == null) { // L: 726
					this.method6366(); // L: 727
				}

			}
		}
	} // L: 724 729

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;S)V",
		garbageValue = "24161"
	)
	public void method6365(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) { // L: 732
			this.field3692 = new class169(); // L: 733
			this.field3692.method3452(var1, var2); // L: 734
		}
	} // L: 735

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	void method6366() {
		this.field3707 = new HashMap(); // L: 738
		this.field3674 = new HashMap(); // L: 739
	} // L: 740

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2068642484"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		if (this.type == 11) { // L: 743
			if (this.field3707 == null) { // L: 744
				this.method6366();
			}

			this.field3707.put(var1, var2); // L: 745
		}
	} // L: 746

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1088050959"
	)
	public void method6368(String var1, int var2) {
		if (this.type == 11) { // L: 749
			if (this.field3674 == null) { // L: 750
				this.method6366();
			}

			this.field3674.put(var1, var2); // L: 751
		}
	} // L: 752

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1747555331"
	)
	public boolean method6369(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3692 != null && this.method6359()) { // L: 755
			var1 -= var3; // L: 756
			var2 -= var4; // L: 757
			int var5 = (int)(this.field3692.method3411()[0] * (float)this.width); // L: 758
			int var6 = (int)(this.field3692.method3411()[1] * (float)this.height); // L: 759
			int var7 = var5 + (int)(this.field3692.method3411()[2] * (float)this.width); // L: 760
			int var8 = var6 + (int)(this.field3692.method3411()[3] * (float)this.height); // L: 761
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 762
		} else {
			return false;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1668828074"
	)
	public boolean method6359() {
		return this.field3689 == 2; // L: 766
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-711592025"
	)
	public int method6371(String var1) {
		return this.type == 11 && this.field3692 != null && this.method6359() ? this.field3692.method3406(var1) : -1; // L: 770 771 773
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "73"
	)
	public String method6372(String var1) {
		return this.type == 11 && this.field3692 != null && this.method6359() ? this.field3692.method3461(var1) : null; // L: 777 778
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "709282331"
	)
	public int method6373() {
		return this.field3674 != null && this.field3674.size() > 0 ? 1 : 0; // L: 782
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "69"
	)
	public int method6374() {
		if (this.type == 11 && this.field3692 != null && this.field3674 != null && !this.field3674.isEmpty()) { // L: 786
			String var1 = this.field3692.method3410(); // L: 787
			return var1 != null && this.field3674.containsKey(this.field3692.method3410()) ? (Integer)this.field3674.get(var1) : -1; // L: 788 789 791
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2125916472"
	)
	public String method6375() {
		if (this.type == 11 && this.field3692 != null) { // L: 795
			String var1 = this.field3692.method3410(); // L: 796
			Iterator var2 = this.field3692.method3444().iterator(); // L: 797

			while (var2.hasNext()) {
				class180 var3 = (class180)var2.next(); // L: 798
				String var4 = String.format("%%%S%%", var3.method3530()); // L: 800
				if (var3.vmethod3531() == 0) { // L: 801
					var1.replaceAll(var4, Integer.toString(var3.vmethod3536())); // L: 802
				} else {
					var1.replaceAll(var4, var3.vmethod3532()); // L: 805
				}
			}

			return var1; // L: 809
		} else {
			return null; // L: 808
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-840348115"
	)
	public int[] method6385() {
		if (this.type == 11 && this.field3692 != null) { // L: 813
			int[] var1 = new int[3]; // L: 814
			int var2 = 0; // L: 815
			Iterator var3 = this.field3692.method3444().iterator(); // L: 816

			while (var3.hasNext()) {
				class180 var4 = (class180)var3.next(); // L: 817
				if (!var4.method3530().equals("user_id")) { // L: 819
					if (var4.vmethod3531() != 0) { // L: 820
						return null; // L: 827
					}

					var1[var2++] = var4.vmethod3536(); // L: 821
					if (var2 > 3) { // L: 822
						return null; // L: 823
					}
				}
			}

			return var1; // L: 832
		} else {
			return null;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)Z",
		garbageValue = "-2135243363"
	)
	public boolean method6377(UrlRequester var1) {
		if (this.type == 11 && this.field3692 != null) { // L: 836
			this.field3692.method3417(var1); // L: 837
			if (this.field3692.method3405() != this.field3689) { // L: 838
				this.field3689 = this.field3692.method3405(); // L: 839
				if (this.field3689 >= 100) { // L: 840
					return true; // L: 841
				}

				if (this.field3689 == 2) { // L: 843
					this.method6378(); // L: 844
					return true; // L: 845
				}
			}

			return false; // L: 848
		} else {
			return false;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-753090979"
	)
	void method6378() {
		this.noClickThrough = true; // L: 869
		ArrayList var1 = this.field3692.method3408(); // L: 870
		ArrayList var2 = this.field3692.method3409(); // L: 871
		int var3 = var1.size() + var2.size(); // L: 872
		this.children = new Widget[var3]; // L: 873
		int var4 = 0; // L: 874

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 875 882
			class175 var6 = (class175)var5.next(); // L: 876
			var7 = class490.method8768(5, this, var4, 0, 0, 0, 0, var6.field1841); // L: 878
			var7.field3693 = var6.field1844.method2833(); // L: 879
			class324 var8 = new class324(var6.field1844); // L: 880
			field3598.method7696(var7.field3693, var8); // L: 881
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 885 893
			class176 var9 = (class176)var5.next(); // L: 886
			var7 = class490.method8768(4, this, var4, 0, 0, 0, 0, var9.field1849); // L: 888
			var7.text = var9.field1848; // L: 889
			var7.fontId = (Integer)this.field3707.get(var9.field1852); // L: 890
			var7.textXAlignment = var9.field1850; // L: 891
			var7.textYAlignment = var9.field1845; // L: 892
		}

	} // L: 896

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-953704093"
	)
	public void method6459() {
		this.field3675 = new class325(); // L: 899

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 900
			this.field3675.field3535.method382(var1, 0); // L: 901
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 903
			this.field3675.field3535.method383(var2, 0); // L: 904
		}

		this.field3675.field3535.method383('\u0080', 0); // L: 906
		this.field3675.field3535.method382(82, 2); // L: 907
		this.field3675.field3535.method382(81, 2); // L: 908
		this.field3675.field3535.method382(86, 2); // L: 909
	} // L: 910

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Lmh;",
		garbageValue = "40455266"
	)
	public class327 method6380() {
		return this.field3675 != null ? this.field3675.field3529 : null; // L: 913
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(S)Lmx;",
		garbageValue = "-16401"
	)
	public class322 method6381() {
		return this.field3675 != null ? this.field3675.field3530 : null; // L: 917
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Lbc;",
		garbageValue = "1764483065"
	)
	public class27 method6382() {
		return this.field3675 != null ? this.field3675.field3535 : null; // L: 921
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lms;",
		garbageValue = "-121385664"
	)
	public class325 method6383() {
		return this.field3675; // L: 925
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lmh;I)Z",
		garbageValue = "8388608"
	)
	boolean method6384(class327 var1) {
		boolean var2 = false; // L: 929
		String var5;
		String var6;
		StringBuilder var7;
		int var8;
		int var9;
		int var10;
		char var11;
		String var12;
		if (this.text != null && !this.text.isEmpty()) { // L: 930
			var6 = this.text; // L: 934
			var7 = new StringBuilder(var6.length()); // L: 936
			var8 = 0; // L: 937
			var9 = -1; // L: 938

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 939
				var11 = var6.charAt(var10); // L: 940
				if (var11 == '<') { // L: 941
					var7.append(var6.substring(var8, var10)); // L: 942
					var9 = var10; // L: 943
				} else if (var11 == '>' && var9 != -1) { // L: 946
					var12 = var6.substring(var9 + 1, var10); // L: 947
					var9 = -1; // L: 948
					if (var12.equals("lt")) { // L: 949
						var7.append("<"); // L: 950
					} else if (var12.equals("gt")) { // L: 952
						var7.append(">"); // L: 953
					} else if (var12.equals("br")) { // L: 955
						var7.append("\n"); // L: 956
					}

					var8 = var10 + 1; // L: 958
				}
			}

			if (var8 < var6.length()) { // L: 961
				var7.append(var6.substring(var8, var6.length())); // L: 962
			}

			var5 = var7.toString(); // L: 964
			var2 |= var1.method6334(var5); // L: 966
			this.text = ""; // L: 967
		}

		if (this.field3666 != null && !this.field3666.isEmpty()) { // L: 969
			var6 = this.field3666; // L: 973
			var7 = new StringBuilder(var6.length()); // L: 975
			var8 = 0; // L: 976
			var9 = -1; // L: 977

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 978
				var11 = var6.charAt(var10); // L: 979
				if (var11 == '<') { // L: 980
					var7.append(var6.substring(var8, var10)); // L: 981
					var9 = var10; // L: 982
				} else if (var11 == '>' && var9 != -1) { // L: 985
					var12 = var6.substring(var9 + 1, var10); // L: 986
					var9 = -1; // L: 987
					if (var12.equals("lt")) { // L: 988
						var7.append("<"); // L: 989
					} else if (var12.equals("gt")) { // L: 991
						var7.append(">"); // L: 992
					} else if (var12.equals("br")) { // L: 994
						var7.append("\n"); // L: 995
					}

					var8 = var10 + 1; // L: 997
				}
			}

			if (var8 < var6.length()) { // L: 1000
				var7.append(var6.substring(var8, var6.length())); // L: 1001
			}

			var5 = var7.toString(); // L: 1003
			var2 |= var1.method6219(var5); // L: 1005
			this.field3666 = ""; // L: 1006
		}

		return var2; // L: 1008
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-275597364"
	)
	public boolean method6429() {
		class327 var1 = this.method6380(); // L: 1012
		if (var1 == null) { // L: 1013
			return false;
		} else {
			boolean var2 = false; // L: 1014
			if (!var1.method6238() && this.fontId != -1) { // L: 1015
				int var3 = var1.method6157(); // L: 1016
				int var4 = var1.method6114(); // L: 1017
				int var5 = var1.method6232(); // L: 1018
				int var6 = var1.method6239(); // L: 1019
				Font var7 = this.getFont(); // L: 1020
				if (var7 != null) { // L: 1021
					var2 |= var1.method6060(var7); // L: 1022
					var2 |= this.method6384(var1); // L: 1023
					var2 |= var1.method6338(var3, var4); // L: 1024
					var2 |= var1.method6080(var5, var6); // L: 1025
				}
			} else if (var1.method6238()) { // L: 1028
				var2 |= this.method6384(var1); // L: 1029
			}

			var1.method6135(); // L: 1031
			return var2; // L: 1032
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfa;",
		garbageValue = "1613415260"
	)
	static class131[] method6508() {
		return new class131[]{class131.field1554, class131.field1540, class131.field1541, class131.field1557, class131.field1543, class131.field1553, class131.field1545, class131.field1546, class131.field1547, class131.field1548, class131.field1542, class131.field1550, class131.field1544, class131.field1552, class131.field1549, class131.field1551, class131.field1555}; // L: 74
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "1"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 125
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "1605418477"
	)
	static String method6509(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12651
		if (Client.gameBuild == 1) { // L: 12652
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12653
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12654
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12655
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12656
			var0 = "local";
		}

		String var3 = ""; // L: 12657
		if (class443.field4710 != null) { // L: 12658
			var3 = "/p=" + class443.field4710;
		}

		String var4 = "runescape.com"; // L: 12659
		return var2 + var0 + "." + var4 + "/l=" + TriBool.clientLanguage + "/a=" + class156.field1726 + var3 + "/"; // L: 12660
	}
}
