import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
final class class373 implements class370 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnd;I)V",
		garbageValue = "510448708"
	)
	public void vmethod6493(Object var1, Buffer var2) {
		this.method6465((Long)var1, var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)Ljava/lang/Object;",
		garbageValue = "-1954872085"
	)
	public Object vmethod6500(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lnd;I)V",
		garbageValue = "-1988673452"
	)
	void method6465(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1793660977"
	)
	static void method6474() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) {
				NetSocket.addPlayerToScene(Client.players[var1[var2]], true);
			}
		}

	}
}
