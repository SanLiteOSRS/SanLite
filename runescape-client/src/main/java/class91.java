import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public enum class91 implements class390 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1130(0, -1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1124(1, 2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1123(2, 3),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1127(3, 4),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1132(4, 5),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1128(5, 6);

	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 928979459
	)
	final int field1129;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 531703031
	)
	final int field1125;

	class91(int var3, int var4) {
		this.field1129 = var3;
		this.field1125 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1125;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-514020540"
	)
	public static void method2383(AbstractArchive var0) {
		class526.field5151 = var0; // L: 20
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lgk;",
		garbageValue = "55141962"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 23
			var1 = new InvDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)V",
		garbageValue = "1635049666"
	)
	static final void method2381(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 8572

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8573 8574 8579
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 8575
				var10 = var11; // L: 8576
				break;
			}
		}

		if (var10 == null) { // L: 8581
			var10 = new PendingSpawn(); // L: 8582
			var10.plane = var0; // L: 8583
			var10.type = var3; // L: 8584
			var10.x = var1; // L: 8585
			var10.y = var2; // L: 8586
			var10.field1203 = -1; // L: 8587
			class209.method4126(var10); // L: 8588
			Client.pendingSpawns.addFirst(var10); // L: 8589
		}

		var10.field1198 = var4; // L: 8591
		var10.field1191 = var5; // L: 8592
		var10.field1199 = var6; // L: 8593
		var10.delay = var8; // L: 8594
		var10.hitpoints = var9; // L: 8595
		var10.method2455(var7); // L: 8596
	} // L: 8597
}
