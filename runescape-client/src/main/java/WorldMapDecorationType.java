import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3811(0, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3801(1, 0),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3802(2, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3816(3, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3814(9, 2),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3805(4, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3806(5, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3807(6, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3803(7, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3815(8, 1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3818(12, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3810(13, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3812(14, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3813(15, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3822(16, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3804(17, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3800(18, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3817(19, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3808(20, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3819(21, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3820(10, 2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3821(11, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	field3809(22, 3);

	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1197778487
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3; // L: 34
	} // L: 35

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 39
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	public static void method6641() {
		class305.field3398.clear(); // L: 159
	} // L: 160

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lik;IIIB)V",
		garbageValue = "91"
	)
	static void method6643(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && ScriptFrame.clientPreferences.method2571() != 0) { // L: 3713
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3714
				class383.method7203(var0.soundEffects[var1], var2, var3); // L: 3715
			}
		}
	} // L: 3716
}
