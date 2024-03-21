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

@ObfuscatedName("bm")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1030879875
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 4154635624523065629L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ar")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 404041363
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1053088427
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1604735757
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("aj")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ax")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1040296459
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -69598155
	)
	static int field204;
	@ObfuscatedName("bf")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	static class25 field212;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		longValue = 4900805455295024601L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		longValue = 5008773661019073185L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("bj")
	static String field217;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = -608050616
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("as")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1694090239
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 509706793
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -581201843
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 69063545
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2093556135
	)
	int field196;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1429046051
	)
	int field197;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1405902403
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1654560907
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bu")
	protected boolean field200;
	@ObfuscatedName("bi")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bq")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ba")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bm")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bw")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		longValue = -8074499702448681273L
	)
	volatile long field207;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("br")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bp")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null; // L: 41
		GameEngine_redundantStartThreadCount = 0; // L: 43
		stopTimeMs = 0L; // L: 44
		isKilled = false;
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32];
		field204 = 500; // L: 74
		volatileFocus = true; // L: 83
		field212 = new class25(); // L: 85
		garbageCollectorLastCollectionTime = -1L; // L: 87
		garbageCollectorLastCheckTimeMs = -1L; // L: 88
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.field200 = false; // L: 67
		this.fullRedraw = true; // L: 72
		this.resizeCanvasNextFrame = false; // L: 75
		this.isCanvasInvalid = false; // L: 76
		this.field207 = 0L; // L: 77
		EventQueue var1 = null; // L: 91

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 93
		} catch (Throwable var3) { // L: 95
		}

		this.eventQueue = var1; // L: 96
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 97
		class33.pcmPlayerProvider = var2; // L: 99
	} // L: 101

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-40"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 104
			this.method477();
		}

		this.maxCanvasWidth = var1; // L: 105
		this.maxCanvasHeight = var2; // L: 106
	} // L: 107

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-2145759514"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 110
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 111
				class143.method3209(1L);
			}

			if (var1 != null) { // L: 112
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	} // L: 113

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lij;",
		garbageValue = "1661871348"
	)
	@Export("mouseWheel")
	protected class215 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 116
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 117
			this.mouseWheelHandler.addTo(this.canvas); // L: 118
		}

		return this.mouseWheelHandler; // L: 120
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2103494171"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 124
	} // L: 125

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-353573425"
	)
	protected void method463(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 128
	} // L: 129

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "1014258040"
	)
	public Clipboard method460() {
		return this.clipboard; // L: 132
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (GrandExchangeOfferUnitPriceComparator.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 137
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

		field212.method324(this.canvas); // L: 166
	} // L: 167

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1854256150"
	)
	protected final void method532() {
		field212.method326(); // L: 174
	} // L: 175

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lbi;II)V",
		garbageValue = "-921277827"
	)
	protected void method546(class29 var1, int var2) {
		field212.method337(var1, var2); // L: 178
	} // L: 179

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "838367065"
	)
	protected final void method485() {
		java.awt.Canvas var1 = this.canvas; // L: 182
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 184
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 185
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 186
	} // L: 188

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "992035908"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 191
		if (var1 != null) { // L: 192
			Bounds var2 = this.getFrameContentBounds(); // L: 193
			this.contentWidth = Math.max(var2.highX, this.field196); // L: 194
			this.contentHeight = Math.max(var2.highY, this.field197); // L: 195
			if (this.contentWidth <= 0) { // L: 196
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 197
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 198
			WorldMapArea.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 199
			this.canvasX = (this.contentWidth - canvasWidth) / 2; // L: 200
			this.canvasY = 0; // L: 201
			this.canvas.setSize(canvasWidth, WorldMapArea.canvasHeight); // L: 202
			UserComparator8.rasterProvider = new RasterProvider(canvasWidth, WorldMapArea.canvasHeight, this.canvas, this.field200); // L: 203
			if (var1 == this.frame) { // L: 204
				Insets var3 = this.frame.getInsets(); // L: 205
				this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top); // L: 206
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 208
			}

			this.fullRedraw = true; // L: 209
			this.resizeGame(); // L: 210
		}
	} // L: 211

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1061077058"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 216
		int var2 = this.canvasY; // L: 217
		int var3 = this.contentWidth - canvasWidth - var1; // L: 218
		int var4 = this.contentHeight - WorldMapArea.canvasHeight - var2; // L: 219
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
		garbageValue = "401957892"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field212.method325(this.canvas); // L: 242
		java.awt.Canvas var1 = this.canvas; // L: 243
		var1.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 245
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 246
		var1.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 247
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 248
		if (this.mouseWheelHandler != null) { // L: 250
			this.mouseWheelHandler.method274(this.canvas);
		}

		this.addCanvas(); // L: 251
		field212.method324(this.canvas); // L: 252
		java.awt.Canvas var2 = this.canvas; // L: 253
		var2.addMouseListener(MouseHandler.MouseHandler_instance); // L: 255
		var2.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 256
		var2.addFocusListener(MouseHandler.MouseHandler_instance); // L: 257
		if (this.mouseWheelHandler != null) { // L: 259
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method477(); // L: 260
	} // L: 261

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "45"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 265
				++GameEngine_redundantStartThreadCount; // L: 266
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 267
					this.error("alreadyloaded"); // L: 268
					return; // L: 269
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 271
				return; // L: 272
			}

			gameEngine = this; // L: 274
			canvasWidth = var1; // L: 275
			WorldMapArea.canvasHeight = var2; // L: 276
			RunException.RunException_revision = var3; // L: 277
			RunException.field5366 = var4; // L: 278
			RunException.RunException_applet = this; // L: 279
			if (taskHandler == null) { // L: 280
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 281
		} catch (Exception var6) { // L: 283
			class315.RunException_sendStackTrace((String)null, var6); // L: 284
			this.error("crash"); // L: 285
		}

	} // L: 287

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1505171167"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 290
		if (this.canvas != null) { // L: 291
			this.canvas.removeFocusListener(this); // L: 292
			var1.remove(this.canvas); // L: 293
		}

		canvasWidth = Math.max(var1.getWidth(), this.field196); // L: 295
		WorldMapArea.canvasHeight = Math.max(var1.getHeight(), this.field197); // L: 296
		Insets var2;
		if (this.frame != null) { // L: 297
			var2 = this.frame.getInsets(); // L: 298
			canvasWidth -= var2.left + var2.right; // L: 299
			WorldMapArea.canvasHeight -= var2.bottom + var2.top; // L: 300
		}

		this.canvas = new Canvas(this); // L: 302
		var1.setBackground(Color.BLACK); // L: 303
		var1.setLayout((LayoutManager)null); // L: 304
		var1.add(this.canvas); // L: 305
		this.canvas.setSize(canvasWidth, WorldMapArea.canvasHeight); // L: 306
		this.canvas.setVisible(true); // L: 307
		this.canvas.setBackground(Color.BLACK); // L: 308
		if (var1 == this.frame) { // L: 309
			var2 = this.frame.getInsets(); // L: 310
			this.canvas.setLocation(var2.left + this.canvasX, var2.top + this.canvasY); // L: 311
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 313
		}

		this.canvas.addFocusListener(this); // L: 314
		this.canvas.requestFocus(); // L: 315
		this.fullRedraw = true; // L: 316
		if (UserComparator8.rasterProvider != null && canvasWidth == UserComparator8.rasterProvider.width && WorldMapArea.canvasHeight == UserComparator8.rasterProvider.height) { // L: 317
			((RasterProvider)UserComparator8.rasterProvider).setComponent(this.canvas); // L: 318
			UserComparator8.rasterProvider.drawFull(0, 0); // L: 319
		} else {
			UserComparator8.rasterProvider = new RasterProvider(canvasWidth, WorldMapArea.canvasHeight, this.canvas, this.field200); // L: 322
		}

		this.isCanvasInvalid = false; // L: 324
		this.field207 = SecureRandomCallable.method2320(); // L: 325
	} // L: 326

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "46"
	)
	protected void method471(boolean var1) {
		if (this.field200 != var1) { // L: 329
			this.field200 = var1; // L: 330
			UserComparator8.rasterProvider.method9862(var1); // L: 331
			UserComparator8.rasterProvider.apply(); // L: 332
		}

	} // L: 334

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "58840363"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 337
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 338
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 339
				if (var1.endsWith("127.0.0.1")) { // L: 340
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 341
					}

					if (var1.endsWith("192.168.1.")) { // L: 342
						return true;
					} else {
						this.error("invalidhost"); // L: 343
						return false; // L: 344
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2143175618"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = SecureRandomCallable.method2320(); // L: 392
		long var3 = clientTickTimes[class307.field3167]; // L: 393
		clientTickTimes[class307.field3167] = var1; // L: 394
		class307.field3167 = class307.field3167 + 1 & 31; // L: 395
		if (0L != var3 && var1 > var3) { // L: 396
		}

		synchronized(this) { // L: 397
			class423.hasFocus = volatileFocus; // L: 398
		} // L: 399

		this.doCycle(); // L: 400
	} // L: 401

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "482887882"
	)
	protected final void method490() {
		this.fullRedraw = true; // L: 404
	} // L: 405

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "775683249"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 408
		long var2 = SecureRandomCallable.method2320(); // L: 409
		long var4 = graphicsTickTimes[class164.field1796]; // L: 410
		graphicsTickTimes[class164.field1796] = var2; // L: 411
		class164.field1796 = class164.field1796 + 1 & 31; // L: 412
		if (var4 != 0L && var2 > var4) { // L: 413
			int var6 = (int)(var2 - var4); // L: 414
			fps = ((var6 >> 1) + 32000) / var6; // L: 415
		}

		if (++field204 - 1 > 50) { // L: 417
			field204 -= 50; // L: 418
			this.fullRedraw = true; // L: 419
			this.canvas.setSize(canvasWidth, WorldMapArea.canvasHeight); // L: 420
			this.canvas.setVisible(true); // L: 421
			if (var1 == this.frame) { // L: 422
				Insets var7 = this.frame.getInsets(); // L: 423
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top); // L: 424
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 426
			}
		}

		if (this.isCanvasInvalid) { // L: 428
			this.replaceCanvas();
		}

		this.method476(); // L: 429
		this.draw(this.fullRedraw); // L: 430
		if (this.fullRedraw) { // L: 431
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 432
	} // L: 433

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "272772014"
	)
	final void method476() {
		Bounds var1 = this.getFrameContentBounds(); // L: 436
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 437
			this.resizeCanvas(); // L: 438
			this.resizeCanvasNextFrame = false; // L: 439
		}

	} // L: 441

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2066415217"
	)
	final void method477() {
		this.resizeCanvasNextFrame = true; // L: 444
	} // L: 445

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-112"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 448
			isKilled = true; // L: 449

			try {
				this.canvas.removeFocusListener(this); // L: 451
			} catch (Exception var5) { // L: 453
			}

			try {
				this.kill0(); // L: 455
			} catch (Exception var4) { // L: 457
			}

			if (this.frame != null) { // L: 458
				try {
					System.exit(0); // L: 460
				} catch (Throwable var3) { // L: 462
				}
			}

			if (taskHandler != null) { // L: 464
				try {
					taskHandler.close(); // L: 466
				} catch (Exception var2) { // L: 468
				}
			}

			this.vmethod1380(); // L: 470
		}
	} // L: 471

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-946246730"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "156558232"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1901702854"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1161058155"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZI)V",
		garbageValue = "1742357288"
	)
	protected final void method479(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics(); // L: 557
			if (class391.fontHelvetica13 == null) { // L: 558
				class391.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 559
				Huffman.loginScreenFontMetrics = this.canvas.getFontMetrics(class391.fontHelvetica13); // L: 560
			}

			if (var3 && !var4) { // L: 562 563
				var5.setColor(Color.black); // L: 564
				var5.fillRect(0, 0, canvasWidth, WorldMapArea.canvasHeight); // L: 565
			}

			Color var6 = new Color(140, 17, 17); // L: 568

			try {
				if (class12.field51 == null) { // L: 570
					class12.field51 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = class12.field51.getGraphics(); // L: 571
				var7.setColor(var6); // L: 572
				var7.drawRect(0, 0, 303, 33); // L: 573
				var7.fillRect(2, 2, var1 * 3, 30); // L: 574
				var7.setColor(Color.black); // L: 575
				var7.drawRect(1, 1, 301, 31); // L: 576
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 577
				var7.setFont(class391.fontHelvetica13); // L: 578
				var7.setColor(Color.white); // L: 579
				var7.drawString(var2, (304 - Huffman.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 580
				var5.drawImage(class12.field51, canvasWidth / 2 - 152, WorldMapArea.canvasHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null); // L: 581
			} catch (Exception var10) { // L: 583
				int var8 = canvasWidth / 2 - 152; // L: 584
				int var9 = WorldMapArea.canvasHeight / 2 - 18; // L: 585
				var5.setColor(var6); // L: 586
				var5.drawRect(var8, var9, 303, 33); // L: 587
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30); // L: 588
				var5.setColor(Color.black); // L: 589
				var5.drawRect(var8 + 1, var9 + 1, 301, 31); // L: 590
				var5.fillRect(var1 * 3 + var8 + 2, var9 + 2, 300 - var1 * 3, 30); // L: 591
				var5.setFont(class391.fontHelvetica13); // L: 592
				var5.setColor(Color.white); // L: 593
				var5.drawString(var2, var8 + (304 - Huffman.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22); // L: 594
			}
		} catch (Exception var11) { // L: 597
			this.canvas.repaint(); // L: 598
		}

	} // L: 600

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	protected final void method571() {
		class12.field51 = null; // L: 603
		class391.fontHelvetica13 = null; // L: 604
		Huffman.loginScreenFontMetrics = null; // L: 605
	} // L: 606

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1259256402"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 609
			this.hasErrored = true; // L: 610
			System.out.println("error_game_" + var1); // L: 611

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 613
			} catch (Exception var3) { // L: 615
			}

		}
	} // L: 616

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/awt/Container;",
		garbageValue = "-30458"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 619
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lrc;",
		garbageValue = "1701533255"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 624
		int var2 = Math.max(var1.getWidth(), this.field196); // L: 625
		int var3 = Math.max(var1.getHeight(), this.field197); // L: 626
		if (this.frame != null) { // L: 627
			Insets var4 = this.frame.getInsets(); // L: 628
			var2 -= var4.left + var4.right; // L: 629
			var3 -= var4.bottom + var4.top; // L: 630
		}

		return new Bounds(var2, var3); // L: 632
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1688799383"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 636
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	protected abstract void vmethod1380();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 494
			stopTimeMs = SecureRandomCallable.method2320(); // L: 495
			class143.method3209(5000L); // L: 496
			this.kill(); // L: 497
		}
	} // L: 498

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 507
			this.fullRedraw = true; // L: 508
			if (SecureRandomCallable.method2320() - this.field207 > 1000L) { // L: 509
				Rectangle var2 = var1.getClipBounds(); // L: 510
				if (var2 == null || var2.width >= canvasWidth && var2.height >= WorldMapArea.canvasHeight) {
					this.isCanvasInvalid = true; // L: 511
				}
			}

		}
	} // L: 513

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 538

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 517
		this.fullRedraw = true; // L: 518
	} // L: 519

	public final void windowActivated(WindowEvent var1) {
	} // L: 527

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 482
			stopTimeMs = 0L; // L: 483
		}
	} // L: 484

	public final void windowClosed(WindowEvent var1) {
	} // L: 530

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 534
	} // L: 535

	public final void windowIconified(WindowEvent var1) {
	} // L: 544

	public final void windowOpened(WindowEvent var1) {
	} // L: 547

	@ObfuscatedName("init")
	@Export("kill0")
	public abstract void kill0();

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 541

	public void run() {
		try {
			if (GrandExchangeOfferUnitPriceComparator.javaVendor != null) { // L: 349
				String var1 = GrandExchangeOfferUnitPriceComparator.javaVendor.toLowerCase(); // L: 350
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 351
					String var2 = TaskHandler.javaVersion; // L: 352
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 353
						this.error("wrongjava"); // L: 354
						return; // L: 355
					}

					if (var2.startsWith("1.6.0_")) { // L: 357
						int var3;
						for (var3 = 6; var3 < var2.length() && class237.isDigit(var2.charAt(var3)); ++var3) { // L: 358 359
						}

						String var4 = var2.substring(6, var3); // L: 360
						if (WallObject.isNumber(var4) && class129.method3066(var4) < 10) { // L: 361
							this.error("wrongjava"); // L: 362
							return; // L: 363
						}
					}

					fiveOrOne = 5; // L: 366
				}
			}

			this.setFocusCycleRoot(true); // L: 369
			this.addCanvas(); // L: 371
			this.setUp(); // L: 373
			class12.clock = JagexCache.method4223(); // L: 374

			while (stopTimeMs == 0L || SecureRandomCallable.method2320() < stopTimeMs) { // L: 375
				class496.gameCyclesToDo = class12.clock.wait(cycleDurationMillis, fiveOrOne); // L: 376

				for (int var5 = 0; var5 < class496.gameCyclesToDo; ++var5) { // L: 377
					this.clientTick();
				}

				this.graphicsTick(); // L: 379
				this.post(this.canvas); // L: 381
			}
		} catch (Exception var6) { // L: 384
			class315.RunException_sendStackTrace((String)null, var6); // L: 385
			this.error("crash"); // L: 386
		}

		this.kill(); // L: 388
	} // L: 389

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 488
			stopTimeMs = SecureRandomCallable.method2320() + 4000L; // L: 489
		}
	} // L: 490

	public final void update(Graphics var1) {
		this.paint(var1); // L: 502
	} // L: 503

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 523
	} // L: 524

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "89"
	)
	static void method605() {
		Tiles.Tiles_minPlane = 99; // L: 45
		GrandExchangeOfferAgeComparator.field4442 = new short[4][104][104]; // L: 46
		TriBool.field4773 = new short[4][104][104]; // L: 47
		class173.field1845 = new byte[4][104][104]; // L: 48
		class350.field3876 = new byte[4][104][104]; // L: 49
		Tiles.field1050 = new int[4][105][105]; // L: 50
		class151.field1708 = new byte[4][105][105]; // L: 51
		Tiles.field1049 = new int[105][105]; // L: 52
		Huffman.Tiles_hue = new int[104]; // L: 53
		MilliClock.Tiles_saturation = new int[104]; // L: 54
		ApproximateRouteStrategy.Tiles_lightness = new int[104]; // L: 55
		class182.Tiles_hueMultiplier = new int[104]; // L: 56
		class324.field3538 = new int[104]; // L: 57
	} // L: 58
}
