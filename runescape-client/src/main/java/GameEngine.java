import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 868435177
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 8014952675022983113L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("aq")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -227700533
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1831343277
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1711846051
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ad")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("aw")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1863231711
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -727331531
	)
	static int field190;
	@ObfuscatedName("bb")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	static class25 field191;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		longValue = 4504951493222223121L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		longValue = -5460383931457017069L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -616165453
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("ar")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 699729347
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -322011829
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 170702179
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1902725289
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1213055819
	)
	int field199;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1675354011
	)
	int field215;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -866601303
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1572017175
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bj")
	protected boolean field203;
	@ObfuscatedName("bt")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("br")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ba")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("by")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bc")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		longValue = 3687291756214282661L
	)
	volatile long field183;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bm")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bq")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null; // L: 41
		GameEngine_redundantStartThreadCount = 0; // L: 43
		stopTimeMs = 0L; // L: 44
		isKilled = false; // L: 45
		cycleDurationMillis = 20; // L: 48
		fiveOrOne = 1; // L: 49
		fps = 0; // L: 50
		graphicsTickTimes = new long[32]; // L: 53
		clientTickTimes = new long[32]; // L: 55
		field190 = 500; // L: 74
		volatileFocus = true; // L: 83
		field191 = new class25(); // L: 85
		garbageCollectorLastCollectionTime = -1L; // L: 87
		garbageCollectorLastCheckTimeMs = -1L; // L: 88
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.field203 = false; // L: 67
		this.fullRedraw = true; // L: 72
		this.resizeCanvasNextFrame = false; // L: 75
		this.isCanvasInvalid = false; // L: 76
		this.field183 = 0L; // L: 77
		EventQueue var1 = null; // L: 91

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 93
		} catch (Throwable var3) { // L: 95
		}

		this.eventQueue = var1; // L: 96
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 97
		WallObject.pcmPlayerProvider = var2; // L: 99
	} // L: 101

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2125158233"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 104
			this.method538();
		}

		this.maxCanvasWidth = var1; // L: 105
		this.maxCanvasHeight = var2; // L: 106
	} // L: 107

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "1125000698"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 110
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 111
				BuddyRankComparator.method2992(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 112
			}

		}
	} // L: 113

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lip;",
		garbageValue = "1331429226"
	)
	@Export("mouseWheel")
	protected class213 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 116
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 117
			this.mouseWheelHandler.addTo(this.canvas); // L: 118
		}

		return this.mouseWheelHandler; // L: 120
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1231902883"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 124
	} // L: 125

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	protected void method619(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 128
	} // L: 129

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "1811234521"
	)
	public Clipboard method502() {
		return this.clipboard; // L: 132
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (class233.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 137
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 138
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 139
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 140
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 141
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 142
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 143
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 144
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 145
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 146
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 147
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 148
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 149
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 152
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 153
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 154
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 155
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 156
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 157
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 158
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 159
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 160
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 161
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 162
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 163
		}

		field191.method359(this.canvas); // L: 166
	} // L: 167

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "74"
	)
	protected final void method504() {
		field191.method379(); // L: 174
	} // L: 175

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lbt;IB)V",
		garbageValue = "114"
	)
	protected void method632(class29 var1, int var2) {
		field191.method357(var1, var2); // L: 178
	} // L: 179

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1686212242"
	)
	protected final void method606() {
		java.awt.Canvas var1 = this.canvas; // L: 182
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 184
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 185
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 186
	} // L: 188

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "777989296"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 191
		if (var1 != null) { // L: 192
			Bounds var2 = this.getFrameContentBounds(); // L: 193
			this.contentWidth = Math.max(var2.highX, this.field199); // L: 194
			this.contentHeight = Math.max(var2.highY, this.field215); // L: 195
			if (this.contentWidth <= 0) { // L: 196
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 197
				this.contentHeight = 1;
			}

			class524.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 198
			canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 199
			this.canvasX = (this.contentWidth - class524.canvasWidth) / 2; // L: 200
			this.canvasY = 0; // L: 201
			this.canvas.setSize(class524.canvasWidth, canvasHeight); // L: 202
			WorldMapData_1.rasterProvider = new RasterProvider(class524.canvasWidth, canvasHeight, this.canvas, this.field203); // L: 203
			if (var1 == this.frame) { // L: 204
				Insets var3 = this.frame.getInsets(); // L: 205
				this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top); // L: 206
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 208
			}

			this.fullRedraw = true; // L: 209
			this.vmethod1681(); // L: 210
		}
	} // L: 211

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	protected abstract void vmethod1681();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 216
		int var2 = this.canvasY; // L: 217
		int var3 = this.contentWidth - class524.canvasWidth - var1; // L: 218
		int var4 = this.contentHeight - canvasHeight - var2; // L: 219
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 220
			try {
				Container var5 = this.container(); // L: 222
				int var6 = 0; // L: 223
				int var7 = 0; // L: 224
				if (var5 == this.frame) { // L: 225
					Insets var8 = this.frame.getInsets(); // L: 226
					var6 = var8.left; // L: 227
					var7 = var8.top; // L: 228
				}

				Graphics var10 = var5.getGraphics(); // L: 230
				var10.setColor(Color.black); // L: 231
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 232
				}

				if (var2 > 0) { // L: 233
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 234
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 235
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 237
			}
		}

	} // L: 239

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2012224013"
	)
	final void method510() {
		field191.method360(this.canvas); // L: 242
		StructComposition.method3879(this.canvas); // L: 243
		if (this.mouseWheelHandler != null) { // L: 244
			this.mouseWheelHandler.method315(this.canvas);
		}

		this.addCanvas(); // L: 245
		field191.method359(this.canvas); // L: 246
		java.awt.Canvas var1 = this.canvas; // L: 247
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 249
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 250
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 251
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method538();
	} // L: 255

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-504492174"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 259
				++GameEngine_redundantStartThreadCount; // L: 260
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 261
					this.error("alreadyloaded"); // L: 262
					return; // L: 263
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 265
				return; // L: 266
			}

			gameEngine = this; // L: 268
			class524.canvasWidth = var1; // L: 269
			canvasHeight = var2; // L: 270
			RunException.RunException_revision = var3; // L: 271
			class494.field4948 = var4; // L: 272
			RunException.RunException_applet = this; // L: 273
			if (taskHandler == null) { // L: 274
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 275
		} catch (Exception var6) { // L: 277
			class368.RunException_sendStackTrace((String)null, var6); // L: 278
			this.error("crash"); // L: 279
		}

	} // L: 281

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 284
		if (this.canvas != null) { // L: 285
			this.canvas.removeFocusListener(this); // L: 286
			var1.remove(this.canvas); // L: 287
		}

		class524.canvasWidth = Math.max(var1.getWidth(), this.field199); // L: 289
		canvasHeight = Math.max(var1.getHeight(), this.field215); // L: 290
		Insets var2;
		if (this.frame != null) { // L: 291
			var2 = this.frame.getInsets(); // L: 292
			class524.canvasWidth -= var2.right + var2.left; // L: 293
			canvasHeight -= var2.bottom + var2.top; // L: 294
		}

		this.canvas = new Canvas(this); // L: 296
		var1.setBackground(Color.BLACK); // L: 297
		var1.setLayout((LayoutManager)null); // L: 298
		var1.add(this.canvas); // L: 299
		this.canvas.setSize(class524.canvasWidth, canvasHeight); // L: 300
		this.canvas.setVisible(true); // L: 301
		this.canvas.setBackground(Color.BLACK); // L: 302
		if (var1 == this.frame) { // L: 303
			var2 = this.frame.getInsets(); // L: 304
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top); // L: 305
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 307
		}

		this.canvas.addFocusListener(this); // L: 308
		this.canvas.requestFocus(); // L: 309
		this.fullRedraw = true; // L: 310
		if (WorldMapData_1.rasterProvider != null && class524.canvasWidth == WorldMapData_1.rasterProvider.width && canvasHeight == WorldMapData_1.rasterProvider.height) { // L: 311
			((RasterProvider)WorldMapData_1.rasterProvider).setComponent(this.canvas); // L: 312
			WorldMapData_1.rasterProvider.drawFull(0, 0); // L: 313
		} else {
			WorldMapData_1.rasterProvider = new RasterProvider(class524.canvasWidth, canvasHeight, this.canvas, this.field203); // L: 316
		}

		this.isCanvasInvalid = false; // L: 318
		this.field183 = UserComparator9.method2973(); // L: 319
	} // L: 320

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "8"
	)
	protected void method513(boolean var1) {
		if (this.field203 != var1) { // L: 323
			this.field203 = var1; // L: 324
			WorldMapData_1.rasterProvider.method9790(var1); // L: 325
			WorldMapData_1.rasterProvider.apply(); // L: 326
		}

	} // L: 328

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "54"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 331
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 332
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 333
				if (var1.endsWith("127.0.0.1")) { // L: 334
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 335
					}

					if (var1.endsWith("192.168.1.")) { // L: 336
						return true;
					} else {
						this.error("invalidhost"); // L: 337
						return false; // L: 338
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2011943361"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = UserComparator9.method2973(); // L: 395
		long var3 = clientTickTimes[GrandExchangeOfferAgeComparator.field4410]; // L: 396
		clientTickTimes[GrandExchangeOfferAgeComparator.field4410] = var1; // L: 397
		GrandExchangeOfferAgeComparator.field4410 = GrandExchangeOfferAgeComparator.field4410 + 1 & 31; // L: 398
		if (0L != var3 && var1 > var3) { // L: 399
		}

		synchronized(this) { // L: 400
			class31.field160 = volatileFocus; // L: 401
		} // L: 402

		this.doCycle(); // L: 403
	} // L: 404

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "36786763"
	)
	protected final void method516() {
		this.fullRedraw = true; // L: 407
	} // L: 408

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-101"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 411
		long var2 = UserComparator9.method2973(); // L: 412
		long var4 = graphicsTickTimes[class479.field4854]; // L: 413
		graphicsTickTimes[class479.field4854] = var2; // L: 414
		class479.field4854 = class479.field4854 + 1 & 31; // L: 415
		if (0L != var4 && var2 > var4) { // L: 416
			int var6 = (int)(var2 - var4); // L: 417
			fps = ((var6 >> 1) + 32000) / var6; // L: 418
		}

		if (++field190 - 1 > 50) { // L: 420
			field190 -= 50; // L: 421
			this.fullRedraw = true; // L: 422
			this.canvas.setSize(class524.canvasWidth, canvasHeight); // L: 423
			this.canvas.setVisible(true); // L: 424
			if (var1 == this.frame) { // L: 425
				Insets var7 = this.frame.getInsets(); // L: 426
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY); // L: 427
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 429
			}
		}

		if (this.isCanvasInvalid) { // L: 431
			this.method510();
		}

		this.method518(); // L: 432
		this.draw(this.fullRedraw); // L: 433
		if (this.fullRedraw) { // L: 434
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 435
	} // L: 436

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1669237932"
	)
	final void method518() {
		Bounds var1 = this.getFrameContentBounds(); // L: 439
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 440
			this.resizeCanvas(); // L: 441
			this.resizeCanvasNextFrame = false; // L: 442
		}

	} // L: 444

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2097036407"
	)
	final void method538() {
		this.resizeCanvasNextFrame = true; // L: 447
	} // L: 448

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "796261390"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 451
			isKilled = true; // L: 452

			try {
				this.canvas.removeFocusListener(this); // L: 454
			} catch (Exception var5) { // L: 456
			}

			try {
				this.kill0(); // L: 458
			} catch (Exception var4) { // L: 460
			}

			if (this.frame != null) { // L: 461
				try {
					System.exit(0); // L: 463
				} catch (Throwable var3) { // L: 465
				}
			}

			if (taskHandler != null) { // L: 467
				try {
					taskHandler.close(); // L: 469
				} catch (Exception var2) { // L: 471
				}
			}

			this.vmethod1251(); // L: 473
		}
	} // L: 474

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1581898600"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "65536"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1847953596"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-2105215181"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 560
			if (class139.fontHelvetica13 == null) { // L: 561
				class139.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 562
				GameBuild.loginScreenFontMetrics = this.canvas.getFontMetrics(class139.fontHelvetica13); // L: 563
			}

			if (var3) { // L: 565
				var4.setColor(Color.black); // L: 566
				var4.fillRect(0, 0, class524.canvasWidth, canvasHeight); // L: 567
			}

			Color var5 = new Color(140, 17, 17); // L: 569

			try {
				if (class416.field4579 == null) { // L: 571
					class416.field4579 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class416.field4579.getGraphics(); // L: 572
				var6.setColor(var5); // L: 573
				var6.drawRect(0, 0, 303, 33); // L: 574
				var6.fillRect(2, 2, var1 * 3, 30); // L: 575
				var6.setColor(Color.black); // L: 576
				var6.drawRect(1, 1, 301, 31); // L: 577
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 578
				var6.setFont(class139.fontHelvetica13); // L: 579
				var6.setColor(Color.white); // L: 580
				var6.drawString(var2, (304 - GameBuild.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 581
				var4.drawImage(class416.field4579, class524.canvasWidth / 2 - 152, canvasHeight / 2 - 18, (ImageObserver)null); // L: 582
			} catch (Exception var9) { // L: 584
				int var7 = class524.canvasWidth / 2 - 152; // L: 585
				int var8 = canvasHeight / 2 - 18; // L: 586
				var4.setColor(var5); // L: 587
				var4.drawRect(var7, var8, 303, 33); // L: 588
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 589
				var4.setColor(Color.black); // L: 590
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 591
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 592
				var4.setFont(class139.fontHelvetica13); // L: 593
				var4.setColor(Color.white); // L: 594
				var4.drawString(var2, var7 + (304 - GameBuild.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 595
			}
		} catch (Exception var10) { // L: 598
			this.canvas.repaint(); // L: 599
		}

	} // L: 601

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "823954529"
	)
	protected final void method557() {
		class416.field4579 = null; // L: 604
		class139.fontHelvetica13 = null; // L: 605
		GameBuild.loginScreenFontMetrics = null; // L: 606
	} // L: 607

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "77"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 610
			this.hasErrored = true; // L: 611
			System.out.println("error_game_" + var1); // L: 612

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 614
			} catch (Exception var3) { // L: 616
			}

		}
	} // L: 617

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-1776421511"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 620
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)Lry;",
		garbageValue = "-51"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 625
		int var2 = Math.max(var1.getWidth(), this.field199); // L: 626
		int var3 = Math.max(var1.getHeight(), this.field215); // L: 627
		if (this.frame != null) { // L: 628
			Insets var4 = this.frame.getInsets(); // L: 629
			var2 -= var4.left + var4.right; // L: 630
			var3 -= var4.bottom + var4.top; // L: 631
		}

		return new Bounds(var2, var3); // L: 633
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1739982853"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 637
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "164188662"
	)
	protected abstract void vmethod1251();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 510
			this.fullRedraw = true; // L: 511
			if (UserComparator9.method2973() - this.field183 > 1000L) { // L: 512
				Rectangle var2 = var1.getClipBounds(); // L: 513
				if (var2 == null || var2.width >= class524.canvasWidth && var2.height >= canvasHeight) {
					this.isCanvasInvalid = true; // L: 514
				}
			}

		}
	} // L: 516

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 497
			stopTimeMs = UserComparator9.method2973(); // L: 498
			BuddyRankComparator.method2992(5000L); // L: 499
			this.kill(); // L: 500
		}
	} // L: 501

	public void run() {
		try {
			if (class233.javaVendor != null) { // L: 343
				String var1 = class233.javaVendor.toLowerCase(); // L: 344
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 345
					String var2 = TaskHandler.javaVersion; // L: 346
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 347
						this.error("wrongjava"); // L: 348
						return; // L: 349
					}

					if (var2.startsWith("1.6.0_")) { // L: 351
						int var3;
						for (var3 = 6; var3 < var2.length() && ScriptFrame.isDigit(var2.charAt(var3)); ++var3) { // L: 352 353
						}

						String var4 = var2.substring(6, var3); // L: 354
						if (Login.isNumber(var4) && HealthBar.method2644(var4) < 10) { // L: 355
							this.error("wrongjava"); // L: 356
							return; // L: 357
						}
					}

					fiveOrOne = 5; // L: 360
				}
			}

			this.setFocusCycleRoot(true); // L: 363
			this.addCanvas(); // L: 365
			this.setUp(); // L: 367

			Object var8;
			try {
				var8 = new NanoClock(); // L: 371
			} catch (Throwable var6) { // L: 373
				var8 = new MilliClock(); // L: 374
			}

			class344.clock = (Clock)var8; // L: 377

			while (0L == stopTimeMs || UserComparator9.method2973() < stopTimeMs) { // L: 378
				class195.gameCyclesToDo = class344.clock.wait(cycleDurationMillis, fiveOrOne); // L: 379

				for (int var5 = 0; var5 < class195.gameCyclesToDo; ++var5) { // L: 380
					this.clientTick();
				}

				this.graphicsTick(); // L: 382
				this.post(this.canvas); // L: 384
			}
		} catch (Exception var7) { // L: 387
			class368.RunException_sendStackTrace((String)null, var7); // L: 388
			this.error("crash"); // L: 389
		}

		this.kill(); // L: 391
	} // L: 392

	public abstract void init();

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 485
			stopTimeMs = 0L; // L: 486
		}
	} // L: 487

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 491
			stopTimeMs = UserComparator9.method2973() + 4000L; // L: 492
		}
	} // L: 493

	public final void update(Graphics var1) {
		this.paint(var1); // L: 505
	} // L: 506

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 526
	} // L: 527

	public final void windowActivated(WindowEvent var1) {
	} // L: 530

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 537
	} // L: 538

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 544

	public final void windowIconified(WindowEvent var1) {
	} // L: 547

	public final void windowOpened(WindowEvent var1) {
	} // L: 550

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 541

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 520
		this.fullRedraw = true; // L: 521
	} // L: 522

	public final void windowClosed(WindowEvent var1) {
	} // L: 533

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lch;",
		garbageValue = "-36980380"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null; // L: 253 254
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2061090063"
	)
	static final int method678(int var0, int var1) {
		if (var0 == -2) { // L: 1029
			return 12345678;
		} else if (var0 == -1) { // L: 1030
			if (var1 < 2) {
				var1 = 2; // L: 1031
			} else if (var1 > 126) { // L: 1032
				var1 = 126;
			}

			return var1; // L: 1033
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1035
			if (var1 < 2) { // L: 1036
				var1 = 2;
			} else if (var1 > 126) { // L: 1037
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1038
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-30"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4729
		TileItem.method2764(); // L: 4730
		if (Client.field628) { // L: 4732
			class141.addPlayerToScene(class25.localPlayer, false); // L: 4733
		}

		Varps.method6320(); // L: 4736
		ParamComposition.addNpcsToScene(true); // L: 4737
		int var4 = Players.Players_count; // L: 4739
		int[] var5 = Players.Players_indices; // L: 4740

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4741
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4742
				class141.addPlayerToScene(Client.players[var5[var6]], true); // L: 4743
			}
		}

		ParamComposition.addNpcsToScene(false); // L: 4746
		GrandExchangeOfferNameComparator.method7181(); // L: 4747

		for (GraphicsObject var20 = (GraphicsObject)Client.graphicsObjects.last(); var20 != null; var20 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4749 4750 4757
			if (var20.plane == class113.Client_plane && !var20.isFinished) { // L: 4751
				if (Client.cycle >= var20.cycleStart) { // L: 4752
					var20.advance(Client.field576); // L: 4753
					if (var20.isFinished) { // L: 4754
						var20.remove();
					} else {
						GrandExchangeOfferOwnWorldComparator.scene.drawEntity(var20.plane, var20.x, var20.y, var20.z, 60, var20, 0, -1L, false); // L: 4755
					}
				}
			} else {
				var20.remove();
			}
		}

		VarbitComposition.setViewportShape(var0, var1, var2, var3, true); // L: 4760
		var0 = Client.viewportOffsetX; // L: 4761
		var1 = Client.viewportOffsetY; // L: 4762
		var2 = Client.viewportWidth; // L: 4763
		var3 = Client.viewportHeight; // L: 4764
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4765
		Rasterizer3D.method5300(); // L: 4766
		Rasterizer2D.method9750(); // L: 4767
		var4 = Client.camAngleX; // L: 4768
		if (Client.field600 / 256 > var4) { // L: 4769
			var4 = Client.field600 / 256;
		}

		if (Client.field767[4] && Client.field769[4] + 128 > var4) { // L: 4770
			var4 = Client.field769[4] + 128;
		}

		int var21 = Client.camAngleY & 2047; // L: 4771
		var6 = class367.oculusOrbFocalPointX; // L: 4772
		int var7 = WorldMapArea.field2516; // L: 4773
		int var8 = WorldMapCacheName.oculusOrbFocalPointY; // L: 4774
		int var9 = var4 * 3 + 600; // L: 4777
		int var10 = class157.method3437(var9, var3); // L: 4781
		int var11 = 2048 - var4 & 2047; // L: 4782
		int var12 = 2048 - var21 & 2047; // L: 4783
		int var13 = 0; // L: 4784
		int var14 = 0; // L: 4785
		int var15 = var10; // L: 4786
		int var16;
		int var17;
		int var18;
		if (var11 != 0) { // L: 4787
			var16 = Rasterizer3D.Rasterizer3D_sine[var11]; // L: 4788
			var17 = Rasterizer3D.Rasterizer3D_cosine[var11]; // L: 4789
			var18 = var17 * var14 - var10 * var16 >> 16; // L: 4790
			var15 = var16 * var14 + var10 * var17 >> 16; // L: 4791
			var14 = var18; // L: 4792
		}

		if (var12 != 0) { // L: 4794
			var16 = Rasterizer3D.Rasterizer3D_sine[var12]; // L: 4795
			var17 = Rasterizer3D.Rasterizer3D_cosine[var12]; // L: 4796
			var18 = var13 * var17 + var15 * var16 >> 16; // L: 4797
			var15 = var17 * var15 - var13 * var16 >> 16; // L: 4798
			var13 = var18; // L: 4799
		}

		if (Client.isCameraLocked) { // L: 4801
			class518.field5105 = var6 - var13; // L: 4802
			Huffman.field3870 = var7 - var14; // L: 4803
			class53.field367 = var8 - var15; // L: 4804
			SecureRandomCallable.field1027 = var4; // L: 4805
			WorldMapLabelSize.field2487 = var21; // L: 4806
		} else {
			cameraX = var6 - var13; // L: 4809
			KeyHandler.cameraY = var7 - var14; // L: 4810
			GrandExchangeOfferTotalQuantityComparator.cameraZ = var8 - var15; // L: 4811
			UserComparator3.cameraPitch = var4; // L: 4812
			HealthBarUpdate.cameraYaw = var21; // L: 4813
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class367.oculusOrbFocalPointX >> 7 != class25.localPlayer.x >> 7 || WorldMapCacheName.oculusOrbFocalPointY >> 7 != class25.localPlayer.y >> 7)) { // L: 4815 4816
			var16 = class25.localPlayer.plane; // L: 4817
			var17 = HealthBarDefinition.baseX * 64 + (class367.oculusOrbFocalPointX >> 7); // L: 4818
			var18 = WorldMapScaleHandler.baseY * 64 + (WorldMapCacheName.oculusOrbFocalPointY >> 7); // L: 4819
			class4.method17(var17, var18, var16, true); // L: 4820
		}

		if (!Client.isCameraLocked) { // L: 4825
			var11 = class281.method5633();
		} else {
			var11 = class233.method4588(); // L: 4826
		}

		var12 = cameraX; // L: 4827
		var13 = KeyHandler.cameraY; // L: 4828
		var14 = GrandExchangeOfferTotalQuantityComparator.cameraZ; // L: 4829
		var15 = UserComparator3.cameraPitch; // L: 4830
		var16 = HealthBarUpdate.cameraYaw; // L: 4831

		for (var17 = 0; var17 < 5; ++var17) { // L: 4832
			if (Client.field767[var17]) { // L: 4833
				var18 = (int)(Math.random() * (double)(Client.field722[var17] * 2 + 1) - (double)Client.field722[var17] + Math.sin((double)Client.field775[var17] * ((double)Client.field788[var17] / 100.0D)) * (double)Client.field769[var17]); // L: 4834
				if (var17 == 0) { // L: 4835
					cameraX += var18;
				}

				if (var17 == 1) { // L: 4836
					KeyHandler.cameraY += var18;
				}

				if (var17 == 2) { // L: 4837
					GrandExchangeOfferTotalQuantityComparator.cameraZ += var18;
				}

				if (var17 == 3) { // L: 4838
					HealthBarUpdate.cameraYaw = var18 + HealthBarUpdate.cameraYaw & 2047;
				}

				if (var17 == 4) { // L: 4839
					UserComparator3.cameraPitch += var18; // L: 4840
					if (UserComparator3.cameraPitch < 128) { // L: 4841
						UserComparator3.cameraPitch = 128;
					}

					if (UserComparator3.cameraPitch > 383) { // L: 4842
						UserComparator3.cameraPitch = 383;
					}
				}
			}
		}

		var17 = MouseHandler.MouseHandler_x; // L: 4846
		var18 = MouseHandler.MouseHandler_y; // L: 4847
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4848
			var17 = MouseHandler.MouseHandler_lastPressedX; // L: 4849
			var18 = MouseHandler.MouseHandler_lastPressedY; // L: 4850
		}

		if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) { // L: 4852
			Login.method2209(var17 - var0, var18 - var1); // L: 4853
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4857
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4858
		}

		WorldMapRectangle.method5020(); // L: 4861
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4862
		WorldMapRectangle.method5020(); // L: 4863
		int var19 = Rasterizer3D.method5320(); // L: 4864
		Rasterizer3D.method5247(VertexNormal.client.field203); // L: 4865
		Rasterizer3D.field2809.field3092 = Client.viewportZoom; // L: 4866
		GrandExchangeOfferOwnWorldComparator.scene.draw(cameraX, KeyHandler.cameraY, GrandExchangeOfferTotalQuantityComparator.cameraZ, UserComparator3.cameraPitch, HealthBarUpdate.cameraYaw, var11); // L: 4867
		Rasterizer3D.method5247(false); // L: 4868
		if (Client.renderSelf) { // L: 4869
			Rasterizer2D.method9731(); // L: 4870
		}

		Rasterizer3D.field2809.field3092 = var19; // L: 4872
		WorldMapRectangle.method5020(); // L: 4873
		GrandExchangeOfferOwnWorldComparator.scene.clearTempGameObjects(); // L: 4874
		class102.method2732(var0, var1, var2, var3); // L: 4875
		ScriptEvent.method2366(var0, var1); // L: 4876
		((TextureProvider)Rasterizer3D.field2809.Rasterizer3D_textureLoader).animate(Client.field576); // L: 4877
		class165.method3516(var0, var1, var2, var3); // L: 4878
		cameraX = var12; // L: 4879
		KeyHandler.cameraY = var13; // L: 4880
		GrandExchangeOfferTotalQuantityComparator.cameraZ = var14; // L: 4881
		UserComparator3.cameraPitch = var15; // L: 4882
		HealthBarUpdate.cameraYaw = var16; // L: 4883
		if (Client.field690 && UrlRequester.field1418.method7146(true, false) == 0) { // L: 4884
			Client.field690 = false;
		}

		if (Client.field690) { // L: 4885
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4886
			StructComposition.drawLoadingMessage("Loading - please wait.", false); // L: 4887
		}

	} // L: 4889
}
