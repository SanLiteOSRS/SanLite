import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	public static class300 field1440;
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = -1256129645
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("w")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("s")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 7512820562405009479L
	)
	long field1456;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 83798711
	)
	int field1465;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 627794383
	)
	int field1442;
	@ObfuscatedName("p")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("j")
	public byte field1444;
	@ObfuscatedName("b")
	public byte field1439;
	@ObfuscatedName("x")
	public byte field1446;
	@ObfuscatedName("y")
	public byte field1447;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 287156229
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("t")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("l")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("u")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("n")
	int[] field1452;
	@ObfuscatedName("z")
	public int[] field1453;
	@ObfuscatedName("q")
	public boolean[] field1454;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1564397769
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1945382455
	)
	public int field1438;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1604545471
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("c")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("f")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("h")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lop;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1465 = 0;
		this.name = null;
		this.field1442 = 0;
		this.currentOwner = -1;
		this.field1438 = -1;
		this.method2715(var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-21"
	)
	void method2650(int var1) {
		if (this.useHashes) {
			if (this.memberHashes != null) {
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1];
			}
		}

		if (this.useNames) {
			if (this.memberNames != null) {
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1];
			}
		}

		if (this.memberRanks != null) {
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount);
		} else {
			this.memberRanks = new byte[var1];
		}

		if (this.field1452 != null) {
			System.arraycopy(this.field1452, 0, this.field1452 = new int[var1], 0, this.memberCount);
		} else {
			this.field1452 = new int[var1];
		}

		if (this.field1453 != null) {
			System.arraycopy(this.field1453, 0, this.field1453 = new int[var1], 0, this.memberCount);
		} else {
			this.field1453 = new int[var1];
		}

		if (this.field1454 != null) {
			System.arraycopy(this.field1454, 0, this.field1454 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1454 = new boolean[var1];
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1402687223"
	)
	void method2711(int var1) {
		if (this.useHashes) {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberHashes = new long[var1];
			}
		}

		if (this.useNames) {
			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberNames = new String[var1];
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "0"
	)
	public int method2649(String var1) {
		if (var1 != null && var1.length() != 0) {
			for (int var2 = 0; var2 < this.memberCount; ++var2) {
				if (this.memberNames[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-83"
	)
	public int method2652(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field1452[var1] & var4) >>> var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "688025424"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) {
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1);
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-723355828"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.memberCount];
			this.sortedMembers = new int[this.memberCount];

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) {
				var1[var2] = this.memberNames[var2];
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			BufferedSource.method6301(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;IB)V",
		garbageValue = "86"
	)
	void method2655(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) {
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
				this.method2650(this.memberCount + 5);
			}

			if (this.memberHashes != null) {
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) {
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) {
				this.currentOwner = this.memberCount;
				this.memberRanks[this.memberCount] = 126;
			} else {
				this.memberRanks[this.memberCount] = 0;
			}

			this.field1452[this.memberCount] = 0;
			this.field1453[this.memberCount] = var4;
			this.field1454[this.memberCount] = false;
			++this.memberCount;
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1629682496"
	)
	void method2656(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) {
			--this.memberCount;
			this.sortedMembers = null;
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null;
				this.field1452 = null;
				this.field1453 = null;
				this.field1454 = null;
				this.currentOwner = -1;
				this.field1438 = -1;
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field1452, var1 + 1, this.field1452, var1, this.memberCount - var1);
				System.arraycopy(this.field1453, var1 + 1, this.field1453, var1, this.memberCount - var1);
				System.arraycopy(this.field1454, var1 + 1, this.field1454, var1, this.memberCount - var1);
				if (this.memberHashes != null) {
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) {
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-67"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1;
			this.field1438 = -1;
		} else {
			this.currentOwner = -1;
			this.field1438 = -1;
			int var1 = 0;
			byte var2 = this.memberRanks[0];

			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1438 = var1;
					}

					var1 = var3;
					var2 = this.memberRanks[var3];
				} else if (this.field1438 == -1 && this.memberRanks[var3] == 125) {
					this.field1438 = var3;
				}
			}

			this.currentOwner = var1;
			if (this.currentOwner != -1) {
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "1006184517"
	)
	void method2658(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
				this.method2711(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) {
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) {
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-465841653"
	)
	void method2687(int var1) {
		--this.bannedMemberCount;
		if (this.bannedMemberCount == 0) {
			this.bannedMemberHashes = null;
			this.bannedMemberNames = null;
		} else {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1);
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "-1408414552"
	)
	int method2673(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.currentOwner == var1 && (this.field1438 == -1 || this.memberRanks[this.field1438] < 125)) {
				return -1;
			} else if (this.memberRanks[var1] == var2) {
				return -1;
			} else {
				this.memberRanks[var1] = var2;
				this.updateOwner();
				return var1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1614826959"
	)
	boolean method2661(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) {
			this.memberRanks[this.currentOwner] = 125;
			this.field1438 = this.currentOwner;
			this.memberRanks[var1] = 126;
			this.currentOwner = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "32"
	)
	int method2662(int var1, boolean var2) {
		if (this.field1454[var1] == var2) {
			return -1;
		} else {
			this.field1454[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "1"
	)
	int method2663(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field1452[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field1452[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1591029993"
	)
	boolean method2664(int var1, int var2) {
		if (this.parameters != null) {
			Node var3 = this.parameters.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof IntegerNode) {
					IntegerNode var4 = (IntegerNode)var3;
					if (var2 == var4.integer) {
						return false;
					}

					var4.integer = var2;
					return true;
				}

				var3.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "32"
	)
	boolean method2665(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		if (this.parameters != null) {
			Node var8 = this.parameters.get((long)var1);
			if (var8 != null) {
				if (var8 instanceof IntegerNode) {
					IntegerNode var9 = (IntegerNode)var8;
					if ((var9.integer & var7) == var2) {
						return false;
					}

					var9.integer &= ~var7;
					var9.integer |= var2;
					return true;
				}

				var8.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("z")
	boolean method2666(int var1, long var2) {
		if (this.parameters != null) {
			Node var4 = this.parameters.get((long)var1);
			if (var4 != null) {
				if (var4 instanceof class367) {
					class367 var5 = (class367)var4;
					if (var2 == var5.field4071) {
						return false;
					}

					var5.field4071 = var2;
					return true;
				}

				var4.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new class367(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "-203243509"
	)
	boolean method2667(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) {
			Node var3 = this.parameters.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof ObjectNode) {
					ObjectNode var4 = (ObjectNode)var3;
					if (var4.obj instanceof String) {
						if (var2.equals(var4.obj)) {
							return false;
						}

						var4.remove();
						this.parameters.put(new ObjectNode(var2), var4.key);
						return true;
					}
				}

				var3.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new ObjectNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1240053331"
	)
	void method2715(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 >= 1 && var2 <= 6) {
			int var3 = var1.readUnsignedByte();
			if ((var3 & 1) != 0) {
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) {
				this.useNames = true;
			}

			if (!this.useHashes) {
				this.memberHashes = null;
				this.bannedMemberHashes = null;
			}

			if (!this.useNames) {
				this.memberNames = null;
				this.bannedMemberNames = null;
			}

			this.field1465 = var1.readInt();
			this.field1442 = var1.readInt();
			if (var2 <= 3 && this.field1442 != 0) {
				this.field1442 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort();
			this.bannedMemberCount = var1.readUnsignedByte();
			this.name = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}

			this.allowGuests = var1.readUnsignedByte() == 1;
			this.field1444 = var1.readByte();
			this.field1439 = var1.readByte();
			this.field1446 = var1.readByte();
			this.field1447 = var1.readByte();
			int var4;
			if (this.memberCount > 0) {
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) {
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) {
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) {
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field1452 == null || this.field1452.length < this.memberCount) {
					this.field1452 = new int[this.memberCount];
				}

				if (this.field1453 == null || this.field1453.length < this.memberCount) {
					this.field1453 = new int[this.memberCount];
				}

				if (this.field1454 == null || this.field1454.length < this.memberCount) {
					this.field1454 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) {
					if (this.useHashes) {
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) {
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte();
					if (var2 >= 2) {
						this.field1452[var4] = var1.readInt();
					}

					if (var2 >= 5) {
						this.field1453[var4] = var1.readUnsignedShort();
					} else {
						this.field1453[var4] = 0;
					}

					if (var2 >= 6) {
						this.field1454[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1454[var4] = false;
					}
				}

				this.updateOwner();
			}

			if (this.bannedMemberCount > 0) {
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) {
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) {
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) {
					if (this.useHashes) {
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) {
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) {
				var4 = var1.readUnsignedShort();
				if (var4 > 0) {
					int var5;
					int var6;
					int var7;
					if (var4 < 16) {
						var7 = var4 - 1;
						var7 |= var7 >>> 1;
						var7 |= var7 >>> 2;
						var7 |= var7 >>> 4;
						var7 |= var7 >>> 8;
						var7 |= var7 >>> 16;
						var6 = var7 + 1;
						var5 = var6;
					} else {
						var5 = 16;
					}

					this.parameters = new IterableNodeHashTable(var5);

					while (var4-- > 0) {
						var6 = var1.readInt();
						var7 = var6 & 1073741823;
						int var8 = var6 >>> 30;
						if (var8 == 0) {
							int var13 = var1.readInt();
							this.parameters.put(new IntegerNode(var13), (long)var7);
						} else if (var8 == 1) {
							long var11 = var1.readLong();
							this.parameters.put(new class367(var11), (long)var7);
						} else if (var8 == 2) {
							String var9 = var1.readStringCp1252NullTerminated();
							this.parameters.put(new ObjectNode(var9), (long)var7);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILmr;Lkd;B)V",
		garbageValue = "-44"
	)
	static void method2653(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		Login.method1952();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-80"
	)
	public static void method2703(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1184927599"
	)
	static void method2714(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "257088762"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1087 * 1304956928 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = PacketBuffer.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					GameBuild.scene.drawEntity(GrandExchangeOfferTotalQuantityComparator.Client_plane, var2.x, var2.y, class392.getTileHeight(var2.field1087 * 1912864768 - 64 + var2.x, var2.field1087 * 1912864768 - 64 + var2.y, GrandExchangeOfferTotalQuantityComparator.Client_plane), var2.field1087 * 1912864768 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}
}
