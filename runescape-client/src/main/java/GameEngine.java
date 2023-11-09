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

@ObfuscatedName("ab")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 151757867
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 3544816195498298245L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("q")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -627456729
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -283228587
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1720917717
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1946988529
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("u")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("z")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -42495921
	)
	static int field201;
	@ObfuscatedName("an")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -8992699287611248793L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 2378449895296999019L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("i")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1400363447
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2124934131
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 692979235
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1968412069
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1701584501
	)
	int field194;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -275235505
	)
	int field195;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 87478927
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1012026435
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ab")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ak")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("au")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ay")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ag")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 779143887598852019L
	)
	volatile long field204;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("ap")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("az")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null;
		GameEngine_redundantStartThreadCount = 0; // L: 43
		stopTimeMs = 0L; // L: 44
		isKilled = false;
		cycleDurationMillis = 20; // L: 48
		fiveOrOne = 1;
		fps = 0;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32]; // L: 55
		field201 = 500;
		volatileFocus = true;
		garbageCollectorLastCollectionTime = -1L; // L: 85
		garbageCollectorLastCheckTimeMs = -1L; // L: 86
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0; // L: 60
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field204 = 0L;
		EventQueue var1 = null; // L: 89

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 91
		} catch (Throwable var3) { // L: 93
		}

		this.eventQueue = var1; // L: 94
		class342.method6201(new DevicePcmPlayerProvider()); // L: 95
	} // L: 96

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1429433411"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 99
			this.method518();
		}

		this.maxCanvasWidth = var1; // L: 100
		this.maxCanvasHeight = var2; // L: 101
	} // L: 102

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-786024645"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 105
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 106
				class144.method3006(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 107
			}

		}
	} // L: 108

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Lfd;",
		garbageValue = "-48"
	)
	@Export("mouseWheel")
	protected class158 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 111
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 112
			this.mouseWheelHandler.addTo(this.canvas); // L: 113
		}

		return this.mouseWheelHandler; // L: 115
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "106"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 119
	} // L: 120

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-936313625"
	)
	protected void method417(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 123
	} // L: 124

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1751835050"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 128
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 129
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 130
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 131
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 132
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 133
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 134
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 135
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 136
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 137
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 138
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 139
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 140
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 143
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 144
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 145
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 146
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 147
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 148
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 149
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 150
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 151
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 152
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 153
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 154
		}

		MenuAction.method1859(this.canvas); // L: 157
	} // L: 158

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2118998884"
	)
	protected final void method523() {
		ObjectComposition.method3578(this.canvas); // L: 161
	} // L: 162

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2094721561"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 165
		if (var1 != null) { // L: 166
			Bounds var2 = this.getFrameContentBounds(); // L: 167
			this.contentWidth = Math.max(var2.highX, this.field194); // L: 168
			this.contentHeight = Math.max(var2.highY, this.field195); // L: 169
			if (this.contentWidth <= 0) { // L: 170
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 171
				this.contentHeight = 1;
			}

			class7.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 172
			DecorativeObject.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 173
			this.canvasX = (this.contentWidth - class7.canvasWidth) / 2; // L: 174
			this.canvasY = 0; // L: 175
			this.canvas.setSize(class7.canvasWidth, DecorativeObject.canvasHeight); // L: 176
			class119.rasterProvider = new RasterProvider(class7.canvasWidth, DecorativeObject.canvasHeight, this.canvas); // L: 177
			if (var1 == this.frame) { // L: 178
				Insets var3 = this.frame.getInsets(); // L: 179
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top); // L: 180
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 182
			}

			this.fullRedraw = true; // L: 183
			this.resizeGame(); // L: 184
		}
	} // L: 185

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "19569"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 190
		int var2 = this.canvasY; // L: 191
		int var3 = this.contentWidth - class7.canvasWidth - var1; // L: 192
		int var4 = this.contentHeight - DecorativeObject.canvasHeight - var2; // L: 193
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 194
			try {
				Container var5 = this.container(); // L: 196
				int var6 = 0; // L: 197
				int var7 = 0; // L: 198
				if (var5 == this.frame) { // L: 199
					Insets var8 = this.frame.getInsets(); // L: 200
					var6 = var8.left; // L: 201
					var7 = var8.top; // L: 202
				}

				Graphics var10 = var5.getGraphics(); // L: 204
				var10.setColor(Color.black); // L: 205
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 206
				}

				if (var2 > 0) { // L: 207
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 208
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 209
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 211
			}
		}

	} // L: 213

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "80"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas; // L: 216
		var1.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 218
		var1.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 219
		KeyHandler.field132 = -1; // L: 220
		java.awt.Canvas var2 = this.canvas; // L: 222
		var2.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 224
		var2.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 225
		var2.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 226
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 227
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas); // L: 229
		}

		this.addCanvas(); // L: 230
		MenuAction.method1859(this.canvas); // L: 231
		ObjectComposition.method3578(this.canvas); // L: 232
		if (this.mouseWheelHandler != null) { // L: 233
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method518(); // L: 234
	} // L: 235

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1050144207"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 239
				++GameEngine_redundantStartThreadCount; // L: 240
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 241
					this.error("alreadyloaded"); // L: 242
					return; // L: 243
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 245
				return; // L: 246
			}

			gameEngine = this; // L: 248
			class7.canvasWidth = var1; // L: 249
			DecorativeObject.canvasHeight = var2; // L: 250
			RunException.RunException_revision = var3; // L: 251
			RunException.field4847 = var4; // L: 252
			RunException.RunException_applet = this; // L: 253
			if (taskHandler == null) { // L: 254
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 255
		} catch (Exception var6) { // L: 257
			class33.RunException_sendStackTrace((String)null, var6); // L: 258
			this.error("crash"); // L: 259
		}

	} // L: 261

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "528489320"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 264
		if (this.canvas != null) { // L: 265
			this.canvas.removeFocusListener(this); // L: 266
			var1.remove(this.canvas); // L: 267
		}

		class7.canvasWidth = Math.max(var1.getWidth(), this.field194); // L: 269
		DecorativeObject.canvasHeight = Math.max(var1.getHeight(), this.field195); // L: 270
		Insets var2;
		if (this.frame != null) { // L: 271
			var2 = this.frame.getInsets(); // L: 272
			class7.canvasWidth -= var2.right + var2.left; // L: 273
			DecorativeObject.canvasHeight -= var2.top + var2.bottom; // L: 274
		}

		this.canvas = new Canvas(this); // L: 276
		var1.setBackground(Color.BLACK); // L: 277
		var1.setLayout((LayoutManager)null); // L: 278
		var1.add(this.canvas); // L: 279
		this.canvas.setSize(class7.canvasWidth, DecorativeObject.canvasHeight); // L: 280
		this.canvas.setVisible(true); // L: 281
		this.canvas.setBackground(Color.BLACK); // L: 282
		if (var1 == this.frame) { // L: 283
			var2 = this.frame.getInsets(); // L: 284
			this.canvas.setLocation(var2.left + this.canvasX, var2.top + this.canvasY); // L: 285
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 287
		}

		this.canvas.addFocusListener(this); // L: 288
		this.canvas.requestFocus(); // L: 289
		this.fullRedraw = true; // L: 290
		if (class119.rasterProvider != null && class7.canvasWidth == class119.rasterProvider.width && DecorativeObject.canvasHeight == class119.rasterProvider.height) { // L: 291
			((RasterProvider)class119.rasterProvider).setComponent(this.canvas); // L: 292
			class119.rasterProvider.drawFull(0, 0); // L: 293
		} else {
			class119.rasterProvider = new RasterProvider(class7.canvasWidth, DecorativeObject.canvasHeight, this.canvas); // L: 296
		}

		this.isCanvasInvalid = false; // L: 298
		this.field204 = class181.method3483(); // L: 299
	} // L: 300

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2076609540"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 303
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 304
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 305
				if (var1.endsWith("127.0.0.1")) { // L: 306
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 307
					}

					if (var1.endsWith("192.168.1.")) { // L: 308
						return true;
					} else {
						this.error("invalidhost"); // L: 309
						return false; // L: 310
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1529030128"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class181.method3483(); // L: 354
		long var3 = clientTickTimes[class362.field4262]; // L: 355
		clientTickTimes[class362.field4262] = var1; // L: 356
		class362.field4262 = class362.field4262 + 1 & 31; // L: 357
		if (0L != var3 && var1 > var3) { // L: 358
		}

		synchronized(this) { // L: 359
			class391.hasFocus = volatileFocus; // L: 360
		} // L: 361

		this.doCycle(); // L: 362
	} // L: 363

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 366
		long var2 = class181.method3483(); // L: 367
		long var4 = graphicsTickTimes[class398.field4437]; // L: 368
		graphicsTickTimes[class398.field4437] = var2; // L: 369
		class398.field4437 = class398.field4437 + 1 & 31; // L: 370
		if (var4 != 0L && var2 > var4) { // L: 371
			int var6 = (int)(var2 - var4); // L: 372
			fps = ((var6 >> 1) + 32000) / var6; // L: 373
		}

		if (++field201 - 1 > 50) { // L: 375
			field201 -= 50; // L: 376
			this.fullRedraw = true; // L: 377
			this.canvas.setSize(class7.canvasWidth, DecorativeObject.canvasHeight); // L: 378
			this.canvas.setVisible(true); // L: 379
			if (var1 == this.frame) { // L: 380
				Insets var7 = this.frame.getInsets(); // L: 381
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY); // L: 382
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 384
			}
		}

		if (this.isCanvasInvalid) { // L: 386
			this.replaceCanvas();
		}

		this.method429(); // L: 387
		this.draw(this.fullRedraw); // L: 388
		if (this.fullRedraw) { // L: 389
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 390
	} // L: 391

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	final void method429() {
		Bounds var1 = this.getFrameContentBounds(); // L: 394
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 395
			this.resizeCanvas(); // L: 396
			this.resizeCanvasNextFrame = false; // L: 397
		}

	} // L: 399

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	final void method518() {
		this.resizeCanvasNextFrame = true; // L: 402
	} // L: 403

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 406
			isKilled = true; // L: 407

			try {
				this.canvas.removeFocusListener(this); // L: 409
			} catch (Exception var5) { // L: 411
			}

			try {
				this.kill0(); // L: 413
			} catch (Exception var4) { // L: 415
			}

			if (this.frame != null) { // L: 416
				try {
					System.exit(0); // L: 418
				} catch (Throwable var3) { // L: 420
				}
			}

			if (taskHandler != null) { // L: 422
				try {
					taskHandler.close(); // L: 424
				} catch (Exception var2) { // L: 426
				}
			}

			this.vmethod1142(); // L: 428
		}
	} // L: 429

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1873118726"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1259435317"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-413320809"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1917361583"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-661894763"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 515
			if (class136.fontHelvetica13 == null) { // L: 516
				class136.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 517
				VarcInt.loginScreenFontMetrics = this.canvas.getFontMetrics(class136.fontHelvetica13); // L: 518
			}

			if (var3) { // L: 520
				var4.setColor(Color.black); // L: 521
				var4.fillRect(0, 0, class7.canvasWidth, DecorativeObject.canvasHeight); // L: 522
			}

			Color var5 = new Color(140, 17, 17); // L: 524

			try {
				if (UserComparator9.field1387 == null) { // L: 526
					UserComparator9.field1387 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = UserComparator9.field1387.getGraphics(); // L: 527
				var6.setColor(var5); // L: 528
				var6.drawRect(0, 0, 303, 33); // L: 529
				var6.fillRect(2, 2, var1 * 3, 30); // L: 530
				var6.setColor(Color.black); // L: 531
				var6.drawRect(1, 1, 301, 31); // L: 532
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 533
				var6.setFont(class136.fontHelvetica13); // L: 534
				var6.setColor(Color.white); // L: 535
				var6.drawString(var2, (304 - VarcInt.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 536
				var4.drawImage(UserComparator9.field1387, class7.canvasWidth / 2 - 152, DecorativeObject.canvasHeight / 2 - 18, (ImageObserver)null); // L: 537
			} catch (Exception var9) { // L: 539
				int var7 = class7.canvasWidth / 2 - 152; // L: 540
				int var8 = DecorativeObject.canvasHeight / 2 - 18; // L: 541
				var4.setColor(var5); // L: 542
				var4.drawRect(var7, var8, 303, 33); // L: 543
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 544
				var4.setColor(Color.black); // L: 545
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 546
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 547
				var4.setFont(class136.fontHelvetica13); // L: 548
				var4.setColor(Color.white); // L: 549
				var4.drawString(var2, var7 + (304 - VarcInt.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 550
			}
		} catch (Exception var10) { // L: 553
			this.canvas.repaint(); // L: 554
		}

	} // L: 556

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "553994578"
	)
	protected final void method481() {
		UserComparator9.field1387 = null; // L: 559
		class136.fontHelvetica13 = null; // L: 560
		VarcInt.loginScreenFontMetrics = null; // L: 561
	} // L: 562

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-67"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 565
			this.hasErrored = true; // L: 566
			System.out.println("error_game_" + var1); // L: 567

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 569
			} catch (Exception var3) { // L: 571
			}

		}
	} // L: 572

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "638528318"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 575
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lnh;",
		garbageValue = "-824541387"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 580
		int var2 = Math.max(var1.getWidth(), this.field194); // L: 581
		int var3 = Math.max(var1.getHeight(), this.field195); // L: 582
		if (this.frame != null) { // L: 583
			Insets var4 = this.frame.getInsets(); // L: 584
			var2 -= var4.right + var4.left; // L: 585
			var3 -= var4.bottom + var4.top; // L: 586
		}

		return new Bounds(var2, var3); // L: 588
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "684004979"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 592
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1773732375"
	)
	protected abstract void vmethod1142();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 452
			stopTimeMs = class181.method3483(); // L: 453
			class144.method3006(5000L); // L: 454
			this.kill(); // L: 455
		}
	} // L: 456

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 465
			this.fullRedraw = true; // L: 466
			if (class181.method3483() - this.field204 > 1000L) { // L: 467
				Rectangle var2 = var1.getClipBounds(); // L: 468
				if (var2 == null || var2.width >= class7.canvasWidth && var2.height >= DecorativeObject.canvasHeight) {
					this.isCanvasInvalid = true; // L: 469
				}
			}

		}
	} // L: 471

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 315
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 316
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 317
					String var2 = TaskHandler.javaVersion; // L: 318
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 319
						this.error("wrongjava"); // L: 320
						return; // L: 321
					}

					if (var2.startsWith("1.6.0_")) { // L: 323
						int var3;
						for (var3 = 6; var3 < var2.length() && UserComparator9.isDigit(var2.charAt(var3)); ++var3) { // L: 324 325
						}

						String var4 = var2.substring(6, var3); // L: 326
						if (class228.isNumber(var4) && AbstractUserComparator.method6644(var4) < 10) { // L: 327
							this.error("wrongjava"); // L: 328
							return; // L: 329
						}
					}

					fiveOrOne = 5; // L: 332
				}
			}

			this.setFocusCycleRoot(true); // L: 335
			this.addCanvas(); // L: 336
			this.setUp(); // L: 337
			class433.clock = InterfaceParent.method2057(); // L: 338

			while (stopTimeMs == 0L || class181.method3483() < stopTimeMs) { // L: 339
				gameCyclesToDo = class433.clock.wait(cycleDurationMillis, fiveOrOne); // L: 340

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) { // L: 341
					this.clientTick();
				}

				this.graphicsTick(); // L: 342
				this.post(this.canvas); // L: 343
			}
		} catch (Exception var6) { // L: 346
			class33.RunException_sendStackTrace((String)null, var6); // L: 347
			this.error("crash"); // L: 348
		}

		this.kill(); // L: 350
	} // L: 351

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 446
			stopTimeMs = class181.method3483() + 4000L; // L: 447
		}
	} // L: 448

	public final void update(Graphics var1) {
		this.paint(var1); // L: 460
	} // L: 461

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 475
		this.fullRedraw = true; // L: 476
	} // L: 477

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 481
	} // L: 482

	public final void windowActivated(WindowEvent var1) {
	} // L: 485

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 440
			stopTimeMs = 0L; // L: 441
		}
	} // L: 442

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 492
	} // L: 493

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 496

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 499

	public final void windowIconified(WindowEvent var1) {
	} // L: 502

	public abstract void init();

	public final void windowOpened(WindowEvent var1) {
	} // L: 505

	public final void windowClosed(WindowEvent var1) {
	} // L: 488

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "827517358"
	)
	static int method428(int var0, int var1) {
		FloorOverlayDefinition var3 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		FloorOverlayDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 22
			var3 = new FloorOverlayDefinition(); // L: 23
			if (var4 != null) { // L: 24
				var3.decode(new Buffer(var4), var0);
			}

			var3.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var3, (long)var0); // L: 26
			var2 = var3; // L: 27
		}

		if (var2 == null) { // L: 30
			return var1; // L: 31
		} else if (var2.secondaryRgb >= 0) { // L: 33
			return var2.secondaryRgb | -16777216; // L: 34
		} else {
			int var5;
			int var6;
			if (var2.texture >= 0) { // L: 36
				var5 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture); // L: 38
				byte var11 = 96; // L: 39
				int var10;
				if (var5 == -2) { // L: 41
					var10 = 12345678; // L: 42
				} else if (var5 == -1) { // L: 45
					if (var11 < 0) { // L: 46
						var11 = 0; // L: 47
					} else if (var11 > 127) { // L: 49
						var11 = 127; // L: 50
					}

					var6 = 127 - var11; // L: 52
					var10 = var6; // L: 53
				} else {
					var6 = var11 * (var5 & 127) / 128; // L: 56
					if (var6 < 2) { // L: 57
						var6 = 2;
					} else if (var6 > 126) { // L: 58
						var6 = 126;
					}

					var10 = var6 + (var5 & 65408); // L: 59
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216; // L: 62
			} else if (var2.primaryRgb == 16711935) { // L: 64
				return var1; // L: 65
			} else {
				var5 = var2.hue; // L: 69
				var6 = var2.saturation; // L: 70
				int var7 = var2.lightness; // L: 71
				if (var7 > 179) { // L: 73
					var6 /= 2;
				}

				if (var7 > 192) { // L: 74
					var6 /= 2;
				}

				if (var7 > 217) { // L: 75
					var6 /= 2;
				}

				if (var7 > 243) { // L: 76
					var6 /= 2;
				}

				int var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10); // L: 77
				int var9 = class16.method203(var8, 96); // L: 81
				return Rasterizer3D.Rasterizer3D_colorPalette[var9] | -16777216; // L: 82
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([Lld;II)Lld;",
		garbageValue = "744819292"
	)
	@Export("findEnumerated")
	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			MouseWheel var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcf;",
		garbageValue = "236781353"
	)
	static class82[] method528() {
		return new class82[]{class82.field1072, class82.field1063, class82.field1062, class82.field1064, class82.field1065}; // L: 16
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-614376120"
	)
	static final int method430(int var0, int var1) {
		if (var0 == -2) { // L: 1037
			return 12345678;
		} else if (var0 == -1) { // L: 1038
			if (var1 < 2) { // L: 1039
				var1 = 2;
			} else if (var1 > 126) { // L: 1040
				var1 = 126;
			}

			return var1; // L: 1041
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1043
			if (var1 < 2) { // L: 1044
				var1 = 2;
			} else if (var1 > 126) { // L: 1045
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1046
		}
	}
}
