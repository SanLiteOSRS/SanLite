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

@ObfuscatedName("ba")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1991573117
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 3402750991634106967L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ax")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -463972869
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -566000899
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 889909645
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2066314479
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("aj")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ac")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1923723849
	)
	static int field214;
	@ObfuscatedName("bi")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	protected static class25 field197;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		longValue = -2987006904821226527L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		longValue = 8420725591338873961L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("ap")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 774787359
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 135212301
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -205265531
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 654173713
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1513648757
	)
	int field193;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 650620733
	)
	int field207;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 758964699
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2053407577
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bs")
	protected boolean field209;
	@ObfuscatedName("bo")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bq")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bg")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ba")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bn")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		longValue = -4715207515714124473L
	)
	volatile long field206;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bp")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bw")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null; // L: 41
		GameEngine_redundantStartThreadCount = 0; // L: 43
		stopTimeMs = 0L;
		isKilled = false;
		cycleDurationMillis = 20;
		fiveOrOne = 1; // L: 49
		fps = 0;
		graphicsTickTimes = new long[32]; // L: 53
		clientTickTimes = new long[32]; // L: 55
		field214 = 500; // L: 74
		volatileFocus = true; // L: 83
		field197 = new class25(); // L: 85
		garbageCollectorLastCollectionTime = -1L; // L: 87
		garbageCollectorLastCheckTimeMs = -1L; // L: 88
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.field209 = false; // L: 67
		this.fullRedraw = true; // L: 72
		this.resizeCanvasNextFrame = false; // L: 75
		this.isCanvasInvalid = false; // L: 76
		this.field206 = 0L; // L: 77
		EventQueue var1 = null; // L: 91

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 93
		} catch (Throwable var3) { // L: 95
		}

		this.eventQueue = var1; // L: 96
		class439.method8156(new DevicePcmPlayerProvider()); // L: 97
	} // L: 98

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "313026208"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 101
			this.method482();
		}

		this.maxCanvasWidth = var1; // L: 102
		this.maxCanvasHeight = var2; // L: 103
	} // L: 104

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "0"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 107
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 108
				GroundObject.method4357(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 109
			}

		}
	} // L: 110

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lgp;",
		garbageValue = "1687069782"
	)
	@Export("mouseWheel")
	protected class173 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 113
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 114
			this.mouseWheelHandler.addTo(this.canvas); // L: 115
		}

		return this.mouseWheelHandler; // L: 117
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1864005520"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 121
	} // L: 122

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-569645123"
	)
	protected void method465(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 125
	} // L: 126

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-18720527"
	)
	protected Clipboard method466() {
		return this.clipboard; // L: 129
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-96205193"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 134
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 135
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 136
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 137
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 138
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 139
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 140
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 141
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 142
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 143
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 144
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 145
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 146
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 149
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 150
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 151
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 152
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 153
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 154
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 155
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 156
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 157
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 158
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 159
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 160
		}

		field197.method350(this.canvas); // L: 163
	} // L: 164

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-331583429"
	)
	protected final void method540() {
		field197.method351(); // L: 167
	} // L: 168

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbo;II)V",
		garbageValue = "-1406442453"
	)
	protected void method469(class29 var1, int var2) {
		field197.method347(var1, var2); // L: 171
	} // L: 172

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1070899817"
	)
	protected final void method529() {
		class237.method4769(this.canvas); // L: 175
	} // L: 176

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "254887913"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 179
		if (var1 != null) { // L: 180
			Bounds var2 = this.getFrameContentBounds(); // L: 181
			this.contentWidth = Math.max(var2.highX, this.field193); // L: 182
			this.contentHeight = Math.max(var2.highY, this.field207); // L: 183
			if (this.contentWidth <= 0) { // L: 184
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 185
				this.contentHeight = 1;
			}

			class448.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 186
			WorldMapID.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 187
			this.canvasX = (this.contentWidth - class448.canvasWidth) / 2; // L: 188
			this.canvasY = 0; // L: 189
			this.canvas.setSize(class448.canvasWidth, WorldMapID.canvasHeight); // L: 190
			WorldMapSectionType.rasterProvider = new RasterProvider(class448.canvasWidth, WorldMapID.canvasHeight, this.canvas, this.field209); // L: 191
			if (var1 == this.frame) { // L: 192
				Insets var3 = this.frame.getInsets(); // L: 193
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top); // L: 194
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 196
			}

			this.fullRedraw = true; // L: 197
			this.resizeGame(); // L: 198
		}
	} // L: 199

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "79303459"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 204
		int var2 = this.canvasY; // L: 205
		int var3 = this.contentWidth - class448.canvasWidth - var1; // L: 206
		int var4 = this.contentHeight - WorldMapID.canvasHeight - var2; // L: 207
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 208
			try {
				Container var5 = this.container(); // L: 210
				int var6 = 0; // L: 211
				int var7 = 0; // L: 212
				if (var5 == this.frame) { // L: 213
					Insets var8 = this.frame.getInsets(); // L: 214
					var6 = var8.left; // L: 215
					var7 = var8.top; // L: 216
				}

				Graphics var10 = var5.getGraphics(); // L: 218
				var10.setColor(Color.black); // L: 219
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 220
				}

				if (var2 > 0) { // L: 221
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 222
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 223
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 225
			}
		}

	} // L: 227

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "729182928"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field197.method359(this.canvas); // L: 230
		PendingSpawn.method2355(this.canvas); // L: 231
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method314(this.canvas); // L: 232
		}

		this.addCanvas(); // L: 233
		field197.method350(this.canvas); // L: 234
		class237.method4769(this.canvas); // L: 235
		if (this.mouseWheelHandler != null) { // L: 236
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method482(); // L: 237
	} // L: 238

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-31"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 242
				++GameEngine_redundantStartThreadCount; // L: 243
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 244
					this.error("alreadyloaded"); // L: 245
					return; // L: 246
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 248
				return; // L: 249
			}

			gameEngine = this; // L: 251
			class448.canvasWidth = var1; // L: 252
			WorldMapID.canvasHeight = var2; // L: 253
			class160.RunException_revision = var3; // L: 254
			class163.field1773 = var4; // L: 255
			RunException.RunException_applet = this; // L: 256
			if (taskHandler == null) { // L: 257
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 258
		} catch (Exception var6) { // L: 260
			class260.RunException_sendStackTrace((String)null, var6); // L: 261
			this.error("crash"); // L: 262
		}

	} // L: 264

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1333626461"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 267
		if (this.canvas != null) { // L: 268
			this.canvas.removeFocusListener(this); // L: 269
			var1.remove(this.canvas); // L: 270
		}

		class448.canvasWidth = Math.max(var1.getWidth(), this.field193); // L: 272
		WorldMapID.canvasHeight = Math.max(var1.getHeight(), this.field207); // L: 273
		Insets var2;
		if (this.frame != null) { // L: 274
			var2 = this.frame.getInsets(); // L: 275
			class448.canvasWidth -= var2.right + var2.left; // L: 276
			WorldMapID.canvasHeight -= var2.bottom + var2.top; // L: 277
		}

		this.canvas = new Canvas(this); // L: 279
		var1.setBackground(Color.BLACK); // L: 280
		var1.setLayout((LayoutManager)null); // L: 281
		var1.add(this.canvas); // L: 282
		this.canvas.setSize(class448.canvasWidth, WorldMapID.canvasHeight); // L: 283
		this.canvas.setVisible(true); // L: 284
		this.canvas.setBackground(Color.BLACK); // L: 285
		if (var1 == this.frame) { // L: 286
			var2 = this.frame.getInsets(); // L: 287
			this.canvas.setLocation(var2.left + this.canvasX, var2.top + this.canvasY); // L: 288
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 290
		}

		this.canvas.addFocusListener(this); // L: 291
		this.canvas.requestFocus(); // L: 292
		this.fullRedraw = true; // L: 293
		if (WorldMapSectionType.rasterProvider != null && class448.canvasWidth == WorldMapSectionType.rasterProvider.width && WorldMapID.canvasHeight == WorldMapSectionType.rasterProvider.height) { // L: 294
			((RasterProvider)WorldMapSectionType.rasterProvider).setComponent(this.canvas); // L: 295
			WorldMapSectionType.rasterProvider.drawFull(0, 0); // L: 296
		} else {
			WorldMapSectionType.rasterProvider = new RasterProvider(class448.canvasWidth, WorldMapID.canvasHeight, this.canvas, this.field209); // L: 299
		}

		this.isCanvasInvalid = false; // L: 301
		this.field206 = WallObject.method5027(); // L: 302
	} // L: 303

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1666256751"
	)
	protected void method512(boolean var1) {
		if (this.field209 != var1) { // L: 306
			this.field209 = var1; // L: 307
			WorldMapSectionType.rasterProvider.method9342(var1); // L: 308
			WorldMapSectionType.rasterProvider.apply(); // L: 309
		}

	} // L: 311

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-64"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 314
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 315
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 316
				if (var1.endsWith("127.0.0.1")) { // L: 317
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 318
					}

					if (var1.endsWith("192.168.1.")) { // L: 319
						return true;
					} else {
						this.error("invalidhost"); // L: 320
						return false; // L: 321
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "55714431"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = WallObject.method5027(); // L: 374
		long var3 = clientTickTimes[class112.field1400]; // L: 375
		clientTickTimes[class112.field1400] = var1; // L: 376
		class112.field1400 = class112.field1400 + 1 & 31; // L: 377
		if (var3 != 0L && var1 > var3) { // L: 378
		}

		synchronized(this) { // L: 379
			class31.hasFocus = volatileFocus; // L: 380
		} // L: 381

		this.doCycle(); // L: 382
	} // L: 383

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1752034937"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 386
		long var2 = WallObject.method5027(); // L: 387
		long var4 = graphicsTickTimes[BufferedNetSocket.field4622]; // L: 388
		graphicsTickTimes[BufferedNetSocket.field4622] = var2; // L: 389
		BufferedNetSocket.field4622 = BufferedNetSocket.field4622 + 1 & 31; // L: 390
		if (0L != var4 && var2 > var4) { // L: 391
			int var6 = (int)(var2 - var4); // L: 392
			fps = ((var6 >> 1) + 32000) / var6; // L: 393
		}

		if (++field214 - 1 > 50) { // L: 395
			field214 -= 50; // L: 396
			this.fullRedraw = true; // L: 397
			this.canvas.setSize(class448.canvasWidth, WorldMapID.canvasHeight); // L: 398
			this.canvas.setVisible(true); // L: 399
			if (var1 == this.frame) { // L: 400
				Insets var7 = this.frame.getInsets(); // L: 401
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top); // L: 402
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 404
			}
		}

		if (this.isCanvasInvalid) { // L: 406
			this.replaceCanvas();
		}

		this.method481(); // L: 407
		this.draw(this.fullRedraw); // L: 408
		if (this.fullRedraw) { // L: 409
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 410
	} // L: 411

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1550811963"
	)
	final void method481() {
		Bounds var1 = this.getFrameContentBounds(); // L: 414
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 415
			this.resizeCanvas(); // L: 416
			this.resizeCanvasNextFrame = false; // L: 417
		}

	} // L: 419

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "934214551"
	)
	final void method482() {
		this.resizeCanvasNextFrame = true; // L: 422
	} // L: 423

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "501694298"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 426
			isKilled = true; // L: 427

			try {
				this.canvas.removeFocusListener(this); // L: 429
			} catch (Exception var5) { // L: 431
			}

			try {
				this.kill0(); // L: 433
			} catch (Exception var4) { // L: 435
			}

			if (this.frame != null) { // L: 436
				try {
					System.exit(0); // L: 438
				} catch (Throwable var3) { // L: 440
				}
			}

			if (taskHandler != null) { // L: 442
				try {
					taskHandler.close(); // L: 444
				} catch (Exception var2) { // L: 446
				}
			}

			this.vmethod1197(); // L: 448
		}
	} // L: 449

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "43"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-146179282"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "279913198"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "1215659496"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 535
			if (DesktopPlatformInfoProvider.fontHelvetica13 == null) { // L: 536
				DesktopPlatformInfoProvider.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 537
				class133.loginScreenFontMetrics = this.canvas.getFontMetrics(DesktopPlatformInfoProvider.fontHelvetica13); // L: 538
			}

			if (var3) { // L: 540
				var4.setColor(Color.black); // L: 541
				var4.fillRect(0, 0, class448.canvasWidth, WorldMapID.canvasHeight); // L: 542
			}

			Color var5 = new Color(140, 17, 17); // L: 544

			try {
				if (class59.field432 == null) { // L: 546
					class59.field432 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class59.field432.getGraphics(); // L: 547
				var6.setColor(var5); // L: 548
				var6.drawRect(0, 0, 303, 33); // L: 549
				var6.fillRect(2, 2, var1 * 3, 30); // L: 550
				var6.setColor(Color.black); // L: 551
				var6.drawRect(1, 1, 301, 31); // L: 552
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 553
				var6.setFont(DesktopPlatformInfoProvider.fontHelvetica13); // L: 554
				var6.setColor(Color.white); // L: 555
				var6.drawString(var2, (304 - class133.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 556
				var4.drawImage(class59.field432, class448.canvasWidth / 2 - 152, WorldMapID.canvasHeight / 2 - 18, (ImageObserver)null); // L: 557
			} catch (Exception var9) { // L: 559
				int var7 = class448.canvasWidth / 2 - 152; // L: 560
				int var8 = WorldMapID.canvasHeight / 2 - 18; // L: 561
				var4.setColor(var5); // L: 562
				var4.drawRect(var7, var8, 303, 33); // L: 563
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 564
				var4.setColor(Color.black); // L: 565
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 566
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 567
				var4.setFont(DesktopPlatformInfoProvider.fontHelvetica13); // L: 568
				var4.setColor(Color.white); // L: 569
				var4.drawString(var2, var7 + (304 - class133.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 570
			}
		} catch (Exception var10) { // L: 573
			this.canvas.repaint(); // L: 574
		}

	} // L: 576

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-622954298"
	)
	protected final void method500() {
		class59.field432 = null; // L: 579
		DesktopPlatformInfoProvider.fontHelvetica13 = null; // L: 580
		class133.loginScreenFontMetrics = null; // L: 581
	} // L: 582

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1477771111"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 585
			this.hasErrored = true; // L: 586
			System.out.println("error_game_" + var1); // L: 587

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 589
			} catch (Exception var3) { // L: 591
			}

		}
	} // L: 592

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "1128381047"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 595
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)Lqs;",
		garbageValue = "48"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 600
		int var2 = Math.max(var1.getWidth(), this.field193); // L: 601
		int var3 = Math.max(var1.getHeight(), this.field207); // L: 602
		if (this.frame != null) { // L: 603
			Insets var4 = this.frame.getInsets(); // L: 604
			var2 -= var4.left + var4.right; // L: 605
			var3 -= var4.bottom + var4.top; // L: 606
		}

		return new Bounds(var2, var3); // L: 608
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1053178714"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 612
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	protected abstract void vmethod1197();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 485
			this.fullRedraw = true; // L: 486
			if (WallObject.method5027() - this.field206 > 1000L) { // L: 487
				Rectangle var2 = var1.getClipBounds(); // L: 488
				if (var2 == null || var2.width >= class448.canvasWidth && var2.height >= WorldMapID.canvasHeight) {
					this.isCanvasInvalid = true; // L: 489
				}
			}

		}
	} // L: 491

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 472
			stopTimeMs = WallObject.method5027(); // L: 473
			GroundObject.method4357(5000L); // L: 474
			this.kill(); // L: 475
		}
	} // L: 476

	public final void windowClosed(WindowEvent var1) {
	} // L: 508

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 326
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 327
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 328
					String var2 = TaskHandler.javaVersion; // L: 329
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 330
						this.error("wrongjava"); // L: 331
						return; // L: 332
					}

					if (var2.startsWith("1.6.0_")) { // L: 334
						int var3;
						for (var3 = 6; var3 < var2.length() && class159.isDigit(var2.charAt(var3)); ++var3) { // L: 335 336
						}

						String var4 = var2.substring(6, var3); // L: 337
						if (class146.isNumber(var4) && TextureProvider.method4744(var4) < 10) { // L: 338
							this.error("wrongjava"); // L: 339
							return; // L: 340
						}
					}

					fiveOrOne = 5; // L: 343
				}
			}

			this.setFocusCycleRoot(true); // L: 346
			this.addCanvas(); // L: 347
			this.setUp(); // L: 348

			Object var8;
			try {
				var8 = new NanoClock(); // L: 352
			} catch (Throwable var6) { // L: 354
				var8 = new MilliClock(); // L: 355
			}

			BufferedNetSocket.clock = (Clock)var8; // L: 358

			while (0L == stopTimeMs || WallObject.method5027() < stopTimeMs) { // L: 359
				gameCyclesToDo = BufferedNetSocket.clock.wait(cycleDurationMillis, fiveOrOne); // L: 360

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) { // L: 361
					this.clientTick();
				}

				this.graphicsTick(); // L: 362
				this.post(this.canvas); // L: 363
			}
		} catch (Exception var7) { // L: 366
			class260.RunException_sendStackTrace((String)null, var7); // L: 367
			this.error("crash"); // L: 368
		}

		this.kill(); // L: 370
	} // L: 371

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 460
			stopTimeMs = 0L; // L: 461
		}
	} // L: 462

	public final void update(Graphics var1) {
		this.paint(var1); // L: 480
	} // L: 481

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 501
	} // L: 502

	public final void windowActivated(WindowEvent var1) {
	} // L: 505

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 519

	public final void windowIconified(WindowEvent var1) {
	} // L: 522

	public abstract void init();

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 495
		this.fullRedraw = true; // L: 496
	} // L: 497

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 466
			stopTimeMs = WallObject.method5027() + 4000L; // L: 467
		}
	} // L: 468

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 516

	public final void windowOpened(WindowEvent var1) {
	} // L: 525

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 512
	} // L: 513

	@ObfuscatedName("at")
	public static boolean method563(long var0) {
		boolean var2 = 0L != var0; // L: 44
		if (var2) { // L: 45
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1; // L: 48
			var2 = !var3; // L: 50
		}

		return var2; // L: 52
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "301181960"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 990
			var1 /= 2;
		}

		if (var2 > 192) { // L: 991
			var1 /= 2;
		}

		if (var2 > 217) { // L: 992
			var1 /= 2;
		}

		if (var2 > 243) { // L: 993
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 994
		return var3; // L: 995
	}
}
