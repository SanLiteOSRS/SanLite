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

@ObfuscatedName("bx")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -972204559
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 1357323329922532841L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("an")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1294784155
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1211199807
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 840423061
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("ai")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ar")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1005419219
	)
	static int field190;
	@ObfuscatedName("by")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	protected static class25 field198;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		longValue = -7061351807293358897L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		longValue = -5085579001810185779L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field201;
	@ObfuscatedName("ao")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1429899503
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 711370431
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2036724517
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -551680619
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2045601991
	)
	int field188;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1061414363
	)
	int field189;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1125823449
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2064104547
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bp")
	protected boolean field172;
	@ObfuscatedName("bf")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("be")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bn")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bx")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bl")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		longValue = 6890218759618530073L
	)
	volatile long field193;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("br")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bb")
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
		field198 = new class25(); // L: 85
		garbageCollectorLastCollectionTime = -1L; // L: 87
		garbageCollectorLastCheckTimeMs = -1L; // L: 88
	}

	protected GameEngine() {
		this.hasErrored = false; // L: 46
		this.canvasX = 0; // L: 59
		this.canvasY = 0; // L: 60
		this.field172 = false; // L: 67
		this.fullRedraw = true; // L: 72
		this.resizeCanvasNextFrame = false; // L: 75
		this.isCanvasInvalid = false; // L: 76
		this.field193 = 0L; // L: 77
		EventQueue var1 = null; // L: 91

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue(); // L: 93
		} catch (Throwable var3) { // L: 95
		}

		this.eventQueue = var1; // L: 96
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider(); // L: 97
		class129.pcmPlayerProvider = var2; // L: 99
	} // L: 101

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-731804788"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) { // L: 104
			this.method480();
		}

		this.maxCanvasWidth = var1; // L: 105
		this.maxCanvasHeight = var2; // L: 106
	} // L: 107

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-1406490005"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) { // L: 110
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) { // L: 111
				class499.method8677(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy")); // L: 112
			}

		}
	} // L: 113

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lge;",
		garbageValue = "-218287002"
	)
	@Export("mouseWheel")
	protected class176 mouseWheel() {
		if (this.mouseWheelHandler == null) { // L: 116
			this.mouseWheelHandler = new MouseWheelHandler(); // L: 117
			this.mouseWheelHandler.addTo(this.canvas); // L: 118
		}

		return this.mouseWheelHandler; // L: 120
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1787352976"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard(); // L: 124
	} // L: 125

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1920040630"
	)
	protected void method463(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null); // L: 128
	} // L: 129

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "16711680"
	)
	public Clipboard method464() {
		return this.clipboard; // L: 132
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 137
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

		field198.method323(this.canvas); // L: 166
	} // L: 167

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-28300"
	)
	protected final void method530() {
		field198.method353(); // L: 170
	} // L: 171

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lbf;II)V",
		garbageValue = "1181261452"
	)
	protected void method466(class29 var1, int var2) {
		field198.method321(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26674"
	)
	protected final void method613() {
		class106.method2699(this.canvas); // L: 178
	} // L: 179

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1307608486"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container(); // L: 182
		if (var1 != null) { // L: 183
			Bounds var2 = this.getFrameContentBounds(); // L: 184
			this.contentWidth = Math.max(var2.highX, this.field188); // L: 185
			this.contentHeight = Math.max(var2.highY, this.field189); // L: 186
			if (this.contentWidth <= 0) { // L: 187
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) { // L: 188
				this.contentHeight = 1;
			}

			class148.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth); // L: 189
			class342.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight); // L: 190
			this.canvasX = (this.contentWidth - class148.canvasWidth) / 2; // L: 191
			this.canvasY = 0; // L: 192
			this.canvas.setSize(class148.canvasWidth, class342.canvasHeight); // L: 193
			UserComparator9.rasterProvider = new RasterProvider(class148.canvasWidth, class342.canvasHeight, this.canvas, this.field172); // L: 194
			if (var1 == this.frame) { // L: 195
				Insets var3 = this.frame.getInsets(); // L: 196
				this.canvas.setLocation(var3.left + this.canvasX, var3.top + this.canvasY); // L: 197
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 199
			}

			this.fullRedraw = true; // L: 200
			this.resizeGame(); // L: 201
		}
	} // L: 202

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "93"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1464269537"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX; // L: 207
		int var2 = this.canvasY; // L: 208
		int var3 = this.contentWidth - class148.canvasWidth - var1; // L: 209
		int var4 = this.contentHeight - class342.canvasHeight - var2; // L: 210
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) { // L: 211
			try {
				Container var5 = this.container(); // L: 213
				int var6 = 0; // L: 214
				int var7 = 0; // L: 215
				if (var5 == this.frame) { // L: 216
					Insets var8 = this.frame.getInsets(); // L: 217
					var6 = var8.left; // L: 218
					var7 = var8.top; // L: 219
				}

				Graphics var10 = var5.getGraphics(); // L: 221
				var10.setColor(Color.black); // L: 222
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight); // L: 223
				}

				if (var2 > 0) { // L: 224
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) { // L: 225
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) { // L: 226
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) { // L: 228
			}
		}

	} // L: 230

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-110"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		field198.method331(this.canvas); // L: 233
		class187.method3692(this.canvas); // L: 234
		if (this.mouseWheelHandler != null) { // L: 235
			this.mouseWheelHandler.method285(this.canvas);
		}

		this.addCanvas(); // L: 236
		field198.method323(this.canvas); // L: 237
		class106.method2699(this.canvas); // L: 238
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas); // L: 239
		}

		this.method480(); // L: 240
	} // L: 241

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-69087960"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) { // L: 245
				++GameEngine_redundantStartThreadCount; // L: 246
				if (GameEngine_redundantStartThreadCount >= 3) { // L: 247
					this.error("alreadyloaded"); // L: 248
					return; // L: 249
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self"); // L: 251
				return; // L: 252
			}

			gameEngine = this; // L: 254
			class148.canvasWidth = var1; // L: 255
			class342.canvasHeight = var2; // L: 256
			RunException.RunException_revision = var3; // L: 257
			class73.field911 = var4; // L: 258
			RunException.RunException_applet = this; // L: 259
			if (class350.taskHandler == null) { // L: 260
				class350.taskHandler = new TaskHandler();
			}

			class350.taskHandler.newThreadTask(this, 1); // L: 261
		} catch (Exception var6) { // L: 263
			class180.RunException_sendStackTrace((String)null, var6); // L: 264
			this.error("crash"); // L: 265
		}

	} // L: 267

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2022692785"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container(); // L: 270
		if (this.canvas != null) { // L: 271
			this.canvas.removeFocusListener(this); // L: 272
			var1.remove(this.canvas); // L: 273
		}

		class148.canvasWidth = Math.max(var1.getWidth(), this.field188); // L: 275
		class342.canvasHeight = Math.max(var1.getHeight(), this.field189); // L: 276
		Insets var2;
		if (this.frame != null) { // L: 277
			var2 = this.frame.getInsets(); // L: 278
			class148.canvasWidth -= var2.right + var2.left; // L: 279
			class342.canvasHeight -= var2.top + var2.bottom; // L: 280
		}

		this.canvas = new Canvas(this); // L: 282
		var1.setBackground(Color.BLACK); // L: 283
		var1.setLayout((LayoutManager)null); // L: 284
		var1.add(this.canvas); // L: 285
		this.canvas.setSize(class148.canvasWidth, class342.canvasHeight); // L: 286
		this.canvas.setVisible(true); // L: 287
		this.canvas.setBackground(Color.BLACK); // L: 288
		if (var1 == this.frame) { // L: 289
			var2 = this.frame.getInsets(); // L: 290
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top); // L: 291
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY); // L: 293
		}

		this.canvas.addFocusListener(this); // L: 294
		this.canvas.requestFocus(); // L: 295
		this.fullRedraw = true; // L: 296
		if (UserComparator9.rasterProvider != null && class148.canvasWidth == UserComparator9.rasterProvider.width && class342.canvasHeight == UserComparator9.rasterProvider.height) { // L: 297
			((RasterProvider)UserComparator9.rasterProvider).setComponent(this.canvas); // L: 298
			UserComparator9.rasterProvider.drawFull(0, 0); // L: 299
		} else {
			UserComparator9.rasterProvider = new RasterProvider(class148.canvasWidth, class342.canvasHeight, this.canvas, this.field172); // L: 302
		}

		this.isCanvasInvalid = false; // L: 304
		this.field193 = VerticalAlignment.method3924(); // L: 305
	} // L: 306

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "354151711"
	)
	protected void method510(boolean var1) {
		if (this.field172 != var1) { // L: 309
			this.field172 = var1; // L: 310
			UserComparator9.rasterProvider.method9669(var1); // L: 311
			UserComparator9.rasterProvider.apply(); // L: 312
		}

	} // L: 314

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1165492221"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase(); // L: 317
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) { // L: 318
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) { // L: 319
				if (var1.endsWith("127.0.0.1")) { // L: 320
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1); // L: 321
					}

					if (var1.endsWith("192.168.1.")) { // L: 322
						return true;
					} else {
						this.error("invalidhost"); // L: 323
						return false; // L: 324
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "139624089"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = VerticalAlignment.method3924(); // L: 372
		long var3 = clientTickTimes[class179.field1899]; // L: 373
		clientTickTimes[class179.field1899] = var1; // L: 374
		class179.field1899 = class179.field1899 + 1 & 31; // L: 375
		if (var3 != 0L && var1 > var3) { // L: 376
		}

		synchronized(this) { // L: 377
			WorldMapManager.hasFocus = volatileFocus; // L: 378
		} // L: 379

		this.doCycle(); // L: 380
	} // L: 381

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-627623291"
	)
	protected final void method591() {
		this.fullRedraw = true; // L: 384
	} // L: 385

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-386305903"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container(); // L: 388
		long var2 = VerticalAlignment.method3924(); // L: 389
		long var4 = graphicsTickTimes[class357.field3922]; // L: 390
		graphicsTickTimes[class357.field3922] = var2; // L: 391
		class357.field3922 = class357.field3922 + 1 & 31; // L: 392
		if (0L != var4 && var2 > var4) { // L: 393
			int var6 = (int)(var2 - var4); // L: 394
			fps = ((var6 >> 1) + 32000) / var6; // L: 395
		}

		if (++field190 - 1 > 50) { // L: 397
			field190 -= 50; // L: 398
			this.fullRedraw = true; // L: 399
			this.canvas.setSize(class148.canvasWidth, class342.canvasHeight); // L: 400
			this.canvas.setVisible(true); // L: 401
			if (var1 == this.frame) { // L: 402
				Insets var7 = this.frame.getInsets(); // L: 403
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top); // L: 404
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY); // L: 406
			}
		}

		if (this.isCanvasInvalid) { // L: 408
			this.replaceCanvas();
		}

		this.method491(); // L: 409
		this.draw(this.fullRedraw); // L: 410
		if (this.fullRedraw) { // L: 411
			this.clearBackground();
		}

		this.fullRedraw = false; // L: 412
	} // L: 413

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "479"
	)
	final void method491() {
		Bounds var1 = this.getFrameContentBounds(); // L: 416
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) { // L: 417
			this.resizeCanvas(); // L: 418
			this.resizeCanvasNextFrame = false; // L: 419
		}

	} // L: 421

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "925528283"
	)
	final void method480() {
		this.resizeCanvasNextFrame = true; // L: 424
	} // L: 425

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) { // L: 428
			isKilled = true; // L: 429

			try {
				this.canvas.removeFocusListener(this); // L: 431
			} catch (Exception var5) { // L: 433
			}

			try {
				this.kill0(); // L: 435
			} catch (Exception var4) { // L: 437
			}

			if (this.frame != null) { // L: 438
				try {
					System.exit(0); // L: 440
				} catch (Throwable var3) { // L: 442
				}
			}

			if (class350.taskHandler != null) { // L: 444
				try {
					class350.taskHandler.close(); // L: 446
				} catch (Exception var2) { // L: 448
				}
			}

			this.vmethod1203(); // L: 450
		}
	} // L: 451

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2131760919"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1556625952"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "17"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-283961032"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZB)V",
		garbageValue = "9"
	)
	protected final void method574(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics(); // L: 537
			if (PcmPlayer.fontHelvetica13 == null) { // L: 538
				PcmPlayer.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13); // L: 539
				class60.loginScreenFontMetrics = this.canvas.getFontMetrics(PcmPlayer.fontHelvetica13); // L: 540
			}

			if (var3 && !var4) { // L: 542 543
				var5.setColor(Color.black); // L: 544
				var5.fillRect(0, 0, class148.canvasWidth, class342.canvasHeight); // L: 545
			}

			Color var6 = new Color(140, 17, 17); // L: 548

			try {
				if (class30.field147 == null) { // L: 550
					class30.field147 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = class30.field147.getGraphics(); // L: 551
				var7.setColor(var6); // L: 552
				var7.drawRect(0, 0, 303, 33); // L: 553
				var7.fillRect(2, 2, var1 * 3, 30); // L: 554
				var7.setColor(Color.black); // L: 555
				var7.drawRect(1, 1, 301, 31); // L: 556
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30); // L: 557
				var7.setFont(PcmPlayer.fontHelvetica13); // L: 558
				var7.setColor(Color.white); // L: 559
				var7.drawString(var2, (304 - class60.loginScreenFontMetrics.stringWidth(var2)) / 2, 22); // L: 560
				var5.drawImage(class30.field147, class148.canvasWidth / 2 - 152, class342.canvasHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null); // L: 561
			} catch (Exception var10) { // L: 563
				int var8 = class148.canvasWidth / 2 - 152; // L: 564
				int var9 = class342.canvasHeight / 2 - 18; // L: 565
				var5.setColor(var6); // L: 566
				var5.drawRect(var8, var9, 303, 33); // L: 567
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30); // L: 568
				var5.setColor(Color.black); // L: 569
				var5.drawRect(var8 + 1, var9 + 1, 301, 31); // L: 570
				var5.fillRect(var8 + var1 * 3 + 2, var9 + 2, 300 - var1 * 3, 30); // L: 571
				var5.setFont(PcmPlayer.fontHelvetica13); // L: 572
				var5.setColor(Color.white); // L: 573
				var5.drawString(var2, var8 + (304 - class60.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22); // L: 574
			}
		} catch (Exception var11) { // L: 577
			this.canvas.repaint(); // L: 578
		}

	} // L: 580

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	protected final void method489() {
		class30.field147 = null; // L: 583
		PcmPlayer.fontHelvetica13 = null; // L: 584
		class60.loginScreenFontMetrics = null; // L: 585
	} // L: 586

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "512083621"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) { // L: 589
			this.hasErrored = true; // L: 590
			System.out.println("error_game_" + var1); // L: 591

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self"); // L: 593
			} catch (Exception var3) { // L: 595
			}

		}
	} // L: 596

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "52"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this); // L: 599
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lrz;",
		garbageValue = "-1502639005"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container(); // L: 604
		int var2 = Math.max(var1.getWidth(), this.field188); // L: 605
		int var3 = Math.max(var1.getHeight(), this.field189); // L: 606
		if (this.frame != null) { // L: 607
			Insets var4 = this.frame.getInsets(); // L: 608
			var2 -= var4.right + var4.left; // L: 609
			var3 -= var4.bottom + var4.top; // L: 610
		}

		return new Bounds(var2, var3); // L: 612
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2099249271"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null; // L: 616
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "740257686"
	)
	protected abstract void vmethod1203();

	public final void destroy() {
		if (this == gameEngine && !isKilled) { // L: 474
			stopTimeMs = VerticalAlignment.method3924(); // L: 475
			class499.method8677(5000L); // L: 476
			this.kill(); // L: 477
		}
	} // L: 478

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) { // L: 487
			this.fullRedraw = true; // L: 488
			if (VerticalAlignment.method3924() - this.field193 > 1000L) { // L: 489
				Rectangle var2 = var1.getClipBounds(); // L: 490
				if (var2 == null || var2.width >= class148.canvasWidth && var2.height >= class342.canvasHeight) {
					this.isCanvasInvalid = true; // L: 491
				}
			}

		}
	} // L: 493

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) { // L: 329
				String var1 = TaskHandler.javaVendor.toLowerCase(); // L: 330
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) { // L: 331
					String var2 = TaskHandler.javaVersion; // L: 332
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) { // L: 333
						this.error("wrongjava"); // L: 334
						return; // L: 335
					}

					if (var2.startsWith("1.6.0_")) { // L: 337
						int var3;
						for (var3 = 6; var3 < var2.length() && class384.isDigit(var2.charAt(var3)); ++var3) { // L: 338 339
						}

						String var4 = var2.substring(6, var3); // L: 340
						if (CollisionMap.isNumber(var4) && KitDefinition.method3778(var4) < 10) { // L: 341
							this.error("wrongjava"); // L: 342
							return; // L: 343
						}
					}

					fiveOrOne = 5; // L: 346
				}
			}

			this.setFocusCycleRoot(true); // L: 349
			this.addCanvas(); // L: 351
			this.setUp(); // L: 353
			clock = class138.method3101(); // L: 354

			while (stopTimeMs == 0L || VerticalAlignment.method3924() < stopTimeMs) { // L: 355
				VertexNormal.gameCyclesToDo = clock.wait(cycleDurationMillis, fiveOrOne); // L: 356

				for (int var5 = 0; var5 < VertexNormal.gameCyclesToDo; ++var5) { // L: 357
					this.clientTick();
				}

				this.graphicsTick(); // L: 359
				this.post(this.canvas); // L: 361
			}
		} catch (Exception var6) { // L: 364
			class180.RunException_sendStackTrace((String)null, var6); // L: 365
			this.error("crash"); // L: 366
		}

		this.kill(); // L: 368
	} // L: 369

	public final void start() {
		if (this == gameEngine && !isKilled) { // L: 462
			stopTimeMs = 0L; // L: 463
		}
	} // L: 464

	public final void update(Graphics var1) {
		this.paint(var1); // L: 482
	} // L: 483

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true; // L: 497
		this.fullRedraw = true; // L: 498
	} // L: 499

	public final void windowDeactivated(WindowEvent var1) {
	} // L: 518

	public final void windowActivated(WindowEvent var1) {
	} // L: 507

	public final void windowClosed(WindowEvent var1) {
	} // L: 510

	public final void windowClosing(WindowEvent var1) {
		this.destroy(); // L: 514
	} // L: 515

	public final void windowDeiconified(WindowEvent var1) {
	} // L: 521

	public final void windowOpened(WindowEvent var1) {
	} // L: 527

	@ObfuscatedName("init")
	@Export("kill0")
	public abstract void kill0();

	public final void windowIconified(WindowEvent var1) {
	} // L: 524

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false; // L: 503
	} // L: 504

	public final void stop() {
		if (this == gameEngine && !isKilled) { // L: 468
			stopTimeMs = VerticalAlignment.method3924() + 4000L; // L: 469
		}
	} // L: 470

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1826825844"
	)
	public static int method621(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-132402851"
	)
	static int method620(int var0, Script var1, boolean var2) {
		if (var0 == 7463) { // L: 5172
			boolean var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 5173
			AbstractWorldMapData.method5680(var3); // L: 5174
			return 1; // L: 5175
		} else {
			return 2; // L: 5177
		}
	}
}
