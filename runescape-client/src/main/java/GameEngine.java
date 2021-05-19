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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aq")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 592572313
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = 4399734566856099317L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("l")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -217446521
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2138888743
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 484725993
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 410287199
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("r")
	@Export("graphicsTickTimes")
	protected static long[] graphicsTickTimes;
	@ObfuscatedName("a")
	@Export("clientTickTimes")
	protected static long[] clientTickTimes;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2119001659
	)
	@Export("clientTickTimeIdx")
	static int clientTickTimeIdx;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -135808343
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1378639745
	)
	static int field339;
	@ObfuscatedName("ac")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -1169990265502420109L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 6076947773962414417L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("z")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 743110399
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1135790119
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2057175105
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 992390113
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1928026365
	)
	int field332;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -387860183
	)
	int field333;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -328692287
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1109070493
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("at")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("av")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("al")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ax")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ak")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 7498009749239990725L
	)
	volatile long field342;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("as")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("ad")
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
		field339 = 500;
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
		this.field342 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		StructComposition.method2863(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-26"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method542();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "-21"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				UrlRequest.sleepExact(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Ldb;",
		garbageValue = "49"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "45003502"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1356656584"
	)
	protected void method527(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "615867530"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		SecureRandomCallable.method2080();
		class82.method1946(this.canvas);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-715885048"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field332);
			this.contentHeight = Math.max(var2.highY, this.field333);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			HealthBarDefinition.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(canvasWidth, HealthBarDefinition.canvasHeight);
			WorldMapDecorationType.rasterProvider = new RasterProvider(canvasWidth, HealthBarDefinition.canvasHeight, this.canvas);
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-997141942"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1625111694"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - canvasWidth - var1;
		int var4 = this.contentHeight - HealthBarDefinition.canvasHeight - var2;
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "22836699"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		java.awt.Canvas var1 = this.canvas;
		var1.removeKeyListener(KeyHandler.KeyHandler_instance);
		var1.removeFocusListener(KeyHandler.KeyHandler_instance);
		KeyHandler.field260 = -1;
		class21.method289(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		class82.method1946(this.canvas);
		class12.method192(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method542();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "70"
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
			canvasWidth = var1;
			HealthBarDefinition.canvasHeight = var2;
			TileItem.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			class27.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-159166525"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		canvasWidth = Math.max(var1.getWidth(), this.field332);
		HealthBarDefinition.canvasHeight = Math.max(var1.getHeight(), this.field333);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			canvasWidth -= var2.left + var2.right;
			HealthBarDefinition.canvasHeight -= var2.top + var2.bottom;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(canvasWidth, HealthBarDefinition.canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (WorldMapDecorationType.rasterProvider != null && canvasWidth == WorldMapDecorationType.rasterProvider.width && HealthBarDefinition.canvasHeight == WorldMapDecorationType.rasterProvider.height) {
			((RasterProvider)WorldMapDecorationType.rasterProvider).setComponent(this.canvas);
			WorldMapDecorationType.rasterProvider.drawFull(0, 0);
		} else {
			WorldMapDecorationType.rasterProvider = new RasterProvider(canvasWidth, HealthBarDefinition.canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field342 = Archive.currentTimeMillis();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1116268715"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2127496332"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = Archive.currentTimeMillis();
		long var3 = clientTickTimes[clientTickTimeIdx];
		clientTickTimes[clientTickTimeIdx] = var1;
		clientTickTimeIdx = clientTickTimeIdx + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			class124.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "585935525"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = Archive.currentTimeMillis();
		long var4 = graphicsTickTimes[class286.graphicsTickTimeIdx];
		graphicsTickTimes[class286.graphicsTickTimeIdx] = var2;
		class286.graphicsTickTimeIdx = class286.graphicsTickTimeIdx + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field339 - 1 > 50) {
			field339 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(canvasWidth, HealthBarDefinition.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method538();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2139850312"
	)
	final void method538() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	final void method542() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-643465371"
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

			this.vmethod1216();
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1254682788"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "302617031"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1176468254"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2107475994"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "-802613405"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (class9.fontHelvetica13 == null) {
				class9.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				Interpreter.loginScreenFontMetrics = this.canvas.getFontMetrics(class9.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, canvasWidth, HealthBarDefinition.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (class340.field3934 == null) {
					class340.field3934 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = class340.field3934.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class9.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - Interpreter.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(class340.field3934, canvasWidth / 2 - 152, HealthBarDefinition.canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = canvasWidth / 2 - 152;
				int var8 = HealthBarDefinition.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class9.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - Interpreter.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-856068332"
	)
	protected final void method548() {
		class340.field3934 = null;
		class9.fontHelvetica13 = null;
		Interpreter.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1312350525"
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
		garbageValue = "2028320240"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lle;",
		garbageValue = "1474283096"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field332);
		int var3 = Math.max(var1.getHeight(), this.field333);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-290533301"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1701648283"
	)
	protected abstract void vmethod1216();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (Archive.currentTimeMillis() - this.field342 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= canvasWidth && var2.height >= HealthBarDefinition.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = Archive.currentTimeMillis();
			UrlRequest.sleepExact(5000L);
			this.kill();
		}
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = Archive.currentTimeMillis() + 4000L;
		}
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
						for (var3 = 6; var3 < var2.length() && GrandExchangeOfferWorldComparator.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (GrandExchangeOfferAgeComparator.isNumber(var4) && FontName.method6162(var4) < 10) {
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
			WorldMapRectangle.clock = Clock.method2597();

			while (stopTimeMs == 0L || Archive.currentTimeMillis() < stopTimeMs) {
				gameCyclesToDo = WorldMapRectangle.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			class27.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

		this.kill();
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowActivated(WindowEvent var1) {
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1912933891"
	)
	public static int method674(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "18"
	)
	static int method588(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			WorldMapCacheName.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = DevicePcmPlayerProvider.getWidget(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					var6.children[var11] = var12;
					if (var2) {
						class308.scriptDotWidget = var12;
					} else {
						class24.scriptActiveWidget = var12;
					}

					VerticalAlignment.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget;
				Widget var10 = DevicePcmPlayerProvider.getWidget(var3.id);
				var10.children[var3.childIndex] = null;
				VerticalAlignment.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
				var3.children = null;
				VerticalAlignment.invalidateWidget(var3);
				return 1;
			} else if (var0 == 103) {
				WorldMapCacheName.Interpreter_intStackSize -= 3;
				return 1;
			} else if (var0 == 104) {
				--WorldMapCacheName.Interpreter_intStackSize;
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							class308.scriptDotWidget = var3;
						} else {
							class24.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				Widget var5 = PacketWriter.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						class308.scriptDotWidget = var5;
					} else {
						class24.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
