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

@ObfuscatedName("bq")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1863245799
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -3324604039741634181L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("as")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1313438219
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -377430971
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -439267215
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ah")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("aa")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -346598077
	)
	static int field218;
	@ObfuscatedName("bk")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	static class25 field230;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		longValue = 4046338742853434797L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		longValue = 7369086245763451971L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("aj")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1468468173
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -231129273
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 276625879
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -236030865
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 829298111
	)
	int field214;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -997891979
	)
	int field215;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 484091823
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 356697101
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bd")
	protected boolean field210;
	@ObfuscatedName("ba")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bf")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bs")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bq")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bo")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		longValue = 9169858083731276043L
	)
	volatile long field229;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bi")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bu")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null;
		GameEngine_redundantStartThreadCount = 0;
		stopTimeMs = 0L;
		isKilled = false;
		cycleDurationMillis = 20; // L: 48
		fiveOrOne = 1; // L: 49
		fps = 0;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32]; // L: 55
		field218 = 500; // L: 74
		volatileFocus = true; // L: 83
		field230 = new class25(); // L: 85
		garbageCollectorLastCollectionTime = -1L; // L: 87
		garbageCollectorLastCheckTimeMs = -1L; // L: 88
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.field210 = false; // L: 67
		this.fullRedraw = true; // L: 72
		this.resizeCanvasNextFrame = false; // L: 75
		this.isCanvasInvalid = false; // L: 76
		this.field229 = 0L; // L: 77
		EventQueue var1 = null; // L: 91

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 93
		} catch (Throwable var3) { // L: 95
		}

		this.eventQueue = var1; // L: 96
		HorizontalAlignment.method3697(new DevicePcmPlayerProvider()); // L: 97
	} // L: 98

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1942642885"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 101
			this.method494();
		}

		this.maxCanvasWidth = var1; // L: 102
		this.maxCanvasHeight = var2; // L: 103
	} // L: 104

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "198791699"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 107
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 108
				class13.method180(1L);
			}

			if (var1 != null) { // L: 109
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	} // L: 110

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lgf;",
		garbageValue = "1549057161"
	)
	@Export("mouseWheel")
	protected class174 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 113
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 114
			this.mouseWheelHandler.addTo(this.canvas); // L: 115
		}

		return this.mouseWheelHandler; // L: 117
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 121
	} // L: 122

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1812985969"
	)
	protected void method620(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 125
	} // L: 126

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "1105846557"
	)
	protected Clipboard method478() {
		return this.clipboard; // L: 129
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1263435879"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class306.method5812(); // L: 133
		field230.method348(this.canvas); // L: 134
	} // L: 135

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "22228"
	)
	protected final void method480() {
		field230.method350(); // L: 142
	} // L: 143

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lba;II)V",
		garbageValue = "1385664005"
	)
	protected void method481(class29 var1, int var2) {
		field230.method345(var1, var2); // L: 146
	} // L: 147

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	protected final void method485() {
		WorldMapDecorationType.method6642(this.canvas); // L: 150
	} // L: 151

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "712495605"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 154
		if (var1 != null) { // L: 155
			Bounds var2 = this.getFrameContentBounds(); // L: 156
			this.contentWidth = Math.max(var2.highX, this.field214); // L: 157
			this.contentHeight = Math.max(var2.highY, this.field215); // L: 158
			if (this.contentWidth <= 0) { // L: 159
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 160
				this.contentHeight = 1;
			}

			GrandExchangeOfferTotalQuantityComparator.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 161
			WorldMapArchiveLoader.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 162
			this.canvasX = (this.contentWidth - GrandExchangeOfferTotalQuantityComparator.canvasWidth) / 2; // L: 163
			this.canvasY = 0; // L: 164
			this.canvas.setSize(GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight); // L: 165
			class156.rasterProvider = new RasterProvider(GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight, this.canvas, this.field210); // L: 166
			if (var1 == this.frame) { // L: 167
				Insets var3 = this.frame.getInsets(); // L: 168
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY); // L: 169
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 171
			}

			this.fullRedraw = true; // L: 172
			this.resizeGame(); // L: 173
		}
	} // L: 174

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 179
		int var2 = this.canvasY; // L: 180
		int var3 = this.contentWidth - GrandExchangeOfferTotalQuantityComparator.canvasWidth - var1; // L: 181
		int var4 = this.contentHeight - WorldMapArchiveLoader.canvasHeight - var2; // L: 182
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1818250139"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field230.method349(this.canvas); // L: 205
		java.awt.Canvas var1 = this.canvas; // L: 206
		var1.removeMouseListener(MouseHandler.KeyHandler_instance); // L: 208
		var1.removeMouseMotionListener(MouseHandler.KeyHandler_instance); // L: 209
		var1.removeFocusListener(MouseHandler.KeyHandler_instance); // L: 210
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 211
		if (this.mouseWheelHandler != null) { // L: 213
			this.mouseWheelHandler.method300(this.canvas);
		}

		this.addCanvas(); // L: 214
		field230.method348(this.canvas); // L: 215
		WorldMapDecorationType.method6642(this.canvas); // L: 216
		if (this.mouseWheelHandler != null) { // L: 217
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method494(); // L: 218
	} // L: 219

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "52"
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
			GrandExchangeOfferTotalQuantityComparator.canvasWidth = var1; // L: 233
			WorldMapArchiveLoader.canvasHeight = var2; // L: 234
			RunException.RunException_revision = var3; // L: 235
			RunException.field5235 = var4; // L: 236
			RunException.RunException_applet = this; // L: 237
			if (taskHandler == null) { // L: 238
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 239
		} catch (Exception var6) { // L: 241
			class317.RunException_sendStackTrace((String)null, var6); // L: 242
			this.error("crash"); // L: 243
		}

	} // L: 245

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-679598443"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 248
		if (this.canvas != null) { // L: 249
			this.canvas.removeFocusListener(this); // L: 250
			var1.remove(this.canvas); // L: 251
		}

		GrandExchangeOfferTotalQuantityComparator.canvasWidth = Math.max(var1.getWidth(), this.field214); // L: 253
		WorldMapArchiveLoader.canvasHeight = Math.max(var1.getHeight(), this.field215); // L: 254
		Insets var2;
		if (this.frame != null) { // L: 255
			var2 = this.frame.getInsets(); // L: 256
			GrandExchangeOfferTotalQuantityComparator.canvasWidth -= var2.left + var2.right; // L: 257
			WorldMapArchiveLoader.canvasHeight -= var2.bottom + var2.top; // L: 258
		}

		this.canvas = new Canvas(this); // L: 260
		var1.setBackground(Color.BLACK); // L: 261
		var1.setLayout((LayoutManager)null); // L: 262
		var1.add(this.canvas); // L: 263
		this.canvas.setSize(GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight); // L: 264
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
		if (class156.rasterProvider != null && GrandExchangeOfferTotalQuantityComparator.canvasWidth == class156.rasterProvider.width && WorldMapArchiveLoader.canvasHeight == class156.rasterProvider.height) { // L: 275
			((RasterProvider)class156.rasterProvider).setComponent(this.canvas); // L: 276
			class156.rasterProvider.drawFull(0, 0); // L: 277
		} else {
			class156.rasterProvider = new RasterProvider(GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight, this.canvas, this.field210); // L: 280
		}

		this.isCanvasInvalid = false; // L: 282
		this.field229 = class113.method2835(); // L: 283
	} // L: 284

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-823616991"
	)
	protected void method489(boolean var1) {
		if (this.field210 != var1) { // L: 287
			this.field210 = var1; // L: 288
			class156.rasterProvider.method9514(var1); // L: 289
			class156.rasterProvider.apply(); // L: 290
		}

	} // L: 292

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "120"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 295
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 296
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 297
				if (var1.endsWith("127.0.0.1")) { // L: 298
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 299
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

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-968211231"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class113.method2835(); // L: 355
		long var3 = clientTickTimes[class1.field6]; // L: 356
		clientTickTimes[class1.field6] = var1; // L: 357
		class1.field6 = class1.field6 + 1 & 31; // L: 358
		if (var3 != 0L && var1 > var3) { // L: 359
		}

		synchronized(this) { // L: 360
			class326.hasFocus = volatileFocus; // L: 361
		} // L: 362

		this.doCycle(); // L: 363
	} // L: 364

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "939490922"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 367
		long var2 = class113.method2835(); // L: 368
		long var4 = graphicsTickTimes[class300.field3348]; // L: 369
		graphicsTickTimes[class300.field3348] = var2; // L: 370
		class300.field3348 = class300.field3348 + 1 & 31; // L: 371
		if (var4 != 0L && var2 > var4) { // L: 372
			int var6 = (int)(var2 - var4); // L: 373
			fps = ((var6 >> 1) + 32000) / var6; // L: 374
		}

		if (++field218 - 1 > 50) { // L: 376
			field218 -= 50; // L: 377
			this.fullRedraw = true; // L: 378
			this.canvas.setSize(GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight); // L: 379
			this.canvas.setVisible(true); // L: 380
			if (var1 == this.frame) { // L: 381
				Insets var7 = this.frame.getInsets(); // L: 382
				this.canvas.setLocation(var7.left + this.canvasX, var7.top + this.canvasY); // L: 383
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 385
			}
		}

		if (this.isCanvasInvalid) { // L: 387
			this.replaceCanvas();
		}

		this.method509(); // L: 388
		this.draw(this.fullRedraw); // L: 389
		if (this.fullRedraw) { // L: 390
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 391
	} // L: 392

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1856767081"
	)
	final void method509() {
		Bounds var1 = this.getFrameContentBounds(); // L: 395
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 396
			this.resizeCanvas(); // L: 397
			this.resizeCanvasNextFrame = false; // L: 398
		}

	} // L: 400

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-227400118"
	)
	final void method494() {
		this.resizeCanvasNextFrame = true; // L: 403
	} // L: 404

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 407
			isKilled = true; // L: 408

			try {
				this.canvas.removeFocusListener(this); // L: 410
			} catch (Exception var5) { // L: 412
			}

			try {
				this.kill0(); // L: 414
			} catch (Exception var4) { // L: 416
			}

			if (this.frame != null) { // L: 417
				try {
					System.exit(0); // L: 419
				} catch (Throwable var3) { // L: 421
				}
			}

			if (taskHandler != null) { // L: 423
				try {
					taskHandler.close(); // L: 425
				} catch (Exception var2) { // L: 427
				}
			}

			this.vmethod1262(); // L: 429
		}
	} // L: 430

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "72"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "443189499"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-23"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZB)V",
		garbageValue = "-29"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 516
			if (SoundSystem.fontHelvetica13 == null) { // L: 517
				SoundSystem.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 518
				class14.loginScreenFontMetrics = this.canvas.getFontMetrics(SoundSystem.fontHelvetica13); // L: 519
			}

			if (var3) { // L: 521
				var4.setColor(Color.black); // L: 522
				var4.fillRect(0, 0, GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight); // L: 523
			}

			Color var5 = new Color(140, 17, 17); // L: 525

			try {
				if (class467.field4803 == null) { // L: 527
					class467.field4803 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class467.field4803.getGraphics(); // L: 528
				var6.setColor(var5); // L: 529
				var6.drawRect(0, 0, 303, 33); // L: 530
				var6.fillRect(2, 2, var1 * 3, 30); // L: 531
				var6.setColor(Color.black); // L: 532
				var6.drawRect(1, 1, 301, 31); // L: 533
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 534
				var6.setFont(SoundSystem.fontHelvetica13); // L: 535
				var6.setColor(Color.white); // L: 536
				var6.drawString(var2, (304 - class14.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 537
				var4.drawImage(class467.field4803, GrandExchangeOfferTotalQuantityComparator.canvasWidth / 2 - 152, WorldMapArchiveLoader.canvasHeight / 2 - 18, (ImageObserver)null); // L: 538
			} catch (Exception var9) { // L: 540
				int var7 = GrandExchangeOfferTotalQuantityComparator.canvasWidth / 2 - 152; // L: 541
				int var8 = WorldMapArchiveLoader.canvasHeight / 2 - 18; // L: 542
				var4.setColor(var5); // L: 543
				var4.drawRect(var7, var8, 303, 33); // L: 544
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 545
				var4.setColor(Color.black); // L: 546
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 547
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 548
				var4.setFont(SoundSystem.fontHelvetica13); // L: 549
				var4.setColor(Color.white); // L: 550
				var4.drawString(var2, var7 + (304 - class14.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 551
			}
		} catch (Exception var10) { // L: 554
			this.canvas.repaint(); // L: 555
		}

	} // L: 557

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	protected final void method634() {
		class467.field4803 = null; // L: 560
		SoundSystem.fontHelvetica13 = null; // L: 561
		class14.loginScreenFontMetrics = null; // L: 562
	} // L: 563

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-845408623"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 566
			this.hasErrored = true; // L: 567
			System.out.println("error_game_" + var1); // L: 568

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 570
			} catch (Exception var3) { // L: 572
			}

		}
	} // L: 573

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-1949821746"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 576
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Lrk;",
		garbageValue = "483391550"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 581
		int var2 = Math.max(var1.getWidth(), this.field214); // L: 582
		int var3 = Math.max(var1.getHeight(), this.field215); // L: 583
		if (this.frame != null) { // L: 584
			Insets var4 = this.frame.getInsets(); // L: 585
			var2 -= var4.left + var4.right; // L: 586
			var3 -= var4.top + var4.bottom; // L: 587
		}

		return new Bounds(var2, var3); // L: 589
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1832672848"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 593
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2050335898"
	)
	protected abstract void vmethod1262();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 466
			this.fullRedraw = true; // L: 467
			if (class113.method2835() - this.field229 > 1000L) { // L: 468
				Rectangle var2 = var1.getClipBounds(); // L: 469
				if (var2 == null || var2.width >= GrandExchangeOfferTotalQuantityComparator.canvasWidth && var2.height >= WorldMapArchiveLoader.canvasHeight) {
					this.isCanvasInvalid = true; // L: 470
				}
			}

		}
	} // L: 472

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 453
			stopTimeMs = class113.method2835(); // L: 454
			class13.method180(5000L); // L: 455
			this.kill(); // L: 456
		}
	} // L: 457

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 476
		this.fullRedraw = true; // L: 477
	} // L: 478

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 447
			stopTimeMs = class113.method2835() + 4000L; // L: 448
		}
	} // L: 449

	public final void update(Graphics var1) {
		this.paint(var1); // L: 461
	} // L: 462

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 482
	} // L: 483

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 493
	} // L: 494

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 500

	public final void windowOpened(WindowEvent var1) {
	} // L: 506

	public abstract void init();

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 441
			stopTimeMs = 0L; // L: 442
		}
	} // L: 443

	public final void windowActivated(WindowEvent var1) {
	} // L: 486

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
						for (var3 = 6; var3 < var2.length() && class164.isDigit(var2.charAt(var3)); ++var3) { // L: 316 317
						}

						String var4 = var2.substring(6, var3); // L: 318
						if (Skeleton.isNumber(var4) && class306.method5811(var4) < 10) { // L: 319
							this.error("wrongjava"); // L: 320
							return; // L: 321
						}
					}

					fiveOrOne = 5; // L: 324
				}
			}

			this.setFocusCycleRoot(true); // L: 327
			this.addCanvas(); // L: 328
			this.setUp(); // L: 329

			Object var8;
			try {
				var8 = new NanoClock(); // L: 333
			} catch (Throwable var6) { // L: 335
				var8 = new MilliClock(); // L: 336
			}

			FloorUnderlayDefinition.clock = (Clock)var8; // L: 339

			while (stopTimeMs == 0L || class113.method2835() < stopTimeMs) { // L: 340
				class313.gameCyclesToDo = FloorUnderlayDefinition.clock.wait(cycleDurationMillis, fiveOrOne); // L: 341

				for (int var5 = 0; var5 < class313.gameCyclesToDo; ++var5) { // L: 342
					this.clientTick();
				}

				this.graphicsTick(); // L: 343
				this.post(this.canvas); // L: 344
			}
		} catch (Exception var7) { // L: 347
			class317.RunException_sendStackTrace((String)null, var7); // L: 348
			this.error("crash"); // L: 349
		}

		this.kill(); // L: 351
	} // L: 352

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 497

	public final void windowIconified(WindowEvent var1) {
	} // L: 503

	public final void windowClosed(WindowEvent var1) {
	} // L: 489

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhh;",
		garbageValue = "380782889"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 17
		if (var1 != null) { // L: 18
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 19
			var1 = new InvDefinition(); // L: 20
			if (var2 != null) { // L: 21
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 22
			return var1; // L: 23
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldc;",
		garbageValue = "-91"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = UserComparator3.method2885(var1, var0); // L: 38
		Script var4 = class30.method448(var3, var0); // L: 39
		if (var4 != null) { // L: 40
			return var4; // L: 41
		} else {
			var3 = class135.method3050(var2, var0); // L: 43
			var4 = class30.method448(var3, var0); // L: 44
			if (var4 != null) { // L: 45
				return var4; // L: 46
			} else {
				int var5 = var0 + -512; // L: 50
				var4 = class30.method448(var5, var0); // L: 53
				return var4 != null ? var4 : null; // L: 54 57
			}
		}
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(IIIILud;Lmi;I)V",
		garbageValue = "-1471720013"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12611
			int var6 = Client.camAngleY & 2047; // L: 12612
			int var7 = var3 * var3 + var2 * var2; // L: 12613
			if (var7 <= 6400) { // L: 12614
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12615
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12616
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12617
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12618
				if (var7 > 2500) {
					var4.method9583(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12619
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12620
				}

			}
		}
	} // L: 12621
}
