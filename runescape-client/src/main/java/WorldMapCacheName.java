import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final WorldMapCacheName field2128;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final WorldMapCacheName field2123;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final WorldMapCacheName field2124;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	static final WorldMapCacheName field2122;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	public static final WorldMapCacheName field2126;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -159166525
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("z")
	@Export("name")
	public final String name;

	static {
		field2128 = new WorldMapCacheName("details");
		field2123 = new WorldMapCacheName("compositemap");
		field2124 = new WorldMapCacheName("compositetexture");
		field2122 = new WorldMapCacheName("area");
		field2126 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "-1988606956"
	)
	static String method3646(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) {
			RunException var2 = (RunException)var0;
			var1 = var2.message + " | ";
			var0 = var2.throwable;
		} else {
			var1 = "";
		}

		StringWriter var12 = new StringWriter();
		PrintWriter var3 = new PrintWriter(var12);
		var0.printStackTrace(var3);
		var3.close();
		String var4 = var12.toString();
		BufferedReader var5 = new BufferedReader(new StringReader(var4));
		String var6 = var5.readLine();

		while (true) {
			while (true) {
				String var7 = var5.readLine();
				if (var7 == null) {
					var1 = var1 + "| " + var6;
					return var1;
				}

				int var8 = var7.indexOf(40);
				int var9 = var7.indexOf(41, var8 + 1);
				if (var8 >= 0 && var9 >= 0) {
					String var10 = var7.substring(var8 + 1, var9);
					int var11 = var10.indexOf(".java:");
					if (var11 >= 0) {
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5);
						var1 = var1 + var10 + ' ';
						continue;
					}

					var7 = var7.substring(0, var8);
				}

				var7 = var7.trim();
				var7 = var7.substring(var7.lastIndexOf(32) + 1);
				var7 = var7.substring(var7.lastIndexOf(9) + 1);
				var1 = var1 + var7 + ' ';
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "97"
	)
	static void method3648() {
		if (PrivateChatMode.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(Liv;III)V",
		garbageValue = "-991343714"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class229.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var7 * var5 + var4 * var8 >> 11;
					int var10 = var5 * var8 - var7 * var4 >> 11;
					int var11 = var9 + class35.localPlayer.x >> 7;
					int var12 = class35.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2582, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.method6610(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
					var13.packetBuffer.writeShort(Messages.baseY * 64 + var12);
					var13.packetBuffer.writeShort(JagexCache.baseX * 64 + var11);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class35.localPlayer.x);
					var13.packetBuffer.writeShort(class35.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
