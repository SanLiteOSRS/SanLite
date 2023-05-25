import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	static class398 field3568;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	static class398 field3553;
	@ObfuscatedName("bj")
	public static boolean field3567;
	@ObfuscatedName("bn")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1713081171
	)
	@Export("id")
	public int id;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 55577617
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 883712245
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 35076151
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1021339961
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1596536121
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1484444061
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 241981169
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -480604969
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -115015413
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1651158159
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1960603747
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1756076191
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 262951665
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -747355095
	)
	@Export("y")
	public int y;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -794961409
	)
	@Export("width")
	public int width;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1473950221
	)
	@Export("height")
	public int height;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 640195305
	)
	public int field3586;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 276729069
	)
	public int field3587;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 913615679
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("ck")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1469632775
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1223232735
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -773060713
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1273374131
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1409091639
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1449039161
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1614966389
	)
	public int field3596;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1780253209
	)
	public int field3655;
	@ObfuscatedName("cv")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("fillMode")
	public class500 fillMode;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1634279623
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 122284991
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1354778849
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cj")
	public boolean field3603;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -363627527
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1352724779
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cp")
	public String field3606;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -738051099
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("dm")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 1638912775
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -353676735
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("do")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("di")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -123768459
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -168077555
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1761517389
	)
	int field3615;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -3148259
	)
	int field3616;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -1526544909
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -717228843
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1909456039
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 844501061
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 797932055
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -480949115
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1023931993
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 942674363
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -289037969
	)
	public int field3625;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -238796869
	)
	public int field3626;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public PlayerComposition field3584;
	@ObfuscatedName("dj")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dx")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -1681772717
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1065036825
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("ds")
	@Export("text")
	public String text;
	@ObfuscatedName("da")
	public String field3633;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = -931338759
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = 1002257489
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -1553957401
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("et")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	class166 field3554;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 1888225603
	)
	int field3639;
	@ObfuscatedName("ej")
	HashMap field3640;
	@ObfuscatedName("ea")
	HashMap field3641;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	class312 field3642;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 1652991301
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("el")
	public boolean field3581;
	@ObfuscatedName("en")
	public byte[][] field3645;
	@ObfuscatedName("er")
	public byte[][] field3646;
	@ObfuscatedName("eg")
	public int[] field3627;
	@ObfuscatedName("ed")
	public int[] field3670;
	@ObfuscatedName("eh")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ek")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = 154898553
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1849043027
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ee")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("fe")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("fs")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("fi")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("fh")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fl")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fp")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fo")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fx")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fd")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fb")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fn")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fz")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fa")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fy")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fw")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fr")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fv")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fq")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fc")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("ff")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fj")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fg")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fk")
	public Object[] field3677;
	@ObfuscatedName("fm")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ft")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fu")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("gr")
	public Object[] field3681;
	@ObfuscatedName("go")
	public Object[] field3582;
	@ObfuscatedName("gs")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gj")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gg")
	public Object[] field3637;
	@ObfuscatedName("ge")
	public Object[] field3566;
	@ObfuscatedName("ga")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gt")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gu")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gh")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gy")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gd")
	public Object[] field3692;
	@ObfuscatedName("gw")
	public Object[] field3653;
	@ObfuscatedName("gc")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gf")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gm")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -529297769
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gq")
	public String field3698;
	@ObfuscatedName("gk")
	public String field3699;
	@ObfuscatedName("gb")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gp")
	public int[] field3701;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -2006098851
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 1336975799
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 1575517389
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 1438245367
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "[Lmq;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("hw")
	public boolean field3671;
	@ObfuscatedName("hi")
	public boolean field3662;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = -288310997
	)
	public int field3709;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = -1285197923
	)
	public int field3560;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -320567063
	)
	public int field3711;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 610184185
	)
	public int field3700;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 372799529
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = -1197721959
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hs")
	public int[] field3643;
	@ObfuscatedName("hn")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hl")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hh")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 60
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 61
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 62
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 63
		field3568 = new class398(10, class396.field4532); // L: 64
		field3553 = new class398(10, class396.field4532); // L: 65
		field3567 = false; // L: 66
	}

	public Widget() {
		this.isIf3 = false; // L: 67
		this.id = -1; // L: 68
		this.childIndex = -1; // L: 69
		this.buttonType = 0; // L: 71
		this.contentType = 0; // L: 72
		this.xAlignment = 0; // L: 73
		this.yAlignment = 0; // L: 74
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
		this.field3586 = 1; // L: 85
		this.field3587 = 1; // L: 86
		this.parentId = -1; // L: 87
		this.isHidden = false; // L: 88
		this.scrollX = 0; // L: 89
		this.scrollY = 0; // L: 90
		this.scrollWidth = 0; // L: 91
		this.scrollHeight = 0; // L: 92
		this.color = 0; // L: 93
		this.color2 = 0; // L: 94
		this.field3596 = 0; // L: 95
		this.field3655 = 0; // L: 96
		this.fill = false; // L: 97
		this.fillMode = class500.SOLID; // L: 98
		this.transparencyTop = 0; // L: 99
		this.transparencyBot = 0; // L: 100
		this.lineWid = 1; // L: 101
		this.field3603 = false; // L: 102
		this.spriteId2 = -1; // L: 103
		this.spriteId = -1; // L: 104
		this.spriteAngle = 0; // L: 106
		this.spriteTiling = false; // L: 107
		this.outline = 0; // L: 108
		this.spriteShadow = 0; // L: 109
		this.modelType = 1; // L: 112
		this.modelId = -1; // L: 113
		this.field3615 = 1; // L: 114
		this.field3616 = -1; // L: 115
		this.sequenceId = -1; // L: 116
		this.sequenceId2 = -1; // L: 117
		this.modelOffsetX = 0; // L: 118
		this.modelOffsetY = 0; // L: 119
		this.modelAngleX = 0; // L: 120
		this.modelAngleY = 0; // L: 121
		this.modelAngleZ = 0; // L: 122
		this.modelZoom = 100; // L: 123
		this.field3625 = 0; // L: 124
		this.field3626 = 0; // L: 125
		this.modelOrthog = false; // L: 127
		this.modelTransparency = false; // L: 128
		this.itemQuantityMode = 2; // L: 129
		this.fontId = -1; // L: 130
		this.text = ""; // L: 131
		this.field3633 = ""; // L: 132
		this.textLineHeight = 0; // L: 133
		this.textXAlignment = 0; // L: 134
		this.textYAlignment = 0; // L: 135
		this.textShadowed = false; // L: 136
		this.field3639 = -1; // L: 138
		this.flags = 0; // L: 143
		this.field3581 = false; // L: 144
		this.dataText = ""; // L: 153
		this.parent = null; // L: 155
		this.dragZoneSize = 0; // L: 156
		this.dragThreshold = 0; // L: 157
		this.isScrollBar = false; // L: 158
		this.spellActionName = ""; // L: 159
		this.hasListener = false; // L: 160
		this.mouseOverRedirect = -1; // L: 201
		this.field3698 = ""; // L: 202
		this.field3699 = "Ok"; // L: 203
		this.itemId = -1; // L: 206
		this.itemQuantity = 0; // L: 207
		this.modelFrame = 0; // L: 208
		this.modelFrameCycle = 0; // L: 209
		this.field3671 = false; // L: 211
		this.field3662 = false; // L: 212
		this.field3709 = -1; // L: 213
		this.field3560 = 0; // L: 214
		this.field3711 = 0; // L: 215
		this.field3700 = 0; // L: 216
		this.rootIndex = -1; // L: 217
		this.cycle = -1; // L: 218
		this.noClickThrough = false; // L: 220
		this.noScrollThrough = false; // L: 221
		this.prioritizeMenuEntry = false; // L: 222
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1896942489"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 279
		this.type = var1.readUnsignedByte(); // L: 280
		this.buttonType = var1.readUnsignedByte(); // L: 281
		this.contentType = var1.readUnsignedShort(); // L: 282
		this.rawX = var1.readShort(); // L: 283
		this.rawY = var1.readShort(); // L: 284
		this.rawWidth = var1.readUnsignedShort(); // L: 285
		this.rawHeight = var1.readUnsignedShort(); // L: 286
		this.transparencyTop = var1.readUnsignedByte(); // L: 287
		this.parentId = var1.readUnsignedShort(); // L: 288
		if (this.parentId == 65535) { // L: 289
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 290
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 291
		if (this.mouseOverRedirect == 65535) { // L: 292
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 293
		int var3;
		if (var2 > 0) { // L: 294
			this.cs1Comparisons = new int[var2]; // L: 295
			this.cs1ComparisonValues = new int[var2]; // L: 296

			for (var3 = 0; var3 < var2; ++var3) { // L: 297
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 298
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 299
			}
		}

		var3 = var1.readUnsignedByte(); // L: 302
		int var4;
		if (var3 > 0) { // L: 303
			this.cs1Instructions = new int[var3][]; // L: 304

			for (var4 = 0; var4 < var3; ++var4) { // L: 305
				int var5 = var1.readUnsignedShort(); // L: 306
				this.cs1Instructions[var4] = new int[var5]; // L: 307

				for (int var6 = 0; var6 < var5; ++var6) { // L: 308
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 309
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 310
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 314
			this.scrollHeight = var1.readUnsignedShort(); // L: 315
			this.isHidden = var1.readUnsignedByte() == 1; // L: 316
		}

		if (this.type == 1) { // L: 318
			var1.readUnsignedShort(); // L: 319
			var1.readUnsignedByte(); // L: 320
		}

		if (this.type == 3) { // L: 322
			this.fill = var1.readUnsignedByte() == 1; // L: 323
		}

		if (this.type == 4 || this.type == 1) { // L: 325
			this.textXAlignment = var1.readUnsignedByte(); // L: 326
			this.textYAlignment = var1.readUnsignedByte(); // L: 327
			this.textLineHeight = var1.readUnsignedByte(); // L: 328
			this.fontId = var1.readUnsignedShort(); // L: 329
			if (this.fontId == 65535) { // L: 330
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 331
		}

		if (this.type == 4) { // L: 333
			this.text = var1.readStringCp1252NullTerminated(); // L: 334
			this.field3633 = var1.readStringCp1252NullTerminated(); // L: 335
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 337
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 338
			this.color2 = var1.readInt(); // L: 339
			this.field3596 = var1.readInt(); // L: 340
			this.field3655 = var1.readInt(); // L: 341
		}

		if (this.type == 5) { // L: 343
			this.spriteId2 = var1.readInt(); // L: 344
			this.spriteId = var1.readInt(); // L: 345
		}

		if (this.type == 6) { // L: 347
			this.modelType = 1; // L: 348
			this.modelId = var1.readUnsignedShort(); // L: 349
			if (this.modelId == 65535) { // L: 350
				this.modelId = -1;
			}

			this.field3615 = 1; // L: 351
			this.field3616 = var1.readUnsignedShort(); // L: 352
			if (this.field3616 == 65535) { // L: 353
				this.field3616 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 354
			if (this.sequenceId == 65535) { // L: 355
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 356
			if (this.sequenceId2 == 65535) { // L: 357
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 358
			this.modelAngleX = var1.readUnsignedShort(); // L: 359
			this.modelAngleY = var1.readUnsignedShort(); // L: 360
		}

		if (this.type == 8) { // L: 362
			this.text = var1.readStringCp1252NullTerminated(); // L: 363
		}

		if (this.buttonType == 2) { // L: 365
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 366
			this.field3698 = var1.readStringCp1252NullTerminated(); // L: 367
			var4 = var1.readUnsignedShort() & 63; // L: 368
			this.flags |= var4 << 11; // L: 369
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 371
			this.field3699 = var1.readStringCp1252NullTerminated(); // L: 372
			if (this.field3699.length() == 0) { // L: 373
				if (this.buttonType == 1) { // L: 374
					this.field3699 = "Ok";
				}

				if (this.buttonType == 4) { // L: 375
					this.field3699 = "Select";
				}

				if (this.buttonType == 5) { // L: 376
					this.field3699 = "Select";
				}

				if (this.buttonType == 6) { // L: 377
					this.field3699 = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 380
			this.flags |= 4194304; // L: 381
		}

		if (this.buttonType == 6) { // L: 383
			this.flags |= 1; // L: 384
		}

	} // L: 386

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "604095410"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 389
		this.isIf3 = true; // L: 390
		this.type = var1.readUnsignedByte(); // L: 391
		this.contentType = var1.readUnsignedShort(); // L: 392
		this.rawX = var1.readShort(); // L: 393
		this.rawY = var1.readShort(); // L: 394
		this.rawWidth = var1.readUnsignedShort(); // L: 395
		if (this.type == 9) { // L: 396
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 397
		}

		this.widthAlignment = var1.readByte(); // L: 398
		this.heightAlignment = var1.readByte(); // L: 399
		this.xAlignment = var1.readByte(); // L: 400
		this.yAlignment = var1.readByte(); // L: 401
		this.parentId = var1.readUnsignedShort(); // L: 402
		if (this.parentId == 65535) { // L: 403
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 404
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 405
		if (this.type == 0) { // L: 406
			this.scrollWidth = var1.readUnsignedShort(); // L: 407
			this.scrollHeight = var1.readUnsignedShort(); // L: 408
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 409
		}

		if (this.type == 5) { // L: 411
			this.spriteId2 = var1.readInt(); // L: 412
			this.spriteAngle = var1.readUnsignedShort(); // L: 413
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 414
			this.transparencyTop = var1.readUnsignedByte(); // L: 415
			this.outline = var1.readUnsignedByte(); // L: 416
			this.spriteShadow = var1.readInt(); // L: 417
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 418
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 419
		}

		if (this.type == 6) { // L: 421
			this.modelType = 1; // L: 422
			this.modelId = var1.readUnsignedShort(); // L: 423
			if (this.modelId == 65535) { // L: 424
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 425
			this.modelOffsetY = var1.readShort(); // L: 426
			this.modelAngleX = var1.readUnsignedShort(); // L: 427
			this.modelAngleY = var1.readUnsignedShort(); // L: 428
			this.modelAngleZ = var1.readUnsignedShort(); // L: 429
			this.modelZoom = var1.readUnsignedShort(); // L: 430
			this.sequenceId = var1.readUnsignedShort(); // L: 431
			if (this.sequenceId == 65535) { // L: 432
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 433
			var1.readUnsignedShort(); // L: 434
			if (this.widthAlignment != 0) { // L: 435
				this.field3625 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 436
				var1.readUnsignedShort(); // L: 437
			}
		}

		if (this.type == 4) { // L: 440
			this.fontId = var1.readUnsignedShort(); // L: 441
			if (this.fontId == 65535) { // L: 442
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 443
			this.textLineHeight = var1.readUnsignedByte(); // L: 444
			this.textXAlignment = var1.readUnsignedByte(); // L: 445
			this.textYAlignment = var1.readUnsignedByte(); // L: 446
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 447
			this.color = var1.readInt(); // L: 448
		}

		if (this.type == 3) { // L: 450
			this.color = var1.readInt(); // L: 451
			this.fill = var1.readUnsignedByte() == 1; // L: 452
			this.transparencyTop = var1.readUnsignedByte(); // L: 453
		}

		if (this.type == 9) { // L: 455
			this.lineWid = var1.readUnsignedByte(); // L: 456
			this.color = var1.readInt(); // L: 457
			this.field3603 = var1.readUnsignedByte() == 1; // L: 458
		}

		this.flags = var1.readMedium(); // L: 460
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 461
		int var2 = var1.readUnsignedByte(); // L: 462
		if (var2 > 0) { // L: 463
			this.actions = new String[var2]; // L: 464

			for (int var3 = 0; var3 < var2; ++var3) { // L: 465
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 467
		this.dragThreshold = var1.readUnsignedByte(); // L: 468
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 469
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 470
		this.onLoad = this.readListener(var1); // L: 471
		this.onMouseOver = this.readListener(var1); // L: 472
		this.onMouseLeave = this.readListener(var1); // L: 473
		this.onTargetLeave = this.readListener(var1); // L: 474
		this.onTargetEnter = this.readListener(var1); // L: 475
		this.onVarTransmit = this.readListener(var1); // L: 476
		this.onInvTransmit = this.readListener(var1); // L: 477
		this.onStatTransmit = this.readListener(var1); // L: 478
		this.onTimer = this.readListener(var1); // L: 479
		this.onOp = this.readListener(var1); // L: 480
		this.onMouseRepeat = this.readListener(var1); // L: 481
		this.onClick = this.readListener(var1); // L: 482
		this.onClickRepeat = this.readListener(var1); // L: 483
		this.onRelease = this.readListener(var1); // L: 484
		this.onHold = this.readListener(var1); // L: 485
		this.onDrag = this.readListener(var1); // L: 486
		this.onDragComplete = this.readListener(var1); // L: 487
		this.onScroll = this.readListener(var1); // L: 488
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 489
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 490
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 491
	} // L: 492

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)[Ljava/lang/Object;",
		garbageValue = "-1943743675"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 495
		if (var2 == 0) { // L: 496
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 497

			for (int var4 = 0; var4 < var2; ++var4) { // L: 498
				int var5 = var1.readUnsignedByte(); // L: 499
				if (var5 == 0) { // L: 500
					var3[var4] = new Integer(var1.readInt());
				} else if (var5 == 1) { // L: 501
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 503
			return var3; // L: 504
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)[I",
		garbageValue = "1664985017"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 508
		if (var2 == 0) { // L: 509
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 510

			for (int var4 = 0; var4 < var2; ++var4) { // L: 511
				var3[var4] = var1.readInt(); // L: 512
			}

			return var3; // L: 514
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZLet;B)Ltq;",
		garbageValue = "0"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3567 = false; // L: 518
		if (this.field3606 != null) { // L: 519
			SpritePixels var3 = this.method6493(var2); // L: 520
			if (var3 != null) { // L: 521
				return var3; // L: 522
			}
		}

		int var7;
		if (var1) { // L: 526
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2; // L: 527
		}

		if (var7 == -1) { // L: 528
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 529
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 530
			if (var6 != null) { // L: 531
				return var6;
			} else {
				var6 = class484.SpriteBuffer_getSprite(ScriptEvent.Widget_spritesArchive, var7, 0); // L: 532
				if (var6 == null) { // L: 533
					field3567 = true; // L: 534
					return null; // L: 535
				} else {
					this.method6369(var6); // L: 537
					Widget_cachedSprites.put(var6, var4); // L: 538
					return var6; // L: 539
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Let;B)Ltq;",
		garbageValue = "42"
	)
	SpritePixels method6493(UrlRequester var1) {
		if (!this.method6368()) { // L: 543
			return this.method6486(var1); // L: 544
		} else {
			String var2 = this.field3606 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 546
			SpritePixels var3 = (SpritePixels)field3553.method7718(var2); // L: 547
			if (var3 == null) { // L: 548
				SpritePixels var4 = this.method6486(var1); // L: 549
				if (var4 != null) { // L: 550
					var3 = var4.method9504(); // L: 551
					this.method6369(var3); // L: 552
					field3553.method7699(var2, var3); // L: 553
				}
			}

			return var3; // L: 556
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Let;B)Ltq;",
		garbageValue = "1"
	)
	SpritePixels method6486(UrlRequester var1) {
		if (this.field3606 != null && var1 != null) { // L: 560
			class311 var2 = (class311)field3568.method7718(this.field3606); // L: 561
			if (var2 == null) { // L: 562
				var2 = new class311(this.field3606, var1); // L: 563
				field3568.method7699(this.field3606, var2); // L: 564
			}

			return var2.method6032(); // L: 566
		} else {
			return null; // L: 568
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-32"
	)
	boolean method6368() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 572
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltq;I)V",
		garbageValue = "-2012216835"
	)
	void method6369(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 576
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 577
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 578
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 579
			var1.outline(1);
		}

		if (this.outline >= 2) { // L: 580
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 581
			var1.shadow(this.spriteShadow);
		}

	} // L: 582

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lon;",
		garbageValue = "-1026608542"
	)
	@Export("getFont")
	public Font getFont() {
		field3567 = false; // L: 585
		if (this.fontId == -1) { // L: 586
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 587
			if (var1 != null) { // L: 588
				return var1;
			} else {
				AbstractArchive var3 = ScriptEvent.Widget_spritesArchive; // L: 590
				AbstractArchive var4 = class146.Widget_fontsArchive; // L: 591
				int var5 = this.fontId; // L: 592
				byte[] var7 = var3.takeFile(var5, 0); // L: 596
				boolean var6;
				if (var7 == null) { // L: 597
					var6 = false; // L: 598
				} else {
					class485.SpriteBuffer_decode(var7); // L: 601
					var6 = true; // L: 602
				}

				Font var2;
				if (!var6) { // L: 604
					var2 = null; // L: 605
				} else {
					byte[] var8 = var4.takeFile(var5, 0); // L: 609
					Font var10;
					if (var8 == null) { // L: 611
						var10 = null; // L: 612
					} else {
						Font var9 = new Font(var8, class503.SpriteBuffer_xOffsets, class17.SpriteBuffer_yOffsets, class97.SpriteBuffer_spriteWidths, class138.SpriteBuffer_spriteHeights, class394.SpriteBuffer_spritePalette, VarbitComposition.SpriteBuffer_pixels); // L: 615
						class398.method7709(); // L: 616
						var10 = var9; // L: 617
					}

					var2 = var10; // L: 619
				}

				if (var2 != null) { // L: 622
					Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field3567 = true; // L: 623
				}

				return var2; // L: 624
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lha;IZLmw;Lhs;Lhv;I)Lit;",
		garbageValue = "764440828"
	)
	public Model method6361(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, class189 var6) {
		field3567 = false; // L: 628
		int var7;
		int var8;
		if (var3) { // L: 631
			var7 = this.field3615; // L: 632
			var8 = this.field3616; // L: 633
		} else {
			var7 = this.modelType; // L: 636
			var8 = this.modelId; // L: 637
		}

		if (var7 == 6) { // L: 639
			if (var5 == null) { // L: 640
				return null;
			}

			var8 = var5.id; // L: 641
		}

		if (var7 == 0) { // L: 643
			return null;
		} else if (var7 == 1 && var8 == -1) { // L: 644
			return null;
		} else {
			if (var6 != null && var6.field2004 && var7 == 6) { // L: 645
				var7 = 3; // L: 646
			}

			long var9 = (long)(var8 + (var7 << 16)); // L: 648
			if (var6 != null) { // L: 649
				var9 |= var6.field2002 << 20;
			}

			Model var11 = (Model)Widget_cachedModels.get(var9); // L: 650
			if (var11 == null) { // L: 651
				ModelData var12 = null; // L: 652
				int var13 = 64; // L: 653
				int var14 = 768; // L: 654
				switch(var7) { // L: 655
				case 1:
					var12 = ModelData.ModelData_get(DynamicObject.field985, var8, 0); // L: 660
					break; // L: 661
				case 2:
					var12 = AbstractArchive.getNpcDefinition(var8).method3770((class189)null); // L: 672
					break;
				case 3:
					var12 = var4 != null ? var4.getModelData() : null; // L: 669
					break;
				case 4:
					ItemComposition var15 = HealthBarUpdate.ItemComposition_get(var8); // L: 663
					var12 = var15.getModelData(10); // L: 664
					var13 += var15.field2257; // L: 665
					var14 += var15.field2258; // L: 666
				case 5:
				default:
					break;
				case 6:
					var12 = AbstractArchive.getNpcDefinition(var8).method3770(var6); // L: 657
				}

				if (var12 == null) { // L: 675
					field3567 = true; // L: 676
					return null; // L: 677
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50); // L: 679
				Widget_cachedModels.put(var11, var9); // L: 680
			}

			if (var1 != null) { // L: 682
				var11 = var1.transformWidgetModel(var11, var2); // L: 683
			}

			return var11; // L: 685
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lll;",
		garbageValue = "29"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 689
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2; // L: 690
		if (var2 == -1) { // L: 691
			return null;
		} else {
			long var3 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var2 + ((long)this.spriteShadow << 40); // L: 692
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 693
			if (var5 != null) { // L: 694
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 695
				if (var6 == null) { // L: 696
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 697
					int[] var8 = new int[var7.subHeight]; // L: 698
					int[] var9 = new int[var7.subHeight]; // L: 699

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 700
						int var11 = 0; // L: 701
						int var12 = var7.subWidth; // L: 702

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 703
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 704
								var11 = var13; // L: 705
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 709
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 710
								var12 = var13 + 1; // L: 711
								break;
							}
						}

						var8[var10] = var11; // L: 715
						var9[var10] = var12 - var11; // L: 716
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 718
					Widget_cachedSpriteMasks.put(var5, var3); // L: 719
					return var5; // L: 720
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "2"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 731
			String[] var3 = new String[var1 + 1]; // L: 732
			if (this.actions != null) { // L: 733
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 734
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 736
		}

		this.actions[var1] = var2; // L: 738
	} // L: 739

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2144772982"
	)
	public boolean method6374() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 742
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "799063438"
	)
	public boolean method6383() {
		return this.type == 11 || this.type == 12; // L: 746
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Let;J)V"
	)
	public void method6376(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && -1L != var3) { // L: 750
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 751
			this.field3554 = new class166(); // L: 752
			if (!this.field3554.method3482(var1, var2)) { // L: 753
				this.field3554 = null; // L: 754
			} else {
				if (this.field3640 == null || this.field3641 == null) { // L: 757
					this.method6445(); // L: 758
				}

			}
		}
	} // L: 755 760

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Let;I)V",
		garbageValue = "554088678"
	)
	public void method6375(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) { // L: 763
			this.field3554 = new class166(); // L: 764
			this.field3554.method3500(var1, var2); // L: 765
		}
	} // L: 766

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	void method6445() {
		this.field3640 = new HashMap(); // L: 769
		this.field3641 = new HashMap(); // L: 770
	} // L: 771

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-108"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		if (this.type == 11) { // L: 774
			if (this.field3640 == null) { // L: 775
				this.method6445();
			}

			this.field3640.put(var1, var2); // L: 776
		}
	} // L: 777

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1150325710"
	)
	public void method6380(String var1, int var2) {
		if (this.type == 11) { // L: 780
			if (this.field3641 == null) { // L: 781
				this.method6445();
			}

			this.field3641.put(var1, var2); // L: 782
		}
	} // L: 783

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "-51"
	)
	public boolean method6381(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3554 != null && this.method6382()) { // L: 786
			var1 -= var3; // L: 787
			var2 -= var4; // L: 788
			int var5 = (int)(this.field3554.method3490()[0] * (float)this.width); // L: 789
			int var6 = (int)(this.field3554.method3490()[1] * (float)this.height); // L: 790
			int var7 = var5 + (int)(this.field3554.method3490()[2] * (float)this.width); // L: 791
			int var8 = var6 + (int)(this.field3554.method3490()[3] * (float)this.height); // L: 792
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 793
		} else {
			return false;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1778717342"
	)
	public boolean method6382() {
		return this.field3639 == 2; // L: 797
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "434397306"
	)
	public int method6378(String var1) {
		return this.type == 11 && this.field3554 != null && this.method6382() ? this.field3554.method3494(var1) : -1; // L: 801 802 804
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "206473711"
	)
	public String method6384(String var1) {
		return this.type == 11 && this.field3554 != null && this.method6382() ? this.field3554.method3486(var1) : null; // L: 808 809
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "934337314"
	)
	public int method6385() {
		return this.field3641 != null && this.field3641.size() > 0 ? 1 : 0; // L: 813
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1876121307"
	)
	public int method6386() {
		if (this.type == 11 && this.field3554 != null && this.field3641 != null && !this.field3641.isEmpty()) { // L: 817
			String var1 = this.field3554.method3525(); // L: 818
			return var1 != null && this.field3641.containsKey(this.field3554.method3525()) ? (Integer)this.field3641.get(var1) : -1; // L: 819 820 822
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1850533434"
	)
	public String method6503() {
		if (this.type == 11 && this.field3554 != null) { // L: 826
			String var1 = this.field3554.method3525(); // L: 827
			Iterator var2 = this.field3554.method3491().iterator(); // L: 828

			while (var2.hasNext()) {
				class177 var3 = (class177)var2.next(); // L: 829
				String var4 = String.format("%%%S%%", var3.method3606()); // L: 831
				if (var3.vmethod3607() == 0) { // L: 832
					var1.replaceAll(var4, Integer.toString(var3.vmethod3608())); // L: 833
				} else {
					var1.replaceAll(var4, var3.vmethod3616()); // L: 836
				}
			}

			return var1; // L: 840
		} else {
			return null; // L: 839
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "574261316"
	)
	public int[] method6388() {
		if (this.type == 11 && this.field3554 != null) { // L: 844
			int[] var1 = new int[3]; // L: 845
			int var2 = 0; // L: 846
			Iterator var3 = this.field3554.method3491().iterator(); // L: 847

			while (var3.hasNext()) {
				class177 var4 = (class177)var3.next(); // L: 848
				if (!var4.method3606().equals("user_id")) { // L: 850
					if (var4.vmethod3607() != 0) { // L: 851
						return null; // L: 858
					}

					var1[var2++] = var4.vmethod3608(); // L: 852
					if (var2 > 3) { // L: 853
						return null; // L: 854
					}
				}
			}

			return var1; // L: 863
		} else {
			return null;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Let;I)Z",
		garbageValue = "622561639"
	)
	public boolean method6415(UrlRequester var1) {
		if (this.type == 11 && this.field3554 != null) { // L: 867
			this.field3554.method3483(var1); // L: 868
			if (this.field3554.method3484() != this.field3639) { // L: 869
				this.field3639 = this.field3554.method3484(); // L: 870
				if (this.field3639 >= 100) { // L: 871
					return true; // L: 872
				}

				if (this.field3639 == 2) { // L: 874
					this.method6390(); // L: 875
					return true; // L: 876
				}
			}

			return false; // L: 879
		} else {
			return false;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1652307373"
	)
	void method6390() {
		this.noClickThrough = true; // L: 900
		ArrayList var1 = this.field3554.method3489(); // L: 901
		ArrayList var2 = this.field3554.method3542(); // L: 902
		int var3 = var1.size() + var2.size(); // L: 903
		this.children = new Widget[var3]; // L: 904
		int var4 = 0; // L: 905

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 906 913
			class172 var6 = (class172)var5.next(); // L: 907
			var7 = class314.method6354(5, this, var4, 0, 0, 0, 0, var6.field1848); // L: 909
			var7.field3606 = var6.field1849.method2866(); // L: 910
			class311 var8 = new class311(var6.field1849); // L: 911
			field3568.method7699(var7.field3606, var8); // L: 912
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 916 924
			class173 var9 = (class173)var5.next(); // L: 917
			var7 = class314.method6354(4, this, var4, 0, 0, 0, 0, var9.field1856); // L: 919
			var7.text = var9.field1855; // L: 920
			var7.fontId = (Integer)this.field3640.get(var9.field1853); // L: 921
			var7.textXAlignment = var9.field1858; // L: 922
			var7.textYAlignment = var9.field1859; // L: 923
		}

	} // L: 927

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method6391() {
		this.field3642 = new class312(); // L: 930

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 931
			this.field3642.field3506.method407(var1, 0); // L: 932
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 934
			this.field3642.field3506.method408(var2, 0); // L: 935
		}

		this.field3642.field3506.method408('\u0080', 0); // L: 937
		this.field3642.field3506.method407(82, 2); // L: 938
		this.field3642.field3506.method407(81, 2); // L: 939
		this.field3642.field3506.method407(86, 2); // L: 940
	} // L: 941

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)Lmz;",
		garbageValue = "-56"
	)
	public class314 method6392() {
		return this.field3642 != null ? this.field3642.field3502 : null; // L: 944
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Llo;",
		garbageValue = "-1740765458"
	)
	public class309 method6394() {
		return this.field3642 != null ? this.field3642.field3501 : null; // L: 948
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Lbb;",
		garbageValue = "1929367879"
	)
	public class27 method6367() {
		return this.field3642 != null ? this.field3642.field3506 : null; // L: 952
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lmt;",
		garbageValue = "-645268928"
	)
	public class312 method6395() {
		return this.field3642; // L: 956
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lmz;B)Z",
		garbageValue = "-12"
	)
	boolean method6393(class314 var1) {
		boolean var2 = false; // L: 960
		String var5;
		String var6;
		StringBuilder var7;
		int var8;
		int var9;
		int var10;
		char var11;
		String var12;
		if (this.text != null && !this.text.isEmpty()) { // L: 961
			var6 = this.text; // L: 965
			var7 = new StringBuilder(var6.length()); // L: 967
			var8 = 0; // L: 968
			var9 = -1; // L: 969

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 970
				var11 = var6.charAt(var10); // L: 971
				if (var11 == '<') { // L: 972
					var7.append(var6.substring(var8, var10)); // L: 973
					var9 = var10; // L: 974
				} else if (var11 == '>' && var9 != -1) { // L: 977
					var12 = var6.substring(var9 + 1, var10); // L: 978
					var9 = -1; // L: 979
					if (var12.equals("lt")) { // L: 980
						var7.append("<"); // L: 981
					} else if (var12.equals("gt")) { // L: 983
						var7.append(">"); // L: 984
					} else if (var12.equals("br")) { // L: 986
						var7.append("\n"); // L: 987
					}

					var8 = var10 + 1; // L: 989
				}
			}

			if (var8 < var6.length()) { // L: 992
				var7.append(var6.substring(var8, var6.length())); // L: 993
			}

			var5 = var7.toString(); // L: 995
			var2 |= var1.method6089(var5); // L: 997
			this.text = ""; // L: 998
		}

		if (this.field3633 != null && !this.field3633.isEmpty()) { // L: 1000
			var6 = this.field3633; // L: 1004
			var7 = new StringBuilder(var6.length()); // L: 1006
			var8 = 0; // L: 1007
			var9 = -1; // L: 1008

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 1009
				var11 = var6.charAt(var10); // L: 1010
				if (var11 == '<') { // L: 1011
					var7.append(var6.substring(var8, var10)); // L: 1012
					var9 = var10; // L: 1013
				} else if (var11 == '>' && var9 != -1) { // L: 1016
					var12 = var6.substring(var9 + 1, var10); // L: 1017
					var9 = -1; // L: 1018
					if (var12.equals("lt")) { // L: 1019
						var7.append("<"); // L: 1020
					} else if (var12.equals("gt")) { // L: 1022
						var7.append(">"); // L: 1023
					} else if (var12.equals("br")) { // L: 1025
						var7.append("\n"); // L: 1026
					}

					var8 = var10 + 1; // L: 1028
				}
			}

			if (var8 < var6.length()) { // L: 1031
				var7.append(var6.substring(var8, var6.length())); // L: 1032
			}

			var5 = var7.toString(); // L: 1034
			var2 |= var1.method6090(var5); // L: 1036
			this.field3633 = ""; // L: 1037
		}

		return var2; // L: 1039
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-85"
	)
	public boolean method6440() {
		class314 var1 = this.method6392(); // L: 1043
		if (var1 == null) { // L: 1044
			return false;
		} else {
			boolean var2 = false; // L: 1045
			if (!var1.method6143() && this.fontId != -1) { // L: 1046
				int var3 = var1.method6200(); // L: 1047
				int var4 = var1.method6299(); // L: 1048
				int var5 = var1.method6142(); // L: 1049
				int var6 = var1.method6141(); // L: 1050
				Font var7 = this.getFont(); // L: 1051
				if (var7 != null) { // L: 1052
					var2 |= var1.method6129(var7); // L: 1053
					var2 |= this.method6393(var1); // L: 1054
					var2 |= var1.method6096(var3, var4); // L: 1055
					var2 |= var1.method6111(var5, var6); // L: 1056
				}
			} else if (var1.method6143()) { // L: 1059
				var2 |= this.method6393(var1); // L: 1060
			}

			var1.method6283(); // L: 1062
			return var2; // L: 1063
		}
	}
}
