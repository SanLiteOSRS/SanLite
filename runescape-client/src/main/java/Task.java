import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("Task")
public class Task {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("aw")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 83678457
	)
	@Export("type")
	int type;
	@ObfuscatedName("ap")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("av")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("an")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 10
	} // L: 22
}
