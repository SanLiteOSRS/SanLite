import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 910859569
	)
	public int field4683;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ar")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4683 = (int)(SpotAnimationDefinition.method3775() / 1000L); // L: 109
		this.username = var1; // L: 110
		this.world = (short)var2; // L: 111
	} // L: 112

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Lhx;IIILdf;B)V",
		garbageValue = "-64"
	)
	static void method8127(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) { // L: 3668
			if (var0.field2212 != null && var0.field2212.containsKey(var1)) { // L: 3669
				int var5 = (Integer)var0.field2212.get(var1) & 15; // L: 3670
				if ((var5 <= 0 || WorldMapIcon_1.clientPreferences.method2605() != 0) && (var5 != 0 || WorldMapIcon_1.clientPreferences.method2556() != 0)) { // L: 3671
					int var6 = (Integer)var0.field2212.get(var1); // L: 3672
					boolean var9 = var4 == class229.localPlayer; // L: 3675
					if (var6 != 0) { // L: 3677
						int var10 = var6 & 15; // L: 3678
						int var11;
						int var12;
						if (var10 == 0) { // L: 3679
							if (!var9) { // L: 3680
								return; // L: 3698
							}

							Client.soundLocations[Client.soundEffectCount] = 0; // L: 3683
						} else {
							var11 = (var2 - 64) / 128; // L: 3686
							var12 = (var3 - 64) / 128; // L: 3687
							Client.soundLocations[Client.soundEffectCount] = var10 + (var12 << 8) + (var11 << 16); // L: 3688
						}

						var11 = var6 >> 8; // L: 3690
						var12 = var6 >> 4 & 7; // L: 3691
						Client.soundEffectIds[Client.soundEffectCount] = var11; // L: 3692
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var12; // L: 3693
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3694
						Client.soundEffects[Client.soundEffectCount] = null; // L: 3695
						++Client.soundEffectCount; // L: 3696
					}

				}
			}
		}
	}
}
