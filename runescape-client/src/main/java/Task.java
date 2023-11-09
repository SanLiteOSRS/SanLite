import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("Task")
public class Task {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("ab")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1519147737
	)
	@Export("type")
	int type;
	@ObfuscatedName("ao")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("av")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("aq")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 10
	} // L: 22
}
