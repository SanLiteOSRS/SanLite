import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("Widget_cachedSprites")
	public static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("Widget_cachedModels")
	public static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("Widget_cachedFonts")
	public static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static class394 field3569;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static class394 field3544;
	@ObfuscatedName("bz")
	public static boolean field3637;
	@ObfuscatedName("bq")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -672060695
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 79765129
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1163943651
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -730993029
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 762220451
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 158117435
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1675401913
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -633720853
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 509152495
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 177568423
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 225715715
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -404674777
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 404308569
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1508974797
	)
	@Export("x")
	public int x;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1299518913
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1075980981
	)
	@Export("width")
	public int width;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1352771375
	)
	@Export("height")
	public int height;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1816832375
	)
	public int field3667;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1449949959
	)
	public int field3578;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 742017755
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("ce")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 295748227
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 106332253
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1522996103
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 421465179
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1827188191
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1787445373
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 205610567
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 280309355
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cs")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	@Export("fillMode")
	public class489 fillMode;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 680247369
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 992808099
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -645791251
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cw")
	public boolean field3545;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 299140683
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1194330347
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cf")
	public String field3562;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1226859375
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cr")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1307812433
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -271178069
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("dc")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("dp")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -222521187
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1428728835
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1897919539
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1190983495
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1750871359
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 471197057
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -2006458485
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 215840913
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1140560947
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1142912299
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1552954693
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -785602547
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 354295763
	)
	public int field3532;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 382844233
	)
	public int field3582;
	@ObfuscatedName("dm")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dz")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1079272007
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 2072162713
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dy")
	@Export("text")
	public String text;
	@ObfuscatedName("do")
	@Export("text2")
	public String text2;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -1572481489
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -503733121
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 267248853
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ei")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	class167 field3593;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = -2085328037
	)
	int field3543;
	@ObfuscatedName("ep")
	HashMap field3595;
	@ObfuscatedName("eb")
	HashMap field3596;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	class308 field3635;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 931222803
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ef")
	public boolean field3599;
	@ObfuscatedName("et")
	public byte[][] field3575;
	@ObfuscatedName("el")
	public byte[][] field3601;
	@ObfuscatedName("ec")
	public int[] field3583;
	@ObfuscatedName("eg")
	public int[] field3603;
	@ObfuscatedName("eq")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("eh")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 28421931
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 2132042493
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ew")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("eu")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ed")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("fz")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("fr")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fs")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fe")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fl")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fa")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("ft")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("ff")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fb")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fg")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fj")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fv")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fy")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fo")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fk")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fw")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fn")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fc")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fm")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fq")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fh")
	public Object[] field3622;
	@ObfuscatedName("fi")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fu")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fd")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fp")
	public Object[] field3636;
	@ObfuscatedName("fx")
	public Object[] field3541;
	@ObfuscatedName("gm")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gk")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gb")
	public Object[] field3640;
	@ObfuscatedName("go")
	public Object[] field3641;
	@ObfuscatedName("gn")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("ga")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gz")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gu")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gw")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gy")
	public Object[] field3647;
	@ObfuscatedName("gr")
	public Object[] field3648;
	@ObfuscatedName("gs")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("ge")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gl")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 1699698851
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gc")
	public String field3653;
	@ObfuscatedName("gh")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gx")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gg")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -1638206179
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 2137313251
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 142909041
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -524209
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "[Lmy;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gv")
	public boolean field3662;
	@ObfuscatedName("gt")
	public boolean field3663;
	@ObfuscatedName("hb")
	@ObfuscatedGetter(
		intValue = 1847298027
	)
	public int field3623;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = -238745115
	)
	public int field3546;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = -776126625
	)
	public int field3666;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = -100148273
	)
	public int field3594;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = -1197039009
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = 1073738983
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hs")
	public int[] field3670;
	@ObfuscatedName("hg")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("ho")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hj")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 61
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 62
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 63
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 64
		field3569 = new class394(10, class392.field4475); // L: 65
		field3544 = new class394(10, class392.field4475); // L: 66
		field3637 = false; // L: 67
	}

	public Widget() {
		this.isIf3 = false; // L: 68
		this.id = -1; // L: 69
		this.childIndex = -1; // L: 70
		this.buttonType = 0; // L: 72
		this.contentType = 0; // L: 73
		this.xAlignment = 0; // L: 74
		this.yAlignment = 0; // L: 75
		this.widthAlignment = 0; // L: 76
		this.heightAlignment = 0; // L: 77
		this.rawX = 0; // L: 78
		this.rawY = 0; // L: 79
		this.rawWidth = 0; // L: 80
		this.rawHeight = 0; // L: 81
		this.x = 0; // L: 82
		this.y = 0; // L: 83
		this.width = 0; // L: 84
		this.height = 0; // L: 85
		this.field3667 = 1; // L: 86
		this.field3578 = 1; // L: 87
		this.parentId = -1; // L: 88
		this.isHidden = false; // L: 89
		this.scrollX = 0; // L: 90
		this.scrollY = 0; // L: 91
		this.scrollWidth = 0; // L: 92
		this.scrollHeight = 0; // L: 93
		this.color = 0; // L: 94
		this.color2 = 0; // L: 95
		this.mouseOverColor = 0; // L: 96
		this.mouseOverColor2 = 0; // L: 97
		this.fill = false; // L: 98
		this.fillMode = class489.SOLID; // L: 99
		this.transparencyTop = 0; // L: 100
		this.transparencyBot = 0; // L: 101
		this.lineWid = 1; // L: 102
		this.field3545 = false; // L: 103
		this.spriteId2 = -1; // L: 104
		this.spriteId = -1; // L: 105
		this.spriteAngle = 0; // L: 107
		this.spriteTiling = false; // L: 108
		this.outline = 0; // L: 109
		this.spriteShadow = 0; // L: 110
		this.modelType = 1; // L: 113
		this.modelId = -1; // L: 114
		this.modelType2 = 1; // L: 115
		this.modelId2 = -1; // L: 116
		this.sequenceId = -1; // L: 117
		this.sequenceId2 = -1; // L: 118
		this.modelOffsetX = 0; // L: 119
		this.modelOffsetY = 0; // L: 120
		this.modelAngleX = 0; // L: 121
		this.modelAngleY = 0; // L: 122
		this.modelAngleZ = 0; // L: 123
		this.modelZoom = 100; // L: 124
		this.field3532 = 0; // L: 125
		this.field3582 = 0; // L: 126
		this.modelOrthog = false; // L: 127
		this.modelTransparency = false; // L: 128
		this.itemQuantityMode = 2; // L: 129
		this.fontId = -1; // L: 130
		this.text = ""; // L: 131
		this.text2 = ""; // L: 132
		this.textLineHeight = 0; // L: 133
		this.textXAlignment = 0; // L: 134
		this.textYAlignment = 0; // L: 135
		this.textShadowed = false; // L: 136
		this.field3543 = -1; // L: 138
		this.flags = 0; // L: 143
		this.field3599 = false; // L: 144
		this.dataText = ""; // L: 153
		this.parent = null; // L: 155
		this.dragZoneSize = 0; // L: 156
		this.dragThreshold = 0; // L: 157
		this.isScrollBar = false; // L: 158
		this.spellActionName = ""; // L: 159
		this.hasListener = false; // L: 160
		this.mouseOverRedirect = -1; // L: 201
		this.field3653 = ""; // L: 202
		this.buttonText = "Ok"; // L: 203
		this.itemId = -1; // L: 206
		this.itemQuantity = 0; // L: 207
		this.modelFrame = 0; // L: 208
		this.modelFrameCycle = 0; // L: 209
		this.field3662 = false; // L: 211
		this.field3663 = false; // L: 212
		this.field3623 = -1; // L: 213
		this.field3546 = 0; // L: 214
		this.field3666 = 0; // L: 215
		this.field3594 = 0; // L: 216
		this.rootIndex = -1; // L: 217
		this.cycle = -1; // L: 218
		this.noClickThrough = false; // L: 220
		this.noScrollThrough = false; // L: 221
		this.prioritizeMenuEntry = false; // L: 222
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsy;B)V",
		garbageValue = "-16"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false; // L: 289
		this.type = var1.readUnsignedByte(); // L: 290
		this.buttonType = var1.readUnsignedByte(); // L: 291
		this.contentType = var1.readUnsignedShort(); // L: 292
		this.rawX = var1.readShort(); // L: 293
		this.rawY = var1.readShort(); // L: 294
		this.rawWidth = var1.readUnsignedShort(); // L: 295
		this.rawHeight = var1.readUnsignedShort(); // L: 296
		this.transparencyTop = var1.readUnsignedByte(); // L: 297
		this.parentId = var1.readUnsignedShort(); // L: 298
		if (this.parentId == 65535) { // L: 299
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 300
		}

		this.mouseOverRedirect = var1.readUnsignedShort(); // L: 301
		if (this.mouseOverRedirect == 65535) { // L: 302
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte(); // L: 303
		int var3;
		if (var2 > 0) { // L: 304
			this.cs1Comparisons = new int[var2]; // L: 305
			this.cs1ComparisonValues = new int[var2]; // L: 306

			for (var3 = 0; var3 < var2; ++var3) { // L: 307
				this.cs1Comparisons[var3] = var1.readUnsignedByte(); // L: 308
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort(); // L: 309
			}
		}

		var3 = var1.readUnsignedByte(); // L: 312
		int var4;
		if (var3 > 0) { // L: 313
			this.cs1Instructions = new int[var3][]; // L: 314

			for (var4 = 0; var4 < var3; ++var4) { // L: 315
				int var5 = var1.readUnsignedShort(); // L: 316
				this.cs1Instructions[var4] = new int[var5]; // L: 317

				for (int var6 = 0; var6 < var5; ++var6) { // L: 318
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort(); // L: 319
					if (this.cs1Instructions[var4][var6] == 65535) { // L: 320
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) { // L: 324
			this.scrollHeight = var1.readUnsignedShort(); // L: 325
			this.isHidden = var1.readUnsignedByte() == 1; // L: 326
		}

		if (this.type == 1) { // L: 328
			var1.readUnsignedShort(); // L: 329
			var1.readUnsignedByte(); // L: 330
		}

		if (this.type == 3) { // L: 332
			this.fill = var1.readUnsignedByte() == 1; // L: 333
		}

		if (this.type == 4 || this.type == 1) { // L: 335
			this.textXAlignment = var1.readUnsignedByte(); // L: 336
			this.textYAlignment = var1.readUnsignedByte(); // L: 337
			this.textLineHeight = var1.readUnsignedByte(); // L: 338
			this.fontId = var1.readUnsignedShort(); // L: 339
			if (this.fontId == 65535) { // L: 340
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1; // L: 341
		}

		if (this.type == 4) { // L: 343
			this.text = var1.readStringCp1252NullTerminated(); // L: 344
			this.text2 = var1.readStringCp1252NullTerminated(); // L: 345
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 347
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 348
			this.color2 = var1.readInt(); // L: 349
			this.mouseOverColor = var1.readInt(); // L: 350
			this.mouseOverColor2 = var1.readInt(); // L: 351
		}

		if (this.type == 5) { // L: 353
			this.spriteId2 = var1.readInt(); // L: 354
			this.spriteId = var1.readInt(); // L: 355
		}

		if (this.type == 6) { // L: 357
			this.modelType = 1; // L: 358
			this.modelId = var1.readUnsignedShort(); // L: 359
			if (this.modelId == 65535) { // L: 360
				this.modelId = -1;
			}

			this.modelType2 = 1; // L: 361
			this.modelId2 = var1.readUnsignedShort(); // L: 362
			if (this.modelId2 == 65535) { // L: 363
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort(); // L: 364
			if (this.sequenceId == 65535) { // L: 365
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort(); // L: 366
			if (this.sequenceId2 == 65535) { // L: 367
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort(); // L: 368
			this.modelAngleX = var1.readUnsignedShort(); // L: 369
			this.modelAngleY = var1.readUnsignedShort(); // L: 370
		}

		if (this.type == 8) { // L: 372
			this.text = var1.readStringCp1252NullTerminated(); // L: 373
		}

		if (this.buttonType == 2) { // L: 375
			this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 376
			this.field3653 = var1.readStringCp1252NullTerminated(); // L: 377
			var4 = var1.readUnsignedShort() & 63; // L: 378
			this.flags |= var4 << 11; // L: 379
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 381
			this.buttonText = var1.readStringCp1252NullTerminated(); // L: 382
			if (this.buttonText.length() == 0) { // L: 383
				if (this.buttonType == 1) { // L: 384
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) { // L: 385
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) { // L: 386
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) { // L: 387
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) { // L: 390
			this.flags |= 4194304; // L: 391
		}

		if (this.buttonType == 6) { // L: 393
			this.flags |= 1; // L: 394
		}

	} // L: 396

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "566459498"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte(); // L: 399
		this.isIf3 = true; // L: 400
		this.type = var1.readUnsignedByte(); // L: 401
		this.contentType = var1.readUnsignedShort(); // L: 402
		this.rawX = var1.readShort(); // L: 403
		this.rawY = var1.readShort(); // L: 404
		this.rawWidth = var1.readUnsignedShort(); // L: 405
		if (this.type == 9) { // L: 406
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort(); // L: 407
		}

		this.widthAlignment = var1.readByte(); // L: 408
		this.heightAlignment = var1.readByte(); // L: 409
		this.xAlignment = var1.readByte(); // L: 410
		this.yAlignment = var1.readByte(); // L: 411
		this.parentId = var1.readUnsignedShort(); // L: 412
		if (this.parentId == 65535) { // L: 413
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536; // L: 414
		}

		this.isHidden = var1.readUnsignedByte() == 1; // L: 415
		if (this.type == 0) { // L: 416
			this.scrollWidth = var1.readUnsignedShort(); // L: 417
			this.scrollHeight = var1.readUnsignedShort(); // L: 418
			this.noClickThrough = var1.readUnsignedByte() == 1; // L: 419
		}

		if (this.type == 5) { // L: 421
			this.spriteId2 = var1.readInt(); // L: 422
			this.spriteAngle = var1.readUnsignedShort(); // L: 423
			this.spriteTiling = var1.readUnsignedByte() == 1; // L: 424
			this.transparencyTop = var1.readUnsignedByte(); // L: 425
			this.outline = var1.readUnsignedByte(); // L: 426
			this.spriteShadow = var1.readInt(); // L: 427
			this.spriteFlipV = var1.readUnsignedByte() == 1; // L: 428
			this.spriteFlipH = var1.readUnsignedByte() == 1; // L: 429
		}

		if (this.type == 6) { // L: 431
			this.modelType = 1; // L: 432
			this.modelId = var1.readUnsignedShort(); // L: 433
			if (this.modelId == 65535) { // L: 434
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort(); // L: 435
			this.modelOffsetY = var1.readShort(); // L: 436
			this.modelAngleX = var1.readUnsignedShort(); // L: 437
			this.modelAngleY = var1.readUnsignedShort(); // L: 438
			this.modelAngleZ = var1.readUnsignedShort(); // L: 439
			this.modelZoom = var1.readUnsignedShort(); // L: 440
			this.sequenceId = var1.readUnsignedShort(); // L: 441
			if (this.sequenceId == 65535) { // L: 442
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1; // L: 443
			var1.readUnsignedShort(); // L: 444
			if (this.widthAlignment != 0) { // L: 445
				this.field3532 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) { // L: 446
				var1.readUnsignedShort(); // L: 447
			}
		}

		if (this.type == 4) { // L: 450
			this.fontId = var1.readUnsignedShort(); // L: 451
			if (this.fontId == 65535) { // L: 452
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated(); // L: 453
			this.textLineHeight = var1.readUnsignedByte(); // L: 454
			this.textXAlignment = var1.readUnsignedByte(); // L: 455
			this.textYAlignment = var1.readUnsignedByte(); // L: 456
			this.textShadowed = var1.readUnsignedByte() == 1; // L: 457
			this.color = var1.readInt(); // L: 458
		}

		if (this.type == 3) { // L: 460
			this.color = var1.readInt(); // L: 461
			this.fill = var1.readUnsignedByte() == 1; // L: 462
			this.transparencyTop = var1.readUnsignedByte(); // L: 463
		}

		if (this.type == 9) { // L: 465
			this.lineWid = var1.readUnsignedByte(); // L: 466
			this.color = var1.readInt(); // L: 467
			this.field3545 = var1.readUnsignedByte() == 1; // L: 468
		}

		this.flags = var1.readMedium(); // L: 470
		this.dataText = var1.readStringCp1252NullTerminated(); // L: 471
		int var2 = var1.readUnsignedByte(); // L: 472
		if (var2 > 0) { // L: 473
			this.actions = new String[var2]; // L: 474

			for (int var3 = 0; var3 < var2; ++var3) { // L: 475
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte(); // L: 477
		this.dragThreshold = var1.readUnsignedByte(); // L: 478
		this.isScrollBar = var1.readUnsignedByte() == 1; // L: 479
		this.spellActionName = var1.readStringCp1252NullTerminated(); // L: 480
		this.onLoad = this.readListener(var1); // L: 481
		this.onMouseOver = this.readListener(var1); // L: 482
		this.onMouseLeave = this.readListener(var1); // L: 483
		this.onTargetLeave = this.readListener(var1); // L: 484
		this.onTargetEnter = this.readListener(var1); // L: 485
		this.onVarTransmit = this.readListener(var1); // L: 486
		this.onInvTransmit = this.readListener(var1); // L: 487
		this.onStatTransmit = this.readListener(var1); // L: 488
		this.onTimer = this.readListener(var1); // L: 489
		this.onOp = this.readListener(var1); // L: 490
		this.onMouseRepeat = this.readListener(var1); // L: 491
		this.onClick = this.readListener(var1); // L: 492
		this.onClickRepeat = this.readListener(var1); // L: 493
		this.onRelease = this.readListener(var1); // L: 494
		this.onHold = this.readListener(var1); // L: 495
		this.onDrag = this.readListener(var1); // L: 496
		this.onDragComplete = this.readListener(var1); // L: 497
		this.onScroll = this.readListener(var1); // L: 498
		this.varTransmitTriggers = this.readListenerTriggers(var1); // L: 499
		this.invTransmitTriggers = this.readListenerTriggers(var1); // L: 500
		this.statTransmitTriggers = this.readListenerTriggers(var1); // L: 501
	} // L: 502

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)[Ljava/lang/Object;",
		garbageValue = "-1044525330"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 505
		if (var2 == 0) { // L: 506
			return null;
		} else {
			Object[] var3 = new Object[var2]; // L: 507

			for (int var4 = 0; var4 < var2; ++var4) { // L: 508
				int var5 = var1.readUnsignedByte(); // L: 509
				if (var5 == 0) { // L: 510
					var3[var4] = new Integer(var1.readInt());
				} else if (var5 == 1) { // L: 511
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true; // L: 513
			return var3; // L: 514
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsy;B)[I",
		garbageValue = "1"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 518
		if (var2 == 0) { // L: 519
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 520

			for (int var4 = 0; var4 < var2; ++var4) { // L: 521
				var3[var4] = var1.readInt(); // L: 522
			}

			return var3; // L: 524
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZLeb;I)Lsn;",
		garbageValue = "-1331900379"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3637 = false; // L: 528
		if (this.field3562 != null) { // L: 529
			SpritePixels var3 = this.method6093(var2); // L: 530
			if (var3 != null) { // L: 531
				return var3; // L: 532
			}
		}

		int var7;
		if (var1) { // L: 536
			var7 = this.spriteId;
		} else {
			var7 = this.spriteId2; // L: 537
		}

		if (var7 == -1) { // L: 538
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + (long)var7 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 539
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 540
			if (var6 != null) { // L: 541
				return var6;
			} else {
				var6 = WorldMapScaleHandler.SpriteBuffer_getSprite(MusicPatch.Widget_spritesArchive, var7, 0); // L: 542
				if (var6 == null) { // L: 543
					field3637 = true; // L: 544
					return null; // L: 545
				} else {
					this.method6154(var6); // L: 547
					Widget_cachedSprites.put(var6, var4); // L: 548
					return var6; // L: 549
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)Lsn;",
		garbageValue = "344972580"
	)
	SpritePixels method6093(UrlRequester var1) {
		if (!this.method6094()) { // L: 553
			return this.method6088(var1); // L: 554
		} else {
			String var2 = this.field3562 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 556
			SpritePixels var3 = (SpritePixels)field3544.method7414(var2); // L: 557
			if (var3 == null) { // L: 558
				SpritePixels var4 = this.method6088(var1); // L: 559
				if (var4 != null) { // L: 560
					var3 = var4.method9111(); // L: 561
					this.method6154(var3); // L: 562
					field3544.method7427(var2, var3); // L: 563
				}
			}

			return var3; // L: 566
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)Lsn;",
		garbageValue = "781131274"
	)
	SpritePixels method6088(UrlRequester var1) {
		if (this.field3562 != null && var1 != null) { // L: 570
			class307 var2 = (class307)field3569.method7414(this.field3562); // L: 571
			if (var2 == null) { // L: 572
				var2 = new class307(this.field3562, var1); // L: 573
				field3569.method7427(this.field3562, var2); // L: 574
			}

			return var2.method5779(); // L: 576
		} else {
			return null; // L: 578
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	boolean method6094() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 582
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsn;I)V",
		garbageValue = "-1478165586"
	)
	void method6154(SpritePixels var1) {
		if (this.spriteFlipV) { // L: 586
			var1.flipVertically();
		}

		if (this.spriteFlipH) { // L: 587
			var1.flipHorizontally();
		}

		if (this.outline > 0) { // L: 588
			var1.pad(this.outline);
		}

		if (this.outline >= 1) { // L: 589
			var1.outline(1);
		}

		if (this.outline >= 2) { // L: 590
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) { // L: 591
			var1.shadow(this.spriteShadow);
		}

	} // L: 592

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Loe;",
		garbageValue = "920274053"
	)
	@Export("getFont")
	public Font getFont() {
		field3637 = false; // L: 595
		if (this.fontId == -1) { // L: 596
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 597
			if (var1 != null) { // L: 598
				return var1;
			} else {
				AbstractArchive var3 = MusicPatch.Widget_spritesArchive; // L: 600
				AbstractArchive var4 = AbstractWorldMapData.Widget_fontsArchive; // L: 601
				int var5 = this.fontId; // L: 602
				byte[] var7 = var3.takeFile(var5, 0); // L: 606
				boolean var6;
				if (var7 == null) { // L: 607
					var6 = false; // L: 608
				} else {
					class212.SpriteBuffer_decode(var7); // L: 611
					var6 = true; // L: 612
				}

				Font var2;
				if (!var6) { // L: 614
					var2 = null; // L: 615
				} else {
					byte[] var8 = var4.takeFile(var5, 0); // L: 619
					Font var10;
					if (var8 == null) { // L: 621
						var10 = null; // L: 622
					} else {
						Font var9 = new Font(var8, class492.SpriteBuffer_xOffsets, Canvas.SpriteBuffer_yOffsets, InterfaceParent.SpriteBuffer_spriteWidths, class144.SpriteBuffer_spriteHeights, class181.SpriteBuffer_spritePalette, class144.SpriteBuffer_pixels); // L: 625
						FriendsList.method7473(); // L: 626
						var10 = var9; // L: 627
					}

					var2 = var10; // L: 629
				}

				if (var2 != null) { // L: 632
					Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field3637 = true; // L: 633
				}

				return var2; // L: 634
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhx;IZLlc;Lhl;Lhj;I)Lix;",
		garbageValue = "2086184129"
	)
	public Model method6097(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, class191 var6) {
		field3637 = false; // L: 638
		int var7;
		int var8;
		if (var3) { // L: 641
			var7 = this.modelType2; // L: 642
			var8 = this.modelId2; // L: 643
		} else {
			var7 = this.modelType; // L: 646
			var8 = this.modelId; // L: 647
		}

		if (var7 == 6) { // L: 649
			if (var5 == null) { // L: 650
				return null;
			}

			var8 = var5.id; // L: 651
		}

		if (var7 == 0) { // L: 653
			return null;
		} else if (var7 == 1 && var8 == -1) { // L: 654
			return null;
		} else {
			long var9 = (long)(var8 + (var7 << 16)); // L: 655
			if (var6 != null) { // L: 656
				var9 |= var6.field1985 << 20;
			}

			Model var11 = (Model)Widget_cachedModels.get(var9); // L: 657
			if (var11 == null) { // L: 658
				ModelData var12 = null; // L: 659
				int var13 = 64; // L: 660
				int var14 = 768; // L: 661
				switch(var7) { // L: 662
				case 1:
					var12 = ModelData.ModelData_get(class211.Widget_modelsArchive, var8, 0); // L: 667
					break; // L: 668
				case 2:
					var12 = class188.getNpcDefinition(var8).method3670((class191)null); // L: 679
					break;
				case 3:
					var12 = var4 != null ? var4.getModelData() : null; // L: 676
					break; // L: 677
				case 4:
					ItemComposition var15 = ParamComposition.ItemComposition_get(var8); // L: 670
					var12 = var15.getModelData(10); // L: 671
					var13 += var15.field2224; // L: 672
					var14 += var15.field2225; // L: 673
				case 5:
				default:
					break;
				case 6:
					var12 = class188.getNpcDefinition(var8).method3670(var6); // L: 664
				}

				if (var12 == null) { // L: 682
					field3637 = true; // L: 683
					return null; // L: 684
				}

				var11 = var12.toModel(var13, var14, -50, -10, -50); // L: 686
				Widget_cachedModels.put(var11, var9); // L: 687
			}

			if (var1 != null) { // L: 689
				var11 = var1.transformWidgetModel(var11, var2); // L: 690
			}

			return var11; // L: 692
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZS)Llx;",
		garbageValue = "-20402"
	)
	@Export("getSpriteMask")
	public SpriteMask getSpriteMask(boolean var1) {
		if (this.spriteId == -1) { // L: 696
			var1 = false;
		}

		int var2 = var1 ? this.spriteId : this.spriteId2; // L: 697
		if (var2 == -1) { // L: 698
			return null;
		} else {
			long var3 = ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40); // L: 699
			SpriteMask var5 = (SpriteMask)Widget_cachedSpriteMasks.get(var3); // L: 700
			if (var5 != null) { // L: 701
				return var5;
			} else {
				SpritePixels var6 = this.getSprite(var1, (UrlRequester)null); // L: 702
				if (var6 == null) { // L: 703
					return null;
				} else {
					SpritePixels var7 = var6.copyNormalized(); // L: 704
					int[] var8 = new int[var7.subHeight]; // L: 705
					int[] var9 = new int[var7.subHeight]; // L: 706

					for (int var10 = 0; var10 < var7.subHeight; ++var10) { // L: 707
						int var11 = 0; // L: 708
						int var12 = var7.subWidth; // L: 709

						int var13;
						for (var13 = 0; var13 < var7.subWidth; ++var13) { // L: 710
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 711
								var11 = var13; // L: 712
								break;
							}
						}

						for (var13 = var7.subWidth - 1; var13 >= var11; --var13) { // L: 716
							if (var7.pixels[var13 + var10 * var7.subWidth] == 0) { // L: 717
								var12 = var13 + 1; // L: 718
								break;
							}
						}

						var8[var10] = var11; // L: 722
						var9[var10] = var12 - var11; // L: 723
					}

					var5 = new SpriteMask(var7.subWidth, var7.subHeight, var9, var8, var2); // L: 725
					Widget_cachedSpriteMasks.put(var5, var3); // L: 726
					return var5; // L: 727
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1529997098"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-33"
	)
	public boolean method6100() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 742
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1886083146"
	)
	public boolean method6101() {
		return this.type == 11 || this.type == 12; // L: 746
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leb;J)V"
	)
	public void method6136(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) { // L: 750
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 751
			this.field3593 = new class167(); // L: 752
			if (!this.field3593.method3386(var1, var2)) { // L: 753
				this.field3593 = null; // L: 754
			} else {
				if (this.field3595 == null || this.field3596 == null) { // L: 757
					this.method6104(); // L: 758
				}

			}
		}
	} // L: 755 760

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leb;I)V",
		garbageValue = "2051438500"
	)
	public void method6176(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) { // L: 763
			this.field3593 = new class167(); // L: 764
			this.field3593.method3423(var1, var2); // L: 765
		}
	} // L: 766

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1638192290"
	)
	void method6104() {
		this.field3595 = new HashMap(); // L: 769
		this.field3596 = new HashMap(); // L: 770
	} // L: 771

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "868662197"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		if (this.type == 11) { // L: 774
			if (this.field3595 == null) { // L: 775
				this.method6104();
			}

			this.field3595.put(var1, var2); // L: 776
		}
	} // L: 777

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "-36"
	)
	public void method6106(String var1, int var2) {
		if (this.type == 11) { // L: 780
			if (this.field3596 == null) { // L: 781
				this.method6104();
			}

			this.field3596.put(var1, var2); // L: 782
		}
	} // L: 783

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "373427864"
	)
	public boolean method6190(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3593 != null && this.method6191()) { // L: 786
			var1 -= var3; // L: 787
			var2 -= var4; // L: 788
			int var5 = (int)(this.field3593.method3402()[0] * (float)this.width); // L: 789
			int var6 = (int)(this.field3593.method3402()[1] * (float)this.height); // L: 790
			int var7 = var5 + (int)(this.field3593.method3402()[2] * (float)this.width); // L: 791
			int var8 = var6 + (int)(this.field3593.method3402()[3] * (float)this.height); // L: 792
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 793
		} else {
			return false;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "60"
	)
	public boolean method6191() {
		return this.field3543 == 2; // L: 797
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "9"
	)
	public int method6109(String var1) {
		return this.type == 11 && this.field3593 != null && this.method6191() ? this.field3593.method3411(var1) : -1; // L: 801 802 804
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "639730871"
	)
	public String method6110(String var1) {
		return this.type == 11 && this.field3593 != null && this.method6191() ? this.field3593.method3397(var1) : null; // L: 808 809
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "85"
	)
	public int method6111() {
		return this.field3596 != null && this.field3596.size() > 0 ? 1 : 0; // L: 813
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-131492431"
	)
	public int method6121() {
		if (this.type == 11 && this.field3593 != null && this.field3596 != null && !this.field3596.isEmpty()) { // L: 817
			String var1 = this.field3593.method3393(); // L: 818
			return var1 != null && this.field3596.containsKey(this.field3593.method3393()) ? (Integer)this.field3596.get(var1) : -1; // L: 819 820 822
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-33"
	)
	public String method6113() {
		if (this.type == 11 && this.field3593 != null) { // L: 826
			String var1 = this.field3593.method3393(); // L: 827
			Iterator var2 = this.field3593.method3390().iterator(); // L: 828

			while (var2.hasNext()) {
				class178 var3 = (class178)var2.next(); // L: 829
				String var4 = String.format("%%%S%%", var3.method3514()); // L: 831
				if (var3.vmethod3513() == 0) { // L: 832
					var1.replaceAll(var4, Integer.toString(var3.vmethod3515())); // L: 833
				} else {
					var1.replaceAll(var4, var3.vmethod3511()); // L: 836
				}
			}

			return var1; // L: 840
		} else {
			return null; // L: 839
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "7"
	)
	public int[] method6114() {
		if (this.type == 11 && this.field3593 != null) { // L: 844
			int[] var1 = new int[3]; // L: 845
			int var2 = 0; // L: 846
			Iterator var3 = this.field3593.method3390().iterator(); // L: 847

			while (var3.hasNext()) {
				class178 var4 = (class178)var3.next(); // L: 848
				if (!var4.method3514().equals("user_id")) { // L: 850
					if (var4.vmethod3513() != 0) { // L: 851
						return null; // L: 858
					}

					var1[var2++] = var4.vmethod3515(); // L: 852
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)Z",
		garbageValue = "-1187893314"
	)
	public boolean method6115(UrlRequester var1) {
		if (this.type == 11 && this.field3593 != null) { // L: 867
			this.field3593.method3387(var1); // L: 868
			if (this.field3593.method3398() != this.field3543) { // L: 869
				this.field3543 = this.field3593.method3398(); // L: 870
				if (this.field3543 >= 100) { // L: 871
					return true; // L: 872
				}

				if (this.field3543 == 2) { // L: 874
					this.method6116(); // L: 875
					return true; // L: 876
				}
			}

			return false; // L: 879
		} else {
			return false;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2026401274"
	)
	void method6116() {
		this.noClickThrough = true; // L: 900
		ArrayList var1 = this.field3593.method3399(); // L: 901
		ArrayList var2 = this.field3593.method3392(); // L: 902
		int var3 = var1.size() + var2.size(); // L: 903
		this.children = new Widget[var3]; // L: 904
		int var4 = 0; // L: 905

		Iterator var5;
		Widget var7;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 906 913
			class173 var6 = (class173)var5.next(); // L: 907
			var7 = class18.method260(5, this, var4, 0, 0, 0, 0, var6.field1829); // L: 909
			var7.field3562 = var6.field1830.method2828(); // L: 910
			class307 var8 = new class307(var6.field1830); // L: 911
			field3569.method7427(var7.field3562, var8); // L: 912
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var7) { // L: 916 924
			class174 var9 = (class174)var5.next(); // L: 917
			var7 = class18.method260(4, this, var4, 0, 0, 0, 0, var9.field1840); // L: 919
			var7.text = var9.field1836; // L: 920
			var7.fontId = (Integer)this.field3595.get(var9.field1839); // L: 921
			var7.textXAlignment = var9.field1837; // L: 922
			var7.textYAlignment = var9.field1834; // L: 923
		}

	} // L: 927

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1199908718"
	)
	public void method6117() {
		this.field3635 = new class308(); // L: 930

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 931
			this.field3635.field3452.method384(var1, 0); // L: 932
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 934
			this.field3635.field3452.method385(var2, 0); // L: 935
		}

		this.field3635.field3452.method385('\u0080', 0); // L: 937
		this.field3635.field3452.method384(82, 2); // L: 938
		this.field3635.field3452.method384(81, 2); // L: 939
		this.field3635.field3452.method384(86, 2); // L: 940
	} // L: 941

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)Llo;",
		garbageValue = "22"
	)
	public class310 method6118() {
		return this.field3635 != null ? this.field3635.field3458 : null; // L: 944
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lle;",
		garbageValue = "-830172282"
	)
	public class305 method6119() {
		return this.field3635 != null ? this.field3635.field3451 : null; // L: 948
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)Lbv;",
		garbageValue = "1"
	)
	public class27 method6120() {
		return this.field3635 != null ? this.field3635.field3452 : null; // L: 952
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)Lla;",
		garbageValue = "1"
	)
	public class308 method6163() {
		return this.field3635; // L: 956
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Llo;I)Z",
		garbageValue = "754011370"
	)
	boolean method6122(class310 var1) {
		boolean var2 = false; // L: 960
		if (this.text != null && !this.text.isEmpty()) { // L: 961
			var2 |= var1.method5966(PacketBufferNode.method5467(this.text)); // L: 962
			this.text = ""; // L: 963
		}

		if (this.text2 != null && !this.text2.isEmpty()) { // L: 965
			var2 |= var1.method5820(PacketBufferNode.method5467(this.text2)); // L: 966
			this.text2 = ""; // L: 967
		}

		return var2; // L: 969
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1726558614"
	)
	public boolean method6123() {
		class310 var1 = this.method6118(); // L: 973
		if (var1 == null) { // L: 974
			return false;
		} else {
			boolean var2 = false; // L: 975
			if (!var1.method5873() && this.fontId != -1) { // L: 976
				int var3 = var1.method5874(); // L: 977
				int var4 = var1.method5958(); // L: 978
				int var5 = var1.method6029(); // L: 979
				int var6 = var1.method5871(); // L: 980
				Font var7 = this.getFont(); // L: 981
				if (var7 != null) { // L: 982
					var2 |= var1.method6005(var7); // L: 983
					var2 |= this.method6122(var1); // L: 984
					var2 |= var1.method5826(var3, var4); // L: 985
					var2 |= var1.method5841(var5, var6);
				}
			} else if (var1.method5873()) {
				var2 |= this.method6122(var1);
			}

			var1.method5816(); // L: 992
			return var2; // L: 993
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1217651397"
	)
	static final int method6151(int var0, int var1) {
		if (var0 == -1) { // L: 986
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 987
			if (var1 < 2) {
				var1 = 2; // L: 988
			} else if (var1 > 126) { // L: 989
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 990
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "([Lmy;IIIIIIIII)V",
		garbageValue = "721605112"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10045
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10046

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 10047
			Widget var10 = var0[var9]; // L: 10048
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 10049 10050
				int var11;
				if (var8 == -1) { // L: 10052
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 10053
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 10054
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 10055
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 10056
					var11 = ++Client.rootWidgetCount - 1; // L: 10057
				} else {
					var11 = var8; // L: 10059
				}

				var10.rootIndex = var11; // L: 10060
				var10.cycle = Client.cycle; // L: 10061
				if (!var10.isIf3 || !DecorativeObject.isComponentHidden(var10)) { // L: 10062
					if (var10.contentType > 0) { // L: 10063
						class103.method2671(var10);
					}

					int var12 = var10.x + var6; // L: 10064
					int var13 = var7 + var10.y; // L: 10065
					int var14 = var10.transparencyTop; // L: 10066
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 10067
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 10068
							class146.field1660 = var0; // L: 10069
							ItemLayer.field2360 = var6; // L: 10070
							WorldMapAreaData.field3024 = var7; // L: 10071
							continue; // L: 10072
						}

						if (Client.isDraggingWidget && Client.field663) { // L: 10074
							var15 = MouseHandler.MouseHandler_x; // L: 10075
							var16 = MouseHandler.MouseHandler_y; // L: 10076
							var15 -= Client.widgetClickX; // L: 10077
							var16 -= Client.widgetClickY; // L: 10078
							if (var15 < Client.field664) { // L: 10079
								var15 = Client.field664;
							}

							if (var15 + var10.width > Client.field664 + Client.clickedWidgetParent.width) { // L: 10080
								var15 = Client.field664 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field597) { // L: 10081
								var16 = Client.field597;
							}

							if (var16 + var10.height > Client.field597 + Client.clickedWidgetParent.height) { // L: 10082
								var16 = Client.field597 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 10083
							var13 = var16; // L: 10084
						}

						if (!var10.isScrollBar) { // L: 10086
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) { // L: 10092
						var19 = var12; // L: 10093
						var20 = var13; // L: 10094
						var21 = var12 + var10.width; // L: 10095
						var22 = var13 + var10.height; // L: 10096
						if (var21 < var12) { // L: 10097
							var19 = var21; // L: 10099
							var21 = var12; // L: 10100
						}

						if (var22 < var13) { // L: 10102
							var20 = var22; // L: 10104
							var22 = var13; // L: 10105
						}

						++var21; // L: 10107
						++var22; // L: 10108
						var15 = var19 > var2 ? var19 : var2; // L: 10109
						var16 = var20 > var3 ? var20 : var3; // L: 10110
						var17 = var21 < var4 ? var21 : var4; // L: 10111
						var18 = var22 < var5 ? var22 : var5; // L: 10112
					} else {
						var19 = var12 + var10.width; // L: 10115
						var20 = var13 + var10.height; // L: 10116
						var15 = var12 > var2 ? var12 : var2; // L: 10117
						var16 = var13 > var3 ? var13 : var3; // L: 10118
						var17 = var19 < var4 ? var19 : var4; // L: 10119
						var18 = var20 < var5 ? var20 : var5; // L: 10120
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 10122
						if (var10.contentType != 0) { // L: 10123
							if (var10.contentType == 1336) { // L: 10124
								if (WorldMapSectionType.clientPreferences.method2426()) { // L: 10125
									var13 += 15; // L: 10126
									class420.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 10127
									var13 += 15; // L: 10128
									Runtime var41 = Runtime.getRuntime(); // L: 10129
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L); // L: 10130
									var21 = 16776960; // L: 10131
									if (var20 > 327680 && !Client.isLowDetail) { // L: 10132
										var21 = 16711680;
									}

									class420.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 10133
									var13 += 15; // L: 10134
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 10138
								Client.viewportX = var12; // L: 10139
								Client.viewportY = var13; // L: 10140
								Projectile.drawEntities(var12, var13, var10.width, var10.height); // L: 10141
								Client.field722[var10.rootIndex] = true; // L: 10142
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10143
								continue; // L: 10144
							}

							if (var10.contentType == 1338) { // L: 10146
								AbstractByteArrayCopier.drawMinimap(var10, var12, var13, var11); // L: 10147
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10148
								continue; // L: 10149
							}

							if (var10.contentType == 1339) { // L: 10151
								HitSplatDefinition.drawCompass(var10, var12, var13, var11); // L: 10152
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10153
								continue; // L: 10154
							}

							if (var10.contentType == 1400) { // L: 10156
								WorldMapData_1.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 10157
							}

							if (var10.contentType == 1401) { // L: 10159
								WorldMapData_1.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 10160
							}

							if (var10.contentType == 1402) { // L: 10162
								ArchiveDiskActionHandler.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 10163
							}
						}

						if (var10.type == 0) { // L: 10166
							if (!var10.isIf3 && DecorativeObject.isComponentHidden(var10) && var10 != InvDefinition.mousedOverWidgetIf1) { // L: 10167
								continue;
							}

							if (!var10.isIf3) { // L: 10168
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 10169
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 10170
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 10172
							if (var10.children != null) { // L: 10173
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 10174
							if (var28 != null) { // L: 10175
								GrandExchangeOfferOwnWorldComparator.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11); // L: 10176
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10178
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10179
						} else if (var10.type == 11) { // L: 10181
							if (DecorativeObject.isComponentHidden(var10) && var10 != InvDefinition.mousedOverWidgetIf1) { // L: 10182
								continue;
							}

							if (var10.children != null) { // L: 10183
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10184
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 10185
						}

						if (Client.isResizable || Client.field698[var11] || Client.gameDrawingMode > 1) { // L: 10187
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 10188 10189
								class154.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 10191
								if (var10.type == 3) { // L: 10194
									if (JagexCache.runCs1(var10)) { // L: 10196
										var19 = var10.color2; // L: 10197
										if (var10 == InvDefinition.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10198
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 10201
										if (var10 == InvDefinition.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10202
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 10204
										switch(var10.fillMode.field4981) { // L: 10205
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10211
											break; // L: 10212
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10214
											break; // L: 10215
										default:
											if (var14 == 0) { // L: 10207
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10208
											}
										}
									} else if (var14 == 0) { // L: 10219
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10220
									}
								} else if (var10.type == 4) { // L: 10224
									Font var40 = var10.getFont(); // L: 10225
									if (var40 == null) { // L: 10226
										if (field3637) { // L: 10227
											class69.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text; // L: 10231
										if (JagexCache.runCs1(var10)) { // L: 10232
											var20 = var10.color2; // L: 10233
											if (var10 == InvDefinition.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10234
												var20 = var10.mouseOverColor2;
											}

											if (var10.text2.length() > 0) { // L: 10235
												var42 = var10.text2;
											}
										} else {
											var20 = var10.color; // L: 10238
											if (var10 == InvDefinition.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10239
												var20 = var10.mouseOverColor;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) { // L: 10241
											ItemComposition var43 = ParamComposition.ItemComposition_get(var10.itemId); // L: 10242
											var42 = var43.name; // L: 10243
											if (var42 == null) { // L: 10244
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10245
												var42 = Canvas.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + class311.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) { // L: 10247
											var42 = "Please wait..."; // L: 10248
											var20 = var10.color; // L: 10249
										}

										if (!var10.isIf3) { // L: 10251
											var42 = Player.method2340(var42, var10);
										}

										var40.drawLines(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10252
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) { // L: 10255
										SpritePixels var38;
										if (!var10.isIf3) { // L: 10256
											var38 = var10.getSprite(JagexCache.runCs1(var10), class345.urlRequester); // L: 10257
											if (var38 != null) { // L: 10258
												var38.drawTransBgAt(var12, var13);
											} else if (field3637) { // L: 10259
												class69.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10263
												var38 = class293.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.getSprite(false, class345.urlRequester); // L: 10264
											}

											if (var38 == null) { // L: 10265
												if (field3637) { // L: 10289
													class69.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width; // L: 10266
												var21 = var38.height; // L: 10267
												if (!var10.spriteTiling) { // L: 10268
													var22 = var10.width * 4096 / var20; // L: 10282
													if (var10.spriteAngle != 0) { // L: 10283
														var38.method9136(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10284
														var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10285
														var38.drawTransBgAt(var12, var13); // L: 10286
													} else {
														var38.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10269
													var22 = (var20 - 1 + var10.width) / var20; // L: 10270
													var23 = (var21 - 1 + var10.height) / var21; // L: 10271

													for (var24 = 0; var24 < var22; ++var24) { // L: 10272
														for (var25 = 0; var25 < var23; ++var25) { // L: 10273
															if (var10.spriteAngle != 0) { // L: 10274
																var38.method9136(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10275
																var38.drawTransAt(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21); // L: 10276
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10279
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) { // L: 10293
											boolean var36 = JagexCache.runCs1(var10); // L: 10294
											if (var36) { // L: 10296
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10297
											}

											Model var39 = null; // L: 10298
											var22 = 0; // L: 10299
											if (var10.itemId != -1) { // L: 10300
												ItemComposition var44 = ParamComposition.ItemComposition_get(var10.itemId); // L: 10301
												if (var44 != null) { // L: 10302
													var44 = var44.getCountObj(var10.itemQuantity); // L: 10303
													var39 = var44.getModel(1); // L: 10304
													if (var39 != null) { // L: 10305
														var39.calculateBoundsCylinder(); // L: 10306
														var22 = var39.height / 2; // L: 10307
													} else {
														class69.invalidateWidget(var10); // L: 10309
													}
												}
											} else if (var10.modelType == 5) { // L: 10312
												if (var10.modelId == 0) { // L: 10313
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = BuddyRankComparator.localPlayer.getModel(); // L: 10314
												}
											} else {
												NPCComposition var45 = null; // L: 10317
												class191 var33 = null; // L: 10318
												if (var10.modelType == 6) { // L: 10319
													var25 = var10.modelId; // L: 10320
													if (var25 >= 0 && var25 < Client.npcs.length) { // L: 10321
														NPC var34 = Client.npcs[var25]; // L: 10322
														if (var34 != null) { // L: 10323
															var45 = var34.definition; // L: 10324
															var33 = var34.method2566(); // L: 10325
														}
													}
												}

												SequenceDefinition var35 = null; // L: 10329
												var26 = -1; // L: 10330
												if (var20 != -1) { // L: 10331
													var35 = Coord.SequenceDefinition_get(var20); // L: 10332
													var26 = var10.modelFrame; // L: 10333
												}

												var39 = var10.method6097(var35, var26, var36, BuddyRankComparator.localPlayer.appearance, var45, var33); // L: 10335
												if (var39 == null && field3637) { // L: 10336
													class69.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4305(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10338
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10339
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10340
											if (var39 != null) { // L: 10341
												if (!var10.isIf3) { // L: 10342
													var39.method4651(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder(); // L: 10344
													if (var10.modelOrthog) { // L: 10345
														var39.method4629(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.method4651(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10346
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 10349
										} else {
											Font var29;
											if (var10.type == 8 && var10 == Script.field975 && Client.field536 == Client.field550) { // L: 10352 10353
												var19 = 0; // L: 10354
												var20 = 0; // L: 10355
												var29 = class420.fontPlain12; // L: 10356
												String var30 = var10.text; // L: 10357

												String var31;
												for (var30 = Player.method2340(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) { // L: 10359 10360 10372
													var24 = var30.indexOf("<br>"); // L: 10361
													if (var24 != -1) { // L: 10362
														var31 = var30.substring(0, var24); // L: 10363
														var30 = var30.substring(var24 + 4); // L: 10364
													} else {
														var31 = var30; // L: 10367
														var30 = ""; // L: 10368
													}

													var25 = var29.stringWidth(var31); // L: 10370
													if (var25 > var19) { // L: 10371
														var19 = var25;
													}
												}

												var19 += 6; // L: 10374
												var20 += 7; // L: 10375
												var24 = var12 + var10.width - 5 - var19; // L: 10376
												var25 = var13 + var10.height + 5; // L: 10377
												if (var24 < var12 + 5) { // L: 10378
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 10379
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) { // L: 10380
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10381
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10382
												var30 = var10.text; // L: 10383
												var26 = var25 + var29.ascent + 2; // L: 10384

												for (var30 = Player.method2340(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) { // L: 10385 10386 10397
													int var27 = var30.indexOf("<br>"); // L: 10387
													if (var27 != -1) { // L: 10388
														var31 = var30.substring(0, var27); // L: 10389
														var30 = var30.substring(var27 + 4); // L: 10390
													} else {
														var31 = var30; // L: 10393
														var30 = ""; // L: 10394
													}

													var29.draw(var31, var24 + 3, var26, 0, -1); // L: 10396
												}
											}

											if (var10.type == 9) { // L: 10401
												if (var10.field3545) { // L: 10406
													var19 = var12; // L: 10407
													var20 = var13 + var10.height; // L: 10408
													var21 = var12 + var10.width; // L: 10409
													var22 = var13; // L: 10410
												} else {
													var19 = var12; // L: 10413
													var20 = var13; // L: 10414
													var21 = var12 + var10.width; // L: 10415
													var22 = var13 + var10.height; // L: 10416
												}

												if (var10.lineWid == 1) { // L: 10418
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10419
												} else {
													WorldMapIcon_1.method4802(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10422
												}
											} else if (var10.type == 12) { // L: 10426
												class310 var37 = var10.method6118(); // L: 10427
												class305 var32 = var10.method6119(); // L: 10428
												if (var37 != null && var32 != null && var37.method5873()) { // L: 10429
													var29 = var10.getFont(); // L: 10430
													if (var29 != null) { // L: 10431
														Client.field688.method9209(var12, var13, var10.width, var10.height, var37.method5874(), var37.method5958(), var37.method5871(), var37.method6029(), var37.method5870()); // L: 10432
														var22 = var10.textShadowed ? var10.spriteShadow : -1; // L: 10433
														if (!var37.method5955() && var37.method5865().method6996()) { // L: 10434
															Client.field688.method9203(var32.field3440, var22, var32.field3436, var32.field3437); // L: 10435
															Client.field688.method9204(var37.method5866(), var29); // L: 10436
														} else {
															Client.field688.method9203(var10.color, var22, var32.field3436, var32.field3437); // L: 10439
															Client.field688.method9204(var37.method5865(), var29); // L: 10440
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10442
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 10447
}
