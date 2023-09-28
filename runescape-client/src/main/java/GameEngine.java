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

@ObfuscatedName("bb")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1305497903
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 8835877799225346521L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ao")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -930687455
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1886768213
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1446749801
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ap")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1200938897
	)
	static int field213;
	@ObfuscatedName("as")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1100583403
	)
	static int field189;
	@ObfuscatedName("bu")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	static class25 field221;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		longValue = -65367739780708807L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		longValue = -8488585964670620007L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("ah")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2082037021
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1995809071
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1746844123
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1287662203
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1147235891
	)
	int field205;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1494277477
	)
	int field209;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -322747891
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 157292347
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bn")
	protected boolean field190;
	@ObfuscatedName("bd")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("be")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bv")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bb")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bo")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		longValue = 4719628075257332991L
	)
	volatile long field199;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bs")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bc")
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
		field189 = 500; // L: 74
		volatileFocus = true; // L: 83
		field221 = new class25(); // L: 85
		garbageCollectorLastCollectionTime = -1L; // L: 87
		garbageCollectorLastCheckTimeMs = -1L; // L: 88
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.field190 = false; // L: 67
		this.fullRedraw = true; // L: 72
		this.resizeCanvasNextFrame = false; // L: 75
		this.isCanvasInvalid = false; // L: 76
		this.field199 = 0L; // L: 77
		EventQueue var1 = null; // L: 91

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 93
		} catch (Throwable var3) { // L: 95
		}

		this.eventQueue = var1; // L: 96
		class403.method7413(new DevicePcmPlayerProvider()); // L: 97
	} // L: 98

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "119"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 101
			this.method502();
		}

		this.maxCanvasWidth = var1; // L: 102
		this.maxCanvasHeight = var2; // L: 103
	} // L: 104

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "-34"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 107
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 108
				Players.method2741(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 109
			}

		}
	} // L: 110

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lgc;",
		garbageValue = "643109691"
	)
	@Export("mouseWheel")
	protected class176 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 113
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 114
			this.mouseWheelHandler.addTo(this.canvas); // L: 115
		}

		return this.mouseWheelHandler; // L: 117
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-97772302"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 121
	} // L: 122

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1746840557"
	)
	protected void method558(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 125
	} // L: 126

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-375508984"
	)
	public Clipboard method485() {
		return this.clipboard; // L: 129
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "84"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		WorldMapSection2.method5264(); // L: 133
		field221.method343(this.canvas); // L: 134
	} // L: 135

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1343543797"
	)
	protected final void method539() {
		field221.method348(); // L: 142
	} // L: 143

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lbd;IS)V",
		garbageValue = "-1458"
	)
	protected void method488(class29 var1, int var2) {
		field221.method347(var1, var2); // L: 146
	} // L: 147

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1316323394"
	)
	protected final void method552() {
		Tiles.method2281(this.canvas); // L: 150
	} // L: 151

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-845812181"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 154
		if (var1 != null) { // L: 155
			Bounds var2 = this.getFrameContentBounds(); // L: 156
			this.contentWidth = Math.max(var2.highX, this.field205); // L: 157
			this.contentHeight = Math.max(var2.highY, this.field209); // L: 158
			if (this.contentWidth <= 0) { // L: 159
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 160
				this.contentHeight = 1;
			}

			class340.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 161
			class491.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 162
			this.canvasX = (this.contentWidth - class340.canvasWidth) / 2; // L: 163
			this.canvasY = 0; // L: 164
			this.canvas.setSize(class340.canvasWidth, class491.canvasHeight); // L: 165
			class223.rasterProvider = new RasterProvider(class340.canvasWidth, class491.canvasHeight, this.canvas, this.field190); // L: 166
			if (var1 == this.frame) { // L: 167
				Insets var3 = this.frame.getInsets(); // L: 168
				this.canvas.setLocation(var3.left + this.canvasX, var3.top + this.canvasY); // L: 169
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 171
			}

			this.fullRedraw = true; // L: 172
			this.vmethod1746(); // L: 173
		}
	} // L: 174

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-953371865"
	)
	protected abstract void vmethod1746();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "175147715"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 179
		int var2 = this.canvasY; // L: 180
		int var3 = this.contentWidth - class340.canvasWidth - var1; // L: 181
		int var4 = this.contentHeight - class491.canvasHeight - var2; // L: 182
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 183
			try {
				Container var5 = this.container(); // L: 185
				int var6 = 0; // L: 186
				int var7 = 0; // L: 187
				if (var5 == this.frame) { // L: 188
					Insets var8 = this.frame.getInsets(); // L: 189
					var6 = var8.left; // L: 190
					var7 = var8.top; // L: 191
				}

				Graphics var10 = var5.getGraphics(); // L: 193
				var10.setColor(Color.black); // L: 194
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 195
				}

				if (var2 > 0) { // L: 196
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 197
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 198
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 200
			}
		}

	} // L: 202

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1884885221"
	)
	final void method493() {
		field221.method357(this.canvas); // L: 205
		java.awt.Canvas var1 = this.canvas; // L: 206
		var1.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 208
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 209
		var1.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 210
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 211
		if (this.mouseWheelHandler != null) { // L: 213
			this.mouseWheelHandler.method301(this.canvas);
		}

		this.addCanvas(); // L: 214
		field221.method343(this.canvas); // L: 215
		Tiles.method2281(this.canvas); // L: 216
		if (this.mouseWheelHandler != null) { // L: 217
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method502(); // L: 218
	} // L: 219

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-749120852"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 223
				++GameEngine_redundantStartThreadCount; // L: 224
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 225
					this.error("alreadyloaded"); // L: 226
					return; // L: 227
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 229
				return; // L: 230
			}

			gameEngine = this; // L: 232
			class340.canvasWidth = var1; // L: 233
			class491.canvasHeight = var2; // L: 234
			RunException.RunException_revision = var3; // L: 235
			RunException.field5294 = var4; // L: 236
			class462.RunException_applet = this; // L: 237
			if (taskHandler == null) { // L: 238
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 239
		} catch (Exception var6) { // L: 241
			class190.RunException_sendStackTrace((String)null, var6); // L: 242
			this.error("crash"); // L: 243
		}

	} // L: 245

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2110760887"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 248
		if (this.canvas != null) { // L: 249
			this.canvas.removeFocusListener(this); // L: 250
			var1.remove(this.canvas); // L: 251
		}

		class340.canvasWidth = Math.max(var1.getWidth(), this.field205); // L: 253
		class491.canvasHeight = Math.max(var1.getHeight(), this.field209); // L: 254
		Insets var2;
		if (this.frame != null) { // L: 255
			var2 = this.frame.getInsets(); // L: 256
			class340.canvasWidth -= var2.right + var2.left; // L: 257
			class491.canvasHeight -= var2.top + var2.bottom; // L: 258
		}

		this.canvas = new Canvas(this); // L: 260
		var1.setBackground(Color.BLACK); // L: 261
		var1.setLayout((LayoutManager)null); // L: 262
		var1.add(this.canvas); // L: 263
		this.canvas.setSize(class340.canvasWidth, class491.canvasHeight); // L: 264
		this.canvas.setVisible(true); // L: 265
		this.canvas.setBackground(Color.BLACK); // L: 266
		if (var1 == this.frame) { // L: 267
			var2 = this.frame.getInsets(); // L: 268
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top); // L: 269
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 271
		}

		this.canvas.addFocusListener(this); // L: 272
		this.canvas.requestFocus(); // L: 273
		this.fullRedraw = true; // L: 274
		if (class223.rasterProvider != null && class340.canvasWidth == class223.rasterProvider.width && class491.canvasHeight == class223.rasterProvider.height) { // L: 275
			((RasterProvider)class223.rasterProvider).setComponent(this.canvas); // L: 276
			class223.rasterProvider.drawFull(0, 0); // L: 277
		} else {
			class223.rasterProvider = new RasterProvider(class340.canvasWidth, class491.canvasHeight, this.canvas, this.field190); // L: 280
		}

		this.isCanvasInvalid = false; // L: 282
		this.field199 = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 283
	} // L: 284

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2016311208"
	)
	protected void method496(boolean var1) {
		if (this.field190 != var1) { // L: 287
			this.field190 = var1; // L: 288
			class223.rasterProvider.method9630(var1); // L: 289
			class223.rasterProvider.apply(); // L: 290
		}

	} // L: 292

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1592501950"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 295
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 296
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 297
				if (var1.endsWith("127.0.0.1")) { // L: 298
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') { // L: 299
						var1 = var1.substring(0, var1.length() - 1);
					}

					if (var1.endsWith("192.168.1.")) { // L: 300
						return true;
					} else {
						this.error("invalidhost"); // L: 301
						return false; // L: 302
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 350
		long var3 = clientTickTimes[class178.field1853]; // L: 351
		clientTickTimes[class178.field1853] = var1; // L: 352
		class178.field1853 = class178.field1853 + 1 & 31; // L: 353
		if (var3 != 0L && var1 > var3) { // L: 354
		}

		synchronized(this) { // L: 355
			class25.hasFocus = volatileFocus; // L: 356
		} // L: 357

		this.doCycle(); // L: 358
	} // L: 359

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	protected final void method615() {
		this.fullRedraw = true; // L: 362
	} // L: 363

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1944967760"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 366
		long var2 = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 367
		long var4 = graphicsTickTimes[field213]; // L: 368
		graphicsTickTimes[field213] = var2; // L: 369
		field213 = field213 + 1 & 31; // L: 370
		if (var4 != 0L && var2 > var4) { // L: 371
			int var6 = (int)(var2 - var4); // L: 372
			fps = ((var6 >> 1) + 32000) / var6; // L: 373
		}

		if (++field189 - 1 > 50) { // L: 375
			field189 -= 50; // L: 376
			this.fullRedraw = true; // L: 377
			this.canvas.setSize(class340.canvasWidth, class491.canvasHeight); // L: 378
			this.canvas.setVisible(true); // L: 379
			if (var1 == this.frame) { // L: 380
				Insets var7 = this.frame.getInsets(); // L: 381
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top); // L: 382
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 384
			}
		}

		if (this.isCanvasInvalid) { // L: 386
			this.method493();
		}

		this.method553(); // L: 387
		this.draw(this.fullRedraw); // L: 388
		if (this.fullRedraw) { // L: 389
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 390
	} // L: 391

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	final void method553() {
		Bounds var1 = this.getFrameContentBounds(); // L: 394
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 395
			this.resizeCanvas(); // L: 396
			this.resizeCanvasNextFrame = false; // L: 397
		}

	} // L: 399

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-351835050"
	)
	final void method502() {
		this.resizeCanvasNextFrame = true; // L: 402
	} // L: 403

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "17082"
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

			this.vmethod1244(); // L: 428
		}
	} // L: 429

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-84"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-800201684"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "40"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1875481219"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "234034519"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 515
			if (class14.fontHelvetica13 == null) { // L: 516
				class14.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 517
				class14.loginScreenFontMetrics = this.canvas.getFontMetrics(class14.fontHelvetica13); // L: 518
			}

			if (var3) { // L: 520
				var4.setColor(Color.black); // L: 521
				var4.fillRect(0, 0, class340.canvasWidth, class491.canvasHeight); // L: 522
			}

			Color var5 = new Color(140, 17, 17); // L: 524

			try {
				if (class319.field3443 == null) { // L: 526
					class319.field3443 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class319.field3443.getGraphics(); // L: 527
				var6.setColor(var5); // L: 528
				var6.drawRect(0, 0, 303, 33); // L: 529
				var6.fillRect(2, 2, var1 * 3, 30); // L: 530
				var6.setColor(Color.black); // L: 531
				var6.drawRect(1, 1, 301, 31); // L: 532
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 533
				var6.setFont(class14.fontHelvetica13); // L: 534
				var6.setColor(Color.white); // L: 535
				var6.drawString(var2, (304 - class14.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 536
				var4.drawImage(class319.field3443, class340.canvasWidth / 2 - 152, class491.canvasHeight / 2 - 18, (ImageObserver)null); // L: 537
			} catch (Exception var9) { // L: 539
				int var7 = class340.canvasWidth / 2 - 152; // L: 540
				int var8 = class491.canvasHeight / 2 - 18; // L: 541
				var4.setColor(var5); // L: 542
				var4.drawRect(var7, var8, 303, 33); // L: 543
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 544
				var4.setColor(Color.black); // L: 545
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 546
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 547
				var4.setFont(class14.fontHelvetica13); // L: 548
				var4.setColor(Color.white); // L: 549
				var4.drawString(var2, var7 + (304 - class14.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 550
			}
		} catch (Exception var10) { // L: 553
			this.canvas.repaint(); // L: 554
		}

	} // L: 556

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "403874015"
	)
	protected final void method514() {
		class319.field3443 = null; // L: 559
		class14.fontHelvetica13 = null; // L: 560
		class14.loginScreenFontMetrics = null; // L: 561
	} // L: 562

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1574795554"
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "91"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 575
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lrx;",
		garbageValue = "-138440448"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 580
		int var2 = Math.max(var1.getWidth(), this.field205); // L: 581
		int var3 = Math.max(var1.getHeight(), this.field209); // L: 582
		if (this.frame != null) { // L: 583
			Insets var4 = this.frame.getInsets(); // L: 584
			var2 -= var4.right + var4.left; // L: 585
			var3 -= var4.bottom + var4.top; // L: 586
		}

		return new Bounds(var2, var3); // L: 588
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1209134026"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 592
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "390692392"
	)
	protected abstract void vmethod1244();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 465
			this.fullRedraw = true; // L: 466
			if (GrandExchangeOfferTotalQuantityComparator.method7049() - this.field199 > 1000L) { // L: 467
				Rectangle var2 = var1.getClipBounds(); // L: 468
				if (var2 == null || var2.width >= class340.canvasWidth && var2.height >= class491.canvasHeight) {
					this.isCanvasInvalid = true; // L: 469
				}
			}

		}
	} // L: 471

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 452
			stopTimeMs = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 453
			Players.method2741(5000L); // L: 454
			this.kill(); // L: 455
		}
	} // L: 456

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 446
			stopTimeMs = GrandExchangeOfferTotalQuantityComparator.method7049() + 4000L; // L: 447
		}
	} // L: 448

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 307
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 308
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 309
					String var2 = TaskHandler.javaVersion; // L: 310
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 311
						this.error("wrongjava"); // L: 312
						return; // L: 313
					}

					if (var2.startsWith("1.6.0_")) { // L: 315
						int var3;
						for (var3 = 6; var3 < var2.length() && IsaacCipher.isDigit(var2.charAt(var3)); ++var3) { // L: 316 317
						}

						String var4 = var2.substring(6, var3); // L: 318
						if (AttackOption.isNumber(var4) && class36.method686(var4) < 10) { // L: 319
							this.error("wrongjava"); // L: 320
							return; // L: 321
						}
					}

					fiveOrOne = 5; // L: 324
				}
			}

			this.setFocusCycleRoot(true); // L: 327
			this.addCanvas(); // L: 329
			this.setUp(); // L: 331
			class314.clock = WorldMapScaleHandler.method5764(); // L: 332

			while (0L == stopTimeMs || GrandExchangeOfferTotalQuantityComparator.method7049() < stopTimeMs) { // L: 333
				class160.gameCyclesToDo = class314.clock.wait(cycleDurationMillis, fiveOrOne); // L: 334

				for (int var5 = 0; var5 < class160.gameCyclesToDo; ++var5) { // L: 335
					this.clientTick();
				}

				this.graphicsTick(); // L: 337
				this.post(this.canvas); // L: 339
			}
		} catch (Exception var6) { // L: 342
			class190.RunException_sendStackTrace((String)null, var6); // L: 343
			this.error("crash"); // L: 344
		}

		this.kill(); // L: 346
	} // L: 347

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

	public final void windowClosed(WindowEvent var1) {
	} // L: 488

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 492
	} // L: 493

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 499

	public final void windowOpened(WindowEvent var1) {
	} // L: 505

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 496

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 440
			stopTimeMs = 0L; // L: 441
		}
	} // L: 442

	public final void windowIconified(WindowEvent var1) {
	} // L: 502

	public abstract void init();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1715864689"
	)
	static void method647(int var0) {
		if (var0 != Login.loginIndex) { // L: 2017
			Login.loginIndex = var0; // L: 2018
		}
	} // L: 2019
}
