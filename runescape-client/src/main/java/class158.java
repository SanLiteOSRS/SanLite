import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class158 extends class151 {
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -624288385
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("a")
	String field1751;
	@ObfuscatedName("f")
	byte field1749;
	@ObfuscatedName("c")
	byte field1752;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class158(class152 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "85"
	)
	void vmethod3238(Buffer var1) {
		this.field1751 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1751 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1749 = var1.readByte(); // L: 161
			this.field1752 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)V",
		garbageValue = "-1303116736"
	)
	void vmethod3239(ClanChannel var1) {
		var1.name = this.field1751; // L: 167
		if (this.field1751 != null) { // L: 168
			var1.field1725 = this.field1749; // L: 169
			var1.field1731 = this.field1752; // L: 170
		}

	} // L: 172

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgx;",
		garbageValue = "2"
	)
	public static HitSplatDefinition method3241(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 52
		if (var1 != null) { // L: 53
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 54
			var1 = new HitSplatDefinition(); // L: 55
			if (var2 != null) { // L: 56
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 57
			return var1; // L: 58
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llx;IIIBZI)V",
		garbageValue = "1712140055"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 99
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 100
		if (var8 == null) { // L: 101
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 102
			if (var8 == null) { // L: 103
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 104
				if (var8 != null) { // L: 105
					if (var5) { // L: 106
						var8.removeDual(); // L: 107
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 108
						--NetCache.NetCache_pendingWritesCount; // L: 109
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 110
					}

				} else {
					if (!var5) { // L: 114
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 115
						if (var8 != null) { // L: 116
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 118
					var8.archive = var0; // L: 119
					var8.crc = var3; // L: 120
					var8.padding = var4; // L: 121
					if (var5) { // L: 122
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 123
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 124
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 127
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 128
						++NetCache.NetCache_pendingWritesCount; // L: 129
					}

				}
			}
		}
	} // L: 112 131
}
