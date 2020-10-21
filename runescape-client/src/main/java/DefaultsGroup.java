import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Llk;"
	)
	static final DefaultsGroup field3833;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "[Lcf;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "[Lle;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -506210431
	)
	@Export("group")
	final int group;

	static {
		field3833 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
