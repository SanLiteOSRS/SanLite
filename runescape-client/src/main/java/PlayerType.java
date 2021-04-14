import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("PlayerType")
public enum PlayerType implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lit;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lit;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lit;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lit;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lit;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lit;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lit;"
	)
	field3226(6, 22, false, false, true);

	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1018159087
	)
	@Export("id")
	final int id;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 210736671
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("n")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("l")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "58"
	)
	public static void method4414() {
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-96"
	)
	static final void method4410() {
		boolean var0 = false;

		while (!var0) {
			var0 = true;

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) {
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) {
					String var2 = Client.menuTargets[var1];
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
					Client.menuTargets[var1 + 1] = var2;
					String var3 = Client.menuActions[var1];
					Client.menuActions[var1] = Client.menuActions[var1 + 1];
					Client.menuActions[var1 + 1] = var3;
					int var4 = Client.menuOpcodes[var1];
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
					Client.menuOpcodes[var1 + 1] = var4;
					var4 = Client.menuArguments1[var1];
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1];
					Client.menuArguments1[var1 + 1] = var4;
					var4 = Client.menuArguments2[var1];
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1];
					Client.menuArguments2[var1 + 1] = var4;
					var4 = Client.menuIdentifiers[var1];
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
					Client.menuIdentifiers[var1 + 1] = var4;
					boolean var5 = Client.menuShiftClick[var1];
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1];
					Client.menuShiftClick[var1 + 1] = var5;
					var0 = false;
				}
			}
		}

	}
}
