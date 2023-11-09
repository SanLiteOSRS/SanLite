import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	static class423 field3623;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	static class423 field3624;
	@ObfuscatedName("ba")
	public static boolean field3769;
	@ObfuscatedName("bu")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 171017691
	)
	@Export("id")
	public int id;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -821265993
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1522224933
	)
	@Export("type")
	public int type;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -212119205
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 515700731
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -611847257
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1687063597
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1604427265
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1486402833
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1670580541
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1709919109
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 630569143
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1329509337
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -94977029
	)
	@Export("x")
	public int x;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 817164401
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 532919505
	)
	@Export("width")
	public int width;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1234310801
	)
	@Export("height")
	public int height;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -304508331
	)
	public int field3644;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1885340721
	)
	public int field3749;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -2053379653
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("cc")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1385161231
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1294831347
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -864507779
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1421816117
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -260644673
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1923646983
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 816690603
	)
	public int field3654;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1530155533
	)
	public int field3655;
	@ObfuscatedName("ce")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	@Export("fillMode")
	public class524 fillMode;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -2025851013
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 320404641
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -33324351
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cr")
	public boolean field3661;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -599848471
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 579905527
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cz")
	public String field3732;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 34791051
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("dr")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -346430849
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1330196543
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("ds")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("dg")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1219573033
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 309263131
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 1957632207
	)
	int field3725;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 967123227
	)
	int field3674;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 633156847
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -176826605
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -558137535
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -576189089
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 567449221
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1359299789
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1571162373
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -530017999
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -2019520833
	)
	public int field3700;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -729096703
	)
	public int field3684;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	public PlayerComposition field3685;
	@ObfuscatedName("dd")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dy")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1031536257
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1723126413
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("db")
	@Export("text")
	public String text;
	@ObfuscatedName("du")
	public String field3771;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -831749849
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -821912403
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 429557379
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("et")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	class171 field3696;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = -1858722371
	)
	int field3697;
	@ObfuscatedName("ex")
	HashMap field3698;
	@ObfuscatedName("eu")
	HashMap field3746;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	class327 field3631;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 202159083
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ee")
	public boolean field3702;
	@ObfuscatedName("eo")
	public byte[][] field3703;
	@ObfuscatedName("ed")
	public byte[][] field3704;
	@ObfuscatedName("ev")
	public int[] field3705;
	@ObfuscatedName("en")
	public int[] field3706;
	@ObfuscatedName("eh")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ey")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -222232487
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1485085945
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("es")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("fp")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("fz")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("fl")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("fj")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fb")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fg")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fm")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fs")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fw")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fe")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fy")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fc")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fr")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fi")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fa")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fo")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fx")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("ft")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fh")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fk")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fu")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("ff")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fv")
	public Object[] field3735;
	@ObfuscatedName("fq")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fd")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fn")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("ga")
	public Object[] field3739;
	@ObfuscatedName("gc")
	public Object[] field3673;
	@ObfuscatedName("gm")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gd")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gi")
	public Object[] field3743;
	@ObfuscatedName("gf")
	public Object[] field3667;
	@ObfuscatedName("ge")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gh")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gb")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gz")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gt")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gn")
	public Object[] field3750;
	@ObfuscatedName("gp")
	public Object[] field3751;
	@ObfuscatedName("gr")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gg")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gq")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 247437447
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gs")
	public String field3756;
	@ObfuscatedName("gx")
	public String field3677;
	@ObfuscatedName("gk")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gu")
	public int[] field3765;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -334200193
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 384628759
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = -765097009
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -1723880353
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "[Lme;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("hn")
	public boolean field3757;
	@ObfuscatedName("hd")
	public boolean field3766;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 701204075
	)
	public int field3767;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -1348159775
	)
	public int field3768;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = -735623499
	)
	public int field3669;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = -1044060783
	)
	public int field3734;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = -1503018449
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 1871151155
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hw")
	public int[] field3773;
	@ObfuscatedName("ha")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hl")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hu")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 60
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 61
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 62
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 63
		field3623 = new class423(10, class421.field4591); // L: 64
		field3624 = new class423(10, class421.field4591); // L: 65
		field3769 = false; // L: 66
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
		this.field3644 = 1; // L: 85
		this.field3749 = 1; // L: 86
		this.parentId = -1; // L: 87
		this.isHidden = false; // L: 88
		this.scrollX = 0; // L: 89
		this.scrollY = 0; // L: 90
		this.scrollWidth = 0; // L: 91
		this.scrollHeight = 0; // L: 92
		this.color = 0; // L: 93
		this.color2 = 0; // L: 94
		this.field3654 = 0; // L: 95
		this.field3655 = 0; // L: 96
		this.fill = false; // L: 97
		this.fillMode = class524.SOLID; // L: 98
		this.transparencyTop = 0; // L: 99
		this.transparencyBot = 0; // L: 100
		this.lineWid = 1; // L: 101
		this.field3661 = false; // L: 102
		this.spriteId2 = -1; // L: 103
		this.spriteId = -1; // L: 104
		this.spriteAngle = 0; // L: 106
		this.spriteTiling = false; // L: 107
		this.outline = 0; // L: 108
		this.spriteShadow = 0; // L: 109
		this.modelType = 1; // L: 112
		this.modelId = -1; // L: 113
		this.field3725 = 1; // L: 114
		this.field3674 = -1; // L: 115
		this.sequenceId = -1; // L: 116
		this.sequenceId2 = -1; // L: 117
		this.modelOffsetX = 0; // L: 118
		this.modelOffsetY = 0; // L: 119
		this.modelAngleX = 0; // L: 120
		this.modelAngleY = 0; // L: 121
		this.modelAngleZ = 0; // L: 122
		this.modelZoom = 100; // L: 123
		this.field3700 = 0; // L: 124
		this.field3684 = 0; // L: 125
		this.modelOrthog = false; // L: 127
		this.modelTransparency = false; // L: 128
		this.itemQuantityMode = 2; // L: 129
		this.fontId = -1; // L: 130
		this.text = ""; // L: 131
		this.field3771 = ""; // L: 132
		this.textLineHeight = 0; // L: 133
		this.textXAlignment = 0; // L: 134
		this.textYAlignment = 0; // L: 135
		this.textShadowed = false; // L: 136
		this.field3697 = -1; // L: 138
		this.flags = 0; // L: 143
		this.field3702 = false; // L: 144
		this.dataText = ""; // L: 153
		this.parent = null; // L: 155
		this.dragZoneSize = 0; // L: 156
		this.dragThreshold = 0; // L: 157
		this.isScrollBar = false; // L: 158
		this.spellActionName = ""; // L: 159
		this.hasListener = false; // L: 160
		this.mouseOverRedirect = -1; // L: 201
		this.field3756 = ""; // L: 202
		this.field3677 = "Ok"; // L: 203
		this.itemId = -1; // L: 206
		this.itemQuantity = 0; // L: 207
		this.modelFrame = 0; // L: 208
		this.modelFrameCycle = 0; // L: 209
		this.field3757 = false; // L: 211
		this.field3766 = false; // L: 212
		this.field3767 = -1; // L: 213
		this.field3768 = 0; // L: 214
		this.field3669 = 0; // L: 215
		this.field3734 = 0; // L: 216
		this.rootIndex = -1; // L: 217
		this.cycle = -1; // L: 218
		this.noClickThrough = false; // L: 220
		this.noScrollThrough = false; // L: 221
		this.prioritizeMenuEntry = false; // L: 222
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-1476360520"
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
			this.field3771 = var1.readStringCp1252NullTerminated(); // L: 335
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 337
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 338
			this.color2 = var1.readInt(); // L: 339
			this.field3654 = var1.readInt(); // L: 340
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

			this.field3725 = 1; // L: 351
			this.field3674 = var1.readUnsignedShort(); // L: 352
			if (this.field3674 == 65535) { // L: 353
				this.field3674 = -1;
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
			this.field3756 = var1.readStringCp1252NullTerminated(); // L: 367
			var4 = var1.readUnsignedShort() & 63; // L: 368
			this.flags |= var4 << 11; // L: 369
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 371
			this.field3677 = var1.readStringCp1252NullTerminated(); // L: 372
			if (this.field3677.length() == 0) { // L: 373
				if (this.buttonType == 1) { // L: 374
					this.field3677 = "Ok";
				}

				if (this.buttonType == 4) { // L: 375
					this.field3677 = "Select";
				}

				if (this.buttonType == 5) { // L: 376
					this.field3677 = "Select";
				}

				if (this.buttonType == 6) { // L: 377
					this.field3677 = "Continue";
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "1861043499"
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
				this.field3700 = var1.readUnsignedShort();
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
			this.field3661 = var1.readUnsignedByte() == 1; // L: 458
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)[Ljava/lang/Object;",
		garbageValue = "1760890975"
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
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt()); // L: 500
				} else if (var5 == 1) { // L: 501
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 503
			return var3; // L: 504
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)[I",
		garbageValue = "-2073079933"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZLea;B)Luq;",
		garbageValue = "127"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3769 = false; // L: 518
		if (this.field3732 != null) { // L: 519
			SpritePixels var3 = this.method6542(var2); // L: 520
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
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var7; // L: 529
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 530
			if (var6 != null) { // L: 531
				return var6;
			} else {
				var6 = LoginType.SpriteBuffer_getSprite(SoundSystem.Widget_spritesArchive, var7, 0); // L: 532
				if (var6 == null) { // L: 533
					field3769 = true; // L: 534
					return null; // L: 535
				} else {
					this.method6562(var6); // L: 537
					Widget_cachedSprites.put(var6, var4); // L: 538
					return var6; // L: 539
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)Luq;",
		garbageValue = "-1527478143"
	)
	SpritePixels method6542(UrlRequester var1) {
		if (!this.method6541()) { // L: 543
			return this.method6445(var1); // L: 544
		} else {
			String var2 = this.field3732 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 546
			SpritePixels var3 = (SpritePixels)field3624.method7818(var2); // L: 547
			if (var3 == null) { // L: 548
				SpritePixels var4 = this.method6445(var1); // L: 549
				if (var4 != null) { // L: 550
					var3 = var4.method9615(); // L: 551
					this.method6562(var3); // L: 552
					field3624.method7805(var2, var3); // L: 553
				}
			}

			return var3; // L: 556
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)Luq;",
		garbageValue = "822116987"
	)
	SpritePixels method6445(UrlRequester var1) {
		if (this.field3732 != null && var1 != null) { // L: 560
			class326 var2 = (class326)field3623.method7818(this.field3732); // L: 561
			if (var2 == null) { // L: 562
				var2 = new class326(this.field3732, var1); // L: 563
				field3623.method7805(this.field3732, var2); // L: 564
			}

			return var2.method6125(); // L: 566
		} else {
			return null; // L: 568
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-441230656"
	)
	boolean method6541() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 572
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-878554218"
	)
	void method6562(SpritePixels var1) {
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lpj;",
		garbageValue = "-1488935926"
	)
	@Export("getFont")
	public Font getFont() {
		field3769 = false; // L: 585
		if (this.fontId == -1) { // L: 586
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 587
			if (var1 != null) { // L: 588
				return var1;
			} else {
				var1 = class171.method3558(SoundSystem.Widget_spritesArchive, ItemContainer.Widget_fontsArchive, this.fontId, 0); // L: 589
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 590
				} else {
					field3769 = true; // L: 591
				}

				return var1; // L: 592
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;IZLmm;Lhs;Lhh;I)Ljr;",
		garbageValue = "-31400490"
	)
	public Model method6527(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, class194 var6) {
		field3769 = false; // L: 596
		int var7;
		int var8;
		if (var3) { // L: 599
			var7 = this.field3725; // L: 600
			var8 = this.field3674; // L: 601
		} else {
			var7 = this.modelType; // L: 604
			var8 = this.modelId; // L: 605
		}

		if (var7 == 6) { // L: 607
			if (var5 == null) { // L: 608
				return null;
			}

			var8 = var5.id; // L: 609
		}

		if (var7 == 0) { // L: 611
			return null;
		} else if (var7 == 1 && var8 == -1) { // L: 612
			return null;
		} else {
			if (var6 != null && var6.field2005 && var7 == 6) { // L: 613
				var7 = 3; // L: 614
			}

			long var9 = (long)(var8 + (var7 << 16)); // L: 616
			if (var6 != null) { // L: 617
				var9 |= var6.field2004 << 20;
			}

			Model var11 = (Model)Widget_cachedModels.get(var9); // L: 618
			if (var11 == null) { // L: 619
				ModelData var12 = null; // L: 620
				int var13 = 64; // L: 621
				int var14 = 768; // L: 622
				switch(var7) { // L: 623
				case 1:
					var12 = ModelData.ModelData_get(WorldMapArea.field2908, var8, 0); // L: 640
					break;
				case 2:
					var12 = class144.getNpcDefinition(var8).method3829((class194)null); // L: 637
					break; // L: 638
				case 3:
					var12 = var4 != null ? var4.getModelData() : null; // L: 631
					break; // L: 632
				case 4:
					ItemComposition var15 = class141.ItemComposition_get(var8); // L: 625
					var12 = var15.getModelData(10); // L: 626
					var13 += var15.field2225; // L: 627
					var14 += var15.field2240; // L: 628
				case 5:
				default:
					break;
				case 6:
					var12 = class144.getNpcDefinition(var8).method3829(var6); // L: 634
				}

				if (var12 == null) { // L: 643
					field3769 = true; // L: 644
					return null; // L: 645
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50); // L: 647
				Widget_cachedModels.put(var11, var9); // L: 648
			}

			if (var1 != null) { // L: 650
				var11 = var1.transformWidgetModel(var11, var2); // L: 651
			}

			return var11; // L: 653
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lmo;",
		garbageValue = "-1928553506"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 657
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2; // L: 658
		if (var2 == -1) { // L: 659
			return null;
		} else {
			long var3 = ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var2 + ((long)this.outline << 36) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40); // L: 660
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 661
			if (var5 != null) { // L: 662
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 663
				if (var6 == null) { // L: 664
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 665
					int[] var8 = new int[var7.subHeight]; // L: 666
					int[] var9 = new int[var7.subHeight]; // L: 667

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 668
						int var11 = 0; // L: 669
						int var12 = var7.subWidth; // L: 670

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 671
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 672
								var11 = var13; // L: 673
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 677
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 678
								var12 = var13 + 1; // L: 679
								break;
							}
						}

						var8[var10] = var11; // L: 683
						var9[var10] = var12 - var11; // L: 684
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 686
					Widget_cachedSpriteMasks.put(var5, var3); // L: 687
					return var5; // L: 688
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1673554888"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) { // L: 692
			String[] var3 = new String[var1 + 1]; // L: 693
			if (this.actions != null) { // L: 694
				for (int var4 = 0; var4 < this.actions.length; ++var4) { // L: 695
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3; // L: 697
		}

		this.actions[var1] = var2; // L: 699
	} // L: 700

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-69"
	)
	public boolean method6452() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 703
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "54"
	)
	public boolean method6453() {
		return this.type == 11 || this.type == 12; // L: 707
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;J)V"
	)
	public void method6459(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) { // L: 711
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 712
			this.field3696 = new class171(); // L: 713
			if (!this.field3696.method3488(var1, var2)) { // L: 714
				this.field3696 = null; // L: 715
			} else {
				if (this.field3698 == null || this.field3746 == null) { // L: 718
					this.method6456(); // L: 719
				}

			}
		}
	} // L: 716 721

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;I)V",
		garbageValue = "1776724067"
	)
	public void method6455(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) { // L: 724
			this.field3696 = new class171(); // L: 725
			this.field3696.method3506(var1, var2); // L: 726
		}
	} // L: 727

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	void method6456() {
		this.field3698 = new HashMap(); // L: 730
		this.field3746 = new HashMap(); // L: 731
	} // L: 732

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1605442288"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		if (this.type == 11) { // L: 735
			if (this.field3698 == null) { // L: 736
				this.method6456();
			}

			this.field3698.put(var1, var2); // L: 737
		}
	} // L: 738

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1967105884"
	)
	public void method6458(String var1, int var2) {
		if (this.type == 11) { // L: 741
			if (this.field3746 == null) { // L: 742
				this.method6456();
			}

			this.field3746.put(var1, var2); // L: 743
		}
	} // L: 744

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-627943432"
	)
	public boolean method6481(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3696 != null && this.method6460()) { // L: 747
			var1 -= var3; // L: 748
			var2 -= var4; // L: 749
			int var5 = (int)(this.field3696.method3496()[0] * (float)this.width); // L: 750
			int var6 = (int)(this.field3696.method3496()[1] * (float)this.height); // L: 751
			int var7 = var5 + (int)(this.field3696.method3496()[2] * (float)this.width); // L: 752
			int var8 = var6 + (int)(this.field3696.method3496()[3] * (float)this.height); // L: 753
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 754
		} else {
			return false;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "569586921"
	)
	public boolean method6460() {
		return this.field3697 == 2; // L: 758
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-1"
	)
	public int method6461(String var1) {
		return this.type == 11 && this.field3696 != null && this.method6460() ? this.field3696.method3491(var1) : -1; // L: 762 763 765
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "28"
	)
	public String method6462(String var1) {
		return this.type == 11 && this.field3696 != null && this.method6460() ? this.field3696.method3492(var1) : null; // L: 769 770
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "316435972"
	)
	public int method6463() {
		return this.field3746 != null && this.field3746.size() > 0 ? 1 : 0; // L: 774
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-579813165"
	)
	public int method6464() {
		if (this.type == 11 && this.field3696 != null && this.field3746 != null && !this.field3746.isEmpty()) { // L: 778
			String var1 = this.field3696.method3494(); // L: 779
			return var1 != null && this.field3746.containsKey(this.field3696.method3494()) ? (Integer)this.field3746.get(var1) : -1; // L: 780 781 783
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "977"
	)
	public String method6465() {
		if (this.type == 11 && this.field3696 != null) { // L: 787
			String var1 = this.field3696.method3494(); // L: 788
			Iterator var2 = this.field3696.method3497().iterator(); // L: 789

			while (var2.hasNext()) {
				class182 var3 = (class182)var2.next(); // L: 790
				String var4 = String.format("%%%S%%", var3.method3640()); // L: 792
				if (var3.vmethod3636() == 0) { // L: 793
					var1.replaceAll(var4, Integer.toString(var3.vmethod3633())); // L: 794
				} else {
					var1.replaceAll(var4, var3.vmethod3634()); // L: 797
				}
			}

			return var1; // L: 801
		} else {
			return null; // L: 800
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "163644281"
	)
	public int[] method6533() {
		if (this.type == 11 && this.field3696 != null) { // L: 805
			int[] var1 = new int[3]; // L: 806
			int var2 = 0; // L: 807
			Iterator var3 = this.field3696.method3497().iterator(); // L: 808

			while (var3.hasNext()) {
				class182 var4 = (class182)var3.next(); // L: 809
				if (!var4.method3640().equals("user_id")) { // L: 811
					if (var4.vmethod3636() != 0) { // L: 812
						return null; // L: 819
					}

					var1[var2++] = var4.vmethod3633(); // L: 813
					if (var2 > 3) { // L: 814
						return null; // L: 815
					}
				}
			}

			return var1; // L: 824
		} else {
			return null;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)Z",
		garbageValue = "523006879"
	)
	public boolean method6510(UrlRequester var1) {
		if (this.type == 11 && this.field3696 != null) { // L: 828
			this.field3696.method3489(var1); // L: 829
			if (this.field3696.method3490() != this.field3697) { // L: 830
				this.field3697 = this.field3696.method3490(); // L: 831
				if (this.field3697 >= 100) { // L: 832
					return true; // L: 833
				}

				if (this.field3697 == 2) { // L: 835
					this.method6480(); // L: 836
					return true; // L: 837
				}
			}

			return false; // L: 840
		} else {
			return false;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	void method6480() {
		this.noClickThrough = true; // L: 861
		ArrayList var1 = this.field3696.method3493(); // L: 862
		ArrayList var2 = this.field3696.method3522(); // L: 863
		int var3 = var1.size() + var2.size(); // L: 864
		this.children = new Widget[var3]; // L: 865
		int var4 = 0; // L: 866

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 867 874
			class177 var6 = (class177)var5.next(); // L: 868
			var7 = HealthBarDefinition.method3777(5, this, var4, 0, 0, 0, 0, var6.field1860); // L: 870
			var7.field3732 = var6.field1861.method2912(); // L: 871
			class326 var8 = new class326(var6.field1861); // L: 872
			field3623.method7805(var7.field3732, var8); // L: 873
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 877 885
			class178 var9 = (class178)var5.next(); // L: 878
			var7 = HealthBarDefinition.method3777(4, this, var4, 0, 0, 0, 0, var9.field1867); // L: 880
			var7.text = var9.field1866; // L: 881
			var7.fontId = (Integer)this.field3698.get(var9.field1869); // L: 882
			var7.textXAlignment = var9.field1863; // L: 883
			var7.textYAlignment = var9.field1870; // L: 884
		}

	} // L: 888

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2023667512"
	)
	public void method6469() {
		this.field3631 = new class327(); // L: 891

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 892
			this.field3631.field3551.method445(var1, 0); // L: 893
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 895
			this.field3631.field3551.method415(var2, 0); // L: 896
		}

		this.field3631.field3551.method415('\u0080', 0); // L: 898
		this.field3631.field3551.method445(82, 2); // L: 899
		this.field3631.field3551.method445(81, 2); // L: 900
		this.field3631.field3551.method445(86, 2); // L: 901
	} // L: 902

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)Lmv;",
		garbageValue = "53"
	)
	public class329 method6470() {
		return this.field3631 != null ? this.field3631.field3557 : null; // L: 905
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)Lms;",
		garbageValue = "-14"
	)
	public class324 method6471() {
		return this.field3631 != null ? this.field3631.field3550 : null; // L: 909
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lbt;",
		garbageValue = "101109981"
	)
	public class27 method6472() {
		return this.field3631 != null ? this.field3631.field3551 : null; // L: 913
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)Lmy;",
		garbageValue = "25"
	)
	public class327 method6504() {
		return this.field3631; // L: 917
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lmv;I)Z",
		garbageValue = "-1695325810"
	)
	boolean method6474(class329 var1) {
		boolean var2 = false; // L: 921
		String var5;
		String var6;
		StringBuilder var7;
		int var8;
		int var9;
		int var10;
		char var11;
		String var12;
		if (this.text != null && !this.text.isEmpty()) { // L: 922
			var6 = this.text; // L: 926
			var7 = new StringBuilder(var6.length()); // L: 928
			var8 = 0; // L: 929
			var9 = -1; // L: 930

			for (var10 = 0; var10 < var6.length(); ++var10) { // L: 931
				var11 = var6.charAt(var10); // L: 932
				if (var11 == '<') { // L: 933
					var7.append(var6.substring(var8, var10)); // L: 934
					var9 = var10; // L: 935
				} else if (var11 == '>' && var9 != -1) { // L: 938
					var12 = var6.substring(var9 + 1, var10); // L: 939
					var9 = -1; // L: 940
					if (var12.equals("lt")) { // L: 941
						var7.append("<"); // L: 942
					} else if (var12.equals("gt")) { // L: 944
						var7.append(">"); // L: 945
					} else if (var12.equals("br")) { // L: 947
						var7.append("\n"); // L: 948
					}

					var8 = var10 + 1; // L: 950
				}
			}

			if (var8 < var6.length()) { // L: 953
				var7.append(var6.substring(var8, var6.length())); // L: 954
			}

			var5 = var7.toString(); // L: 956
			var2 |= var1.method6164(var5); // L: 958
			this.text = ""; // L: 959
		}

		if (this.field3771 != null && !this.field3771.isEmpty()) { // L: 961
			var6 = this.field3771; // L: 965
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
			var2 |= var1.method6165(var5); // L: 997
			this.field3771 = ""; // L: 998
		}

		return var2; // L: 1000
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method6475() {
		class329 var1 = this.method6470(); // L: 1004
		if (var1 == null) { // L: 1005
			return false;
		} else {
			boolean var2 = false; // L: 1006
			if (!var1.method6218() && this.fontId != -1) { // L: 1007
				int var3 = var1.method6346(); // L: 1008
				int var4 = var1.method6220(); // L: 1009
				int var5 = var1.method6263(); // L: 1010
				int var6 = var1.method6177(); // L: 1011
				Font var7 = this.getFont(); // L: 1012
				if (var7 != null) { // L: 1013
					var2 |= var1.method6393(var7); // L: 1014
					var2 |= this.method6474(var1); // L: 1015
					var2 |= var1.method6430(var3, var4); // L: 1016
					var2 |= var1.method6186(var5, var6); // L: 1017
				}
			} else if (var1.method6218()) { // L: 1020
				var2 |= this.method6474(var1); // L: 1021
			}

			var1.method6161(); // L: 1023
			return var2; // L: 1024
		}
	}
}
