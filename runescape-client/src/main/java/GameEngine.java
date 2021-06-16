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

@ObfuscatedName("aa")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1592553527
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 8033536561469626209L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("o")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1667530929
	)
	@Export("cycleDurationMillis")
	static int cycleDurationMillis;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -897639339
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -71568651
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("k")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("t")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 403418391
	)
	static int field341;
	@ObfuscatedName("ay")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 735532951630652423L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -2068701588192565283L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("m")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1593755803
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1016616117
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -555916595
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1657620013
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1863798935
	)
	int field334;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 333844793
	)
	int field328;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 6136823
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 290386939
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("az")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ap")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ag")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("ae")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("ao")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -109758639681671179L
	)
	volatile long field348;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("as")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("au")
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
		field341 = 500;
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
		this.field348 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		BufferedNetSocket.method5960(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2123531727"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method582();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-2062739769"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				class18.method272(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Lei;",
		garbageValue = "6"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "272269884"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-476290304"
	)
	protected void method599(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1189108596"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		NetCache.method5177();
		SoundCache.method932(this.canvas);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "72"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		PacketBufferNode.method4497(this.canvas);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field334);
			this.contentHeight = Math.max(var2.highY, this.field328);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			AttackOption.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class0.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - AttackOption.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(AttackOption.canvasWidth, class0.canvasHeight);
			AbstractWorldMapData.rasterProvider = new RasterProvider(AttackOption.canvasWidth, class0.canvasHeight, this.canvas);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-95"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "97"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - AttackOption.canvasWidth - var1;
		int var4 = this.contentHeight - class0.canvasHeight - var2;
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-4788971"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		class18.method275(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.removeMouseListener(MouseHandler.MouseHandler_instance);
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.removeFrom(this.canvas);
		}

		this.addCanvas();
		SoundCache.method932(this.canvas);
		PacketBufferNode.method4497(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method582();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-812079878"
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
			AttackOption.canvasWidth = var1;
			class0.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var5) {
			FriendsChatManager.RunException_sendStackTrace((String)null, var5);
			this.error("crash");
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2087382687"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		AttackOption.canvasWidth = Math.max(var1.getWidth(), this.field334);
		class0.canvasHeight = Math.max(var1.getHeight(), this.field328);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			AttackOption.canvasWidth -= var2.left + var2.right;
			class0.canvasHeight -= var2.top + var2.bottom;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(AttackOption.canvasWidth, class0.canvasHeight);
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
		if (AbstractWorldMapData.rasterProvider != null && AttackOption.canvasWidth == AbstractWorldMapData.rasterProvider.width && class0.canvasHeight == AbstractWorldMapData.rasterProvider.height) {
			((RasterProvider)AbstractWorldMapData.rasterProvider).setComponent(this.canvas);
			AbstractWorldMapData.rasterProvider.drawFull(0, 0);
		} else {
			AbstractWorldMapData.rasterProvider = new RasterProvider(AttackOption.canvasWidth, class0.canvasHeight, this.canvas);
		}

		this.isCanvasInvalid = false;
		this.field348 = ClientPacket.currentTimeMillis();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1590867757"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "85"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = ClientPacket.currentTimeMillis();
		long var3 = clientTickTimes[CollisionMap.clientTickTimeIdx];
		clientTickTimes[CollisionMap.clientTickTimeIdx] = var1;
		CollisionMap.clientTickTimeIdx = CollisionMap.clientTickTimeIdx + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			class397.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1414104897"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = ClientPacket.currentTimeMillis();
		long var4 = graphicsTickTimes[ReflectionCheck.graphicsTickTimeIdx];
		graphicsTickTimes[ReflectionCheck.graphicsTickTimeIdx] = var2;
		ReflectionCheck.graphicsTickTimeIdx = ReflectionCheck.graphicsTickTimeIdx + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field341 - 1 > 50) {
			field341 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(AttackOption.canvasWidth, class0.canvasHeight);
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

		this.method581();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "179024739"
	)
	final void method581() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1411086569"
	)
	final void method582() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1781774601"
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

			this.vmethod1278();
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1587549695"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2087654500"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "49"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1785168903"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZI)V",
		garbageValue = "1399625911"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3) {
		try {
			Graphics var4 = this.canvas.getGraphics();
			if (class13.fontHelvetica13 == null) {
				class13.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class265.loginScreenFontMetrics = this.canvas.getFontMetrics(class13.fontHelvetica13);
			}

			if (var3) {
				var4.setColor(Color.black);
				var4.fillRect(0, 0, AttackOption.canvasWidth, class0.canvasHeight);
			}

			Color var5 = new Color(140, 17, 17);

			try {
				if (MilliClock.field1527 == null) {
					MilliClock.field1527 = this.canvas.createImage(304, 34);
				}

				Graphics var6 = MilliClock.field1527.getGraphics();
				var6.setColor(var5);
				var6.drawRect(0, 0, 303, 33);
				var6.fillRect(2, 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(1, 1, 301, 31);
				var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var6.setFont(class13.fontHelvetica13);
				var6.setColor(Color.white);
				var6.drawString(var2, (304 - class265.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var4.drawImage(MilliClock.field1527, AttackOption.canvasWidth / 2 - 152, class0.canvasHeight / 2 - 18, (ImageObserver)null);
			} catch (Exception var9) {
				int var7 = AttackOption.canvasWidth / 2 - 152;
				int var8 = class0.canvasHeight / 2 - 18;
				var4.setColor(var5);
				var4.drawRect(var7, var8, 303, 33);
				var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
				var4.setColor(Color.black);
				var4.drawRect(var7 + 1, var8 + 1, 301, 31);
				var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
				var4.setFont(class13.fontHelvetica13);
				var4.setColor(Color.white);
				var4.drawString(var2, var7 + (304 - class265.loginScreenFontMetrics.stringWidth(var2)) / 2, var8 + 22);
			}
		} catch (Exception var10) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1903578766"
	)
	protected final void method672() {
		MilliClock.field1527 = null;
		class13.fontHelvetica13 = null;
		class265.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1320809291"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "1"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Llw;",
		garbageValue = "-6"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field334);
		int var3 = Math.max(var1.getHeight(), this.field328);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-969524667"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1888551887"
	)
	protected abstract void vmethod1278();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (ClientPacket.currentTimeMillis() - this.field348 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= AttackOption.canvasWidth && var2.height >= class0.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = ClientPacket.currentTimeMillis();
			class18.method272(5000L);
			this.kill();
		}
	}

	public abstract void init();

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
						for (var3 = 6; var3 < var2.length() && class105.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (Varps.isNumber(var4) && FontName.method6335(var4) < 10) {
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

			class160.clock = (Clock)var8;

			while (0L == stopTimeMs || ClientPacket.currentTimeMillis() < stopTimeMs) {
				class372.gameCyclesToDo = class160.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class372.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			FriendsChatManager.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = ClientPacket.currentTimeMillis() + 4000L;
		}
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "-1582150364"
	)
	static long method716(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1255982290"
	)
	static final boolean method717() {
		return Client.isMenuOpen;
	}
}
