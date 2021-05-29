import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("StudioGame")
public enum StudioGame implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("r")
	@Export("name")
	public final String name;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1213598965
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "31"
	)
	public static void method4847(boolean var0) {
		if (NetCache.NetCache_socket != null) {
			try {
				Buffer var1 = new Buffer(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.writeMedium(0);
				NetCache.NetCache_socket.write(var1.array, 0, 4);
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var3) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
			}

		}
	}
}
