import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements class387 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	field1937(0, 0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	field1935(1, 2);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -965677749
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1995200501
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-5089"
	)
	static void method3713() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54
}
