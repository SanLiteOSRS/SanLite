import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("Widget_cachedSprites")
	static EvictingDualNodeHashTable Widget_cachedSprites;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("Widget_cachedModels")
	static EvictingDualNodeHashTable Widget_cachedModels;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("Widget_cachedFonts")
	static EvictingDualNodeHashTable Widget_cachedFonts;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("Widget_cachedSpriteMasks")
	static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	static class423 field3642;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	static class423 field3759;
	@ObfuscatedName("ba")
	public static boolean field3644;
	@ObfuscatedName("bl")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -802277715
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1714711969
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1370156439
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 2112192689
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 625549223
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1836019191
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 2126278027
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 622186791
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 789633491
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1356456497
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1035953241
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1863641013
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1225925253
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 979552283
	)
	@Export("x")
	public int x;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1112610033
	)
	@Export("y")
	public int y;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 501302871
	)
	@Export("width")
	public int width;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1553685319
	)
	@Export("height")
	public int height;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -336932141
	)
	public int field3766;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -113901163
	)
	public int field3664;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1049113007
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("cd")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -739875643
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 595666453
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -568991711
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 917378589
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 583709627
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1690813953
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 343481789
	)
	public int field3675;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -463307133
	)
	public int field3719;
	@ObfuscatedName("ci")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("fillMode")
	public class526 fillMode;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1458216043
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -226104863
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 710046829
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cz")
	public boolean field3680;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1694560891
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -329704335
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("ck")
	public String field3683;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1503713927
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("dh")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 1314949967
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1858431901
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("du")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("dn")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -2025847507
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1600832609
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1817776489
	)
	int field3692;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 588250195
	)
	int field3693;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1110473721
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1313087687
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1684340733
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -1371233395
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 749203487
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1965358453
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 190427709
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -277742987
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1498521133
	)
	public int field3702;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1004887025
	)
	public int field3741;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public PlayerComposition field3704;
	@ObfuscatedName("dp")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dm")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 1667643047
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1281040923
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("de")
	@Export("text")
	public String text;
	@ObfuscatedName("dc")
	public String field3626;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 732439673
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -450106133
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -1142439947
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ee")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	class170 field3715;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -1091181871
	)
	int field3760;
	@ObfuscatedName("ea")
	HashMap field3775;
	@ObfuscatedName("er")
	HashMap field3752;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	class327 field3726;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 1774346509
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("en")
	public boolean field3721;
	@ObfuscatedName("eb")
	public byte[][] field3697;
	@ObfuscatedName("ei")
	public byte[][] field3796;
	@ObfuscatedName("es")
	public int[] field3724;
	@ObfuscatedName("el")
	public int[] field3725;
	@ObfuscatedName("eu")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("eg")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -518432429
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -501291711
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ep")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("fh")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ft")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("fs")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("fl")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fe")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fd")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fj")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fv")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fb")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fr")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fq")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fp")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fg")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fo")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fz")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fu")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fn")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fx")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("ff")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fc")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fk")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fm")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fy")
	public Object[] field3754;
	@ObfuscatedName("fw")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fi")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fa")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("gu")
	public Object[] field3767;
	@ObfuscatedName("gc")
	public Object[] field3723;
	@ObfuscatedName("gd")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gm")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gg")
	public Object[] field3762;
	@ObfuscatedName("gw")
	public Object[] field3763;
	@ObfuscatedName("gi")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("go")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gl")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gb")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gj")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("ge")
	public Object[] field3784;
	@ObfuscatedName("gs")
	public Object[] field3714;
	@ObfuscatedName("gv")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gf")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gh")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = 505176041
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gp")
	public String field3758;
	@ObfuscatedName("gk")
	public String field3699;
	@ObfuscatedName("ga")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gx")
	public int[] field3778;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 1710253055
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 1666268347
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -1908101821
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = 290467875
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "[Lmi;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("ht")
	public boolean field3668;
	@ObfuscatedName("ho")
	public boolean field3785;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = -622304961
	)
	public int field3718;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = -1773043479
	)
	public int field3787;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = -1917542241
	)
	public int field3788;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 1397975839
	)
	public int field3789;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = 1527386271
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -822322021
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hl")
	public int[] field3792;
	@ObfuscatedName("hg")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hu")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("he")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		Widget_cachedSprites = new EvictingDualNodeHashTable(200); // L: 60
		Widget_cachedModels = new EvictingDualNodeHashTable(50); // L: 61
		Widget_cachedFonts = new EvictingDualNodeHashTable(20); // L: 62
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8); // L: 63
		field3642 = new class423(10, class421.field4606); // L: 64
		field3759 = new class423(10, class421.field4606); // L: 65
		field3644 = false; // L: 66
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
		this.field3766 = 1; // L: 85
		this.field3664 = 1; // L: 86
		this.parentId = -1; // L: 87
		this.isHidden = false; // L: 88
		this.scrollX = 0; // L: 89
		this.scrollY = 0; // L: 90
		this.scrollWidth = 0; // L: 91
		this.scrollHeight = 0; // L: 92
		this.color = 0; // L: 93
		this.color2 = 0; // L: 94
		this.field3675 = 0; // L: 95
		this.field3719 = 0; // L: 96
		this.fill = false; // L: 97
		this.fillMode = class526.SOLID; // L: 98
		this.transparencyTop = 0; // L: 99
		this.transparencyBot = 0; // L: 100
		this.lineWid = 1; // L: 101
		this.field3680 = false; // L: 102
		this.spriteId2 = -1; // L: 103
		this.spriteId = -1; // L: 104
		this.spriteAngle = 0; // L: 106
		this.spriteTiling = false; // L: 107
		this.outline = 0; // L: 108
		this.spriteShadow = 0; // L: 109
		this.modelType = 1; // L: 112
		this.modelId = -1; // L: 113
		this.field3692 = 1; // L: 114
		this.field3693 = -1; // L: 115
		this.sequenceId = -1; // L: 116
		this.sequenceId2 = -1; // L: 117
		this.modelOffsetX = 0; // L: 118
		this.modelOffsetY = 0; // L: 119
		this.modelAngleX = 0; // L: 120
		this.modelAngleY = 0; // L: 121
		this.modelAngleZ = 0; // L: 122
		this.modelZoom = 100; // L: 123
		this.field3702 = 0; // L: 124
		this.field3741 = 0; // L: 125
		this.modelOrthog = false; // L: 127
		this.modelTransparency = false; // L: 128
		this.itemQuantityMode = 2; // L: 129
		this.fontId = -1; // L: 130
		this.text = ""; // L: 131
		this.field3626 = ""; // L: 132
		this.textLineHeight = 0; // L: 133
		this.textXAlignment = 0; // L: 134
		this.textYAlignment = 0; // L: 135
		this.textShadowed = false; // L: 136
		this.field3760 = -1; // L: 138
		this.flags = 0; // L: 143
		this.field3721 = false; // L: 144
		this.dataText = ""; // L: 153
		this.parent = null; // L: 155
		this.dragZoneSize = 0; // L: 156
		this.dragThreshold = 0; // L: 157
		this.isScrollBar = false; // L: 158
		this.spellActionName = ""; // L: 159
		this.hasListener = false; // L: 160
		this.mouseOverRedirect = -1; // L: 201
		this.field3758 = ""; // L: 202
		this.field3699 = "Ok"; // L: 203
		this.itemId = -1; // L: 206
		this.itemQuantity = 0; // L: 207
		this.modelFrame = 0; // L: 208
		this.modelFrameCycle = 0; // L: 209
		this.field3668 = false; // L: 211
		this.field3785 = false; // L: 212
		this.field3718 = -1; // L: 213
		this.field3787 = 0; // L: 214
		this.field3788 = 0; // L: 215
		this.field3789 = 0; // L: 216
		this.rootIndex = -1; // L: 217
		this.cycle = -1; // L: 218
		this.noClickThrough = false; // L: 220
		this.noScrollThrough = false; // L: 221
		this.prioritizeMenuEntry = false; // L: 222
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-122"
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
			this.field3626 = var1.readStringCp1252NullTerminated(); // L: 336
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) { // L: 338
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) { // L: 339
			this.color2 = var1.readInt(); // L: 340
			this.field3675 = var1.readInt(); // L: 341
			this.field3719 = var1.readInt(); // L: 342
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

			this.field3692 = 1; // L: 352
			this.field3693 = var1.readUnsignedShort(); // L: 353
			if (this.field3693 == 65535) { // L: 354
				this.field3693 = -1;
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
			this.field3758 = var1.readStringCp1252NullTerminated(); // L: 368
			var4 = var1.readUnsignedShort() & 63; // L: 369
			this.flags |= var4 << 11; // L: 370
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) { // L: 372
			this.field3699 = var1.readStringCp1252NullTerminated(); // L: 373
			if (this.field3699.length() == 0) { // L: 374
				if (this.buttonType == 1) { // L: 375
					this.field3699 = "Ok";
				}

				if (this.buttonType == 4) { // L: 376
					this.field3699 = "Select";
				}

				if (this.buttonType == 5) { // L: 377
					this.field3699 = "Select";
				}

				if (this.buttonType == 6) { // L: 378
					this.field3699 = "Continue";
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "-1617832353"
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
				this.field3702 = var1.readUnsignedShort();
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
			this.field3680 = var1.readUnsignedByte() == 1; // L: 459
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)[Ljava/lang/Object;",
		garbageValue = "-631733803"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)[I",
		garbageValue = "132481992"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZLev;I)Lui;",
		garbageValue = "1752459087"
	)
	@Export("getSprite")
	public SpritePixels getSprite(boolean var1, UrlRequester var2) {
		field3644 = false; // L: 519
		if (this.field3683 != null) { // L: 520
			SpritePixels var3 = this.method6389(var2); // L: 521
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
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var7 + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 530
			SpritePixels var6 = (SpritePixels)Widget_cachedSprites.get(var4); // L: 531
			if (var6 != null) { // L: 532
				return var6;
			} else {
				var6 = Tiles.SpriteBuffer_getSprite(Language.Widget_spritesArchive, var7, 0); // L: 533
				if (var6 == null) { // L: 534
					field3644 = true; // L: 535
					return null; // L: 536
				} else {
					this.method6440(var6); // L: 538
					Widget_cachedSprites.put(var6, var4); // L: 539
					return var6; // L: 540
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lev;B)Lui;",
		garbageValue = "24"
	)
	SpritePixels method6389(UrlRequester var1) {
		if (!this.method6391()) { // L: 544
			return this.method6437(var1); // L: 545
		} else {
			String var2 = this.field3683 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow; // L: 547
			SpritePixels var3 = (SpritePixels)field3759.method7781(var2); // L: 548
			if (var3 == null) { // L: 549
				SpritePixels var4 = this.method6437(var1); // L: 550
				if (var4 != null) { // L: 551
					var3 = var4.method9491(); // L: 552
					this.method6440(var3); // L: 553
					field3759.method7782(var2, var3); // L: 554
				}
			}

			return var3; // L: 557
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)Lui;",
		garbageValue = "-853434695"
	)
	SpritePixels method6437(UrlRequester var1) {
		if (this.field3683 != null && var1 != null) { // L: 561
			class326 var2 = (class326)field3642.method7781(this.field3683); // L: 562
			if (var2 == null) { // L: 563
				var2 = new class326(this.field3683, var1); // L: 564
				field3642.method7782(this.field3683, var2); // L: 565
			}

			return var2.method6057(); // L: 567
		} else {
			return null; // L: 569
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-32"
	)
	boolean method6391() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0; // L: 573
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lui;B)V",
		garbageValue = "-60"
	)
	void method6440(SpritePixels var1) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lpi;",
		garbageValue = "1973823248"
	)
	@Export("getFont")
	public Font getFont() {
		field3644 = false; // L: 586
		if (this.fontId == -1) { // L: 587
			return null;
		} else {
			Font var1 = (Font)Widget_cachedFonts.get((long)this.fontId); // L: 588
			if (var1 != null) { // L: 589
				return var1;
			} else {
				var1 = LoginPacket.method5712(Language.Widget_spritesArchive, class155.Widget_fontsArchive, this.fontId, 0); // L: 590
				if (var1 != null) {
					Widget_cachedFonts.put(var1, (long)this.fontId); // L: 591
				} else {
					field3644 = true; // L: 592
				}

				return var1; // L: 593
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lib;IZLmt;Lhw;Lhq;B)Ljr;",
		garbageValue = "-43"
	)
	public Model method6394(SequenceDefinition var1, int var2, boolean var3, PlayerComposition var4, NPCComposition var5, class194 var6) {
		field3644 = false; // L: 597
		int var7;
		int var8;
		if (var3) { // L: 600
			var7 = this.field3692; // L: 601
			var8 = this.field3693; // L: 602
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
			if (var6 != null && var6.field2028 && var7 == 6) { // L: 614
				var7 = 3; // L: 615
			}

			long var9 = (long)(var8 + (var7 << 16)); // L: 617
			if (var6 != null) { // L: 618
				var9 |= var6.field2026 << 20;
			}

			Model var11 = (Model)Widget_cachedModels.get(var9); // L: 619
			if (var11 == null) { // L: 620
				ModelData var12 = null; // L: 621
				int var13 = 64; // L: 622
				int var14 = 768; // L: 623
				switch(var7) { // L: 624
				case 1:
					var12 = ModelData.ModelData_get(class47.field352, var8, 0); // L: 632
					break; // L: 633
				case 2:
					var12 = class90.getNpcDefinition(var8).method3692((class194)null); // L: 626
					break;
				case 3:
					var12 = var4 != null ? var4.getModelData() : null;
					break; // L: 641
				case 4:
					ItemComposition var15 = InvDefinition.ItemComposition_get(var8); // L: 635
					var12 = var15.getModelData(10); // L: 636
					var13 += var15.field2273; // L: 637
					var14 += var15.field2274; // L: 638
				case 5:
				default:
					break;
				case 6:
					var12 = class90.getNpcDefinition(var8).method3692(var6); // L: 629
				}

				if (var12 == null) { // L: 644
					field3644 = true; // L: 645
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lme;",
		garbageValue = "1022020243"
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
			long var3 = ((long)this.spriteShadow << 40) + ((long)this.outline << 36) + (long)var2 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39); // L: 661
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1578890937"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	public boolean method6397() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12; // L: 711
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "13293"
	)
	public boolean method6398() {
		return this.type == 11 || this.type == 12; // L: 715
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lev;J)V"
	)
	public void method6491(String var1, UrlRequester var2, long var3) {
		if (this.type == 11 && var3 != -1L) { // L: 719
			var1 = var1.replaceAll("%userid%", Long.toString(var3)); // L: 720
			this.field3715 = new class170(); // L: 721
			if (!this.field3715.method3365(var1, var2)) { // L: 722
				this.field3715 = null; // L: 723
			} else {
				if (this.field3775 == null || this.field3752 == null) { // L: 726
					this.method6529(); // L: 727
				}

			}
		}
	} // L: 724 729

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lev;I)V",
		garbageValue = "1047552277"
	)
	public void method6467(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) { // L: 732
			this.field3715 = new class170(); // L: 733
			this.field3715.method3383(var1, var2); // L: 734
		}
	} // L: 735

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-11260"
	)
	void method6529() {
		this.field3775 = new HashMap(); // L: 738
		this.field3752 = new HashMap(); // L: 739
	} // L: 740

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1873888023"
	)
	@Export("swapItems")
	public void swapItems(int var1, int var2) {
		if (this.type == 11) { // L: 743
			if (this.field3775 == null) { // L: 744
				this.method6529();
			}

			this.field3775.put(var1, var2); // L: 745
		}
	} // L: 746

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1531233902"
	)
	public void method6403(String var1, int var2) {
		if (this.type == 11) { // L: 749
			if (this.field3752 == null) { // L: 750
				this.method6529();
			}

			this.field3752.put(var1, var2); // L: 751
		}
	} // L: 752

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "182136505"
	)
	public boolean method6404(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3715 != null && this.method6474()) { // L: 755
			var1 -= var3; // L: 756
			var2 -= var4; // L: 757
			int var5 = (int)(this.field3715.method3371()[0] * (float)this.width); // L: 758
			int var6 = (int)(this.field3715.method3371()[1] * (float)this.height); // L: 759
			int var7 = var5 + (int)(this.field3715.method3371()[2] * (float)this.width); // L: 760
			int var8 = var6 + (int)(this.field3715.method3371()[3] * (float)this.height); // L: 761
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8; // L: 762
		} else {
			return false;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1140949643"
	)
	public boolean method6474() {
		return this.field3760 == 2; // L: 766
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2121469782"
	)
	public int method6406(String var1) {
		return this.type == 11 && this.field3715 != null && this.method6474() ? this.field3715.method3368(var1) : -1; // L: 770 771 773
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1095190564"
	)
	public String method6407(String var1) {
		return this.type == 11 && this.field3715 != null && this.method6474() ? this.field3715.method3417(var1) : null; // L: 777 778
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "44"
	)
	public int method6408() {
		return this.field3752 != null && this.field3752.size() > 0 ? 1 : 0; // L: 782
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "47"
	)
	public int method6409() {
		if (this.type == 11 && this.field3715 != null && this.field3752 != null && !this.field3752.isEmpty()) { // L: 786
			String var1 = this.field3715.method3372(); // L: 787
			return var1 != null && this.field3752.containsKey(this.field3715.method3372()) ? (Integer)this.field3752.get(var1) : -1; // L: 788 789 791
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "11076"
	)
	public String method6410() {
		if (this.type == 11 && this.field3715 != null) { // L: 795
			String var1 = this.field3715.method3372(); // L: 796
			Iterator var2 = this.field3715.method3374().iterator(); // L: 797

			while (var2.hasNext()) {
				class181 var3 = (class181)var2.next(); // L: 798
				String var4 = String.format("%%%S%%", var3.method3516()); // L: 800
				if (var3.vmethod3528() == 0) { // L: 801
					var1.replaceAll(var4, Integer.toString(var3.vmethod3527())); // L: 802
				} else {
					var1.replaceAll(var4, var3.vmethod3518()); // L: 805
				}
			}

			return var1; // L: 809
		} else {
			return null; // L: 808
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2142205826"
	)
	public int[] method6424() {
		if (this.type == 11 && this.field3715 != null) { // L: 813
			int[] var1 = new int[3]; // L: 814
			int var2 = 0; // L: 815
			Iterator var3 = this.field3715.method3374().iterator(); // L: 816

			while (var3.hasNext()) {
				class181 var4 = (class181)var3.next(); // L: 817
				if (!var4.method3516().equals("user_id")) { // L: 819
					if (var4.vmethod3528() != 0) { // L: 820
						return null; // L: 827
					}

					var1[var2++] = var4.vmethod3527(); // L: 821
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lev;B)Z",
		garbageValue = "84"
	)
	public boolean method6454(UrlRequester var1) {
		if (this.type == 11 && this.field3715 != null) { // L: 836
			this.field3715.method3413(var1); // L: 837
			if (this.field3715.method3367() != this.field3760) { // L: 838
				this.field3760 = this.field3715.method3367(); // L: 839
				if (this.field3760 >= 100) { // L: 840
					return true; // L: 841
				}

				if (this.field3760 == 2) { // L: 843
					this.method6413(); // L: 844
					return true; // L: 845
				}
			}

			return false; // L: 848
		} else {
			return false;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "757418391"
	)
	void method6413() {
		this.noClickThrough = true; // L: 852
		ArrayList var1 = this.field3715.method3370(); // L: 853
		ArrayList var2 = this.field3715.method3418(); // L: 854
		int var3 = var1.size() + var2.size(); // L: 855
		this.children = new Widget[var3]; // L: 856
		int var4 = 0; // L: 857

		Iterator var5;
		float[] var9;
		Widget var10;
		for (var5 = var1.iterator(); var5.hasNext(); this.children[var4++] = var10) { // L: 858 884
			class176 var6 = (class176)var5.next(); // L: 859
			var9 = var6.field1880; // L: 863
			var10 = new Widget(); // L: 865
			var10.type = 5; // L: 866
			var10.parentId = this.id; // L: 867
			var10.childIndex = var4; // L: 868
			var10.isIf3 = true; // L: 869
			var10.xAlignment = 0; // L: 870
			var10.yAlignment = 0; // L: 871
			var10.widthAlignment = 0; // L: 872
			var10.heightAlignment = 0; // L: 873
			var10.rawX = (int)(var9[0] * (float)this.width); // L: 874
			var10.rawY = (int)(var9[1] * (float)this.height); // L: 875
			var10.rawWidth = (int)(var9[2] * (float)this.width); // L: 876
			var10.rawHeight = (int)((float)this.height * var9[3]); // L: 877
			var10.field3683 = var6.field1879.method2848(); // L: 881
			class326 var11 = new class326(var6.field1879); // L: 882
			field3642.method7782(var10.field3683, var11); // L: 883
		}

		for (var5 = var2.iterator(); var5.hasNext(); this.children[var4++] = var10) { // L: 887 914
			class177 var12 = (class177)var5.next(); // L: 888
			var9 = var12.field1885; // L: 892
			var10 = new Widget(); // L: 894
			var10.type = 4; // L: 895
			var10.parentId = this.id; // L: 896
			var10.childIndex = var4; // L: 897
			var10.isIf3 = true; // L: 898
			var10.xAlignment = 0; // L: 899
			var10.yAlignment = 0; // L: 900
			var10.widthAlignment = 0; // L: 901
			var10.heightAlignment = 0; // L: 902
			var10.rawX = (int)(var9[0] * (float)this.width); // L: 903
			var10.rawY = (int)(var9[1] * (float)this.height); // L: 904
			var10.rawWidth = (int)((float)this.width * var9[2]); // L: 905
			var10.rawHeight = (int)(var9[3] * (float)this.height); // L: 906
			var10.text = var12.field1892; // L: 910
			var10.fontId = (Integer)this.field3775.get(var12.field1884); // L: 911
			var10.textXAlignment = var12.field1886; // L: 912
			var10.textYAlignment = var12.field1887; // L: 913
		}

	} // L: 917

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	public void method6414() {
		this.field3726 = new class327(); // L: 920

		for (int var1 = 1; var1 <= 12; ++var1) { // L: 921
			this.field3726.field3566.method394(var1, 0); // L: 922
		}

		for (char var2 = 0; var2 < ' '; ++var2) { // L: 924
			this.field3726.field3566.method419(var2, 0); // L: 925
		}

		this.field3726.field3566.method419('\u0080', 0); // L: 927
		this.field3726.field3566.method394(82, 2); // L: 928
		this.field3726.field3566.method394(81, 2); // L: 929
		this.field3726.field3566.method394(86, 2); // L: 930
	} // L: 931

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)Lmb;",
		garbageValue = "-14"
	)
	public class329 method6532() {
		return this.field3726 != null ? this.field3726.field3563 : null; // L: 934
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)Lml;",
		garbageValue = "25"
	)
	public class324 method6416() {
		return this.field3726 != null ? this.field3726.field3561 : null; // L: 938
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lbj;",
		garbageValue = "1077698230"
	)
	public class27 method6401() {
		return this.field3726 != null ? this.field3726.field3566 : null; // L: 942
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lmp;",
		garbageValue = "-1932900136"
	)
	public class327 method6418() {
		return this.field3726; // L: 946
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)Z",
		garbageValue = "1"
	)
	boolean method6419(class329 var1) {
		boolean var2 = false; // L: 950
		if (this.text != null && !this.text.isEmpty()) { // L: 951
			var2 |= var1.method6290(class157.method3260(this.text)); // L: 952
			this.text = ""; // L: 953
		}

		if (this.field3626 != null && !this.field3626.isEmpty()) { // L: 955
			var2 |= var1.method6109(class157.method3260(this.field3626)); // L: 956
			this.field3626 = ""; // L: 957
		}

		return var2; // L: 959
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1006338343"
	)
	public boolean method6420() {
		class329 var1 = this.method6532(); // L: 963
		if (var1 == null) { // L: 964
			return false;
		} else {
			boolean var2 = false; // L: 965
			if (!var1.method6162() && this.fontId != -1) { // L: 966
				int var3 = var1.method6163(); // L: 967
				int var4 = var1.method6286(); // L: 968
				int var5 = var1.method6161(); // L: 969
				int var6 = var1.method6160(); // L: 970
				Font var7 = this.getFont(); // L: 971
				if (var7 != null) { // L: 972
					var2 |= var1.method6110(var7); // L: 973
					var2 |= this.method6419(var1); // L: 974
					var2 |= var1.method6115(var3, var4); // L: 975
					var2 |= var1.method6130(var5, var6); // L: 976
				}
			} else if (var1.method6162()) { // L: 979
				var2 |= this.method6419(var1); // L: 980
			}

			var1.method6105(); // L: 982
			return var2; // L: 983
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1138526298"
	)
	public static int method6533(int var0, int var1, int var2) {
		int var3 = Projectile.method2147(var2 - var1 + 1); // L: 56
		var3 <<= var1; // L: 57
		var0 |= var3; // L: 58
		return var0; // L: 59
	}
}
