import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1949273929"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-994274734"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-356932832"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3813
			class169.method3521(0, 0); // L: 3814
		} else if (var0 != -1 && !WorldMapManager.method4894(var0) && class30.clientPreferences.method2544() != 0) { // L: 3816
			ArrayList var1 = new ArrayList(); // L: 3817
			var1.add(new class333(Renderable.field2921, var0, 0, class30.clientPreferences.method2544(), false)); // L: 3818
			if (Client.playingJingle) { // L: 3819
				class133.method3120(var1, 0, 100, 100, 0); // L: 3820
			} else {
				PacketWriter.method2891(var1, 0, 100, 100, 0, false); // L: 3823
			}
		}

	} // L: 3826

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1743387110"
	)
	static final void method6954() {
		int var0 = Players.Players_count; // L: 4182
		int[] var1 = Players.Players_indices; // L: 4183

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4184
			Player var3 = Client.players[var1[var2]]; // L: 4185
			if (var3 != null) { // L: 4186
				ScriptEvent.updateActorSequence(var3, 1); // L: 4187
			}
		}

	} // L: 4190
}
