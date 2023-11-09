import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
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

@ObfuscatedName("bi")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1574946067
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 2212485446262413833L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ay")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1278152593
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1908982175
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -471703829
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -284909169
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("as")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ag")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("bn")
	static Image field201;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 79761729
	)
	static int field208;
	@ObfuscatedName("br")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	static class25 field210;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		longValue = -2778440112655418225L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		longValue = 5266952174062464991L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "[Lum;"
	)
	static IndexedSprite[] field190;
	@ObfuscatedName("ap")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2105601667
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1128314719
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1142371653
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1801214755
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1892706105
	)
	int field193;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1420026333
	)
	int field194;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1222383845
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1627575265
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bm")
	protected boolean field200;
	@ObfuscatedName("bc")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bw")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bq")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bi")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bj")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		longValue = 40331917466743725L
	)
	volatile long field205;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("be")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bp")
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
		field208 = 500; // L: 74
		volatileFocus = true; // L: 83
		field210 = new class25(); // L: 85
		garbageCollectorLastCollectionTime = -1L; // L: 87
		garbageCollectorLastCheckTimeMs = -1L; // L: 88
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.field200 = false; // L: 67
		this.fullRedraw = true; // L: 72
		this.resizeCanvasNextFrame = false; // L: 75
		this.isCanvasInvalid = false; // L: 76
		this.field205 = 0L; // L: 77
		EventQueue var1 = null; // L: 91

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 93
		} catch (Throwable var3) { // L: 95
		}

		this.eventQueue = var1; // L: 96
		World.method1848(new DevicePcmPlayerProvider()); // L: 97
	} // L: 98

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1456672394"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 101
			this.method597();
		}

		this.maxCanvasWidth = var1; // L: 102
		this.maxCanvasHeight = var2; // L: 103
	} // L: 104

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "-41"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 107
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 108
				class9.method82(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 109
			}

		}
	} // L: 110

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lgk;",
		garbageValue = "-633789081"
	)
	@Export("mouseWheel")
	protected class175 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 113
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 114
			this.mouseWheelHandler.addTo(this.canvas); // L: 115
		}

		return this.mouseWheelHandler; // L: 117
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1144688661"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 121
	} // L: 122

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1008758710"
	)
	protected void method543(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 125
	} // L: 126

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "201133727"
	)
	protected Clipboard method608() {
		return this.clipboard; // L: 129
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-15950"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class9.method87(); // L: 133
		field210.method374(this.canvas); // L: 134
	} // L: 135

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
	)
	protected final void method513() {
		field210.method372(); // L: 142
	} // L: 143

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lbc;II)V",
		garbageValue = "-1014488455"
	)
	protected void method573(class29 var1, int var2) {
		field210.method393(var1, var2); // L: 146
	} // L: 147

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "21808"
	)
	protected final void method633() {
		java.awt.Canvas var1 = this.canvas; // L: 150
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 152
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 153
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 154
	} // L: 156

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-865881441"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 159
		if (var1 != null) { // L: 160
			Bounds var2 = this.getFrameContentBounds(); // L: 161
			this.contentWidth = Math.max(var2.highX, this.field193); // L: 162
			this.contentHeight = Math.max(var2.highY, this.field194); // L: 163
			if (this.contentWidth <= 0) { // L: 164
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 165
				this.contentHeight = 1;
			}

			VarbitComposition.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 166
			class370.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 167
			this.canvasX = (this.contentWidth - VarbitComposition.canvasWidth) / 2; // L: 168
			this.canvasY = 0; // L: 169
			this.canvas.setSize(VarbitComposition.canvasWidth, class370.canvasHeight); // L: 170
			KitDefinition.rasterProvider = new RasterProvider(VarbitComposition.canvasWidth, class370.canvasHeight, this.canvas, this.field200); // L: 171
			if (var1 == this.frame) { // L: 172
				Insets var3 = this.frame.getInsets(); // L: 173
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY); // L: 174
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 176
			}

			this.fullRedraw = true; // L: 177
			this.resizeGame(); // L: 178
		}
	} // L: 179

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "27722679"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-88104159"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 184
		int var2 = this.canvasY; // L: 185
		int var3 = this.contentWidth - VarbitComposition.canvasWidth - var1; // L: 186
		int var4 = this.contentHeight - class370.canvasHeight - var2; // L: 187
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 188
			try {
				Container var5 = this.container(); // L: 190
				int var6 = 0; // L: 191
				int var7 = 0; // L: 192
				if (var5 == this.frame) { // L: 193
					Insets var8 = this.frame.getInsets(); // L: 194
					var6 = var8.left; // L: 195
					var7 = var8.top; // L: 196
				}

				Graphics var10 = var5.getGraphics(); // L: 198
				var10.setColor(Color.black); // L: 199
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 200
				}

				if (var2 > 0) { // L: 201
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 202
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 203
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 205
			}
		}

	} // L: 207

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1036827622"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field210.method371(this.canvas); // L: 210
		java.awt.Canvas var1 = this.canvas; // L: 211
		var1.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 213
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 214
		var1.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 215
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 216
		if (this.mouseWheelHandler != null) { // L: 218
			this.mouseWheelHandler.method327(this.canvas);
		}

		this.addCanvas(); // L: 219
		field210.method374(this.canvas); // L: 220
		java.awt.Canvas var2 = this.canvas; // L: 221
		var2.addMouseListener(MouseHandler.MouseHandler_instance); // L: 223
		var2.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 224
		var2.addFocusListener(MouseHandler.MouseHandler_instance); // L: 225
		if (this.mouseWheelHandler != null) { // L: 227
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method597(); // L: 228
	} // L: 229

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1251072475"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 233
				++GameEngine_redundantStartThreadCount; // L: 234
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 235
					this.error("alreadyloaded"); // L: 236
					return; // L: 237
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 239
				return; // L: 240
			}

			gameEngine = this; // L: 242
			VarbitComposition.canvasWidth = var1; // L: 243
			class370.canvasHeight = var2; // L: 244
			RunException.RunException_revision = var3; // L: 245
			Skeleton.field2553 = var4; // L: 246
			RunException.RunException_applet = this; // L: 247
			if (taskHandler == null) { // L: 248
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 249
		} catch (Exception var6) { // L: 251
			MusicPatchNode.RunException_sendStackTrace((String)null, var6); // L: 252
			this.error("crash"); // L: 253
		}

	} // L: 255

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1547628296"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 258
		if (this.canvas != null) { // L: 259
			this.canvas.removeFocusListener(this); // L: 260
			var1.remove(this.canvas); // L: 261
		}

		VarbitComposition.canvasWidth = Math.max(var1.getWidth(), this.field193); // L: 263
		class370.canvasHeight = Math.max(var1.getHeight(), this.field194); // L: 264
		Insets var2;
		if (this.frame != null) { // L: 265
			var2 = this.frame.getInsets(); // L: 266
			VarbitComposition.canvasWidth -= var2.left + var2.right; // L: 267
			class370.canvasHeight -= var2.bottom + var2.top; // L: 268
		}

		this.canvas = new Canvas(this); // L: 270
		var1.setBackground(Color.BLACK); // L: 271
		var1.setLayout((LayoutManager)null); // L: 272
		var1.add(this.canvas); // L: 273
		this.canvas.setSize(VarbitComposition.canvasWidth, class370.canvasHeight); // L: 274
		this.canvas.setVisible(true); // L: 275
		this.canvas.setBackground(Color.BLACK); // L: 276
		if (var1 == this.frame) { // L: 277
			var2 = this.frame.getInsets(); // L: 278
			this.canvas.setLocation(var2.left + this.canvasX, this.canvasY + var2.top); // L: 279
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 281
		}

		this.canvas.addFocusListener(this); // L: 282
		this.canvas.requestFocus(); // L: 283
		this.fullRedraw = true; // L: 284
		if (KitDefinition.rasterProvider != null && VarbitComposition.canvasWidth == KitDefinition.rasterProvider.width && class370.canvasHeight == KitDefinition.rasterProvider.height) { // L: 285
			((RasterProvider)KitDefinition.rasterProvider).setComponent(this.canvas); // L: 286
			KitDefinition.rasterProvider.drawFull(0, 0); // L: 287
		} else {
			KitDefinition.rasterProvider = new RasterProvider(VarbitComposition.canvasWidth, class370.canvasHeight, this.canvas, this.field200); // L: 290
		}

		this.isCanvasInvalid = false; // L: 292
		this.field205 = AttackOption.method2714(); // L: 293
	} // L: 294

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-68"
	)
	protected void method521(boolean var1) {
		if (this.field200 != var1) { // L: 297
			this.field200 = var1; // L: 298
			KitDefinition.rasterProvider.method9474(var1); // L: 299
			KitDefinition.rasterProvider.apply(); // L: 300
		}

	} // L: 302

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1505442068"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 305
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 306
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 307
				if (var1.endsWith("127.0.0.1")) { // L: 308
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') { // L: 309
						var1 = var1.substring(0, var1.length() - 1);
					}

					if (var1.endsWith("192.168.1.")) { // L: 310
						return true;
					} else {
						this.error("invalidhost"); // L: 311
						return false; // L: 312
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "116"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = AttackOption.method2714(); // L: 365
		long var3 = clientTickTimes[class300.field3367]; // L: 366
		clientTickTimes[class300.field3367] = var1; // L: 367
		class300.field3367 = class300.field3367 + 1 & 31; // L: 368
		if (var3 != 0L && var1 > var3) { // L: 369
		}

		synchronized(this) { // L: 370
			Messages.hasFocus = volatileFocus; // L: 371
		} // L: 372

		this.doCycle(); // L: 373
	} // L: 374

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "115"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 377
		long var2 = AttackOption.method2714(); // L: 378
		long var4 = graphicsTickTimes[class152.field1700]; // L: 379
		graphicsTickTimes[class152.field1700] = var2; // L: 380
		class152.field1700 = class152.field1700 + 1 & 31; // L: 381
		if (0L != var4 && var2 > var4) { // L: 382
			int var6 = (int)(var2 - var4); // L: 383
			fps = ((var6 >> 1) + 32000) / var6; // L: 384
		}

		if (++field208 - 1 > 50) { // L: 386
			field208 -= 50; // L: 387
			this.fullRedraw = true; // L: 388
			this.canvas.setSize(VarbitComposition.canvasWidth, class370.canvasHeight); // L: 389
			this.canvas.setVisible(true); // L: 390
			if (var1 == this.frame) { // L: 391
				Insets var7 = this.frame.getInsets(); // L: 392
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top); // L: 393
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 395
			}
		}

		if (this.isCanvasInvalid) { // L: 397
			this.replaceCanvas();
		}

		this.method526(); // L: 398
		this.draw(this.fullRedraw); // L: 399
		if (this.fullRedraw) { // L: 400
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 401
	} // L: 402

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1623505730"
	)
	final void method526() {
		Bounds var1 = this.getFrameContentBounds(); // L: 405
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 406
			this.resizeCanvas(); // L: 407
			this.resizeCanvasNextFrame = false; // L: 408
		}

	} // L: 410

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2061878669"
	)
	final void method597() {
		this.resizeCanvasNextFrame = true; // L: 413
	} // L: 414

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "341416626"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 417
			isKilled = true; // L: 418

			try {
				this.canvas.removeFocusListener(this); // L: 420
			} catch (Exception var5) { // L: 422
			}

			try {
				this.kill0(); // L: 424
			} catch (Exception var4) { // L: 426
			}

			if (this.frame != null) { // L: 427
				try {
					System.exit(0); // L: 429
				} catch (Throwable var3) { // L: 431
				}
			}

			if (taskHandler != null) { // L: 433
				try {
					taskHandler.close(); // L: 435
				} catch (Exception var2) { // L: 437
				}
			}

			this.vmethod1242(); // L: 439
		}
	} // L: 440

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1045860694"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1812895695"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1403354910"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "393047310"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 526
			if (class92.fontHelvetica13 == null) { // L: 527
				class92.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 528
				class27.loginScreenFontMetrics = this.canvas.getFontMetrics(class92.fontHelvetica13); // L: 529
			}

			if (var3) { // L: 531
				var4.setColor(Color.black); // L: 532
				var4.fillRect(0, 0, VarbitComposition.canvasWidth, class370.canvasHeight); // L: 533
			}

			Color var5 = new Color(140, 17, 17); // L: 535

			try {
				if (field201 == null) { // L: 537
					field201 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = field201.getGraphics(); // L: 538
				var6.setColor(var5); // L: 539
				var6.drawRect(0, 0, 303, 33); // L: 540
				var6.fillRect(2, 2, var1 * 3, 30); // L: 541
				var6.setColor(Color.black); // L: 542
				var6.drawRect(1, 1, 301, 31); // L: 543
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 544
				var6.setFont(class92.fontHelvetica13); // L: 545
				var6.setColor(Color.white); // L: 546
				var6.drawString(var2, (304 - class27.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 547
				var4.drawImage(field201, VarbitComposition.canvasWidth / 2 - 152, class370.canvasHeight / 2 - 18, (ImageObserver)null); // L: 548
			} catch (Exception var9) { // L: 550
				int var7 = VarbitComposition.canvasWidth / 2 - 152; // L: 551
				int var8 = class370.canvasHeight / 2 - 18; // L: 552
				var4.setColor(var5); // L: 553
				var4.drawRect(var7, var8, 303, 33); // L: 554
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 555
				var4.setColor(Color.black); // L: 556
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 557
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 558
				var4.setFont(class92.fontHelvetica13); // L: 559
				var4.setColor(Color.white); // L: 560
				var4.drawString(var2, var7 + (304 - class27.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 561
			}
		} catch (Exception var10) { // L: 564
			this.canvas.repaint(); // L: 565
		}

	} // L: 567

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	protected final void method537() {
		field201 = null; // L: 570
		class92.fontHelvetica13 = null; // L: 571
		class27.loginScreenFontMetrics = null; // L: 572
	} // L: 573

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2125401183"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 576
			this.hasErrored = true; // L: 577
			System.out.println("error_game_" + var1); // L: 578

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 580
			} catch (Exception var3) { // L: 582
			}

		}
	} // L: 583

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "-783200983"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 586
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)Lrh;",
		garbageValue = "1"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 591
		int var2 = Math.max(var1.getWidth(), this.field193); // L: 592
		int var3 = Math.max(var1.getHeight(), this.field194); // L: 593
		if (this.frame != null) { // L: 594
			Insets var4 = this.frame.getInsets(); // L: 595
			var2 -= var4.left + var4.right; // L: 596
			var3 -= var4.top + var4.bottom; // L: 597
		}

		return new Bounds(var2, var3); // L: 599
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 603
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-11698175"
	)
	protected abstract void vmethod1242();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 463
			stopTimeMs = AttackOption.method2714(); // L: 464
			class9.method82(5000L); // L: 465
			this.kill(); // L: 466
		}
	} // L: 467

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 476
			this.fullRedraw = true; // L: 477
			if (AttackOption.method2714() - this.field205 > 1000L) { // L: 478
				Rectangle var2 = var1.getClipBounds(); // L: 479
				if (var2 == null || var2.width >= VarbitComposition.canvasWidth && var2.height >= class370.canvasHeight) {
					this.isCanvasInvalid = true; // L: 480
				}
			}

		}
	} // L: 482

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 507

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 317
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 318
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 319
					String var2 = TaskHandler.javaVersion; // L: 320
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 321
						this.error("wrongjava"); // L: 322
						return; // L: 323
					}

					if (var2.startsWith("1.6.0_")) { // L: 325
						int var3;
						for (var3 = 6; var3 < var2.length() && class412.isDigit(var2.charAt(var3)); ++var3) { // L: 326 327
						}

						String var4 = var2.substring(6, var3); // L: 328
						if (class194.isNumber(var4) && class317.method6078(var4) < 10) { // L: 329
							this.error("wrongjava"); // L: 330
							return; // L: 331
						}
					}

					fiveOrOne = 5; // L: 334
				}
			}

			this.setFocusCycleRoot(true); // L: 337
			this.addCanvas(); // L: 338
			this.setUp(); // L: 339

			Object var8;
			try {
				var8 = new NanoClock(); // L: 343
			} catch (Throwable var6) { // L: 345
				var8 = new MilliClock(); // L: 346
			}

			Skills.clock = (Clock)var8; // L: 349

			while (stopTimeMs == 0L || AttackOption.method2714() < stopTimeMs) { // L: 350
				gameCyclesToDo = Skills.clock.wait(cycleDurationMillis, fiveOrOne); // L: 351

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) { // L: 352
					this.clientTick();
				}

				this.graphicsTick(); // L: 353
				this.post(this.canvas); // L: 354
			}
		} catch (Exception var7) { // L: 357
			MusicPatchNode.RunException_sendStackTrace((String)null, var7); // L: 358
			this.error("crash"); // L: 359
		}

		this.kill(); // L: 361
	} // L: 362

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 451
			stopTimeMs = 0L; // L: 452
		}
	} // L: 453

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 457
			stopTimeMs = AttackOption.method2714() + 4000L; // L: 458
		}
	} // L: 459

	public final void update(Graphics var1) {
		this.paint(var1); // L: 471
	} // L: 472

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 486
		this.fullRedraw = true; // L: 487
	} // L: 488

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 492
	} // L: 493

	public final void windowActivated(WindowEvent var1) {
	} // L: 496

	public final void windowClosed(WindowEvent var1) {
	} // L: 499

	public final void windowIconified(WindowEvent var1) {
	} // L: 513

	public final void windowOpened(WindowEvent var1) {
	} // L: 516

	public abstract void init();

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 503
	} // L: 504

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 510
}
