import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1743(2, 0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1744(1, 2);

	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1028915727
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1836218951
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	static final void method3159() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			Player var3 = Client.players[var1[var2]];
			if (var3 != null) {
				class135.updateActorSequence(var3, 1);
			}
		}

	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-375267443"
	)
	static void method3157() {
		if (Client.renderSelf) {
			class132.addPlayerToScene(HealthBarDefinition.localPlayer, false);
		}

	}
}
