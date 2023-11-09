import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public class class53 extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public static AbstractArchive field393;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	class47 field391;

	public class53() {
		this.field391 = null; // L: 9
	} // L: 10

	@ObfuscatedSignature(
		descriptor = "(Lcz;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) { // L: 13
			this.field391 = new class47(var1, (RawSound)null); // L: 16
		}
	} // L: 14 17

	@ObfuscatedSignature(
		descriptor = "(Lbi;)V"
	)
	public class53(RawSound var1) {
		this.field391 = new class47((VorbisSample)null, var1); // L: 20
	} // L: 21

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public boolean method1092() {
		return this.field391 == null; // L: 24
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lbi;",
		garbageValue = "7"
	)
	public RawSound method1090() {
		if (this.field391 != null && this.field391.field355.tryLock()) { // L: 28
			RawSound var1;
			try {
				var1 = this.method1095(); // L: 31
			} finally {
				this.field391.field355.unlock(); // L: 34
			}

			return var1; // L: 36
		} else {
			return null; // L: 38
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Lbi;",
		garbageValue = "49"
	)
	public RawSound method1098() {
		if (this.field391 != null) { // L: 42
			this.field391.field355.lock(); // L: 43

			RawSound var1;
			try {
				var1 = this.method1095(); // L: 46
			} finally {
				this.field391.field355.unlock(); // L: 49
			}

			return var1; // L: 51
		} else {
			return null; // L: 53
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lbi;",
		garbageValue = "1214181090"
	)
	RawSound method1095() {
		if (this.field391.field354 == null) { // L: 57
			this.field391.field354 = this.field391.field358.toRawSound((int[])null); // L: 58
			this.field391.field358 = null; // L: 59
		}

		return this.field391.field354; // L: 61
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "102"
	)
	static final void method1105(PacketBuffer var0) {
		var0.importIndex(); // L: 9097
		int var1 = var0.readBits(8); // L: 9098
		int var2;
		if (var1 < Client.npcCount) { // L: 9099
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 9100
				Client.field601[++Client.field645 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 9102
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 9103

			for (var2 = 0; var2 < var1; ++var2) { // L: 9104
				int var3 = Client.npcIndices[var2]; // L: 9105
				NPC var4 = Client.npcs[var3]; // L: 9106
				int var5 = var0.readBits(1); // L: 9107
				if (var5 == 0) { // L: 9108
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 9109
					var4.npcCycle = Client.cycle; // L: 9110
				} else {
					int var6 = var0.readBits(2); // L: 9113
					if (var6 == 0) { // L: 9114
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 9115
						var4.npcCycle = Client.cycle; // L: 9116
						Client.field587[++Client.field801 - 1] = var3; // L: 9117
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 9120
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 9121
							var4.npcCycle = Client.cycle; // L: 9122
							var7 = var0.readBits(3); // L: 9123
							var4.method2592(var7, class218.field2384); // L: 9124
							var8 = var0.readBits(1); // L: 9125
							if (var8 == 1) { // L: 9126
								Client.field587[++Client.field801 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 9129
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 9130
							var4.npcCycle = Client.cycle; // L: 9131
							if (var0.readBits(1) == 1) { // L: 9132
								var7 = var0.readBits(3); // L: 9133
								var4.method2592(var7, class218.field2377); // L: 9134
								var8 = var0.readBits(3); // L: 9135
								var4.method2592(var8, class218.field2377); // L: 9136
							} else {
								var7 = var0.readBits(3); // L: 9139
								var4.method2592(var7, class218.field2378); // L: 9140
							}

							var7 = var0.readBits(1); // L: 9142
							if (var7 == 1) { // L: 9143
								Client.field587[++Client.field801 - 1] = var3;
							}
						} else if (var6 == 3) { // L: 9146
							Client.field601[++Client.field645 - 1] = var3; // L: 9147
						}
					}
				}
			}

		}
	} // L: 9151
}
