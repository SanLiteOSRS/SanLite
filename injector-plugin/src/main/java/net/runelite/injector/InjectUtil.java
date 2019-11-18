package net.runelite.injector;

import net.runelite.asm.*;
import net.runelite.asm.attributes.annotation.Annotation;
import net.runelite.asm.signature.Signature;
import net.runelite.deob.DeobAnnotations;

public class InjectUtil
{
	static ClassFile toObClass(final ClassGroup vanilla, final ClassFile deobCf) throws InjectionException
	{
		final String obfuscatedName = DeobAnnotations.getObfuscatedName(deobCf.getAnnotations());
		final ClassFile obfuscatedClassFile = vanilla.findClass(obfuscatedName);

		if (obfuscatedClassFile == null)
		{
			throw new InjectionException(String.format("ClassFile \"%s\" could not be found.", obfuscatedName));
		}

		return obfuscatedClassFile;
	}

	static Field toObField(final ClassGroup vanilla, final Field field) throws InjectionException
	{
		String obfuscatedClassName = DeobAnnotations.getObfuscatedName(field.getClassFile().getAnnotations());
		String obfuscatedFieldName = DeobAnnotations.getObfuscatedName(field.getAnnotations()); // obfuscated name of field
		Type type = getFieldType(field);

		ClassFile obfuscatedClass = vanilla.findClass(obfuscatedClassName);
		if (obfuscatedClass == null)
		{
			throw new InjectionException(String.format("ClassFile \"%s\" could not be found.", obfuscatedClassName));
		}

		Field obfuscatedField = obfuscatedClass.findFieldDeep(obfuscatedFieldName, type);
		if (obfuscatedField == null)
		{
			throw new InjectionException(String.format("Field \"%s\" could not be found.", obfuscatedFieldName));
		}

		return obfuscatedField;
	}

	static ClassFile toDeobClass(final ClassFile obCf, final ClassGroup deob) throws InjectionException
	{
		final ClassFile classFile = deob.findObfuscatedName(obCf.getName());
		if (classFile == null)
		{
			throw new InjectionException("Class file has little or too much obfuscation. Class file is not from the deobfuscated gamepack");
		}
		return classFile;
	}

	static Type getFieldType(final Field field)
	{
		Type type = field.getType();
		Annotation obfuscatedSignature = field.getAnnotations().find(DeobAnnotations.OBFUSCATED_SIGNATURE);
		if (obfuscatedSignature != null)
		{
			// Annotation exists. Type was updated by us during deobfuscation
			type = DeobAnnotations.getObfuscatedType(field);
		}
		return type;
	}

	/**
	 * Find a static method in ClassGroup group. Check the class with name hint first.
	 * (useful for static methods which are in the class they belong to)
	 */
	public static Method findStaticMethod(final ClassGroup group, final String name, final String hint) throws InjectionException
	{
		final ClassFile classFile = group.findClass(hint);

		if (classFile == null)
		{
			throw new InjectionException(String.format("ClassFile \"%s\" could not be found.", hint));
		}

		Method method = classFile.findStaticMethod(name);
		if (method == null)
		{
			method = group.findStaticMethod(name);
		}
		return method;
	}

	/**
	 * Find a static method in ClassGroup group. Throws exception if not found.
	 */
	public static Method findStaticMethod(final ClassGroup group, final String name) throws InjectionException
	{
		Method method = group.findStaticMethod(name);
		if (method == null)
		{
			throw new InjectionException(String.format("Static method \"%s\" could not be found.", name));
		}
		return method;
	}

	/**
	 * Find a static method in ClassGroup group. Throws exception if not found.
	 */
	public static Method findStaticMethod(final ClassGroup group, final String name, Signature signature) throws InjectionException
	{
		Method method = group.findStaticMethod(name, signature);
		if (method == null)
		{
			throw new InjectionException(String.format("Static method \"%s\" could not be found.", name));
		}
		return method;
	}

	public static Method findMethod(Inject inject, String name) throws InjectionException
	{
		return findMethod(inject, name, null);
	}

	public static Method findMethod(Inject inject, String name, String hint) throws InjectionException
	{
		if (hint != null)
		{
			ClassFile classFile = inject.getDeobfuscated().findClass(hint);
			if (classFile == null)
			{
				throw new InjectionException("Class " + hint + " doesn't exist. (check capitalization)");
			}

			Method deobfuscatedMethod = classFile.findMethod(name);
			if (deobfuscatedMethod != null)
			{
				String obfuscatedName = DeobAnnotations.getObfuscatedName(deobfuscatedMethod.getAnnotations());
				Signature obfuscatedSignature = DeobAnnotations.getObfuscatedSignature(deobfuscatedMethod);

				ClassFile obfuscatedClassFile = toObClass(inject.getVanilla(), classFile);
				return obfuscatedClassFile.findMethod(obfuscatedName, (obfuscatedSignature != null)
						? obfuscatedSignature
						: deobfuscatedMethod.getDescriptor());
			}
		}

		for (ClassFile classFile : inject.getDeobfuscated().getClasses())
		{
			for (Method method : classFile.getMethods())
			{
				if (!method.getName().equals(name))
				{
					continue;
				}

				String obfuscatedName = DeobAnnotations.getObfuscatedName(method.getAnnotations());
				Signature obfuscatedSignature = DeobAnnotations.getObfuscatedSignature(method);

				ClassFile classFile1 = toObClass(inject.getVanilla(), classFile);
				return classFile1.findMethod(obfuscatedName, (obfuscatedSignature != null)
						? obfuscatedSignature
						: method.getDescriptor());
			}
		}

		throw new InjectionException("Couldn't find method " + name);
	}

	public static Method findStaticMethod(Inject inject, String name) throws InjectionException
	{
		for (ClassFile classFile : inject.getDeobfuscated().getClasses())
		{
			for (Method method : classFile.getMethods())
			{
				if (!method.isStatic() || !method.getName().equals(name))
				{
					continue;
				}

				String obfuscatedName = DeobAnnotations.getObfuscatedName(method.getAnnotations());
				Signature obfuscatedSignature = DeobAnnotations.getObfuscatedSignature(method);

				ClassFile classFile1 = toObClass(inject.getVanilla(), classFile);
				return classFile1.findMethod(obfuscatedName, (obfuscatedSignature != null)
						? obfuscatedSignature
						: method.getDescriptor());
			}
		}

		throw new InjectionException("Couldn't find static method " + name);
	}


	public static Field findObField(Inject inject, String name) throws InjectionException
	{
		for (ClassFile classFile : inject.getVanilla().getClasses())
		{
			for (Field field : classFile.getFields())
			{
				if (!field.getName().equals(name))
				{
					continue;
				}
				return field;
			}
		}

		throw new InjectionException(String.format("Field \"%s\" could not be found.", name));
	}

	public static Field findDeobField(Inject inject, String name) throws InjectionException
	{
		return findDeobField(inject, name, null);
	}

	public static Field findDeobField(Inject inject, String name, String hint) throws InjectionException
	{
		if (hint != null)
		{
			ClassFile classFile = inject.getDeobfuscated().findClass(hint);
			if (classFile == null)
			{
				throw new InjectionException("Class " + hint + " doesn't exist. (check capitalization)");
			}

			Field field = findFieldInClassFile(inject, classFile, name);
			if (field != null)
			{
				return field;
			}
		}

		for (ClassFile classFile : inject.getDeobfuscated().getClasses())
		{
			Field field = findFieldInClassFile(inject, classFile, name);
			if (field != null)
			{
				return field;
			}
		}

		throw new InjectionException(String.format("Mapped field \"%s\" could not be found.", name));
	}

	private static Field findFieldInClassFile(Inject inject, ClassFile classFile, String fieldName) throws InjectionException
	{
		for (Field field : classFile.getFields())
		{
			if (!field.getName().equals(fieldName))
			{
				continue;
			}

			String obfuscatedName = DeobAnnotations.getObfuscatedName(field.getAnnotations());
			ClassFile classFile1 = toObClass(inject.getVanilla(), classFile);
			return classFile1.findField(obfuscatedName);
		}
		return null;
	}

	static Field findDeobFieldButUseless(Inject inject, String name) throws InjectionException
	{
		for (ClassFile classFile : inject.getDeobfuscated().getClasses())
		{
			for (Field field : classFile.getFields())
			{
				if (!field.getName().equals(name))
				{
					continue;
				}
				return field;
			}
		}

		throw new InjectionException(String.format("Mapped field \"%s\" could not be found.", name));
	}
}
