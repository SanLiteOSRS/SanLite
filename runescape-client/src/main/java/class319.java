import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class319 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	public static AbstractArchive field3458;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	public static AbstractArchive field3455;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	public static AbstractArchive field3456;
	@ObfuscatedName("aj")
	public static ArrayList field3457;
	@ObfuscatedName("aq")
	public static LinkedList field3461;
	@ObfuscatedName("ar")
	public static ArrayList field3459;
	@ObfuscatedName("ag")
	public static ArrayList field3466;
	@ObfuscatedName("ao")
	public static ArrayList field3462;
	@ObfuscatedName("ae")
	public static final List field3463;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -376058759
	)
	static int field3460;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 711086529
	)
	static int field3464;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -177841689
	)
	static int field3465;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1146087885
	)
	static int field3454;
	@ObfuscatedName("js")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;

	static {
		field3457 = null; // L: 13
		field3461 = new LinkedList(); // L: 14
		field3459 = new ArrayList(3); // L: 15
		field3466 = new ArrayList(3); // L: 16
		field3462 = new ArrayList(); // L: 17
		field3463 = new ArrayList(); // L: 18
		field3460 = 0; // L: 19
		field3464 = 0; // L: 20
		field3465 = 0;
		field3454 = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "958296006"
	)
	static void method6068(int var0) {
		class466.field4808 = var0; // L: 21
		class466.field4811 = new class466[var0]; // L: 22
		class431.field4647 = 0; // L: 23
	} // L: 24
}
