import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class193 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	public static EvictingDualNodeHashTable field1990;
	@ObfuscatedName("at")
	static File field1986;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -1300460723
	)
	@Export("cameraZ")
	static int cameraZ;

	static {
		field1990 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IS)Lio;",
		garbageValue = "256"
	)
	public static HitSplatDefinition method3723(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1853820072"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 27
		if (var4 == null) { // L: 28
			var4 = new ChatChannel(); // L: 29
			Messages.Messages_channels.put(var0, var4); // L: 30
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 32
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 33
		Messages.Messages_queue.add(var5); // L: 34
		Client.chatCycle = Client.cycleCntr; // L: 35
	} // L: 36

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-299676250"
	)
	public static int method3722(int var0) {
		--var0; // L: 66
		var0 |= var0 >>> 1; // L: 67
		var0 |= var0 >>> 2; // L: 68
		var0 |= var0 >>> 4; // L: 69
		var0 |= var0 >>> 8; // L: 70
		var0 |= var0 >>> 16; // L: 71
		return var0 + 1; // L: 72
	}
}
