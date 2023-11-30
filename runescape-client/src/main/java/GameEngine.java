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
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -827441371
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 5534814896619431251L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ab")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 624668735
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -964178105
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1128762955
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 404525363
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ax")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 747470065
	)
	static int field181;
	@ObfuscatedName("ay")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1156670789
	)
	static int field186;
	@ObfuscatedName("by")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	static class25 field203;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = -2230762345531244515L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		longValue = -7548871332020518939L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("au")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 884082393
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1979611029
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1557715643
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2094233233
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 862149103
	)
	int field187;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1983051697
	)
	int field195;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1783195025
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1667963299
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("be")
	protected boolean field170;
	@ObfuscatedName("bi")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bv")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bf")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bm")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bp")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		longValue = -1360498837248928365L
	)
	volatile long field198;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bt")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bu")
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
		field186 = 500; // L: 74
		volatileFocus = true; // L: 83
		field203 = new class25(); // L: 85
		garbageCollectorLastCollectionTime = -1L; // L: 87
		garbageCollectorLastCheckTimeMs = -1L; // L: 88
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.field170 = false; // L: 67
		this.fullRedraw = true; // L: 72
		this.resizeCanvasNextFrame = false; // L: 75
		this.isCanvasInvalid = false; // L: 76
		this.field198 = 0L; // L: 77
		EventQueue var1 = null; // L: 91

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 93
		} catch (Throwable var3) { // L: 95
		}

		this.eventQueue = var1; // L: 96
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 97
		PcmPlayer.pcmPlayerProvider = var2; // L: 99
	} // L: 101

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-49"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 104
			this.method520();
		}

		this.maxCanvasWidth = var1; // L: 105
		this.maxCanvasHeight = var2; // L: 106
	} // L: 107

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-1974837267"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				class219.method4260(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	} // L: 113

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lis;",
		garbageValue = "313158588"
	)
	@Export("mouseWheel")
	protected class212 mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2071259913"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	} // L: 125

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-117"
	)
	protected void method501(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "88"
	)
	public Clipboard method498() {
		return this.clipboard;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 138
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 139
			KeyHandler.KeyHandler_keyCodes[188] = 71;
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 141
			KeyHandler.KeyHandler_keyCodes[190] = 72;
			KeyHandler.KeyHandler_keyCodes[191] = 73;
			KeyHandler.KeyHandler_keyCodes[192] = 58;
			KeyHandler.KeyHandler_keyCodes[219] = 42;
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 146
			KeyHandler.KeyHandler_keyCodes[221] = 43;
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

		field203.method361(this.canvas); // L: 166
	} // L: 167

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-379793759"
	)
	protected final void method567() {
		field203.method358(); // L: 174
	} // L: 175

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lbi;II)V",
		garbageValue = "1492984668"
	)
	protected void method505(class29 var1, int var2) {
		field203.method379(var1, var2); // L: 178
	} // L: 179

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	protected final void method506() {
		java.awt.Canvas var1 = this.canvas; // L: 182
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 184
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 185
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 186
	} // L: 188

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "27503"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 191
		if (var1 != null) { // L: 192
			Bounds var2 = this.getFrameContentBounds(); // L: 193
			this.contentWidth = Math.max(var2.highX, this.field187); // L: 194
			this.contentHeight = Math.max(var2.highY, this.field195); // L: 195
			if (this.contentWidth <= 0) { // L: 196
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 197
				this.contentHeight = 1;
			}

			Language.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 198
			class47.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 199
			this.canvasX = (this.contentWidth - Language.canvasWidth) / 2; // L: 200
			this.canvasY = 0; // L: 201
			this.canvas.setSize(Language.canvasWidth, class47.canvasHeight); // L: 202
			class338.rasterProvider = new RasterProvider(Language.canvasWidth, class47.canvasHeight, this.canvas, this.field170); // L: 203
			if (var1 == this.frame) { // L: 204
				Insets var3 = this.frame.getInsets(); // L: 205
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top); // L: 206
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 208
			}

			this.fullRedraw = true; // L: 209
			this.resizeGame(); // L: 210
		}
	} // L: 211

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "103216408"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 216
		int var2 = this.canvasY; // L: 217
		int var3 = this.contentWidth - Language.canvasWidth - var1; // L: 218
		int var4 = this.contentHeight - class47.canvasHeight - var2; // L: 219
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1609680743"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field203.method362(this.canvas); // L: 242
		class339.method6309(this.canvas); // L: 243
		if (this.mouseWheelHandler != null) { // L: 244
			this.mouseWheelHandler.method306(this.canvas);
		}

		this.addCanvas(); // L: 245
		field203.method361(this.canvas); // L: 246
		java.awt.Canvas var1 = this.canvas; // L: 247
		var1.addMouseListener(MouseHandler.MouseHandler_instance); // L: 249
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 250
		var1.addFocusListener(MouseHandler.MouseHandler_instance); // L: 251
		if (this.mouseWheelHandler != null) { // L: 253
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method520(); // L: 254
	} // L: 255

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "958927213"
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
			Language.canvasWidth = var1; // L: 269
			class47.canvasHeight = var2; // L: 270
			class145.RunException_revision = var3; // L: 271
			RunException.field5301 = var4; // L: 272
			RunException.RunException_applet = this; // L: 273
			if (taskHandler == null) { // L: 274
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1); // L: 275
		} catch (Exception var6) { // L: 277
			GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var6); // L: 278
			this.error("crash"); // L: 279
		}

	} // L: 281

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1184721348"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 284
		if (this.canvas != null) { // L: 285
			this.canvas.removeFocusListener(this); // L: 286
			var1.remove(this.canvas); // L: 287
		}

		Language.canvasWidth = Math.max(var1.getWidth(), this.field187); // L: 289
		class47.canvasHeight = Math.max(var1.getHeight(), this.field195); // L: 290
		Insets var2;
		if (this.frame != null) { // L: 291
			var2 = this.frame.getInsets(); // L: 292
			Language.canvasWidth -= var2.left + var2.right; // L: 293
			class47.canvasHeight -= var2.top + var2.bottom; // L: 294
		}

		this.canvas = new Canvas(this); // L: 296
		var1.setBackground(Color.BLACK); // L: 297
		var1.setLayout((LayoutManager)null); // L: 298
		var1.add(this.canvas); // L: 299
		this.canvas.setSize(Language.canvasWidth, class47.canvasHeight); // L: 300
		this.canvas.setVisible(true); // L: 301
		this.canvas.setBackground(Color.BLACK); // L: 302
		if (var1 == this.frame) { // L: 303
			var2 = this.frame.getInsets(); // L: 304
			this.canvas.setLocation(this.canvasX + var2.left, var2.top + this.canvasY); // L: 305
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 307
		}

		this.canvas.addFocusListener(this); // L: 308
		this.canvas.requestFocus(); // L: 309
		this.fullRedraw = true; // L: 310
		if (class338.rasterProvider != null && Language.canvasWidth == class338.rasterProvider.width && class47.canvasHeight == class338.rasterProvider.height) { // L: 311
			((RasterProvider)class338.rasterProvider).setComponent(this.canvas); // L: 312
			class338.rasterProvider.drawFull(0, 0); // L: 313
		} else {
			class338.rasterProvider = new RasterProvider(Language.canvasWidth, class47.canvasHeight, this.canvas, this.field170); // L: 316
		}

		this.isCanvasInvalid = false; // L: 318
		this.field198 = SpotAnimationDefinition.method3775(); // L: 319
	} // L: 320

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1876817454"
	)
	protected void method513(boolean var1) {
		if (this.field170 != var1) { // L: 323
			this.field170 = var1; // L: 324
			class338.rasterProvider.method9701(var1); // L: 325
			class338.rasterProvider.apply(); // L: 326
		}

	} // L: 328

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1264805931"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1012835334"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = SpotAnimationDefinition.method3775(); // L: 386
		long var3 = clientTickTimes[class18.field88]; // L: 387
		clientTickTimes[class18.field88] = var1; // L: 388
		class18.field88 = class18.field88 + 1 & 31; // L: 389
		if (var3 != 0L && var1 > var3) { // L: 390
		}

		synchronized(this) { // L: 391
			class357.hasFocus = volatileFocus; // L: 392
		} // L: 393

		this.doCycle(); // L: 394
	} // L: 395

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	protected final void method517() {
		this.fullRedraw = true; // L: 398
	} // L: 399

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1866404073"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 402
		long var2 = SpotAnimationDefinition.method3775(); // L: 403
		long var4 = graphicsTickTimes[field181]; // L: 404
		graphicsTickTimes[field181] = var2; // L: 405
		field181 = field181 + 1 & 31; // L: 406
		if (var4 != 0L && var2 > var4) { // L: 407
			int var6 = (int)(var2 - var4); // L: 408
			fps = ((var6 >> 1) + 32000) / var6; // L: 409
		}

		if (++field186 - 1 > 50) { // L: 411
			field186 -= 50; // L: 412
			this.fullRedraw = true; // L: 413
			this.canvas.setSize(Language.canvasWidth, class47.canvasHeight); // L: 414
			this.canvas.setVisible(true); // L: 415
			if (var1 == this.frame) { // L: 416
				Insets var7 = this.frame.getInsets(); // L: 417
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top); // L: 418
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 420
			}
		}

		if (this.isCanvasInvalid) { // L: 422
			this.replaceCanvas();
		}

		this.method590(); // L: 423
		this.draw(this.fullRedraw); // L: 424
		if (this.fullRedraw) { // L: 425
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 426
	} // L: 427

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-992112857"
	)
	final void method590() {
		Bounds var1 = this.getFrameContentBounds(); // L: 430
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) { // L: 431
			this.resizeCanvas(); // L: 432
			this.resizeCanvasNextFrame = false; // L: 433
		}

	} // L: 435

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-327763413"
	)
	final void method520() {
		this.resizeCanvasNextFrame = true; // L: 438
	} // L: 439

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2127713911"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 442
			isKilled = true; // L: 443

			try {
				this.canvas.removeFocusListener(this); // L: 445
			} catch (Exception var5) { // L: 447
			}

			try {
				this.kill0(); // L: 449
			} catch (Exception var4) { // L: 451
			}

			if (this.frame != null) { // L: 452
				try {
					System.exit(0); // L: 454
				} catch (Throwable var3) { // L: 456
				}
			}

			if (taskHandler != null) { // L: 458
				try {
					taskHandler.close(); // L: 460
				} catch (Exception var2) { // L: 462
				}
			}

			this.vmethod1353(); // L: 464
		}
	} // L: 465

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-550390769"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "564244601"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-851092167"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1863199463"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "1838069290"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics(); // L: 551
			if (KeyHandler.fontHelvetica13 == null) { // L: 552
				KeyHandler.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 553
				class6.loginScreenFontMetrics = this.canvas.getFontMetrics(KeyHandler.fontHelvetica13); // L: 554
			}

			if (var3) { // L: 556
				var4.setColor(Color.black); // L: 557
				var4.fillRect(0, 0, Language.canvasWidth, class47.canvasHeight); // L: 558
			}

			Color var5 = new Color(140, 17, 17); // L: 560

			try {
				if (class151.field1682 == null) { // L: 562
					class151.field1682 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class151.field1682.getGraphics(); // L: 563
				var6.setColor(var5); // L: 564
				var6.drawRect(0, 0, 303, 33); // L: 565
				var6.fillRect(2, 2, var1 * 3, 30); // L: 566
				var6.setColor(Color.black); // L: 567
				var6.drawRect(1, 1, 301, 31); // L: 568
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 569
				var6.setFont(KeyHandler.fontHelvetica13); // L: 570
				var6.setColor(Color.white); // L: 571
				var6.drawString(var2, (304 - class6.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 572
				var4.drawImage(class151.field1682, Language.canvasWidth / 2 - 152, class47.canvasHeight / 2 - 18, (ImageObserver)null); // L: 573
			} catch (Exception var9) { // L: 575
				int var7 = Language.canvasWidth / 2 - 152; // L: 576
				int var8 = class47.canvasHeight / 2 - 18; // L: 577
				var4.setColor(var5); // L: 578
				var4.drawRect(var7, var8, 303, 33); // L: 579
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30); // L: 580
				var4.setColor(Color.black); // L: 581
				var4.drawRect(var7 + 1, var8 + 1, 301, 31); // L: 582
				var4.fillRect(var7 + var1 * 3 + 2, var8 + 2, 300 - var1 * 3, 30); // L: 583
				var4.setFont(KeyHandler.fontHelvetica13); // L: 584
				var4.setColor(Color.white); // L: 585
				var4.drawString(var2, var7 + (304 - class6.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22); // L: 586
			}
		} catch (Exception var10) { // L: 589
			this.canvas.repaint(); // L: 590
		}

	} // L: 592

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "180057214"
	)
	protected final void method515() {
		class151.field1682 = null; // L: 595
		KeyHandler.fontHelvetica13 = null; // L: 596
		class6.loginScreenFontMetrics = null; // L: 597
	} // L: 598

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "5"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 601
			this.hasErrored = true; // L: 602
			System.out.println("error_game_" + var1); // L: 603

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 605
			} catch (Exception var3) { // L: 607
			}

		}
	} // L: 608

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/awt/Container;",
		garbageValue = "15421"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 611
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)Lrv;",
		garbageValue = "95"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 616
		int var2 = Math.max(var1.getWidth(), this.field187); // L: 617
		int var3 = Math.max(var1.getHeight(), this.field195); // L: 618
		if (this.frame != null) { // L: 619
			Insets var4 = this.frame.getInsets(); // L: 620
			var2 -= var4.left + var4.right; // L: 621
			var3 -= var4.bottom + var4.top; // L: 622
		}

		return new Bounds(var2, var3); // L: 624
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "50"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 628
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-94"
	)
	protected abstract void vmethod1353();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 488
			stopTimeMs = SpotAnimationDefinition.method3775(); // L: 489
			class219.method4260(5000L); // L: 490
			this.kill(); // L: 491
		}
	} // L: 492

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 501
			this.fullRedraw = true; // L: 502
			if (SpotAnimationDefinition.method3775() - this.field198 > 1000L) { // L: 503
				Rectangle var2 = var1.getClipBounds(); // L: 504
				if (var2 == null || var2.width >= Language.canvasWidth && var2.height >= class47.canvasHeight) {
					this.isCanvasInvalid = true; // L: 505
				}
			}

		}
	} // L: 507

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 476
			stopTimeMs = 0L; // L: 477
		}
	} // L: 478

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 482
			stopTimeMs = SpotAnimationDefinition.method3775() + 4000L; // L: 483
		}
	} // L: 484

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 511
		this.fullRedraw = true; // L: 512
	} // L: 513

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 517
	} // L: 518

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 528
	} // L: 529

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 532

	public final void windowIconified(WindowEvent var1) {
	} // L: 538

	public final void windowOpened(WindowEvent var1) {
	} // L: 541

	public abstract void init();

	public final void windowActivated(WindowEvent var1) {
	} // L: 521

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 535

	public final void windowClosed(WindowEvent var1) {
	} // L: 524

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 343
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 344
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 345
					String var2 = TaskHandler.javaVersion; // L: 346
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 347
						this.error("wrongjava"); // L: 348
						return; // L: 349
					}

					if (var2.startsWith("1.6.0_")) { // L: 351
						int var3;
						for (var3 = 6; var3 < var2.length() && Player.isDigit(var2.charAt(var3)); ++var3) { // L: 352 353
						}

						String var4 = var2.substring(6, var3); // L: 354
						if (ClientPacket.isNumber(var4) && Huffman.method6840(var4) < 10) { // L: 355
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
			ArchiveDiskAction.clock = SoundSystem.method863(); // L: 368

			while (stopTimeMs == 0L || SpotAnimationDefinition.method3775() < stopTimeMs) { // L: 369
				gameCyclesToDo = ArchiveDiskAction.clock.wait(cycleDurationMillis, fiveOrOne); // L: 370

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) { // L: 371
					this.clientTick();
				}

				this.graphicsTick(); // L: 373
				this.post(this.canvas); // L: 375
			}
		} catch (Exception var6) { // L: 378
			GrandExchangeOfferWorldComparator.RunException_sendStackTrace((String)null, var6); // L: 379
			this.error("crash"); // L: 380
		}

		this.kill(); // L: 382
	} // L: 383

	public final void update(Graphics var1) {
		this.paint(var1); // L: 496
	} // L: 497

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Liw;B)V",
		garbageValue = "48"
	)
	static final void method544(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) { // L: 110
			for (var12 = 0; var12 < 8; ++var12) { // L: 111
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) { // L: 112
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var12 + var3] &= -16777217;
				}
			}
		}

		Buffer var24 = new Buffer(var0); // L: 115

		for (var12 = 0; var12 < 4; ++var12) { // L: 116
			for (int var13 = 0; var13 < 64; ++var13) { // L: 117
				for (int var14 = 0; var14 < 64; ++var14) { // L: 118
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) { // L: 119
						int var15 = var2 + class31.method469(var13 & 7, var14 & 7, var7); // L: 120
						int var18 = var13 & 7; // L: 123
						int var19 = var14 & 7; // L: 124
						int var20 = var7 & 3; // L: 127
						int var17;
						if (var20 == 0) { // L: 128
							var17 = var19; // L: 129
						} else if (var20 == 1) { // L: 132
							var17 = 7 - var18; // L: 133
						} else if (var20 == 2) { // L: 136
							var17 = 7 - var19; // L: 137
						} else {
							var17 = var18; // L: 140
						}

						int var21 = var17 + var3; // L: 142
						int var22 = (var13 & 7) + var8 + var2; // L: 143
						int var23 = var3 + (var14 & 7) + var9; // L: 144
						class14.loadTerrain(var24, var1, var15, var21, var22, var23, var7); // L: 145
					} else {
						class14.loadTerrain(var24, 0, -1, -1, 0, 0, 0); // L: 147
					}
				}
			}
		}

	} // L: 151
}
