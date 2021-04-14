import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lkf;"
	)
	field3517(1, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lkf;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lkf;"
	)
	field3514(2, 2);

	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 5650729
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -974816521
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1799855349"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
