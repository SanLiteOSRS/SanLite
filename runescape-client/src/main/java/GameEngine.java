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

@ObfuscatedName("af")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 661166393
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 3801980113368397719L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("j")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 849049895
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1089824943
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1080528073
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("clock")
	protected static Clock clock;
	@ObfuscatedName("c")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1807936759
	)
	@Export("graphicsTickTimeIdx")
	static int graphicsTickTimeIdx;
	@ObfuscatedName("g")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1202015039
	)
	@Export("clientTickTimeIdx")
	static int clientTickTimeIdx;
	@ObfuscatedName("ax")
	static Image field354;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 116937435
	)
	static int field355;
	@ObfuscatedName("aq")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 6246927008582722683L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -7805304911218154981L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("r")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1091351445
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2128033235
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1437613301
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -179382835
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1558391463
	)
	int field350;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -422930921
	)
	int field348;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 59571423
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -45318295
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("ai")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ar")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ag")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("aj")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("am")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 8555805370222747289L
	)
	volatile long field363;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("ah")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("ao")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null;
		GameEngine_redundantStartThreadCount = 0;
		stopTimeMs = 0L;
		isKilled = false;
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32];
		field355 = 500;
		volatileFocus = true;
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field363 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		class19.method225(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1134068726"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method490();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "104"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				try {
					Thread.sleep(1L);
				} catch (InterruptedException var4) {
				}
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Ldw;",
		garbageValue = "-92"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "383352988"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "973874436"
	)
	protected void method566(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1238474569"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class243.method4668();
		LoginScreenAnimation.method2236(this.canvas);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1759538265"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field350);
			this.contentHeight = Math.max(var2.highY, this.field348);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			class32.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			ReflectionCheck.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - class32.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(class32.canvasWidth, ReflectionCheck.canvasHeight);
			class26.rasterProvider = new RasterProvider(class32.canvasWidth, ReflectionCheck.canvasHeight, this.canvas);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2101906226"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - class32.canvasWidth - var1;
		int var4 = this.contentHeight - ReflectionCheck.canvasHeight - var2;
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
			try {
				Container var5 = this.container();
				int var6 = 0;
				int var7 = 0;
				if (var5 == this.frame) {
					Insets var8 = this.frame.getInsets();
					var6 = var8.left;
					var7 = var8.top;
				}

				Graphics var10 = var5.getGraphics();
				var10.setColor(Color.black);
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight);
				}

				if (var2 > 0) {
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) {
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) {
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) {
			}
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		SoundSystem.method803(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.removeMouseListener(MouseHandler.MouseHandler_instance);
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		LoginScreenAnimation.method2236(this.canvas);
		java.awt.Canvas var2 = this.canvas;
		var2.addMouseListener(MouseHandler.MouseHandler_instance);
		var2.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var2.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method490();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "428962423"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3) {
		try {
			if (gameEngine != null) {
				++GameEngine_redundantStartThreadCount;
				if (GameEngine_redundantStartThreadCount >= 3) {
					this.error("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			gameEngine = this;
			class32.canvasWidth = var1;
			ReflectionCheck.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			class266.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1032083147"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		class32.canvasWidth = Math.max(var1.getWidth(), this.field350);
		ReflectionCheck.canvasHeight = Math.max(var1.getHeight(), this.field348);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			class32.canvasWidth -= var2.right + var2.left;
			ReflectionCheck.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(class32.canvasWidth, ReflectionCheck.canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(var2.left + this.canvasX, this.canvasY + var2.top);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (class26.rasterProvider != null && class32.canvasWidth == class26.rasterProvider.width && ReflectionCheck.canvasHeight == class26.rasterProvider.height) {
			((RasterProvider)class26.rasterProvider).setComponent(this.canvas);
			class26.rasterProvider.drawFull(0, 0);
		} else {
			class26.rasterProvider = new RasterProvider(class32.canvasWidth, ReflectionCheck.canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field363 = ObjectComposition.currentTimeMillis();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1231993586"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (var1.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1);
					}

					if (var1.endsWith("192.168.1.")) {
						return true;
					} else {
						this.error("invalidhost");
						return false;
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "996629970"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = ObjectComposition.currentTimeMillis();
		long var3 = clientTickTimes[clientTickTimeIdx];
		clientTickTimes[clientTickTimeIdx] = var1;
		clientTickTimeIdx = clientTickTimeIdx + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			WorldMapSection1.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-49"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = ObjectComposition.currentTimeMillis();
		long var4 = graphicsTickTimes[graphicsTickTimeIdx];
		graphicsTickTimes[graphicsTickTimeIdx] = var2;
		graphicsTickTimeIdx = graphicsTickTimeIdx + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field355 - 1 > 50) {
			field355 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(class32.canvasWidth, ReflectionCheck.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method493();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	final void method493() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1998261621"
	)
	final void method490() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "928825308"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) {
			isKilled = true;

			try {
				this.canvas.removeFocusListener(this);
			} catch (Exception var5) {
			}

			try {
				this.kill0();
			} catch (Exception var4) {
			}

			if (this.frame != null) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
				}
			}

			if (taskHandler != null) {
				try {
					taskHandler.close();
				} catch (Exception var2) {
				}
			}

			this.vmethod1471();
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-232069568"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "9311"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "561275520"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "91092739"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (KitDefinition.fontHelvetica13 == null) {
				KitDefinition.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				DefaultsGroup.loginScreenFontMetrics = this.canvas.getFontMetrics(KitDefinition.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, class32.canvasWidth, ReflectionCheck.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (field354 == null) {
					field354 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = field354.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(KitDefinition.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - DefaultsGroup.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(field354, class32.canvasWidth / 2 - 152, ReflectionCheck.canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = class32.canvasWidth / 2 - 152;
				int var8 = ReflectionCheck.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(KitDefinition.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - DefaultsGroup.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	protected final void method501() {
		field354 = null;
		KitDefinition.fontHelvetica13 = null;
		DefaultsGroup.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-1"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) {
			this.hasErrored = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var3) {
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "1142166715"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lli;",
		garbageValue = "1389693294"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field350);
		int var3 = Math.max(var1.getHeight(), this.field348);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-45"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-992375266"
	)
	protected abstract void vmethod1471();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = ObjectComposition.currentTimeMillis();
			long var1 = 4999L;

			try {
				Thread.sleep(var1);
			} catch (InterruptedException var5) {
			}

			try {
				Thread.sleep(1L);
			} catch (InterruptedException var4) {
			}

			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (ObjectComposition.currentTimeMillis() - this.field363 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= class32.canvasWidth && var2.height >= ReflectionCheck.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = ObjectComposition.currentTimeMillis() + 4000L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && UserComparator10.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class20.isNumber(var4) && class82.method1908(var4) < 10) {
							this.error("wrongjava");
							return;
						}
					}

					fiveOrOne = 5;
				}
			}

			this.setFocusCycleRoot(true);
			this.addCanvas();
			this.setUp();

			Object var8;
			try {
				var8 = new NanoClock();
			} catch (Throwable var6) {
				var8 = new MilliClock();
			}

			clock = (Clock)var8;

			while (0L == stopTimeMs || ObjectComposition.currentTimeMillis() < stopTimeMs) {
				class260.gameCyclesToDo = clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class260.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			class266.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowDeiconified(WindowEvent var1) {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1726985857"
	)
	static int method538(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2043539672"
	)
	static void method572(int var0) {
		Login.loginIndex = 12;
		Login.field1032 = var0;
	}
}
